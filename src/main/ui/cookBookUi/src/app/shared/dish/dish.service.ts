import {Injectable} from '@angular/core';
import {HttpClient} from '@angular/common/http';
import {Observable} from 'rxjs/Observable';

@Injectable()
export class DishService {
    private url = "http://localhost:8080/dish";

    constructor(private http: HttpClient) {
    }

    getAll(): Observable<any> {
        return this.http.get('http://localhost:8080/dishes');
    }

    postDish(dishName: string): Observable<any> {
        return this.http.post('${this.url}',
            {
                name: dishName
            });
    }

    getDishById(id: string): Observable<any> {
        const url = '${this.url}/${id}';
        return this.http.get<any>(url);
    }
}
