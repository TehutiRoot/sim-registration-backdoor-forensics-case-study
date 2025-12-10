package com.google.zxing.qrcode.detector;

/* loaded from: classes5.dex */
public final class FinderPatternInfo {

    /* renamed from: a */
    public final FinderPattern f58014a;

    /* renamed from: b */
    public final FinderPattern f58015b;

    /* renamed from: c */
    public final FinderPattern f58016c;

    public FinderPatternInfo(FinderPattern[] finderPatternArr) {
        this.f58014a = finderPatternArr[0];
        this.f58015b = finderPatternArr[1];
        this.f58016c = finderPatternArr[2];
    }

    public FinderPattern getBottomLeft() {
        return this.f58014a;
    }

    public FinderPattern getTopLeft() {
        return this.f58015b;
    }

    public FinderPattern getTopRight() {
        return this.f58016c;
    }
}