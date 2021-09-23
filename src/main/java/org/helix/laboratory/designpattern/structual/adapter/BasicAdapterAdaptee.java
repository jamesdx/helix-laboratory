package org.helix.laboratory.designpattern.structual.adapter;

import java.time.LocalDate;

public class BasicAdapterAdaptee {
    public Integer specialRequest(LocalDate calculatedLocalDate){
       return calculatedLocalDate.getDayOfYear();
    }
}
