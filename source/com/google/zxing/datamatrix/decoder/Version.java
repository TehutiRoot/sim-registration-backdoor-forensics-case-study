package com.google.zxing.datamatrix.decoder;

import ch.qos.logback.core.net.SyslogConstants;
import com.google.zxing.FormatException;
import th.p047co.dtac.android.dtacone.adapter.report.DetailProfitReportAdapter;

/* loaded from: classes5.dex */
public final class Version {

    /* renamed from: h */
    public static final Version[] f57801h = m34121a();

    /* renamed from: a */
    public final int f57802a;

    /* renamed from: b */
    public final int f57803b;

    /* renamed from: c */
    public final int f57804c;

    /* renamed from: d */
    public final int f57805d;

    /* renamed from: e */
    public final int f57806e;

    /* renamed from: f */
    public final C9016c f57807f;

    /* renamed from: g */
    public final int f57808g;

    /* renamed from: com.google.zxing.datamatrix.decoder.Version$b */
    /* loaded from: classes5.dex */
    public static final class C9015b {

        /* renamed from: a */
        public final int f57809a;

        /* renamed from: b */
        public final int f57810b;

        /* renamed from: a */
        public int m34119a() {
            return this.f57809a;
        }

        /* renamed from: b */
        public int m34118b() {
            return this.f57810b;
        }

        public C9015b(int i, int i2) {
            this.f57809a = i;
            this.f57810b = i2;
        }
    }

    public Version(int i, int i2, int i3, int i4, int i5, C9016c c9016c) {
        C9015b[] m34117a;
        this.f57802a = i;
        this.f57803b = i2;
        this.f57804c = i3;
        this.f57805d = i4;
        this.f57806e = i5;
        this.f57807f = c9016c;
        int m34116b = c9016c.m34116b();
        int i6 = 0;
        for (C9015b c9015b : c9016c.m34117a()) {
            i6 += c9015b.m34119a() * (c9015b.m34118b() + m34116b);
        }
        this.f57808g = i6;
    }

    /* renamed from: a */
    public static Version[] m34121a() {
        return new Version[]{new Version(1, 10, 10, 8, 8, new C9016c(5, new C9015b(1, 3))), new Version(2, 12, 12, 10, 10, new C9016c(7, new C9015b(1, 5))), new Version(3, 14, 14, 12, 12, new C9016c(10, new C9015b(1, 8))), new Version(4, 16, 16, 14, 14, new C9016c(12, new C9015b(1, 12))), new Version(5, 18, 18, 16, 16, new C9016c(14, new C9015b(1, 18))), new Version(6, 20, 20, 18, 18, new C9016c(18, new C9015b(1, 22))), new Version(7, 22, 22, 20, 20, new C9016c(20, new C9015b(1, 30))), new Version(8, 24, 24, 22, 22, new C9016c(24, new C9015b(1, 36))), new Version(9, 26, 26, 24, 24, new C9016c(28, new C9015b(1, 44))), new Version(10, 32, 32, 14, 14, new C9016c(36, new C9015b(1, 62))), new Version(11, 36, 36, 16, 16, new C9016c(42, new C9015b(1, 86))), new Version(12, 40, 40, 18, 18, new C9016c(48, new C9015b(1, 114))), new Version(13, 44, 44, 20, 20, new C9016c(56, new C9015b(1, SyslogConstants.LOG_LOCAL2))), new Version(14, 48, 48, 22, 22, new C9016c(68, new C9015b(1, 174))), new Version(15, 52, 52, 24, 24, new C9016c(42, new C9015b(2, 102))), new Version(16, 64, 64, 14, 14, new C9016c(56, new C9015b(2, DetailProfitReportAdapter.ViewHolder.hiddenSubProdHeight))), new Version(17, 72, 72, 16, 16, new C9016c(36, new C9015b(4, 92))), new Version(18, 80, 80, 18, 18, new C9016c(48, new C9015b(4, 114))), new Version(19, 88, 88, 20, 20, new C9016c(56, new C9015b(4, SyslogConstants.LOG_LOCAL2))), new Version(20, 96, 96, 22, 22, new C9016c(68, new C9015b(4, 174))), new Version(21, 104, 104, 24, 24, new C9016c(56, new C9015b(6, 136))), new Version(22, 120, 120, 18, 18, new C9016c(68, new C9015b(6, 175))), new Version(23, 132, 132, 20, 20, new C9016c(62, new C9015b(8, 163))), new Version(24, SyslogConstants.LOG_LOCAL2, SyslogConstants.LOG_LOCAL2, 22, 22, new C9016c(62, new C9015b(8, 156), new C9015b(2, 155))), new Version(25, 8, 18, 6, 16, new C9016c(7, new C9015b(1, 5))), new Version(26, 8, 32, 6, 14, new C9016c(11, new C9015b(1, 10))), new Version(27, 12, 26, 10, 24, new C9016c(14, new C9015b(1, 16))), new Version(28, 12, 36, 10, 16, new C9016c(18, new C9015b(1, 22))), new Version(29, 16, 36, 14, 16, new C9016c(24, new C9015b(1, 32))), new Version(30, 16, 48, 14, 22, new C9016c(28, new C9015b(1, 49)))};
    }

    public static Version getVersionForDimensions(int i, int i2) throws FormatException {
        Version[] versionArr;
        if ((i & 1) == 0 && (i2 & 1) == 0) {
            for (Version version : f57801h) {
                if (version.f57803b == i && version.f57804c == i2) {
                    return version;
                }
            }
            throw FormatException.getFormatInstance();
        }
        throw FormatException.getFormatInstance();
    }

    /* renamed from: b */
    public C9016c m34120b() {
        return this.f57807f;
    }

    public int getDataRegionSizeColumns() {
        return this.f57806e;
    }

    public int getDataRegionSizeRows() {
        return this.f57805d;
    }

    public int getSymbolSizeColumns() {
        return this.f57804c;
    }

    public int getSymbolSizeRows() {
        return this.f57803b;
    }

    public int getTotalCodewords() {
        return this.f57808g;
    }

    public int getVersionNumber() {
        return this.f57802a;
    }

    public String toString() {
        return String.valueOf(this.f57802a);
    }

    /* renamed from: com.google.zxing.datamatrix.decoder.Version$c */
    /* loaded from: classes5.dex */
    public static final class C9016c {

        /* renamed from: a */
        public final int f57811a;

        /* renamed from: b */
        public final C9015b[] f57812b;

        /* renamed from: a */
        public C9015b[] m34117a() {
            return this.f57812b;
        }

        /* renamed from: b */
        public int m34116b() {
            return this.f57811a;
        }

        public C9016c(int i, C9015b c9015b) {
            this.f57811a = i;
            this.f57812b = new C9015b[]{c9015b};
        }

        public C9016c(int i, C9015b c9015b, C9015b c9015b2) {
            this.f57811a = i;
            this.f57812b = new C9015b[]{c9015b, c9015b2};
        }
    }
}
