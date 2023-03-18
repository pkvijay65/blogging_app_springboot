# Blogging App

## JSON Entities

### User

    {
	    "id": 		1221
	    "username": "pkvijay",
	    "password": "xxxxxxxx",
	    "authToken": "dxnafnsncksnflwemlveldvsnv"
	    "email": 	"prateekvijay65@gmail.com",
	    "bio": 		"A part time developer and a full time nerd",
	    "image": 	"https://drive.google.com/file/d/1978dvROcTJkvLlPAgnZNumGRJE4XvQN9/view?usp=share_link"
	}

### Profile

    {
	    "username": "pkvijay",
	    "bio": 		"A part time developer and a full time nerd",
	    "image": 	"https://drive.google.com/file/d/1978dvROcTJkvLlPAgnZNumGRJE4XvQN9/view?usp=share_link"
	}

### Article

    {
	    "id": 		121,
	    "title": 	"Unlearning to Learn Public Policy",
	    "slug": 	"unlearning-to-learn-public-policy"
	    "subtitle": "An article about concepts one should unlearn before learning to start public policy",
	    "body": 	"This is an article about public policy... <b> economics </b> ....",
	    "createdAt": "2022-07-02 05:39:23"
	    "tags": 	["policy", "economics", "opportunity cost"]
    }

### Comment

    {
	    "id": 		  31,
	    "title":     "great article",
	    "body":  	 "very informative article, loved reading it",
	    "createdAt": "2022-07-08 07:15:19"
	}

## API Endpoints
### `POST /users`
create a new user

### `POST /users/login`

### `GET /profiles` 📄

### `GET /profiles/{username}`


### `GET /articles`📄
get all articles (default page size 10)

available filters
-`GET /articles?tag=react`
-`GET /articles?author=prateek`
-`GET /articles?page=3&size=10`

### `GET /articles/{article-slug}`

### `POST /articles`🔐
create a new article

### `PATCH /articles/{article-slug}`🔐
edit an article

### `GET /articles/{article-slug}/comments`📄
get all comments under an article

### `POST /article/{article-slug}/comments`  🔐
post a comment under an article

### `DELETE /articles/{article-slug}/comments/{comment-id}`#🔐👤
delete a comment under an article