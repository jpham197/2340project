import { Injectable } from '@angular/core';
import { Character } from "../models/Character.model";
import { FirebaseService } from "./firebase.service";

@Injectable({
  providedIn: 'root'
})
export class DataService {

  char: Character;

  constructor(private firebase: FirebaseService) { }

  
  /**
   * Set character fields individually
   * @param name 
   * @param difficulty 
   * @param pilot 
   * @param fighter 
   * @param trader 
   * @param engineer 
   */
  setCharacter(c: Character): void {

    this.char = c;
    this.syncFirebase();
  }

  getCharacter(): Character {
    return this.char;
  }

  syncFirebase(): void {
    this.firebase.save(this.char);
  }
}
