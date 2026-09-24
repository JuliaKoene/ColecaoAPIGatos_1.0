# ColeçãoAPIGatos
API REST para gerenciar uma coleção de gatos, desenvolvida em Java com Spring Boot.

## Funcionalidades

- Cadastrar um novo gato,
- Listar todos os gatos cadastrados;
- Retornar gato por nome;
- Retornar gato por ID;
- Atualizar os dados de um gato;
- Deletar um gato.

## Tecnologias

- Java
- Spring Boot
- Maven
- MySQL
- Docker
- Hibernate

## Como executar

1. Clone o repositório:
```bash
   git clone https://github.com/JuliaKoene/ColecaoAPIGatos_1.0.git
```
2. Abra o projeto na sua IDE (ex: IntelliJ).
3. Execute a classe principal (`...Application.java`).
4. A aplicação sobe em `http://localhost:8080`.

## Endpoints

| Método | Endpoint                         | Descrição                   |
|--------|----------------------------------|-----------------------------|
| POST   | `/api/v1/gato`                   | Cadastra um novo gato       |
| GET    | `/api/v1/gatos`                  | Lista todos os gatos        |
| GET    | `/api/v1/gatos/findnome/<nome>`  | Encontra gato pelo nome     |
| GET    | `/api/v1/gatos/findid/<id>`      | Encontra um gato pelo ID    |
| PUT    | `/api/v1/gatos/update/<id>`      | Atualiza o gato pelo ID     |
| DELETE | `/api/v1/gatos/<id>`             | Deleta um gato pelo ID      |

### Atributos da classe *gato*

| Atributo | Tipo     |
|----------|----------|
| `id`     | UUID     |
| `nome`   | String   |
| `cor`    | String   |
| `peso`   | Double   |

### Exemplo de requisição (POST/PUT)

```json
{
  "nome": "Lua",
  "idade": 2,
  "peso": 2.3
}
```

## Autor

Julia Koene Moreira da Silva
