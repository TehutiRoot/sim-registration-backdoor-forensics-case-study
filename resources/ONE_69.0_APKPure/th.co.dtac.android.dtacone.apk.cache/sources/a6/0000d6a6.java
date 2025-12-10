package p000;

import com.tom_roush.pdfbox.pdmodel.common.function.type4.ExecutionContext;
import com.tom_roush.pdfbox.pdmodel.common.function.type4.InstructionSequence;
import com.tom_roush.pdfbox.pdmodel.common.function.type4.Operator;
import java.util.Stack;

/* renamed from: iw */
/* loaded from: classes5.dex */
public class C11485iw implements Operator {
    @Override // com.tom_roush.pdfbox.pdmodel.common.function.type4.Operator
    public void execute(ExecutionContext executionContext) {
        Stack<Object> stack = executionContext.getStack();
        InstructionSequence instructionSequence = (InstructionSequence) stack.pop();
        if (((Boolean) stack.pop()).booleanValue()) {
            instructionSequence.execute(executionContext);
        }
    }
}