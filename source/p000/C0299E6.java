package p000;

import com.tom_roush.pdfbox.pdmodel.common.function.type4.ExecutionContext;
import com.tom_roush.pdfbox.pdmodel.common.function.type4.Operator;

/* renamed from: E6 */
/* loaded from: classes5.dex */
public class C0299E6 implements Operator {
    @Override // com.tom_roush.pdfbox.pdmodel.common.function.type4.Operator
    public void execute(ExecutionContext executionContext) {
        Number popNumber = executionContext.popNumber();
        if (popNumber instanceof Integer) {
            if (popNumber.intValue() == Integer.MIN_VALUE) {
                executionContext.getStack().push(Float.valueOf(-popNumber.floatValue()));
                return;
            } else {
                executionContext.getStack().push(Integer.valueOf(-popNumber.intValue()));
                return;
            }
        }
        executionContext.getStack().push(Float.valueOf(-popNumber.floatValue()));
    }
}
