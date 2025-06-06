# 🔥 Sistema de Emergência - Global Solution

Este projeto foi desenvolvido como parte da **Global Solution** da FIAP, abordando o tema **Clima Extremo – Queimadas**. A proposta consiste em criar um sistema funcional que auxilie a população em situações de emergência, fornecendo orientações, contatos úteis e alertas de risco.

## 💡 Objetivo

Desenvolver uma aplicação simples em **Java** que simula um sistema de conscientização e apoio à população frente a desastres naturais, como queimadas, enchentes e deslizamentos. A interface gráfica é feita com `JOptionPane`, utilizando boas práticas de programação orientada a objetos e o padrão de projeto MVC.

## 🛠️ Tecnologias Utilizadas

- Java 17
- `JOptionPane` (javax.swing)
- `Scanner`
- Padrão MVC (Model-View-Controller)
- IntelliJ IDEA

## 📦 Estrutura do Projeto

```
/src
│
├── Main.java
├── controllers/
│ └── EmergenciaController.java
├── models/
│ └── Emergencia.java
├── views/
└── MenuView.java
```

## ✅ Funcionalidades

- [x] Relatar uma emergência com tipo, descrição e localização;
- [x] Exibir lista de telefones úteis;
- [x] Mostrar dicas de sobrevivência conforme o tipo de ocorrência;
- [x] Notificar alertas da Defesa Civil;
- [x] Listar todas as emergências registradas;
- [x] Interface gráfica interativa com menus e botões.

## 📚 Requisitos Acadêmicos Atendidos

- ✅ Uso de `JOptionPane` e `Scanner`;
- ✅ Estrutura com *main*, *controller*, *model* e *view*;
- ✅ No mínimo 3 métodos operacionais com parâmetros e retorno;
- ✅ 1 método com **sobrecarga**;
- ✅ 1 método com **sobrescrita**;
- ✅ Todos os métodos operacionais possuem **Javadoc** explicativo.

## 🧪 Exemplos de Métodos Implementados

```java
/**
 * Filtra emergências por tipo.
 * @param tipo Tipo de emergência (ex: "queimada").
 * @return Lista de emergências do tipo informado.
 */
public List<Emergencia> buscarPorTipo(String tipo) {...}

/**
 * Calcula a média de caracteres das descrições.
 * @param emergencias Lista de emergências.
 * @return Média de tamanho das descrições.
 */
public double mediaTamanhoDescricao(List<Emergencia> emergencias) {...}
```

📌 Como Executar

1. Clone o repositório:

```bash
git clone https://github.com/seu-usuario/sistema-emergencia.git
```

2. Abra no IntelliJ IDEA.

3. Execute o arquivo Main.java.

📄 Licença

Este projeto é acadêmico e não possui licença comercial.

Desenvolvido por João Victor Soave, Murilo Cordeiro e Maria Alice - FIAP - Engenharia de Software 💻
