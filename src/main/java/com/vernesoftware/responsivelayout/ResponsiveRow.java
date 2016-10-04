package com.vernesoftware.responsivelayout;

import com.vaadin.ui.Alignment;
import com.vaadin.ui.CssLayout;
import com.vaadin.ui.VerticalLayout;


/**
 * Created by JarekToro on 9/23/16.
 */
public class ResponsiveRow extends CssLayout {


    public ResponsiveRow() {


        setPrimaryStyleName("row");
        setWidthUndefined();


        VerticalLayout verticalLayout = new VerticalLayout();
    }


    public void setExpandRatio(ResponsiveColumn responsiveColumn, ResponsiveColumn.DisplaySize displaySize, int width) {
        if (components.contains(responsiveColumn)) {
            responsiveColumn.addRule(displaySize, width);
        }
    }


    public void addColumn(ResponsiveColumn col) {

        //add ResponsiveColumn to Component List then recalulates the margin and spacing to match

        addComponent(col);

    }


    public void setMargin(boolean margin) {


        if (margin) {
            addStyleName("margin");
        } else {
            removeStyleName("margin");
        }


    }

    public void setVerticalSpacing(boolean verticalSpacing) {


        if (verticalSpacing) {
            addStyleName("v-col-spacing");
        } else {
            removeStyleName("v-col-spacing");
        }

    }

    public void setHorizontalSpacing(boolean horizontalSpacing) {


        if (horizontalSpacing) {
            addStyleName("h-col-spacing");
        } else {
            removeStyleName("h-col-spacing");
        }


    }

    public void setDefaultComponentAlignment(Alignment defaultAlignment) {


        //Makes use of the Alignment Property Vaadin already made and converts it to the Css Style Name

        removeStyleName("top-xs middle-xs bottom-xs start-xs center-xs end-xs");

        if (defaultAlignment.equals(Alignment.BOTTOM_LEFT)) {

            addStyleName("bottom-xs start-xs");

        } else if (defaultAlignment.equals(Alignment.BOTTOM_CENTER)) {

            addStyleName("bottom-xs center-xs");

        } else if (defaultAlignment.equals(Alignment.BOTTOM_RIGHT)) {

            addStyleName("bottom-xs end-xs");

        } else if (defaultAlignment.equals(Alignment.TOP_LEFT)) {

            addStyleName("top-xs start-xs");

        } else if (defaultAlignment.equals(Alignment.TOP_CENTER)) {

            addStyleName("top-xs center-xs");

        } else if (defaultAlignment.equals(Alignment.TOP_RIGHT)) {

            addStyleName("top-xs end-xs");

        } else if (defaultAlignment.equals(Alignment.MIDDLE_LEFT)) {

            addStyleName("middle-xs start-xs");

        } else if (defaultAlignment.equals(Alignment.MIDDLE_CENTER)) {

            addStyleName("middle-xs center-xs");

        } else if (defaultAlignment.equals(Alignment.MIDDLE_RIGHT)) {

            addStyleName("middle-xs end-xs");

        }


    }

}
