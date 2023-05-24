
# Spring Boot RESTful API

API RESTful com Spring Boot e mySQL onde o usuário pode criar uma conta e criar tasks dentro dessa conta.




## Funcionalidades

- Criação de conta
- Login na conta
- Gerenciamento de tasks
- Autenticação JWT
- Multiplataforma


## Stack utilizada

**Back-end:** Java, SpringBoot, Maven, mySQL, lombok, lang3, jsonwebtoken


## Documentação da API
### Rotas para o usuário

#### Criar um usuário

```http
  POST /user
```
Passamos um Json com "username" e "password"

```
{
    "username": "admin",
    "password": "admin123"
}
```
#### Buscar um usuário

```http
  GET /user/${id}
```

| Parâmetro   | Tipo       | Descrição                                   |
| :---------- | :--------- | :------------------------------------------ |
| `id`      | `Integer` | **Obrigatório**. O ID do usuário que você quer buscar |

#### Deletar um usuário

```http
  DELETE /user/${id}
```

| Parâmetro   | Tipo       | Descrição                                   |
| :---------- | :--------- | :------------------------------------------ |
| `id`      | `Integer` | **Obrigatório**. O ID do usuário que você quer deletar |

### Rota para as autenticação

```http
  POST /login
```

Passamos um Json com "username" e "password"

```
{
    "username": "admin",
    "password": "admin123"
}
```

### Rotas para as tasks

#### Criar uma task

```http
  POST /task
```
Passamos um Json com "description"

```
{
    "description": "trabalho da monitora de MD"
}
```
#### Atualizar uma tasks

```http
  PUT /task/${id}
```

| Parâmetro   | Tipo       | Descrição                                   |
| :---------- | :--------- | :------------------------------------------ |
| `id`      | `Integer` | **Obrigatório**. O ID da task que você quer atualizar |

Passamos um Json com a nova "description"

```
{
    "description": "trabalho da monitora de MD atualizado"
}
```

#### Encontrar uma task

```http
  GET /task/${id}
```

| Parâmetro   | Tipo       | Descrição                                   |
| :---------- | :--------- | :------------------------------------------ |
| `id`      | `Integer` | **Obrigatório**. O ID da task que você quer Encontrar |

#### Encontrar todas tasks de um usuário

```http
  GET /task/user
```

#### Deletar uma task

```http
  DELETE /task/${id}
```

| Parâmetro   | Tipo       | Descrição                                   |
| :---------- | :--------- | :------------------------------------------ |
| `id`      | `Integer` | **Obrigatório**. O ID da task que você quer Deletar |

## Apêndice

### Headers

Toda requisição exceto a de criar conta e login, precisará do JWT no Header 

| Key   | Value       | Descrição                                   |
| :---------- | :--------- | :------------------------------------------ |
| `Authorization`      | `Bearer ${token}` | **Obrigatório**. O token do usuário que está autenticado|


Existem dois tipos de autorização.

#### Usuário - Pode Criar, ler, atualizar e deletar as tasks dele mesmo.
#### Admin - Pode Criar, ler, atualizar e deletar as tasks de qualquer Usuário.

Para fins de desenvolvimento o tipo admin só pode ser concedido caso tenha uma alteração diretamente no banco de dados. Esse tipo existe apenas em desenvolvimento e deve ser excluido caso fosse para produção.
## Autores

- [@Miguel-Oliveiraa](https://github.com/Miguel-Oliveiraa)

