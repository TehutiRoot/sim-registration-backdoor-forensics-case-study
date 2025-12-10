package p000;

import com.tom_roush.pdfbox.pdmodel.common.function.type4.ExecutionContext;
import com.tom_roush.pdfbox.pdmodel.common.function.type4.Operator;

/* renamed from: G6 */
/* loaded from: classes5.dex */
public class C0431G6 implements Operator {
    @Override // com.tom_roush.pdfbox.pdmodel.common.function.type4.Operator
    public void execute(ExecutionContext executionContext) {
        executionContext.getStack().push(Float.valueOf((float) Math.sin(Math.toRadians(executionContext.popReal()))));
    }
}
