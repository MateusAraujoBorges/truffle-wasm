package com.borges.mateus.wasm.nodes;

import com.oracle.truffle.api.frame.VirtualFrame;
import com.oracle.truffle.api.nodes.Node;

public abstract class WasmNode extends Node {

    public abstract int executeInt(VirtualFrame frame);
}
