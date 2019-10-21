import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { ListconseillersComponent } from './listconseillers.component';

describe('ListconseillersComponent', () => {
  let component: ListconseillersComponent;
  let fixture: ComponentFixture<ListconseillersComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ ListconseillersComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(ListconseillersComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
