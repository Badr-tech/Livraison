import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { UpdateconseillerComponent } from './updateconseiller.component';

describe('UpdateconseillerComponent', () => {
  let component: UpdateconseillerComponent;
  let fixture: ComponentFixture<UpdateconseillerComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ UpdateconseillerComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(UpdateconseillerComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
