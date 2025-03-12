import { Component } from '@angular/core';
import { TransferenciaService } from '../transferencia.service';

@Component({
  selector: 'app-agendamento',
  templateUrl: './agendamento.component.html',
  styleUrls: ['./agendamento.component.css']
})
export class AgendamentoComponent {
  transferencia = {
    contaOrigem: '',
    contaDestino: '',
    valor: 0,
    dataTransferencia: ''
  };
  mensagem: string = '';

  constructor(private transferenciaService: TransferenciaService) {}

  agendarTransferencia() {
    this.transferenciaService.agendar(this.transferencia).subscribe({
      next: () => {
        this.mensagem = 'Transferência agendada com sucesso!';
        this.transferencia = { contaOrigem: '', contaDestino: '', valor: 0, dataTransferencia: '' };
      },
      error: () => {
        this.mensagem = 'Erro ao agendar a transferência.';
      }
    });
  }
}
