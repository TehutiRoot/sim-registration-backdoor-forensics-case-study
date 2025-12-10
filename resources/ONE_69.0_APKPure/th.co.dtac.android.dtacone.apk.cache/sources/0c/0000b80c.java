package com.google.zxing.datamatrix.decoder;

import ch.qos.logback.core.net.SyslogConstants;
import com.google.zxing.FormatException;
import th.p047co.dtac.android.dtacone.adapter.report.DetailProfitReportAdapter;

/* loaded from: classes5.dex */
public final class Version {

    /* renamed from: h */
    public static final Version[] f57813h = m34113a();

    /* renamed from: a */
    public final int f57814a;

    /* renamed from: b */
    public final int f57815b;

    /* renamed from: c */
    public final int f57816c;

    /* renamed from: d */
    public final int f57817d;

    /* renamed from: e */
    public final int f57818e;

    /* renamed from: f */
    public final C9005c f57819f;

    /* renamed from: g */
    public final int f57820g;

    /* renamed from: com.google.zxing.datamatrix.decoder.Version$b */
    /* loaded from: classes5.dex */
    public static final class C9004b {

        /* renamed from: a */
        public final int f57821a;

        /* renamed from: b */
        public final int f57822b;

        /* renamed from: a */
        public int m34111a() {
            return this.f57821a;
        }

        /* renamed from: b */
        public int m34110b() {
            return this.f57822b;
        }

        public C9004b(int i, int i2) {
            this.f57821a = i;
            this.f57822b = i2;
        }
    }

    public Version(int i, int i2, int i3, int i4, int i5, C9005c c9005c) {
        C9004b[] m34109a;
        this.f57814a = i;
        this.f57815b = i2;
        this.f57816c = i3;
        this.f57817d = i4;
        this.f57818e = i5;
        this.f57819f = c9005c;
        int m34108b = c9005c.m34108b();
        int i6 = 0;
        for (C9004b c9004b : c9005c.m34109a()) {
            i6 += c9004b.m34111a() * (c9004b.m34110b() + m34108b);
        }
        this.f57820g = i6;
    }

    /* renamed from: a */
    public static Version[] m34113a() {
        return new Version[]{new Version(1, 10, 10, 8, 8, new C9005c(5, new C9004b(1, 3))), new Version(2, 12, 12, 10, 10, new C9005c(7, new C9004b(1, 5))), new Version(3, 14, 14, 12, 12, new C9005c(10, new C9004b(1, 8))), new Version(4, 16, 16, 14, 14, new C9005c(12, new C9004b(1, 12))), new Version(5, 18, 18, 16, 16, new C9005c(14, new C9004b(1, 18))), new Version(6, 20, 20, 18, 18, new C9005c(18, new C9004b(1, 22))), new Version(7, 22, 22, 20, 20, new C9005c(20, new C9004b(1, 30))), new Version(8, 24, 24, 22, 22, new C9005c(24, new C9004b(1, 36))), new Version(9, 26, 26, 24, 24, new C9005c(28, new C9004b(1, 44))), new Version(10, 32, 32, 14, 14, new C9005c(36, new C9004b(1, 62))), new Version(11, 36, 36, 16, 16, new C9005c(42, new C9004b(1, 86))), new Version(12, 40, 40, 18, 18, new C9005c(48, new C9004b(1, 114))), new Version(13, 44, 44, 20, 20, new C9005c(56, new C9004b(1, SyslogConstants.LOG_LOCAL2))), new Version(14, 48, 48, 22, 22, new C9005c(68, new C9004b(1, 174))), new Version(15, 52, 52, 24, 24, new C9005c(42, new C9004b(2, 102))), new Version(16, 64, 64, 14, 14, new C9005c(56, new C9004b(2, DetailProfitReportAdapter.ViewHolder.hiddenSubProdHeight))), new Version(17, 72, 72, 16, 16, new C9005c(36, new C9004b(4, 92))), new Version(18, 80, 80, 18, 18, new C9005c(48, new C9004b(4, 114))), new Version(19, 88, 88, 20, 20, new C9005c(56, new C9004b(4, SyslogConstants.LOG_LOCAL2))), new Version(20, 96, 96, 22, 22, new C9005c(68, new C9004b(4, 174))), new Version(21, 104, 104, 24, 24, new C9005c(56, new C9004b(6, 136))), new Version(22, 120, 120, 18, 18, new C9005c(68, new C9004b(6, 175))), new Version(23, 132, 132, 20, 20, new C9005c(62, new C9004b(8, 163))), new Version(24, SyslogConstants.LOG_LOCAL2, SyslogConstants.LOG_LOCAL2, 22, 22, new C9005c(62, new C9004b(8, 156), new C9004b(2, 155))), new Version(25, 8, 18, 6, 16, new C9005c(7, new C9004b(1, 5))), new Version(26, 8, 32, 6, 14, new C9005c(11, new C9004b(1, 10))), new Version(27, 12, 26, 10, 24, new C9005c(14, new C9004b(1, 16))), new Version(28, 12, 36, 10, 16, new C9005c(18, new C9004b(1, 22))), new Version(29, 16, 36, 14, 16, new C9005c(24, new C9004b(1, 32))), new Version(30, 16, 48, 14, 22, new C9005c(28, new C9004b(1, 49)))};
    }

    public static Version getVersionForDimensions(int i, int i2) throws FormatException {
        Version[] versionArr;
        if ((i & 1) == 0 && (i2 & 1) == 0) {
            for (Version version : f57813h) {
                if (version.f57815b == i && version.f57816c == i2) {
                    return version;
                }
            }
            throw FormatException.getFormatInstance();
        }
        throw FormatException.getFormatInstance();
    }

    /* renamed from: b */
    public C9005c m34112b() {
        return this.f57819f;
    }

    public int getDataRegionSizeColumns() {
        return this.f57818e;
    }

    public int getDataRegionSizeRows() {
        return this.f57817d;
    }

    public int getSymbolSizeColumns() {
        return this.f57816c;
    }

    public int getSymbolSizeRows() {
        return this.f57815b;
    }

    public int getTotalCodewords() {
        return this.f57820g;
    }

    public int getVersionNumber() {
        return this.f57814a;
    }

    public String toString() {
        return String.valueOf(this.f57814a);
    }

    /* renamed from: com.google.zxing.datamatrix.decoder.Version$c */
    /* loaded from: classes5.dex */
    public static final class C9005c {

        /* renamed from: a */
        public final int f57823a;

        /* renamed from: b */
        public final C9004b[] f57824b;

        /* renamed from: a */
        public C9004b[] m34109a() {
            return this.f57824b;
        }

        /* renamed from: b */
        public int m34108b() {
            return this.f57823a;
        }

        public C9005c(int i, C9004b c9004b) {
            this.f57823a = i;
            this.f57824b = new C9004b[]{c9004b};
        }

        public C9005c(int i, C9004b c9004b, C9004b c9004b2) {
            this.f57823a = i;
            this.f57824b = new C9004b[]{c9004b, c9004b2};
        }
    }
}