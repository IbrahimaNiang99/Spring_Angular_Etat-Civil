import { TestBed } from '@angular/core/testing';

import { DecesserviceService } from './decesservice.service';

describe('DecesserviceService', () => {
  let service: DecesserviceService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(DecesserviceService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
