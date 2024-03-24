import javax.swing.JOptionPane;
/**
 * A class that keeps track of population and breeding of roaches.
 *
 * @ulasolmez
 * @24.03.2024
 */
public class RoachPopulation 
{
    
    private double population;
    /**
     * Constructor for the RoachPopulation class.
     * @param startPopulation the initial population of the roaches.
     */
    public RoachPopulation(int startPopulation){
        
        this.population = startPopulation;
        
    }
    /**
     * Doubles the roach population.
     */
    public void breed(){
        
        this.population = this.population*2;
        
    }
    /**
     * Reduces the roach population to a certain percentage.
     * @param percent the percentage of how much the population should be reduced.
     */
    public void spray(double percent){
        
        this.population = this.population * ((100 - percent)/100);
        
    }
    /**
     * Shows the population of roaches in a Dialog box.
     */
    public void getRoach(){
        
        JOptionPane.showMessageDialog(null,"Population of roaches " + this.population);
        
    }

}
