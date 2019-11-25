package com.company.cubashare.web;

import com.company.cubashare.entity.Order;
import com.haulmont.cuba.core.global.Metadata;
import com.haulmont.cuba.core.global.TimeSource;
import com.haulmont.cuba.gui.components.Timer;
import com.haulmont.cuba.gui.model.CollectionContainer;
import com.haulmont.cuba.gui.screen.Screen;
import com.haulmont.cuba.gui.screen.Subscribe;
import com.haulmont.cuba.gui.screen.UiController;
import com.haulmont.cuba.gui.screen.UiDescriptor;

import javax.inject.Inject;
import java.math.BigDecimal;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

@UiController("cubashare_OrdersHistory")
@UiDescriptor("orders-history.xml")
public class OrdersHistory extends Screen {
    @Inject
    private Metadata metadata;
    @Inject
    private TimeSource timeSource;

    @Inject
    private CollectionContainer<Order> ordersDc;

    private Random random = new Random(42);

    private Queue<Order> itemsQueue = new LinkedList<>();

    @Subscribe
    private void onInit(InitEvent event) {
        Order initialValue = metadata.create(Order.class);
        initialValue.setAmount(new BigDecimal(random.nextInt(1000) + 100));
        initialValue.setDate(timeSource.currentTimestamp());

        ordersDc.getMutableItems().add(initialValue);
    }



    public void updateChart(Timer source) {
        /*Order orderHistory = metadata.create(Order.class);
        orderHistory.setAmount(new BigDecimal(random.nextInt(1000) + 100));
        orderHistory.setDate(timeSource.currentTimestamp());;
        ordersDc.getMutableItems().add(orderHistory);*/
        Order orderHistory = metadata.create(Order.class);
        orderHistory.setAmount(new BigDecimal(random.nextInt(1000) + 100));
        orderHistory.setDate(timeSource.currentTimestamp());;
        ordersDc.getMutableItems().add(orderHistory);

        itemsQueue.add(orderHistory);

        if (itemsQueue.size() > 10) {
            Order item = itemsQueue.poll();
            ordersDc.getMutableItems().add(item);
        }
    }
}