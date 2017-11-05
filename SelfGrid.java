package danil;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.net.*;
import java.util.*;
import java.util.List;

import danil.PlayerData;
import danil.BattleGrid;

/**
 * @author Danil Kolesnikov danil.kolesnikov@sjsu.edu
 * @author Minh Phan minh.phan@sjsu.edu
 * CS 151 HW4 Fall 2017
 */

/**
 Represents the player's own grid
 */
public class SelfGrid extends BattleGrid {
    private boolean isSelfGridListener;
    private String name;
    private Point firstPoint = new Point(0,0);
    private BattleShip battleShip;
    private JPanel thePanel = null;

    public SelfGrid(String name,BattleShip battleShip) {
        super();
        this.name = name;
        this.battleShip = battleShip;
    }

    public void getJpanel(Point newPoint){
        thePanel = this.getComponentAt(newPoint);
    }

    @Override
    protected JPanel getCell()
    {

        JPanel firstCell = new JPanel();
        firstCell.setBackground(Color.black);
        firstCell.setBorder(BorderFactory.createLineBorder(Color.blue, 2));
        firstCell.setPreferredSize(new Dimension(20, 20)); // for demo purposes only

        firstCell.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if(isSelfGridListener) {
                    firstPoint = firstCell.getLocation(); //location of the first cell that was clicked

                    //We get x,y coordinates of the first cell
                    double xPos = (firstPoint.getX()/20+1);
                    double yPos = (firstPoint.getY()/20+1);
                    int x = (int) xPos;
                    int y = (int) yPos;

                    //We get x,y coordinates of the next second cell from the first
                    double xPos2 = (firstPoint.getX()/20+2);
                    double yPos2 = (firstPoint.getY()/20+1);
                    int x2 = (int) xPos2;
                    int y2 = (int) yPos2;

                    //We get x,y coordinates of the next third cell from the first
                    double xPos3 = (firstPoint.getX()/20+3);
                    double yPos3 = (firstPoint.getY()/20+1);
                    int x3 = (int) xPos3;
                    int y3 = (int) yPos3;

                    //We use those 3 cells location to create coordinate objects
                    Coordinate a = new Coordinate(x,y);
                    Coordinate b = new Coordinate(x2,y2);
                    Coordinate c = new Coordinate(x3,y3);

                    if(name.equals("Player1")){
                        battleShip.getPlayer1Data().addShip(a,b,c);
                        draw();
                    }
                    if(name.equals("Player2")){
                        battleShip.getPlayer2Data().addShip(a,b,c);
                        draw();
                    }
                }
            }
        });
        return firstCell;
    }

    //method to draw GUI based on data
    public void draw(){
        int[][] temp=null;

        if(name.equals("Player1")){
            temp = battleShip.getPlayer1Data().getSelfData();
        }

        else if(name.equals("Player2")){
            temp = battleShip.getPlayer2Data().getSelfData();
        }

        for (int i = 0; i < 11; i++) {
            for (int j = 0; j < 11; j++)
            {
                if(temp[i][j]==1){
                    int x = numberToPanel(i);
                    int y = numberToPanel(j);
                    Point p = new Point(x,y);
                    getJpanel(p);
                    thePanel.setBackground(Color.CYAN); // if the data is 1 draw the cell with CYAN color
                }
                else if(temp[i][j]==0){
                    int x = numberToPanel(i);
                    int y = numberToPanel(j);
                    Point p = new Point(Math.abs(x),Math.abs(y)); // if the data is 1 draw the cell with black color
                    getJpanel(p);
                    thePanel.setBackground(Color.black);
                }
            }
        }
    }

    public void setSelfGridListener (boolean selfGridListener){
        this.isSelfGridListener = selfGridListener;
    }

    public int numberToPanel(int s){
        int temp = (s-1)*20;
        return temp;
    }

}