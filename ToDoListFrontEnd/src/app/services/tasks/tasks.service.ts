import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class TaskService {
  private API_SERVER = "http://localhost:8080/item/";

  constructor(private httpClient: HttpClient) { }


  public getAllTasks(): Observable<any>{
    return this.httpClient.get(this.API_SERVER);
  }

  public saveTask (task:any): Observable<any>{
    return this.httpClient.post(this.API_SERVER,task);
  }

  public deleteTask(idItem:number):Observable<any>{
    return this.httpClient.delete(this.API_SERVER + "delete/"+idItem);
  }

}