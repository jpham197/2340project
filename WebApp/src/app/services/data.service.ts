import { Injectable } from '@angular/core';
import { Character } from "../models/Character.model";
@Injectable({
  providedIn: 'root'
})
export class DataService {

  char: Character;

  constructor() { }

  setCharacter(name?: string, difficulty?: string, pilot?: number,
              fighter?: number, trader?: number, engineer?: number): void {
    this.char.name = name;
    this.char.difficulty = difficulty;
    this.char.pilot = pilot;
    this.char.fighter = fighter;
    this.char.trader = trader;
    this.char.engineer = engineer;
  }
}
