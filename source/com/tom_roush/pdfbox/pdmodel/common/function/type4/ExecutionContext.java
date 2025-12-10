package com.tom_roush.pdfbox.pdmodel.common.function.type4;

import java.util.Stack;

/* loaded from: classes5.dex */
public class ExecutionContext {

    /* renamed from: a */
    public final Operators f60211a;

    /* renamed from: b */
    public final Stack f60212b = new Stack();

    public ExecutionContext(Operators operators) {
        this.f60211a = operators;
    }

    public Operators getOperators() {
        return this.f60211a;
    }

    public Stack<Object> getStack() {
        return this.f60212b;
    }

    public int popInt() {
        return ((Integer) this.f60212b.pop()).intValue();
    }

    public Number popNumber() {
        return (Number) this.f60212b.pop();
    }

    public float popReal() {
        return ((Number) this.f60212b.pop()).floatValue();
    }
}
