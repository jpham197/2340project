import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';

import { HomeComponent } from './layout/home/home.component';
import { CreateComponent } from './layout/create/create.component';

import { ParticlesModule } from "angular-particle";

@NgModule({
  declarations: [
    AppComponent,
    HomeComponent,
    CreateComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    ParticlesModule,
    
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
