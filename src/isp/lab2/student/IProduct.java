package isp.lab2.student;

import java.time.Duration;
import java.time.LocalDate;

public interface IProduct {

    public String getTitle();
    
    public double getCost();

    public int getQuantityOnHand();

    public LocalDate getReleaseDate();

    public void order(int quantity);

    public String getFormattedReleaseDate();
    
    public String toString();

}
