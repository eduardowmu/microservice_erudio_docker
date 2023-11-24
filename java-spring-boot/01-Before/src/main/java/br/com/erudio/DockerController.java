package br.com.erudio;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
// https://spring.io/guides/topicals/spring-boot-docker/
//na pasta raiz, após criar o arquivo Dockerfile, pelo terminal executar o comando
//mvn clean package -DskipTests
/*Após a criação do arquivo .jar no diretório target, execute:
						(NOME DO ARQUIVO)
* docker build -t hello-docker:0.0.1-SNAPSHOT .
* com a imagem criada, executar para jogar o image para o docker hub
* docker tag hello-docker:0.0.1-SNAPSHOT leandrocgsi/hello-dcoker:0.0.1-SNAPSHOT
* docker login docker.io -> authenticação
* docker push leandrocgsi/hello-dcoker:0.0.1-SNAPSHOT
**/
@RestController
public class DockerController {
	
	@RequestMapping("/hello-docker")
	public HelloDocker greeting() {
		
		//var hostName = System.getenv("COMPUTERNAME");
		var hostName = System.getenv("HOSTNAME");
		
		return new HelloDocker(
					"Hello Docker",
					hostName
				);
	}
}
