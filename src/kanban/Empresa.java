package kanban;

import java.util.ArrayList;
import java.util.List;

public class Empresa {
    private String nomeEmpresa;
    private List<Projeto> projetos;
    private int id;
    
    // Construtor
    public Empresa(int id, String nomeEmpresa) {
        this.id = id;
        this.nomeEmpresa = nomeEmpresa;
        this.projetos = new ArrayList<>();
    }

    // Getter e Setter para nomeEmpresa
    public String getNomeEmpresa() {
        return nomeEmpresa;
    }

    public int getId() {
        return id;
    }
    
    public boolean verificarSenha(int senha) {
        return this.id == senha;
    }
    
    public void setNomeEmpresa(String nomeEmpresa) {
        this.nomeEmpresa = nomeEmpresa;
    }
    
    public void adicionarProjeto(Projeto projeto) {
        projetos.add(projeto);
    }
    public List<Projeto> getProjetos() {
        return projetos;
    }
}
