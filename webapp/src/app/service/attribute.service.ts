import { Injectable } from '@angular/core';
import { Http, Headers } from '@angular/http';
import 'rxjs/add/operator/map'

@Injectable()
export class AttributeService {
  headers;
  constructor(private http: Http) {
    this.headers = new Headers({'Content-Type' : 'application/json'});
  }

  add(attribute) {
    const jsonObject = JSON.stringify(attribute);
    return this.http.post('http://localhost:8080/v1/attribute', jsonObject, { headers : this.headers })
      .map(response => {
      return (response);
    });
  }
  getCategories() {
    return this.http.get('http://localhost:8080/v1/category', {headers: this.headers}).map(response => {
      return response;
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
