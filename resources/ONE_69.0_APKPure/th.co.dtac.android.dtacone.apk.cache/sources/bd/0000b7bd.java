package com.google.zxing;

import java.util.EnumMap;
import java.util.Map;

/* loaded from: classes5.dex */
public final class Result {

    /* renamed from: a */
    public final String f57604a;

    /* renamed from: b */
    public final byte[] f57605b;

    /* renamed from: c */
    public final int f57606c;

    /* renamed from: d */
    public ResultPoint[] f57607d;

    /* renamed from: e */
    public final BarcodeFormat f57608e;

    /* renamed from: f */
    public Map f57609f;

    /* renamed from: g */
    public final long f57610g;

    public Result(String str, byte[] bArr, ResultPoint[] resultPointArr, BarcodeFormat barcodeFormat) {
        this(str, bArr, resultPointArr, barcodeFormat, System.currentTimeMillis());
    }

    public void addResultPoints(ResultPoint[] resultPointArr) {
        ResultPoint[] resultPointArr2 = this.f57607d;
        if (resultPointArr2 == null) {
            this.f57607d = resultPointArr;
        } else if (resultPointArr != null && resultPointArr.length > 0) {
            ResultPoint[] resultPointArr3 = new ResultPoint[resultPointArr2.length + resultPointArr.length];
            System.arraycopy(resultPointArr2, 0, resultPointArr3, 0, resultPointArr2.length);
            System.arraycopy(resultPointArr, 0, resultPointArr3, resultPointArr2.length, resultPointArr.length);
            this.f57607d = resultPointArr3;
        }
    }

    public BarcodeFormat getBarcodeFormat() {
        return this.f57608e;
    }

    public int getNumBits() {
        return this.f57606c;
    }

    public byte[] getRawBytes() {
        return this.f57605b;
    }

    public Map<ResultMetadataType, Object> getResultMetadata() {
        return this.f57609f;
    }

    public ResultPoint[] getResultPoints() {
        return this.f57607d;
    }

    public String getText() {
        return this.f57604a;
    }

    public long getTimestamp() {
        return this.f57610g;
    }

    public void putAllMetadata(Map<ResultMetadataType, Object> map) {
        if (map != null) {
            Map map2 = this.f57609f;
            if (map2 == null) {
                this.f57609f = map;
            } else {
                map2.putAll(map);
            }
        }
    }

    public void putMetadata(ResultMetadataType resultMetadataType, Object obj) {
        if (this.f57609f == null) {
            this.f57609f = new EnumMap(ResultMetadataType.class);
        }
        this.f57609f.put(resultMetadataType, obj);
    }

    public String toString() {
        return this.f57604a;
    }

    public Result(String str, byte[] bArr, ResultPoint[] resultPointArr, BarcodeFormat barcodeFormat, long j) {
        this(str, bArr, bArr == null ? 0 : bArr.length * 8, resultPointArr, barcodeFormat, j);
    }

    public Result(String str, byte[] bArr, int i, ResultPoint[] resultPointArr, BarcodeFormat barcodeFormat, long j) {
        this.f57604a = str;
        this.f57605b = bArr;
        this.f57606c = i;
        this.f57607d = resultPointArr;
        this.f57608e = barcodeFormat;
        this.f57609f = null;
        this.f57610g = j;
    }
}