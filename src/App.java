import java.time.LocalDate;

import br.edu.ifpi.Aluno;
import br.edu.ifpi.Curso;
import br.edu.ifpi.Professor;
public class App {
    public static void main(String[] args) throws Exception {
        Aluno a1 = new Aluno("carolyne",LocalDate.of(2002,3,17),"carolyne_ka@hotmail.com");
        a1.setNomeA("carolaine");
        Professor p1 = new  Professor("Lucas", "lucal@hotmail.com", "mestre em engenharia de software");;
        Curso c1 = new Curso("ADS", 2000, "online","superior",LocalDate.of(2022,3,14),LocalDate.of(2025,3,29), p1);
        

        System.out.println("Nome do aluno: " + a1.getNomeA() );
        System.out.println("Data de nascimento do aluno: " + a1.getDataNascimento());
        System.out.println ("Email do aluno: " + a1.getEmailA());
        System.out.println ("Nome do professor: " + p1.getNomeP());
        System.out.println("Nome do curso: " + c1.getNomeC());
        System.out.println("Carga horaria do curso: " + c1.getCargaHoraria());
        System.out.println("Modalidade do curso: " + c1.getModalidade());
        System.out.println("Nivel do curso: " + c1.getNivel());
        System.out.println("Data de inicio do curso: " + c1.getDataInicio());
        System.out.println("Data do fim do curso: " + c1.getDataFim());
        System.out.println("Certificamos que a aluna, " + a1.getNomeA() + " que nasceu em " + a1.getDataNascimento());
        System.out.println("Cujo o seu endereço de email é, " + a1.getEmailA() + " concluiu o curso de  " + c1.getNomeC() + " com carga horia de " +  c1.getCargaHoraria());
        System.out.println("Na modaliadde " + c1.getModalidade() + " graduacao do nivel " + c1.getNivel());
        System.out.println("No qual teve inicio em  " + c1.getDataInicio() + " e teve fim " + c1.getDataFim());
        System.out.println("Que teve como professor mestre " + p1.getNomeP());

    }
}