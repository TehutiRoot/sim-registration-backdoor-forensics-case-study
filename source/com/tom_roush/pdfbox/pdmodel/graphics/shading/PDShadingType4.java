package com.tom_roush.pdfbox.pdmodel.graphics.shading;

import android.graphics.PointF;
import android.graphics.RectF;
import android.util.Log;
import com.tom_roush.harmony.awt.geom.AffineTransform;
import com.tom_roush.harmony.javax.imageio.stream.MemoryCacheImageInputStream;
import com.tom_roush.pdfbox.cos.COSArray;
import com.tom_roush.pdfbox.cos.COSDictionary;
import com.tom_roush.pdfbox.cos.COSName;
import com.tom_roush.pdfbox.cos.COSStream;
import com.tom_roush.pdfbox.pdmodel.common.PDRange;
import com.tom_roush.pdfbox.util.Matrix;
import java.io.EOFException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes5.dex */
public class PDShadingType4 extends AbstractC21627ph1 {
    public PDShadingType4(COSDictionary cOSDictionary) {
        super(cOSDictionary);
    }

    @Override // p000.AbstractC21627ph1
    /* renamed from: b */
    public List mo23626b(AffineTransform affineTransform, Matrix matrix) {
        byte b;
        MemoryCacheImageInputStream memoryCacheImageInputStream;
        ArrayList arrayList;
        PDRange[] pDRangeArr;
        int i;
        ArrayList arrayList2;
        G12 readVertex;
        G12 readVertex2;
        G12 readVertex3;
        PointF pointF;
        PointF pointF2;
        PointF[] pointFArr;
        MemoryCacheImageInputStream memoryCacheImageInputStream2;
        int i2;
        PointF pointF3;
        PointF[] pointFArr2;
        float[] fArr;
        float[][] fArr2;
        char c = 0;
        byte b2 = 2;
        byte b3 = 1;
        int bitsPerFlag = getBitsPerFlag();
        COSDictionary cOSObject = getCOSObject();
        if (!(cOSObject instanceof COSStream)) {
            return Collections.emptyList();
        }
        PDRange decodeForParameter = getDecodeForParameter(0);
        PDRange decodeForParameter2 = getDecodeForParameter(1);
        if (Float.compare(decodeForParameter.getMin(), decodeForParameter.getMax()) != 0 && Float.compare(decodeForParameter2.getMin(), decodeForParameter2.getMax()) != 0) {
            int numberOfColorComponents = getNumberOfColorComponents();
            PDRange[] pDRangeArr2 = new PDRange[numberOfColorComponents];
            for (int i3 = 0; i3 < numberOfColorComponents; i3++) {
                pDRangeArr2[i3] = getDecodeForParameter(i3 + 2);
            }
            ArrayList arrayList3 = new ArrayList();
            long pow = ((long) Math.pow(2.0d, getBitsPerCoordinate())) - 1;
            long pow2 = ((long) Math.pow(2.0d, getBitsPerComponent())) - 1;
            MemoryCacheImageInputStream memoryCacheImageInputStream3 = new MemoryCacheImageInputStream(((COSStream) cOSObject).createInputStream());
            try {
                try {
                    b = (byte) (memoryCacheImageInputStream3.readBits(bitsPerFlag) & 3);
                } catch (EOFException e) {
                    e.getMessage();
                    b = 0;
                }
                boolean z = false;
                while (!z) {
                    if (b != 0) {
                        if (b != b3 && b != b2) {
                            try {
                                Log.w("PdfBox-Android", "bad flag: " + ((int) b));
                            } catch (EOFException unused) {
                                memoryCacheImageInputStream = memoryCacheImageInputStream3;
                                arrayList2 = arrayList3;
                                pDRangeArr = pDRangeArr2;
                                i = bitsPerFlag;
                                arrayList3 = arrayList2;
                                bitsPerFlag = i;
                                memoryCacheImageInputStream3 = memoryCacheImageInputStream;
                                pDRangeArr2 = pDRangeArr;
                                b3 = 1;
                                c = 0;
                                b2 = 2;
                                z = true;
                            }
                        } else {
                            try {
                                int size = arrayList3.size() - b3;
                                if (size < 0) {
                                    StringBuilder sb = new StringBuilder();
                                    sb.append("broken data stream: ");
                                    sb.append(arrayList3.size());
                                } else {
                                    JG1 jg1 = (JG1) arrayList3.get(size);
                                    MemoryCacheImageInputStream memoryCacheImageInputStream4 = memoryCacheImageInputStream3;
                                    ArrayList arrayList4 = arrayList3;
                                    pDRangeArr = pDRangeArr2;
                                    int i4 = bitsPerFlag;
                                    try {
                                        try {
                                            G12 readVertex4 = readVertex(memoryCacheImageInputStream3, pow, pow2, decodeForParameter, decodeForParameter2, pDRangeArr2, matrix, affineTransform);
                                            if (b == 1) {
                                                try {
                                                    pointF3 = jg1.f2745a[1];
                                                } catch (EOFException unused2) {
                                                    memoryCacheImageInputStream = memoryCacheImageInputStream4;
                                                    arrayList2 = arrayList4;
                                                    i = i4;
                                                    arrayList3 = arrayList2;
                                                    bitsPerFlag = i;
                                                    memoryCacheImageInputStream3 = memoryCacheImageInputStream;
                                                    pDRangeArr2 = pDRangeArr;
                                                    b3 = 1;
                                                    c = 0;
                                                    b2 = 2;
                                                    z = true;
                                                } catch (Throwable th2) {
                                                    th = th2;
                                                    memoryCacheImageInputStream = memoryCacheImageInputStream4;
                                                    memoryCacheImageInputStream.close();
                                                    throw th;
                                                }
                                            } else {
                                                pointF3 = jg1.f2745a[c];
                                            }
                                            PointF pointF4 = jg1.f2745a[2];
                                            PointF pointF5 = readVertex4.f1783a;
                                            try {
                                                pointFArr2 = new PointF[3];
                                                pointFArr2[c] = pointF3;
                                                pointFArr2[1] = pointF4;
                                                pointFArr2[2] = pointF5;
                                                if (b == 1) {
                                                    fArr = jg1.f2746b[1];
                                                } else {
                                                    fArr = jg1.f2746b[c];
                                                }
                                                float[] fArr3 = jg1.f2746b[2];
                                                float[] fArr4 = readVertex4.f1784b;
                                                fArr2 = new float[3];
                                                fArr2[c] = fArr;
                                                fArr2[1] = fArr3;
                                                fArr2[2] = fArr4;
                                                arrayList = arrayList4;
                                            } catch (EOFException unused3) {
                                                memoryCacheImageInputStream2 = memoryCacheImageInputStream4;
                                                arrayList = arrayList4;
                                                i2 = i4;
                                            }
                                        } catch (EOFException unused4) {
                                            memoryCacheImageInputStream2 = memoryCacheImageInputStream4;
                                            arrayList = arrayList4;
                                        }
                                        try {
                                            arrayList.add(new JG1(pointFArr2, fArr2));
                                            memoryCacheImageInputStream2 = memoryCacheImageInputStream4;
                                            i2 = i4;
                                            try {
                                                b = (byte) (memoryCacheImageInputStream2.readBits(i2) & 3);
                                                memoryCacheImageInputStream = memoryCacheImageInputStream2;
                                                i = i2;
                                                arrayList2 = arrayList;
                                            } catch (EOFException unused5) {
                                                memoryCacheImageInputStream = memoryCacheImageInputStream2;
                                                i = i2;
                                                arrayList2 = arrayList;
                                                arrayList3 = arrayList2;
                                                bitsPerFlag = i;
                                                memoryCacheImageInputStream3 = memoryCacheImageInputStream;
                                                pDRangeArr2 = pDRangeArr;
                                                b3 = 1;
                                                c = 0;
                                                b2 = 2;
                                                z = true;
                                            } catch (Throwable th3) {
                                                th = th3;
                                                memoryCacheImageInputStream = memoryCacheImageInputStream2;
                                                memoryCacheImageInputStream.close();
                                                throw th;
                                            }
                                        } catch (EOFException unused6) {
                                            memoryCacheImageInputStream2 = memoryCacheImageInputStream4;
                                            i2 = i4;
                                            memoryCacheImageInputStream = memoryCacheImageInputStream2;
                                            i = i2;
                                            arrayList2 = arrayList;
                                            arrayList3 = arrayList2;
                                            bitsPerFlag = i;
                                            memoryCacheImageInputStream3 = memoryCacheImageInputStream;
                                            pDRangeArr2 = pDRangeArr;
                                            b3 = 1;
                                            c = 0;
                                            b2 = 2;
                                            z = true;
                                        }
                                    } catch (Throwable th4) {
                                        th = th4;
                                        memoryCacheImageInputStream2 = memoryCacheImageInputStream4;
                                    }
                                }
                            } catch (EOFException unused7) {
                                arrayList = arrayList3;
                                pDRangeArr = pDRangeArr2;
                                i2 = bitsPerFlag;
                                memoryCacheImageInputStream2 = memoryCacheImageInputStream3;
                            } catch (Throwable th5) {
                                th = th5;
                                memoryCacheImageInputStream2 = memoryCacheImageInputStream3;
                            }
                        }
                        memoryCacheImageInputStream = memoryCacheImageInputStream3;
                        arrayList2 = arrayList3;
                        pDRangeArr = pDRangeArr2;
                        i = bitsPerFlag;
                    } else {
                        arrayList = arrayList3;
                        pDRangeArr = pDRangeArr2;
                        int i5 = bitsPerFlag;
                        MemoryCacheImageInputStream memoryCacheImageInputStream5 = memoryCacheImageInputStream3;
                        memoryCacheImageInputStream = memoryCacheImageInputStream5;
                        i = i5;
                        try {
                            try {
                                readVertex = readVertex(memoryCacheImageInputStream5, pow, pow2, decodeForParameter, decodeForParameter2, pDRangeArr2, matrix, affineTransform);
                                b = (byte) (memoryCacheImageInputStream.readBits(i) & 3);
                                if (b != 0) {
                                    try {
                                        StringBuilder sb2 = new StringBuilder();
                                        sb2.append("bad triangle: ");
                                        sb2.append((int) b);
                                    } catch (EOFException unused8) {
                                        arrayList2 = arrayList;
                                        arrayList3 = arrayList2;
                                        bitsPerFlag = i;
                                        memoryCacheImageInputStream3 = memoryCacheImageInputStream;
                                        pDRangeArr2 = pDRangeArr;
                                        b3 = 1;
                                        c = 0;
                                        b2 = 2;
                                        z = true;
                                    }
                                }
                                try {
                                    readVertex2 = readVertex(memoryCacheImageInputStream, pow, pow2, decodeForParameter, decodeForParameter2, pDRangeArr, matrix, affineTransform);
                                    memoryCacheImageInputStream.readBits(i);
                                    if (b != 0) {
                                        try {
                                            StringBuilder sb3 = new StringBuilder();
                                            sb3.append("bad triangle: ");
                                            sb3.append((int) b);
                                        } catch (EOFException unused9) {
                                            arrayList2 = arrayList;
                                            arrayList3 = arrayList2;
                                            bitsPerFlag = i;
                                            memoryCacheImageInputStream3 = memoryCacheImageInputStream;
                                            pDRangeArr2 = pDRangeArr;
                                            b3 = 1;
                                            c = 0;
                                            b2 = 2;
                                            z = true;
                                        }
                                    }
                                    readVertex3 = readVertex(memoryCacheImageInputStream, pow, pow2, decodeForParameter, decodeForParameter2, pDRangeArr, matrix, affineTransform);
                                    PointF pointF6 = readVertex.f1783a;
                                    pointF = readVertex2.f1783a;
                                    pointF2 = readVertex3.f1783a;
                                    pointFArr = new PointF[3];
                                    pointFArr[0] = pointF6;
                                } catch (EOFException unused10) {
                                    arrayList2 = arrayList;
                                    arrayList3 = arrayList2;
                                    bitsPerFlag = i;
                                    memoryCacheImageInputStream3 = memoryCacheImageInputStream;
                                    pDRangeArr2 = pDRangeArr;
                                    b3 = 1;
                                    c = 0;
                                    b2 = 2;
                                    z = true;
                                }
                            } catch (Throwable th6) {
                                th = th6;
                                memoryCacheImageInputStream.close();
                                throw th;
                            }
                        } catch (EOFException unused11) {
                            arrayList2 = arrayList;
                        }
                        try {
                            pointFArr[1] = pointF;
                            pointFArr[2] = pointF2;
                            float[] fArr5 = readVertex.f1784b;
                            float[] fArr6 = readVertex2.f1784b;
                            float[] fArr7 = readVertex3.f1784b;
                            try {
                                float[][] fArr8 = new float[3];
                                try {
                                    fArr8[0] = fArr5;
                                    try {
                                        fArr8[1] = fArr6;
                                        try {
                                            fArr8[2] = fArr7;
                                            JG1 jg12 = new JG1(pointFArr, fArr8);
                                            arrayList2 = arrayList;
                                            try {
                                                arrayList2.add(jg12);
                                                b = (byte) (memoryCacheImageInputStream.readBits(i) & 3);
                                            } catch (EOFException unused12) {
                                                arrayList3 = arrayList2;
                                                bitsPerFlag = i;
                                                memoryCacheImageInputStream3 = memoryCacheImageInputStream;
                                                pDRangeArr2 = pDRangeArr;
                                                b3 = 1;
                                                c = 0;
                                                b2 = 2;
                                                z = true;
                                            }
                                        } catch (EOFException unused13) {
                                            arrayList2 = arrayList;
                                        }
                                    } catch (EOFException unused14) {
                                        arrayList2 = arrayList;
                                        arrayList3 = arrayList2;
                                        bitsPerFlag = i;
                                        memoryCacheImageInputStream3 = memoryCacheImageInputStream;
                                        pDRangeArr2 = pDRangeArr;
                                        b3 = 1;
                                        c = 0;
                                        b2 = 2;
                                        z = true;
                                    }
                                } catch (EOFException unused15) {
                                    arrayList2 = arrayList;
                                }
                            } catch (EOFException unused16) {
                                arrayList2 = arrayList;
                                arrayList3 = arrayList2;
                                bitsPerFlag = i;
                                memoryCacheImageInputStream3 = memoryCacheImageInputStream;
                                pDRangeArr2 = pDRangeArr;
                                b3 = 1;
                                c = 0;
                                b2 = 2;
                                z = true;
                            }
                        } catch (EOFException unused17) {
                            arrayList2 = arrayList;
                            arrayList3 = arrayList2;
                            bitsPerFlag = i;
                            memoryCacheImageInputStream3 = memoryCacheImageInputStream;
                            pDRangeArr2 = pDRangeArr;
                            b3 = 1;
                            c = 0;
                            b2 = 2;
                            z = true;
                        }
                    }
                    arrayList3 = arrayList2;
                    bitsPerFlag = i;
                    memoryCacheImageInputStream3 = memoryCacheImageInputStream;
                    pDRangeArr2 = pDRangeArr;
                    b3 = 1;
                    c = 0;
                    b2 = 2;
                }
                ArrayList arrayList5 = arrayList3;
                memoryCacheImageInputStream3.close();
                return arrayList5;
            } catch (Throwable th7) {
                th = th7;
                memoryCacheImageInputStream = memoryCacheImageInputStream3;
                memoryCacheImageInputStream.close();
                throw th;
            }
        }
        return Collections.emptyList();
    }

