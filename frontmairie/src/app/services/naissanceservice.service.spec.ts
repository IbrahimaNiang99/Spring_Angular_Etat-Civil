import { TestBed } from '@angular/core/testing';

import { NaissanceserviceService } from './naissanceservice.service';

describe('NaissanceserviceService', () => {
  let service: NaissanceserviceService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(NaissanceserviceService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
