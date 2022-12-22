import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ImpressionDecesComponent } from './impression-deces.component';

describe('ImpressionDecesComponent', () => {
  let component: ImpressionDecesComponent;
  let fixture: ComponentFixture<ImpressionDecesComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ ImpressionDecesComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(ImpressionDecesComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
