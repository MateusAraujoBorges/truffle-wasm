package com.borges.mateus.wasm.nodes;

import com.oracle.truffle.api.frame.VirtualFrame;

public class IntegerConstantNode extends WasmNode {

    private final boolean signed;
    private final int value;

    public IntegerConstantNode(int value, boolean signed) {
        this.value = value;
        this.signed = signed;
    }

    @Override
    public int executeInt(VirtualFrame frame) {
        return value; //TODO deal with signedness
    }
}
