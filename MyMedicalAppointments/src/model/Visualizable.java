package model;

import java.io.Serializable;

public interface Visualizable extends  IReadable, Serializable {
    public void setViewed();
    public Boolean isViewed();
    public String timeViewed();

    @Override
    default void read() {

    }
}
