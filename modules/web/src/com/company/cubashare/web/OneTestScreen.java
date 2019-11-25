package com.company.cubashare.web;

// import com.haulmont.charts.gui.amcharts.model.charts.PieChart;
import com.haulmont.charts.gui.components.charts.PieChart;
import com.haulmont.charts.gui.data.MapDataItem;
import com.haulmont.cuba.gui.screen.Screen;
import com.haulmont.cuba.gui.screen.Subscribe;
import com.haulmont.cuba.gui.screen.UiController;
import com.haulmont.cuba.gui.screen.UiDescriptor;

import javax.inject.Inject;
import java.util.ArrayList;

@UiController("cubashare_OneTestScreen")
@UiDescriptor("new-screen.xml")
public class OneTestScreen extends Screen {
    @Inject
    private PieChart pieChart;

    @Subscribe
    private void onBeforeShow(BeforeShowEvent event) {
        pieChart.addData(MapDataItem.of("key", "piece of apple pie",
                "value", 70),
                MapDataItem.of("key", "piece of blueberry pie",
                        "value", 20),
                MapDataItem.of("key", "piece of cherry pie",
                        "value", 10));
    }
}