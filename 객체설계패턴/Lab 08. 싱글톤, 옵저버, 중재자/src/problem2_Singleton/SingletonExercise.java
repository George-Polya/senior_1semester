package problem2_Singleton;

import java.util.*;
// 2016112158 김희수

/**
 * 변경 부분은 Deck 클래스에 private static으로 Deck 객체 deck를 선언
 * 그리고 Deck 클래스의 생성자를 private로 선언
 * 마지막으로 deck을 리턴하는 getter인 getDeck()을 static으로 선언
 * 이 때 synchronized를 이용해 다중스레드일때도 문제가 없도록 함(double checked locking)
 */

class Deck {
    private static Deck deck;
    private Deck( ) {
        cards = new ArrayList<Card>( );

        // build the deck
        Suit[] suits = {Suit.SPADES, Suit.HEARTS, Suit.CLUBS, Suit.DIAMONDS};
        for(Suit suit: suits) {
            for(int i = 2; i <= 14; i++) {
                cards.add(new Card(suit, i));
            }
        }

        // shuffle it!
        Collections.shuffle(cards, new Random( ));
    }

    public void print( ) {
        for(Card card: cards) {
            card.print( );
        }
    }

    public static Deck getDeck(){
        if(deck == null){
            synchronized (Deck.class) { // double checked locking
                deck = new Deck();
            }
        }
        return deck;
    }

    private List<Card> cards;
}

enum Suit {
    SPADES,
    HEARTS,
    CLUBS,
    DIAMONDS
}

class Card {
    public Card(Suit s, int n) {
        suit = s;
        if((n < 2) || (n > 14)) {
            throw new IllegalArgumentException( );
        }
        number = n;
    }

    public void print( ) {
        switch(number) {
            case 11:
                System.out.print("Jack");
                break;
            case 12:
                System.out.print("Queen");
                break;
            case 13:
                System.out.print("King");
                break;
            case 14:
                System.out.print("Ace");
                break;
            default:
                System.out.print(number);
                break;
        }
        System.out.print(" of ");
        switch(suit) {
            case SPADES:
                System.out.println("spades.");
                break;
            case HEARTS:
                System.out.println("hearts.");
                break;
            case CLUBS:
                System.out.println("clubs.");
                break;
            case DIAMONDS:
                System.out.println("diamonds.");
                break;
        }
    }

    private Suit suit;
    private int number;
}



public class SingletonExercise {
    public static void main(String[] args) {
        Deck deck = Deck.getDeck();
        deck.print();
    }
}