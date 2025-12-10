package com.tom_roush.pdfbox.pdmodel.common.function;

import com.tom_roush.pdfbox.cos.COSBase;
import com.tom_roush.pdfbox.pdmodel.common.PDRange;
import com.tom_roush.pdfbox.pdmodel.common.function.type4.ExecutionContext;
import com.tom_roush.pdfbox.pdmodel.common.function.type4.InstructionSequence;
import com.tom_roush.pdfbox.pdmodel.common.function.type4.InstructionSequenceBuilder;
import com.tom_roush.pdfbox.pdmodel.common.function.type4.Operators;
import java.io.IOException;

/* loaded from: classes5.dex */
public class PDFunctionType4 extends PDFunction {

    /* renamed from: h */
    public static final Operators f60209h = new Operators();

    /* renamed from: g */
    public final InstructionSequence f60210g;

    public PDFunctionType4(COSBase cOSBase) throws IOException {
        super(cOSBase);
        this.f60210g = InstructionSequenceBuilder.parse(new String(getPDStream().toByteArray(), "ISO-8859-1"));
    }

    @Override // com.tom_roush.pdfbox.pdmodel.common.function.PDFunction
    public float[] eval(float[] fArr) throws IOException {
        ExecutionContext executionContext = new ExecutionContext(f60209h);
        for (int i = 0; i < fArr.length; i++) {
            PDRange domainForInput = getDomainForInput(i);
            executionContext.getStack().push(Float.valueOf(clipToRange(fArr[i], domainForInput.getMin(), domainForInput.getMax())));
        }
        this.f60210g.execute(executionContext);
        int numberOfOutputParameters = getNumberOfOutputParameters();
        int size = executionContext.getStack().size();
        if (size >= numberOfOutputParameters) {
            float[] fArr2 = new float[numberOfOutputParameters];
            for (int i2 = numberOfOutputParameters - 1; i2 >= 0; i2--) {
                PDRange rangeForOutput = getRangeForOutput(i2);
                float popReal = executionContext.popReal();
                fArr2[i2] = popReal;
                fArr2[i2] = clipToRange(popReal, rangeForOutput.getMin(), rangeForOutput.getMax());
            }
            return fArr2;
        }
        throw new IllegalStateException("The type 4 function returned " + size + " values but the Range entry indicates that " + numberOfOutputParameters + " values be returned.");
    }

    @Override // com.tom_roush.pdfbox.pdmodel.common.function.PDFunction
    public int getFunctionType() {
        return 4;
    }
}
