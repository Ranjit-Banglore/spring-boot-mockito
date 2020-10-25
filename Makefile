#Simple Makefile to start postgres locally
.PHONY: start_postgres

start_postgres:
	docker run -p 5656:5432 --name postgres-11 -v /home/ranjit/pgdata:/var/lib/postgresql/data -e POSTGRES_PASSWORD=secret -d postgres:11

