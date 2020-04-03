public class Turma
{
   //Atributos 
   private String nome;
   private String curso;
   private int quantidadeDeAlunos;
   private int serie;
   //M�todo de construtor
   public Turma(String n, String c, int quantidadeDeAlunos, int s)
   {
      nome = n;
      curso = c;
      this.quantidadeDeAlunos = quantidadeDeAlunos;
      serie = s;
   }
   //M�todo de acesso
   public String getNome()
   {
      return nome;
   }
   public String getCurso()
   {
      return curso;
   }
   public int getQuantidadeDeAlunos()
   {
      return quantidadeDeAlunos;
   }
   public int getSerie()
   {
      return serie;
   }
   //M�todo modificador 
   public void setNome(String n)
   {
      nome = n;
   }
   public void setCurso(String c)
   {
      curso = c;
   }
   public void setQuantidadeDeAlunos(int quantidadeDeAlunos)
   {
      this.quantidadeDeAlunos = quantidadeDeAlunos;
   }
   public void setSerie(int s)
   {
      serie=s;
   }
}