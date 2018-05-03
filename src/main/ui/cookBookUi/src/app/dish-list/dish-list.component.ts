import {Component, OnInit} from '@angular/core';
import {DishService} from "../shared";

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

}
