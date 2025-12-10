package com.google.zxing;

import java.util.EnumMap;
import java.util.Map;

/* loaded from: classes5.dex */
public final class Result {

    /* renamed from: a */
    public final String f57592a;

    /* renamed from: b */
    public final byte[] f57593b;

    /* renamed from: c */
    public final int f57594c;

    /* renamed from: d */
    public ResultPoint[] f57595d;

    /* renamed from: e */
    public final BarcodeFormat f57596e;

    /* renamed from: f */
    public Map f57597f;

    /* renamed from: g */
    public final long f57598g;

    public Result(String str, byte[] bArr, ResultPoint[] resultPointArr, BarcodeFormat barcodeFormat) {
        this(str, bArr, resultPointArr, barcodeFormat, System.currentTimeMillis());
    }

    public void addResultPoints(ResultPoint[] resultPointArr) {
        ResultPoint[] resultPointArr2 = this.f57595d;
        if (resultPointArr2 == null) {
            this.f57595d = resultPointArr;
        } else if (resultPointArr != null && resultPointArr.length > 0) {
            ResultPoint[] resultPointArr3 = new ResultPoint[resultPointArr2.length + resultPointArr.length];
            System.arraycopy(resultPointArr2, 0, resultPointArr3, 0, resultPointArr2.length);
            System.arraycopy(resultPointArr, 0, resultPointArr3, resultPointArr2.length, resultPointArr.length);
            this.f57595d = resultPointArr3;
        }
    }

    public BarcodeFormat getBarcodeFormat() {
        return this.f57596e;
    }

    public int getNumBits() {
        return this.f57594c;
    }

    public byte[] getRawBytes() {
        return this.f57593b;
    }

    public Map<ResultMetadataType, Object> getResultMetadata() {
        return this.f57597f;
    }

    public ResultPoint[] getResultPoints() {
        return this.f57595d;
    }

    public String getText() {
        return this.f57592a;
    }

    public long getTimestamp() {
        return this.f57598g;
    }

    public void putAllMetadata(Map<ResultMetadataType, Object> map) {
        if (map != null) {
            Map map2 = this.f57597f;
            if (map2 == null) {
                this.f57597f = map;
            } else {
                map2.putAll(map);
            }
        }
    }

    public void putMetadata(ResultMetadataType resultMetadataType, Object obj) {
        if (this.f57597f == null) {
            this.f57597f = new EnumMap(ResultMetadataType.class);
        }
        this.f57597f.put(resultMetadataType, obj);
    }

    public String toString() {
        return this.f57592a;
    }

    public Result(String str, byte[] bArr, ResultPoint[] resultPointArr, BarcodeFormat barcodeFormat, long j) {
        this(str, bArr, bArr == null ? 0 : bArr.length * 8, resultPointArr, barcodeFormat, j);
    }

    public Result(String str, byte[] bArr, int i, ResultPoint[] resultPointArr, BarcodeFormat barcodeFormat, long j) {
        this.f57592a = str;
        this.f57593b = bArr;
        this.f57594c = i;
        this.f57595d = resultPointArr;
        this.f57596e = barcodeFormat;
        this.f57597f = null;
        this.f57598g = j;
    }
}
