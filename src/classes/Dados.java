package classes;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Date;

public final class Dados {
    private int maxUsu = 50;
    private int maxPro = 100;
    private int maxCli = 100;
    private Usuario msUsuarios[] = new Usuario[maxUsu];
    private Produto msProdutos[] = new Produto[maxPro];
    private Cliente msClientes[] = new Cliente[maxCli];
    private int conUsu = 0;
    private int conPro = 0;
    private int conCli = 0;
    private int numFatura = 0;
    
    public Dados(){
        preencherUsuarios();
        
        preencherProdutos();
        
        preencherClientes();
        
        preencherConfiguracao();
    }
    
    public int numeroUsuarios(){
        return conUsu;
    }
    
    public int numeroProdutos(){
        return conPro;
    }
    
    public int numeroClientes(){
        return conCli;
    }
    
    public Usuario[] getUsuarios(){
        return msUsuarios;
    }
    
    public Produto[] getProdutos(){
        return msProdutos;
    } 
    
    public Cliente[] getClientes(){
        return msClientes;
    }
   
    public int getNumeroFatura(){
        return numFatura;
    }
    
    public void setNumeroFatura(int numFatura){
        this.numFatura = numFatura;
    }
    
    public boolean validarUsuario(String usuario, String senha){
        boolean aux = false;
        for (int i = 0; i < conUsu; i++){
            if(msUsuarios[i].getIdUsuario().equals(usuario)&&
                    msUsuarios[i].getSenha().equals(senha)){
            return true;
          }
        }
        return false;
    }
    
    public int getPerfil(String usuario){
        for (int i = 0; i < conUsu; i++){
            if(msUsuarios[i].getIdUsuario().equals(usuario)){
            return msUsuarios[i].getPerfil();
          }
        }
        return -1;
    }
    
    public void trocarSenha(String usuario, String senha){
        for (int i = 0; i < conUsu; i++){
            if(msUsuarios[i].getIdUsuario().equals(usuario)){
            msUsuarios[i].setSenha(senha);
            return;
          }
        }
    }

    public int posicaoUsuario(String usuario){
        for (int i = 0; i < conUsu; i++){
            if(msUsuarios[i].getIdUsuario().equals(usuario)){
            return i;
            }
        }
        return -1;
    }
    
    public int posicaoProduto(String produto){
        for (int i = 0; i < conPro; i++){
            if(msProdutos[i].getDescricao().equals(produto)){
            return i;
            }
        }
        return -1;
    }
    
    public int posicaoCliente(String cliente){
        for (int i = 0; i < conCli; i++){
            if(msClientes[i].getNome().equals(cliente)){
            return i;
            }
        }
        return -1;
    }
    
    public String adicionarUsuario(Usuario mUsuario){
        if (conUsu == maxUsu){
            return "Não é possível cadastrar mais usuário.";
        }
        msUsuarios [conUsu] = mUsuario;
        conUsu++;
        return "Usuário cadastrado com sucesso";
    }
    
    public String adicionarProduto(Produto mProduto){
        if (conPro == maxPro){
            return "Não é possível cadastrar mais produto";
        }
        msProdutos [conPro] = mProduto;
        conPro++;
        return "Produto cadastrado com sucesso";
    }
    
    public String adicionarCliente(Cliente mCliente){
        if (conCli == maxCli){
            return "Não é possível cadastrar mais clientes";
        }
        msClientes [conCli] = mCliente;
        conCli++;
        return "Cliente cadastrado com sucesso";
    }
    
    public String editarUsuario (Usuario mUsuario, int pos){
        msUsuarios[pos].setNome(mUsuario.getNome());
        msUsuarios[pos].setSobrenome(mUsuario.getSobrenome());
        msUsuarios[pos].setSenha(mUsuario.getSenha());
        msUsuarios[pos].setPerfil(mUsuario.getPerfil());
        return "Usuário editado com sucesso";
    }
    
    public String editarProduto (Produto mProduto, int pos){
        msProdutos[pos].setDescricao(mProduto.getDescricao());
        msProdutos[pos].setPreco((int) mProduto.getPreco());
        msProdutos[pos].setImposto(mProduto.getImposto());
        msProdutos[pos].setAnotacao(mProduto.getAnotacao());
        return "Produto editado com sucesso";
    }

