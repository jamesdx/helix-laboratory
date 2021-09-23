package org.helix.laboratory.designpattern.structual.adapter;

import java.time.LocalDate;

public class BasicAdapterAdapter implements BasicAdapterTarget{
    private BasicAdapterAdaptee basicAdapterAdaptee = new BasicAdapterAdaptee();
    @Override
    public String request() {
        return this.basicAdapterAdaptee.specialRequest(LocalDate.now()).toString();
    }
}
