package marcin;

import java.util.HashMap;
import java.util.Map;

public class Island {
    public static void main(String[]args){
        new Island().start();
    }

    public void start(){
        Board board=new Board();
        board.fromStringBoard(IslandBoards.SMALL_ISLAND_2);

        int islandNum=2;
        int islandCount=0;

        for(int i=0;i<board.getWidth(); i++){
            for(int j=0; j<board.getHeight(); j++){
                if(crawl(board,i,j,islandNum++)>1) islandCount++;
            }
        }
        System.out.println("liczba wysp:"+islandCount);
    }

    int crawl(Board board,int i, int j,int mark){
        if(i>=board.getWidth()||j>=board.getHeight()) return 0;
        if(i<0||j<0) return 0;
        if(board.getBoardMark(i,j)!=1) return 0;

        board.setBoardMark(i,j,mark);

        return crawl(board,i-1,j,mark)
                +crawl(board,i+1,j,mark)
                +crawl(board,i,j-1,mark)
                +crawl(board,i,j+1,mark)+1;
    }
}
