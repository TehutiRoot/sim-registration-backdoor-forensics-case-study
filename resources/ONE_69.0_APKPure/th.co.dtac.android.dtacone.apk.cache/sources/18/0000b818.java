package com.google.zxing.datamatrix.encoder;

import ch.qos.logback.core.net.SyslogConstants;
import com.google.api.ClientProto;
import com.google.zxing.Dimension;
import org.apache.http.HttpStatus;
import org.bouncycastle.asn1.eac.CertificateHolderAuthorization;
import th.p047co.dtac.android.dtacone.adapter.report.DetailProfitReportAdapter;

/* loaded from: classes5.dex */
public class SymbolInfo {

    /* renamed from: g */
    public static final SymbolInfo[] f57840g;

    /* renamed from: h */
    public static SymbolInfo[] f57841h;

    /* renamed from: a */
    public final boolean f57842a;

    /* renamed from: b */
    public final int f57843b;

    /* renamed from: c */
    public final int f57844c;

    /* renamed from: d */
    public final int f57845d;

    /* renamed from: e */
    public final int f57846e;

    /* renamed from: f */
    public final int f57847f;
    public final int matrixHeight;
    public final int matrixWidth;

    static {
        SymbolInfo[] symbolInfoArr = {new SymbolInfo(false, 3, 5, 8, 8, 1), new SymbolInfo(false, 5, 7, 10, 10, 1), new SymbolInfo(true, 5, 7, 16, 6, 1), new SymbolInfo(false, 8, 10, 12, 12, 1), new SymbolInfo(true, 10, 11, 14, 6, 2), new SymbolInfo(false, 12, 12, 14, 14, 1), new SymbolInfo(true, 16, 14, 24, 10, 1), new SymbolInfo(false, 18, 14, 16, 16, 1), new SymbolInfo(false, 22, 18, 18, 18, 1), new SymbolInfo(true, 22, 18, 16, 10, 2), new SymbolInfo(false, 30, 20, 20, 20, 1), new SymbolInfo(true, 32, 24, 16, 14, 2), new SymbolInfo(false, 36, 24, 22, 22, 1), new SymbolInfo(false, 44, 28, 24, 24, 1), new SymbolInfo(true, 49, 28, 22, 14, 2), new SymbolInfo(false, 62, 36, 14, 14, 4), new SymbolInfo(false, 86, 42, 16, 16, 4), new SymbolInfo(false, 114, 48, 18, 18, 4), new SymbolInfo(false, SyslogConstants.LOG_LOCAL2, 56, 20, 20, 4), new SymbolInfo(false, 174, 68, 22, 22, 4), new SymbolInfo(false, 204, 84, 24, 24, 4, 102, 42), new SymbolInfo(false, 280, 112, 14, 14, 16, DetailProfitReportAdapter.ViewHolder.hiddenSubProdHeight, 56), new SymbolInfo(false, 368, SyslogConstants.LOG_LOCAL2, 16, 16, 16, 92, 36), new SymbolInfo(false, 456, CertificateHolderAuthorization.CVCA, 18, 18, 16, 114, 48), new SymbolInfo(false, 576, 224, 20, 20, 16, SyslogConstants.LOG_LOCAL2, 56), new SymbolInfo(false, 696, 272, 22, 22, 16, 174, 68), new SymbolInfo(false, 816, 336, 24, 24, 16, 136, 56), new SymbolInfo(false, ClientProto.OAUTH_SCOPES_FIELD_NUMBER, HttpStatus.SC_REQUEST_TIMEOUT, 18, 18, 36, 175, 68), new SymbolInfo(false, 1304, 496, 20, 20, 36, 163, 62), new C0642JD()};
        f57840g = symbolInfoArr;
        f57841h = symbolInfoArr;
    }

    public SymbolInfo(boolean z, int i, int i2, int i3, int i4, int i5) {
        this(z, i, i2, i3, i4, i5, i, i2);
    }

    /* renamed from: c */
    public static SymbolInfo m34069c(int i, SymbolShapeHint symbolShapeHint, boolean z) {
        return lookup(i, symbolShapeHint, null, null, z);
    }

    public static SymbolInfo lookup(int i) {
        return m34069c(i, SymbolShapeHint.FORCE_NONE, true);
    }

