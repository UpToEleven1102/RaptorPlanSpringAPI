import { Injectable } from '@angular/core';
import { Http, Headers } from '@angular/http';
import 'rxjs/add/operator/map'

@Injectable()
export class AttributeService {
  constructor(private http: Http) {}

  add(attribute) {
    const jsonObject = JSON.stringify(attribute);
    const headers = new Headers({'Content-Type' : 'appplication/json'});
    console.log(headers);
    return this.http.post('http://localhost:8080/v1/course', jsonObject, { headers : headers })
      .map(response => {
      return (response);
    });
  }

  // getAll(){
  //   var headers = new Headers({'Accept': 'application/json'});
  //   console.log(headers);
  //   return this.http.get('https://api-raptorplan.herokuapp.com/v1/attribute',{headers:headers}).map(resp =>{
  //     return resp.json();
  //   });
  // }
}
