import {NgModule} from '@angular/core';
import {RouterModule, Routes} from "@angular/router";
import { DishListComponent } from "../dish-list/dish-list.component";

const appRoutes: Routes = [
    {
        path: "cookBook",
        component: DishListComponent
    },
    {
        path: "",
        redirectTo: "/cookBook",
        pathMatch: "full"
    }
    ];
@NgModule({
    imports: [RouterModule.forRoot(appRoutes)],
    exports: [RouterModule]
})
export class AppRoutingModule {
}