    public static void overrideSymbolSet(SymbolInfo[] symbolInfoArr) {
        f57841h = symbolInfoArr;
    }

    /* renamed from: a */
    public final int m34071a() {
        int i = this.f57845d;
        int i2 = 1;
        if (i != 1) {
            i2 = 2;
            if (i != 2 && i != 4) {
                if (i == 16) {
                    return 4;
                }
                if (i == 36) {
                    return 6;
                }
                throw new IllegalStateException("Cannot handle this number of data regions");
            }
        }
        return i2;
    }

    /* renamed from: b */
    public final int m34070b() {
        int i = this.f57845d;
        if (i == 1 || i == 2) {
            return 1;
        }
        if (i == 4) {
            return 2;
        }
        if (i == 16) {
            return 4;
        }
        if (i == 36) {
            return 6;
        }
        throw new IllegalStateException("Cannot handle this number of data regions");
    }

    public int getCodewordCount() {
        return this.f57843b + this.f57844c;
    }

    public final int getDataCapacity() {
        return this.f57843b;
    }

    public int getDataLengthForInterleavedBlock(int i) {
        return this.f57846e;
    }

    public final int getErrorCodewords() {
        return this.f57844c;
    }

    public final int getErrorLengthForInterleavedBlock(int i) {
        return this.f57847f;
    }

    public int getInterleavedBlockCount() {
        return this.f57843b / this.f57846e;
    }

    public final int getSymbolDataHeight() {
        return m34070b() * this.matrixHeight;
    }

    public final int getSymbolDataWidth() {
        return m34071a() * this.matrixWidth;
    }

    public final int getSymbolHeight() {
        return getSymbolDataHeight() + (m34070b() << 1);
    }

    public final int getSymbolWidth() {
        return getSymbolDataWidth() + (m34071a() << 1);
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        if (this.f57842a) {
            str = "Rectangular Symbol:";
        } else {
            str = "Square Symbol:";
        }
        sb.append(str);
        sb.append(" data region ");
        sb.append(this.matrixWidth);
        sb.append('x');
        sb.append(this.matrixHeight);
        sb.append(", symbol size ");
        sb.append(getSymbolWidth());
        sb.append('x');
        sb.append(getSymbolHeight());
        sb.append(", symbol data size ");
        sb.append(getSymbolDataWidth());
        sb.append('x');
        sb.append(getSymbolDataHeight());
        sb.append(", codewords ");
        sb.append(this.f57843b);
        sb.append('+');
        sb.append(this.f57844c);
        return sb.toString();
    }

    public SymbolInfo(boolean z, int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        this.f57842a = z;
        this.f57843b = i;
        this.f57844c = i2;
        this.matrixWidth = i3;
        this.matrixHeight = i4;
        this.f57845d = i5;
        this.f57846e = i6;
        this.f57847f = i7;
    }

    public static SymbolInfo lookup(int i, SymbolShapeHint symbolShapeHint) {
        return m34069c(i, symbolShapeHint, true);
    }

    public static SymbolInfo lookup(int i, boolean z, boolean z2) {
        return m34069c(i, z ? SymbolShapeHint.FORCE_NONE : SymbolShapeHint.FORCE_SQUARE, z2);
    }

    public static SymbolInfo lookup(int i, SymbolShapeHint symbolShapeHint, Dimension dimension, Dimension dimension2, boolean z) {
        SymbolInfo[] symbolInfoArr;
        for (SymbolInfo symbolInfo : f57841h) {
            if (!(symbolShapeHint == SymbolShapeHint.FORCE_SQUARE && symbolInfo.f57842a) && ((symbolShapeHint != SymbolShapeHint.FORCE_RECTANGLE || symbolInfo.f57842a) && ((dimension == null || (symbolInfo.getSymbolWidth() >= dimension.getWidth() && symbolInfo.getSymbolHeight() >= dimension.getHeight())) && ((dimension2 == null || (symbolInfo.getSymbolWidth() <= dimension2.getWidth() && symbolInfo.getSymbolHeight() <= dimension2.getHeight())) && i <= symbolInfo.f57843b)))) {
                return symbolInfo;
            }
        }
        if (z) {
            throw new IllegalArgumentException("Can't find a symbol arrangement that matches the message. Data codewords: " + i);
        }
        return null;
    }
}