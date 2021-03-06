/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package isp.lab1.student;

import java.time.Duration;
import java.time.LocalDate;

/**
 *
 * @author Exile
 */
public interface IMusic {
    public String getTitle();
    public String getFormattedReleaseDate();
    public double getCost();
    public int getQuantityOnHand();
    public LocalDate getReleaseDate();
    public String getArtist();
    public void order(int quantity);
    public Duration getPlayingTime();
    public String getFormattedPlayingTime();
    public String toString();
}
