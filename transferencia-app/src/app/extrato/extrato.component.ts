import { Component, OnInit } from '@angular/core';
import { TransferenciaService } from '../transferencia.service';

@Component({
  selector: 'app-extrato',
  templateUrl: './extrato.component.html',
  styleUrls: ['./extrato.component.css']
})
export class ExtratoComponent implements OnInit {
  transferencias: any[] = [];

  constructor(private transferenciaService: TransferenciaService) {}

  ngOnInit() {
    this.transferenciaService.listar().subscribe({
      next: (dados) => {
        this.transferencias = dados;
      },
      error: () => {
        console.error('Erro ao carregar o extrato de transferências.');
      }
    });
  }
}
