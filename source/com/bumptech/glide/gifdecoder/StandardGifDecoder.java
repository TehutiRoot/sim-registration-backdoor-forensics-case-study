package com.bumptech.glide.gifdecoder;

import android.graphics.Bitmap;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.FragmentTransaction;
import com.bumptech.glide.gifdecoder.GifDecoder;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
import java.util.Iterator;

/* loaded from: classes3.dex */
public class StandardGifDecoder implements GifDecoder {

    /* renamed from: v */
    public static final String f41806v = "StandardGifDecoder";

    /* renamed from: a */
    public int[] f41807a;

    /* renamed from: b */
    public final int[] f41808b;

    /* renamed from: c */
    public final GifDecoder.BitmapProvider f41809c;

    /* renamed from: d */
    public ByteBuffer f41810d;

    /* renamed from: e */
    public byte[] f41811e;

    /* renamed from: f */
    public GifHeaderParser f41812f;

    /* renamed from: g */
    public short[] f41813g;

    /* renamed from: h */
    public byte[] f41814h;

    /* renamed from: i */
    public byte[] f41815i;

    /* renamed from: j */
    public byte[] f41816j;

    /* renamed from: k */
    public int[] f41817k;

    /* renamed from: l */
    public int f41818l;

    /* renamed from: m */
    public GifHeader f41819m;

    /* renamed from: n */
    public Bitmap f41820n;

    /* renamed from: o */
    public boolean f41821o;

    /* renamed from: p */
    public int f41822p;

    /* renamed from: q */
    public int f41823q;

    /* renamed from: r */
    public int f41824r;

    /* renamed from: s */
    public int f41825s;

    /* renamed from: t */
    public Boolean f41826t;

    /* renamed from: u */
    public Bitmap.Config f41827u;

    public StandardGifDecoder(@NonNull GifDecoder.BitmapProvider bitmapProvider, GifHeader gifHeader, ByteBuffer byteBuffer) {
        this(bitmapProvider, gifHeader, byteBuffer, 1);
    }

    /* renamed from: a */
    public final int m50517a(int i, int i2, int i3) {
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        for (int i9 = i; i9 < this.f41823q + i; i9++) {
            byte[] bArr = this.f41816j;
            if (i9 >= bArr.length || i9 >= i2) {
                break;
            }
            int i10 = this.f41807a[bArr[i9] & 255];
            if (i10 != 0) {
                i4 += (i10 >> 24) & 255;
                i5 += (i10 >> 16) & 255;
                i6 += (i10 >> 8) & 255;
                i7 += i10 & 255;
                i8++;
            }
        }
        int i11 = i + i3;
        for (int i12 = i11; i12 < this.f41823q + i11; i12++) {
            byte[] bArr2 = this.f41816j;
            if (i12 >= bArr2.length || i12 >= i2) {
                break;
            }
            int i13 = this.f41807a[bArr2[i12] & 255];
            if (i13 != 0) {
                i4 += (i13 >> 24) & 255;
                i5 += (i13 >> 16) & 255;
                i6 += (i13 >> 8) & 255;
                i7 += i13 & 255;
                i8++;
            }
        }
        if (i8 == 0) {
            return 0;
        }
        return ((i4 / i8) << 24) | ((i5 / i8) << 16) | ((i6 / i8) << 8) | (i7 / i8);
    }

    @Override // com.bumptech.glide.gifdecoder.GifDecoder
    public void advance() {
        this.f41818l = (this.f41818l + 1) % this.f41819m.f41791c;
    }

