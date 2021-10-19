package com.banjo.how2code.dataStructure;

import java.util.Arrays;

import org.springframework.stereotype.Component;

/**
 * 稀疏数组，当一个二维数组大部分的值都为0的时候，就可以使用稀疏数组对其进行压缩
 * */

@Component
public class SparseArray {


    public static void main(String[] args) {
        SparseArray sparseArray = new SparseArray();
        // 稀疏数组压缩
        int[][] dd = sparseArray.SparseArrayToArray();
        // 还原稀疏数组
        int[][] des = sparseArray.arrayToSparseArray();
        System.out.print(Arrays.deepToString(des));
    }

    public int[][] createSparseArray() {

        int[][] chessArr = new int[11][11];
        // 首先创建一个二维数组, 创建一个11列11行的二维数组
        chessArr[1][2] = 1;
        chessArr[5][7] = 1;
        chessArr[2][3] = 2;
        chessArr[4][5] = 2;

        return chessArr;
    }

    
    public int[][] SparseArrayToArray(){
        int[][] chessArr1 = createSparseArray();
        // 先将二维数组，展开为一维数组
        int[] chessArr = Arrays.stream(chessArr1).
        flatMapToInt(x->Arrays.stream(x)).toArray();
        // 计算有效数字
        int total = (int) Arrays.stream(chessArr).filter(x->(x!=0)).count();

        // 创建一个新的二维数组 用来接收有效数字在稀疏数组中的位置信息
        int[][] arr = new int[total+1][3];
        // 新建的二维数组，第一条数据用来存储稀疏数组的长度，和有效数字
        arr[0][0] = 11;
        arr[0][1] = 11;
        arr[0][2] = total;
        int count = 1;
        for (int i = 0; i < chessArr1.length; i++) {
            for (int j = 0; j < chessArr1.length; j++) {
                if(chessArr1[i][j] != 0) {
                    arr[count][0] = i;
                    arr[count][1] = j;
                    arr[count][2] = chessArr1[i][j];
                    count++;
                }
            }
        }
        return arr;
    }

    public int[][] arrayToSparseArray() {
        int[][] arr = SparseArrayToArray();
        // arr数组里面的第一条数据就是稀疏数组的大小数据
        int[][] sparseArray = new int[arr[0][0]][arr[0][1]];

        for (int i = 1; i < arr.length; i++) {
            int x = arr[i][0];
            int y = arr[i][1];
            sparseArray[x][y] = arr[1][2];
        }

        return sparseArray;
    }
}
