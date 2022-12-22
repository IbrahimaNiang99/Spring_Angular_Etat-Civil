import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ListeNaissanceComponent } from './liste-naissance.component';

describe('ListeNaissanceComponent', () => {
  let component: ListeNaissanceComponent;
  let fixture: ComponentFixture<ListeNaissanceComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ ListeNaissanceComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(ListeNaissanceComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
