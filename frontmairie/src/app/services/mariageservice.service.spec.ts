import { TestBed } from '@angular/core/testing';

import { MariageserviceService } from './mariageservice.service';

describe('MariageserviceService', () => {
  let service: MariageserviceService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(MariageserviceService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
