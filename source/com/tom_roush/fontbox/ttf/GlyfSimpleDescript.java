package com.tom_roush.fontbox.ttf;

/* loaded from: classes5.dex */
public class GlyfSimpleDescript extends GlyfDescript {

    /* renamed from: c */
    public int[] f59406c;

    /* renamed from: d */
    public byte[] f59407d;

    /* renamed from: e */
    public short[] f59408e;

    /* renamed from: f */
    public short[] f59409f;

    /* renamed from: g */
    public final int f59410g;

    public GlyfSimpleDescript() {
        super((short) 0, null);
        this.f59410g = 0;
    }

    /* renamed from: b */
    public final void m32932b(int i, AbstractC22790wQ1 abstractC22790wQ1, short s) {
        short mo851m;
        int m847q;
        short mo851m2;
        int m847q2;
        for (int i2 = 0; i2 < i; i2++) {
            byte b = this.f59407d[i2];
            if ((b & 16) != 0) {
                if ((b & 2) != 0) {
                    mo851m2 = (short) abstractC22790wQ1.m847q();
                } else {
                    this.f59408e[i2] = s;
                }
            } else if ((b & 2) != 0) {
                m847q2 = s - ((short) abstractC22790wQ1.m847q());
                s = (short) m847q2;
                this.f59408e[i2] = s;
            } else {
                mo851m2 = abstractC22790wQ1.mo851m();
            }
            m847q2 = s + mo851m2;
            s = (short) m847q2;
            this.f59408e[i2] = s;
        }
        short s2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            byte b2 = this.f59407d[i3];
            if ((b2 & 32) != 0) {
                if ((b2 & 4) != 0) {
                    mo851m = (short) abstractC22790wQ1.m847q();
                } else {
                    this.f59409f[i3] = s2;
                }
            } else if ((b2 & 4) != 0) {
                m847q = s2 - ((short) abstractC22790wQ1.m847q());
                s2 = (short) m847q;
                this.f59409f[i3] = s2;
            } else {
                mo851m = abstractC22790wQ1.mo851m();
            }
            m847q = s2 + mo851m;
            s2 = (short) m847q;
            this.f59409f[i3] = s2;
        }
    }

    /* renamed from: c */
    public final void m32931c(int i, AbstractC22790wQ1 abstractC22790wQ1) {
        int i2 = 0;
        while (i2 < i) {
            this.f59407d[i2] = (byte) abstractC22790wQ1.m847q();
            if ((this.f59407d[i2] & 8) != 0) {
                int m847q = abstractC22790wQ1.m847q();
                for (int i3 = 1; i3 <= m847q; i3++) {
                    int i4 = i2 + i3;
                    byte[] bArr = this.f59407d;
                    if (i4 >= bArr.length) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("repeat count (");
                        sb.append(m847q);
                        sb.append(") higher than remaining space");
                        return;
                    }
                    bArr[i4] = bArr[i2];
                }
                i2 += m847q;
            }
            i2++;
        }
    }

    @Override // com.tom_roush.fontbox.ttf.GlyphDescription
    public int getEndPtOfContours(int i) {
        return this.f59406c[i];
    }

    @Override // com.tom_roush.fontbox.ttf.GlyphDescription
    public byte getFlags(int i) {
        return this.f59407d[i];
    }

    @Override // com.tom_roush.fontbox.ttf.GlyphDescription
    public int getPointCount() {
        return this.f59410g;
    }

    @Override // com.tom_roush.fontbox.ttf.GlyphDescription
    public short getXCoordinate(int i) {
        return this.f59408e[i];
    }

    @Override // com.tom_roush.fontbox.ttf.GlyphDescription
    public short getYCoordinate(int i) {
        return this.f59409f[i];
    }

    @Override // com.tom_roush.fontbox.ttf.GlyphDescription
    public boolean isComposite() {
        return false;
    }

    public GlyfSimpleDescript(short s, AbstractC22790wQ1 abstractC22790wQ1, short s2) {
        super(s, abstractC22790wQ1);
        if (s == 0) {
            this.f59410g = 0;
            return;
        }
        int[] m843u = abstractC22790wQ1.m843u(s);
        this.f59406c = m843u;
        int i = m843u[s - 1];
        if (s == 1 && i == 65535) {
            this.f59410g = 0;
            return;
        }
        int i2 = i + 1;
        this.f59410g = i2;
        this.f59407d = new byte[i2];
        this.f59408e = new short[i2];
        this.f59409f = new short[i2];
        m32933a(abstractC22790wQ1, abstractC22790wQ1.mo844t());
        m32931c(i2, abstractC22790wQ1);
        m32932b(i2, abstractC22790wQ1, s2);
    }
}
