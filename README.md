# Bootcamp DIO Claro 2024 - Desafio Abstra��o POO

### Descri��o do Desafio

Desmistifique a Programa��o Orientada a Objetos (POO) com Java e pratique esse conceito fundamental nesse desafio. Para isso, os pilares da OO s�o devidamente formalizados: Abstra��o, Encapsulamento, Heran�a e Polimorfismo. Neste desafio, voc� poder� desenvolver sua capacidade de abstra��o com um problema real e implementar as evolu��es que achar interessantes

### Dom�nio/Assunto selecionado: Sistema de Gerenciamento de Ve�culos

Ideia do sistema: Gerenciar ve�culos de diferentes tipos, servi�os de manuten��o, e propriet�rios.

## Explica��o dos Conceitos de POO Aplicados:

- **Abstra��o:** As classes como `Veiculo`, `Carro`, `Motocicleta`, `Proprietario`, `ServicoManutencao`, e `Oficina` abstraem os conceitos do mundo real em objetos que possuem atributos e comportamentos.

- **Encapsulamento:** Cada classe encapsula seus atributos e m�todos, protegendo os dados e fornecendo acesso controlado por meio de getters e setters.

- **Heran�a:** A classe `Veiculo` � uma classe base da qual `Carro` e `Motocicleta` herdam, compartilhando atributos e m�todos comuns, mas tamb�m podendo ter comportamentos espec�ficos.

- **Polimorfismo:** O m�todo `exibirDetalhes()` � polim�rfico, pois � implementado de maneiras diferentes em `Carro` e `Motocicleta`, mas pode ser chamado de forma uniforme em um contexto que trata objetos de `Veiculo`.
