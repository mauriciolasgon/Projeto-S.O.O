public class Paciente
{
    
    private String nome;
    private int cpf;
    private int rg;
    private int[] data_nascimento;

    public Paciente (String nome, int cpf, int rg, int dia, int mes, int ano)
    {
        this.nome = nome;
        this.cpf = cpf;
        this.rg = rg;
        this.data_nascimento[0] = ano;
        this.data_nascimento[1] = mes;
        this.data_nascimento[2] = dia;
    }

    public String getNome()
    {
        return nome;
    }

    



}