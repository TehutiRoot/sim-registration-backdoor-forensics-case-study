package com.google.zxing.pdf417;

/* loaded from: classes5.dex */
public final class PDF417ResultMetadata {

    /* renamed from: a */
    public int f57941a;

    /* renamed from: b */
    public String f57942b;

    /* renamed from: c */
    public int[] f57943c;

    /* renamed from: d */
    public boolean f57944d;

    public String getFileId() {
        return this.f57942b;
    }

    public int[] getOptionalData() {
        return this.f57943c;
    }

    public int getSegmentIndex() {
        return this.f57941a;
    }

    public boolean isLastSegment() {
        return this.f57944d;
    }

    public void setFileId(String str) {
        this.f57942b = str;
    }

    public void setLastSegment(boolean z) {
        this.f57944d = z;
    }

    public void setOptionalData(int[] iArr) {
        this.f57943c = iArr;
    }

    public void setSegmentIndex(int i) {
        this.f57941a = i;
    }
}