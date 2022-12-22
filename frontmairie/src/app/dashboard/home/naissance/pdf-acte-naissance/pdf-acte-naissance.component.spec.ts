import { ComponentFixture, TestBed } from '@angular/core/testing';

import { PdfActeNaissanceComponent } from './pdf-acte-naissance.component';

describe('PdfActeNaissanceComponent', () => {
  let component: PdfActeNaissanceComponent;
  let fixture: ComponentFixture<PdfActeNaissanceComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ PdfActeNaissanceComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(PdfActeNaissanceComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
