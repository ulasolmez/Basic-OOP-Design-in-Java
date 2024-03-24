import javax.swing.JOptionPane;
/**
 * A database for keeping track of students information such as name, grades and averages.
 *
 * @ulasolmez
 * @24.03.2024
 */
public class Student
{
   private String name; private int totalScore; private int numberOfQuizzes;
   
   /** 
    * Constructor for the class Student
    * @param studentName the name of the student.
    */
   public Student(String studentName)
   {
       
      this.name = studentName;
      this.totalScore = 0;
      this.numberOfQuizzes = 0;
                        
   }
   /**
    * Adds a student's quiz score and 
    * adds each score to their total score by utilizing javax.swing.JOptionPane.
    */
   public void addQuiz(){
       
       int quiz = Integer.parseInt(JOptionPane.showInputDialog("Add quiz score: "));
       
       this.totalScore += quiz;
       this.numberOfQuizzes++;
       
   }
   /**
    * Shows the total score of a student in a Dialog box.
    */
   public void getTotalScore(){
       
       JOptionPane.showMessageDialog(null,"Total score of " + this.name + ": " + this.totalScore);
       
   }
   /**
    * Shows the average score of a student in a Dialog box.
    */
   public void getAverage(){
       
       double average = this.totalScore / this.numberOfQuizzes;
       
       JOptionPane.showMessageDialog(null,"Average of " + this.name + ": " + average);
       
   }
   
   
}
