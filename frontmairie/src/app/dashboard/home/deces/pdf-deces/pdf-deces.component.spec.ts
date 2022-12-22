import { ComponentFixture, TestBed } from '@angular/core/testing';

import { PdfDecesComponent } from './pdf-deces.component';

describe('PdfDecesComponent', () => {
  let component: PdfDecesComponent;
  let fixture: ComponentFixture<PdfDecesComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ PdfDecesComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(PdfDecesComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
