package marcin;

import static org.junit.jupiter.api.Assertions.*;

class IslandTest {

    @org.junit.jupiter.api.Test
    void crawlShouldMarkIsland() {
        //given
        Board board=new Board();
        board.fromStringBoard(IslandBoards.ISLAND_TEST_1);
        //when
        new Island().crawl(board,1,7,5);
        //then
        assertEquals(5,board.getBoardMark(1,7));
    }

    @org.junit.jupiter.api.Test
    void crawlShouldCountIslands() {
        //given
        Board board=new Board();
        board.fromStringBoard(IslandBoards.SMALL_ISLAND_2);

        Island island=new Island();

        int islandNum=2;
        int islandCount=0;
        for(int i=0;i<board.getWidth(); i++){
            for(int j=0; j<board.getHeight(); j++){
                if(island.crawl(board,i,j,islandNum++)>1) islandCount++;
            }
        }
        assertEquals(2,islandCount);
    }
}