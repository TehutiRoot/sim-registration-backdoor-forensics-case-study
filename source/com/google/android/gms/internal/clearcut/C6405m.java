package com.google.android.gms.internal.clearcut;

import com.google.common.base.Ascii;
import java.nio.ByteBuffer;

/* renamed from: com.google.android.gms.internal.clearcut.m */
/* loaded from: classes3.dex */
public final class C6405m extends AbstractC6404l {
    @Override // com.google.android.gms.internal.clearcut.AbstractC6404l
    /* renamed from: a */
    public final int mo48215a(int i, byte[] bArr, int i2, int i3) {
        int m48221j;
        int m48221j2;
        while (i2 < i3 && bArr[i2] >= 0) {
            i2++;
        }
        if (i2 >= i3) {
            return 0;
        }
        while (i2 < i3) {
            int i4 = i2 + 1;
            byte b = bArr[i2];
            if (b < 0) {
                if (b < -32) {
                    if (i4 >= i3) {
                        return b;
                    }
                    if (b >= -62) {
                        i2 += 2;
                        if (bArr[i4] > -65) {
                        }
                    }
                    return -1;
                } else if (b >= -16) {
                    if (i4 >= i3 - 2) {
                        m48221j2 = AbstractC6403k.m48221j(bArr, i4, i3);
                        return m48221j2;
                    }
                    int i5 = i2 + 2;
                    byte b2 = bArr[i4];
                    if (b2 <= -65 && (((b << Ascii.f52686FS) + (b2 + 112)) >> 30) == 0) {
                        int i6 = i2 + 3;
                        if (bArr[i5] <= -65) {
                            i2 += 4;
                            if (bArr[i6] > -65) {
                            }
                        }
                    }
                    return -1;
                } else if (i4 >= i3 - 1) {
                    m48221j = AbstractC6403k.m48221j(bArr, i4, i3);
                    return m48221j;
                } else {
                    int i7 = i2 + 2;
                    byte b3 = bArr[i4];
                    if (b3 <= -65 && ((b != -32 || b3 >= -96) && (b != -19 || b3 < -96))) {
                        i2 += 3;
                        if (bArr[i7] > -65) {
                        }
                    }
                    return -1;
                }
            }
            i2 = i4;
        }
        return 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x001d, code lost:
        return r10 + r0;
     */
    @Override // com.google.android.gms.internal.clearcut.AbstractC6404l
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int mo48214b(java.lang.CharSequence r8, byte[] r9, int r10, int r11) {
        /*
            Method dump skipped, instructions count: 256
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.clearcut.C6405m.mo48214b(java.lang.CharSequence, byte[], int, int):int");
    }

    @Override // com.google.android.gms.internal.clearcut.AbstractC6404l
    /* renamed from: c */
    public final void mo48213c(CharSequence charSequence, ByteBuffer byteBuffer) {
        AbstractC6404l.m48217d(charSequence, byteBuffer);
    }
}
