## Talan [Project Name]

## Running the application locally -- h2

```shell
mvn clean install
```

```shell
mvn spring-boot:run #default profile -> h2
```

## Deploying the application to Docker -- Postgres

```shell
mvn clean install # change h2 -> postgres1 : application.yml OU -Ppostgres1 
```

```shell
docker-compose up --build
```