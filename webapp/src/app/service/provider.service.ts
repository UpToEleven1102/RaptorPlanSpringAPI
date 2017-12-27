import {InjectionToken} from '@angular/core';
import {environment} from "../../environments/environment.prod";

export const baseUrlToken = new InjectionToken('baseUrl');

export const baseUrl = environment.baseUrl;
