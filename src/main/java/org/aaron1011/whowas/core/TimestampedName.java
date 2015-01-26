package org.aaron1011.whowas.core;

import java.util.Date;

public class TimestampedName {

    private String name;

    private Date changedToAt;

    public TimestampedName() {
    }

    public TimestampedName(String name, Date changedToAt) {
        this.name = name;
        this.changedToAt = changedToAt;
    }

    @Override
    public String toString() {
        return "TimestampedName{" +
                "name='" + name + '\'' +
                ", changedToAt=" + changedToAt +
                '}';
    }

    public Date getChangedToAt() {
        return changedToAt;
    }

    public void setChangedToAt(Date changedToAt) {
        this.changedToAt = changedToAt;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
