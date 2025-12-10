package com.tom_roush.fontbox.ttf;

import android.support.p001v4.media.session.PlaybackStateCompat;
import android.util.Log;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.apache.commons.cli.HelpFormatter;

/* loaded from: classes5.dex */
public class CmapSubtable implements CmapLookup {

    /* renamed from: a */
    public int f59372a;

    /* renamed from: b */
    public int f59373b;

    /* renamed from: c */
    public long f59374c;

    /* renamed from: d */
    public int[] f59375d;

    /* renamed from: e */
    public final Map f59376e = new HashMap();

    /* renamed from: f */
    public Map f59377f = new HashMap();

    /* renamed from: com.tom_roush.fontbox.ttf.CmapSubtable$b */
    /* loaded from: classes5.dex */
    public static class C9874b {

        /* renamed from: a */
        public final int f59378a;

        /* renamed from: b */
        public final int f59379b;

        /* renamed from: c */
        public final short f59380c;

        /* renamed from: d */
        public final int f59381d;

        /* renamed from: e */
        public final int m32940e() {
            return this.f59379b;
        }

        /* renamed from: f */
        public final int m32939f() {
            return this.f59378a;
        }

        /* renamed from: g */
        public final short m32938g() {
            return this.f59380c;
        }

        /* renamed from: h */
        public final int m32937h() {
            return this.f59381d;
        }

        public C9874b(int i, int i2, short s, int i3) {
            this.f59378a = i;
            this.f59379b = i2;
            this.f59380c = s;
            this.f59381d = i3;
        }
    }

    /* renamed from: a */
    public final void m32958a(int i) {
        this.f59375d = m32954e(i + 1);
        for (Map.Entry entry : this.f59377f.entrySet()) {
            if (this.f59375d[((Integer) entry.getValue()).intValue()] == -1) {
                this.f59375d[((Integer) entry.getValue()).intValue()] = ((Integer) entry.getKey()).intValue();
            } else {
                List list = (List) this.f59376e.get(entry.getValue());
                if (list == null) {
                    list = new ArrayList();
                    this.f59376e.put(entry.getValue(), list);
                    list.add(Integer.valueOf(this.f59375d[((Integer) entry.getValue()).intValue()]));
                    this.f59375d[((Integer) entry.getValue()).intValue()] = Integer.MIN_VALUE;
                }
                list.add(entry.getKey());
            }
        }
    }

    /* renamed from: b */
    public final int m32957b(int i) {
        if (i >= 0) {
            int[] iArr = this.f59375d;
            if (i < iArr.length) {
                return iArr[i];
            }
            return -1;
        }
        return -1;
    }

    /* renamed from: c */
    public void m32956c(AbstractC22790wQ1 abstractC22790wQ1) {
        this.f59372a = abstractC22790wQ1.mo844t();
        this.f59373b = abstractC22790wQ1.mo844t();
        this.f59374c = abstractC22790wQ1.m845s();
    }

    /* renamed from: d */
    public void m32955d(CmapTable cmapTable, int i, AbstractC22790wQ1 abstractC22790wQ1) {
        abstractC22790wQ1.seek(cmapTable.getOffset() + this.f59374c);
        int mo844t = abstractC22790wQ1.mo844t();
        if (mo844t < 8) {
            abstractC22790wQ1.mo844t();
            abstractC22790wQ1.mo844t();
        } else {
            abstractC22790wQ1.mo844t();
            abstractC22790wQ1.m845s();
            abstractC22790wQ1.m845s();
        }
        if (mo844t != 0) {
            if (mo844t != 2) {
                if (mo844t != 4) {
                    if (mo844t != 6) {
                        if (mo844t != 8) {
                            if (mo844t != 10) {
                                switch (mo844t) {
                                    case 12:
                                        m32951h(abstractC22790wQ1, i);
                                        return;
                                    case 13:
                                        m32950i(abstractC22790wQ1, i);
                                        return;
                                    case 14:
                                        m32949j(abstractC22790wQ1, i);
                                        return;
                                    default:
                                        throw new IOException("Unknown cmap format:" + mo844t);
                                }
                            }
                            m32952g(abstractC22790wQ1, i);
                            return;
                        }
                        m32945n(abstractC22790wQ1, i);
                        return;
                    }
                    m32946m(abstractC22790wQ1, i);
                    return;
                }
                m32947l(abstractC22790wQ1, i);
                return;
            }
            m32948k(abstractC22790wQ1, i);
            return;
        }
        m32953f(abstractC22790wQ1);
    }

