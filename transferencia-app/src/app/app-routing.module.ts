import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AgendamentoComponent } from './agendamento/agendamento.component';
import { ExtratoComponent } from './extrato/extrato.component';

const routes: Routes = [
  { path: 'agendamento', component: AgendamentoComponent },
  { path: 'extrato', component: ExtratoComponent },
  { path: '', redirectTo: '/agendamento', pathMatch: 'full' }, // Redireciona para a página de agendamento por padrão
  { path: '**', redirectTo: '/agendamento' } // Redireciona para agendamento caso a rota não exista
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
