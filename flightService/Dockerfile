# Estágio de construção
# imagem Ubuntu
FROM ubuntu:latest

# Atualize os pacotes do sistema e instale o Java
RUN apt-get update && \
    apt-get install -y openjdk-17-jdk

# Copie o arquivo JAR do diretório atual para o diretório de trabalho no contêiner
COPY target/FlightService-0.0.1-SNAPSHOT.jar /app/FlightService.jar

# Defina o diretório de trabalho no contêiner
WORKDIR /app

# Exponha a porta 5000
EXPOSE 5000

# Defina o comando de inicialização da aplicação
CMD ["java", "-jar", "FlightService.jar"]





