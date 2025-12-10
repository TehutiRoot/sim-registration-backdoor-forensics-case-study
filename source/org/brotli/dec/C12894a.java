package org.brotli.dec;

import java.io.IOException;
import java.io.InputStream;

/* renamed from: org.brotli.dec.a */
/* loaded from: classes6.dex */
public final class C12894a {

    /* renamed from: d */
    public InputStream f75611d;

    /* renamed from: e */
    public boolean f75612e;

    /* renamed from: f */
    public long f75613f;

    /* renamed from: g */
    public int f75614g;

    /* renamed from: h */
    public int f75615h;

    /* renamed from: a */
    public final byte[] f75608a = new byte[4160];

    /* renamed from: b */
    public final int[] f75609b = new int[1040];

    /* renamed from: c */
    public final C20588jf0 f75610c = new C20588jf0();

    /* renamed from: i */
    public int f75616i = 0;

    /* renamed from: a */
    public static void m24414a(C12894a c12894a, boolean z) {
        if (!c12894a.f75612e) {
            return;
        }
        int i = ((c12894a.f75615h << 2) + ((c12894a.f75614g + 7) >> 3)) - 8;
        int i2 = c12894a.f75616i;
        if (i <= i2) {
            if (z && i != i2) {
                throw new BrotliRuntimeException("Unused bytes after end");
            }
            return;
        }
        throw new BrotliRuntimeException("Read after end");
    }

    /* renamed from: b */
    public static void m24413b(C12894a c12894a) {
        InputStream inputStream = c12894a.f75611d;
        c12894a.f75611d = null;
        if (inputStream != null) {
            inputStream.close();
        }
    }

    /* renamed from: c */
    public static void m24412c(C12894a c12894a, byte[] bArr, int i, int i2) {
        if ((c12894a.f75614g & 7) == 0) {
            while (true) {
                int i3 = c12894a.f75614g;
                if (i3 == 64 || i2 == 0) {
                    break;
                }
                bArr[i] = (byte) (c12894a.f75613f >>> i3);
                c12894a.f75614g = i3 + 8;
                i2--;
                i++;
            }
            if (i2 == 0) {
                return;
            }
            int min = Math.min(m24409f(c12894a), i2 >> 2);
            if (min > 0) {
                int i4 = min << 2;
                System.arraycopy(c12894a.f75608a, c12894a.f75615h << 2, bArr, i, i4);
                i += i4;
                i2 -= i4;
                c12894a.f75615h += min;
            }
            if (i2 == 0) {
                return;
            }
            if (m24409f(c12894a) > 0) {
                m24411d(c12894a);
                while (i2 != 0) {
                    long j = c12894a.f75613f;
                    int i5 = c12894a.f75614g;
                    bArr[i] = (byte) (j >>> i5);
                    c12894a.f75614g = i5 + 8;
                    i2--;
                    i++;
                }
                m24414a(c12894a, false);
                return;
            }
            while (i2 > 0) {
                try {
                    int read = c12894a.f75611d.read(bArr, i, i2);
                    if (read != -1) {
                        i += read;
                        i2 -= read;
                    } else {
                        throw new BrotliRuntimeException("Unexpected end of input");
                    }
                } catch (IOException e) {
                    throw new BrotliRuntimeException("Failed to read input", e);
                }
            }
            return;
        }
        throw new BrotliRuntimeException("Unaligned copyBytes");
    }

    /* renamed from: d */
    public static void m24411d(C12894a c12894a) {
        int i = c12894a.f75614g;
        if (i >= 32) {
            int[] iArr = c12894a.f75609b;
            int i2 = c12894a.f75615h;
            c12894a.f75615h = i2 + 1;
            c12894a.f75613f = (iArr[i2] << 32) | (c12894a.f75613f >>> 32);
            c12894a.f75614g = i - 32;
        }
    }

