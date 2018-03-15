# Spring Boot + GraphQL + MongoDB

Source: https://medium.com/oril/spring-boot-graphql-mongodb-8733002b728a

## Start MongoDB docker container

docker run --name mongo-server -d -p 127.0.0.1:27017:27017 mongo

## Requests
- POST
- http://localhost:8000/query

```javascript
{
	users {
	    name
		age
	}
}
```

```javascript
{
	user(id : "5a9c33032daeb84a70a826b8", name: "Igor") {
	    id
	    name
		age
	}
}
```