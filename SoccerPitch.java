import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Line2D;
import java.awt.geom.Ellipse2D;
import java.awt.Color;
import javax.swing.JComponent;


public class SoccerPitch extends JComponent{
    public void paintComponent(Graphics g){
        
        // Recover Graphics2D
        Graphics2D g2 = (Graphics2D) g;
        g2.setColor(Color.GREEN);
        
        Rectangle box = new Rectangle(50, 50, 900, 450);
        g2.fill(box);

        g2.setColor(Color.WHITE);
        
        Ellipse2D.Double circle = new Ellipse2D.Double(425, 200, 150, 150);
        g2.draw(circle);
        
        Line2D.Double halfwayline = new Line2D.Double(500, 50, 500, 500);
        g2.draw(halfwayline);


        Line2D.Double goalarea_topline = new Line2D.Double(50, 200, 120, 200);
        g2.draw(goalarea_topline);
        Line2D.Double goalarea_rightline = new Line2D.Double(120, 200, 120, 350);
        g2.draw(goalarea_rightline);
        Line2D.Double goalarea_bottomline = new Line2D.Double(50, 350, 120, 350);
        g2.draw(goalarea_bottomline);

        Line2D.Double penaltyarea_top = new Line2D.Double(50, 150, 200, 150);
        g2.draw(penaltyarea_top);
        Line2D.Double penaltyarea_right = new Line2D.Double(200, 150, 200, 400);
        g2.draw(penaltyarea_right);
        Line2D.Double penaltyarea_bottom = new Line2D.Double(50, 400, 200, 400);
        g2.draw(penaltyarea_bottom);

        // student part, write your codes below this line
        Line2D.Double other_goalarea_topline = new Line2D.Double(880, 200, 950, 200);
        g2.draw(other_goalarea_topline);
        Line2D.Double other_goalarea_rightline = new Line2D.Double(880, 200, 880, 350);
        g2.draw(other_goalarea_rightline);
        Line2D.Double other_goalarea_bottomline = new Line2D.Double(880, 350, 950, 350);
        g2.draw(other_goalarea_bottomline);

        Line2D.Double other_penaltyarea_top = new Line2D.Double(800, 150, 950, 150);
        g2.draw(other_penaltyarea_top);
        Line2D.Double other_penaltyarea_right = new Line2D.Double(800, 150, 800, 400);
        g2.draw(other_penaltyarea_right);
        Line2D.Double other_penaltyarea_bottom = new Line2D.Double(800, 400, 950, 400);
        g2.draw(other_penaltyarea_bottom);
        
        
        
        
    }
}
