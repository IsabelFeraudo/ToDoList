import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { TaskService } from './services/tasks/tasks.service';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent implements OnInit {


  taskForm!: FormGroup;
  title: any;
  tasks: any;

  constructor(
    public fb: FormBuilder,
    public taskService: TaskService
  ) {

  }
  ngOnInit(): void {

    this.taskForm = this.fb.group({
      idItem: [''],
      description: ['', Validators.required],
      
    });;

  
    (      error: any) => { console.error(error) }
    ;

    this.taskService.getAllTasks().subscribe(resp => {
      this.tasks = resp;
    },
      error => { console.error(error) }
    );

  }


  save(): void {
    
    this.taskService.saveTask(this.taskForm.value).subscribe(resp => {
      this.taskForm.reset();
      this.tasks=this.tasks.filter((task: { idItem: any; })=> resp.idItem!==task.idItem);
      this.tasks.push(resp);
      
    },
      error => { console.error(error) }
    )
  }

  delete(task: {idItem:number;}){
    
    this.taskService.deleteTask(task.idItem).subscribe(resp=>{
      
      this.taskForm.reset();
      
      if(resp){

        let index=this.tasks.indexOf(task)
        console.log("INDICE" + task)

       
       this.tasks.splice(index,1);
  

      }
    })
  }




  edit(task: any){
    this.taskForm.setValue({
      idItem: task.idItem,
      description: task.description ,
      
    })
  }



}