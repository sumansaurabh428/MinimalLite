import { Component, EventEmitter, OnInit, Output } from '@angular/core';

@Component({
  selector: 'nav-bar',
  templateUrl: './nav-bar.component.html',
  styleUrls: ['./nav-bar.component.css']
})
export class NavBarComponent implements OnInit {

  menuClickCount: number = 0;

  constructor() { }

  ngOnInit(): void {
  }

  @Output() onMenuClick = new EventEmitter<number>();

  public clickMenu(value: number): void {
    this.menuClickCount++;
    return this.onMenuClick.emit(this.menuClickCount);
  }



}
