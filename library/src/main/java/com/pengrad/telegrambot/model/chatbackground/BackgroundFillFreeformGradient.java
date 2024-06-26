package com.pengrad.telegrambot.model.chatbackground;

import java.util.Arrays;

public class BackgroundFillFreeformGradient extends BackgroundType {

    public static final String TYPE = "freeform_gradient";

    private Integer[] colors;

    public BackgroundFillFreeformGradient(Integer... colors) {
        super(TYPE);
        this.colors = colors;
    }

    public Integer[] colors() {
        return colors;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BackgroundFillFreeformGradient that = (BackgroundFillFreeformGradient) o;
        return Arrays.equals(colors, that.colors);
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(colors);
    }

    @Override
    public String toString() {
        return "BackgroundFillFreeformGradient{" +
            "type='" + type() + '\'' +
            ", colors=" + Arrays.asList(colors) + 
            '}';
    }
}
