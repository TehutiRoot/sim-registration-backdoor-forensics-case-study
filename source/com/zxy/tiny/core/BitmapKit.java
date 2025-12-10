package com.zxy.tiny.core;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.util.Pair;
import com.zxy.tiny.common.Conditions;
import com.zxy.tiny.common.TinyException;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.IOException;

/* loaded from: classes5.dex */
public final class BitmapKit {

    /* renamed from: com.zxy.tiny.core.BitmapKit$a */
    /* loaded from: classes5.dex */
    public static /* synthetic */ class C10019a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f60960a;

        static {
            int[] iArr = new int[Bitmap.Config.values().length];
            f60960a = iArr;
            try {
                iArr[Bitmap.Config.ARGB_8888.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f60960a[Bitmap.Config.ALPHA_8.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f60960a[Bitmap.Config.ARGB_4444.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f60960a[Bitmap.Config.RGB_565.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public static Pair<Integer, Integer> decodeDimensions(String str) throws Exception {
        FileInputStream fileInputStream;
        FileInputStream fileInputStream2 = null;
        if (Conditions.fileIsExist(str)) {
            try {
                fileInputStream = new FileInputStream(str);
            } catch (Throwable th2) {
                th = th2;
            }
            try {
                Pair<Integer, Integer> decodeDimensions = decodeDimensions(CompressKit.transformToByteArray(fileInputStream));
                try {
                    fileInputStream.close();
                } catch (IOException unused) {
                }
                return decodeDimensions;
            } catch (Throwable th3) {
                th = th3;
                fileInputStream2 = fileInputStream;
                if (fileInputStream2 != null) {
                    try {
                        fileInputStream2.close();
                    } catch (IOException unused2) {
                    }
                }
                throw th;
            }
        }
        return null;
    }

    public static long getBitmapSizeInBytes(Bitmap bitmap) {
        long sizeInBytes;
        if (bitmap != null && !bitmap.isRecycled()) {
            int i = C10019a.f60960a[bitmap.getConfig().ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i == 4) {
                            sizeInBytes = getSizeInBytes(bitmap);
                        } else {
                            throw new TinyException.UnsupportedParamException("this bitmap config is not supported!");
                        }
                    } else {
                        sizeInBytes = getSizeInBytes(bitmap);
                    }
                    return sizeInBytes * 2;
                }
                return getSizeInBytes(bitmap);
            }
            return getSizeInBytes(bitmap) * 4;
        }
        return 0L;
    }

    public static long getSizeInBytes(Bitmap bitmap) {
        if (bitmap == null) {
            return 0L;
        }
        try {
            return bitmap.getAllocationByteCount();
        } catch (Exception unused) {
            return bitmap.getByteCount();
        }
    }

    public static Bitmap rotateBitmap(Bitmap bitmap, int i) {
        if (bitmap != null && !bitmap.isRecycled()) {
            if (i != 90 && i != 180 && i != 270) {
                return bitmap;
            }
            Matrix matrix = new Matrix();
            matrix.setRotate(i, bitmap.getWidth() / 2, bitmap.getHeight() / 2);
            Bitmap createBitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
            bitmap.recycle();
            return createBitmap;
        }
        return bitmap;
    }

    public static Pair<Integer, Integer> decodeDimensions(byte[] bArr) {
        if (bArr == null || bArr.length == 0) {
            return null;
        }
        BitmapFactory.Options defaultDecodeBoundsOptions = CompressKit.getDefaultDecodeBoundsOptions();
        BitmapFactory.decodeByteArray(bArr, 0, bArr.length, defaultDecodeBoundsOptions);
        int i = defaultDecodeBoundsOptions.outWidth;
        if (i == -1 || defaultDecodeBoundsOptions.outHeight == -1) {
            return null;
        }
        return Pair.create(Integer.valueOf(i), Integer.valueOf(defaultDecodeBoundsOptions.outHeight));
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x003b, code lost:
        r5.close();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.util.Pair<java.lang.Integer, java.lang.Integer> decodeDimensions(int r5) throws java.lang.Exception {
        /*
            com.zxy.tiny.Tiny r0 = com.zxy.tiny.Tiny.getInstance()
            android.app.Application r0 = r0.getApplication()
            android.content.res.Resources r0 = r0.getResources()
            r1 = 0
            android.util.TypedValue r2 = new android.util.TypedValue     // Catch: java.lang.Throwable -> L3f
            r2.<init>()     // Catch: java.lang.Throwable -> L3f
            java.io.InputStream r5 = r0.openRawResource(r5, r2)     // Catch: java.lang.Throwable -> L3f
            android.graphics.BitmapFactory$Options r0 = com.zxy.tiny.core.CompressKit.getDefaultDecodeBoundsOptions()     // Catch: java.lang.Throwable -> L36
            android.graphics.BitmapFactory.decodeStream(r5, r1, r0)     // Catch: java.lang.Throwable -> L36
            int r2 = r0.outWidth     // Catch: java.lang.Throwable -> L36
            r3 = -1
            if (r2 == r3) goto L39
            int r4 = r0.outHeight     // Catch: java.lang.Throwable -> L36
            if (r4 != r3) goto L27
            goto L39
        L27:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r2)     // Catch: java.lang.Throwable -> L36
            int r0 = r0.outHeight     // Catch: java.lang.Throwable -> L36
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch: java.lang.Throwable -> L36
            android.util.Pair r1 = android.util.Pair.create(r1, r0)     // Catch: java.lang.Throwable -> L36
            goto L39
        L36:
            r0 = move-exception
            r1 = r5
            goto L40
        L39:
            if (r5 == 0) goto L3e
            r5.close()     // Catch: java.io.IOException -> L3e
        L3e:
            return r1
        L3f:
            r0 = move-exception
        L40:
            if (r1 == 0) goto L45
            r1.close()     // Catch: java.io.IOException -> L45
        L45:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zxy.tiny.core.BitmapKit.decodeDimensions(int):android.util.Pair");
    }

    public static Pair<Integer, Integer> decodeDimensions(FileDescriptor fileDescriptor) {
        if (fileDescriptor == null) {
            return null;
        }
        BitmapFactory.Options defaultDecodeBoundsOptions = CompressKit.getDefaultDecodeBoundsOptions();
        BitmapFactory.decodeFileDescriptor(fileDescriptor, null, defaultDecodeBoundsOptions);
        int i = defaultDecodeBoundsOptions.outWidth;
        if (i == -1 || defaultDecodeBoundsOptions.outHeight == -1) {
            return null;
        }
        return Pair.create(Integer.valueOf(i), Integer.valueOf(defaultDecodeBoundsOptions.outHeight));
    }
}