    @Override // p000.AbstractC21627ph1
    public /* bridge */ /* synthetic */ int getBitsPerComponent() {
        return super.getBitsPerComponent();
    }

    @Override // p000.AbstractC21627ph1
    public /* bridge */ /* synthetic */ int getBitsPerCoordinate() {
        return super.getBitsPerCoordinate();
    }

    public int getBitsPerFlag() {
        return getCOSObject().getInt(COSName.BITS_PER_FLAG, -1);
    }

    @Override // p000.AbstractC21627ph1, com.tom_roush.pdfbox.pdmodel.graphics.shading.PDShading
    public /* bridge */ /* synthetic */ RectF getBounds(AffineTransform affineTransform, Matrix matrix) throws IOException {
        return super.getBounds(affineTransform, matrix);
    }

    @Override // p000.AbstractC21627ph1
    public /* bridge */ /* synthetic */ PDRange getDecodeForParameter(int i) {
        return super.getDecodeForParameter(i);
    }

    @Override // p000.AbstractC21627ph1
    public /* bridge */ /* synthetic */ int getNumberOfColorComponents() throws IOException {
        return super.getNumberOfColorComponents();
    }

    @Override // com.tom_roush.pdfbox.pdmodel.graphics.shading.PDShading
    public int getShadingType() {
        return 4;
    }

    @Override // p000.AbstractC21627ph1
    public /* bridge */ /* synthetic */ void setBitsPerComponent(int i) {
        super.setBitsPerComponent(i);
    }

    @Override // p000.AbstractC21627ph1
    public /* bridge */ /* synthetic */ void setBitsPerCoordinate(int i) {
        super.setBitsPerCoordinate(i);
    }

    public void setBitsPerFlag(int i) {
        getCOSObject().setInt(COSName.BITS_PER_FLAG, i);
    }

    @Override // p000.AbstractC21627ph1
    public /* bridge */ /* synthetic */ void setDecodeValues(COSArray cOSArray) {
        super.setDecodeValues(cOSArray);
    }
}
