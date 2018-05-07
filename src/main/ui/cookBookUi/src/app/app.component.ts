import {Component} from '@angular/core';
import {HttpClient, HttpClientModule} from "@angular/common/http";
import {DishService} from "./shared/dish/dish.service";

@Component({
    selector: 'app-root',
    templateUrl: './app.component.html',
    styleUrls: ['./app.component.css'],
    providers: [DishService]
})
export class AppComponent {
    title = 'your cooking guide';
    dish: string;

    constructor(private dishService: DishService) {
        // constructor(private dishService: DishService) {
        console.log('hello, world!12345312');
    };
    //
    // ngOnInit() {
    // this.dishService.getAll();
    // }
}
