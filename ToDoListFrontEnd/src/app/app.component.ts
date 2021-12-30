import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { ItemsService } from './services/items/items.service';
import { FoldersService } from './services/folders/folders.service';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent implements OnInit{
  title = 'ToDoListFrontEnd';
  itemForm: FormGroup;

  constructor(
    public fb: FormBuilder,
    public itemService: ItemsService

  ){}
  
ngOnInit(): void {
  this.itemForm=this.fb.group({
    idItem:['',Validators.required],
    description:['',Validators.required],
  })
    
}
}
