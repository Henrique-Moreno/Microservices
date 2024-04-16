# Estágio de construção
FROM ubuntu:latest

# Atualize os pacotes do sistema e instale o Java
RUN apt-get update && \
    apt-get install -y openjdk-17-jdk

# Adicionar o arquivo JAR do diretório atual para o diretório de trabalho no contêiner
COPY target/authentication-0.0.1-SNAPSHOT.jar /app/authentication.jar

# Definir o diretório de trabalho no contêiner
WORKDIR /app

# Exponha a porta 5000
EXPOSE 5000

# Definir o comando de inicialização da aplicação
CMD ["java", "-jar", "authentication.jar"]




