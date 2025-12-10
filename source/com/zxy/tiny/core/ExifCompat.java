package com.zxy.tiny.core;

import android.media.ExifInterface;
import com.zxy.tiny.common.Logger;
import com.zxy.tiny.common.TinyException;
import java.io.InputStream;
import java.util.Arrays;
import th.p047co.dtac.android.dtacone.util.bitmap.BitmapUtil;

/* loaded from: classes5.dex */
public class ExifCompat {

    /* renamed from: a */
    public static final byte[] f60969a = {-1, -40, -1};

    /* renamed from: a */
    public static int m31978a(byte[] bArr, int i, int i2, boolean z) {
        int i3;
        if (z) {
            i += i2 - 1;
            i3 = -1;
        } else {
            i3 = 1;
        }
        int i4 = 0;
        while (true) {
            int i5 = i2 - 1;
            if (i2 > 0) {
                i4 = (bArr[i] & 255) | (i4 << 8);
                i += i3;
                i2 = i5;
            } else {
                return i4;
            }
        }
    }

    public static int getOrientation(byte[] bArr) {
        int i;
        if (bArr == null) {
            return 0;
        }
        int i2 = 0;
        while (i2 + 3 < bArr.length) {
            int i3 = i2 + 1;
            if ((bArr[i2] & 255) == 255) {
                int i4 = bArr[i3] & 255;
                if (i4 != 255) {
                    i3 = i2 + 2;
                    if (i4 != 216 && i4 != 1) {
                        if (i4 != 217 && i4 != 218) {
                            int m31978a = m31978a(bArr, i3, 2, false);
                            if (m31978a >= 2 && (i3 = i3 + m31978a) <= bArr.length) {
                                if (i4 == 225 && m31978a >= 8 && m31978a(bArr, i2 + 4, 4, false) == 1165519206 && m31978a(bArr, i2 + 8, 2, false) == 0) {
                                    i2 += 10;
                                    i = m31978a - 8;
                                    break;
                                }
                            } else {
                                Logger.m31988e("Invalid length");
                                return 0;
                            }
                        }
                    }
                }
                i2 = i3;
            }
            i2 = i3;
        }
        i = 0;
        if (i > 8) {
            int m31978a2 = m31978a(bArr, i2, 4, false);
            if (m31978a2 != 1229531648 && m31978a2 != 1296891946) {
                Logger.m31988e("Invalid byte order");
                return 0;
            }
            boolean z = m31978a2 == 1229531648;
            int m31978a3 = m31978a(bArr, i2 + 4, 4, z) + 2;
            if (m31978a3 >= 10 && m31978a3 <= i) {
                int i5 = i2 + m31978a3;
                int i6 = i - m31978a3;
                int m31978a4 = m31978a(bArr, i5 - 2, 2, z);
                while (true) {
                    int i7 = m31978a4 - 1;
                    if (m31978a4 <= 0 || i6 < 12) {
                        break;
                    } else if (m31978a(bArr, i5, 2, z) == 274) {
                        int m31978a5 = m31978a(bArr, i5 + 8, 2, z);
                        if (m31978a5 != 1) {
                            if (m31978a5 != 3) {
                                if (m31978a5 != 6) {
                                    if (m31978a5 != 8) {
                                        Logger.m31988e("Unsupported orientation");
                                        return 0;
                                    }
                                    return BitmapUtil.IMAGE_270_DEGREE;
                                }
                                return 90;
                            }
                            return BitmapUtil.IMAGE_180_DEGREE;
                        }
                        return 0;
                    } else {
                        i5 += 12;
                        i6 -= 12;
                        m31978a4 = i7;
                    }
                }
            } else {
                Logger.m31988e("Invalid offset");
                return 0;
            }
        }
        Logger.m31988e("Orientation not found");
        return 0;
    }

    public static boolean isJpeg(InputStream inputStream) {
        if (inputStream == null) {
            return false;
        }
        inputStream.mark(3);
        byte[] bArr = new byte[3];
        try {
            if (inputStream.read(bArr) == 3) {
                boolean equals = Arrays.equals(f60969a, bArr);
                inputStream.reset();
                return equals;
            }
            throw new TinyException.EOFException("no more data.");
        } catch (Exception unused) {
            return false;
        }
    }

    public static boolean isJpeg(byte[] bArr) {
        if (bArr == null || bArr.length < 3) {
            return false;
        }
        return Arrays.equals(f60969a, new byte[]{bArr[0], bArr[1], bArr[2]});
    }

    public static int getOrientation(String str) {
        int i;
        try {
            i = new ExifInterface(str).getAttributeInt(androidx.exifinterface.media.ExifInterface.TAG_ORIENTATION, 1);
        } catch (Exception e) {
            e.printStackTrace();
            i = 1;
        }
        if (i != 1) {
            if (i != 3) {
                if (i != 6) {
                    if (i != 8) {
                        return 0;
                    }
                    return BitmapUtil.IMAGE_270_DEGREE;
                }
                return 90;
            }
            return BitmapUtil.IMAGE_180_DEGREE;
        }
        return 0;
    }
}
