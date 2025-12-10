package com.mixpanel.android.util;

import android.graphics.Bitmap;
import androidx.core.view.MotionEventCompat;
import java.lang.reflect.Array;

/* loaded from: classes5.dex */
public class StackBlurManager {
    public static void process(Bitmap bitmap, int i) {
        int[] iArr;
        int i2 = i;
        if (i2 < 1) {
            return;
        }
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        int i3 = width * height;
        int[] iArr2 = new int[i3];
        bitmap.getPixels(iArr2, 0, width, 0, 0, width, height);
        int i4 = width - 1;
        int i5 = height - 1;
        int i6 = i2 + i2;
        int i7 = i6 + 1;
        int[] iArr3 = new int[i3];
        int[] iArr4 = new int[i3];
        int[] iArr5 = new int[i3];
        int[] iArr6 = new int[Math.max(width, height)];
        int i8 = (i6 + 2) >> 1;
        int i9 = i8 * i8;
        int i10 = i9 * 256;
        int[] iArr7 = new int[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            iArr7[i11] = i11 / i9;
        }
        int[][] iArr8 = (int[][]) Array.newInstance(Integer.TYPE, i7, 3);
        int i12 = i2 + 1;
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        while (i13 < height) {
            int i16 = -i2;
            int i17 = 0;
            int i18 = 0;
            int i19 = 0;
            int i20 = 0;
            int i21 = 0;
            int i22 = 0;
            int i23 = 0;
            int i24 = 0;
            int i25 = 0;
            while (i16 <= i2) {
                int i26 = i5;
                int i27 = height;
                int i28 = iArr2[i14 + Math.min(i4, Math.max(i16, 0))];
                int[] iArr9 = iArr8[i16 + i2];
                iArr9[0] = (i28 & 16711680) >> 16;
                iArr9[1] = (i28 & MotionEventCompat.ACTION_POINTER_INDEX_MASK) >> 8;
                iArr9[2] = i28 & 255;
                int abs = i12 - Math.abs(i16);
                int i29 = iArr9[0];
                i17 += i29 * abs;
                int i30 = iArr9[1];
                i18 += i30 * abs;
                int i31 = iArr9[2];
                i19 += abs * i31;
                if (i16 > 0) {
                    i23 += i29;
                    i24 += i30;
                    i25 += i31;
                } else {
                    i20 += i29;
                    i21 += i30;
                    i22 += i31;
                }
                i16++;
                height = i27;
                i5 = i26;
            }
            int i32 = i5;
            int i33 = height;
            int i34 = i2;
            int i35 = 0;
            while (i35 < width) {
                iArr3[i14] = iArr7[i17];
                iArr4[i14] = iArr7[i18];
                iArr5[i14] = iArr7[i19];
                int i36 = i17 - i20;
                int i37 = i18 - i21;
                int i38 = i19 - i22;
                int[] iArr10 = iArr8[((i34 - i2) + i7) % i7];
                int i39 = i20 - iArr10[0];
                int i40 = i21 - iArr10[1];
                int i41 = i22 - iArr10[2];
                if (i13 == 0) {
                    iArr = iArr7;
                    iArr6[i35] = Math.min(i35 + i2 + 1, i4);
                } else {
                    iArr = iArr7;
                }
                int i42 = iArr2[i15 + iArr6[i35]];
                int i43 = (i42 & 16711680) >> 16;
                iArr10[0] = i43;
                int i44 = (i42 & MotionEventCompat.ACTION_POINTER_INDEX_MASK) >> 8;
                iArr10[1] = i44;
                int i45 = i42 & 255;
                iArr10[2] = i45;
                int i46 = i23 + i43;
                int i47 = i24 + i44;
                int i48 = i25 + i45;
                i17 = i36 + i46;
                i18 = i37 + i47;
                i19 = i38 + i48;
                i34 = (i34 + 1) % i7;
                int[] iArr11 = iArr8[i34 % i7];
                int i49 = iArr11[0];
                i20 = i39 + i49;
                int i50 = iArr11[1];
                i21 = i40 + i50;
                int i51 = iArr11[2];
                i22 = i41 + i51;
                i23 = i46 - i49;
                i24 = i47 - i50;
                i25 = i48 - i51;
                i14++;
                i35++;
                iArr7 = iArr;
            }
            i15 += width;
            i13++;
            height = i33;
            i5 = i32;
        }
        int i52 = i5;
        int i53 = height;
        int[] iArr12 = iArr7;
        int i54 = 0;
        while (i54 < width) {
            int i55 = -i2;
            int i56 = i55 * width;
            int i57 = 0;
            int i58 = 0;
            int i59 = 0;
            int i60 = 0;
            int i61 = 0;
            int i62 = 0;
            int i63 = 0;
            int i64 = 0;
            int i65 = 0;
            while (i55 <= i2) {
                int[] iArr13 = iArr6;
                int max = Math.max(0, i56) + i54;
                int[] iArr14 = iArr8[i55 + i2];
                iArr14[0] = iArr3[max];
                iArr14[1] = iArr4[max];
                iArr14[2] = iArr5[max];
                int abs2 = i12 - Math.abs(i55);
                i57 += iArr3[max] * abs2;
                i58 += iArr4[max] * abs2;
                i59 += iArr5[max] * abs2;
                if (i55 > 0) {
                    i63 += iArr14[0];
                    i64 += iArr14[1];
                    i65 += iArr14[2];
                } else {
                    i60 += iArr14[0];
                    i61 += iArr14[1];
                    i62 += iArr14[2];
                }
                int i66 = i52;
                if (i55 < i66) {
                    i56 += width;
                }
                i55++;
                i52 = i66;
                iArr6 = iArr13;
            }
            int[] iArr15 = iArr6;
            int i67 = i52;
            int i68 = i2;
            int i69 = i54;
            int i70 = i53;
            int i71 = 0;
            while (i71 < i70) {
                iArr2[i69] = (iArr12[i57] << 16) | (-16777216) | (iArr12[i58] << 8) | iArr12[i59];
                int i72 = i57 - i60;
                int i73 = i58 - i61;
                int i74 = i59 - i62;
                int[] iArr16 = iArr8[((i68 - i2) + i7) % i7];
                int i75 = i60 - iArr16[0];
                int i76 = i61 - iArr16[1];
                int i77 = i62 - iArr16[2];
                if (i54 == 0) {
                    iArr15[i71] = Math.min(i71 + i12, i67) * width;
                }
                int i78 = iArr15[i71] + i54;
                int i79 = iArr3[i78];
                iArr16[0] = i79;
                int i80 = iArr4[i78];
                iArr16[1] = i80;
                int i81 = iArr5[i78];
                iArr16[2] = i81;
                int i82 = i63 + i79;
                int i83 = i64 + i80;
                int i84 = i65 + i81;
                i57 = i72 + i82;
                i58 = i73 + i83;
                i59 = i74 + i84;
                i68 = (i68 + 1) % i7;
                int[] iArr17 = iArr8[i68];
                int i85 = iArr17[0];
                i60 = i75 + i85;
                int i86 = iArr17[1];
                i61 = i76 + i86;
                int i87 = iArr17[2];
                i62 = i77 + i87;
                i63 = i82 - i85;
                i64 = i83 - i86;
                i65 = i84 - i87;
                i69 += width;
                i71++;
                i2 = i;
            }
            i54++;
            i2 = i;
            i52 = i67;
            i53 = i70;
            iArr6 = iArr15;
        }
        bitmap.setPixels(iArr2, 0, width, 0, 0, width, i53);
    }
}
