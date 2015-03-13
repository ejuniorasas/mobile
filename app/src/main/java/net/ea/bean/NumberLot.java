package net.ea.bean;

import java.util.List;

/**
 * Created by ac-ejunior on 3/13/15.
 */
public class NumberLot {
    private int key;
    private List<ResultLot> result;

    public int getKey() {
        return key;
    }

    public void setKey(int key) {
        this.key = key;
    }

    public List<ResultLot> getResult() {
        return result;
    }

    public void setResult(List<ResultLot> result) {
        this.result = result;
    }
}
