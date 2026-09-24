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
## Fluxograma de Desenvolvimento

<p align="center">
   <img src="https://github.com/JuliaKoene/ColecaoAPIGatos_1.0/blob/main/Fluxograma.png" alt="Imagem Fluxograma do Desenvolvimento do Sistema" width=50%>
</p>

- **Docker**: Roda um container com o MySQL configurado, hospeda o servidor de Banco de Dados;
  - **MySQL**: Banco de Dados relacional com a tabela `gato`, criado pelo Hibernate pela entidade Java;
- **Aplicação SpringBoot**: API divida em camadas, faz as consultas e alterações no Bancod e Dados;
  - **Controller (ControladorGato)**: recebe as requisições HTTP, decide as rotas;
  - **Service (ServicoGato)**: contém a lógica de negócio, decide o que fazer;
  - **Repository (RepositorioGato)**: interface que o Spring Data JPA usa para conversar com o banco;
  - **Hibernate**: traduz os objetos *Gato* em comandos SQL, e traduz os resultados do banco de volta em objetos Java;
- **Postman**: Simula um cliente fazendo requisições HTTP (GET, POST, PUT, DELETE) para os endpoints, por motivo de teste;
- **DBeaver**: Conecta direto no MySQL (ignorando a API/Java), para conferir se aa modificações da API alteraram o banco.

## Autor

Julia Koene Moreira da Silva
