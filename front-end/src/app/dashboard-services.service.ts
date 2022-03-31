import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http'

@Injectable({
  providedIn: 'root'
})
export class DashboardServicesService {

  private DASHBOARD_API = 'http://localhost:8080/Dashboard/1';

  constructor(private http: HttpClient) { }

  public getDashboardData() {
    return this.http.get(this.DASHBOARD_API);
  }
}
