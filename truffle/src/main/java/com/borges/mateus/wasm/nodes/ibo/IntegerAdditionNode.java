package com.borges.mateus.wasm.nodes.ibo;

import com.borges.mateus.wasm.nodes.IntegerConstantNode;
import com.borges.mateus.wasm.nodes.IntegerBinaryOperationNode;
import com.oracle.truffle.api.frame.VirtualFrame;

public class IntegerAdditionNode extends IntegerBinaryOperationNode {

    public IntegerAdditionNode(IntegerConstantNode left, IntegerConstantNode right) {
        super(left, right);
    }

    @Override
    public int executeInt(VirtualFrame frame) {
        int left = getLeft().executeInt(frame);
        int right = getRight().executeInt(frame);
        return left + right;
    }
}
