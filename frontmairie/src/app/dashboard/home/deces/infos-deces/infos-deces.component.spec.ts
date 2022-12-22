import { ComponentFixture, TestBed } from '@angular/core/testing';

import { InfosDecesComponent } from './infos-deces.component';

describe('InfosDecesComponent', () => {
  let component: InfosDecesComponent;
  let fixture: ComponentFixture<InfosDecesComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ InfosDecesComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(InfosDecesComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