    /* renamed from: e */
    public final int[] m32954e(int i) {
        int[] iArr = new int[i];
        Arrays.fill(iArr, -1);
        return iArr;
    }

    /* renamed from: f */
    public void m32953f(AbstractC22790wQ1 abstractC22790wQ1) {
        byte[] m855i = abstractC22790wQ1.m855i(256);
        this.f59375d = m32954e(256);
        this.f59377f = new HashMap(m855i.length);
        for (int i = 0; i < m855i.length; i++) {
            int i2 = m855i[i] & 255;
            this.f59375d[i2] = i;
            this.f59377f.put(Integer.valueOf(i), Integer.valueOf(i2));
        }
    }

    /* renamed from: g */
    public void m32952g(AbstractC22790wQ1 abstractC22790wQ1, int i) {
        long m845s = abstractC22790wQ1.m845s();
        long m845s2 = abstractC22790wQ1.m845s();
        if (m845s2 <= 2147483647L) {
            if (m845s >= 0 && m845s <= 1114111) {
                long j = m845s + m845s2;
                if (j <= 1114111 && (j < 55296 || j > 57343)) {
                    return;
                }
            }
            throw new IOException("Invalid character codes, " + String.format("startCode: 0x%X, numChars: %d", Long.valueOf(m845s), Long.valueOf(m845s2)));
        }
        throw new IOException("Invalid number of Characters");
    }