    /* renamed from: b */
    public final void m50516b(C21701q60 c21701q60) {
        boolean z;
        boolean booleanValue;
        int i;
        int i2;
        boolean z2;
        int i3;
        int i4;
        int i5;
        int[] iArr = this.f41817k;
        int i6 = c21701q60.f76862d;
        int i7 = this.f41823q;
        int i8 = i6 / i7;
        int i9 = c21701q60.f76860b / i7;
        int i10 = c21701q60.f76861c / i7;
        int i11 = c21701q60.f76859a / i7;
        if (this.f41818l == 0) {
            z = true;
        } else {
            z = false;
        }
        int i12 = this.f41825s;
        int i13 = this.f41824r;
        byte[] bArr = this.f41816j;
        int[] iArr2 = this.f41807a;
        Boolean bool = this.f41826t;
        int i14 = 8;
        int i15 = 0;
        int i16 = 0;
        int i17 = 1;
        while (i16 < i8) {
            Boolean bool2 = bool;
            if (c21701q60.f76863e) {
                if (i15 >= i8) {
                    int i18 = i17 + 1;
                    i = i8;
                    if (i18 != 2) {
                        if (i18 != 3) {
                            if (i18 != 4) {
                                i17 = i18;
                            } else {
                                i17 = i18;
                                i15 = 1;
                                i14 = 2;
                            }
                        } else {
                            i17 = i18;
                            i15 = 2;
                            i14 = 4;
                        }
                    } else {
                        i17 = i18;
                        i15 = 4;
                    }
                } else {
                    i = i8;
                }
                i2 = i15 + i14;
            } else {
                i = i8;
                i2 = i15;
                i15 = i16;
            }
            int i19 = i15 + i9;
            if (i7 == 1) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (i19 < i13) {
                int i20 = i19 * i12;
                int i21 = i20 + i11;
                int i22 = i21 + i10;
                int i23 = i20 + i12;
                if (i23 < i22) {
                    i22 = i23;
                }
                i3 = i2;
                int i24 = i16 * i7 * c21701q60.f76861c;
                if (z2) {
                    int i25 = i21;
                    while (i25 < i22) {
                        int i26 = i9;
                        int i27 = iArr2[bArr[i24] & 255];
                        if (i27 != 0) {
                            iArr[i25] = i27;
                        } else if (z && bool2 == null) {
                            bool2 = Boolean.TRUE;
                        }
                        i24 += i7;
                        i25++;
                        i9 = i26;
                    }
                } else {
                    i5 = i9;
                    int i28 = ((i22 - i21) * i7) + i24;
                    int i29 = i21;
                    while (true) {
                        i4 = i10;
                        if (i29 >= i22) {
                            break;
                        }
                        int m50517a = m50517a(i24, i28, c21701q60.f76861c);
                        if (m50517a != 0) {
                            iArr[i29] = m50517a;
                        } else if (z && bool2 == null) {
                            bool2 = Boolean.TRUE;
                        }
                        i24 += i7;
                        i29++;
                        i10 = i4;
                    }
                    bool = bool2;
                    i16++;
                    i9 = i5;
                    i8 = i;
                    i10 = i4;
                    i15 = i3;
                }
            } else {
                i3 = i2;
            }
            i5 = i9;
            i4 = i10;
            bool = bool2;
            i16++;
            i9 = i5;
            i8 = i;
            i10 = i4;
            i15 = i3;
        }
        Boolean bool3 = bool;
        if (this.f41826t == null) {
            if (bool3 == null) {
                booleanValue = false;
            } else {
                booleanValue = bool3.booleanValue();
            }
            this.f41826t = Boolean.valueOf(booleanValue);
        }
    }

    /* renamed from: c */
    public final void m50515c(C21701q60 c21701q60) {
        boolean z;
        boolean z2;
        C21701q60 c21701q602 = c21701q60;
        int[] iArr = this.f41817k;
        int i = c21701q602.f76862d;
        int i2 = c21701q602.f76860b;
        int i3 = c21701q602.f76861c;
        int i4 = c21701q602.f76859a;
        if (this.f41818l == 0) {
            z = true;
        } else {
            z = false;
        }
        int i5 = this.f41825s;
        byte[] bArr = this.f41816j;
        int[] iArr2 = this.f41807a;
        int i6 = 0;
        byte b = -1;
        while (i6 < i) {
            int i7 = (i6 + i2) * i5;
            int i8 = i7 + i4;
            int i9 = i8 + i3;
            int i10 = i7 + i5;
            if (i10 < i9) {
                i9 = i10;
            }
            int i11 = c21701q602.f76861c * i6;
            int i12 = i8;
            while (i12 < i9) {
                byte b2 = bArr[i11];
                int i13 = i;
                int i14 = b2 & 255;
                if (i14 != b) {
                    int i15 = iArr2[i14];
                    if (i15 != 0) {
                        iArr[i12] = i15;
                    } else {
                        b = b2;
                    }
                }
                i11++;
                i12++;
                i = i13;
            }
            i6++;
            c21701q602 = c21701q60;
        }
        Boolean bool = this.f41826t;
        if ((bool != null && bool.booleanValue()) || (this.f41826t == null && z && b != -1)) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.f41826t = Boolean.valueOf(z2);
    }

