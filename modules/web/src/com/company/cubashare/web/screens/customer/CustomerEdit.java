package com.company.cubashare.web.screens.customer;

import com.haulmont.cuba.gui.screen.*;
import com.company.cubashare.entity.Customer;

@UiController("cubashare_Customer.edit")
@UiDescriptor("customer-edit.xml")
@EditedEntityContainer("customerDc")
@LoadDataBeforeShow
public class CustomerEdit extends StandardEditor<Customer> {
}