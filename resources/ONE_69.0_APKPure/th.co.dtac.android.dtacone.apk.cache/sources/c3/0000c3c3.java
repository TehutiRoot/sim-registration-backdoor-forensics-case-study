package com.zxy.tiny.core;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Build;
import android.util.DisplayMetrics;
import android.util.Pair;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes5.dex */
public final class CompressKit {
    public static final Bitmap.Config DEFAULT_CONFIG = Bitmap.Config.ARGB_8888;
    public static final int DEFAULT_MAX_COMPRESS_SIZE = 1280;
    public static final int DEFAULT_QUALITY = 76;

    /* renamed from: com.zxy.tiny.core.CompressKit$a */
    /* loaded from: classes5.dex */
    public static /* synthetic */ class C10009a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f60977a;

        static {
            int[] iArr = new int[Bitmap.Config.values().length];
            f60977a = iArr;
            try {
                iArr[Bitmap.Config.ARGB_8888.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f60977a[Bitmap.Config.ARGB_4444.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f60977a[Bitmap.Config.ALPHA_8.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f60977a[Bitmap.Config.RGB_565.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public static Bitmap.Config filterConfig(Bitmap.Config config) {
        if (config == null) {
            return DEFAULT_CONFIG;
        }
        int i = C10009a.f60977a[config.ordinal()];
        if (i != 1 && i != 2 && i != 3) {
            if (i == 4) {
                return Bitmap.Config.RGB_565;
            }
            return config;
        }
        return Bitmap.Config.ARGB_8888;
    }

    public static int getBaseline(int i) {
        return i <= 0 ? DEFAULT_MAX_COMPRESS_SIZE : i;
    }

    public static BitmapFactory.Options getDefaultDecodeBoundsOptions() {
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        options.inTempStorage = new byte[16384];
        return options;
    }

    public static BitmapFactory.Options getDefaultDecodeOptions() {
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = false;
        options.inScaled = true;
        options.inMutable = true;
        options.inTempStorage = new byte[16384];
        if (Build.VERSION.SDK_INT < 24) {
            options.inDither = true;
        }
        return options;
    }

    public static Pair<Integer, Integer> getDeviceScreenSizeInPixels() {
        DisplayMetrics displayMetrics = Resources.getSystem().getDisplayMetrics();
        return Pair.create(Integer.valueOf(displayMetrics.widthPixels), Integer.valueOf(displayMetrics.heightPixels));
    }

    public static byte[] transformToByteArray(InputStream inputStream) {
        if (inputStream == null) {
            return new byte[0];
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[4096];
        while (true) {
            try {
                try {
                    int read = inputStream.read(bArr);
                    if (read != -1) {
                        byteArrayOutputStream.write(bArr, 0, read);
                    } else {
                        try {
                            break;
                        } catch (IOException unused) {
                        }
                    }
                } catch (Throwable th2) {
                    try {
                        byteArrayOutputStream.close();
                    } catch (IOException unused2) {
                    }
                    throw th2;
                }
            } catch (Exception e) {
                e.printStackTrace();
                byte[] bArr2 = new byte[0];
                try {
                    byteArrayOutputStream.close();
                } catch (IOException unused3) {
                }
                return bArr2;
            }
        }
        byteArrayOutputStream.close();
        return byteArrayOutputStream.toByteArray();
    }
}