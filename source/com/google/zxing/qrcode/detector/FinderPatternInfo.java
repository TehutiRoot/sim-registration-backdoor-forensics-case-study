package com.google.zxing.qrcode.detector;

/* loaded from: classes5.dex */
public final class FinderPatternInfo {

    /* renamed from: a */
    public final FinderPattern f58002a;

    /* renamed from: b */
    public final FinderPattern f58003b;

    /* renamed from: c */
    public final FinderPattern f58004c;

    public FinderPatternInfo(FinderPattern[] finderPatternArr) {
        this.f58002a = finderPatternArr[0];
        this.f58003b = finderPatternArr[1];
        this.f58004c = finderPatternArr[2];
    }

    public FinderPattern getBottomLeft() {
        return this.f58002a;
    }

    public FinderPattern getTopLeft() {
        return this.f58003b;
    }

    public FinderPattern getTopRight() {
        return this.f58004c;
    }
}
