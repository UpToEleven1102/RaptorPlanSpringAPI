import {Inject, Injectable} from '@angular/core';
import { Http, Headers } from '@angular/http';
import 'rxjs/add/operator/map';
import {baseUrlToken} from "./provider.service";
import {Observable} from "rxjs/Observable";

@Injectable()
export class AttributeService {
  headers;
  constructor(private http: Http, @Inject(baseUrlToken)public baseUrl) {
    this.headers = new Headers({'Content-Type' : 'application/json'});
  }

  add(attribute) {
    const jsonObject = JSON.stringify(attribute);
    return this.http.post(this.baseUrl+'/attribute', jsonObject, { headers : this.headers })
      .map(response => {
      return (response.json());
    });
  }
  getCategories() {
    return this.http.get(this.baseUrl+'/category', {headers: this.headers}).map(response => {
      return response.json();
    });
  }

  getAll():Observable<Attribute[]>{
    return this.http.get(this.baseUrl+'/attribute',{headers: this.headers}).map(this.mapResponse);
  }

  mapResponse(response):Attribute[]{
    return response.json();
  }
}

export class Attribute{
  id;
  code: string;
  name: string;
  links: Links;
}

export class Links{
  self: Self;
}

export class Self{
  href:string;
}
