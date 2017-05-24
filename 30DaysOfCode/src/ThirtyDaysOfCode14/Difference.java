package ThirtyDaysOfCode14; /**
 * Created by kiyomizumia on 2017/05/24.
 */

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


class Difference {
    private int[] elements;
    public int maximumDifference;

    // Add your code here
    Difference(int[] array) {
        this.elements = array;
    }

    public int computeDifference() {
        int min = this.elements[0];
        int max = this.elements[0];


        for (int i = 0; i < this.elements.length; i++) {
            if (this.elements[i] > max)
                max = this.elements[i];
            if (this.elements[i] < min)
                min = this.elements[i];
        }
        this.maximumDifference = max - min;
        return Math.abs(this.maximumDifference);
    }
}