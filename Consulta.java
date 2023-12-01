public class Consulta 
{
    private Paciente paciente;
    private Medico medico;
    private String data;
    private String[] avaliacao; //formulário
    private String resultado; //de acordo com o que IA retornar

    public Consulta(Paciente paciente, Medico medico, String avaliacao) 
    {
        this.paciente = paciente;
        this.medico = medico;
        this.avaliacao = avaliacao;
    }

    public Paciente getPaciente()
    {
        return paciente;
    }

    public Medico getMedico()
    {
        return medico;
    }

    public String getData()
    {
        return data;
    }

    public String getAvaliacao()
    {
        return avaliacao;
    }






}
