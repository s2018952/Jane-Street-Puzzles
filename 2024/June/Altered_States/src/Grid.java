import java.util.ArrayList;

public class Grid {
    private String gridString;
    private int rowNum;
    private int colNum;
    private ArrayList<ArrayList<Character>> grid;
    private ArrayList<String> statesList;

    public Grid(String gridString, int rowNum, int colNum) {
        this.gridString = gridString;
        this.rowNum = rowNum;
        this.colNum = colNum;
        this.grid = createGrid();
        statesList = new ArrayList<>();
    }

    private ArrayList<ArrayList<Character>> createGrid() {
        ArrayList<ArrayList<Character>> gridPattern = new ArrayList<>();
        for (int i = 0; i < rowNum; i++) {
            ArrayList<Character> row = new ArrayList<>();
            for (int j = 0; j < colNum; j++) {
                row.add(gridString.charAt(i*colNum + j));
            }
            gridPattern.add(row);
        }
        return gridPattern;
    }

    private void findStatesInGrid() {
        //TODO
    }

    public ArrayList<String> getStatesList() {
        return statesList;
    }
}
