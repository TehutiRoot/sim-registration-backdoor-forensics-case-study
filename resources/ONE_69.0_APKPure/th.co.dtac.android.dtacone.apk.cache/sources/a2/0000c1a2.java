package com.tom_roush.pdfbox.pdmodel.common.function;

import com.tom_roush.pdfbox.cos.COSArray;
import com.tom_roush.pdfbox.cos.COSBase;
import com.tom_roush.pdfbox.cos.COSDictionary;
import com.tom_roush.pdfbox.cos.COSName;
import com.tom_roush.pdfbox.cos.COSObject;
import com.tom_roush.pdfbox.cos.COSStream;
import com.tom_roush.pdfbox.pdmodel.common.COSObjectable;
import com.tom_roush.pdfbox.pdmodel.common.PDRange;
import com.tom_roush.pdfbox.pdmodel.common.PDStream;
import java.io.IOException;

/* loaded from: classes5.dex */
public abstract class PDFunction implements COSObjectable {

    /* renamed from: a */
    public PDStream f60197a;

    /* renamed from: b */
    public COSDictionary f60198b;

    /* renamed from: c */
    public COSArray f60199c = null;

    /* renamed from: d */
    public COSArray f60200d = null;

    /* renamed from: e */
    public int f60201e = -1;

    /* renamed from: f */
    public int f60202f = -1;

    public PDFunction(COSBase cOSBase) {
        this.f60197a = null;
        this.f60198b = null;
        if (cOSBase instanceof COSStream) {
            PDStream pDStream = new PDStream((COSStream) cOSBase);
            this.f60197a = pDStream;
            pDStream.getCOSObject().setItem(COSName.TYPE, (COSBase) COSName.FUNCTION);
        } else if (cOSBase instanceof COSDictionary) {
            this.f60198b = (COSDictionary) cOSBase;
        }
    }

    public static PDFunction create(COSBase cOSBase) throws IOException {
        String simpleName;
        if (cOSBase == COSName.IDENTITY) {
            return new PDFunctionTypeIdentity(null);
        }
        if (cOSBase instanceof COSObject) {
            cOSBase = ((COSObject) cOSBase).getObject();
        }
        if (!(cOSBase instanceof COSDictionary)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Error: Function must be a Dictionary, but is ");
            if (cOSBase == null) {
                simpleName = "(null)";
            } else {
                simpleName = cOSBase.getClass().getSimpleName();
            }
            sb.append(simpleName);
            throw new IOException(sb.toString());
        }
        COSDictionary cOSDictionary = (COSDictionary) cOSBase;
        int i = cOSDictionary.getInt(COSName.FUNCTION_TYPE);
        if (i != 0) {
            if (i != 2) {
                if (i != 3) {
                    if (i == 4) {
                        return new PDFunctionType4(cOSDictionary);
                    }
                    throw new IOException("Error: Unknown function type " + i);
                }
                return new PDFunctionType3(cOSDictionary);
            }
            return new PDFunctionType2(cOSDictionary);
        }
        return new PDFunctionType0(cOSDictionary);
    }

    /* renamed from: a */
    public final COSArray m32543a() {
        if (this.f60199c == null) {
            this.f60199c = (COSArray) getCOSObject().getDictionaryObject(COSName.DOMAIN);
        }
        return this.f60199c;
    }

    public float clipToRange(float f, float f2, float f3) {
        return f < f2 ? f2 : f > f3 ? f3 : f;
    }

    @Deprecated
    public COSArray eval(COSArray cOSArray) throws IOException {
        float[] eval = eval(cOSArray.toFloatArray());
        COSArray cOSArray2 = new COSArray();
        cOSArray2.setFloatArray(eval);
        return cOSArray2;
    }

    public abstract float[] eval(float[] fArr) throws IOException;

    public PDRange getDomainForInput(int i) {
        return new PDRange(m32543a(), i);
    }

    public abstract int getFunctionType();

    public int getNumberOfInputParameters() {
        if (this.f60201e == -1) {
            this.f60201e = m32543a().size() / 2;
        }
        return this.f60201e;
    }

    public int getNumberOfOutputParameters() {
        if (this.f60202f == -1) {
            this.f60202f = getRangeValues().size() / 2;
        }
        return this.f60202f;
    }

    public PDStream getPDStream() {
        return this.f60197a;
    }

    public PDRange getRangeForOutput(int i) {
        return new PDRange(getRangeValues(), i);
    }

    public COSArray getRangeValues() {
        if (this.f60200d == null) {
            this.f60200d = (COSArray) getCOSObject().getDictionaryObject(COSName.RANGE);
        }
        return this.f60200d;
    }

    public float interpolate(float f, float f2, float f3, float f4, float f5) {
        return f4 + (((f - f2) * (f5 - f4)) / (f3 - f2));
    }

    public void setDomainValues(COSArray cOSArray) {
        this.f60199c = cOSArray;
        getCOSObject().setItem(COSName.DOMAIN, (COSBase) cOSArray);
    }

    public void setRangeValues(COSArray cOSArray) {
        this.f60200d = cOSArray;
        getCOSObject().setItem(COSName.RANGE, (COSBase) cOSArray);
    }

    public String toString() {
        return "FunctionType" + getFunctionType();
    }

    public float[] clipToRange(float[] fArr) {
        COSArray rangeValues = getRangeValues();
        if (rangeValues == null || rangeValues.size() <= 0) {
            return fArr;
        }
        float[] floatArray = rangeValues.toFloatArray();
        int length = floatArray.length / 2;
        float[] fArr2 = new float[length];
        for (int i = 0; i < length; i++) {
            int i2 = i << 1;
            fArr2[i] = clipToRange(fArr[i], floatArray[i2], floatArray[i2 + 1]);
        }
        return fArr2;
    }

    @Override // com.tom_roush.pdfbox.pdmodel.common.COSObjectable
    public COSDictionary getCOSObject() {
        PDStream pDStream = this.f60197a;
        if (pDStream != null) {
            return pDStream.getCOSObject();
        }
        return this.f60198b;
    }
}