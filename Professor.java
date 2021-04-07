public class Professor {
    private String Pnome;
    private String Mnome;
    private String Unome;
  
    public static int profRegistrados = 0;
    
    public Professor(String Pnome,String Mnome, String Unome){
      this.Pnome = Pnome;
      this.Mnome = Mnome;
      this.Unome = Unome;

      profRegistrados++;
}

   public String getPnomeProf(){
       return Pnome;
   } 
   public String getMnomeProf(){
       return Mnome;
   }
   public String getUnomeProf(){
       return Unome;
   }
}
