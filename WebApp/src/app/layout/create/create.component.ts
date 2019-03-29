import { Component, OnInit } from '@angular/core';
import { FormBuilder } from "@angular/forms";
import { Character } from "../../models/Character.model"

@Component({
  selector: 'app-create',
  templateUrl: './create.component.html',
  styleUrls: ['./create.component.css']
})
export class CreateComponent implements OnInit {

  availablePoints = 16;
  pilotSkill = 0;
  fighterSkill = 0;
  traderSkill = 0;
  engineerSkill = 0;

  c: Character = {
    name: "",
    difficulty: "",
    pilot: 0,
    fighter: 0,
    trader: 0,
    engineer: 0
  };

  characterForm = this.fb.group({
    name: [''],
    difficulty: ['']
  });
  
  constructor(private fb: FormBuilder) {  }

  ngOnInit() {
  }

  plusSkill(event) {
    if (this.availablePoints != 0) {
      switch(event) {
        case "pilot":
        this.pilotSkill++;
        this.availablePoints--;
        break;
        case "fighter":
        this.fighterSkill++;
        this.availablePoints--;
        break;
        case "trader":
        this.traderSkill++;
        this.availablePoints--;
        break;
        case "engineer":
        this.engineerSkill++;
        this.availablePoints--;
        break;
      }
    }
  }

  minusSkill(event) {
    if (this.pilotSkill > 0) {
      switch(event) {
        case "pilot":
        this.pilotSkill--;
        this.availablePoints++;
        break;
        case "fighter":
        this.fighterSkill--;
        this.availablePoints++;
        break;
        case "trader":
        this.traderSkill--;
        this.availablePoints++;
        break;
        case "engineer":
        this.engineerSkill--;
        this.availablePoints++;
        break;
      }
    }
  }

  log() {
    this.syncModel();
    console.log(this.c);
  }

  syncModel() {
    this.c.name = this.characterForm.value.name;
    this.c.difficulty = this.characterForm.value.difficulty;
    this.c.pilot = this.pilotSkill;
    this.c.fighter = this.fighterSkill;
    this.c.trader = this.traderSkill;
    this.c.engineer = this.engineerSkill;
  }

}