    @Override // com.tom_roush.fontbox.ttf.CmapLookup
    public List<Integer> getCharCodes(int i) {
        int m32957b = m32957b(i);
        if (m32957b == -1) {
            return null;
        }
        if (m32957b == Integer.MIN_VALUE) {
            List list = (List) this.f59376e.get(Integer.valueOf(i));
            if (list == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList(list);
            Collections.sort(arrayList);
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList(1);
        arrayList2.add(Integer.valueOf(m32957b));
        return arrayList2;
    }

    @Deprecated
    public Integer getCharacterCode(int i) {
        List list;
        int m32957b = m32957b(i);
        if (m32957b == -1) {
            return null;
        }
        if (m32957b == Integer.MIN_VALUE && (list = (List) this.f59376e.get(Integer.valueOf(i))) != null) {
            return (Integer) list.get(0);
        }
        return Integer.valueOf(m32957b);
    }

    @Override // com.tom_roush.fontbox.ttf.CmapLookup
    public int getGlyphId(int i) {
        Integer num = (Integer) this.f59377f.get(Integer.valueOf(i));
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }

    public int getPlatformEncodingId() {
        return this.f59373b;
    }

    public int getPlatformId() {
        return this.f59372a;
    }

    /* renamed from: h */
    public void m32951h(AbstractC22790wQ1 abstractC22790wQ1, int i) {
        long j;
        int i2 = i;
        long m845s = abstractC22790wQ1.m845s();
        this.f59375d = m32954e(i2);
        this.f59377f = new HashMap(i2);
        if (i2 == 0) {
            Log.w("PdfBox-Android", "subtable has no glyphs");
            return;
        }
        long j2 = 0;
        long j3 = 0;
        int i3 = 0;
        while (j3 < m845s) {
            long m845s2 = abstractC22790wQ1.m845s();
            long m845s3 = abstractC22790wQ1.m845s();
            long m845s4 = abstractC22790wQ1.m845s();
            if (m845s2 >= j2 && m845s2 <= 1114111 && (m845s2 < 55296 || m845s2 > 57343)) {
                if ((m845s3 <= j2 || m845s3 >= m845s2) && m845s3 <= 1114111 && (m845s3 < 55296 || m845s3 > 57343)) {
                    long j4 = j2;
                    while (true) {
                        if (j4 <= m845s3 - m845s2) {
                            long j5 = m845s4 + j4;
                            j = m845s;
                            if (j5 >= i2) {
                                Log.w("PdfBox-Android", "Format 12 cmap contains an invalid glyph index");
                                break;
                            }
                            long j6 = m845s2 + j4;
                            if (j6 > 1114111) {
                                Log.w("PdfBox-Android", "Format 12 cmap contains character beyond UCS-4");
                            }
                            int i4 = (int) j5;
                            i3 = Math.max(i3, i4);
                            this.f59377f.put(Integer.valueOf((int) j6), Integer.valueOf(i4));
                            j4++;
                            i2 = i;
                            m845s = j;
                        } else {
                            j = m845s;
                            break;
                        }
                    }
                    j3++;
                    i2 = i;
                    m845s = j;
                    j2 = 0;
                } else {
                    throw new IOException("Invalid character code " + String.format("0x%X", Long.valueOf(m845s3)));
                }
            } else {
                throw new IOException("Invalid character code " + String.format("0x%X", Long.valueOf(m845s2)));
            }
        }
        m32958a(i3);
    }

    /* renamed from: i */
    public void m32950i(AbstractC22790wQ1 abstractC22790wQ1, int i) {
        int i2 = i;
        long m845s = abstractC22790wQ1.m845s();
        this.f59375d = m32954e(i2);
        this.f59377f = new HashMap(i2);
        if (i2 == 0) {
            Log.w("PdfBox-Android", "subtable has no glyphs");
            return;
        }
        long j = 0;
        while (j < m845s) {
            long m845s2 = abstractC22790wQ1.m845s();
            long m845s3 = abstractC22790wQ1.m845s();
            long m845s4 = abstractC22790wQ1.m845s();
            if (m845s4 > i2) {
                Log.w("PdfBox-Android", "Format 13 cmap contains an invalid glyph index");
                return;
            } else if (m845s2 >= 0 && m845s2 <= 1114111 && (m845s2 < 55296 || m845s2 > 57343)) {
                if ((m845s3 <= 0 || m845s3 >= m845s2) && m845s3 <= 1114111 && (m845s3 < 55296 || m845s3 > 57343)) {
                    long j2 = 0;
                    while (j2 <= m845s3 - m845s2) {
                        long j3 = m845s;
                        long j4 = m845s2 + j2;
                        if (j4 <= 2147483647L) {
                            if (j4 > 1114111) {
                                Log.w("PdfBox-Android", "Format 13 cmap contains character beyond UCS-4");
                            }
                            int i3 = (int) m845s4;
                            int i4 = (int) j4;
                            this.f59375d[i3] = i4;
                            this.f59377f.put(Integer.valueOf(i4), Integer.valueOf(i3));
                            j2++;
                            m845s = j3;
                        } else {
                            throw new IOException("Character Code greater than Integer.MAX_VALUE");
                        }
                    }
                    j++;
                    i2 = i;
                } else {
                    throw new IOException("Invalid character code " + String.format("0x%X", Long.valueOf(m845s3)));
                }
            } else {
                throw new IOException("Invalid character code " + String.format("0x%X", Long.valueOf(m845s2)));
            }
        }
    }

    /* renamed from: j */
    public void m32949j(AbstractC22790wQ1 abstractC22790wQ1, int i) {
        Log.w("PdfBox-Android", "Format 14 cmap table is not supported and will be ignored");
    }

    /* renamed from: k */
    public void m32948k(AbstractC22790wQ1 abstractC22790wQ1, int i) {
        C9874b[] c9874bArr;
        int[] iArr = new int[256];
        int i2 = 0;
        for (int i3 = 0; i3 < 256; i3++) {
            int mo844t = abstractC22790wQ1.mo844t();
            iArr[i3] = mo844t;
            i2 = Math.max(i2, mo844t / 8);
        }
        int i4 = i2 + 1;
        C9874b[] c9874bArr2 = new C9874b[i4];
        for (int i5 = 0; i5 <= i2; i5++) {
            c9874bArr2[i5] = new C9874b(abstractC22790wQ1.mo844t(), abstractC22790wQ1.mo844t(), abstractC22790wQ1.mo851m(), (abstractC22790wQ1.mo844t() - (((i4 - i5) - 1) * 8)) - 2);
        }
        long mo858b = abstractC22790wQ1.mo858b();
        this.f59375d = m32954e(i);
        this.f59377f = new HashMap(i);
        if (i == 0) {
            Log.w("PdfBox-Android", "subtable has no glyphs");
            return;
        }
        for (int i6 = 0; i6 <= i2; i6++) {
            C9874b c9874b = c9874bArr2[i6];
            int m32939f = c9874b.m32939f();
            int m32937h = c9874b.m32937h();
            short m32938g = c9874b.m32938g();
            int m32940e = c9874b.m32940e();
            abstractC22790wQ1.seek(m32937h + mo858b);
            int i7 = 0;
            while (i7 < m32940e) {
                int i8 = (i6 << 8) + m32939f + i7;
                int mo844t2 = abstractC22790wQ1.mo844t();
                if (mo844t2 > 0 && (mo844t2 = (mo844t2 + m32938g) % 65536) < 0) {
                    mo844t2 += 65536;
                }
                if (mo844t2 >= i) {
                    StringBuilder sb = new StringBuilder();
                    c9874bArr = c9874bArr2;
                    sb.append("glyphId ");
                    sb.append(mo844t2);
                    sb.append(" for charcode ");
                    sb.append(i8);
                    sb.append(" ignored, numGlyphs is ");
                    sb.append(i);
                    Log.w("PdfBox-Android", sb.toString());
                } else {
                    c9874bArr = c9874bArr2;
                    this.f59375d[mo844t2] = i8;
                    this.f59377f.put(Integer.valueOf(i8), Integer.valueOf(mo844t2));
                }
                i7++;
                c9874bArr2 = c9874bArr;
            }
        }
    }

    /* renamed from: l */
    public void m32947l(AbstractC22790wQ1 abstractC22790wQ1, int i) {
        long j;
        int max;
        int mo844t = abstractC22790wQ1.mo844t() / 2;
        abstractC22790wQ1.mo844t();
        abstractC22790wQ1.mo844t();
        abstractC22790wQ1.mo844t();
        int[] m843u = abstractC22790wQ1.m843u(mo844t);
        abstractC22790wQ1.mo844t();
        int[] m843u2 = abstractC22790wQ1.m843u(mo844t);
        int[] m843u3 = abstractC22790wQ1.m843u(mo844t);
        long mo858b = abstractC22790wQ1.mo858b();
        int[] m843u4 = abstractC22790wQ1.m843u(mo844t);
        this.f59377f = new HashMap(i);
        int i2 = 0;
        int i3 = 0;
        while (i2 < mo844t) {
            int i4 = m843u2[i2];
            int i5 = m843u[i2];
            int i6 = m843u3[i2];
            int i7 = m843u4[i2];
            int i8 = mo844t;
            int[] iArr = m843u;
            int[] iArr2 = m843u2;
            int[] iArr3 = m843u3;
            long j2 = (i2 * 2) + mo858b + i7;
            int i9 = 65535;
            if (i4 != 65535 && i5 != 65535) {
                int i10 = i4;
                while (i10 <= i5) {
                    if (i7 == 0) {
                        j = mo858b;
                        int i11 = (i10 + i6) & i9;
                        max = Math.max(i11, i3);
                        this.f59377f.put(Integer.valueOf(i10), Integer.valueOf(i11));
                    } else {
                        j = mo858b;
                        abstractC22790wQ1.seek(((i10 - i4) * 2) + j2);
                        int mo844t2 = abstractC22790wQ1.mo844t();
                        if (mo844t2 != 0) {
                            int i12 = (mo844t2 + i6) & 65535;
                            max = Math.max(i12, i3);
                            this.f59377f.put(Integer.valueOf(i10), Integer.valueOf(i12));
                        } else {
                            i10++;
                            mo858b = j;
                            i9 = 65535;
                        }
                    }
                    i3 = max;
                    i10++;
                    mo858b = j;
                    i9 = 65535;
                }
            }
            i2++;
            m843u2 = iArr2;
            mo844t = i8;
            m843u = iArr;
            m843u3 = iArr3;
            mo858b = mo858b;
        }
        if (this.f59377f.isEmpty()) {
            Log.w("PdfBox-Android", "cmap format 4 subtable is empty");
        } else {
            m32958a(i3);
        }
    }

    /* renamed from: m */
    public void m32946m(AbstractC22790wQ1 abstractC22790wQ1, int i) {
        int mo844t = abstractC22790wQ1.mo844t();
        int mo844t2 = abstractC22790wQ1.mo844t();
        if (mo844t2 == 0) {
            return;
        }
        this.f59377f = new HashMap(i);
        int[] m843u = abstractC22790wQ1.m843u(mo844t2);
        int i2 = 0;
        for (int i3 = 0; i3 < mo844t2; i3++) {
            i2 = Math.max(i2, m843u[i3]);
            this.f59377f.put(Integer.valueOf(mo844t + i3), Integer.valueOf(m843u[i3]));
        }
        m32958a(i2);
    }

    /* renamed from: n */
    public void m32945n(AbstractC22790wQ1 abstractC22790wQ1, int i) {
        int[] m846r = abstractC22790wQ1.m846r(8192);
        long m845s = abstractC22790wQ1.m845s();
        if (m845s <= PlaybackStateCompat.ACTION_PREPARE_FROM_SEARCH) {
            this.f59375d = m32954e(i);
            this.f59377f = new HashMap(i);
            if (i == 0) {
                Log.w("PdfBox-Android", "subtable has no glyphs");
                return;
            }
            long j = 0;
            long j2 = 0;
            while (j2 < m845s) {
                long m845s2 = abstractC22790wQ1.m845s();
                long m845s3 = abstractC22790wQ1.m845s();
                long m845s4 = abstractC22790wQ1.m845s();
                if (m845s2 <= m845s3 && j <= m845s2) {
                    long j3 = m845s2;
                    while (j3 <= m845s3) {
                        if (j3 <= 2147483647L) {
                            long j4 = m845s;
                            int i2 = (int) j3;
                            int i3 = i2 / 8;
                            long j5 = m845s3;
                            if (i3 < m846r.length) {
                                if ((m846r[i3] & (1 << (i2 % 8))) != 0) {
                                    long j6 = ((((j3 >> 10) + 55232) << 10) + ((1023 & j3) + 56320)) - 56613888;
                                    if (j6 <= 2147483647L) {
                                        i2 = (int) j6;
                                    } else {
                                        throw new IOException("[Sub Format 8] Invalid character code " + j6);
                                    }
                                }
                                long j7 = (j3 - m845s2) + m845s4;
                                int[] iArr = m846r;
                                if (j7 <= i && j7 <= 2147483647L) {
                                    int i4 = (int) j7;
                                    this.f59375d[i4] = i2;
                                    this.f59377f.put(Integer.valueOf(i2), Integer.valueOf(i4));
                                    j3++;
                                    m846r = iArr;
                                    m845s = j4;
                                    m845s3 = j5;
                                } else {
                                    throw new IOException("CMap contains an invalid glyph index");
                                }
                            } else {
                                throw new IOException("[Sub Format 8] Invalid character code " + j3);
                            }
                        } else {
                            throw new IOException("[Sub Format 8] Invalid character code " + j3);
                        }
                    }
                    j2++;
                    m845s = m845s;
                    j = 0;
                } else {
                    throw new IOException("Range invalid");
                }
            }
            return;
        }
        throw new IOException("CMap ( Subtype8 ) is invalid");
    }

    public void setPlatformEncodingId(int i) {
        this.f59373b = i;
    }

    public void setPlatformId(int i) {
        this.f59372a = i;
    }

    public String toString() {
        return "{" + getPlatformId() + HelpFormatter.DEFAULT_LONG_OPT_SEPARATOR + getPlatformEncodingId() + "}";
    }
}
