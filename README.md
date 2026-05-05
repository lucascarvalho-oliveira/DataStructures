# MyLinkedList - Dynamic Linked List Implementation

Este projeto consiste na implementação de um **Tipo Abstrato de Dados (TAD) de Lista Dinâmica Encadeada** em Java. O foco desta fase inicial é a definição da arquitetura do projeto, estruturação de dados fundamental e garantia de tipagem genérica.
## Descrição do Projeto

O objetivo é criar uma estrutura de lista encadeada que suporte operações de inserção, remoção e consulta, utilizando a técnica de nós encadeados (`Node`). O projeto segue padrões de nomenclatura em língua inglesa e organização rigorosa por pacotes.

## Arquitetura e Estrutura

A estrutura de diretórios e pacotes segue o padrão exigido:

- `src/dev/aluno/datastructures/list`: Contém a interface e a classe concreta da lista.
- `src/dev/aluno/datastructures/list/tests`: Contém a classe de testes e demonstração.

### Componentes Principais

1.  **`MyList<T>` (Interface)**: Define o contrato genérico com todas as operações obrigatórias.
2.  **`MyLinkedList<T>` (Classe Concreta)**: Implementação da lógica da lista dinâmica.
3.  **`Node<T>` (Classe Interna)**: Representação fundamental de cada elemento da lista, contendo o dado (`data`) e a referência para o próximo nó (`next`).
4.  **`MyLinkedListTests`**: Classe responsável por validar o comportamento das operações.

## Funcionalidades (Assinaturas)

A lista disponibiliza as seguintes operações:

### Inserção
- `addFirst(T item)`: Adiciona um elemento no início.
- `addLast(T item)`: Adiciona um elemento no final.
- `insertAt(int i, T item)`: Insere um elemento numa posição específica.
- `addSorted(T element)`: Insere um elemento mantendo a ordenação.

### Remoção
- `removeFirst()`: Remove o primeiro elemento.
- `removeLast()`: Remove o último elemento.
- `removeAt(int i)`: Remove o elemento na posição especificada.
- `remove(T item)`: Procura e remove um item específico.

### Gerenciamento e Consulta
- `clear()`: Esvazia a lista.
- `find(T item)`: Retorna o índice de um item.
- `get(int i)`: Retorna o item numa posição.
- `set(int i, T item)`: Atualiza o item numa posição.
- `size()`: Retorna a quantidade de elementos na lista.

## Como Executar

### Pré-requisitos
- JDK 11 ou superior instalado.

### Compilação e Execução (Via Terminal)

1. **Clonar ou aceder à pasta `src`**:
   ```bash
   cd src
2. Compilar o projeto:

  `javac dev/aluno/datastructures/list/*.java dev/aluno/datastructures/list/tests/*.java`
   
3. Executar os testes:

   `java dev.aluno.datastructures.list.tests.MyLinkedListTests`

   
   
