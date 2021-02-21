package Task2;

public class MyMatrix implements Sumabil {

    private final Integer[][] matrix;

    public MyMatrix(Integer[][] matrix) {
        this.matrix = matrix;
    }

    @Override
    public void addValue(Sumabil value) {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                this.matrix[i][j] += ((MyMatrix) value).matrix[i][j];
            }
        }
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();

        for (int i = 0; i < 4; ++i) {
            for (int j = 0; j < 4; ++j) {
                str.append(matrix[i][j]).append(" ");
            }
            str.append("\n");
        }

        return str.substring(0, str.length() - 1);
    }
}
