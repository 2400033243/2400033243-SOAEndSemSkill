\# Book Microservice



A Spring Boot microservice application packaged and deployed using Docker.



\## Technologies Used

\- Java 21

\- Spring Boot 4.1.1

\- PostgreSQL

\- Docker



\## Application URLs

\- Home: http://localhost:8085/

\- Books: http://localhost:8085/books



\## Docker Commands

```cmd

docker build -t book-microservice .

docker run -d -p 8085:8080 --name book-container -e DB\_PASSWORD=root -e DB\_URL=jdbc:postgresql://host.docker.internal:5432/bookdb book-microservice

```



