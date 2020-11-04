# TestesJava
Primeiro Teste
Desafio - Testes
Importando o projeto na IDE
O projeto está utilizando:

● Java 11
● Maven
● JUnit e Mockito

Para importar o projeto:
● Descompacte o arquivo batalha-robos.zip
● Abra a sua IDE de preferência
● Selecione a opção para importar o projeto

● No Eclipse:
○ File > Import… > Existing Maven Projects
○ Selecione o diretório onde o projeto foi descompactado.
○ Clique em Finish


Batalha de Robôs
O sistema de batalha de robôs está praticamente pronto, mas antes de enviá-lo para
produção é necessário a implementação de testes automatizados.

As características do sistema são:
● A batalha deve ter ao menos dois robôs.
● A batalha deve ter no máximo dez robôs.
● Cada robô tem um valor de ataque, defesa e uma habilidade.
● O poder do robô é a soma de seu ataque, defesa e poder adicional concedido pela
habilidade.
● O vencedor é o robô com maior poder. Em caso de empate é o robô que entrou
primeiro na batalha.
● Ao terminar a batalha é realizada uma requisição para um serviço externo
notificando o vencedor.


Criando os testes
Utilize seus conhecimentos sobre testes automatizados, JUnit e Mockito para implementar
os testes que vão garantir o funcionamento correto do sistema.
As classes de teste devem ser criadas dentro do diretório src/test/java.
Crie dentro desse diretório o pacote equivalente para a classe de teste. Exemplo:
● Classe MeuExemplo.java no pacote br.com.codar.exemplo e diretório
src/main/java.
● Teste seria a classe MeuExemploTest.java no pacote br.com.codar.exemplo e
diretório src/test/java.

Modificação e mais testes

Faça a seguinte modificação:
● Adicione uma nova habilidade chamada SUPER_PODER com poder adicional de
100.
● Adicione a regra de que é necessário ao menos dois robôs com a habilidade
SUPER_PODER na batalha para que ela seja válida. Caso essa regra não seja
atendida lance uma exceção com a mensagem “Seria injusto apenas um robô com
super poderes. Devem existir ao menos 2 com essa habilidade.”. Exemplos dessa
validação:
○ Nenhum robô com SUPER_PODER: Batalha válida
○ Apenas um robô com SUPER_PODER: Batalha inválida
○ Dois ou mais robôs com SUPER_PODER: Batalha válida
