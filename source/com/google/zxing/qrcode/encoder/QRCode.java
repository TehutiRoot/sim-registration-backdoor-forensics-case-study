package com.google.zxing.qrcode.encoder;

import com.google.zxing.qrcode.decoder.ErrorCorrectionLevel;
import com.google.zxing.qrcode.decoder.Mode;
import com.google.zxing.qrcode.decoder.Version;

/* loaded from: classes5.dex */
public final class QRCode {
    public static final int NUM_MASK_PATTERNS = 8;

    /* renamed from: a */
    public Mode f58010a;

    /* renamed from: b */
    public ErrorCorrectionLevel f58011b;

    /* renamed from: c */
    public Version f58012c;

    /* renamed from: d */
    public int f58013d = -1;

    /* renamed from: e */
    public ByteMatrix f58014e;

    public static boolean isValidMaskPattern(int i) {
        return i >= 0 && i < 8;
    }

    public ErrorCorrectionLevel getECLevel() {
        return this.f58011b;
    }

    public int getMaskPattern() {
        return this.f58013d;
    }

    public ByteMatrix getMatrix() {
        return this.f58014e;
    }

    public Mode getMode() {
        return this.f58010a;
    }

    public Version getVersion() {
        return this.f58012c;
    }

    public void setECLevel(ErrorCorrectionLevel errorCorrectionLevel) {
        this.f58011b = errorCorrectionLevel;
    }

    public void setMaskPattern(int i) {
        this.f58013d = i;
    }

    public void setMatrix(ByteMatrix byteMatrix) {
        this.f58014e = byteMatrix;
    }

    public void setMode(Mode mode) {
        this.f58010a = mode;
    }

    public void setVersion(Version version) {
        this.f58012c = version;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(200);
        sb.append("<<\n");
        sb.append(" mode: ");
        sb.append(this.f58010a);
        sb.append("\n ecLevel: ");
        sb.append(this.f58011b);
        sb.append("\n version: ");
        sb.append(this.f58012c);
        sb.append("\n maskPattern: ");
        sb.append(this.f58013d);
        if (this.f58014e == null) {
            sb.append("\n matrix: null\n");
        } else {
            sb.append("\n matrix:\n");
            sb.append(this.f58014e);
        }
        sb.append(">>\n");
        return sb.toString();
    }
}
