package com.tom_roush.pdfbox.pdmodel.common.function;

import com.tom_roush.pdfbox.cos.COSArray;
import com.tom_roush.pdfbox.cos.COSBase;
import com.tom_roush.pdfbox.cos.COSName;
import com.tom_roush.pdfbox.pdmodel.common.PDRange;
import java.io.IOException;

/* loaded from: classes5.dex */
public class PDFunctionType3 extends PDFunction {

    /* renamed from: g */
    public COSArray f60204g;

    /* renamed from: h */
    public COSArray f60205h;

    /* renamed from: i */
    public COSArray f60206i;

    /* renamed from: j */
    public PDFunction[] f60207j;

    /* renamed from: k */
    public float[] f60208k;

    public PDFunctionType3(COSBase cOSBase) {
        super(cOSBase);
        this.f60204g = null;
        this.f60205h = null;
        this.f60206i = null;
        this.f60207j = null;
        this.f60208k = null;
    }

    private PDRange getEncodeForParameter(int i) {
        return new PDRange(getEncode(), i);
    }

    @Override // com.tom_roush.pdfbox.pdmodel.common.function.PDFunction
    public float[] eval(float[] fArr) throws IOException {
        PDFunction pDFunction;
        float f;
        float f2 = fArr[0];
        PDRange domainForInput = getDomainForInput(0);
        float clipToRange = clipToRange(f2, domainForInput.getMin(), domainForInput.getMax());
        if (this.f60207j == null) {
            COSArray functions = getFunctions();
            this.f60207j = new PDFunction[functions.size()];
            for (int i = 0; i < functions.size(); i++) {
                this.f60207j[i] = PDFunction.create(functions.getObject(i));
            }
        }
        PDFunction[] pDFunctionArr = this.f60207j;
        if (pDFunctionArr.length == 1) {
            pDFunction = pDFunctionArr[0];
            PDRange encodeForParameter = getEncodeForParameter(0);
            f = interpolate(clipToRange, domainForInput.getMin(), domainForInput.getMax(), encodeForParameter.getMin(), encodeForParameter.getMax());
        } else {
            if (this.f60208k == null) {
                this.f60208k = getBounds().toFloatArray();
            }
            int length = this.f60208k.length;
            float[] fArr2 = new float[length + 2];
            fArr2[0] = domainForInput.getMin();
            int i2 = length + 1;
            fArr2[i2] = domainForInput.getMax();
            System.arraycopy(this.f60208k, 0, fArr2, 1, length);
            for (int i3 = 0; i3 < i2; i3++) {
                if (clipToRange >= fArr2[i3]) {
                    int i4 = i3 + 1;
                    float f3 = fArr2[i4];
                    if (clipToRange < f3 || (i3 == length && clipToRange == f3)) {
                        pDFunction = this.f60207j[i3];
                        PDRange encodeForParameter2 = getEncodeForParameter(i3);
                        clipToRange = interpolate(clipToRange, fArr2[i3], fArr2[i4], encodeForParameter2.getMin(), encodeForParameter2.getMax());
                        break;
                    }
                }
            }
            pDFunction = null;
            if (pDFunction != null) {
                f = clipToRange;
            } else {
                throw new IOException("partition not found in type 3 function");
            }
        }
        return clipToRange(pDFunction.eval(new float[]{f}));
    }

    public COSArray getBounds() {
        if (this.f60206i == null) {
            this.f60206i = (COSArray) getCOSObject().getDictionaryObject(COSName.BOUNDS);
        }
        return this.f60206i;
    }

    public COSArray getEncode() {
        if (this.f60205h == null) {
            this.f60205h = (COSArray) getCOSObject().getDictionaryObject(COSName.ENCODE);
        }
        return this.f60205h;
    }

    @Override // com.tom_roush.pdfbox.pdmodel.common.function.PDFunction
    public int getFunctionType() {
        return 3;
    }

    public COSArray getFunctions() {
        if (this.f60204g == null) {
            this.f60204g = (COSArray) getCOSObject().getDictionaryObject(COSName.FUNCTIONS);
        }
        return this.f60204g;
    }
}
