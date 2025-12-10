package p000;

import com.tom_roush.pdfbox.pdmodel.common.function.type4.ExecutionContext;
import com.tom_roush.pdfbox.pdmodel.common.function.type4.Operator;

/* renamed from: A6 */
/* loaded from: classes5.dex */
public class C0009A6 implements Operator {
    @Override // com.tom_roush.pdfbox.pdmodel.common.function.type4.Operator
    public void execute(ExecutionContext executionContext) {
        executionContext.getStack().push(Float.valueOf((float) Math.log(executionContext.popNumber().doubleValue())));
    }
}
