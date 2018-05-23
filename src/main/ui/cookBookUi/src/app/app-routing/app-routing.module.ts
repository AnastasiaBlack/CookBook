import {NgModule} from '@angular/core';
import {RouterModule, Routes} from "@angular/router";
import { DishListComponent } from "../dish-list/dish-list.component";
import {DishDetailsComponent} from "../dish-details/dish-details.component";

const appRoutes: Routes = [
    {
        path: "cookBook",
        component: DishListComponent
    },
    {
        path: "",
        redirectTo: "/cookBook",
        pathMatch: "full"
    },
    {
        path: "dish/:id",
        component: DishDetailsComponent
    }
    ];
@NgModule({
    imports: [RouterModule.forRoot(appRoutes)],
    exports: [RouterModule]
})
export class AppRoutingModule {
}