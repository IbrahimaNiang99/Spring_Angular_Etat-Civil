import { ComponentFixture, TestBed } from '@angular/core/testing';

import { FormationSanitaireComponent } from './formation-sanitaire.component';

describe('FormationSanitaireComponent', () => {
  let component: FormationSanitaireComponent;
  let fixture: ComponentFixture<FormationSanitaireComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ FormationSanitaireComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(FormationSanitaireComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
