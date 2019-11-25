package com.company.cubashare.web.screens.customer;

import com.haulmont.cuba.gui.screen.*;
import com.company.cubashare.entity.Customer;

@UiController("cubashare_Customer.browse")
@UiDescriptor("customer-browse.xml")
@LookupComponent("customersTable")
@LoadDataBeforeShow
public class CustomerBrowse extends StandardLookup<Customer> {
}