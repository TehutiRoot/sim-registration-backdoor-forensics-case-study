package com.tom_roush.pdfbox.pdmodel.graphics.shading;

import android.graphics.PointF;
import android.graphics.RectF;
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
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes5.dex */
public class PDShadingType5 extends AbstractC21627ph1 {
    public PDShadingType5(COSDictionary cOSDictionary) {
        super(cOSDictionary);
    }

    @Override // p000.AbstractC21627ph1
    /* renamed from: b */
    public List mo23626b(AffineTransform affineTransform, Matrix matrix) {
        COSDictionary cOSObject = getCOSObject();
        if (!(cOSObject instanceof COSStream)) {
            return Collections.emptyList();
        }
        PDRange decodeForParameter = getDecodeForParameter(0);
        PDRange decodeForParameter2 = getDecodeForParameter(1);
        if (Float.compare(decodeForParameter.getMin(), decodeForParameter.getMax()) != 0 && Float.compare(decodeForParameter2.getMin(), decodeForParameter2.getMax()) != 0) {
            int verticesPerRow = getVerticesPerRow();
            int numberOfColorComponents = getNumberOfColorComponents();
            PDRange[] pDRangeArr = new PDRange[numberOfColorComponents];
            for (int i = 0; i < numberOfColorComponents; i++) {
                pDRangeArr[i] = getDecodeForParameter(i + 2);
            }
            ArrayList arrayList = new ArrayList();
            long pow = ((long) Math.pow(2.0d, getBitsPerCoordinate())) - 1;
            long pow2 = ((long) Math.pow(2.0d, getBitsPerComponent())) - 1;
            MemoryCacheImageInputStream memoryCacheImageInputStream = new MemoryCacheImageInputStream(((COSStream) cOSObject).createInputStream());
            boolean z = false;
            while (!z) {
                MemoryCacheImageInputStream memoryCacheImageInputStream2 = memoryCacheImageInputStream;
                ArrayList arrayList2 = arrayList;
                PDRange[] pDRangeArr2 = pDRangeArr;
                int i2 = verticesPerRow;
                try {
                    arrayList2.add(readVertex(memoryCacheImageInputStream, pow, pow2, decodeForParameter, decodeForParameter2, pDRangeArr, matrix, affineTransform));
                    arrayList = arrayList2;
                    verticesPerRow = i2;
                    memoryCacheImageInputStream = memoryCacheImageInputStream2;
                    pDRangeArr = pDRangeArr2;
                } catch (EOFException unused) {
                    arrayList = arrayList2;
                    verticesPerRow = i2;
                    memoryCacheImageInputStream = memoryCacheImageInputStream2;
                    pDRangeArr = pDRangeArr2;
                    z = true;
                } catch (Throwable th2) {
                    memoryCacheImageInputStream2.close();
                    throw th2;
                }
            }
            ArrayList arrayList3 = arrayList;
            int i3 = verticesPerRow;
            memoryCacheImageInputStream.close();
            int size = arrayList3.size() / i3;
            G12[][] g12Arr = (G12[][]) Array.newInstance(G12.class, size, i3);
            ArrayList arrayList4 = new ArrayList();
            if (size < 2) {
                return arrayList4;
            }
            for (int i4 = 0; i4 < size; i4++) {
                for (int i5 = 0; i5 < i3; i5++) {
                    g12Arr[i4][i5] = (G12) arrayList3.get((i4 * i3) + i5);
                }
            }
            PointF[] pointFArr = new PointF[3];
            float[][] fArr = new float[3];
            int i6 = 0;
            while (true) {
                char c = 1;
                if (i6 < size - 1) {
                    int i7 = 0;
                    while (i7 < i3 - 1) {
                        pointFArr[0] = g12Arr[i6][i7].f1783a;
                        int i8 = i7 + 1;
                        pointFArr[c] = g12Arr[i6][i8].f1783a;
                        int i9 = i6 + 1;
                        pointFArr[2] = g12Arr[i9][i7].f1783a;
                        fArr[0] = g12Arr[i6][i7].f1784b;
                        fArr[1] = g12Arr[i6][i8].f1784b;
                        fArr[2] = g12Arr[i9][i7].f1784b;
                        arrayList4.add(new JG1(pointFArr, fArr));
                        pointFArr[0] = g12Arr[i6][i8].f1783a;
                        pointFArr[1] = g12Arr[i9][i7].f1783a;
                        pointFArr[2] = g12Arr[i9][i8].f1783a;
                        fArr[0] = g12Arr[i6][i8].f1784b;
                        fArr[1] = g12Arr[i9][i7].f1784b;
                        fArr[2] = g12Arr[i9][i8].f1784b;
                        arrayList4.add(new JG1(pointFArr, fArr));
                        i7 = i8;
                        c = 1;
                    }
                    i6++;
                } else {
                    return arrayList4;
                }
            }
        } else {
            return Collections.emptyList();
        }
    }

    @Override // p000.AbstractC21627ph1
    public /* bridge */ /* synthetic */ int getBitsPerComponent() {
        return super.getBitsPerComponent();
    }

    @Override // p000.AbstractC21627ph1
    public /* bridge */ /* synthetic */ int getBitsPerCoordinate() {
        return super.getBitsPerCoordinate();
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
        return 5;
    }

    public int getVerticesPerRow() {
        return getCOSObject().getInt(COSName.VERTICES_PER_ROW, -1);
    }

    @Override // p000.AbstractC21627ph1
    public /* bridge */ /* synthetic */ void setBitsPerComponent(int i) {
        super.setBitsPerComponent(i);
    }

    @Override // p000.AbstractC21627ph1
    public /* bridge */ /* synthetic */ void setBitsPerCoordinate(int i) {
        super.setBitsPerCoordinate(i);
    }

    @Override // p000.AbstractC21627ph1
    public /* bridge */ /* synthetic */ void setDecodeValues(COSArray cOSArray) {
        super.setDecodeValues(cOSArray);
    }

    public void setVerticesPerRow(int i) {
        getCOSObject().setInt(COSName.VERTICES_PER_ROW, i);
    }
}
