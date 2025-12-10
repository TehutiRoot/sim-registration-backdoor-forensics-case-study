package androidx.camera.core.impl.utils;

import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.camera.core.impl.utils.ExifData;
import androidx.core.util.Preconditions;
import java.io.BufferedOutputStream;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.HashMap;
import java.util.Map;

@RequiresApi(21)
/* loaded from: classes.dex */
public final class ExifOutputStream extends FilterOutputStream {

    /* renamed from: g */
    public static final byte[] f11308g = "Exif\u0000\u0000".getBytes(C16897vT.f107688e);

    /* renamed from: a */
    public final ExifData f11309a;

    /* renamed from: b */
    public final byte[] f11310b;

    /* renamed from: c */
    public final ByteBuffer f11311c;

    /* renamed from: d */
    public int f11312d;

    /* renamed from: e */
    public int f11313e;

    /* renamed from: f */
    public int f11314f;

    /* renamed from: androidx.camera.core.impl.utils.ExifOutputStream$a */
    /* loaded from: classes.dex */
    public static final class C2540a {
        /* renamed from: a */
        public static boolean m62853a(short s) {
            return (s < -64 || s > -49 || s == -60 || s == -56 || s == -52) ? false : true;
        }
    }

    public ExifOutputStream(@NonNull OutputStream outputStream, @NonNull ExifData exifData) {
        super(new BufferedOutputStream(outputStream, 65536));
        this.f11310b = new byte[1];
        this.f11311c = ByteBuffer.allocate(4);
        this.f11312d = 0;
        this.f11309a = exifData;
    }

    /* renamed from: b */
    public final int m62855b(int i, byte[] bArr, int i2, int i3) {
        int min = Math.min(i3, i - this.f11311c.position());
        this.f11311c.put(bArr, i2, min);
        return min;
    }

    /* renamed from: d */
    public final void m62854d(C1478Uf c1478Uf) {
        C17050xT[] c17050xTArr;
        short s;
        C17050xT[][] c17050xTArr2 = ExifData.f11291i;
        int[] iArr = new int[c17050xTArr2.length];
        int[] iArr2 = new int[c17050xTArr2.length];
        for (C17050xT c17050xT : ExifData.f11289g) {
            for (int i = 0; i < ExifData.f11291i.length; i++) {
                this.f11309a.m62863a(i).remove(c17050xT.f108379b);
            }
        }
        if (!this.f11309a.m62863a(1).isEmpty()) {
            this.f11309a.m62863a(0).put(ExifData.f11289g[1].f108379b, C16897vT.m1037f(0L, this.f11309a.getByteOrder()));
        }
        if (!this.f11309a.m62863a(2).isEmpty()) {
            this.f11309a.m62863a(0).put(ExifData.f11289g[2].f108379b, C16897vT.m1037f(0L, this.f11309a.getByteOrder()));
        }
        if (!this.f11309a.m62863a(3).isEmpty()) {
            this.f11309a.m62863a(1).put(ExifData.f11289g[3].f108379b, C16897vT.m1037f(0L, this.f11309a.getByteOrder()));
        }
        for (int i2 = 0; i2 < ExifData.f11291i.length; i2++) {
            int i3 = 0;
            for (Map.Entry entry : this.f11309a.m62863a(i2).entrySet()) {
                int m1030m = ((C16897vT) entry.getValue()).m1030m();
                if (m1030m > 4) {
                    i3 += m1030m;
                }
            }
            iArr2[i2] = iArr2[i2] + i3;
        }
        int i4 = 8;
        for (int i5 = 0; i5 < ExifData.f11291i.length; i5++) {
            if (!this.f11309a.m62863a(i5).isEmpty()) {
                iArr[i5] = i4;
                i4 += (this.f11309a.m62863a(i5).size() * 12) + 6 + iArr2[i5];
            }
        }
        int i6 = i4 + 8;
        if (!this.f11309a.m62863a(1).isEmpty()) {
            this.f11309a.m62863a(0).put(ExifData.f11289g[1].f108379b, C16897vT.m1037f(iArr[1], this.f11309a.getByteOrder()));
        }
        if (!this.f11309a.m62863a(2).isEmpty()) {
            this.f11309a.m62863a(0).put(ExifData.f11289g[2].f108379b, C16897vT.m1037f(iArr[2], this.f11309a.getByteOrder()));
        }
        if (!this.f11309a.m62863a(3).isEmpty()) {
            this.f11309a.m62863a(1).put(ExifData.f11289g[3].f108379b, C16897vT.m1037f(iArr[3], this.f11309a.getByteOrder()));
        }
        c1478Uf.m65991j(i6);
        c1478Uf.write(f11308g);
        if (this.f11309a.getByteOrder() == ByteOrder.BIG_ENDIAN) {
            s = 19789;
        } else {
            s = 18761;
        }
        c1478Uf.m65993g(s);
        c1478Uf.m65995b(this.f11309a.getByteOrder());
        c1478Uf.m65991j(42);
        c1478Uf.m65992i(8L);
        for (int i7 = 0; i7 < ExifData.f11291i.length; i7++) {
            if (!this.f11309a.m62863a(i7).isEmpty()) {
                c1478Uf.m65991j(this.f11309a.m62863a(i7).size());
                int size = iArr[i7] + 2 + (this.f11309a.m62863a(i7).size() * 12) + 4;
                for (Map.Entry entry2 : this.f11309a.m62863a(i7).entrySet()) {
                    int i8 = ((C17050xT) Preconditions.checkNotNull((C17050xT) ((HashMap) ExifData.Builder.f11298f.get(i7)).get(entry2.getKey()), "Tag not supported: " + ((String) entry2.getKey()) + ". Tag needs to be ported from ExifInterface to ExifData.")).f108378a;
                    C16897vT c16897vT = (C16897vT) entry2.getValue();
                    int m1030m2 = c16897vT.m1030m();
                    c1478Uf.m65991j(i8);
                    c1478Uf.m65991j(c16897vT.f107692a);
                    c1478Uf.m65994d(c16897vT.f107693b);
                    if (m1030m2 > 4) {
                        c1478Uf.m65992i(size);
                        size += m1030m2;
                    } else {
                        c1478Uf.write(c16897vT.f107695d);
                        if (m1030m2 < 4) {
                            while (m1030m2 < 4) {
                                c1478Uf.writeByte(0);
                                m1030m2++;
                            }
                        }
                    }
                }
                c1478Uf.m65992i(0L);
                for (Map.Entry entry3 : this.f11309a.m62863a(i7).entrySet()) {
                    byte[] bArr = ((C16897vT) entry3.getValue()).f107695d;
                    if (bArr.length > 4) {
                        c1478Uf.write(bArr, 0, bArr.length);
                    }
                }
            }
        }
        c1478Uf.m65995b(ByteOrder.BIG_ENDIAN);
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x0106, code lost:
        if (r9 <= 0) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0108, code lost:
        ((java.io.FilterOutputStream) r6).out.write(r7, r8, r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x010d, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:?, code lost:
        return;
     */
    @Override // java.io.FilterOutputStream, java.io.OutputStream
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void write(@androidx.annotation.NonNull byte[] r7, int r8, int r9) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 270
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.core.impl.utils.ExifOutputStream.write(byte[], int, int):void");
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(int i) throws IOException {
        byte[] bArr = this.f11310b;
        bArr[0] = (byte) (i & 255);
        write(bArr);
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(@NonNull byte[] bArr) throws IOException {
        write(bArr, 0, bArr.length);
    }
}
