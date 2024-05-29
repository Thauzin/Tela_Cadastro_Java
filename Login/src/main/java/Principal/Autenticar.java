package Principal;

public class Autenticar {

    private String login;
    private String senha;

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public Autenticar(String login, String senha) {
        this.login = login;
        this.senha = senha;
    }

    public boolean testar() { 
        if (this.login.equals("admin") && (this.senha.equals("1234")))
        {
            return true;
        }
        else{
                return false;
                }

    }
    
}
