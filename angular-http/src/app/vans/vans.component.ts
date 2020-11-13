import { Component, OnInit } from '@angular/core';
import { Van } from '../van';
import { VanService } from '../van.service';

@Component({
  selector: 'app-vans',
  templateUrl: './vans.component.html',
  styleUrls: ['./vans.component.css']
})
export class VansComponent implements OnInit {

vans: Van[];
  selectedVan: Van;
  rentedVan: Van;
  van: Van = new Van();

  constructor(private carService: VanService) { }

  ngOnInit(): void {
    this.getCars();
  }

  getCars(): void {
    this.carService.getVansWithObservable().subscribe(vans => this.vans = vans);
  }

  onSelect(van: Van): void {
    console.warn(van);
    this.selectedVan = van;
  }

  rent(car: Van): void {
    this.carService.rent(car).subscribe(c => this.rentedVan = c);
  }

  onSave(): void{
    this.van.rented = false;
    this.vans.push(this.van);
    this.carService.save(this.van).subscribe(data => {
      console.log('Super ');
    }, err => {
      console.log(err);
    });
  }
}
