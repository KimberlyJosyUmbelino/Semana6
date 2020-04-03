import javax.swing.JOptionPane;
public class TesteTurma
{
   public static void main(String[]args)
   {
   //Leitura de dados
   String nome = JOptionPane.showInputDialog("Digite nome: ");
   String curso = JOptionPane.showInputDialog("Digite o curso: ");
   String sQuantidadeDeAlunos = JOptionPane.showInputDialog("Digite a quantidade de alunos: ");
   String sSerie = JOptionPane.showInputDialog("Digite a serie: ");
   //Convertendo para inteiro
   int quantidadeDeAlunos =  Integer.parseInt(sQuantidadeDeAlunos);
   int serie = Integer.parseInt(sSerie);
   //Criar objeto
   Turma turma = new Turma(nome, curso, quantidadeDeAlunos, serie);
   //Montagem de String de saida chamando o metodos de acesso do aluno
   String msg = "Nome:" + turma.getNome() + "\nCurso:" + turma.getCurso() + "\nDigite a quantidade de alunos:" + turma.getQuantidadeDeAlunos() + "\nSerie:" + turma.getSerie();
   //Mostra o aluno
   JOptionPane.showMessageDialog(null,msg);
   //Altera informaçãoes 
   nome = JOptionPane.showInputDialog("Digite nome: ");
   curso = JOptionPane.showInputDialog("Digite o curso: ");
   sQuantidadeDeAlunos = JOptionPane.showInputDialog("Digite a quantidade de alunos: ");
   sSerie = JOptionPane.showInputDialog("Digite a serie: ");
   //convertendo de novo
   quantidadeDeAlunos =  Integer.parseInt(sQuantidadeDeAlunos);
   serie = Integer.parseInt(sSerie);
   //use metodo modificador para mudar
   turma.setNome(nome);
   turma.setCurso(curso);
   turma.setQuantidadeDeAlunos(quantidadeDeAlunos);
   turma.setSerie(serie);
   //Mostra de novo a saida de acesso do aluno
   msg = "Nome: " + turma.getNome() + "\nCurso: " + turma.getCurso() + "\nQuantidade de alunos: " + turma.getQuantidadeDeAlunos() + "\nSerie: " + turma.getSerie();
   //Mostre a turma
   JOptionPane.showMessageDialog(null,msg,"Resultado",JOptionPane.PLAIN_MESSAGE);
   } 
}