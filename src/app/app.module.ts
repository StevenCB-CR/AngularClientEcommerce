import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { HttpModule } from '@angular/http';

import { BrowserAnimationsModule} from '@angular/platform-browser/animations'
import {ToastrModule} from 'ngx-toastr';

import {UserService} from './shared/user.service';
import { HttpClientModule } from '@angular/common/http';
import { AppComponent } from './app.component';
import { SignUpComponent } from './user/sign-up/sign-up.component';
import { UserComponent } from './user/user.component';
import { SignInComponent } from './user/sign-in/sign-in.component';
import { HomeComponent } from './home/home.component';
import { AppRoutingModule } from './app-routing.module';
import { AuthGuard } from './auth/auth.guard';
import { OrdenCompraComponent } from './orden-compra/orden-compra.component';
import { NavbarComponent } from './navbar/navbar.component';
import { MantenimientoAdmComponent } from './mantenimiento-adm/mantenimiento-adm.component';
import { VisualizarProductoComponent } from './visualizar-producto/visualizar-producto.component';
import { CarritoComponent } from './carrito/carrito.component';
import { MantenimientoService } from './shared/mantenimiento.service';
import { AgregarProductoComponent } from './agregar-producto/agregar-producto.component';


@NgModule({
  declarations: [
    AppComponent,
    SignUpComponent,
    UserComponent,
    SignInComponent,
    HomeComponent,
    AgregarProductoComponent,
    OrdenCompraComponent,
    NavbarComponent,
    MantenimientoAdmComponent,
    VisualizarProductoComponent,
    CarritoComponent
    ],
  imports: [
    BrowserModule,
    FormsModule,
    HttpModule,
    HttpClientModule,
    AppRoutingModule,
    ToastrModule.forRoot(),
    BrowserAnimationsModule
  ],
  providers: [UserService,AuthGuard,MantenimientoService ],
  bootstrap: [AppComponent]
})
export class AppModule { }
