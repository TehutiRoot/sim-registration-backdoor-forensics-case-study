package com.tom_roush.pdfbox.pdmodel.common.function.type4;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/* loaded from: classes5.dex */
public class InstructionSequence {

    /* renamed from: a */
    public final List f60213a = new ArrayList();

    public void addBoolean(boolean z) {
        this.f60213a.add(Boolean.valueOf(z));
    }

    public void addInteger(int i) {
        this.f60213a.add(Integer.valueOf(i));
    }

    public void addName(String str) {
        this.f60213a.add(str);
    }

    public void addProc(InstructionSequence instructionSequence) {
        this.f60213a.add(instructionSequence);
    }

    public void addReal(float f) {
        this.f60213a.add(Float.valueOf(f));
    }

    public void execute(ExecutionContext executionContext) {
        Stack<Object> stack = executionContext.getStack();
        for (Object obj : this.f60213a) {
            if (obj instanceof String) {
                String str = (String) obj;
                Operator operator = executionContext.getOperators().getOperator(str);
                if (operator != null) {
                    operator.execute(executionContext);
                } else {
                    throw new UnsupportedOperationException("Unknown operator or name: " + str);
                }
            } else {
                stack.push(obj);
            }
        }
        while (!stack.isEmpty() && (stack.peek() instanceof InstructionSequence)) {
            ((InstructionSequence) stack.pop()).execute(executionContext);
        }
    }
}
