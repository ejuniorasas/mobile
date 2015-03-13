package net.ea.bean;

import java.util.Date;
import java.util.List;

/**
 * Created by ac-ejunior on 3/13/15.
 */
public class ResultLot {
    private long concurso;
    private Date dataLot;
    private List<NumberLot> result;
    private int countWinSena;
    private int countWinQui;
    private int countWinQua;

    public long getConcurso() {
        return concurso;
    }

    public void setConcurso(long concurso) {
        this.concurso = concurso;
    }

    public Date getDataLot() {
        return dataLot;
    }

    public void setDataLot(Date dataLot) {
        this.dataLot = dataLot;
    }

    public List<NumberLot> getResult() {
        return result;
    }

    public void setResult(List<NumberLot> result) {
        this.result = result;
    }

    public int getCountWinSena() {
        return countWinSena;
    }

    public void setCountWinSena(int countWinSena) {
        this.countWinSena = countWinSena;
    }

    public int getCountWinQui() {
        return countWinQui;
    }

    public void setCountWinQui(int countWinQui) {
        this.countWinQui = countWinQui;
    }

    public int getCountWinQua() {
        return countWinQua;
    }

    public void setCountWinQua(int countWinQua) {
        this.countWinQua = countWinQua;
    }
}
