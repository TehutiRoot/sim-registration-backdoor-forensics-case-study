package p000;

import com.tom_roush.pdfbox.pdmodel.common.function.type4.ExecutionContext;
import com.tom_roush.pdfbox.pdmodel.common.function.type4.Operator;

/* renamed from: z6 */
/* loaded from: classes5.dex */
public class C17172z6 implements Operator {
    @Override // com.tom_roush.pdfbox.pdmodel.common.function.type4.Operator
    public void execute(ExecutionContext executionContext) {
        int popInt = executionContext.popInt();
        executionContext.getStack().push(Integer.valueOf(executionContext.popInt() / popInt));
    }
}
