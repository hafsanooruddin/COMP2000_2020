
import java.awt.*;


class Grid{
    //fields




    //constructors
public Grid(){

}

public void paint(Graphics g){
    for(int i = 10; i<710; i+=35){
        for(int j = 10; i<710;i+=35){
        g.setColor(Color.WHITE);
    g.fillRect(i,j,35,35);
    g.setColor(Color.BLACK);
    g.drawRect(i,j,35,35);
}






















    }




}}


