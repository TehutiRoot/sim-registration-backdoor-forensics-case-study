package p000;

import com.tom_roush.pdfbox.pdmodel.common.function.type4.ExecutionContext;
import com.tom_roush.pdfbox.pdmodel.common.function.type4.Operator;
import java.util.Stack;

/* renamed from: Qv1  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC18380Qv1 implements Operator {
    public AbstractC18380Qv1() {
    }

    /* renamed from: a */
    public abstract boolean mo65847a(Number number, Number number2);

    @Override // com.tom_roush.pdfbox.pdmodel.common.function.type4.Operator
    public void execute(ExecutionContext executionContext) {
        Stack<Object> stack = executionContext.getStack();
        stack.push(Boolean.valueOf(mo65847a((Number) stack.pop(), (Number) stack.pop())));
    }
}