package Palindromo;



import javax.swing.*;

class Teste{  

public static void main(String[] args) {
       
       String palavra, palavraInvertida="";
       int tamanho,i;


       // Armazena a palavra numa String
       palavra = JOptionPane.showInputDialog(null,"Digite uma palavra"); 


       //tamanho recebe o qtd de letras q possui a palavra
       tamanho=palavra.length(); 
       
       
       //pega a ultima letra da variavel palavra, e inseri na primeira de palavraInvertida, depois pega penultima e inseri na 2?, e assim em diante, at? pegar a primeira, e colocar na ultima.
       for(i=tamanho-1;i>=0;i--){  
           palavraInvertida += palavra.charAt(i);
        }
        

       //Compara as Duas Strings e Exibe o Resultado
       if(palavra.equals(palavraInvertida)) 
            JOptionPane.showMessageDialog(null,palavra + " ? uma palavra palindroma"); 
       else 
            JOptionPane.showMessageDialog(null,palavra + " N?o ? uma palavra palindroma"); 

       
}
    
}
