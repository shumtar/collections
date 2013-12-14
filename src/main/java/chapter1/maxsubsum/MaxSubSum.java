package chapter1.maxsubsum;

public class MaxSubSum {
    public SubSumDataUnit takeSum(int a[]) {

        if (a == null || a.length == 0) throw new IllegalArgumentException();

        int maxSum = 0;
        int start = 0;
        int end = 0;

        for (int i = 0; i < a.length; i++) {
            for (int j = i; j < a.length; j++) {
                int thisSum = 0;
                for (int k = i; k < j; k++) {
                    thisSum += a[k];
                    if (maxSum < thisSum) {
                        maxSum = thisSum;
                        start = i;
                        end = k;
                    }
                }
            }
        }
        return new SubSumDataUnit(start, end, maxSum);
    }

    public int takeSumInt(int a[]) {

        if (a == null || a.length == 0) throw new IllegalArgumentException();

        int maxSum = 0;

        for (int i = 0; i < a.length; i++) {
            for (int j = i; j < a.length; j++) {
                int thisSum = 0;
                for (int k = i; k < j; k++) {
                    thisSum += a[k];
                    if (maxSum < thisSum) {
                        maxSum = thisSum;
                    }
                }
            }
        }
        return maxSum;
    }

    public int takeSumInt2(int a[]) {

        if (a == null || a.length == 0) throw new IllegalArgumentException();

        int maxSum = 0;

        for (int i = 0; i < a.length; i++) {
            int thisSum = 0;
            for (int j = i; j < a.length; j++) {
                thisSum += a[j];
                if (maxSum < thisSum) {
                    maxSum = thisSum;
                }
            }
        }
        return maxSum;
    }

    public int takeSumInt3(int a[]) {
        return tekeStum3(0, a.length - 1, a);

    }

    private int tekeStum3(int left, int right, int[] a) {
        if (left == right) {
            if (a[left] > 0) {
                return a[left];
            } else {
                return 0;
            }
        }

        int center = (left - right) / 2;
        int maxLeftSum=tekeStum3(left,center,a);
        int maxRightSum=tekeStum3(center+1,right,a);

        int maxLeftBorderSum=0;
        int leftBorderSum=0;
        for (int i = center; i >= left; i--) {
            leftBorderSum+=a[i];
            if(leftBorderSum>maxLeftBorderSum){
                maxLeftBorderSum=leftBorderSum;
            }
        }



        int maxRightBorderSum=0;
        int rightBorderSum=0;
        for (int i = center+1; i <= right; i++) {
            rightBorderSum+=a[i];
            if(rightBorderSum>maxRightBorderSum){
                maxRightBorderSum=rightBorderSum;
            }
        }


        return 0;
    }


}
