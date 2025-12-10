package p000;

import com.tom_roush.pdfbox.pdmodel.common.function.type4.ExecutionContext;
import com.tom_roush.pdfbox.pdmodel.common.function.type4.Operator;
import java.util.Stack;

/* renamed from: Tu1  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC18530Tu1 implements Operator {
    public AbstractC18530Tu1() {
    }

    /* renamed from: a */
    public abstract boolean mo65286a(Number number, Number number2);

    @Override // com.tom_roush.pdfbox.pdmodel.common.function.type4.Operator
    public void execute(ExecutionContext executionContext) {
        Stack<Object> stack = executionContext.getStack();
        stack.push(Boolean.valueOf(mo65286a((Number) stack.pop(), (Number) stack.pop())));
    }
}
