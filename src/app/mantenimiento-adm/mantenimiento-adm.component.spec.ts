import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { MantenimientoAdmComponent } from './mantenimiento-adm.component';

describe('MantenimientoAdmComponent', () => {
  let component: MantenimientoAdmComponent;
  let fixture: ComponentFixture<MantenimientoAdmComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ MantenimientoAdmComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(MantenimientoAdmComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
