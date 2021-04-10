-----------------------------Projeto LP2-----------------------------

Não conseguimos fazer o .jar exportado funcionar fora do eclipse, nem usando a opção
embutida do próprio ecplise de exportar Runnable JAR Files nem utilizando o build.fxbuild
que é criado automaticamente junto com o projetoJavaFX do eclipse. Encontramos diversos 
problemas, tanto usando Java 15 quanto Java 8. Então enviaremos o projeto do eclipse
e abaixo forneceremos todas as instruções necessárias para executar o programa correntamente
dentro do Eclipse. Lamentamos o incômodo.

--Passos--

1. Baixe o JavaFX 16 SDK e extraia os conteúdos do .zip; 
	Para escolher para qual sistema operacional baixar, entre nesse link: https://gluonhq.com/products/javafx/
	Nossos testes foram feitos usando Windows x64, a versão exata do JavaFX usada nos nossos testes pode ser 
	baixada diretamente nesse link: https://gluonhq.com/download/javafx-16-sdk-windows/
	Usamos Java 15 SDK nos nossos testes.
	
2. Para configurarmos o eclipse para funcionar com JavaFX inicialmente encontramos algumas dificuldades, conseguimos
   resolver nossos problemas seguindo as instruções presentes neste vídeo: https://www.youtube.com/watch?v=bk28ytggz7E
	
3. Com o eclipse configurado, basta importar o projeto e selecionar Run (para MainApp.java, presente no pacote "br.ufrn.imd").