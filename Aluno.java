public class Aluno{
   private String nome;
   private int id;
   
   public Aluno(String nome, int id){
      this.nome = nome;
      this.id = id;
   }
   
   public Aluno(){
      this.nome = "";
      this.id = -1;
   }
   
   public String getNome(){
      return this.nome;
   }
   
   public int getId(){
      return this.id;
   }
   
   public void setId(int id){
      this.id = id;
   }
   
   public void setNome(String nome){
      this.nome = nome;
   }
   
   
}
   