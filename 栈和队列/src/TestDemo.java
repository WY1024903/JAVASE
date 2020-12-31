import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: Administrator
 * Date: 2020-12-31
 * Time: 17:14
 */
class Card{
    public int rank;
    public String suit;

    public Card(int rank, String suit) {
        this.rank = rank;
        this.suit = suit;
    }

    @Override
    public String toString() {
        return "Card{" +
                "rank=" + rank +
                ", suit='" + suit + '\'' +
                '}';
    }
}
class CardDemo{
    public String[] suits = {"红桃","方片","黑桃","梅花"};
    public List<Card> buyDeck(){
        List<Card> cards = new ArrayList<>();
        for(int i = 0 ;i<4;i++){
            for(int j=1;j<=13;j++){
             String suit = suits[i];
             int rank = j;
             Card card = new Card(rank,suit);
             cards.add(card);
            }
        }
        return cards;
    }
    public void swap(List<Card> cards,int i,int j){
        Card tmp = cards.get(i);
        Card card = cards.get(j);
        cards.set(i,card);
        cards.set(j,tmp);
    }
    public void shuffle(List<Card> cards){
        Random random = new Random();
        int size = cards.size();
        for(int i=size-1;i>0;i--){
            int j = random.nextInt(i);
            swap(cards,i,j);
        }
    }
}

public class TestDemo {
    public static void main(String[] args) {
        CardDemo cardDemo = new CardDemo();
        List<Card> cardList = cardDemo.buyDeck();
        System.out.println(cardList);
        System.out.println("=======shuffle=====");
        cardDemo.shuffle(cardList);
        System.out.println(cardList);
        System.out.println("=========揭牌==========");
        List<List<Card>> hands = new ArrayList<>();
        List<Card> hands1 = new ArrayList<>();
        List<Card> hands2 = new ArrayList<>();
        List<Card> hands3 = new ArrayList<>();
        hands.add(hands1);
        hands.add(hands2);
        hands.add(hands3);
        for(int i=0;i<5;i++){
            for(int j=0;j<3;j++){
               Card cardTmp = cardList.remove(0);
               hands.get(j).add(cardTmp);
            }
        }
        System.out.println("第一个人"+hands1);
        System.out.println("第二个人"+hands2);
        System.out.println("第三个人"+hands3);
        System.out.println("剩余的牌");
        System.out.println(cardList);
    }

}
