import { ComponentFixture, TestBed } from '@angular/core/testing';

import { PdfExtraitNaissanceComponent } from './pdf-extrait-naissance.component';

describe('PdfExtraitNaissanceComponent', () => {
  let component: PdfExtraitNaissanceComponent;
  let fixture: ComponentFixture<PdfExtraitNaissanceComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ PdfExtraitNaissanceComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(PdfExtraitNaissanceComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
