package com.google.zxing.pdf417;

/* loaded from: classes5.dex */
public final class PDF417ResultMetadata {

    /* renamed from: a */
    public int f57929a;

    /* renamed from: b */
    public String f57930b;

    /* renamed from: c */
    public int[] f57931c;

    /* renamed from: d */
    public boolean f57932d;

    public String getFileId() {
        return this.f57930b;
    }

    public int[] getOptionalData() {
        return this.f57931c;
    }

    public int getSegmentIndex() {
        return this.f57929a;
    }

    public boolean isLastSegment() {
        return this.f57932d;
    }

    public void setFileId(String str) {
        this.f57930b = str;
    }

    public void setLastSegment(boolean z) {
        this.f57932d = z;
    }

    public void setOptionalData(int[] iArr) {
        this.f57931c = iArr;
    }

    public void setSegmentIndex(int i) {
        this.f57929a = i;
    }
}
