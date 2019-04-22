import { Injectable } from '@angular/core';
import { AngularFirestore } from "@angular/fire/firestore";
import { Character } from '../models/Character.model';

@Injectable({
  providedIn: 'root'
})
export class FirebaseService {

  constructor(private db: AngularFirestore) { }

  save(char: Character) {
    return this.db.collection('game').add(
      {
        name: char.name,
        difficulty: char.difficulty,
        pilot: char.pilot,
        fighter: char.fighter,
        trader: char.trader,
        engineer: char.engineer
      }
    );
  }
}
