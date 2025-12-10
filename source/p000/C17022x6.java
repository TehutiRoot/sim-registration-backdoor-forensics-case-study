package p000;

import com.tom_roush.pdfbox.pdmodel.common.function.type4.ExecutionContext;
import com.tom_roush.pdfbox.pdmodel.common.function.type4.Operator;

/* renamed from: x6 */
/* loaded from: classes5.dex */
public class C17022x6 implements Operator {
    @Override // com.tom_roush.pdfbox.pdmodel.common.function.type4.Operator
    public void execute(ExecutionContext executionContext) {
        executionContext.getStack().push(Float.valueOf((float) Math.pow(executionContext.popNumber().doubleValue(), executionContext.popNumber().doubleValue())));
    }
}
