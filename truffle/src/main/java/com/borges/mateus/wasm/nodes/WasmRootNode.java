package com.borges.mateus.wasm.nodes;

import com.oracle.truffle.api.frame.VirtualFrame;
import com.oracle.truffle.api.nodes.RootNode;

public class WasmRootNode extends RootNode {

    @Child
    private WasmNode body;

    public WasmRootNode(WasmNode body) {
        super(null);
        this.body = body;
    }

    @Override
    public Object execute(VirtualFrame frame) {
        return this.body.executeInt(frame);
    }
}
