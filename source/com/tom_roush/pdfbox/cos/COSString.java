package com.tom_roush.pdfbox.cos;

import android.util.Log;
import com.tom_roush.pdfbox.util.Charsets;
import com.tom_roush.pdfbox.util.Hex;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Arrays;

/* loaded from: classes5.dex */
public final class COSString extends COSBase {
    public static final boolean FORCE_PARSING = Boolean.getBoolean("com.tom_roush.pdfbox.forceParsing");

    /* renamed from: b */
    public byte[] f59867b;

    /* renamed from: c */
    public boolean f59868c;

    public COSString(byte[] bArr) {
        setValue(bArr);
    }

    public static COSString parseHex(String str) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        StringBuilder sb = new StringBuilder(str.trim());
        if (sb.length() % 2 != 0) {
            sb.append('0');
        }
        int length = sb.length();
        int i = 0;
        while (i < length) {
            int i2 = i + 2;
            try {
                byteArrayOutputStream.write(Integer.parseInt(sb.substring(i, i2), 16));
            } catch (NumberFormatException e) {
                if (FORCE_PARSING) {
                    Log.w("PdfBox-Android", "Encountered a malformed hex string");
                    byteArrayOutputStream.write(63);
                } else {
                    throw new IOException("Invalid hex string: " + str, e);
                }
            }
            i = i2;
        }
        return new COSString(byteArrayOutputStream.toByteArray());
    }

    @Override // com.tom_roush.pdfbox.cos.COSBase
    public Object accept(ICOSVisitor iCOSVisitor) throws IOException {
        return iCOSVisitor.visitFromString(this);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof COSString)) {
            return false;
        }
        COSString cOSString = (COSString) obj;
        if (!getString().equals(cOSString.getString()) || this.f59868c != cOSString.f59868c) {
            return false;
        }
        return true;
    }

    public String getASCII() {
        return new String(this.f59867b, Charsets.US_ASCII);
    }

    public byte[] getBytes() {
        return this.f59867b;
    }

    public boolean getForceHexForm() {
        return this.f59868c;
    }

    public String getString() {
        byte[] bArr = this.f59867b;
        if (bArr.length >= 2) {
            byte b = bArr[0];
            if ((b & 255) == 254 && (bArr[1] & 255) == 255) {
                return new String(bArr, 2, bArr.length - 2, Charsets.UTF_16BE);
            }
            if ((b & 255) == 255 && (bArr[1] & 255) == 254) {
                return new String(bArr, 2, bArr.length - 2, Charsets.UTF_16LE);
            }
        }
        return AbstractC20939lh1.m26424d(bArr);
    }

    public int hashCode() {
        int i;
        int hashCode = Arrays.hashCode(this.f59867b);
        if (this.f59868c) {
            i = 17;
        } else {
            i = 0;
        }
        return hashCode + i;
    }

    public void setForceHexForm(boolean z) {
        this.f59868c = z;
    }

    public void setValue(byte[] bArr) {
        this.f59867b = (byte[]) bArr.clone();
    }

    public String toHexString() {
        return Hex.getString(this.f59867b);
    }

    public String toString() {
        return "COSString{" + getString() + "}";
    }

    public COSString(String str) {
        for (char c : str.toCharArray()) {
            if (!AbstractC20939lh1.m26427a(c)) {
                byte[] bytes = str.getBytes(Charsets.UTF_16BE);
                byte[] bArr = new byte[bytes.length + 2];
                this.f59867b = bArr;
                bArr[0] = -2;
                bArr[1] = -1;
                System.arraycopy(bytes, 0, bArr, 2, bytes.length);
                return;
            }
        }
        this.f59867b = AbstractC20939lh1.m26426b(str);
    }
}
