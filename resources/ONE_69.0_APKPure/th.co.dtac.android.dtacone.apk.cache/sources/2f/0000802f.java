package com.bumptech.glide.gifdecoder;

import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;

/* loaded from: classes3.dex */
public class GifHeaderParser {

    /* renamed from: b */
    public ByteBuffer f41815b;

    /* renamed from: c */
    public GifHeader f41816c;

    /* renamed from: a */
    public final byte[] f41814a = new byte[256];

    /* renamed from: d */
    public int f41817d = 0;

    /* renamed from: a */
    public final boolean m50529a() {
        if (this.f41816c.f41802b != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public final int m50528b() {
        try {
            return this.f41815b.get() & 255;
        } catch (Exception unused) {
            this.f41816c.f41802b = 1;
            return 0;
        }
    }

    /* renamed from: c */
    public final void m50527c() {
        boolean z;
        this.f41816c.f41804d.f108313a = m50518l();
        this.f41816c.f41804d.f108314b = m50518l();
        this.f41816c.f41804d.f108315c = m50518l();
        this.f41816c.f41804d.f108316d = m50518l();
        int m50528b = m50528b();
        boolean z2 = false;
        if ((m50528b & 128) != 0) {
            z = true;
        } else {
            z = false;
        }
        int pow = (int) Math.pow(2.0d, (m50528b & 7) + 1);
        C22801w60 c22801w60 = this.f41816c.f41804d;
        if ((m50528b & 64) != 0) {
            z2 = true;
        }
        c22801w60.f108317e = z2;
        if (z) {
            c22801w60.f108323k = m50525e(pow);
        } else {
            c22801w60.f108323k = null;
        }
        this.f41816c.f41804d.f108322j = this.f41815b.position();
        m50515o();
        if (m50529a()) {
            return;
        }
        GifHeader gifHeader = this.f41816c;
        gifHeader.f41803c++;
        gifHeader.f41805e.add(gifHeader.f41804d);
    }

    public void clear() {
        this.f41815b = null;
        this.f41816c = null;
    }

    /* renamed from: d */
    public final void m50526d() {
        int m50528b = m50528b();
        this.f41817d = m50528b;
        if (m50528b > 0) {
            int i = 0;
            int i2 = 0;
            while (true) {
                try {
                    i2 = this.f41817d;
                    if (i < i2) {
                        i2 -= i;
                        this.f41815b.get(this.f41814a, i, i2);
                        i += i2;
                    } else {
                        return;
                    }
                } catch (Exception unused) {
                    if (Log.isLoggable("GifHeaderParser", 3)) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("Error Reading Block n: ");
                        sb.append(i);
                        sb.append(" count: ");
                        sb.append(i2);
                        sb.append(" blockSize: ");
                        sb.append(this.f41817d);
                    }
                    this.f41816c.f41802b = 1;
                    return;
                }
            }
        }
    }

    /* renamed from: e */
    public final int[] m50525e(int i) {
        byte[] bArr = new byte[i * 3];
        int[] iArr = null;
        try {
            this.f41815b.get(bArr);
            iArr = new int[256];
            int i2 = 0;
            int i3 = 0;
            while (i2 < i) {
                int i4 = i3 + 2;
                i3 += 3;
                int i5 = i2 + 1;
                iArr[i2] = ((bArr[i3 + 1] & 255) << 8) | ((bArr[i3] & 255) << 16) | (-16777216) | (bArr[i4] & 255);
                i2 = i5;
            }
        } catch (BufferUnderflowException unused) {
            Log.isLoggable("GifHeaderParser", 3);
            this.f41816c.f41802b = 1;
        }
        return iArr;
    }

    /* renamed from: f */
    public final void m50524f() {
        m50523g(Integer.MAX_VALUE);
    }

    /* renamed from: g */
    public final void m50523g(int i) {
        boolean z = false;
        while (!z && !m50529a() && this.f41816c.f41803c <= i) {
            int m50528b = m50528b();
            if (m50528b != 33) {
                if (m50528b != 44) {
                    if (m50528b != 59) {
                        this.f41816c.f41802b = 1;
                    } else {
                        z = true;
                    }
                } else {
                    GifHeader gifHeader = this.f41816c;
                    if (gifHeader.f41804d == null) {
                        gifHeader.f41804d = new C22801w60();
                    }
                    m50527c();
                }
            } else {
                int m50528b2 = m50528b();
                if (m50528b2 != 1) {
                    if (m50528b2 != 249) {
                        if (m50528b2 != 254) {
                            if (m50528b2 != 255) {
                                m50516n();
                            } else {
                                m50526d();
                                StringBuilder sb = new StringBuilder();
                                for (int i2 = 0; i2 < 11; i2++) {
                                    sb.append((char) this.f41814a[i2]);
                                }
                                if (sb.toString().equals("NETSCAPE2.0")) {
                                    m50519k();
                                } else {
                                    m50516n();
                                }
                            }
                        } else {
                            m50516n();
                        }
                    } else {
                        this.f41816c.f41804d = new C22801w60();
                        m50522h();
                    }
                } else {
                    m50516n();
                }
            }
        }
    }

    /* renamed from: h */
    public final void m50522h() {
        m50528b();
        int m50528b = m50528b();
        C22801w60 c22801w60 = this.f41816c.f41804d;
        int i = (m50528b & 28) >> 2;
        c22801w60.f108319g = i;
        boolean z = true;
        if (i == 0) {
            c22801w60.f108319g = 1;
        }
        if ((m50528b & 1) == 0) {
            z = false;
        }
        c22801w60.f108318f = z;
        int m50518l = m50518l();
        if (m50518l < 2) {
            m50518l = 10;
        }
        C22801w60 c22801w602 = this.f41816c.f41804d;
        c22801w602.f108321i = m50518l * 10;
        c22801w602.f108320h = m50528b();
        m50528b();
    }

    /* renamed from: i */
    public final void m50521i() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 6; i++) {
            sb.append((char) m50528b());
        }
        if (!sb.toString().startsWith("GIF")) {
            this.f41816c.f41802b = 1;
            return;
        }
        m50520j();
        if (this.f41816c.f41808h && !m50529a()) {
            GifHeader gifHeader = this.f41816c;
            gifHeader.f41801a = m50525e(gifHeader.f41809i);
            GifHeader gifHeader2 = this.f41816c;
            gifHeader2.f41812l = gifHeader2.f41801a[gifHeader2.f41810j];
        }
    }

    public boolean isAnimated() {
        m50521i();
        if (!m50529a()) {
            m50523g(2);
        }
        if (this.f41816c.f41803c > 1) {
            return true;
        }
        return false;
    }

    /* renamed from: j */
    public final void m50520j() {
        boolean z;
        this.f41816c.f41806f = m50518l();
        this.f41816c.f41807g = m50518l();
        int m50528b = m50528b();
        GifHeader gifHeader = this.f41816c;
        if ((m50528b & 128) != 0) {
            z = true;
        } else {
            z = false;
        }
        gifHeader.f41808h = z;
        gifHeader.f41809i = (int) Math.pow(2.0d, (m50528b & 7) + 1);
        this.f41816c.f41810j = m50528b();
        this.f41816c.f41811k = m50528b();
    }

    /* renamed from: k */
    public final void m50519k() {
        do {
            m50526d();
            byte[] bArr = this.f41814a;
            if (bArr[0] == 1) {
                this.f41816c.f41813m = ((bArr[2] & 255) << 8) | (bArr[1] & 255);
            }
            if (this.f41817d <= 0) {
                return;
            }
        } while (!m50529a());
    }

    /* renamed from: l */
    public final int m50518l() {
        return this.f41815b.getShort();
    }

    /* renamed from: m */
    public final void m50517m() {
        this.f41815b = null;
        Arrays.fill(this.f41814a, (byte) 0);
        this.f41816c = new GifHeader();
        this.f41817d = 0;
    }

    /* renamed from: n */
    public final void m50516n() {
        int m50528b;
        do {
            m50528b = m50528b();
            this.f41815b.position(Math.min(this.f41815b.position() + m50528b, this.f41815b.limit()));
        } while (m50528b > 0);
    }

    /* renamed from: o */
    public final void m50515o() {
        m50528b();
        m50516n();
    }

    @NonNull
    public GifHeader parseHeader() {
        if (this.f41815b != null) {
            if (m50529a()) {
                return this.f41816c;
            }
            m50521i();
            if (!m50529a()) {
                m50524f();
                GifHeader gifHeader = this.f41816c;
                if (gifHeader.f41803c < 0) {
                    gifHeader.f41802b = 1;
                }
            }
            return this.f41816c;
        }
        throw new IllegalStateException("You must call setData() before parseHeader()");
    }

    public GifHeaderParser setData(@NonNull ByteBuffer byteBuffer) {
        m50517m();
        ByteBuffer asReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
        this.f41815b = asReadOnlyBuffer;
        asReadOnlyBuffer.position(0);
        this.f41815b.order(ByteOrder.LITTLE_ENDIAN);
        return this;
    }

    public GifHeaderParser setData(@Nullable byte[] bArr) {
        if (bArr != null) {
            setData(ByteBuffer.wrap(bArr));
        } else {
            this.f41815b = null;
            this.f41816c.f41802b = 2;
        }
        return this;
    }
}