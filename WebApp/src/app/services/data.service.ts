import { Injectable } from '@angular/core';
import { Character } from "../models/Character.model";
@Injectable({
  providedIn: 'root'
})
export class DataService {

  char: Character;

  constructor() { }

  
  /**
   * Set character fields individually
   * @param name 
   * @param difficulty 
   * @param pilot 
   * @param fighter 
   * @param trader 
   * @param engineer 
   */
  setCharacter(c?: Character, name?: string, difficulty?: string,
              pilot?: number, fighter?: number, trader?: number,
              engineer?: number): void {
    if (c == undefined) {
      this.char.name = name;
      this.char.difficulty = difficulty;
      this.char.pilot = pilot;
      this.char.fighter = fighter;
      this.char.trader = trader;
      this.char.engineer = engineer;
    } else {
      this.char.name = c.name;
      this.char.difficulty = c.difficulty;
      this.char.pilot = c.pilot;
      this.char.fighter = c.fighter;
      this.char.trader = c.trader;
      this.char.engineer = c.engineer;
    }
  }

  getCharacter(): Character {
    return this.char;
  }
}
