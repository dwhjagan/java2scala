package valtecex;

import java.util.List;

public class KSubsequenceNew implements Subsequence {
    public void SubsequenceImpl() {
    }

    //@Override
    public boolean find(List x, List y) {
        int count = 0;
        int marker = 0;
        for (int i = 0; i < x.size(); i++) {
            if (count < i) {
                break;
            } else {
                for (int j = marker; j < y.size(); j++) {
                    if (x.get(i).equals(y.get(j))) {

                        count++;
                        marker = j++;
                        break;
                    }
                }
            }
        }
        return x.size() == count ? true : false;
    }
}