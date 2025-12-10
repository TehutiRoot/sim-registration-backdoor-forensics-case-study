package p000;

import com.tom_roush.pdfbox.pdmodel.common.function.type4.ExecutionContext;
import com.tom_roush.pdfbox.pdmodel.common.function.type4.Operator;
import java.util.Stack;

/* renamed from: TL1 */
/* loaded from: classes5.dex */
public class TL1 implements Operator {
    @Override // com.tom_roush.pdfbox.pdmodel.common.function.type4.Operator
    public void execute(ExecutionContext executionContext) {
        Stack<Object> stack = executionContext.getStack();
        int intValue = ((Number) stack.pop()).intValue();
        if (intValue >= 0) {
            stack.push(stack.get((stack.size() - intValue) - 1));
            return;
        }
        throw new IllegalArgumentException("rangecheck: " + intValue);
    }
}