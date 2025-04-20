# keylogger-server 🌐

![Badge de Status](https://img.shields.io/badge/status-Desenvolvido-purple)

> Servidor HTTP que recebe informações das teclas digitadas pela vítima. As informações são recebidas pelo do script espião <a href="https://github.com/umpretodev/keylogger-spyware">keylogger-spyware</a> que faz requests no servidor. 
<br>

## 🧩 Stacks
> Java 17 e Spring Boot 3.4.4
<br>

## 🚀 Executando o projeto
Para executar o projeto, bastar buildar a imagem com docker e depois executa-la. O serviço irá subir em localhost na porta 8080. 

```shell
docker build -t keylogger-server .
docker run -p 8080:8080 keylogger-server
```
<br>

## Endpoints
O servidor HTTP tem um endpoint com o verbo POST para receber dados do teclado enviados pelo <a href='https://github.com/umpretodev/keylogger-spyware/edit/main/README.md'>keylogger-spyware</a>, como indicado abaixo: 

| Method  | Endpoint | Payload |
| ------------- | ------------- | ------------- |
| `POST`  | `http://localhost:8080/keylogger`  | `{"keypress": "string"}` |
<br>

Se preferir, pode acessar a documentação dos endpoints via swagger: <br>
🔗 http://localhost/swagger-ui/index.html
<br>
<br>
## 📞 Contato

- **Pedro Fernandes** - <a href="https://www.instagram.com/umpreto.dev/">umpreto.dev</a>
- **Email** - umpret.dev@gmail.com
- **LinkedIn** - <a href="https://www.linkedin.com/in/pedro-fernandes-b72a8516b/">Pedro Fernandes</a>
---

Feito com ❤️ por Umpreto.dev
