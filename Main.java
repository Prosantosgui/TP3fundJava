 *
 * @author Gui
 */
import java.util.Scanner;
import java.text.MessageFormat;
import java.util.InputMismatchException;

class Main {
    public static void main(String[] args){
    Aluno[] TotalAlunos = new Aluno[100];
    Professor[] TotalProfs = new Professor[100];

    Scanner read = new Scanner(System.in);
    Scanner s = new Scanner(System.in);

    int option = 0;
    while(option<4){
      System.out.println("|-------Seja bem-vindo ao portal de notas-------|");
      System.out.println("|---------O que deseja fazer?---------|");
      System.out.println("[1] Registrar um novo aluno");
      System.out.println("[2] Consultar um aluno já registrado");
      System.out.println("[3] Consultar notas da turma");
      System.out.println("[4] Sair do sistema");
          
        int option1 = read.nextInt();

      switch (option1){
        case 1:
        if(Aluno.registrados <100 ){
         int i = Aluno.registrados; 

        System.out.println("Diga o nome completo do aluno:");
        String takenome = s.nextLine();

        System.out.println("Diga a nota AV1 do aluno:");
        double takeav1 = read.nextDouble();

        System.out.println("Diga a nota AV2 do aluno:");
        double takeav2 = read.nextDouble();
        System.out.println("\n");

        System.out.println("Diga o nome do professor responsável:");
        String takeProfname = s.nextLine();
        
          String[] takeProfnomes = takeProfname.split(" ",3);
          String[] takeNomes = takenome.split(" ",3);   
  

        TotalProfs[i] = new Professor(takeProfnomes[0], takeProfnomes[1], takeProfnomes[2]); 
        TotalAlunos[i] = new Aluno(takeNomes[0],takeNomes[1],takeNomes[2], takeav1 ,takeav2);
        System.out.println("O aluno(a) foi registrado(a) com as seguintes informações:");
        System.out.println("Nome completo:"+(takenome));
        System.out.println(takeNomes[0]);
        System.out.println(takeNomes[1]);
        System.out.println(takeNomes[2]);  
        System.out.println("Nota AV1:"+(takeav1));
        System.out.println("Nota AV2:"+(takeav2));
        System.out.println("ID:" +(Aluno.registrados));
        System.out.println("\n");
        
        
      }else{
      System.out.println("O número total de alunos registrados no sistema foi atingido, não será possível adicionar mais um aluno no momento!");
      }
      break;

        case 2:
        System.out.println("Insira o código ID gerado no cadastro do aluno:");
        
        int id1 = read.nextInt();

        StringBuilder sb0 = new StringBuilder();
        sb0.append(" " +TotalProfs[id1-1].getPnomeProf());
        sb0.append(" " +TotalProfs[id1-1].getMnomeProf());
        sb0.append(" " +TotalProfs[id1-1].getUnomeProf());

        StringBuilder sb1 = new StringBuilder();
        sb1.append(" " +TotalAlunos[id1-1].getPnome());
        sb1.append(" " +TotalAlunos[id1-1].getMnome());
        sb1.append(" " +TotalAlunos[id1-1].getUnome());

        try{
          int id = id1;
        String nomeAluno = sb1.toString();
        double av1 = TotalAlunos[id-1].getav1();
        double av2 = TotalAlunos[id-1].getav2();
        double media = TotalAlunos[id-1].getmedia();
        String estado = TotalAlunos[id-1].getestado();
        String nomeProf = sb0.toString(); 

        System.out.println("Nome: " +nomeAluno);
        System.out.println("Nota AV1: " +av1);
        System.out.println("Nota AV2: " +av2);
        System.out.println("Média final: " +media);
        System.out.println("Estado atual:" +estado);
        System.out.println("Nome do professor responsável" +nomeProf);
        System.out.println("\n");
        }
      catch(NullPointerException a){
      throw new NullPointerException("O id informado não existe no sistema");
    } catch(InputMismatchException VariableDeclaratorId){
      throw new InputMismatchException("Insira um número inteiro invés de um string");
    } finally{
      System.out.println("Resposta obtida após consulta do ID inserido!");
      System.out.println("\n");
    }
        

        break;

        case 3:

        for (int i = 0; i < Aluno.registrados; i++){
          StringBuilder sb2 = new StringBuilder();
          sb2.append(" " +TotalAlunos[i].getPnome());
          sb2.append(" " +TotalAlunos[i].getMnome());
          sb2.append(" " +TotalAlunos[i].getUnome());

          StringBuilder sb3 = new StringBuilder();
          sb3.append(" " +TotalProfs[i].getPnomeProf());
          sb3.append(" " +TotalProfs[i].getMnomeProf());
          sb3.append(" " +TotalProfs[i].getUnomeProf());

        System.out.println(MessageFormat.format("Nome do aluno: {0} | AV1: {1} | AV2: {2} | Média: {3} | Estado: {4} | Professor Responsável: {5}", sb2.toString(), TotalAlunos[i].getav1(), TotalAlunos[i].getav2(), TotalAlunos[i].getmedia(), TotalAlunos[i].getestado(), sb3.toString() ));
        System.out.println("\n");
        }
        break;
        case 4:
        System.out.println("Sessão encerrada!");
        System.exit(0); 
        break;
    }
    
    }
    read.close();
    s.close();
    }
    
}