    @Override // com.bumptech.glide.gifdecoder.GifDecoder
    public void clear() {
        this.f41819m = null;
        byte[] bArr = this.f41816j;
        if (bArr != null) {
            this.f41809c.release(bArr);
        }
        int[] iArr = this.f41817k;
        if (iArr != null) {
            this.f41809c.release(iArr);
        }
        Bitmap bitmap = this.f41820n;
        if (bitmap != null) {
            this.f41809c.release(bitmap);
        }
        this.f41820n = null;
        this.f41810d = null;
        this.f41826t = null;
        byte[] bArr2 = this.f41811e;
        if (bArr2 != null) {
            this.f41809c.release(bArr2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: d */
    public final void m50514d(C21701q60 c21701q60) {
        int i;
        int i2;
        short s;
        StandardGifDecoder standardGifDecoder = this;
        if (c21701q60 != null) {
            standardGifDecoder.f41810d.position(c21701q60.f76868j);
        }
        if (c21701q60 == null) {
            GifHeader gifHeader = standardGifDecoder.f41819m;
            i = gifHeader.f41794f;
            i2 = gifHeader.f41795g;
        } else {
            i = c21701q60.f76861c;
            i2 = c21701q60.f76862d;
        }
        int i3 = i * i2;
        byte[] bArr = standardGifDecoder.f41816j;
        if (bArr == null || bArr.length < i3) {
            standardGifDecoder.f41816j = standardGifDecoder.f41809c.obtainByteArray(i3);
        }
        byte[] bArr2 = standardGifDecoder.f41816j;
        if (standardGifDecoder.f41813g == null) {
            standardGifDecoder.f41813g = new short[4096];
        }
        short[] sArr = standardGifDecoder.f41813g;
        if (standardGifDecoder.f41814h == null) {
            standardGifDecoder.f41814h = new byte[4096];
        }
        byte[] bArr3 = standardGifDecoder.f41814h;
        if (standardGifDecoder.f41815i == null) {
            standardGifDecoder.f41815i = new byte[FragmentTransaction.TRANSIT_FRAGMENT_OPEN];
        }
        byte[] bArr4 = standardGifDecoder.f41815i;
        int m50510h = m50510h();
        int i4 = 1 << m50510h;
        int i5 = i4 + 1;
        int i6 = i4 + 2;
        int i7 = m50510h + 1;
        int i8 = (1 << i7) - 1;
        int i9 = 0;
        for (int i10 = 0; i10 < i4; i10++) {
            sArr[i10] = 0;
            bArr3[i10] = (byte) i10;
        }
        byte[] bArr5 = standardGifDecoder.f41811e;
        int i11 = i7;
        int i12 = i6;
        int i13 = i8;
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        int i17 = 0;
        int i18 = 0;
        int i19 = -1;
        int i20 = 0;
        int i21 = 0;
        while (true) {
            if (i9 >= i3) {
                break;
            }
            if (i14 == 0) {
                i14 = m50511g();
                if (i14 <= 0) {
                    standardGifDecoder.f41822p = 3;
                    break;
                }
                i15 = 0;
            }
            i17 += (bArr5[i15] & 255) << i16;
            i15++;
            i14--;
            int i22 = i16 + 8;
            int i23 = i12;
            int i24 = i11;
            int i25 = i19;
            int i26 = i7;
            int i27 = i20;
            while (true) {
                if (i22 >= i24) {
                    int i28 = i6;
                    int i29 = i17 & i13;
                    i17 >>= i24;
                    i22 -= i24;
                    if (i29 == i4) {
                        i13 = i8;
                        i24 = i26;
                        i23 = i28;
                        i6 = i23;
                        i25 = -1;
                    } else if (i29 == i5) {
                        i16 = i22;
                        i20 = i27;
                        i12 = i23;
                        i7 = i26;
                        i6 = i28;
                        i19 = i25;
                        i11 = i24;
                        standardGifDecoder = this;
                        break;
                    } else if (i25 == -1) {
                        bArr2[i18] = bArr3[i29];
                        i18++;
                        i9++;
                        i25 = i29;
                        i27 = i25;
                        i6 = i28;
                        i22 = i22;
                    } else {
                        if (i29 >= i23) {
                            bArr4[i21] = (byte) i27;
                            i21++;
                            s = i25;
                        } else {
                            s = i29;
                        }
                        while (s >= i4) {
                            bArr4[i21] = bArr3[s];
                            i21++;
                            s = sArr[s];
                        }
                        i27 = bArr3[s] & 255;
                        byte b = (byte) i27;
                        bArr2[i18] = b;
                        while (true) {
                            i18++;
                            i9++;
                            if (i21 <= 0) {
                                break;
                            }
                            i21--;
                            bArr2[i18] = bArr4[i21];
                        }
                        byte[] bArr6 = bArr4;
                        if (i23 < 4096) {
                            sArr[i23] = (short) i25;
                            bArr3[i23] = b;
                            i23++;
                            if ((i23 & i13) == 0 && i23 < 4096) {
                                i24++;
                                i13 += i23;
                            }
                        }
                        i25 = i29;
                        i6 = i28;
                        i22 = i22;
                        bArr4 = bArr6;
                    }
                } else {
                    i19 = i25;
                    i12 = i23;
                    i16 = i22;
                    standardGifDecoder = this;
                    i20 = i27;
                    i7 = i26;
                    i11 = i24;
                    break;
                }
            }
        }
        Arrays.fill(bArr2, i18, i3, (byte) 0);
    }

    /* renamed from: e */
    public final GifHeaderParser m50513e() {
        if (this.f41812f == null) {
            this.f41812f = new GifHeaderParser();
        }
        return this.f41812f;
    }

    /* renamed from: f */
    public final Bitmap m50512f() {
        Bitmap.Config config;
        Boolean bool = this.f41826t;
        if (bool != null && !bool.booleanValue()) {
            config = this.f41827u;
        } else {
            config = Bitmap.Config.ARGB_8888;
        }
        Bitmap obtain = this.f41809c.obtain(this.f41825s, this.f41824r, config);
        obtain.setHasAlpha(true);
        return obtain;
    }

    /* renamed from: g */
    public final int m50511g() {
        int m50510h = m50510h();
        if (m50510h <= 0) {
            return m50510h;
        }
        ByteBuffer byteBuffer = this.f41810d;
        byteBuffer.get(this.f41811e, 0, Math.min(m50510h, byteBuffer.remaining()));
        return m50510h;
    }

    @Override // com.bumptech.glide.gifdecoder.GifDecoder
    public int getByteSize() {
        return this.f41810d.limit() + this.f41816j.length + (this.f41817k.length * 4);
    }

    @Override // com.bumptech.glide.gifdecoder.GifDecoder
    public int getCurrentFrameIndex() {
        return this.f41818l;
    }

    @Override // com.bumptech.glide.gifdecoder.GifDecoder
    @NonNull
    public ByteBuffer getData() {
        return this.f41810d;
    }

    @Override // com.bumptech.glide.gifdecoder.GifDecoder
    public int getDelay(int i) {
        if (i >= 0) {
            GifHeader gifHeader = this.f41819m;
            if (i < gifHeader.f41791c) {
                return ((C21701q60) gifHeader.f41793e.get(i)).f76867i;
            }
        }
        return -1;
    }

    @Override // com.bumptech.glide.gifdecoder.GifDecoder
    public int getFrameCount() {
        return this.f41819m.f41791c;
    }

    @Override // com.bumptech.glide.gifdecoder.GifDecoder
    public int getHeight() {
        return this.f41819m.f41795g;
    }

    @Override // com.bumptech.glide.gifdecoder.GifDecoder
    @Deprecated
    public int getLoopCount() {
        int i = this.f41819m.f41801m;
        if (i == -1) {
            return 1;
        }
        return i;
    }

    @Override // com.bumptech.glide.gifdecoder.GifDecoder
    public int getNetscapeLoopCount() {
        return this.f41819m.f41801m;
    }

    @Override // com.bumptech.glide.gifdecoder.GifDecoder
    public int getNextDelay() {
        int i;
        if (this.f41819m.f41791c > 0 && (i = this.f41818l) >= 0) {
            return getDelay(i);
        }
        return 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0047 A[Catch: all -> 0x000e, TryCatch #0 {all -> 0x000e, blocks: (B:3:0x0001, B:5:0x0009, B:14:0x0036, B:19:0x0040, B:21:0x0047, B:22:0x0051, B:24:0x0062, B:26:0x006e, B:30:0x0077, B:32:0x007b, B:34:0x0083, B:35:0x0092, B:38:0x0096, B:40:0x009a, B:42:0x00ac, B:44:0x00b0, B:45:0x00b4, B:29:0x0073, B:48:0x00ba, B:50:0x00c2, B:10:0x0011, B:12:0x0019, B:13:0x0034), top: B:55:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0062 A[Catch: all -> 0x000e, TryCatch #0 {all -> 0x000e, blocks: (B:3:0x0001, B:5:0x0009, B:14:0x0036, B:19:0x0040, B:21:0x0047, B:22:0x0051, B:24:0x0062, B:26:0x006e, B:30:0x0077, B:32:0x007b, B:34:0x0083, B:35:0x0092, B:38:0x0096, B:40:0x009a, B:42:0x00ac, B:44:0x00b0, B:45:0x00b4, B:29:0x0073, B:48:0x00ba, B:50:0x00c2, B:10:0x0011, B:12:0x0019, B:13:0x0034), top: B:55:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0073 A[Catch: all -> 0x000e, TryCatch #0 {all -> 0x000e, blocks: (B:3:0x0001, B:5:0x0009, B:14:0x0036, B:19:0x0040, B:21:0x0047, B:22:0x0051, B:24:0x0062, B:26:0x006e, B:30:0x0077, B:32:0x007b, B:34:0x0083, B:35:0x0092, B:38:0x0096, B:40:0x009a, B:42:0x00ac, B:44:0x00b0, B:45:0x00b4, B:29:0x0073, B:48:0x00ba, B:50:0x00c2, B:10:0x0011, B:12:0x0019, B:13:0x0034), top: B:55:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x007b A[Catch: all -> 0x000e, TryCatch #0 {all -> 0x000e, blocks: (B:3:0x0001, B:5:0x0009, B:14:0x0036, B:19:0x0040, B:21:0x0047, B:22:0x0051, B:24:0x0062, B:26:0x006e, B:30:0x0077, B:32:0x007b, B:34:0x0083, B:35:0x0092, B:38:0x0096, B:40:0x009a, B:42:0x00ac, B:44:0x00b0, B:45:0x00b4, B:29:0x0073, B:48:0x00ba, B:50:0x00c2, B:10:0x0011, B:12:0x0019, B:13:0x0034), top: B:55:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0096 A[Catch: all -> 0x000e, TRY_ENTER, TryCatch #0 {all -> 0x000e, blocks: (B:3:0x0001, B:5:0x0009, B:14:0x0036, B:19:0x0040, B:21:0x0047, B:22:0x0051, B:24:0x0062, B:26:0x006e, B:30:0x0077, B:32:0x007b, B:34:0x0083, B:35:0x0092, B:38:0x0096, B:40:0x009a, B:42:0x00ac, B:44:0x00b0, B:45:0x00b4, B:29:0x0073, B:48:0x00ba, B:50:0x00c2, B:10:0x0011, B:12:0x0019, B:13:0x0034), top: B:55:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00c2 A[Catch: all -> 0x000e, TRY_LEAVE, TryCatch #0 {all -> 0x000e, blocks: (B:3:0x0001, B:5:0x0009, B:14:0x0036, B:19:0x0040, B:21:0x0047, B:22:0x0051, B:24:0x0062, B:26:0x006e, B:30:0x0077, B:32:0x007b, B:34:0x0083, B:35:0x0092, B:38:0x0096, B:40:0x009a, B:42:0x00ac, B:44:0x00b0, B:45:0x00b4, B:29:0x0073, B:48:0x00ba, B:50:0x00c2, B:10:0x0011, B:12:0x0019, B:13:0x0034), top: B:55:0x0001 }] */
    @Override // com.bumptech.glide.gifdecoder.GifDecoder
    @androidx.annotation.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public synchronized android.graphics.Bitmap getNextFrame() {
        /*
            Method dump skipped, instructions count: 213
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.gifdecoder.StandardGifDecoder.getNextFrame():android.graphics.Bitmap");
    }

    @Override // com.bumptech.glide.gifdecoder.GifDecoder
    public int getStatus() {
        return this.f41822p;
    }

    @Override // com.bumptech.glide.gifdecoder.GifDecoder
    public int getTotalIterationCount() {
        int i = this.f41819m.f41801m;
        if (i == -1) {
            return 1;
        }
        if (i == 0) {
            return 0;
        }
        return i + 1;
    }

    @Override // com.bumptech.glide.gifdecoder.GifDecoder
    public int getWidth() {
        return this.f41819m.f41794f;
    }

    /* renamed from: h */
    public final int m50510h() {
        return this.f41810d.get() & 255;
    }

    /* renamed from: i */
    public final Bitmap m50509i(C21701q60 c21701q60, C21701q60 c21701q602) {
        int i;
        int i2;
        Bitmap bitmap;
        int[] iArr = this.f41817k;
        int i3 = 0;
        if (c21701q602 == null) {
            Bitmap bitmap2 = this.f41820n;
            if (bitmap2 != null) {
                this.f41809c.release(bitmap2);
            }
            this.f41820n = null;
            Arrays.fill(iArr, 0);
        }
        if (c21701q602 != null && c21701q602.f76865g == 3 && this.f41820n == null) {
            Arrays.fill(iArr, 0);
        }
        if (c21701q602 != null && (i2 = c21701q602.f76865g) > 0) {
            if (i2 == 2) {
                if (!c21701q60.f76864f) {
                    GifHeader gifHeader = this.f41819m;
                    int i4 = gifHeader.f41800l;
                    if (c21701q60.f76869k == null || gifHeader.f41798j != c21701q60.f76866h) {
                        i3 = i4;
                    }
                }
                int i5 = c21701q602.f76862d;
                int i6 = this.f41823q;
                int i7 = i5 / i6;
                int i8 = c21701q602.f76860b / i6;
                int i9 = c21701q602.f76861c / i6;
                int i10 = c21701q602.f76859a / i6;
                int i11 = this.f41825s;
                int i12 = (i8 * i11) + i10;
                int i13 = (i7 * i11) + i12;
                while (i12 < i13) {
                    int i14 = i12 + i9;
                    for (int i15 = i12; i15 < i14; i15++) {
                        iArr[i15] = i3;
                    }
                    i12 += this.f41825s;
                }
            } else if (i2 == 3 && (bitmap = this.f41820n) != null) {
                int i16 = this.f41825s;
                bitmap.getPixels(iArr, 0, i16, 0, 0, i16, this.f41824r);
            }
        }
        m50514d(c21701q60);
        if (!c21701q60.f76863e && this.f41823q == 1) {
            m50515c(c21701q60);
        } else {
            m50516b(c21701q60);
        }
        if (this.f41821o && ((i = c21701q60.f76865g) == 0 || i == 1)) {
            if (this.f41820n == null) {
                this.f41820n = m50512f();
            }
            Bitmap bitmap3 = this.f41820n;
            int i17 = this.f41825s;
            bitmap3.setPixels(iArr, 0, i17, 0, 0, i17, this.f41824r);
        }
        Bitmap m50512f = m50512f();
        int i18 = this.f41825s;
        m50512f.setPixels(iArr, 0, i18, 0, 0, i18, this.f41824r);
        return m50512f;
    }

    @Override // com.bumptech.glide.gifdecoder.GifDecoder
    public int read(@Nullable InputStream inputStream, int i) {
        if (inputStream != null) {
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(i > 0 ? i + 4096 : 16384);
                byte[] bArr = new byte[16384];
                while (true) {
                    int read = inputStream.read(bArr, 0, 16384);
                    if (read == -1) {
                        break;
                    }
                    byteArrayOutputStream.write(bArr, 0, read);
                }
                byteArrayOutputStream.flush();
                read(byteArrayOutputStream.toByteArray());
            } catch (IOException e) {
                Log.w(f41806v, "Error reading data from stream", e);
            }
        } else {
            this.f41822p = 2;
        }
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException e2) {
                Log.w(f41806v, "Error closing stream", e2);
            }
        }
        return this.f41822p;
    }

    @Override // com.bumptech.glide.gifdecoder.GifDecoder
    public void resetFrameIndex() {
        this.f41818l = -1;
    }

    @Override // com.bumptech.glide.gifdecoder.GifDecoder
    public synchronized void setData(@NonNull GifHeader gifHeader, @NonNull byte[] bArr) {
        setData(gifHeader, ByteBuffer.wrap(bArr));
    }

    @Override // com.bumptech.glide.gifdecoder.GifDecoder
    public void setDefaultBitmapConfig(@NonNull Bitmap.Config config) {
        Bitmap.Config config2;
        Bitmap.Config config3 = Bitmap.Config.ARGB_8888;
        if (config != config3 && config != (config2 = Bitmap.Config.RGB_565)) {
            throw new IllegalArgumentException("Unsupported format: " + config + ", must be one of " + config3 + " or " + config2);
        }
        this.f41827u = config;
    }

    public StandardGifDecoder(@NonNull GifDecoder.BitmapProvider bitmapProvider, GifHeader gifHeader, ByteBuffer byteBuffer, int i) {
        this(bitmapProvider);
        setData(gifHeader, byteBuffer, i);
    }

    @Override // com.bumptech.glide.gifdecoder.GifDecoder
    public synchronized void setData(@NonNull GifHeader gifHeader, @NonNull ByteBuffer byteBuffer) {
        setData(gifHeader, byteBuffer, 1);
    }

    public StandardGifDecoder(@NonNull GifDecoder.BitmapProvider bitmapProvider) {
        this.f41808b = new int[256];
        this.f41827u = Bitmap.Config.ARGB_8888;
        this.f41809c = bitmapProvider;
        this.f41819m = new GifHeader();
    }

    @Override // com.bumptech.glide.gifdecoder.GifDecoder
    public synchronized void setData(@NonNull GifHeader gifHeader, @NonNull ByteBuffer byteBuffer, int i) {
        try {
            if (i > 0) {
                int highestOneBit = Integer.highestOneBit(i);
                this.f41822p = 0;
                this.f41819m = gifHeader;
                this.f41818l = -1;
                ByteBuffer asReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
                this.f41810d = asReadOnlyBuffer;
                asReadOnlyBuffer.position(0);
                this.f41810d.order(ByteOrder.LITTLE_ENDIAN);
                this.f41821o = false;
                Iterator it = gifHeader.f41793e.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    } else if (((C21701q60) it.next()).f76865g == 3) {
                        this.f41821o = true;
                        break;
                    }
                }
                this.f41823q = highestOneBit;
                int i2 = gifHeader.f41794f;
                this.f41825s = i2 / highestOneBit;
                int i3 = gifHeader.f41795g;
                this.f41824r = i3 / highestOneBit;
                this.f41816j = this.f41809c.obtainByteArray(i2 * i3);
                this.f41817k = this.f41809c.obtainIntArray(this.f41825s * this.f41824r);
            } else {
                throw new IllegalArgumentException("Sample size must be >=0, not: " + i);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // com.bumptech.glide.gifdecoder.GifDecoder
    public synchronized int read(@Nullable byte[] bArr) {
        try {
            GifHeader parseHeader = m50513e().setData(bArr).parseHeader();
            this.f41819m = parseHeader;
            if (bArr != null) {
                setData(parseHeader, bArr);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f41822p;
    }
}
