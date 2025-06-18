package org.example;

public enum DayEnum {
    SUNDAY(true), MONDAY(false),
    TUESDAY(false), WEDNESDAY(false), THURSDAY(false),
    FRIDAY(false), SATURDAY(true);

    final boolean weekend;

    /**
     * Must be private
     * @param weekend Weekend Flag
     */
    DayEnum(boolean weekend) {
        this.weekend = weekend;
    }

    public String description() {
        return this.name() + " weekend: " + weekend;
    }
}
