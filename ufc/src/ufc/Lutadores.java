
package ufc;

public abstract class Lutadores {
   private String nome;
   private   int idade;
   private  float peso;

    public Lutadores(String nome, int idade, float peso) {
        this.nome  = nome;
        this.idade = idade;
        this.peso  = peso;
    }

    public String getNome() {
        return nome;
        
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }
   
   
    
}
