package com.tom_roush.fontbox.cmap;

import android.util.Log;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.apache.commons.cli.HelpFormatter;

/* loaded from: classes5.dex */
public class CMap {

    /* renamed from: i */
    public int f59345i;

    /* renamed from: a */
    public int f59337a = 0;

    /* renamed from: b */
    public String f59338b = null;

    /* renamed from: c */
    public String f59339c = null;

    /* renamed from: d */
    public int f59340d = -1;

    /* renamed from: e */
    public String f59341e = null;

    /* renamed from: f */
    public String f59342f = null;

    /* renamed from: g */
    public int f59343g = 0;

    /* renamed from: h */
    public int f59344h = 4;

    /* renamed from: j */
    public final List f59346j = new ArrayList();

    /* renamed from: k */
    public final Map f59347k = new HashMap();

    /* renamed from: l */
    public final Map f59348l = new HashMap();

    /* renamed from: m */
    public final Map f59349m = new HashMap();

    /* renamed from: n */
    public final List f59350n = new ArrayList();

    /* renamed from: o */
    public int f59351o = -1;

    /* renamed from: f */
    public static int m32983f(byte[] bArr, int i) {
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            i2 = (i2 << 8) | (bArr[i3] & 255);
        }
        return i2;
    }

    /* renamed from: a */
    public void m32988a(int i, int i2) {
        this.f59349m.put(Integer.valueOf(i2), Integer.valueOf(i));
    }

    /* renamed from: b */
    public void m32987b(char c, char c2, int i) {
        C10164eg c10164eg;
        if (!this.f59350n.isEmpty()) {
            List list = this.f59350n;
            c10164eg = (C10164eg) list.get(list.size() - 1);
        } else {
            c10164eg = null;
        }
        if (c10164eg == null || !c10164eg.m31514a(c, c2, i)) {
            this.f59350n.add(new C10164eg(c, c2, i));
        }
    }

    /* renamed from: c */
    public void m32986c(byte[] bArr, String str) {
        this.f59348l.put(str, bArr.clone());
        int m32984e = m32984e(bArr, 0, bArr.length);
        this.f59347k.put(Integer.valueOf(m32984e), str);
        if (HelpFormatter.DEFAULT_LONG_OPT_SEPARATOR.equals(str)) {
            this.f59351o = m32984e;
        }
    }

    /* renamed from: d */
    public void m32985d(CodespaceRange codespaceRange) {
        this.f59346j.add(codespaceRange);
        this.f59345i = Math.max(this.f59345i, codespaceRange.getCodeLength());
        this.f59344h = Math.min(this.f59344h, codespaceRange.getCodeLength());
    }

    /* renamed from: e */
    public final int m32984e(byte[] bArr, int i, int i2) {
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            i3 = (i3 << 8) | ((bArr[i + i4] + 256) % 256);
        }
        return i3;
    }

    /* renamed from: g */
    public void m32982g(CMap cMap) {
        for (CodespaceRange codespaceRange : cMap.f59346j) {
            m32985d(codespaceRange);
        }
        this.f59347k.putAll(cMap.f59347k);
        this.f59349m.putAll(cMap.f59349m);
        this.f59350n.addAll(cMap.f59350n);
    }

    public byte[] getCodesFromUnicode(String str) {
        return (byte[]) this.f59348l.get(str);
    }

    public String getName() {
        return this.f59338b;
    }

    public String getOrdering() {
        return this.f59342f;
    }

    public String getRegistry() {
        return this.f59341e;
    }

    public int getSpaceMapping() {
        return this.f59351o;
    }

    public int getSupplement() {
        return this.f59343g;
    }

    public int getType() {
        return this.f59340d;
    }

    public String getVersion() {
        return this.f59339c;
    }

    public int getWMode() {
        return this.f59337a;
    }

    public boolean hasCIDMappings() {
        if (this.f59349m.isEmpty() && this.f59350n.isEmpty()) {
            return false;
        }
        return true;
    }

    public boolean hasUnicodeMappings() {
        return !this.f59347k.isEmpty();
    }

    public int readCode(InputStream inputStream) throws IOException {
        byte[] bArr = new byte[this.f59345i];
        inputStream.read(bArr, 0, this.f59344h);
        inputStream.mark(this.f59345i);
        int i = this.f59344h - 1;
        while (i < this.f59345i) {
            i++;
            for (CodespaceRange codespaceRange : this.f59346j) {
                if (codespaceRange.isFullMatch(bArr, i)) {
                    return m32983f(bArr, i);
                }
            }
            if (i < this.f59345i) {
                bArr[i] = (byte) inputStream.read();
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int i2 = 0; i2 < this.f59345i; i2++) {
            sb.append(String.format("0x%02X (%04o) ", Byte.valueOf(bArr[i2]), Byte.valueOf(bArr[i2])));
        }
        Log.w("PdfBox-Android", "Invalid character code sequence " + ((Object) sb) + "in CMap " + this.f59338b);
        if (inputStream.markSupported()) {
            inputStream.reset();
        } else {
            Log.w("PdfBox-Android", "mark() and reset() not supported, " + (this.f59345i - 1) + " bytes have been skipped");
        }
        return m32983f(bArr, this.f59344h);
    }

    public void setName(String str) {
        this.f59338b = str;
    }

    public void setOrdering(String str) {
        this.f59342f = str;
    }

    public void setRegistry(String str) {
        this.f59341e = str;
    }

    public void setSupplement(int i) {
        this.f59343g = i;
    }

    public void setType(int i) {
        this.f59340d = i;
    }

    public void setVersion(String str) {
        this.f59339c = str;
    }

    public void setWMode(int i) {
        this.f59337a = i;
    }

    public int toCID(int i) {
        Integer num = (Integer) this.f59349m.get(Integer.valueOf(i));
        if (num != null) {
            return num.intValue();
        }
        for (C10164eg c10164eg : this.f59350n) {
            int m31513b = c10164eg.m31513b((char) i);
            if (m31513b != -1) {
                return m31513b;
            }
        }
        return 0;
    }

    public String toString() {
        return this.f59338b;
    }

    public String toUnicode(int i) {
        return (String) this.f59347k.get(Integer.valueOf(i));
    }
}
