public class Teste {
    public static void main(String[] args) 
    {
        Sistema sistema = new Sistema();



        Paciente paciente1 = new Paciente("Gabriel",22,22,22,03,2004);
        Paciente paciente2 = new Paciente("Mauricio",33,33,01,12,2002);

        Medico medico1 = new Medico("Joao",44,44,13,11,1977,"neurologista");
        Medico medico2 = new Medico("Paula",55,55,18,01,1990,"ortopedista");

        sistema.cadastrarPaciente(paciente1);
        sistema.cadastrarPaciente(paciente2);

        sistema.cadastrarMedico(medico1);
        sistema.cadastrarMedico(medico2);

        sistema.realizarConsulta(paciente1, medico1, "2023-11-01");
        sistema.realizarConsulta(paciente2, medico2, "2023-11-01");

        





    }
}
