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
    public int f59357i;

    /* renamed from: a */
    public int f59349a = 0;

    /* renamed from: b */
    public String f59350b = null;

    /* renamed from: c */
    public String f59351c = null;

    /* renamed from: d */
    public int f59352d = -1;

    /* renamed from: e */
    public String f59353e = null;

    /* renamed from: f */
    public String f59354f = null;

    /* renamed from: g */
    public int f59355g = 0;

    /* renamed from: h */
    public int f59356h = 4;

    /* renamed from: j */
    public final List f59358j = new ArrayList();

    /* renamed from: k */
    public final Map f59359k = new HashMap();

    /* renamed from: l */
    public final Map f59360l = new HashMap();

    /* renamed from: m */
    public final Map f59361m = new HashMap();

    /* renamed from: n */
    public final List f59362n = new ArrayList();

    /* renamed from: o */
    public int f59363o = -1;

    /* renamed from: f */
    public static int m32975f(byte[] bArr, int i) {
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            i2 = (i2 << 8) | (bArr[i3] & 255);
        }
        return i2;
    }

    /* renamed from: a */
    public void m32980a(int i, int i2) {
        this.f59361m.put(Integer.valueOf(i2), Integer.valueOf(i));
    }

    /* renamed from: b */
    public void m32979b(char c, char c2, int i) {
        C10160eg c10160eg;
        if (!this.f59362n.isEmpty()) {
            List list = this.f59362n;
            c10160eg = (C10160eg) list.get(list.size() - 1);
        } else {
            c10160eg = null;
        }
        if (c10160eg == null || !c10160eg.m31657a(c, c2, i)) {
            this.f59362n.add(new C10160eg(c, c2, i));
        }
    }

    /* renamed from: c */
    public void m32978c(byte[] bArr, String str) {
        this.f59360l.put(str, bArr.clone());
        int m32976e = m32976e(bArr, 0, bArr.length);
        this.f59359k.put(Integer.valueOf(m32976e), str);
        if (HelpFormatter.DEFAULT_LONG_OPT_SEPARATOR.equals(str)) {
            this.f59363o = m32976e;
        }
    }

    /* renamed from: d */
    public void m32977d(CodespaceRange codespaceRange) {
        this.f59358j.add(codespaceRange);
        this.f59357i = Math.max(this.f59357i, codespaceRange.getCodeLength());
        this.f59356h = Math.min(this.f59356h, codespaceRange.getCodeLength());
    }

    /* renamed from: e */
    public final int m32976e(byte[] bArr, int i, int i2) {
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            i3 = (i3 << 8) | ((bArr[i + i4] + 256) % 256);
        }
        return i3;
    }

    /* renamed from: g */
    public void m32974g(CMap cMap) {
        for (CodespaceRange codespaceRange : cMap.f59358j) {
            m32977d(codespaceRange);
        }
        this.f59359k.putAll(cMap.f59359k);
        this.f59361m.putAll(cMap.f59361m);
        this.f59362n.addAll(cMap.f59362n);
    }

    public byte[] getCodesFromUnicode(String str) {
        return (byte[]) this.f59360l.get(str);
    }

    public String getName() {
        return this.f59350b;
    }

    public String getOrdering() {
        return this.f59354f;
    }

    public String getRegistry() {
        return this.f59353e;
    }

    public int getSpaceMapping() {
        return this.f59363o;
    }

    public int getSupplement() {
        return this.f59355g;
    }

    public int getType() {
        return this.f59352d;
    }

    public String getVersion() {
        return this.f59351c;
    }

    public int getWMode() {
        return this.f59349a;
    }

    public boolean hasCIDMappings() {
        if (this.f59361m.isEmpty() && this.f59362n.isEmpty()) {
            return false;
        }
        return true;
    }

    public boolean hasUnicodeMappings() {
        return !this.f59359k.isEmpty();
    }

    public int readCode(InputStream inputStream) throws IOException {
        byte[] bArr = new byte[this.f59357i];
        inputStream.read(bArr, 0, this.f59356h);
        inputStream.mark(this.f59357i);
        int i = this.f59356h - 1;
        while (i < this.f59357i) {
            i++;
            for (CodespaceRange codespaceRange : this.f59358j) {
                if (codespaceRange.isFullMatch(bArr, i)) {
                    return m32975f(bArr, i);
                }
            }
            if (i < this.f59357i) {
                bArr[i] = (byte) inputStream.read();
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int i2 = 0; i2 < this.f59357i; i2++) {
            sb.append(String.format("0x%02X (%04o) ", Byte.valueOf(bArr[i2]), Byte.valueOf(bArr[i2])));
        }
        Log.w("PdfBox-Android", "Invalid character code sequence " + ((Object) sb) + "in CMap " + this.f59350b);
        if (inputStream.markSupported()) {
            inputStream.reset();
        } else {
            Log.w("PdfBox-Android", "mark() and reset() not supported, " + (this.f59357i - 1) + " bytes have been skipped");
        }
        return m32975f(bArr, this.f59356h);
    }

    public void setName(String str) {
        this.f59350b = str;
    }

    public void setOrdering(String str) {
        this.f59354f = str;
    }

    public void setRegistry(String str) {
        this.f59353e = str;
    }

    public void setSupplement(int i) {
        this.f59355g = i;
    }

    public void setType(int i) {
        this.f59352d = i;
    }

    public void setVersion(String str) {
        this.f59351c = str;
    }

    public void setWMode(int i) {
        this.f59349a = i;
    }

    public int toCID(int i) {
        Integer num = (Integer) this.f59361m.get(Integer.valueOf(i));
        if (num != null) {
            return num.intValue();
        }
        for (C10160eg c10160eg : this.f59362n) {
            int m31656b = c10160eg.m31656b((char) i);
            if (m31656b != -1) {
                return m31656b;
            }
        }
        return 0;
    }

    public String toString() {
        return this.f59350b;
    }

    public String toUnicode(int i) {
        return (String) this.f59359k.get(Integer.valueOf(i));
    }
}