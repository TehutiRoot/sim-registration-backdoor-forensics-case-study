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
    public static final byte[] f11396g = "Exif\u0000\u0000".getBytes(C17216zT.f109384e);

    /* renamed from: a */
    public final ExifData f11397a;

    /* renamed from: b */
    public final byte[] f11398b;

    /* renamed from: c */
    public final ByteBuffer f11399c;

    /* renamed from: d */
    public int f11400d;

    /* renamed from: e */
    public int f11401e;

    /* renamed from: f */
    public int f11402f;

    /* renamed from: androidx.camera.core.impl.utils.ExifOutputStream$a */
    /* loaded from: classes.dex */
    public static final class C2522a {
        /* renamed from: a */
        public static boolean m62801a(short s) {
            return (s < -64 || s > -49 || s == -60 || s == -56 || s == -52) ? false : true;
        }
    }

    public ExifOutputStream(@NonNull OutputStream outputStream, @NonNull ExifData exifData) {
        super(new BufferedOutputStream(outputStream, 65536));
        this.f11398b = new byte[1];
        this.f11399c = ByteBuffer.allocate(4);
        this.f11400d = 0;
        this.f11397a = exifData;
    }

    /* renamed from: b */
    public final int m62803b(int i, byte[] bArr, int i2, int i3) {
        int min = Math.min(i3, i - this.f11399c.position());
        this.f11399c.put(bArr, i2, min);
        return min;
    }

    /* renamed from: d */
    public final void m62802d(C1458Uf c1458Uf) {
        C0104BT[] c0104btArr;
        short s;
        C0104BT[][] c0104btArr2 = ExifData.f11379i;
        int[] iArr = new int[c0104btArr2.length];
        int[] iArr2 = new int[c0104btArr2.length];
        for (C0104BT c0104bt : ExifData.f11377g) {
            for (int i = 0; i < ExifData.f11379i.length; i++) {
                this.f11397a.m62811a(i).remove(c0104bt.f403b);
            }
        }
        if (!this.f11397a.m62811a(1).isEmpty()) {
            this.f11397a.m62811a(0).put(ExifData.f11377g[1].f403b, C17216zT.m130f(0L, this.f11397a.getByteOrder()));
        }
        if (!this.f11397a.m62811a(2).isEmpty()) {
            this.f11397a.m62811a(0).put(ExifData.f11377g[2].f403b, C17216zT.m130f(0L, this.f11397a.getByteOrder()));
        }
        if (!this.f11397a.m62811a(3).isEmpty()) {
            this.f11397a.m62811a(1).put(ExifData.f11377g[3].f403b, C17216zT.m130f(0L, this.f11397a.getByteOrder()));
        }
        for (int i2 = 0; i2 < ExifData.f11379i.length; i2++) {
            int i3 = 0;
            for (Map.Entry entry : this.f11397a.m62811a(i2).entrySet()) {
                int m123m = ((C17216zT) entry.getValue()).m123m();
                if (m123m > 4) {
                    i3 += m123m;
                }
            }
            iArr2[i2] = iArr2[i2] + i3;
        }
        int i4 = 8;
        for (int i5 = 0; i5 < ExifData.f11379i.length; i5++) {
            if (!this.f11397a.m62811a(i5).isEmpty()) {
                iArr[i5] = i4;
                i4 += (this.f11397a.m62811a(i5).size() * 12) + 6 + iArr2[i5];
            }
        }
        int i6 = i4 + 8;
        if (!this.f11397a.m62811a(1).isEmpty()) {
            this.f11397a.m62811a(0).put(ExifData.f11377g[1].f403b, C17216zT.m130f(iArr[1], this.f11397a.getByteOrder()));
        }
        if (!this.f11397a.m62811a(2).isEmpty()) {
            this.f11397a.m62811a(0).put(ExifData.f11377g[2].f403b, C17216zT.m130f(iArr[2], this.f11397a.getByteOrder()));
        }
        if (!this.f11397a.m62811a(3).isEmpty()) {
            this.f11397a.m62811a(1).put(ExifData.f11377g[3].f403b, C17216zT.m130f(iArr[3], this.f11397a.getByteOrder()));
        }
        c1458Uf.m66121j(i6);
        c1458Uf.write(f11396g);
        if (this.f11397a.getByteOrder() == ByteOrder.BIG_ENDIAN) {
            s = 19789;
        } else {
            s = 18761;
        }
        c1458Uf.m66123g(s);
        c1458Uf.m66125b(this.f11397a.getByteOrder());
        c1458Uf.m66121j(42);
        c1458Uf.m66122i(8L);
        for (int i7 = 0; i7 < ExifData.f11379i.length; i7++) {
            if (!this.f11397a.m62811a(i7).isEmpty()) {
                c1458Uf.m66121j(this.f11397a.m62811a(i7).size());
                int size = iArr[i7] + 2 + (this.f11397a.m62811a(i7).size() * 12) + 4;
                for (Map.Entry entry2 : this.f11397a.m62811a(i7).entrySet()) {
                    int i8 = ((C0104BT) Preconditions.checkNotNull((C0104BT) ((HashMap) ExifData.Builder.f11386f.get(i7)).get(entry2.getKey()), "Tag not supported: " + ((String) entry2.getKey()) + ". Tag needs to be ported from ExifInterface to ExifData.")).f402a;
                    C17216zT c17216zT = (C17216zT) entry2.getValue();
                    int m123m2 = c17216zT.m123m();
                    c1458Uf.m66121j(i8);
                    c1458Uf.m66121j(c17216zT.f109388a);
                    c1458Uf.m66124d(c17216zT.f109389b);
                    if (m123m2 > 4) {
                        c1458Uf.m66122i(size);
                        size += m123m2;
                    } else {
                        c1458Uf.write(c17216zT.f109391d);
                        if (m123m2 < 4) {
                            while (m123m2 < 4) {
                                c1458Uf.writeByte(0);
                                m123m2++;
                            }
                        }
                    }
                }
                c1458Uf.m66122i(0L);
                for (Map.Entry entry3 : this.f11397a.m62811a(i7).entrySet()) {
                    byte[] bArr = ((C17216zT) entry3.getValue()).f109391d;
                    if (bArr.length > 4) {
                        c1458Uf.write(bArr, 0, bArr.length);
                    }
                }
            }
        }
        c1458Uf.m66125b(ByteOrder.BIG_ENDIAN);
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
        byte[] bArr = this.f11398b;
        bArr[0] = (byte) (i & 255);
        write(bArr);
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(@NonNull byte[] bArr) throws IOException {
        write(bArr, 0, bArr.length);
    }
}