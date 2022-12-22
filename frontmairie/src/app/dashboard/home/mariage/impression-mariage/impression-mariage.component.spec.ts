import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ImpressionMariageComponent } from './impression-mariage.component';

describe('ImpressionMariageComponent', () => {
  let component: ImpressionMariageComponent;
  let fixture: ComponentFixture<ImpressionMariageComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ ImpressionMariageComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(ImpressionMariageComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
