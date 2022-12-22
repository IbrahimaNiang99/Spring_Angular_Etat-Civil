import { TestBed } from '@angular/core/testing';

import { FormationsanitaireService } from './formationsanitaire.service';

describe('FormationsanitaireService', () => {
  let service: FormationsanitaireService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(FormationsanitaireService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