    public String editarCliente (Cliente mCliente, int pos){
        msClientes[pos].setIdTipo(mCliente.getIdTipo());
        msClientes[pos].setNome(mCliente.getNome());
        msClientes[pos].setSobrenome(mCliente.getSobrenome());
        msClientes[pos].setEndereco(mCliente.getEndereco());
        msClientes[pos].setTelefone(mCliente.getTelefone());
        msClientes[pos].setIdCidade(mCliente.getIdCidade());
        msClientes[pos].setDNascimento(mCliente.getDNascimento());
        msClientes[pos].setData(mCliente.getData());
        return "Cliente editado com sucesso";
    }
    
    public String deletarUsuario (int pos){
        for (int i = pos; i <  conUsu -1; i++){
            msUsuarios[i] = msUsuarios[i+1];
        }
        conUsu--;
        return "Usuário deletado com sucesso.";
    }
    
    public String deletarProduto (int pos){
        for (int i = pos; i <  conPro -1; i++){
            msProdutos[i] = msProdutos[i+1];
        }
        conPro--;
        return "Produto deletado com sucesso.";
    }
    
    public String deletarCliente (int pos){
        for (int i = pos; i <  conCli -1; i++){
            msClientes[i] = msClientes[i+1];
        }
        conCli--;
        return "Cliente deletado com sucesso.";
    }
    
    public void salvarTudo(){
        salvarUsuarios();
        salvarClientes();
        salvarProdutos();
        salvarConfiguracao();
    }
    
