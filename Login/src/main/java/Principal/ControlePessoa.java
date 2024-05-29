
package Principal;

import java.util.ArrayList;



//É A CLASSE QUE VAI CONVERSAR DIRETAMENTE COM A TELA 
public class ControlePessoa {
    private ArrayList <Pessoa> listaPessoas;  // CRIANDO UMA LISTA DA CLASSE PESSOA
    
    public ControlePessoa() {
        this.listaPessoas = new ArrayList(); 
    }
    
    public boolean testarVazio(Pessoa pessoa) {
        if(pessoa.getNome().equals("") || pessoa.getCPF().equals("") || pessoa.getTelefone().equals("")){ 
            return true; 
        }
        else{
            return false; 
        }
        
    }
    
    public boolean salvar(Pessoa pessoa) { 
        if (pessoa!=null) {
            this.listaPessoas.add(pessoa); 
            return true; 
        }
        else {
            return false; 
        }
    }

    public ArrayList<Pessoa> getListaPessoas() {
        return listaPessoas;
    }

    public void setListaPessoas(ArrayList<Pessoa> listaPessoas) {
        this.listaPessoas = listaPessoas;
    }
    
    public boolean deletar(int id){
         this.listaPessoas.remove(id);
         return true; 
    }
    
    
    
}

