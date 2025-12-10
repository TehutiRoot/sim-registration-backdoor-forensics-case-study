package com.tom_roush.pdfbox.pdmodel.common.function.type4;

import java.util.Stack;

/* loaded from: classes5.dex */
public class ExecutionContext {

    /* renamed from: a */
    public final Operators f60223a;

    /* renamed from: b */
    public final Stack f60224b = new Stack();

    public ExecutionContext(Operators operators) {
        this.f60223a = operators;
    }

    public Operators getOperators() {
        return this.f60223a;
    }

    public Stack<Object> getStack() {
        return this.f60224b;
    }

    public int popInt() {
        return ((Integer) this.f60224b.pop()).intValue();
    }

    public Number popNumber() {
        return (Number) this.f60224b.pop();
    }

    public float popReal() {
        return ((Number) this.f60224b.pop()).floatValue();
    }
}