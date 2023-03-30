package Object;

import Game.Location;

import java.awt.*;
import java.util.ArrayList;

public class Card {
    int number;
    String name;
    int worth;
    String description;
    Location location; //Question: 转换牌堆应该在Game里还是在Card里？card里的location是用来定位牌堆位置。
    public Card(String name,int worth,int number,Location location){
        this.name=name;
        this.worth=worth;
        this.number=number;
        this.location=location;
    }
    public class ActionCard extends Card{

        public ActionCard(String name, int worth,int number,Location location) {
            super(name, worth,number, location);
        }
        //不同类别的机会卡有不同的功能。机会卡能够使用的前提是位置在手牌且有行动点。


    }
    public class PropertyCard extends Card{
        Color color;//Question: 双面的卡有两种设计方法 第一种是所有的卡都有两个颜色，非双面卡两种颜色相同。第二种是区分单面卡双面卡
        int fullNumber;
        int buildNumber;
        boolean isFull;
        Player belongTo;
        int addValue;//有些功能卡可以让满套房子涨价
        int rent;
        public PropertyCard(String name, int worth, int number,Location location) {
            super(name, worth,number, location);
        }
        //盖房子，交易。
    }
    public class MoneyCard extends Card{

        public MoneyCard(String name, int worth,int number, Location location) {
            super(name, worth,number, location);
        }
    }//交易

}
