import { Usuario } from './../../model/Usuario';
import { LoginService } from './../../service/login.service';
import { Component } from '@angular/core';

@Component({
  selector: 'app-login',
  standalone: false,

  templateUrl: './login.component.html',
  styleUrl: './login.component.css'
})
export class LoginComponent {

  correo:string;
  password:string;
  usuario:Usuario;

  constructor(private loginService:LoginService){ }

  login(){
    this.loginService.login(this.correo, this.password).subscribe(data=>{
      this.usuario=data;
      if(this.usuario != null){
        alert("Usuario autenticado");
      }else{
        alert("Usuario no autenticado");
      }
    });


  }

}
