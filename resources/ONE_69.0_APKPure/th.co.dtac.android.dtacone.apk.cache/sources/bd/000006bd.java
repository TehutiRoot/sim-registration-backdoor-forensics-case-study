package p000;

import com.tom_roush.pdfbox.pdmodel.common.function.type4.ExecutionContext;
import com.tom_roush.pdfbox.pdmodel.common.function.type4.Operator;

/* renamed from: H6 */
/* loaded from: classes5.dex */
public class C0496H6 implements Operator {
    @Override // com.tom_roush.pdfbox.pdmodel.common.function.type4.Operator
    public void execute(ExecutionContext executionContext) {
        float popReal = executionContext.popReal();
        if (popReal >= 0.0f) {
            executionContext.getStack().push(Float.valueOf((float) Math.sqrt(popReal)));
            return;
        }
        throw new IllegalArgumentException("argument must be nonnegative");
    }
}