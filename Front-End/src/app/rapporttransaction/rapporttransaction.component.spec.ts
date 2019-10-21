import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { RapporttransactionComponent } from './rapporttransaction.component';

describe('RapporttransactionComponent', () => {
  let component: RapporttransactionComponent;
  let fixture: ComponentFixture<RapporttransactionComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ RapporttransactionComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(RapporttransactionComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
