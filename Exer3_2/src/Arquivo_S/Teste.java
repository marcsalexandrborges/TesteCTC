 package Arquivo_S;

public class Teste {
		
	public static void main(String[] args) {
        String arq = "arquivo.txt";
        
     
        
	
      
        //GRAVA��O
        String texto = "Sem press�o, sem diamantes.\" | \""
                + "Mude o jogo , n�o deixe o jogo mudar voc�.\" | \""
                + "Uma alma feliz � o melhor escudo para um mundo cruel.\" | \""
                + "Os olhos s�o in�teis quando a mente � cega.\"|\""
                + "Amor por todos, �dio por nenhum.\"|\""
                + "Nunca se arrependa de nada que tenha feito voc� sorrir.\"| \""
                + "O �dio vem da intimida��o, o amor vem da aprecia��o.\"|\""
                + "Seja t�o bom que eles n�o possam te ignorar.\"|\""
                + "Ilumina��o � quando uma onda percebe que � o oceano.\"|\""
                + "Deixe a beleza do que voc� ama ser o que voc� faz.\"|\""
                + "�s vezes, o caminho certo n�o � o mais f�cil.\"|\""
                + "Grandes homens n�o nascem grandes, crescem grandes.\"|\""
                + "Fa�a ou n�o fa�a. N�o existe isso de tentar.\"|\""
                + "Os problemas n�o s�o sinais de parada, s�o diretrizes.\"|\""
                + "A gratid�o � a mem�ria do cora��o.\" | \""
                + "N�o importa o que voc� decidiu. O que importa � que isso te fa�a feliz.\" | \""
                + "Deixe pra tr�s o que n�o te leva pra frente.\"|\""
                + "O segredo � ter f� em Deus.\"|\""
                + "Falo nada, s� observo.\"| \""
                + "Insista, persista e nunca desista.\"|\""
                + "Queira o bem. Fa�a o bem. O resto vem.\"|\""
                + "Fa�a valer a pena, as oportunidades n�o voltam.\"|\""
                + "Fam�lia: base de tudo.\"|\""
                + "Tire o dia para sorrir.\"|\""
                + "Deixe que sua f� seja maior que seus problemas.\"|\""
                + "Voc� � o que escolhe ser.\"|\""
                + "O sorriso � a melhor resposta para um olhar\"|\""
                +"Se � para ter crise, que seja de riso.";
        
        if(Arquivo.Write(arq, texto))
            System.out.println("Arquivo salvo com sucesso!");
        else
            System.out.println("Erro ao salvar o arquivo!");
        
        
        //LEITURA
        String Texto = Arquivo.Read(arq);
        if(texto.isEmpty())
            System.out.println("Erro ao ler do arquivo!");
        else
            System.out.println(texto);
        
        
        String ArqConfig = "conf.con";
        /*
        String nome = "Marcos";
        String login = "admin";
        String versao = "1.0.5";
        
        String print = nome+";"+login+";"+versao;
        Arquivo.Write(ArqConfig,print);
        
        
        String conteudo = Arquivo.Read(ArqConfig);
        String c1 = conteudo.split(";")[0];
        String c2 = conteudo.split(";")[1];
        String c3 = conteudo.split(";")[2];
        
        System.out.println("Nome: "+c1);
        System.out.println("Login: "+c2);
        System.out.println("Vers�o: "+c3);
        */
    }
    
} 	    