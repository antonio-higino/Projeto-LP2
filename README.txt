-----------------------------Projeto LP2-----------------------------

N�o conseguimos fazer o .jar exportado funcionar fora do eclipse, nem usando a op��o
embutida do pr�prio ecplise de exportar Runnable JAR Files nem utilizando o build.fxbuild
que � criado automaticamente junto com o projetoJavaFX do eclipse. Encontramos diversos 
problemas, tanto usando Java 15 quanto Java 8. Ent�o enviaremos o projeto do eclipse
e abaixo forneceremos todas as instru��es necess�rias para executar o programa correntamente
dentro do Eclipse. Lamentamos o inc�modo.

--Passos--

1. Baixe o JavaFX 16 SDK e extraia os conte�dos do .zip; 
	Para escolher para qual sistema operacional baixar, entre nesse link: https://gluonhq.com/products/javafx/
	Nossos testes foram feitos usando Windows x64, a vers�o exata do JavaFX usada nos nossos testes pode ser 
	baixada diretamente nesse link: https://gluonhq.com/download/javafx-16-sdk-windows/
	Usamos Java 15 SDK nos nossos testes.
	
2. Para configurarmos o eclipse para funcionar com JavaFX inicialmente encontramos algumas dificuldades, conseguimos
   resolver nossos problemas seguindo as instru��es presentes neste v�deo: https://www.youtube.com/watch?v=bk28ytggz7E
	
3. Com o eclipse configurado, basta importar o projeto e selecionar Run (para MainApp.java, presente no pacote "br.ufrn.imd").