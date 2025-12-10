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
    public ByteBuffer f41803b;

    /* renamed from: c */
    public GifHeader f41804c;

    /* renamed from: a */
    public final byte[] f41802a = new byte[256];

    /* renamed from: d */
    public int f41805d = 0;

    /* renamed from: a */
    public final boolean m50532a() {
        if (this.f41804c.f41790b != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public final int m50531b() {
        try {
            return this.f41803b.get() & 255;
        } catch (Exception unused) {
            this.f41804c.f41790b = 1;
            return 0;
        }
    }

    /* renamed from: c */
    public final void m50530c() {
        boolean z;
        this.f41804c.f41792d.f76859a = m50521l();
        this.f41804c.f41792d.f76860b = m50521l();
        this.f41804c.f41792d.f76861c = m50521l();
        this.f41804c.f41792d.f76862d = m50521l();
        int m50531b = m50531b();
        boolean z2 = false;
        if ((m50531b & 128) != 0) {
            z = true;
        } else {
            z = false;
        }
        int pow = (int) Math.pow(2.0d, (m50531b & 7) + 1);
        C21701q60 c21701q60 = this.f41804c.f41792d;
        if ((m50531b & 64) != 0) {
            z2 = true;
        }
        c21701q60.f76863e = z2;
        if (z) {
            c21701q60.f76869k = m50528e(pow);
        } else {
            c21701q60.f76869k = null;
        }
        this.f41804c.f41792d.f76868j = this.f41803b.position();
        m50518o();
        if (m50532a()) {
            return;
        }
        GifHeader gifHeader = this.f41804c;
        gifHeader.f41791c++;
        gifHeader.f41793e.add(gifHeader.f41792d);
    }

    public void clear() {
        this.f41803b = null;
        this.f41804c = null;
    }

    /* renamed from: d */
    public final void m50529d() {
        int m50531b = m50531b();
        this.f41805d = m50531b;
        if (m50531b > 0) {
            int i = 0;
            int i2 = 0;
            while (true) {
                try {
                    i2 = this.f41805d;
                    if (i < i2) {
                        i2 -= i;
                        this.f41803b.get(this.f41802a, i, i2);
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
                        sb.append(this.f41805d);
                    }
                    this.f41804c.f41790b = 1;
                    return;
                }
            }
        }
    }

    /* renamed from: e */
    public final int[] m50528e(int i) {
        byte[] bArr = new byte[i * 3];
        int[] iArr = null;
        try {
            this.f41803b.get(bArr);
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
            this.f41804c.f41790b = 1;
        }
        return iArr;
    }

    /* renamed from: f */
    public final void m50527f() {
        m50526g(Integer.MAX_VALUE);
    }

    /* renamed from: g */
    public final void m50526g(int i) {
        boolean z = false;
        while (!z && !m50532a() && this.f41804c.f41791c <= i) {
            int m50531b = m50531b();
            if (m50531b != 33) {
                if (m50531b != 44) {
                    if (m50531b != 59) {
                        this.f41804c.f41790b = 1;
                    } else {
                        z = true;
                    }
                } else {
                    GifHeader gifHeader = this.f41804c;
                    if (gifHeader.f41792d == null) {
                        gifHeader.f41792d = new C21701q60();
                    }
                    m50530c();
                }
            } else {
                int m50531b2 = m50531b();
                if (m50531b2 != 1) {
                    if (m50531b2 != 249) {
                        if (m50531b2 != 254) {
                            if (m50531b2 != 255) {
                                m50519n();
                            } else {
                                m50529d();
                                StringBuilder sb = new StringBuilder();
                                for (int i2 = 0; i2 < 11; i2++) {
                                    sb.append((char) this.f41802a[i2]);
                                }
                                if (sb.toString().equals("NETSCAPE2.0")) {
                                    m50522k();
                                } else {
                                    m50519n();
                                }
                            }
                        } else {
                            m50519n();
                        }
                    } else {
                        this.f41804c.f41792d = new C21701q60();
                        m50525h();
                    }
                } else {
                    m50519n();
                }
            }
        }
    }

    /* renamed from: h */
    public final void m50525h() {
        m50531b();
        int m50531b = m50531b();
        C21701q60 c21701q60 = this.f41804c.f41792d;
        int i = (m50531b & 28) >> 2;
        c21701q60.f76865g = i;
        boolean z = true;
        if (i == 0) {
            c21701q60.f76865g = 1;
        }
        if ((m50531b & 1) == 0) {
            z = false;
        }
        c21701q60.f76864f = z;
        int m50521l = m50521l();
        if (m50521l < 2) {
            m50521l = 10;
        }
        C21701q60 c21701q602 = this.f41804c.f41792d;
        c21701q602.f76867i = m50521l * 10;
        c21701q602.f76866h = m50531b();
        m50531b();
    }

    /* renamed from: i */
    public final void m50524i() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 6; i++) {
            sb.append((char) m50531b());
        }
        if (!sb.toString().startsWith("GIF")) {
            this.f41804c.f41790b = 1;
            return;
        }
        m50523j();
        if (this.f41804c.f41796h && !m50532a()) {
            GifHeader gifHeader = this.f41804c;
            gifHeader.f41789a = m50528e(gifHeader.f41797i);
            GifHeader gifHeader2 = this.f41804c;
            gifHeader2.f41800l = gifHeader2.f41789a[gifHeader2.f41798j];
        }
    }

    public boolean isAnimated() {
        m50524i();
        if (!m50532a()) {
            m50526g(2);
        }
        if (this.f41804c.f41791c > 1) {
            return true;
        }
        return false;
    }

    /* renamed from: j */
    public final void m50523j() {
        boolean z;
        this.f41804c.f41794f = m50521l();
        this.f41804c.f41795g = m50521l();
        int m50531b = m50531b();
        GifHeader gifHeader = this.f41804c;
        if ((m50531b & 128) != 0) {
            z = true;
        } else {
            z = false;
        }
        gifHeader.f41796h = z;
        gifHeader.f41797i = (int) Math.pow(2.0d, (m50531b & 7) + 1);
        this.f41804c.f41798j = m50531b();
        this.f41804c.f41799k = m50531b();
    }

    /* renamed from: k */
    public final void m50522k() {
        do {
            m50529d();
            byte[] bArr = this.f41802a;
            if (bArr[0] == 1) {
                this.f41804c.f41801m = ((bArr[2] & 255) << 8) | (bArr[1] & 255);
            }
            if (this.f41805d <= 0) {
                return;
            }
        } while (!m50532a());
    }

    /* renamed from: l */
    public final int m50521l() {
        return this.f41803b.getShort();
    }

    /* renamed from: m */
    public final void m50520m() {
        this.f41803b = null;
        Arrays.fill(this.f41802a, (byte) 0);
        this.f41804c = new GifHeader();
        this.f41805d = 0;
    }

    /* renamed from: n */
    public final void m50519n() {
        int m50531b;
        do {
            m50531b = m50531b();
            this.f41803b.position(Math.min(this.f41803b.position() + m50531b, this.f41803b.limit()));
        } while (m50531b > 0);
    }

    /* renamed from: o */
    public final void m50518o() {
        m50531b();
        m50519n();
    }

    @NonNull
    public GifHeader parseHeader() {
        if (this.f41803b != null) {
            if (m50532a()) {
                return this.f41804c;
            }
            m50524i();
            if (!m50532a()) {
                m50527f();
                GifHeader gifHeader = this.f41804c;
                if (gifHeader.f41791c < 0) {
                    gifHeader.f41790b = 1;
                }
            }
            return this.f41804c;
        }
        throw new IllegalStateException("You must call setData() before parseHeader()");
    }

    public GifHeaderParser setData(@NonNull ByteBuffer byteBuffer) {
        m50520m();
        ByteBuffer asReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
        this.f41803b = asReadOnlyBuffer;
        asReadOnlyBuffer.position(0);
        this.f41803b.order(ByteOrder.LITTLE_ENDIAN);
        return this;
    }

    public GifHeaderParser setData(@Nullable byte[] bArr) {
        if (bArr != null) {
            setData(ByteBuffer.wrap(bArr));
        } else {
            this.f41803b = null;
            this.f41804c.f41790b = 2;
        }
        return this;
    }
}
