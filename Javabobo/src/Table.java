public class Table {
    private int row;
    private int col;
    private int[][] data;

    public Table(int row, int col) {
        this.row = row;
        this.col = col;
        this.data = new int[row][col];
    }

    public int getValue(int row, int col) {
        return this.data[row][col];
    }

    public void setValue(int row, int col, int value) {
        this.data[row][col] = value;
    }

    public int getRow() {
        return row;
    }

    public int getCol() {
        return col;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                sb.append(data[i][j]).append(" ");
            }
            sb.append("\n");
        }
        return sb.toString();
    }

    public double average() {
        int sum = 0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                sum += data[i][j];
            }
        }
        return (double) sum / (row * col);
    }
}
