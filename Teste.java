import java.util.Scanner;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Teste {
    public static void main(String[] args) 
    {
        Sistema sistema = new Sistema();

        /*Paciente paciente1 = new Paciente("Gabriel",22,22,22,03,2004);
        Paciente paciente2 = new Paciente("Mauricio",33,33,01,12,2002);

        Medico medico1 = new Medico("Joao",44,44,13,11,1977,"neurologista");
        Medico medico2 = new Medico("Paula",55,55,18,01,1990,"ortopedista");

        sistema.cadastrarPaciente(paciente1);
        sistema.cadastrarPaciente(paciente2);

        sistema.cadastrarMedico(medico1);
        sistema.cadastrarMedico(medico2);

        sistema.realizarConsulta(paciente1, medico1, "2023-11-01");
        sistema.realizarConsulta(paciente2, medico2, "2023-11-01");*/

        Scanner input = new Scanner(System.in);
        int funcao;
        int numero_pacientes=0;
        int numero_medicos=0;
        int numero_consultas=0;

        
        Paciente paciente[] = new Paciente[100];
        Medico medico[] = new Medico[100];
        Consulta consulta[] = new Consulta[100];
        List<Integer>[] vetorDeListas = new ArrayList[5];

        while (funcao != 4)
        {
            
            System.out.println("Menu: ");
            System.out.print("1 - Criar Paciente");
            System.out.print("2 - Criar Medico");
            System.out.print("3 - Criar Consulta");
            System.out.print("4 - Sair");
            funcao = input.nextInt();
        
            switch (funcao) {
                case 1:
                    
                    System.out.println("Qual o nome do Paciente? ");
                    String name_paciente = input.nextLine();
                    System.out.println("Qual o CPF do Paciente? ");
                    int CPF_paciente = input.nextInt();
                    System.out.println("Qual o RG do Paciente?  ");
                    int RG_paciente = input.nextInt();
                    System.out.println("Qual a data de nascimento do Paciente? ");
                    int Dia_paciente = input.nextInt();
                    int Mes_paciente = input.nextInt();
                    int Ano_paciente = input.nextInt();
                    
                    paciente[numero_pacientes] = new Paciente(name_paciente,CPF_paciente,RG_paciente,Dia_paciente,Mes_paciente,Ano_paciente);
                    numero_pacientes++;
                                       
                
                    break;
            
                case 2:
                    
                    System.out.println("Qual o nome do Medico? ");
                    String name_medico = input.nextLine();
                    System.out.println("Qual o CPF do Medico? ");
                    int CPF_medico = input.nextInt();
                    System.out.println("Qual o RG do Medico?  ");
                    int RG_medico = input.nextInt();
                    System.out.println("Qual a data de nascimento do Medico? ");
                    int Dia_medico = input.nextInt();
                    int Mes_medico = input.nextInt();
                    int Ano_medico = input.nextInt();
                    System.out.println("Qual a especialidae do Medico? ");
                    String especialidade = input.nextLine();

                    medico[numero_medicos] = new Medico(name_medico,CPF_medico,RG_medico,Dia_medico,Mes_medico,Ano_medico,especialidade);
                    numero_medicos++;

                    break;

                case 3:

                    System.out.println("Criando Consulta...");
                    System.out.println("Avaliação dos Sintomas");
                    System.out.println(""); //formulário


                    consulta[numero_consultas] = new Consultas(paciente[],medico[],vetor_formularios[numero_consultas],)
                    numero_consultas++;
                    break;

                
                default:
                    System.out.print("Função Inexistente! Tente Novamente!");
                    break;
        }
            
        }
        



            
        





    }
}
