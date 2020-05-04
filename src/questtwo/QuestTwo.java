
package questtwo;

import entidades.Pessoas;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;


public class QuestTwo {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner read = new Scanner (System.in);
        List<Pessoas> listpessoa = new ArrayList<>();
   
        for( int i=1; i<=4; i++){
            
            System.out.print("Digite seu nome:");
            String nome= read.nextLine();
            System.out.print("Digite o sexo sendo 'M' ou 'F' :");
            String sexo= read.nextLine();
            System.out.print("Digite sua idade:");
            Integer idade = read.nextInt();
            read.nextLine();
            Pessoas pessoa = new Pessoas(nome, sexo, idade);
            listpessoa.add(pessoa);
            
        }
        
        
    for(Pessoas objPes : listpessoa){
            System.out.println(objPes.ToString());
    }
    
    List<Pessoas> listfem = listpessoa.stream().filter(pessoa -> pessoa.getIdade()>=18 && pessoa.getSexo().equals("F"))
            .collect(Collectors.toList());
    listfem.forEach(p -> System.out.println(p.getNome()));
                        System.out.println("Mulheres Acima de 18 ");
                        
                        
                       
    List<Pessoas> listmas = listpessoa.stream().filter(pessoa -> pessoa.getIdade()>=18 && pessoa.getSexo().equals("M")).collect(Collectors.toList());
        listmas.forEach(p -> System.out.println(p.getNome()));
                               System.out.println("homes acima de 18 anos");
                               
                               
                                       
    for(Pessoas objPes : listpessoa){
        System.out.println("Lista de todos os candidatos");
   
            System.out.println(objPes.ToString());
    
    }
    read.close();
    
    
    }
    
}
