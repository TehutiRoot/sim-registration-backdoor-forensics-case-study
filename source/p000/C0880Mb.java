package p000;

import com.tom_roush.pdfbox.pdmodel.common.function.type4.ExecutionContext;
import com.tom_roush.pdfbox.pdmodel.common.function.type4.Operator;
import java.util.Stack;

/* renamed from: Mb */
/* loaded from: classes5.dex */
public class C0880Mb implements Operator {
    @Override // com.tom_roush.pdfbox.pdmodel.common.function.type4.Operator
    public void execute(ExecutionContext executionContext) {
        Stack<Object> stack = executionContext.getStack();
        int intValue = ((Integer) stack.pop()).intValue();
        int intValue2 = ((Integer) stack.pop()).intValue();
        if (intValue < 0) {
            stack.push(Integer.valueOf(intValue2 >> Math.abs(intValue)));
        } else {
            stack.push(Integer.valueOf(intValue2 << intValue));
        }
    }
}
