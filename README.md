# 📚 SPRING API – Blog com Spring Boot

API RESTful construída com **Spring Boot** para gerenciamento de postagens em um blog. Utiliza banco de dados **H2 em memória**, ideal para testes e desenvolvimento local.

---

## 🚀 Tecnologias Utilizadas

- **Spring Boot**
- **Spring Web**
- **Spring Data JPA**
- **Banco H2 (em memória)**
- **JSON para troca de dados**

---

## 🌐 Endpoints Disponíveis

### 📝 POST `/api/posts`

Cria uma nova postagem.

**Corpo JSON:**
```json
{
  "name": "JAVA IS INSANE!!",
  "content": "Lorem ipsum dolor sit amet consectetur",
  "postedBy": "Lucas F. Lima",
  "img": "https://img.freepik.com/free-photo/anime-eyes-illustration_23-2150404884.jpg",
  "tags": ["Java", "SpringBoot", "Programming"]
}
```

---

### 📥 GET `/api/posts`

Retorna todas as postagens.

---

### 🔍 GET `/api/posts/{id}`

Busca uma postagem específica por ID.

---

### 👍 PUT `/api/posts/{id}/like`

Incrementa o número de curtidas da postagem especificada.

---

### 💬 POST `/api/comments`

Adiciona um comentário a uma postagem, passando os dados por **query parameters**.

**Exemplo de requisição:**
```
POST /api/comments?postId=2&postedBy=Lima&content=Cone Sul
```

**Parâmetros:**
- `postId`: ID da postagem
- `postedBy`: Nome de quem comenta
- `content`: Conteúdo do comentário

---

### 💬 GET `/api/posts/{id}/comments`

Retorna os comentários de uma postagem específica.

---

### 🔎 GET `/api/posts/search?name=java`

Busca postagens pelo nome.  
Exemplo:
```
GET /api/posts/search?name=java
```

---

## 🛢️ Banco de Dados

A aplicação utiliza o banco **H2**, que roda em memória. A interface de administração do H2 está disponível em:

```
http://localhost:8080/h2-console
```

**Credenciais padrão:**

- **JDBC URL:** `jdbc:h2:mem:testdb`
- **User:** `ntek`
- **Password:** *(em branco)*

---

## ✅ Execução

1. Clone o projeto
2. Rode com sua IDE ou use:
```bash
./mvnw spring-boot:run
```
3. Acesse as rotas com Postman, Insomnia, Thunder Client, etc.
