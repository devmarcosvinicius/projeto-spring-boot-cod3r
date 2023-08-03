# Projeto Spring Boot Cod3r

Este é um projeto Java Spring Boot do curso Cod3r feito na Udemy.

## Requisitos 📋

- Java JDK 20 ou superior ☕
- Maven 📦
- Navegador web moderno 🌐

## Como executar o projeto ▶️

1. Certifique-se de ter o Java JDK 20 ou superior instalado em seu sistema.
2. Clone este repositório para o seu ambiente local 📂.
3. Abra o projeto em sua IDE favorita (por exemplo, IntelliJ, Eclipse).
4. Certifique-se de que sua IDE reconheça o projeto como um projeto Maven, para que as dependências sejam resolvidas automaticamente.
5. Execute a classe "ExerciciossbApplication" para iniciar a aplicação Spring Boot.

O H2 Database é uma dependência do Maven e será baixado e configurado automaticamente durante a execução do projeto. Não há necessidade de instalação adicional do banco de dados, pois o H2 Database é executado em memória para fins de desenvolvimento.

Após a execução da aplicação, você poderá acessar o console do H2 Database em: [http://localhost:8080/h2-console](http://localhost:8080/h2-console) 🗄️. As configurações de conexão padrão são definidas no arquivo "src/main/resources/application.properties".

Lembre-se de que o H2 Database é uma solução em memória e não é recomendado para uso em produção. Caso deseje utilizar um banco de dados diferente em produção, você precisará ajustar as configurações do arquivo "application.properties" de acordo.

## Endpoints 🛣️

### GET /api/produtos 📦

Retorna uma lista com todos os produtos cadastrados.

### GET /api/produtos/nome/{parteNome} 🔍

Retorna uma lista de produtos cujo nome contenha a parteNome informada.

### GET /api/produtos/pagina/{numeroPagina}/{qtdPaginas}/{qtdProdutos} 📄

Retorna uma lista paginada de produtos, onde:
- numeroPagina: número da página desejada.
- qtdPaginas: quantidade de páginas desejada (limite de 10).
- qtdProdutos: quantidade de produtos por página (limite de 50).

### GET /api/produtos/{id} 🆔

Retorna um produto específico com base no id informado.

### POST /api/produtos (ou PUT /api/produtos) ✏️

Cria ou atualiza um produto. Deve ser enviado um objeto JSON no corpo da requisição contendo as informações do produto.

### DELETE /api/produtos/{id} ❌

Exclui um produto com base no id informado.

### GET /ola 👋

Um endpoint de teste que retorna a mensagem "Ola".

### GET /metodos 🔄

Endpoint de teste para cada um dos métodos HTTP (GET, POST, PUT, PATCH, DELETE) que retorna a mensagem correspondente.

### GET /clientes/qualquer 👤

Retorna um cliente de exemplo.

### GET /clientes/{id} 🧑

Retorna um cliente de exemplo com o id informado.

### GET /clientes?id={id} 🧑‍💼

Retorna um cliente de exemplo com o id informado como parâmetro de consulta.

## Autor 👤

Marcos Vinicius - [Perfil no Github](https://github.com/devmarcosvinicius)

## Licença 📄

Este projeto não possui uma licença específica. Consulte o arquivo LICENSE.md para obter detalhes.
