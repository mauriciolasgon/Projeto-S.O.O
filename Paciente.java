import java.util.Scanner;

public class Paciente
{
    
    private String nome;
    private int cpf;
    private int rg;
    private int[] data_nascimento = new int[3];
    private int[] avaliacao = new int[20];

    public Paciente (String nome, int cpf, int rg, int dia, int mes, int ano)
    {
        this.nome = nome;
        this.cpf = cpf;
        this.rg = rg;
        this.data_nascimento[0] = dia;
        this.data_nascimento[1] = mes;
        this.data_nascimento[2] = ano;
    }

    void Leitura ()
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Avaliação dos Sintomas\n");
        System.out.println("Veja qual dos Sintomas se enquadra com sua situacao:\n");
        System.out.println("Sim = 1\n");
        System.out.println("Nao = 0\n");

        System.out.println("Itching: ");
        this.avaliacao[0] = input.nextInt();
        System.out.println("skin rash: ");
        this.avaliacao[1] = input.nextInt();
        System.out.println("nodal skin eruptions: ");
        this.avaliacao[2] = input.nextInt();
        System.out.println("Continuous Sneezing: ");
        this.avaliacao[3] = input.nextInt();
        System.out.println("Shivering: ");
        this.avaliacao[4] = input.nextInt();
        System.out.println("Chills: ");
        this.avaliacao[5] = input.nextInt();
        System.out.println("Joint Pain: ");
        this.avaliacao[6] = input.nextInt();
        System.out.println("Stomach Pain: ");
        this.avaliacao[7] = input.nextInt();
        System.out.println("Acidity: ");
        this.avaliacao[8] = input.nextInt();
        System.out.println("Ulcers on Tongue: ");
        this.avaliacao[9] = input.nextInt();
        System.out.println("Muscle Wasting: ");
        this.avaliacao[10] = input.nextInt();
        System.out.println("Voting: ");
        this.avaliacao[11] = input.nextInt();
        System.out.println("Burning Micturition: ");
        this.avaliacao[12] = input.nextInt();
        System.out.println("Spotting Urinations: ");
        this.avaliacao[13] = input.nextInt();
        System.out.println("Burning Micturition: ");
        this.avaliacao[14] = input.nextInt();
        System.out.println("Fatigue: ");
        this.avaliacao[15] = input.nextInt();
        System.out.println("Weight Gain: ");
        this.avaliacao[16] = input.nextInt();
        System.out.println("Anxiety: ");
        this.avaliacao[17] = input.nextInt();
        System.out.println("Cold Hands and Feets: ");
        this.avaliacao[18] = input.nextInt();
        System.out.println("Mood Swings: ");
        this.avaliacao[19] = input.nextInt();
        
    }

    public String getNome()
    {
        return nome;
    }

    



}
