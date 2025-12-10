package com.google.zxing.multi;

import com.google.zxing.BinaryBitmap;
import com.google.zxing.DecodeHintType;
import com.google.zxing.NotFoundException;
import com.google.zxing.Reader;
import com.google.zxing.ReaderException;
import com.google.zxing.Result;
import com.google.zxing.ResultPoint;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes5.dex */
public final class GenericMultipleBarcodeReader implements MultipleBarcodeReader {

    /* renamed from: a */
    public final Reader f57840a;

    public GenericMultipleBarcodeReader(Reader reader) {
        this.f57840a = reader;
    }

    /* renamed from: b */
    public static Result m34072b(Result result, int i, int i2) {
        ResultPoint[] resultPoints = result.getResultPoints();
        if (resultPoints == null) {
            return result;
        }
        ResultPoint[] resultPointArr = new ResultPoint[resultPoints.length];
        for (int i3 = 0; i3 < resultPoints.length; i3++) {
            ResultPoint resultPoint = resultPoints[i3];
            if (resultPoint != null) {
                resultPointArr[i3] = new ResultPoint(resultPoint.getX() + i, resultPoint.getY() + i2);
            }
        }
        Result result2 = new Result(result.getText(), result.getRawBytes(), result.getNumBits(), resultPointArr, result.getBarcodeFormat(), result.getTimestamp());
        result2.putAllMetadata(result.getResultMetadata());
        return result2;
    }

    /* renamed from: a */
    public final void m34073a(BinaryBitmap binaryBitmap, Map map, List list, int i, int i2, int i3) {
        float f;
        float f2;
        float f3;
        int i4;
        if (i3 > 4) {
            return;
        }
        try {
            Result decode = this.f57840a.decode(binaryBitmap, map);
            Iterator it = list.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (((Result) it.next()).getText().equals(decode.getText())) {
                        break;
                    }
                } else {
                    list.add(m34072b(decode, i, i2));
                    break;
                }
            }
            ResultPoint[] resultPoints = decode.getResultPoints();
            if (resultPoints != null && resultPoints.length != 0) {
                int width = binaryBitmap.getWidth();
                int height = binaryBitmap.getHeight();
                float f4 = width;
                float f5 = 0.0f;
                float f6 = height;
                float f7 = 0.0f;
                for (ResultPoint resultPoint : resultPoints) {
                    if (resultPoint != null) {
                        float x = resultPoint.getX();
                        float y = resultPoint.getY();
                        if (x < f4) {
                            f4 = x;
                        }
                        if (y < f6) {
                            f6 = y;
                        }
                        if (x > f5) {
                            f5 = x;
                        }
                        if (y > f7) {
                            f7 = y;
                        }
                    }
                }
                if (f4 > 100.0f) {
                    f = f7;
                    f2 = f5;
                    f3 = f6;
                    i4 = 0;
                    m34073a(binaryBitmap.crop(0, 0, (int) f4, height), map, list, i, i2, i3 + 1);
                } else {
                    f = f7;
                    f2 = f5;
                    f3 = f6;
                    i4 = 0;
                }
                if (f3 > 100.0f) {
                    m34073a(binaryBitmap.crop(i4, i4, width, (int) f3), map, list, i, i2, i3 + 1);
                }
                if (f2 < width - 100) {
                    int i5 = (int) f2;
                    m34073a(binaryBitmap.crop(i5, i4, width - i5, height), map, list, i + i5, i2, i3 + 1);
                }
                if (f < height - 100) {
                    int i6 = (int) f;
                    m34073a(binaryBitmap.crop(i4, i6, width, height - i6), map, list, i, i2 + i6, i3 + 1);
                }
            }
        } catch (ReaderException unused) {
        }
    }

    @Override // com.google.zxing.multi.MultipleBarcodeReader
    public Result[] decodeMultiple(BinaryBitmap binaryBitmap) throws NotFoundException {
        return decodeMultiple(binaryBitmap, null);
    }

    @Override // com.google.zxing.multi.MultipleBarcodeReader
    public Result[] decodeMultiple(BinaryBitmap binaryBitmap, Map<DecodeHintType, ?> map) throws NotFoundException {
        ArrayList arrayList = new ArrayList();
        m34073a(binaryBitmap, map, arrayList, 0, 0, 0);
        if (!arrayList.isEmpty()) {
            return (Result[]) arrayList.toArray(new Result[arrayList.size()]);
        }
        throw NotFoundException.getNotFoundInstance();
    }
}
