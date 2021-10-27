package com.banjo.how2code.sparseArray;

import java.util.Arrays;

import com.banjo.how2code.sparseArray.SparseArray;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class SparseArrayTest {

    @Autowired
    private SparseArray sparseArray;

    @Test
    public void sparseArrayToArray(){

        int[][] chessArr = new int[11][11];
        // 首先创建一个二维数组, 创建一个11列11行的二维数组
        chessArr[1][2] = 1;
        chessArr[5][7] = 1;
        chessArr[2][3] = 2;
        chessArr[4][5] = 2;

        int[][] arr = sparseArray.SparseArrayToArray();
        System.out.println(Arrays.deepToString(arr));
    }

    @Test
    public void ArrayToSparseArray() {

    }
}
