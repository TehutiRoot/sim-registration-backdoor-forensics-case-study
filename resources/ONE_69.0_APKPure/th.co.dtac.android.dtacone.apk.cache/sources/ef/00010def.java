package p000;

import com.tom_roush.pdfbox.pdmodel.common.function.type4.ExecutionContext;
import com.tom_roush.pdfbox.pdmodel.common.function.type4.Operator;

/* renamed from: t6 */
/* loaded from: classes5.dex */
public class C13960t6 implements Operator {
    @Override // com.tom_roush.pdfbox.pdmodel.common.function.type4.Operator
    public void execute(ExecutionContext executionContext) {
        executionContext.getStack().push(Float.valueOf((float) Math.cos(Math.toRadians(executionContext.popReal()))));
    }
}