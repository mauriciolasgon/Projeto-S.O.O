public class Medico
{

    
    private String nome;
    private int cpf;
    private int rg;
    private int[] data_nascimento;
    private String especialidade;

    public Medico (String nome, int cpf, int rg, int dia, int mes, int ano, String especialidade)
    {
        this.nome = nome;
        this.cpf = cpf;
        this.rg = rg;
        this.data_nascimento[0] = ano;
        this.data_nascimento[1] = mes;
        this.data_nascimento[2] = dia;
        this.especialidade = especialidade;
    }

    public String getNome()
    {
        return nome;
    }
    
    public String getEspecialidade()
    {
        return especialidade;
    }

}
