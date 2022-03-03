package marcin;

public class StringBoadToIslandArray {

    public static int[][] gennerate(String b){

        String[] lines = b.split("\n");
        int[][] islandArray = new int[lines.length][lines[0].length()];
        for(int i=0; i<islandArray.length; i++){
            for(int j=0; j<islandArray[0].length; j++){
                if(lines[i].charAt(j)=='0') islandArray[i][j]=0;
                if(lines[i].charAt(j)=='1') islandArray[i][j]=1;
            }
        }
        return islandArray;
    }
}