    public void salvarUsuarios(){
        FileWriter fw = null;
        PrintWriter pw = null;
        try {
            fw = new FileWriter("Data/usuarios.txt");
            pw = new PrintWriter(fw);
            for (int i = 0; i < conUsu; i++){
                pw.println(msUsuarios[i].toString());
            }
        } catch (Exception e1) {
            e1.printStackTrace();
        }finally {
            try {
                if (fw != null){
                    fw.close();
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }
    
    public void salvarClientes(){
        FileWriter fw = null;
        PrintWriter pw = null;
        try {
            fw = new FileWriter("Data/clientes.txt");
            pw = new PrintWriter(fw);
            for (int i = 0; i < conCli; i++){
                pw.println(msClientes[i].toString());
            }
        } catch (Exception e1) {
            e1.printStackTrace();
        }finally {
            try {
                if (fw != null){
                    fw.close();
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }
    
    public void salvarProdutos(){
        FileWriter fw = null;
        PrintWriter pw = null;
        try {
            fw = new FileWriter("Data/produtos.txt");
            pw = new PrintWriter(fw);
            for (int i = 0; i < conPro; i++){
                pw.println(msProdutos[i].toString());
            }
        } catch (Exception e1) {
            e1.printStackTrace();
        }finally {
            try {
                if (fw != null){
                    fw.close();
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }
    
    public void salvarConfiguracao(){
        FileWriter fw = null;
        PrintWriter pw = null;
        try {
            fw = new FileWriter("Data/Configuracao.ini");
            pw = new PrintWriter(fw);
           
            pw.println("[Geral]");
            pw.println("faturaAtual=" + numFatura);
        } catch (Exception e1) {
            e1.printStackTrace();
        }finally {
            try {
                if (fw != null){
                    fw.close();
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }
    
    public void preencherUsuarios(){
        File arquivo = null;
        FileReader fr = null;
        BufferedReader br = null;
        try {
            arquivo = new File("Data/usuarios.txt");
            fr = new FileReader(arquivo);
            br = new BufferedReader(fr);
            
            int pos;
            String aux;
            String linha;
            
            String idUsuario;
            String nome;
            String sobrenome;
            String senha;
            int perfil;
            
            while((linha = br.readLine()) != null){
                pos = linha.indexOf('|');
                aux = linha.substring(0, pos);
                idUsuario = aux;
                linha = linha.substring(pos + 1);
                
                pos = linha.indexOf('|');
                aux = linha.substring(0, pos);
                nome = aux;
                linha = linha.substring(pos + 1);
                
                pos = linha.indexOf('|');
                aux = linha.substring(0, pos);
                sobrenome = aux;
                linha = linha.substring(pos + 1);
                
                pos = linha.indexOf('|');
                aux = linha.substring(0, pos);
                senha = aux;
                linha = linha.substring(pos + 1);
                perfil = new Integer(linha);
                
                Usuario mUsuario = new Usuario(idUsuario,
                        nome,
                        sobrenome,
                        senha,
                        perfil);
                msUsuarios[conUsu] = mUsuario;
                conUsu++;
            } 
        } catch (Exception e1) {
            e1.printStackTrace();
        } finally{
            try {
                 if(fr != null){
                fr.close();
            }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }
    
    public void preencherProdutos(){
        File arquivo = null;
        FileReader fr = null;
        BufferedReader br = null;
        try {
            arquivo = new File("Data/produtos.txt");
            fr = new FileReader(arquivo);
            br = new BufferedReader(fr);
            
            int pos;
            String aux;
            String linha;
            
            String idProduto;
            String descricao;
            double preco;
            int imposto;
            String anotacao;
            
            while((linha = br.readLine()) != null){
                pos = linha.indexOf('|');
                aux = linha.substring(0, pos);
                idProduto = aux;
                linha = linha.substring(pos + 1);
                
                pos = linha.indexOf('|');
                aux = linha.substring(0, pos);
                descricao = aux;
                linha = linha.substring(pos + 1);
                
                pos = linha.indexOf('|');
                aux = linha.substring(0, pos);
                preco = new Double(aux);
                linha = linha.substring(pos + 1);
                
                pos = linha.indexOf('|');
                aux = linha.substring(0, pos);
                imposto = new Integer(aux);
                linha = linha.substring(pos + 1);
                
                anotacao = linha;
                
                Produto mProduto = new Produto(idProduto,
                        descricao,
                        preco,
                        imposto,
                        anotacao);
                msProdutos[conPro] = mProduto;
                conPro++;
            } 
        } catch (Exception e1) {
            e1.printStackTrace();
        } finally{
            try {
                 if(fr != null){
                fr.close();
            }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }
    
    public void preencherClientes(){
        File arquivo = null;
        FileReader fr = null;
        BufferedReader br = null;
        try {
            arquivo = new File("Data/clientes.txt");
            fr = new FileReader(arquivo);
            br = new BufferedReader(fr);
            
            int pos;
            String aux;
            String linha;
            
            String idCliente;
            int idTipo;
            String Nome;
            String Sobrenome;
            String Endereco;
            String Telefone;
            int idCidade;
            Date DNascimento;
            Date Data;
            
            while((linha = br.readLine()) != null){
                pos = linha.indexOf('|');
                aux = linha.substring(0, pos);
                idCliente = aux;
                linha = linha.substring(pos + 1);
                
                pos = linha.indexOf('|');
                aux = linha.substring(0, pos);
                idTipo = new Integer(aux);
                linha = linha.substring(pos + 1);
                
                pos = linha.indexOf('|');
                aux = linha.substring(0, pos);
                Nome = aux;
                linha = linha.substring(pos + 1);
                
                pos = linha.indexOf('|');
                aux = linha.substring(0, pos);
                Sobrenome = aux;
                linha = linha.substring(pos + 1);
                
                pos = linha.indexOf('|');
                aux = linha.substring(0, pos);
                Endereco = aux;
                linha = linha.substring(pos + 1);
                
                pos = linha.indexOf('|');
                aux = linha.substring(0, pos);
                Telefone = aux;
                linha = linha.substring(pos + 1);
                
                pos = linha.indexOf('|');
                aux = linha.substring(0, pos);
                idCidade = new Integer(aux);
                linha = linha.substring(pos + 1);
                               
                pos = linha.indexOf('|');
                aux = linha.substring(0, pos);
                DNascimento = Ultilidades.StringToDate(aux);
                linha = linha.substring(pos + 1);
                
                Data = Ultilidades.StringToDate(linha);
                
                                
                Cliente mCliente = new Cliente(idCliente,
                        idTipo,
                        Nome,
                        Sobrenome,
                        Endereco,
                        Telefone,
                        idCidade,
                        DNascimento,
                        Data);
                msClientes[conCli] = mCliente;
                conCli++;
            } 
        } catch (Exception e1) {
            e1.printStackTrace();
        } finally{
            try {
                 if(fr != null){
                fr.close();
            }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }
    
    public void preencherConfiguracao(){
        File arquivo = null;
        FileReader fr = null;
        BufferedReader br = null;
        try {
            arquivo = new File("Data/Configuracao.ini");
            fr = new FileReader(arquivo);
            br = new BufferedReader(fr);

            String linha;

            
            while((linha = br.readLine()) != null){
                if (linha.startsWith("FaturaAtual=")){
                numFatura = new Integer(linha.substring(12));
                }   
                
            } 
        } catch (Exception e1) {
            e1.printStackTrace();
        } finally{
            try {
                 if(fr != null){
                fr.close();
            }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }
}