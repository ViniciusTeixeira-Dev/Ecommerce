# 🛒 E-commerce API

API RESTful completa para gestão de um sistema de e-commerce, com funcionalidades de login de usuário, gerenciamento de produtos e integração com pagamento via PIX .

A complete RESTful API for managing an e-commerce system, featuring user authentication, product management, and PIX payment integration.

---

<details>
<summary>🇧🇷 Versão em Português</summary>

## 📋 Sobre o Projeto

Esta API de E-commerce foi desenvolvida para permitir a criação de um sistema completo de loja virtual, oferecendo:

* Registro e autenticação segura de usuários;
* Cadastro, edição e listagem de produtos;
* Sistema de pagamento via PIX integrado com a API da EFI;

## 🚀 Tecnologias Utilizadas

* **Backend:** Java 17 + Spring Boot   
  * Spring Security (Autenticação JWT, BCrypt para senhas)  
  * Spring Data JPA (Persistência de dados)  
  * JWT (JSON Web Token)  
* **Banco de Dados:** MySQL 8  
* **Integração PIX:** API da EFI 

## 🔑 Funcionalidades Principais

* **Login de Usuário:**  
  * Autenticação segura com geração de token JWT.  
  * Cadastro de novos usuários com validação de dados.  

* **Gerenciamento de Produtos:**  
  * CRUD completo de produtos (criar, listar, atualizar e excluir).  
  * Busca de produtos por nome.  

* **Sistema de Pagamento PIX:**  
  * Geração de QR Code para pagamento.  
  * Integração com API da EFI para confirmação automática de transações.  



## 🛣️ Estrutura de Rotas (Exemplos da API Backend)

| Método | Endpoint                           | Descrição                                               |
|--------|-----------------------------------|---------------------------------------------------------|
| POST   | `/registro`                        | Cria um novo usuário.                                   |
| POST   | `/login`                           | Autentica usuário e retorna token JWT.                 |
| GET    | `/gerenciamento?nome={nome}`       | Lista produtos filtrando pelo nome.                     |
| POST   | `/gerenciamento/novoproduto`       | Cria um novo produto.                                   |
| PUT    | `/gerenciamento/{id}`              | Atualiza informações de um produto pelo ID.            |
| POST   | `/checkout`                        | Cria um novo pedido e inicia pagamento via PIX.        |

</details>

---

<details>
<summary>🇺🇸 English Version</summary>

## 📋 About the Project

This E-commerce API allows the creation of a complete online store system, providing:

* Secure user registration and authentication;  
* Product creation, update, listing, and deletion;  
* PIX payment system integrated with the EFI API;  
* Stock control and order history.  

## 🚀 Technologies Used

* **Backend:** Java 17 + Spring Boot  
  * Spring Security (JWT Authentication, BCrypt for passwords)  
  * Spring Data JPA (Data Persistence)  
  * JWT (JSON Web Token)  
* **Database:** MySQL 8  
* **PIX Integration:** EFI API  

## 🔑 Key Features

* **User Login:**  
  * Secure authentication with JWT token generation.  
  * Registration of new users with data validation.  

* **Product Management:**  
  * Full CRUD for products (create, list, update, delete).  
  * Search products by name.  

* **PIX Payment System:**  
  * QR Code generation for payments.  
  * Integration with EFI API for automatic transaction confirmation.  

* **Orders and History:**  
  * Record of user orders.  
  * Query of payment status via PIX.  

## 🛣️ API Routes (Backend Examples)

| Method | Endpoint                            | Description                                          |
|--------|------------------------------------|------------------------------------------------------|
| POST   | `/registro`                         | Registers a new user.                                |
| POST   | `/login`                            | Authenticates user and returns a JWT token.        |
| GET    | `/gerenciamento?nome={nome}`        | Lists products filtered by name.                    |
| POST   | `/gerenciamento/novoproduto`        | Creates a new product.                              |
| PUT    | `/gerenciamento/{id}`               | Updates a product by ID.                             |
| POST   | `/checkout`                         | Creates a new order and initiates PIX payment.     |

</details>
