import { ComponentFixture, TestBed } from '@angular/core/testing';

import { PdfMariageComponent } from './pdf-mariage.component';

describe('PdfMariageComponent', () => {
  let component: PdfMariageComponent;
  let fixture: ComponentFixture<PdfMariageComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ PdfMariageComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(PdfMariageComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
