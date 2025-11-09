# Spring Boot + Gradle ORM Example

Simple Spring Boot + JPA (Hibernate) project.

## Run with H2 (default)
```
./gradlew bootRun
```

## Run with PostgreSQL
Edit `src/main/resources/application.yml` and use profile `postgres`:
```
./gradlew bootRun --args='--spring.profiles.active=postgres'
```

## API
- `GET /users`
- `POST /users` with JSON `{ "name": "X", "email": "x@y.com" }`

## PostgreSQL setup script
See `scripts/init_postgres.sql`.
