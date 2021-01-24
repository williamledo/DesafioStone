# Desafio Stone - William Lêdo da Cunha

## Link do Projeto no GitHub: https://github.com/williamledo/DesafioStone

## Sobre o projeto

Projeto desenvolvido com base no desafio técnico da Stone. Consiste em criar um programa que irá receber uma lista de compras e uma lista de emails, a lista de compras contém o nome do item, a quantidade e o preço. O programa tem uma função que irá receber as duas listas e calcular com base nos dados da lista e irá dividir o mais igualitariamente possível para a quantidade de pessoas cadastradas da lista de emails, por fim, essa função irá retornar um Map, a chave será o email e o valor será o quanto essa pessoa deverá pagar no final da conta.

## Modelo Conceitual

![Diagrama](https://github.com/williamledo/DesafioStone/blob/master/assets/Diagrama%20Projeto%20Stone.png)

# Como executar o projeto

Pré-requisitos:
Java 11, Git, IDE Eclipse ou Netbeans

1- Crie uma pasta na área de trabalho, entre na pasta, clique com o botão direito do mouse e selecione "Git Bash Here" e digite as duas linhas de códigos abaixo

Irá criar um novo repositório
```bash
git init
```
Irá clonar os arquivos do github para a pasta
```bash
git clone https://github.com/williamledo/TesteStone.git
```

2- Abra sua IDE, vá no menu e selecione "File", logo depois em Import, abra a pasta "General", selecione "Existing Projects into Workspace" e clique em "next"

3- Na primeira opção "Select root directory: " , clique em "Browse..." e selecione a pasta que você criou no começo do tutorial, apenas selecione ela e clique em "OK", após isso clique em "Finish"

4- Depois disso o projeto já foi importado para sua máquina, para testar o programa, procure o projeto java "Desafio Stone", abra o arquivo "Lista" e inicie o programa

```bash
DesafioStone > src > Programa > Lista.java
``` 

# Testes

O projeto tem uma classe feita para testar a função, para encontrá-la basta ir na pasta do projeto 

```bash
DesafioStone > src > Programa.testes > ListaUtilTeste.java
``` 
Agora é só executar o arquivo e ver o resultado do teste.
