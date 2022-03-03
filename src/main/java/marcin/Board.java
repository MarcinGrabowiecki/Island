package marcin;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Board {

    private int[][] arrayBoard;

    public void fromStringBoard(String b){
        String[] lines = b.split("\n");
        int[][] islandArray = new int[lines.length][lines[0].length()];
        for(int i=0; i<islandArray.length; i++){
            for(int j=0; j<islandArray[0].length; j++){
                if(lines[i].charAt(j)=='0') islandArray[i][j]=0;
                if(lines[i].charAt(j)=='1') islandArray[i][j]=1;
            }
        }
        this.arrayBoard = islandArray;
    }

    public int getWidth(){
        return arrayBoard.length;
    };

    public int getHeight(){
        return arrayBoard[0].length;
    };

    public int getBoardMark(int x,int y){
        return arrayBoard[x][y];
    }

    public void setBoardMark(int x,int y, int val){
        arrayBoard[x][y]=val;
    }

    public void printMe(){
        for(int i=0; i<this.getWidth(); i++){
            for(int j=0; j<this.getHeight(); j++){
                System.out.print(this.getBoardMark(i,j));
            }
            System.out.println();
        }
    }

}
