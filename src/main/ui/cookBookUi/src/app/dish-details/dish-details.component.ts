import {Component, OnInit} from '@angular/core';
import {DishService} from "../shared/dish/dish.service";
import {ActivatedRoute} from "@angular/router";

@Component({
    selector: 'app-dish-details',
    templateUrl: './dish-details.component.html',
    styleUrls: ['./dish-details.component.css']
})
export class DishDetailsComponent implements OnInit {
    private dish: any;

    constructor(private dishService: DishService, private route: ActivatedRoute) {
    }

    ngOnInit() {
        this.getDishDetails();
    }

    getDishDetails(): void {
        const id = this.route.snapshot.paramMap.get("id");
        this.dishService.getDishById(id).subscribe(data => {
            this.dish = data;
        });
    }

}
