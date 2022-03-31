import { Component, Input, OnInit } from '@angular/core';

@Component({
  selector: 'app-header',
  templateUrl: './header.component.html',
  styleUrls: ['./header.component.css']
})
export class HeaderComponent implements OnInit {

  @Input() showSideBar: boolean = false;

  constructor() { }

  ngOnInit(): void {
  }

  public doSomething(value: number): void {
    if(value%2 === 0) {
      this.showSideBar = false;
    } else {
      this.showSideBar = true;
    }
  }

}
