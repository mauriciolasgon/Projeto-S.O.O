import java.util.ArrayList;
import java.util.List;

public class Sistema 
{
    private List<Paciente> pacientes;
    private List<Medico> medicos;
    private List<Consulta> consultas;

    public Sistema ()
    {
        this.pacientes = new ArrayList<>();
        this.medicos = new ArrayList<>();
        this.consultas = new ArrayList<>();
    }

    public void cadastrarPaciente (Paciente paciente)
    {
        pacientes.add(paciente);
    }

    public void cadastrarMedico (Medico medico)
    {
        medicos.add(medico);
    }

    public void realizarConsulta(Paciente paciente, Medico medico, String data) 
    {
        Consulta consulta = new Consulta(paciente, medico, data);
        consultas.add(consulta);
    }

    public void exibirConsultas() {
        for (Consulta consulta : consultas) {
            System.out.println("Data: " + consulta.getData());
            System.out.println("Cliente: " + consulta.getPaciente().getNome());
            System.out.println("Médico: " + consulta.getMedico().getNome());
            System.out.println("Especialidade: " + consulta.getMedico().getEspecialidade());
            System.out.println("---------------------------");
        }
    }
}
