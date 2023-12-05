public class Medico
{

    
    private String nome;
    private int cpf;
    private int rg;
    private int[] data_nascimento = new int[3];
    private String especialidade;
    private int index;

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

    public int getIndex()
    {
        return index;
    }

}
