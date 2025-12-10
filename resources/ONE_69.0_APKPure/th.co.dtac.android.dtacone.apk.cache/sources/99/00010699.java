package p000;

import com.tom_roush.pdfbox.pdmodel.common.function.type4.ExecutionContext;
import com.tom_roush.pdfbox.pdmodel.common.function.type4.Operator;

/* renamed from: q6 */
/* loaded from: classes5.dex */
public class C13162q6 implements Operator {
    @Override // com.tom_roush.pdfbox.pdmodel.common.function.type4.Operator
    public void execute(ExecutionContext executionContext) {
        Number popNumber = executionContext.popNumber();
        Number popNumber2 = executionContext.popNumber();
        if ((popNumber2 instanceof Integer) && (popNumber instanceof Integer)) {
            long longValue = popNumber2.longValue() + popNumber.longValue();
            if (longValue >= -2147483648L && longValue <= 2147483647L) {
                executionContext.getStack().push(Integer.valueOf((int) longValue));
                return;
            } else {
                executionContext.getStack().push(Float.valueOf((float) longValue));
                return;
            }
        }
        executionContext.getStack().push(Float.valueOf(popNumber2.floatValue() + popNumber.floatValue()));
    }
}