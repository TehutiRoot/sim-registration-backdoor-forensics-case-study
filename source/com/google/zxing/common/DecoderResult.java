package com.google.zxing.common;

import java.util.List;

/* loaded from: classes5.dex */
public final class DecoderResult {

    /* renamed from: a */
    public final byte[] f57746a;

    /* renamed from: b */
    public int f57747b;

    /* renamed from: c */
    public final String f57748c;

    /* renamed from: d */
    public final List f57749d;

    /* renamed from: e */
    public final String f57750e;

    /* renamed from: f */
    public Integer f57751f;

    /* renamed from: g */
    public Integer f57752g;

    /* renamed from: h */
    public Object f57753h;

    /* renamed from: i */
    public final int f57754i;

    /* renamed from: j */
    public final int f57755j;

    public DecoderResult(byte[] bArr, String str, List<byte[]> list, String str2) {
        this(bArr, str, list, str2, -1, -1);
    }

    public List<byte[]> getByteSegments() {
        return this.f57749d;
    }

    public String getECLevel() {
        return this.f57750e;
    }

    public Integer getErasures() {
        return this.f57752g;
    }

    public Integer getErrorsCorrected() {
        return this.f57751f;
    }

    public int getNumBits() {
        return this.f57747b;
    }

    public Object getOther() {
        return this.f57753h;
    }

    public byte[] getRawBytes() {
        return this.f57746a;
    }

    public int getStructuredAppendParity() {
        return this.f57754i;
    }

    public int getStructuredAppendSequenceNumber() {
        return this.f57755j;
    }

    public String getText() {
        return this.f57748c;
    }

    public boolean hasStructuredAppend() {
        if (this.f57754i >= 0 && this.f57755j >= 0) {
            return true;
        }
        return false;
    }

    public void setErasures(Integer num) {
        this.f57752g = num;
    }

    public void setErrorsCorrected(Integer num) {
        this.f57751f = num;
    }

    public void setNumBits(int i) {
        this.f57747b = i;
    }

    public void setOther(Object obj) {
        this.f57753h = obj;
    }

    public DecoderResult(byte[] bArr, String str, List<byte[]> list, String str2, int i, int i2) {
        this.f57746a = bArr;
        this.f57747b = bArr == null ? 0 : bArr.length * 8;
        this.f57748c = str;
        this.f57749d = list;
        this.f57750e = str2;
        this.f57754i = i2;
        this.f57755j = i;
    }
}
