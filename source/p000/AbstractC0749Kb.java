package p000;

import com.tom_roush.pdfbox.pdmodel.common.function.type4.ExecutionContext;
import com.tom_roush.pdfbox.pdmodel.common.function.type4.Operator;
import java.util.Stack;

/* renamed from: Kb */
/* loaded from: classes5.dex */
public abstract class AbstractC0749Kb implements Operator {
    public AbstractC0749Kb() {
    }

    /* renamed from: a */
    public abstract boolean mo66441a(boolean z, boolean z2);

    /* renamed from: b */
    public abstract int mo66440b(int i, int i2);

    @Override // com.tom_roush.pdfbox.pdmodel.common.function.type4.Operator
    public void execute(ExecutionContext executionContext) {
        Stack<Object> stack = executionContext.getStack();
        Object pop = stack.pop();
        Object pop2 = stack.pop();
        if ((pop2 instanceof Boolean) && (pop instanceof Boolean)) {
            stack.push(Boolean.valueOf(mo66441a(((Boolean) pop2).booleanValue(), ((Boolean) pop).booleanValue())));
        } else if ((pop2 instanceof Integer) && (pop instanceof Integer)) {
            stack.push(Integer.valueOf(mo66440b(((Integer) pop2).intValue(), ((Integer) pop).intValue())));
        } else {
            throw new ClassCastException("Operands must be bool/bool or int/int");
        }
    }
}
