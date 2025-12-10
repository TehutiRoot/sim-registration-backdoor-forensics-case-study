package androidx.core.graphics;

import android.graphics.Bitmap;
import android.graphics.BlendMode;
import android.graphics.ColorSpace;
import android.graphics.Paint;
import android.os.Build;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;

/* loaded from: classes2.dex */
public final class BitmapCompat {

    /* renamed from: androidx.core.graphics.BitmapCompat$a */
    /* loaded from: classes2.dex */
    public static class C3985a {
        @DoNotInline
        /* renamed from: a */
        public static boolean m57388a(Bitmap bitmap) {
            return bitmap.hasMipMap();
        }

        @DoNotInline
        /* renamed from: b */
        public static void m57387b(Bitmap bitmap, boolean z) {
            bitmap.setHasMipMap(z);
        }
    }

    /* renamed from: androidx.core.graphics.BitmapCompat$b */
    /* loaded from: classes2.dex */
    public static class C3986b {
        @DoNotInline
        /* renamed from: a */
        public static int m57386a(Bitmap bitmap) {
            return bitmap.getAllocationByteCount();
        }
    }

    /* renamed from: androidx.core.graphics.BitmapCompat$c */
    /* loaded from: classes2.dex */
    public static class C3987c {
        @DoNotInline
        /* renamed from: a */
        public static Bitmap m57385a(Bitmap bitmap) {
            if (bitmap.getConfig() == Bitmap.Config.HARDWARE) {
                Bitmap.Config config = Bitmap.Config.ARGB_8888;
                if (Build.VERSION.SDK_INT >= 31) {
                    config = C3989e.m57381a(bitmap);
                }
                return bitmap.copy(config, true);
            }
            return bitmap;
        }

        @DoNotInline
        /* renamed from: b */
        public static Bitmap m57384b(int i, int i2, Bitmap bitmap, boolean z) {
            Bitmap.Config config = bitmap.getConfig();
            ColorSpace colorSpace = bitmap.getColorSpace();
            ColorSpace colorSpace2 = ColorSpace.get(ColorSpace.Named.LINEAR_EXTENDED_SRGB);
            if (z && !bitmap.getColorSpace().equals(colorSpace2)) {
                config = Bitmap.Config.RGBA_F16;
                colorSpace = colorSpace2;
            } else if (bitmap.getConfig() == Bitmap.Config.HARDWARE) {
                config = Bitmap.Config.ARGB_8888;
                if (Build.VERSION.SDK_INT >= 31) {
                    config = C3989e.m57381a(bitmap);
                }
            }
            return Bitmap.createBitmap(i, i2, config, bitmap.hasAlpha(), colorSpace);
        }

        @DoNotInline
        /* renamed from: c */
        public static boolean m57383c(Bitmap bitmap) {
            ColorSpace colorSpace = ColorSpace.get(ColorSpace.Named.LINEAR_EXTENDED_SRGB);
            if (bitmap.getConfig() == Bitmap.Config.RGBA_F16 && bitmap.getColorSpace().equals(colorSpace)) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: androidx.core.graphics.BitmapCompat$d */
    /* loaded from: classes2.dex */
    public static class C3988d {
        @DoNotInline
        /* renamed from: a */
        public static void m57382a(Paint paint) {
            paint.setBlendMode(BlendMode.SRC);
        }
    }

    /* renamed from: androidx.core.graphics.BitmapCompat$e */
    /* loaded from: classes2.dex */
    public static class C3989e {
        @DoNotInline
        /* renamed from: a */
        public static Bitmap.Config m57381a(Bitmap bitmap) {
            if (bitmap.getHardwareBuffer().getFormat() == 22) {
                return Bitmap.Config.RGBA_F16;
            }
            return Bitmap.Config.ARGB_8888;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:115:0x01a9, code lost:
        if (androidx.core.graphics.BitmapCompat.C3987c.m57383c(r11) == false) goto L98;
     */
    @androidx.annotation.NonNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.graphics.Bitmap createScaledBitmap(@androidx.annotation.NonNull android.graphics.Bitmap r21, int r22, int r23, @androidx.annotation.Nullable android.graphics.Rect r24, boolean r25) {
        /*
            Method dump skipped, instructions count: 534
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.graphics.BitmapCompat.createScaledBitmap(android.graphics.Bitmap, int, int, android.graphics.Rect, boolean):android.graphics.Bitmap");
    }

    public static int getAllocationByteCount(@NonNull Bitmap bitmap) {
        return C3986b.m57386a(bitmap);
    }

    public static boolean hasMipMap(@NonNull Bitmap bitmap) {
        return C3985a.m57388a(bitmap);
    }

    public static void setHasMipMap(@NonNull Bitmap bitmap, boolean z) {
        C3985a.m57387b(bitmap, z);
    }

    @VisibleForTesting
    public static int sizeAtStep(int i, int i2, int i3, int i4) {
        return i3 == 0 ? i2 : i3 > 0 ? i * (1 << (i4 - i3)) : i2 << ((-i3) - 1);
    }
}
