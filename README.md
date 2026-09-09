# ColeçãoAPIGatos
API REST simples para gerenciar uma coleção de gatos, desenvolvida em Java com Spring Boot.

## Funcionalidades

- Cadastrar um novo gato,
- Listar todos os gatos cadastrados;

## Tecnologias

- Java
- Spring Boot
- Maven

## Como executar

1. Clone o repositório:
```bash
   git clone https://github.com/JuliaKoene/ColecaoAPIGatos_1.0.git
```
2. Abra o projeto na sua IDE (ex: IntelliJ).
3. Execute a classe principal (`...Application.java`).
4. A aplicação sobe em `http://localhost:8080`.

## Endpoints

| Método | Endpoint            | Descrição                  |
|--------|----------------------|-----------------------------|
| POST   | `/api/v1/gato`       | Cadastra um novo gato       |
| GET    | `/api/v1/gatos`      | Lista todos os gatos        |

### Exemplo de requisição (POST)

```json
{
  "nome": "Lua",
  "idade": 2,
  "peso": 2.3
}
```

## Autor

Julia Koene
