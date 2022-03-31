import { Component, OnInit } from '@angular/core';
import { DashboardServicesService } from '../dashboard-services.service';

@Component({
  selector: 'dashboard',
  templateUrl: './dashboard.component.html',
  styleUrls: ['./dashboard.component.css']
})
export class DashboardComponent implements OnInit {

  newUser: number = 0;
  invoices: number = 0;
  openIssue: number = 0;
  newProjects: number = 0;

  constructor(private dashboardService: DashboardServicesService) { }

  ngOnInit(): void {
    this.dashboardService.getDashboardData().subscribe((data: any) => {
      console.log(data);
      this.newUser = data[0].newUser;
      this.invoices = data[0].invoices;
      this.openIssue = data[0].openIssues;
      this.newProjects = data[0].newProjects;
    })
  }

}
