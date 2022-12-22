import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ImpressionNaissanceComponent } from './impression-naissance.component';

describe('ImpressionNaissanceComponent', () => {
  let component: ImpressionNaissanceComponent;
  let fixture: ComponentFixture<ImpressionNaissanceComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ ImpressionNaissanceComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(ImpressionNaissanceComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
