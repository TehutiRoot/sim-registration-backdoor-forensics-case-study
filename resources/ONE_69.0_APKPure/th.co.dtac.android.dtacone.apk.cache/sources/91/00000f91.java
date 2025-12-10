package p000;

import com.tom_roush.pdfbox.pdmodel.common.function.type4.ExecutionContext;
import com.tom_roush.pdfbox.pdmodel.common.function.type4.Operator;
import java.util.ArrayList;
import java.util.Stack;

/* renamed from: QL1 */
/* loaded from: classes5.dex */
public class QL1 implements Operator {
    @Override // com.tom_roush.pdfbox.pdmodel.common.function.type4.Operator
    public void execute(ExecutionContext executionContext) {
        Stack<Object> stack = executionContext.getStack();
        int intValue = ((Number) stack.pop()).intValue();
        if (intValue > 0) {
            int size = stack.size();
            stack.addAll(new ArrayList(stack.subList(size - intValue, size)));
        }
    }
}