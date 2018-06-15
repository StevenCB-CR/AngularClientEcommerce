import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import {Routes, RouterModule} from '@angular/router';
import {HomeComponent} from './home/home.component';
import {UserComponent} from './user/user.component';
import {SignUpComponent} from './user/sign-up/sign-up.component';
import {SignInComponent} from './user/sign-in/sign-in.component';
import { AuthGuard } from './auth/auth.guard';
import { OrdenCompraComponent } from './orden-compra/orden-compra.component';
import { MantenimientoAdmComponent } from './mantenimiento-adm/mantenimiento-adm.component';
import { VisualizarProductoComponent } from './visualizar-producto/visualizar-producto.component';
import { CarritoComponent } from './carrito/carrito.component';



export const routes : Routes=[ 
  {path:'carrito', component:CarritoComponent},
  {path:'vistaproducto', component:VisualizarProductoComponent},
  {path:'mantenimiento', component:MantenimientoAdmComponent },
  {path:'home', component:HomeComponent},
  {path:'ordencompra', component:OrdenCompraComponent,canActivate:[AuthGuard]},
  {
    path:'signup', component:UserComponent,
    children: [{path: '',component:SignUpComponent}]
  },
  {
    path:'login', component:UserComponent,
    children: [{path: '',component:SignInComponent}]
  },
  {path:'', redirectTo:'/home', pathMatch:'full'},
  {path:'**', redirectTo:'login'}
]

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports:[RouterModule]
})
export class AppRoutingModule { }
