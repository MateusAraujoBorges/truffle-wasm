package com.borges.mateus.wasm.sanity;

import com.borges.mateus.wasm.nodes.IntegerConstantNode;
import com.borges.mateus.wasm.nodes.WasmRootNode;
import com.borges.mateus.wasm.nodes.ibo.IntegerAdditionNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AddingTwoIntegersTest {

    @Test
    public void onePlusTwoShouldEqualsThree() {
        var sum = new IntegerAdditionNode(
                new IntegerConstantNode(1, true),
                new IntegerConstantNode(2, true)
        );
        var root = new WasmRootNode(sum);
        var callTarget =root.getCallTarget();
        var result = callTarget.call();
        assertEquals(3, result, "1 + 2 should be 3");
    }
}
