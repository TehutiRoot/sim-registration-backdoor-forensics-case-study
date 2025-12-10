package p000;

import com.tom_roush.pdfbox.pdmodel.common.function.type4.ExecutionContext;
import com.tom_roush.pdfbox.pdmodel.common.function.type4.Operator;

/* renamed from: w6 */
/* loaded from: classes5.dex */
public class C16946w6 implements Operator {
    @Override // com.tom_roush.pdfbox.pdmodel.common.function.type4.Operator
    public void execute(ExecutionContext executionContext) {
        Number popNumber = executionContext.popNumber();
        executionContext.getStack().push(Float.valueOf(executionContext.popNumber().floatValue() / popNumber.floatValue()));
    }
}
