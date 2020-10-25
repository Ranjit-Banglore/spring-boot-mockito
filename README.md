# spring-boot-mockito
spring boot jpa test using mockito mockmvc unit test

#Start local postgres db
docker run -p 5432:5432 --name postgres-11 -v /home/ranjit/pgdata:/var/lib/postgresql/data -e POSTGRES_PASSWORD=secret -d postgres:11

# connecting to local database using psql
psql -h localhost -p 5656 -U postgres
ask for password- secret
switching to order db:
\c order
running sql scripts:
\i /home/ranjit/Downloads/dbsamples-0.1/world/world.sql

#some sample db:
https://www.postgresql.org/ftp/projects/pgFoundry/dbsamples/
