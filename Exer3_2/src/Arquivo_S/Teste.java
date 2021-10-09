 package Arquivo_S;

public class Teste {
		
	public static void main(String[] args) {
        String arq = "arquivo.txt";
        
     
        
	
      
        //GRAVAÇÃO
        String texto = "Sem pressão, sem diamantes.\" | \""
                + "Mude o jogo , não deixe o jogo mudar você.\" | \""
                + "Uma alma feliz é o melhor escudo para um mundo cruel.\" | \""
                + "Os olhos são inúteis quando a mente é cega.\"|\""
                + "Amor por todos, ódio por nenhum.\"|\""
                + "Nunca se arrependa de nada que tenha feito você sorrir.\"| \""
                + "O ódio vem da intimidação, o amor vem da apreciação.\"|\""
                + "Seja tão bom que eles não possam te ignorar.\"|\""
                + "Iluminação é quando uma onda percebe que é o oceano.\"|\""
                + "Deixe a beleza do que você ama ser o que você faz.\"|\""
                + "Às vezes, o caminho certo não é o mais fácil.\"|\""
                + "Grandes homens não nascem grandes, crescem grandes.\"|\""
                + "Faça ou não faça. Não existe isso de tentar.\"|\""
                + "Os problemas não são sinais de parada, são diretrizes.\"|\""
                + "A gratidão é a memória do coração.\" | \""
                + "Não importa o que você decidiu. O que importa é que isso te faça feliz.\" | \""
                + "Deixe pra trás o que não te leva pra frente.\"|\""
                + "O segredo é ter fé em Deus.\"|\""
                + "Falo nada, só observo.\"| \""
                + "Insista, persista e nunca desista.\"|\""
                + "Queira o bem. Faça o bem. O resto vem.\"|\""
                + "Faça valer a pena, as oportunidades não voltam.\"|\""
                + "Família: base de tudo.\"|\""
                + "Tire o dia para sorrir.\"|\""
                + "Deixe que sua fé seja maior que seus problemas.\"|\""
                + "Você é o que escolhe ser.\"|\""
                + "O sorriso é a melhor resposta para um olhar\"|\""
                +"Se é para ter crise, que seja de riso.";
        
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
        System.out.println("Versão: "+c3);
        */
    }
    
} 	    