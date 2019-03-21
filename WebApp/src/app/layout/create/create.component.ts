import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-create',
  templateUrl: './create.component.html',
  styleUrls: ['./create.component.css']
})
export class CreateComponent implements OnInit {

  availablePoints = 16;
  test1 = 0;
  
  constructor() {  }

  ngOnInit() {
  }

  plusFighter() {
    if (this.availablePoints != 0) {
      this.test1++;
      this.availablePoints--;
    }
  }

  minusFighter() {
    if (this.test1 > 0) {
      this.test1--;
      this.availablePoints++;
    }
  }

}
