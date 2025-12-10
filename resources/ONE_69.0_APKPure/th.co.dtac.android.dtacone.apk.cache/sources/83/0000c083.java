package com.tom_roush.fontbox.ttf;

/* loaded from: classes5.dex */
public class GlyfSimpleDescript extends GlyfDescript {

    /* renamed from: c */
    public int[] f59418c;

    /* renamed from: d */
    public byte[] f59419d;

    /* renamed from: e */
    public short[] f59420e;

    /* renamed from: f */
    public short[] f59421f;

    /* renamed from: g */
    public final int f59422g;

    public GlyfSimpleDescript() {
        super((short) 0, null);
        this.f59422g = 0;
    }

    /* renamed from: b */
    public final void m32924b(int i, AbstractC22342tR1 abstractC22342tR1, short s) {
        short mo22686m;
        int m22682q;
        short mo22686m2;
        int m22682q2;
        for (int i2 = 0; i2 < i; i2++) {
            byte b = this.f59419d[i2];
            if ((b & 16) != 0) {
                if ((b & 2) != 0) {
                    mo22686m2 = (short) abstractC22342tR1.m22682q();
                } else {
                    this.f59420e[i2] = s;
                }
            } else if ((b & 2) != 0) {
                m22682q2 = s - ((short) abstractC22342tR1.m22682q());
                s = (short) m22682q2;
                this.f59420e[i2] = s;
            } else {
                mo22686m2 = abstractC22342tR1.mo22686m();
            }
            m22682q2 = s + mo22686m2;
            s = (short) m22682q2;
            this.f59420e[i2] = s;
        }
        short s2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            byte b2 = this.f59419d[i3];
            if ((b2 & 32) != 0) {
                if ((b2 & 4) != 0) {
                    mo22686m = (short) abstractC22342tR1.m22682q();
                } else {
                    this.f59421f[i3] = s2;
                }
            } else if ((b2 & 4) != 0) {
                m22682q = s2 - ((short) abstractC22342tR1.m22682q());
                s2 = (short) m22682q;
                this.f59421f[i3] = s2;
            } else {
                mo22686m = abstractC22342tR1.mo22686m();
            }
            m22682q = s2 + mo22686m;
            s2 = (short) m22682q;
            this.f59421f[i3] = s2;
        }
    }

    /* renamed from: c */
    public final void m32923c(int i, AbstractC22342tR1 abstractC22342tR1) {
        int i2 = 0;
        while (i2 < i) {
            this.f59419d[i2] = (byte) abstractC22342tR1.m22682q();
            if ((this.f59419d[i2] & 8) != 0) {
                int m22682q = abstractC22342tR1.m22682q();
                for (int i3 = 1; i3 <= m22682q; i3++) {
                    int i4 = i2 + i3;
                    byte[] bArr = this.f59419d;
                    if (i4 >= bArr.length) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("repeat count (");
                        sb.append(m22682q);
                        sb.append(") higher than remaining space");
                        return;
                    }
                    bArr[i4] = bArr[i2];
                }
                i2 += m22682q;
            }
            i2++;
        }
    }

    @Override // com.tom_roush.fontbox.ttf.GlyphDescription
    public int getEndPtOfContours(int i) {
        return this.f59418c[i];
    }

    @Override // com.tom_roush.fontbox.ttf.GlyphDescription
    public byte getFlags(int i) {
        return this.f59419d[i];
    }

    @Override // com.tom_roush.fontbox.ttf.GlyphDescription
    public int getPointCount() {
        return this.f59422g;
    }

    @Override // com.tom_roush.fontbox.ttf.GlyphDescription
    public short getXCoordinate(int i) {
        return this.f59420e[i];
    }

    @Override // com.tom_roush.fontbox.ttf.GlyphDescription
    public short getYCoordinate(int i) {
        return this.f59421f[i];
    }

    @Override // com.tom_roush.fontbox.ttf.GlyphDescription
    public boolean isComposite() {
        return false;
    }

    public GlyfSimpleDescript(short s, AbstractC22342tR1 abstractC22342tR1, short s2) {
        super(s, abstractC22342tR1);
        if (s == 0) {
            this.f59422g = 0;
            return;
        }
        int[] m22678u = abstractC22342tR1.m22678u(s);
        this.f59418c = m22678u;
        int i = m22678u[s - 1];
        if (s == 1 && i == 65535) {
            this.f59422g = 0;
            return;
        }
        int i2 = i + 1;
        this.f59422g = i2;
        this.f59419d = new byte[i2];
        this.f59420e = new short[i2];
        this.f59421f = new short[i2];
        m32925a(abstractC22342tR1, abstractC22342tR1.mo22679t());
        m32923c(i2, abstractC22342tR1);
        m32924b(i2, abstractC22342tR1, s2);
    }
}