package p000;

import com.tom_roush.pdfbox.pdmodel.common.function.type4.ExecutionContext;
import com.tom_roush.pdfbox.pdmodel.common.function.type4.Operator;

/* renamed from: r6 */
/* loaded from: classes5.dex */
public class C13231r6 implements Operator {
    @Override // com.tom_roush.pdfbox.pdmodel.common.function.type4.Operator
    public void execute(ExecutionContext executionContext) {
        float degrees = ((float) Math.toDegrees((float) Math.atan2(executionContext.popReal(), executionContext.popReal()))) % 360.0f;
        if (degrees < 0.0f) {
            degrees += 360.0f;
        }
        executionContext.getStack().push(Float.valueOf(degrees));
    }
}
