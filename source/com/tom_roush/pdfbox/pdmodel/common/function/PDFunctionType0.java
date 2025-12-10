package com.tom_roush.pdfbox.pdmodel.common.function;

import com.tom_roush.harmony.javax.imageio.stream.MemoryCacheImageInputStream;
import com.tom_roush.pdfbox.cos.COSArray;
import com.tom_roush.pdfbox.cos.COSBase;
import com.tom_roush.pdfbox.cos.COSInputStream;
import com.tom_roush.pdfbox.cos.COSInteger;
import com.tom_roush.pdfbox.cos.COSName;
import com.tom_roush.pdfbox.pdmodel.common.PDRange;
import java.io.IOException;
import java.lang.reflect.Array;

/* loaded from: classes5.dex */
public class PDFunctionType0 extends PDFunction {

    /* renamed from: g */
    public COSArray f60191g;

    /* renamed from: h */
    public COSArray f60192h;

    /* renamed from: i */
    public COSArray f60193i;

    /* renamed from: j */
    public int[][] f60194j;

    /* renamed from: com.tom_roush.pdfbox.pdmodel.common.function.PDFunctionType0$a */
    /* loaded from: classes5.dex */
    public class C9921a {

        /* renamed from: a */
        public final float[] f60195a;

        /* renamed from: b */
        public final int[] f60196b;

        /* renamed from: c */
        public final int[] f60197c;

        /* renamed from: d */
        public final int f60198d;

        /* renamed from: e */
        public final int f60199e;

        public C9921a(float[] fArr, int[] iArr, int[] iArr2) {
            this.f60199e = PDFunctionType0.this.getNumberOfOutputParameters();
            this.f60195a = fArr;
            this.f60196b = iArr;
            this.f60197c = iArr2;
            this.f60198d = fArr.length;
        }

        /* renamed from: a */
        public final int m32546a(int[] iArr) {
            float[] floatArray = PDFunctionType0.this.getSize().toFloatArray();
            int length = iArr.length;
            int i = 1;
            for (int i2 = length - 2; i2 >= 0; i2--) {
                i = (int) (i * floatArray[i2]);
            }
            int i3 = 0;
            for (int i4 = length - 1; i4 >= 0; i4--) {
                i3 += iArr[i4] * i;
                int i5 = i4 - 1;
                if (i5 >= 0) {
                    i = (int) (i / floatArray[i5]);
                }
            }
            return i3;
        }

        /* renamed from: b */
        public final int[][] m32545b() {
            if (PDFunctionType0.this.f60194j == null) {
                int numberOfInputParameters = PDFunctionType0.this.getNumberOfInputParameters();
                int numberOfOutputParameters = PDFunctionType0.this.getNumberOfOutputParameters();
                COSArray size = PDFunctionType0.this.getSize();
                int i = 1;
                for (int i2 = 0; i2 < numberOfInputParameters; i2++) {
                    i *= size.getInt(i2);
                }
                PDFunctionType0.this.f60194j = (int[][]) Array.newInstance(Integer.TYPE, i, numberOfOutputParameters);
                int bitsPerSample = PDFunctionType0.this.getBitsPerSample();
                try {
                    COSInputStream createInputStream = PDFunctionType0.this.getPDStream().createInputStream();
                    MemoryCacheImageInputStream memoryCacheImageInputStream = new MemoryCacheImageInputStream(createInputStream);
                    int i3 = 0;
                    for (int i4 = 0; i4 < i; i4++) {
                        for (int i5 = 0; i5 < numberOfOutputParameters; i5++) {
                            PDFunctionType0.this.f60194j[i3][i5] = (int) memoryCacheImageInputStream.readBits(bitsPerSample);
                        }
                        i3++;
                    }
                    memoryCacheImageInputStream.close();
                    createInputStream.close();
                } catch (IOException unused) {
                }
            }
            return PDFunctionType0.this.f60194j;
        }

        /* renamed from: c */
        public final float[] m32544c(int[] iArr, int i) {
            float[] fArr = new float[this.f60199e];
            int i2 = 0;
            if (i == this.f60195a.length - 1) {
                int i3 = this.f60196b[i];
                if (i3 == this.f60197c[i]) {
                    iArr[i] = i3;
                    int[] iArr2 = m32545b()[m32546a(iArr)];
                    while (i2 < this.f60199e) {
                        fArr[i2] = iArr2[i2];
                        i2++;
                    }
                    return fArr;
                }
                iArr[i] = i3;
                int[] iArr3 = m32545b()[m32546a(iArr)];
                iArr[i] = this.f60197c[i];
                int[] iArr4 = m32545b()[m32546a(iArr)];
                while (i2 < this.f60199e) {
                    fArr[i2] = PDFunctionType0.this.interpolate(this.f60195a[i], this.f60196b[i], this.f60197c[i], iArr3[i2], iArr4[i2]);
                    i2++;
                }
                return fArr;
            }
            int i4 = this.f60196b[i];
            if (i4 == this.f60197c[i]) {
                iArr[i] = i4;
                return m32544c(iArr, i + 1);
            }
            iArr[i] = i4;
            int i5 = i + 1;
            float[] m32544c = m32544c(iArr, i5);
            iArr[i] = this.f60197c[i];
            float[] m32544c2 = m32544c(iArr, i5);
            while (i2 < this.f60199e) {
                fArr[i2] = PDFunctionType0.this.interpolate(this.f60195a[i], this.f60196b[i], this.f60197c[i], m32544c[i2], m32544c2[i2]);
                i2++;
            }
            return fArr;
        }

