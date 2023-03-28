
package model;


public class Aluno {
    String nome;
    int codmat;
    String email;
    
public Aluno (String nome, int codmat, String email) {
   this.nome = nome;
   this.codmat = codmat;
   this.email = email;
   
}

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCodmat() {
        return codmat;
    }

    public void setCodmat(int codmat) {
        this.codmat = codmat;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    
}
