package p000;

import com.tom_roush.pdfbox.pdmodel.common.function.type4.ExecutionContext;
import com.tom_roush.pdfbox.pdmodel.common.function.type4.Operator;
import java.util.Stack;

/* renamed from: Rv1  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C18445Rv1 implements Operator {
    /* renamed from: a */
    public boolean mo65644a(Object obj, Object obj2) {
        if ((obj instanceof Number) && (obj2 instanceof Number)) {
            if (((Number) obj).floatValue() == ((Number) obj2).floatValue()) {
                return true;
            }
            return false;
        }
        return obj.equals(obj2);
    }

    @Override // com.tom_roush.pdfbox.pdmodel.common.function.type4.Operator
    public void execute(ExecutionContext executionContext) {
        Stack<Object> stack = executionContext.getStack();
        stack.push(Boolean.valueOf(mo65644a(stack.pop(), stack.pop())));
    }
}