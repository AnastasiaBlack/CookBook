import {Component} from '@angular/core';
import {HttpClient, HttpClientModule} from "@angular/common/http";

@Component({
    selector: 'app-root',
    templateUrl: './app.component.html',
    styleUrls: ['./app.component.css']
})
export class AppComponent {
    title = 'your cooking guide';
    dish: string;

    constructor(private http: HttpClient) {
        console.log('hello, world!12345312');
    };

    ngOnInit() {
        this.http.get('http://localhost:8080/welcome').subscribe( data => this.dish = data['name']);
    }
}
