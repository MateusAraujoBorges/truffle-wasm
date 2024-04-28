package com.borges.mateus.wasm.nodes;

public abstract class IntegerBinaryOperationNode extends WasmNode {

    @Child
    private IntegerConstantNode left;
    @Child
    private IntegerConstantNode right;

    public IntegerBinaryOperationNode(IntegerConstantNode left, IntegerConstantNode right) {
        this.left = left;
        this.right = right;
    }

    public IntegerConstantNode getLeft() {
        return left;
    }

    public void setLeft(IntegerConstantNode left) {
        this.left = left;
    }

    public IntegerConstantNode getRight() {
        return right;
    }

    public void setRight(IntegerConstantNode right) {
        this.right = right;
    }
}
