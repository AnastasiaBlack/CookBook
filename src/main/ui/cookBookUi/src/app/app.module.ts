import {BrowserModule} from '@angular/platform-browser';
import {NgModule} from '@angular/core';
import {AppComponent} from './app.component';
import {HttpClientModule} from "@angular/common/http";
import { DishListComponent } from './dish-list/dish-list.component';
import { DishDetailsComponent } from './dish-details/dish-details.component';
import {AppRoutingModule} from "./app-routing/app-routing.module";


@NgModule({
    declarations: [
        AppComponent,
        DishListComponent,
        DishDetailsComponent
    ],
    imports: [
        BrowserModule,
        HttpClientModule,
        AppRoutingModule
    ],
    providers: [],
    bootstrap: [AppComponent]
})
export class AppModule {
}
