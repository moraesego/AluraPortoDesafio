# Atividade: Programação Orientada a Objetos com Java

Este repositório contém uma atividade do curso **POO com Java** da [Alura](https://www.alura.com.br/), dentro da trilha de conhecimento do **Porto Digital**.

## Descrição do Projeto

A atividade consiste na criação de uma classe chamada `Filme`, que representa um filme e contém os seguintes atributos:

- `nome`: Nome do filme.
- `anoDeLancamento`: Ano de lançamento do filme.
- `duracaoEmMinutos`: Duração do filme em minutos.
- `incluidoNoPlano`: Indica se o filme está incluído em um plano de streaming.
- `somaDasAvaliacoes`: Soma das avaliações que o filme recebeu.
- `totalDeAvaliacoes`: Total de avaliações que o filme recebeu.

### Métodos da Classe `Filme`

- **exibeFichaTecnica()**: Exibe a ficha técnica do filme com as principais informações.
- **avalia(int nota)**: Recebe uma nota e a adiciona à soma das avaliações, além de incrementar o total de avaliações.
- **pegaMedia()**: Calcula e retorna a média das avaliações do filme.

Além disso, foi criado um método `main` para testar o objeto `Filme`, onde um filme foi instanciado e os métodos foram chamados para demonstrar suas funcionalidades.

## Funcionalidades

- Exibição da ficha técnica de um filme.
- Avaliação de filmes com base em múltiplas notas.
- Cálculo da média das avaliações.

## Tecnologias Utilizadas

- [Java](https://www.oracle.com/java/technologies/javase-jdk11-downloads.html)

## Como rodar o projeto

1. Clone este repositório:

   ```bash
   git clone https://github.com/seu-usuario/nome-do-repositorio.git
