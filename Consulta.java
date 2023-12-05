import java.util.List;


public class Consulta 
{
    private Paciente paciente;
    private Medico medico;
    private String data;
    private String resultado; //de acordo com o que IA retornar

    public Consulta(Paciente paciente, Medico medico, String resultado) 
    {
        this.paciente = paciente;
        this.medico = medico;
        this.resultado = resultado;
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


}
