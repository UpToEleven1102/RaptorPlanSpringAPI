import { Injectable } from '@angular/core';
import { Http, Headers } from '@angular/http';
import 'rxjs/add/operator/map'

@Injectable()
export class AttributeService {
  constructor(private http:Http){}

  add(attribute){
    const jsonObject = JSON.stringify(attribute);
    let header = new Headers({'Content-Type':'appplication/json'});
    console.log(header);
    return this.http.post('https://api-raptorplan.herokuapp.com/v1/attribute', jsonObject,{headers:header})
      .map(response=>{
      return (response);
    });
  }

  getAll(){
    var headers = new Headers({'Accept': 'application/json'});
    console.log(headers);
    return this.http.get('https://api-raptorplan.herokuapp.com/v1/attribute',{headers:headers}).map(resp =>{
      return resp.json();
    });
  }
}
