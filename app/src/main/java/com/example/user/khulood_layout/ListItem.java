package com.example.user.khulood_layout;

/**
 * Created by USER on 2/27/2017.
 */

public class ListItem {

    private String placeName;
    private String placeDesc;

    /*  generat constructore for both variables*/

    public ListItem(String placeName, String placeDesc) {
        this.placeName = placeName;
        this.placeDesc = placeDesc;
    }
    /*  generat getter for both */

    public String getPlaceName() {
        return placeName;
    }

    public String getPlaceDesc() {
        return placeDesc;
    }
}
