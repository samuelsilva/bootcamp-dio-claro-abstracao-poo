# Bootcamp DIO Claro 2024 - Desafio Abstração POO

### Descrição do Desafio

Desmistifique a Programação Orientada a Objetos (POO) com Java e pratique esse conceito fundamental nesse desafio. Para isso, os pilares da OO são devidamente formalizados: Abstração, Encapsulamento, Herança e Polimorfismo. Neste desafio, você poderá desenvolver sua capacidade de abstração com um problema real e implementar as evoluções que achar interessantes

### Domínio/Assunto selecionado: Sistema de Gerenciamento de Veículos

Ideia do sistema: Gerenciar veículos de diferentes tipos, serviços de manutenção, e proprietários.

## Explicação dos Conceitos de POO Aplicados:

- **Abstração:** As classes como `Veiculo`, `Carro`, `Motocicleta`, `Proprietario`, `ServicoManutencao`, e `Oficina` abstraem os conceitos do mundo real em objetos que possuem atributos e comportamentos.

- **Encapsulamento:** Cada classe encapsula seus atributos e métodos, protegendo os dados e fornecendo acesso controlado por meio de getters e setters.

- **Herança:** A classe `Veiculo` é uma classe base da qual `Carro` e `Motocicleta` herdam, compartilhando atributos e métodos comuns, mas também podendo ter comportamentos específicos.

- **Polimorfismo:** O método `exibirDetalhes()` é polimórfico, pois é implementado de maneiras diferentes em `Carro` e `Motocicleta`, mas pode ser chamado de forma uniforme em um contexto que trata objetos de `Veiculo`.
