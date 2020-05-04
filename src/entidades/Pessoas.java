
package entidades;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


public class Pessoas {
    private String nome;
    private String sexo;
    private Integer idade;
    private List<Pessoas> listpessoa = new ArrayList<>();
    public Pessoas() {
    }

    public Pessoas(String nome, String sexo, Integer idade) {
        this.nome = nome;
        this.sexo = sexo;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public List<Pessoas> getListpessoa() {
        return listpessoa;
    }

  /*  public void addPessoa(Pessoas pessoa){
    
    listpessoa.add(pessoa);
    }
      public void Remove(Pessoas pessoa){
    
    listpessoa.remove(pessoa);
    }*/
    public StringBuilder SB(){
    
    StringBuilder sb = new StringBuilder();
        
        sb.append(nome);
         sb.append(sexo);
          sb.append(idade);
          
                
       
    return sb;
    
    }
   public String ToString(){
   
   return "NOME: "
           +nome
           +" \n sexo:"
          +sexo
          +"\n idade:"        
          +idade;
   }
   
}
