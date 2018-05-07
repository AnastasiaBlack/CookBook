import {Component, OnInit} from '@angular/core';
import {DishService} from "../shared";
import {reject, resolve} from "q";

@Component({
    selector: 'app-dish-list',
    templateUrl: './dish-list.component.html',
    styleUrls: ['./dish-list.component.css'],
    providers: [DishService]
})
export class DishListComponent implements OnInit {
    dishes: Array<any>;

    constructor(private dishService: DishService) {
    }

    ngOnInit() {
        this.dishService.getAll().subscribe(data => {
                this.dishes = data;
            },
            error => console.log(error))
    }

    publishDish(dish: string) {
        this.dishService.postDish(dish).subscribe(data => {
                this.dishes = data;
            },
            error => console.log(error))
    }
}