import { TestBed } from '@angular/core/testing';

import { ServiceConseillerService } from './service-conseiller.service';

describe('ServiceConseillerService', () => {
  beforeEach(() => TestBed.configureTestingModule({}));

  it('should be created', () => {
    const service: ServiceConseillerService = TestBed.get(ServiceConseillerService);
    expect(service).toBeTruthy();
  });
});
