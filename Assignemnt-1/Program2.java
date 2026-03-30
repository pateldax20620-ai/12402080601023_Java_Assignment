import java.util.Scanner;

class Matrix {
    int rows, cols;
    int[][] mat;

    // Constructor
    Matrix(int r, int c) {
        rows = r;
        cols = c;
        mat = new int[rows][cols];
    }

    // Input matrix
    void input(Scanner sc) {
        System.out.println("Enter matrix elements:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                mat[i][j] = sc.nextInt();
            }
        }
    }

    // Display matrix
    void display() {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
    }

    // Transpose
    void transpose() {
        System.out.println("Transpose Matrix:");
        for (int i = 0; i < cols; i++) {
            for (int j = 0; j < rows; j++) {
                System.out.print(mat[j][i] + " ");
            }
            System.out.println();
        }
    }

    // Multiplication
    static Matrix multiply(Matrix m1, Matrix m2) {
        Matrix result = new Matrix(m1.rows, m2.cols);

        for (int i = 0; i < m1.rows; i++) {
            for (int j = 0; j < m2.cols; j++) {
                for (int k = 0; k < m1.cols; k++) {
                    result.mat[i][j] += m1.mat[i][k] * m2.mat[k][j];
                }
            }
        }
        return result;
    }
}

public class Program2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter rows and columns of Matrix 1: ");
        int r1 = sc.nextInt();
        int c1 = sc.nextInt();

        Matrix m1 = new Matrix(r1, c1);
        m1.input(sc);

        System.out.print("Enter rows and columns of Matrix 2: ");
        int r2 = sc.nextInt();
        int c2 = sc.nextInt();

        Matrix m2 = new Matrix(r2, c2);
        m2.input(sc);

        System.out.println("Matrix 1:");
        m1.display();

        System.out.println("Matrix 2:");
        m2.display();

        System.out.println("Transpose of Matrix 1:");
        m1.transpose();

        if (c1 == r2) {
            Matrix result = Matrix.multiply(m1, m2);
            System.out.println("Multiplication Result:");
            result.display();
        } else {
            System.out.println("Matrix multiplication not possible");
        }

        sc.close();
    }
}