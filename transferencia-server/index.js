const express = require('express'); // Importa o Express
const cors = require('cors'); // Importa o middleware cors
const app = express(); // Cria uma instância do servidor Express

// Configura o middleware cors
app.use(cors({
    origin: 'http://localhost:4200', // Permite requisições do front-end Angular
    methods: ['GET', 'POST', 'PUT', 'DELETE', 'OPTIONS'], // Métodos HTTP permitidos
    allowedHeaders: ['Content-Type', 'Authorization'], // Cabeçalhos permitidos
    credentials: true // Permite envio de cookies, se necessário
}));

// Exemplo de rota para transferências
app.get('/transferencias', (req, res) => {
    res.json([
        { id: 1, contaOrigem: '123456', contaDestino: '654321', valor: 100.0, taxa: 2.5 },
        { id: 2, contaOrigem: '987654', contaDestino: '456789', valor: 200.0, taxa: 3.0 }
    ]);
});

// Inicia o servidor na porta 8080
app.listen(8080, () => {
    console.log('Servidor rodando na porta 8080');
});
