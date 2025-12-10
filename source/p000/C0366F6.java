package p000;

import com.tom_roush.pdfbox.pdmodel.common.function.type4.ExecutionContext;
import com.tom_roush.pdfbox.pdmodel.common.function.type4.Operator;

/* renamed from: F6 */
/* loaded from: classes5.dex */
public class C0366F6 implements Operator {
    @Override // com.tom_roush.pdfbox.pdmodel.common.function.type4.Operator
    public void execute(ExecutionContext executionContext) {
        Number popNumber = executionContext.popNumber();
        if (popNumber instanceof Integer) {
            executionContext.getStack().push(Integer.valueOf(popNumber.intValue()));
        } else {
            executionContext.getStack().push(Float.valueOf((float) Math.round(popNumber.doubleValue())));
        }
    }
}
