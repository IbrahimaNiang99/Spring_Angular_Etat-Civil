import { ComponentFixture, TestBed } from '@angular/core/testing';

import { DeclarationNaissanceComponent } from './declaration-naissance.component';

describe('DeclarationNaissanceComponent', () => {
  let component: DeclarationNaissanceComponent;
  let fixture: ComponentFixture<DeclarationNaissanceComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ DeclarationNaissanceComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(DeclarationNaissanceComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
