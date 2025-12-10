package p000;

import com.tom_roush.pdfbox.pdmodel.common.function.type4.ExecutionContext;
import com.tom_roush.pdfbox.pdmodel.common.function.type4.Operator;
import java.util.Stack;

/* renamed from: I6 */
/* loaded from: classes5.dex */
public class C0575I6 implements Operator {
    @Override // com.tom_roush.pdfbox.pdmodel.common.function.type4.Operator
    public void execute(ExecutionContext executionContext) {
        Stack<Object> stack = executionContext.getStack();
        Number popNumber = executionContext.popNumber();
        Number popNumber2 = executionContext.popNumber();
        if ((popNumber2 instanceof Integer) && (popNumber instanceof Integer)) {
            long longValue = popNumber2.longValue() - popNumber.longValue();
            if (longValue >= -2147483648L && longValue <= 2147483647L) {
                stack.push(Integer.valueOf((int) longValue));
                return;
            } else {
                stack.push(Float.valueOf((float) longValue));
                return;
            }
        }
        stack.push(Float.valueOf(popNumber2.floatValue() - popNumber.floatValue()));
    }
}