    /* renamed from: e */
    public static void m24410e(C12894a c12894a, InputStream inputStream) {
        if (c12894a.f75611d == null) {
            C20588jf0.m29162b(c12894a.f75610c, c12894a.f75608a, c12894a.f75609b);
            c12894a.f75611d = inputStream;
            c12894a.f75613f = 0L;
            c12894a.f75614g = 64;
            c12894a.f75615h = 1024;
            c12894a.f75612e = false;
            m24407h(c12894a);
            return;
        }
        throw new IllegalStateException("Bit reader already has associated input stream");
    }

    /* renamed from: f */
    public static int m24409f(C12894a c12894a) {
        int i;
        if (c12894a.f75612e) {
            i = (c12894a.f75616i + 3) >> 2;
        } else {
            i = 1024;
        }
        return i - c12894a.f75615h;
    }

    /* renamed from: g */
    public static void m24408g(C12894a c12894a) {
        int i = (64 - c12894a.f75614g) & 7;
        if (i != 0 && m24406i(c12894a, i) != 0) {
            throw new BrotliRuntimeException("Corrupted padding bits");
        }
    }

    /* renamed from: h */
    public static void m24407h(C12894a c12894a) {
        m24405j(c12894a);
        m24414a(c12894a, false);
        m24411d(c12894a);
        m24411d(c12894a);
    }

    /* renamed from: i */
    public static int m24406i(C12894a c12894a, int i) {
        m24411d(c12894a);
        long j = c12894a.f75613f;
        int i2 = c12894a.f75614g;
        int i3 = ((int) (j >>> i2)) & ((1 << i) - 1);
        c12894a.f75614g = i2 + i;
        return i3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0037, code lost:
        r4.f75612e = true;
        r4.f75616i = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x003c, code lost:
        r1 = r1 + 3;
     */
    /* renamed from: j */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void m24405j(org.brotli.dec.C12894a r4) {
        /*
            int r0 = r4.f75615h
            r1 = 1015(0x3f7, float:1.422E-42)
            if (r0 > r1) goto L7
            return
        L7:
            boolean r1 = r4.f75612e
            if (r1 == 0) goto L1b
            int r4 = m24409f(r4)
            r0 = -2
            if (r4 < r0) goto L13
            return
        L13:
            org.brotli.dec.BrotliRuntimeException r4 = new org.brotli.dec.BrotliRuntimeException
            java.lang.String r0 = "No more input"
            r4.<init>(r0)
            throw r4
        L1b:
            int r0 = r0 << 2
            int r1 = 4096 - r0
            byte[] r2 = r4.f75608a
            r3 = 0
            java.lang.System.arraycopy(r2, r0, r2, r3, r1)
            r4.f75615h = r3
        L27:
            r0 = 4096(0x1000, float:5.74E-42)
            if (r1 >= r0) goto L4b
            java.io.InputStream r0 = r4.f75611d     // Catch: java.io.IOException -> L3f
            byte[] r2 = r4.f75608a     // Catch: java.io.IOException -> L3f
            int r3 = 4096 - r1
            int r0 = r0.read(r2, r1, r3)     // Catch: java.io.IOException -> L3f
            if (r0 > 0) goto L41
            r0 = 1
            r4.f75612e = r0     // Catch: java.io.IOException -> L3f
            r4.f75616i = r1     // Catch: java.io.IOException -> L3f
            int r1 = r1 + 3
            goto L4b
        L3f:
            r4 = move-exception
            goto L43
        L41:
            int r1 = r1 + r0
            goto L27
        L43:
            org.brotli.dec.BrotliRuntimeException r0 = new org.brotli.dec.BrotliRuntimeException
            java.lang.String r1 = "Failed to read input"
            r0.<init>(r1, r4)
            throw r0
        L4b:
            jf0 r4 = r4.f75610c
            int r0 = r1 >> 2
            p000.C20588jf0.m29163a(r4, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.brotli.dec.C12894a.m24405j(org.brotli.dec.a):void");
    }

    /* renamed from: k */
    public static void m24404k(C12894a c12894a) {
        if (c12894a.f75614g == 64) {
            m24407h(c12894a);
        }
    }
}
