## Assista ao vídeo explicativo do projeto: [📺 YouTube](https://www.youtube.com/watch?v=RDOAcKtC-go)

-- Procedimento para instalação da e execução da API

- Clonar o repositório:
Abra o terminal ou prompt de comando em seu computador.
Navegue até o diretório onde você deseja clonar o repositório.
Execute o seguinte comando para clonar o repositório:
 git clone https://github.com/VitorRT/agroconenct-rest-api.git

- Para Rodar,
Rode o arquivo "Application.java" que esta no pacote src.main.java.br.com.smashcode.api.agroconnect

- Ou tenha acesso a API na nuvem com o link:
https://agroconnect-api-v1.herokuapp.com/api/v1



-- Procedimento para teste dos recursos,incluindo JSON e Endpoints

## Usuário

### Cadastro de Usuário (Conta)

- Método: `POST`
- Endpoint: `/api/v1/usuario`

**Exemplo de JSON de cadastro:**

```json
{
	"nome": "vitor",
	"email": "vitor@gmail.com",
	"senha": "teste1233"
}
```

### Edição de Usuário (Conta)

- Método: `PUT`
- Endpoint: `/api/v1/usuario/{id}`

**Exemplo de JSON de edição:**

```json
{
	"nome": "vitor",
	"email": "vitor@gmail.com",
	"senha": "teste1233"
}
```

### Detalhes de um Usuário

- Método: `GET`
- Endpoint: `/api/v1/usuario/{id}`

### Exclusão de um Usuário

- Método: `DELETE`
- Endpoint: `/api/v1/usuario/{id}`

### Listagem de Todos os Usuários

- Método: `GET`
- Endpoint: `/api/v1/usuario`

---

## Postagem

### Cadastro de Postagem

- Método: `POST`
- Endpoint: `/api/v1/postagem`

**Exemplo de JSON de cadastro:**

```json
{
	"usuario": {
		"id": "a3b5cd29-4bfa-4cb3-af96-f5cc00e9883f"
	},
	"titulo": "Título da postagem",
	"conteudo": "Conteúdo sem limite de tamanho",
	"tipo_postagem": "dicas"
}
```

### Edição de uma Postagem

- Método: `PUT`
- Endpoint: `/api/v1/postagem/{id}`

**Exemplo de JSON de edição:**

```json
{
	"usuario": {
		"id": "a3b5cd29-4bfa-4cb3-af96-f5cc00e9883f"
	},
	"titulo": "Título da postagem",
	"conteudo": "Conteúdo sem limite de tamanho",
	"tipo_postagem": "dicas"
}
```

### Detalhes de uma Postagem

- Método: `GET`
- Endpoint: `/api/v1/postagem/{id}`

### Exclusão de uma Postagem

- Método: `DELETE`
- Endpoint: `/api/v1/postagem/{id}`

### Listagem de Todas as Postagens

- Método: `GET`
- Endpoint: `/api/v1/postagem`

### Listagem de Todas as Postagens de um Usuário

- Método: `GET`
- Endpoint: `/api/v1/postagem/usuario/{usuarioId}`

---

## Comentário

### Comentar em uma Postagem

- Método: `POST`
- Endpoint: `/api/v1/com
