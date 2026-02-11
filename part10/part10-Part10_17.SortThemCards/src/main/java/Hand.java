
import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.Collectors;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author harry
 */
public class Hand implements Comparable<Hand> {
    
    private ArrayList<Card> cards;
    
    public Hand() {
        cards = new ArrayList<>();
    }
    
    public void add(Card card) {
        cards.add(card);
    }
    
    public ArrayList<Card> getCards() {
        return cards;
    }
    
    public void print() {
        cards.stream()
                .forEach(card -> {System.out.println(card);});
    }
    
    public void sort() {
        Collections.sort(cards);
    }
    
    public void sortBySuit() {
        Collections.sort(cards, new BySuitInValueOrder());
    }

    @Override
    public int compareTo(Hand hand) {
        int handOne = 0;
        for (Card card: cards) {
            handOne += card.getValue();
        }
        
        int handTwo = 0;
        for (Card card: hand.getCards()) {
            handTwo += card.getValue();
        }
        
        return handOne - handTwo;
    }
    
}
