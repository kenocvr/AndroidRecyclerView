package com.rucker.carlos.recyclerviewtutorial;

/**
 * Created by Carlos on 12/9/2017.
 */

public class ListItem {
    private String head;
    private String desc;

    // Constructor
    public ListItem(String head, String desc) {
        this.head = head;
        this.desc = desc;
    }

    // Getters
    public String getHead() {
        return head;
    }
    public String getDesc() {
        return desc;
    }
}
