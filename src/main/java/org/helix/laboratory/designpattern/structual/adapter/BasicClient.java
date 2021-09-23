package org.helix.laboratory.designpattern.structual.adapter;

public class BasicClient {
    public static void main(String[] args) {
        BasicAdapterTarget basicAdapterTarget = new BasicAdapterAdapter();
        System.out.printf("The Result is "+ basicAdapterTarget.request());
    }
}
