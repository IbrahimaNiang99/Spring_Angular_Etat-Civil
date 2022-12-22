import { ComponentFixture, TestBed } from '@angular/core/testing';

import { PdfBulletinNaissanceComponent } from './pdf-bulletin-naissance.component';

describe('PdfBulletinNaissanceComponent', () => {
  let component: PdfBulletinNaissanceComponent;
  let fixture: ComponentFixture<PdfBulletinNaissanceComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ PdfBulletinNaissanceComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(PdfBulletinNaissanceComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
