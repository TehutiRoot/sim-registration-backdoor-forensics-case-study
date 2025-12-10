package p000;

import android.graphics.PointF;
import android.graphics.RectF;
import android.util.Log;
import com.tom_roush.harmony.awt.geom.AffineTransform;
import com.tom_roush.harmony.javax.imageio.stream.ImageInputStream;
import com.tom_roush.harmony.javax.imageio.stream.MemoryCacheImageInputStream;
import com.tom_roush.pdfbox.cos.COSDictionary;
import com.tom_roush.pdfbox.cos.COSStream;
import com.tom_roush.pdfbox.pdmodel.common.PDRange;
import com.tom_roush.pdfbox.pdmodel.graphics.shading.PDShadingType4;
import com.tom_roush.pdfbox.util.Matrix;
import java.io.EOFException;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: nh1  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC21283nh1 extends PDShadingType4 {
    public AbstractC21283nh1(COSDictionary cOSDictionary) {
        super(cOSDictionary);
    }

    /* renamed from: d */
    public final List m26057d(AffineTransform affineTransform, Matrix matrix, int i) {
        MemoryCacheImageInputStream memoryCacheImageInputStream;
        MemoryCacheImageInputStream memoryCacheImageInputStream2;
        ArrayList arrayList;
        boolean z;
        MemoryCacheImageInputStream memoryCacheImageInputStream3;
        ArrayList arrayList2;
        AbstractC18307Qh1 readPatch;
        byte readBits;
        PointF[] pointFArr;
        float[][] m66535b;
        PDRange decodeForParameter;
        COSDictionary cOSObject = getCOSObject();
        if (!(cOSObject instanceof COSStream)) {
            return Collections.emptyList();
        }
        PDRange decodeForParameter2 = getDecodeForParameter(0);
        PDRange decodeForParameter3 = getDecodeForParameter(1);
        if (Float.compare(decodeForParameter2.getMin(), decodeForParameter2.getMax()) != 0 && Float.compare(decodeForParameter3.getMin(), decodeForParameter3.getMax()) != 0) {
            int bitsPerFlag = getBitsPerFlag();
            int numberOfColorComponents = getNumberOfColorComponents();
            PDRange[] pDRangeArr = new PDRange[numberOfColorComponents];
            for (int i2 = 0; i2 < numberOfColorComponents; i2++) {
                decodeForParameter = getDecodeForParameter(i2 + 2);
                pDRangeArr[i2] = decodeForParameter;
                if (decodeForParameter == null) {
                    throw new IOException("Range missing in shading /Decode entry");
                }
            }
            ArrayList arrayList3 = new ArrayList();
            long pow = ((long) Math.pow(2.0d, getBitsPerCoordinate())) - 1;
            long pow2 = ((long) Math.pow(2.0d, getBitsPerComponent())) - 1;
            MemoryCacheImageInputStream memoryCacheImageInputStream4 = new MemoryCacheImageInputStream(((COSStream) cOSObject).createInputStream());
            try {
                PointF[] pointFArr2 = new PointF[4];
                try {
                    try {
                        float[][] fArr = (float[][]) Array.newInstance(Float.TYPE, 2, numberOfColorComponents);
                        byte readBits2 = (byte) (memoryCacheImageInputStream4.readBits(bitsPerFlag) & 3);
                        boolean z2 = false;
                        while (true) {
                            if (!z2) {
                                if (readBits2 == 0) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                PointF[] pointFArr3 = pointFArr2;
                                PointF[] pointFArr4 = pointFArr2;
                                MemoryCacheImageInputStream memoryCacheImageInputStream5 = memoryCacheImageInputStream4;
                                ArrayList arrayList4 = arrayList3;
                                PDRange[] pDRangeArr2 = pDRangeArr;
                                int i3 = bitsPerFlag;
                                try {
                                    try {
                                        readPatch = readPatch(memoryCacheImageInputStream4, z, pointFArr3, fArr, pow, pow2, decodeForParameter2, decodeForParameter3, pDRangeArr2, matrix, affineTransform, i);
                                    } catch (Throwable th2) {
                                        th = th2;
                                        memoryCacheImageInputStream = memoryCacheImageInputStream5;
                                        memoryCacheImageInputStream.close();
                                        throw th;
                                    }
                                } catch (EOFException unused) {
                                    memoryCacheImageInputStream3 = memoryCacheImageInputStream5;
                                    arrayList2 = arrayList4;
                                }
                                if (readPatch == null) {
                                    memoryCacheImageInputStream2 = memoryCacheImageInputStream5;
                                    arrayList = arrayList4;
                                    break;
                                }
                                arrayList2 = arrayList4;
                                try {
                                    arrayList2.add(readPatch);
                                    memoryCacheImageInputStream3 = memoryCacheImageInputStream5;
                                    try {
                                        readBits = (byte) (memoryCacheImageInputStream3.readBits(i3) & 3);
                                    } catch (EOFException unused2) {
                                        bitsPerFlag = i3;
                                        arrayList3 = arrayList2;
                                        memoryCacheImageInputStream4 = memoryCacheImageInputStream3;
                                        pointFArr2 = pointFArr4;
                                        pDRangeArr = pDRangeArr2;
                                        z2 = true;
                                    }
                                } catch (EOFException unused3) {
                                    memoryCacheImageInputStream3 = memoryCacheImageInputStream5;
                                }
                                if (readBits != 0) {
                                    if (readBits != 1) {
                                        if (readBits != 2) {
                                            if (readBits != 3) {
                                                try {
                                                    Log.w("PdfBox-Android", "bad flag: " + ((int) readBits));
                                                } catch (EOFException unused4) {
                                                    readBits2 = readBits;
                                                }
                                            } else {
                                                pointFArr = readPatch.mo89g();
                                                try {
                                                    m66535b = readPatch.m66533f();
                                                } catch (EOFException unused5) {
                                                    readBits2 = readBits;
                                                    pointFArr4 = pointFArr;
                                                }
                                            }
                                            bitsPerFlag = i3;
                                            arrayList3 = arrayList2;
                                            memoryCacheImageInputStream4 = memoryCacheImageInputStream3;
                                            pointFArr2 = pointFArr4;
                                            pDRangeArr = pDRangeArr2;
                                            z2 = true;
                                        } else {
                                            pointFArr = readPatch.mo90e();
                                            m66535b = readPatch.m66534d();
                                        }
                                    } else {
                                        pointFArr = readPatch.mo91c();
                                        m66535b = readPatch.m66535b();
                                    }
                                    fArr = m66535b;
                                    bitsPerFlag = i3;
                                    arrayList3 = arrayList2;
                                    memoryCacheImageInputStream4 = memoryCacheImageInputStream3;
                                    readBits2 = readBits;
                                    pointFArr2 = pointFArr;
                                    pDRangeArr = pDRangeArr2;
                                }
                                pointFArr = pointFArr4;
                                bitsPerFlag = i3;
                                arrayList3 = arrayList2;
                                memoryCacheImageInputStream4 = memoryCacheImageInputStream3;
                                readBits2 = readBits;
                                pointFArr2 = pointFArr;
                                pDRangeArr = pDRangeArr2;
                            } else {
                                memoryCacheImageInputStream2 = memoryCacheImageInputStream4;
                                arrayList = arrayList3;
                                break;
                            }
                        }
                        memoryCacheImageInputStream2.close();
                        return arrayList;
                    } catch (Throwable th3) {
                        th = th3;
                        memoryCacheImageInputStream = decodeForParameter;
                    }
                } catch (EOFException e) {
                    e.getMessage();
                    memoryCacheImageInputStream4.close();
                    return arrayList3;
                }
            } catch (Throwable th4) {
                th = th4;
                memoryCacheImageInputStream = memoryCacheImageInputStream4;
            }
        } else {
            return Collections.emptyList();
        }
    }

    /* renamed from: e */
    public RectF m26056e(AffineTransform affineTransform, Matrix matrix, int i) {
        RectF rectF = null;
        for (AbstractC18307Qh1 abstractC18307Qh1 : m26057d(affineTransform, matrix, i)) {
            for (JG1 jg1 : abstractC18307Qh1.f5134d) {
                if (rectF == null) {
                    PointF pointF = jg1.f2745a[0];
                    rectF = new RectF(pointF.x, pointF.y, 0.0f, 0.0f);
                }
                PointF pointF2 = jg1.f2745a[0];
                rectF.union(pointF2.x, pointF2.y);
                PointF pointF3 = jg1.f2745a[1];
                rectF.union(pointF3.x, pointF3.y);
                PointF pointF4 = jg1.f2745a[2];
                rectF.union(pointF4.x, pointF4.y);
            }
        }
        return rectF;
    }

    public abstract AbstractC18307Qh1 generatePatch(PointF[] pointFArr, float[][] fArr);

    public AbstractC18307Qh1 readPatch(ImageInputStream imageInputStream, boolean z, PointF[] pointFArr, float[][] fArr, long j, long j2, PDRange pDRange, PDRange pDRange2, PDRange[] pDRangeArr, Matrix matrix, AffineTransform affineTransform, int i) throws IOException {
        int i2;
        int numberOfColorComponents = getNumberOfColorComponents();
        int i3 = 2;
        float[][] fArr2 = (float[][]) Array.newInstance(Float.TYPE, 4, numberOfColorComponents);
        PointF[] pointFArr2 = new PointF[i];
        if (z) {
            i3 = 0;
            i2 = 0;
        } else {
            pointFArr2[0] = pointFArr[0];
            pointFArr2[1] = pointFArr[1];
            pointFArr2[2] = pointFArr[2];
            pointFArr2[3] = pointFArr[3];
            for (int i4 = 0; i4 < numberOfColorComponents; i4++) {
                fArr2[0][i4] = fArr[0][i4];
                fArr2[1][i4] = fArr[1][i4];
            }
            i2 = 4;
        }
        while (i2 < i) {
            try {
                PointF transformPoint = matrix.transformPoint(interpolate((float) imageInputStream.readBits(getBitsPerCoordinate()), j, pDRange.getMin(), pDRange.getMax()), interpolate((float) imageInputStream.readBits(getBitsPerCoordinate()), j, pDRange2.getMin(), pDRange2.getMax()));
                affineTransform.transform(transformPoint, transformPoint);
                pointFArr2[i2] = transformPoint;
                i2++;
            } catch (EOFException unused) {
                return null;
            }
        }
        while (i3 < 4) {
            for (int i5 = 0; i5 < numberOfColorComponents; i5++) {
                fArr2[i3][i5] = interpolate((float) imageInputStream.readBits(getBitsPerComponent()), j2, pDRangeArr[i5].getMin(), pDRangeArr[i5].getMax());
            }
            i3++;
        }
        return generatePatch(pointFArr2, fArr2);
    }
}
