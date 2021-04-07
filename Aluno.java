public class Aluno{
    private double av1;
    private double av2;
    private double media;
    private String estado;
    private String Pnome;
    private String Mnome;
    private String Unome;
  
  
    public static int registrados = 0;
    
    public Aluno(String Pnome,String Mnome, String Unome,double av1,double av2){
      this.Pnome = Pnome;
      this.Mnome = Mnome;
      this.Unome = Unome;
      this.av1 = av1;
      this.av2 = av2;

      this.media = ((av1+av2)/2);
      if (this.media<4){
        this.estado = "Reprovado";
      } else if (this.media >= 7.0){
        this.estado = "Aprovado";
      } else{
       this.estado = "Prova final";
      }
      registrados++;
      }
  
  
    public double getav1(){
      return av1;
    }
    public double getav2(){
      return av2;
    }
    public double getmedia(){
      return media;
    }
    public String getestado(){
      return estado;
    }
    public String getPnome(){
      return Pnome;
    }
    public String getMnome(){
      return Mnome;
    }
    public String getUnome(){
      return Unome;
    }
  
    
  }