        /* renamed from: d */
        public float[] m32543d() {
            return m32544c(new int[this.f60198d], 0);
        }
    }

    public PDFunctionType0(COSBase cOSBase) {
        super(cOSBase);
        this.f60191g = null;
        this.f60192h = null;
        this.f60193i = null;
        this.f60194j = null;
    }

    /* renamed from: d */
    public final COSArray m32548d() {
        if (this.f60192h == null) {
            COSArray cOSArray = (COSArray) getCOSObject().getDictionaryObject(COSName.DECODE);
            this.f60192h = cOSArray;
            if (cOSArray == null) {
                this.f60192h = getRangeValues();
            }
        }
        return this.f60192h;
    }

    /* renamed from: e */
    public final COSArray m32547e() {
        if (this.f60191g == null) {
            COSArray cOSArray = (COSArray) getCOSObject().getDictionaryObject(COSName.ENCODE);
            this.f60191g = cOSArray;
            if (cOSArray == null) {
                this.f60191g = new COSArray();
                COSArray size = getSize();
                int size2 = size.size();
                for (int i = 0; i < size2; i++) {
                    this.f60191g.add((COSBase) COSInteger.ZERO);
                    this.f60191g.add((COSBase) COSInteger.get(size.getInt(i) - 1));
                }
            }
        }
        return this.f60191g;
    }

    @Override // com.tom_roush.pdfbox.pdmodel.common.function.PDFunction
    public float[] eval(float[] fArr) throws IOException {
        float[] floatArray = getSize().toFloatArray();
        float pow = (float) (Math.pow(2.0d, getBitsPerSample()) - 1.0d);
        int length = fArr.length;
        int numberOfOutputParameters = getNumberOfOutputParameters();
        int[] iArr = new int[length];
        int[] iArr2 = new int[length];
        float[] fArr2 = (float[]) fArr.clone();
        for (int i = 0; i < length; i++) {
            PDRange domainForInput = getDomainForInput(i);
            PDRange encodeForParameter = getEncodeForParameter(i);
            float clipToRange = clipToRange(fArr2[i], domainForInput.getMin(), domainForInput.getMax());
            fArr2[i] = clipToRange;
            float interpolate = interpolate(clipToRange, domainForInput.getMin(), domainForInput.getMax(), encodeForParameter.getMin(), encodeForParameter.getMax());
            fArr2[i] = interpolate;
            float clipToRange2 = clipToRange(interpolate, 0.0f, floatArray[i] - 1.0f);
            fArr2[i] = clipToRange2;
            iArr[i] = (int) Math.floor(clipToRange2);
            iArr2[i] = (int) Math.ceil(fArr2[i]);
        }
        float[] m32543d = new C9921a(fArr2, iArr, iArr2).m32543d();
        for (int i2 = 0; i2 < numberOfOutputParameters; i2++) {
            PDRange rangeForOutput = getRangeForOutput(i2);
            PDRange decodeForParameter = getDecodeForParameter(i2);
            float interpolate2 = interpolate(m32543d[i2], 0.0f, pow, decodeForParameter.getMin(), decodeForParameter.getMax());
            m32543d[i2] = interpolate2;
            m32543d[i2] = clipToRange(interpolate2, rangeForOutput.getMin(), rangeForOutput.getMax());
        }
        return m32543d;
    }

    public int getBitsPerSample() {
        return getCOSObject().getInt(COSName.BITS_PER_SAMPLE);
    }

    public PDRange getDecodeForParameter(int i) {
        COSArray m32548d = m32548d();
        if (m32548d != null && m32548d.size() >= (i * 2) + 1) {
            return new PDRange(m32548d, i);
        }
        return null;
    }

    public PDRange getEncodeForParameter(int i) {
        COSArray m32547e = m32547e();
        if (m32547e != null && m32547e.size() >= (i * 2) + 1) {
            return new PDRange(m32547e, i);
        }
        return null;
    }

    @Override // com.tom_roush.pdfbox.pdmodel.common.function.PDFunction
    public int getFunctionType() {
        return 0;
    }

    public int getOrder() {
        return getCOSObject().getInt(COSName.ORDER, 1);
    }

    public COSArray getSize() {
        if (this.f60193i == null) {
            this.f60193i = (COSArray) getCOSObject().getDictionaryObject(COSName.SIZE);
        }
        return this.f60193i;
    }

    public void setBitsPerSample(int i) {
        getCOSObject().setInt(COSName.BITS_PER_SAMPLE, i);
    }

    public void setDecodeValues(COSArray cOSArray) {
        this.f60192h = cOSArray;
        getCOSObject().setItem(COSName.DECODE, (COSBase) cOSArray);
    }

    public void setEncodeValues(COSArray cOSArray) {
        this.f60191g = cOSArray;
        getCOSObject().setItem(COSName.ENCODE, (COSBase) cOSArray);
    }
}
