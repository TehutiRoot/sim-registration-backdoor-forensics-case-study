package p000;

import com.tom_roush.pdfbox.pdmodel.common.function.type4.ExecutionContext;
import com.tom_roush.pdfbox.pdmodel.common.function.type4.Operator;
import java.util.LinkedList;
import java.util.Stack;

/* renamed from: YK1 */
/* loaded from: classes5.dex */
public class YK1 implements Operator {
    @Override // com.tom_roush.pdfbox.pdmodel.common.function.type4.Operator
    public void execute(ExecutionContext executionContext) {
        Stack<Object> stack = executionContext.getStack();
        int intValue = ((Number) stack.pop()).intValue();
        int intValue2 = ((Number) stack.pop()).intValue();
        if (intValue == 0) {
            return;
        }
        if (intValue2 >= 0) {
            LinkedList linkedList = new LinkedList();
            LinkedList linkedList2 = new LinkedList();
            int i = 0;
            if (intValue < 0) {
                int i2 = intValue2 + intValue;
                while (i < i2) {
                    linkedList2.addFirst(stack.pop());
                    i++;
                }
                while (intValue < 0) {
                    linkedList.addFirst(stack.pop());
                    intValue++;
                }
                stack.addAll(linkedList2);
                stack.addAll(linkedList);
                return;
            }
            int i3 = intValue2 - intValue;
            while (intValue > 0) {
                linkedList.addFirst(stack.pop());
                intValue--;
            }
            while (i < i3) {
                linkedList2.addFirst(stack.pop());
                i++;
            }
            stack.addAll(linkedList);
            stack.addAll(linkedList2);
            return;
        }
        throw new IllegalArgumentException("rangecheck: " + intValue2);
    }
}
