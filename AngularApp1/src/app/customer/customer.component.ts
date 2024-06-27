import { Component } from '@angular/core';
import { Customer } from './customer';

@Component({
  selector: 'app-customer',
  standalone: true,
  imports: [],
  templateUrl: './customer.component.html',
  styleUrl: './customer.component.css'
})
export class CustomerComponent {
customer:Customer=new Customer();
}
