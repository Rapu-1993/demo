Resumo da Aplicação

Nome do Projeto: Transferência Financeira

Descrição
A aplicação é um sistema de agendamento de transferências financeiras, permitindo que os usuários:
Agendem transferências entre contas.
Visualizem um extrato das transferências realizadas.
Calculem taxas com base na data de transferência, seguindo regras específicas.

Decisões Arquiteturais
Arquitetura em Camadas:
Separação clara entre Controller, Service e Repository para facilitar a manutenção e escalabilidade.
RESTful API:
Comunicação entre o front-end e o back-end utilizando métodos HTTP (GET, POST).
Banco de Dados H2:
Banco de dados em memória para simplificar o desenvolvimento e testes.

Versões de Linguagem e Ferramentas Utilizadas
Java: Versão 11
Spring Boot: Versão 2.5.4
Angular: Versão 16
TypeScript: Versão 4.5
HTML/CSS: Para construção das interfaces do usuário.
Postman: Para testes da API.

Considerações Finais
A aplicação foi projetada para ser simples e funcional, com foco na experiência do usuário e na facilidade de uso. As decisões arquiteturais foram tomadas para garantir a escalabilidade e a manutenção do código a longo prazo.
