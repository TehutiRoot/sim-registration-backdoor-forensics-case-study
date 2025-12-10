package p000;

import com.tom_roush.pdfbox.pdmodel.common.function.type4.ExecutionContext;
import com.tom_roush.pdfbox.pdmodel.common.function.type4.Operator;
import java.util.Stack;

/* renamed from: Ob */
/* loaded from: classes5.dex */
public class C1012Ob implements Operator {
    @Override // com.tom_roush.pdfbox.pdmodel.common.function.type4.Operator
    public void execute(ExecutionContext executionContext) {
        Stack<Object> stack = executionContext.getStack();
        Object pop = stack.pop();
        if (pop instanceof Boolean) {
            stack.push(Boolean.valueOf(!((Boolean) pop).booleanValue()));
        } else if (pop instanceof Integer) {
            stack.push(Integer.valueOf(-((Integer) pop).intValue()));
        } else {
            throw new ClassCastException("Operand must be bool or int");
        }
    }
}