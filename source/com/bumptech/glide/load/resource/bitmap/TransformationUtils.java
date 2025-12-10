package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.os.Build;
import android.util.Log;
import androidx.annotation.NonNull;
import com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool;
import com.bumptech.glide.util.Preconditions;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import th.p047co.dtac.android.dtacone.util.bitmap.BitmapUtil;

/* loaded from: classes3.dex */
public final class TransformationUtils {
    public static final int PAINT_FLAGS = 6;

    /* renamed from: a */
    public static final Paint f42378a = new Paint(6);

    /* renamed from: b */
    public static final Paint f42379b = new Paint(7);

    /* renamed from: c */
    public static final Paint f42380c;

    /* renamed from: d */
    public static final Set f42381d;

    /* renamed from: e */
    public static final Lock f42382e;

    /* renamed from: com.bumptech.glide.load.resource.bitmap.TransformationUtils$a */
    /* loaded from: classes3.dex */
    public class C5872a implements InterfaceC5874c {

        /* renamed from: a */
        public final /* synthetic */ int f42383a;

        public C5872a(int i) {
            this.f42383a = i;
        }

        @Override // com.bumptech.glide.load.resource.bitmap.TransformationUtils.InterfaceC5874c
        /* renamed from: a */
        public void mo50194a(Canvas canvas, Paint paint, RectF rectF) {
            int i = this.f42383a;
            canvas.drawRoundRect(rectF, i, i, paint);
        }
    }

    /* renamed from: com.bumptech.glide.load.resource.bitmap.TransformationUtils$b */
    /* loaded from: classes3.dex */
    public class C5873b implements InterfaceC5874c {

        /* renamed from: a */
        public final /* synthetic */ float f42384a;

        /* renamed from: b */
        public final /* synthetic */ float f42385b;

        /* renamed from: c */
        public final /* synthetic */ float f42386c;

        /* renamed from: d */
        public final /* synthetic */ float f42387d;

        public C5873b(float f, float f2, float f3, float f4) {
            this.f42384a = f;
            this.f42385b = f2;
            this.f42386c = f3;
            this.f42387d = f4;
        }

        @Override // com.bumptech.glide.load.resource.bitmap.TransformationUtils.InterfaceC5874c
        /* renamed from: a */
        public void mo50194a(Canvas canvas, Paint paint, RectF rectF) {
            Path path = new Path();
            float f = this.f42384a;
            float f2 = this.f42385b;
            float f3 = this.f42386c;
            float f4 = this.f42387d;
            path.addRoundRect(rectF, new float[]{f, f, f2, f2, f3, f3, f4, f4}, Path.Direction.CW);
            canvas.drawPath(path, paint);
        }
    }

    /* renamed from: com.bumptech.glide.load.resource.bitmap.TransformationUtils$c */
    /* loaded from: classes3.dex */
    public interface InterfaceC5874c {
        /* renamed from: a */
        void mo50194a(Canvas canvas, Paint paint, RectF rectF);
    }

    /* renamed from: com.bumptech.glide.load.resource.bitmap.TransformationUtils$d  reason: invalid class name */
    /* loaded from: classes3.dex */
    public static final class locksLockC5875d implements Lock {
        @Override // java.util.concurrent.locks.Lock
        public void lock() {
        }

        @Override // java.util.concurrent.locks.Lock
        public void lockInterruptibly() {
        }

        @Override // java.util.concurrent.locks.Lock
        public Condition newCondition() {
            throw new UnsupportedOperationException("Should not be called");
        }

        @Override // java.util.concurrent.locks.Lock
        public boolean tryLock() {
            return true;
        }

        @Override // java.util.concurrent.locks.Lock
        public void unlock() {
        }

        @Override // java.util.concurrent.locks.Lock
        public boolean tryLock(long j, TimeUnit timeUnit) {
            return true;
        }
    }

    static {
        Lock lockslockc5875d;
        HashSet hashSet = new HashSet(Arrays.asList("XT1085", "XT1092", "XT1093", "XT1094", "XT1095", "XT1096", "XT1097", "XT1098", "XT1031", "XT1028", "XT937C", "XT1032", "XT1008", "XT1033", "XT1035", "XT1034", "XT939G", "XT1039", "XT1040", "XT1042", "XT1045", "XT1063", "XT1064", "XT1068", "XT1069", "XT1072", "XT1077", "XT1078", "XT1079"));
        f42381d = hashSet;
        if (hashSet.contains(Build.MODEL)) {
            lockslockc5875d = new ReentrantLock();
        } else {
            lockslockc5875d = new locksLockC5875d();
        }
        f42382e = lockslockc5875d;
        Paint paint = new Paint(7);
        f42380c = paint;
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
    }

    /* renamed from: a */
    public static void m50201a(Bitmap bitmap, Bitmap bitmap2, Matrix matrix) {
        Lock lock = f42382e;
        lock.lock();
        try {
            Canvas canvas = new Canvas(bitmap2);
            canvas.drawBitmap(bitmap, matrix, f42378a);
            m50200b(canvas);
            lock.unlock();
        } catch (Throwable th2) {
            f42382e.unlock();
            throw th2;
        }
    }

    /* renamed from: b */
    public static void m50200b(Canvas canvas) {
        canvas.setBitmap(null);
    }

    /* renamed from: c */
    public static Bitmap m50199c(BitmapPool bitmapPool, Bitmap bitmap) {
        Bitmap.Config m50198d = m50198d(bitmap);
        if (m50198d.equals(bitmap.getConfig())) {
            return bitmap;
        }
        Bitmap bitmap2 = bitmapPool.get(bitmap.getWidth(), bitmap.getHeight(), m50198d);
        new Canvas(bitmap2).drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
        return bitmap2;
    }

    public static Bitmap centerCrop(@NonNull BitmapPool bitmapPool, @NonNull Bitmap bitmap, int i, int i2) {
        float width;
        float height;
        if (bitmap.getWidth() == i && bitmap.getHeight() == i2) {
            return bitmap;
        }
        Matrix matrix = new Matrix();
        float f = 0.0f;
        if (bitmap.getWidth() * i2 > bitmap.getHeight() * i) {
            width = i2 / bitmap.getHeight();
            f = (i - (bitmap.getWidth() * width)) * 0.5f;
            height = 0.0f;
        } else {
            width = i / bitmap.getWidth();
            height = (i2 - (bitmap.getHeight() * width)) * 0.5f;
        }
        matrix.setScale(width, width);
        matrix.postTranslate((int) (f + 0.5f), (int) (height + 0.5f));
        Bitmap bitmap2 = bitmapPool.get(i, i2, m50197e(bitmap));
        setAlpha(bitmap, bitmap2);
        m50201a(bitmap, bitmap2, matrix);
        return bitmap2;
    }

    public static Bitmap centerInside(@NonNull BitmapPool bitmapPool, @NonNull Bitmap bitmap, int i, int i2) {
        if (bitmap.getWidth() <= i && bitmap.getHeight() <= i2) {
            Log.isLoggable("TransformationUtils", 2);
            return bitmap;
        }
        Log.isLoggable("TransformationUtils", 2);
        return fitCenter(bitmapPool, bitmap, i, i2);
    }

    public static Bitmap circleCrop(@NonNull BitmapPool bitmapPool, @NonNull Bitmap bitmap, int i, int i2) {
        int min = Math.min(i, i2);
        float f = min;
        float f2 = f / 2.0f;
        float width = bitmap.getWidth();
        float height = bitmap.getHeight();
        float max = Math.max(f / width, f / height);
        float f3 = width * max;
        float f4 = max * height;
        float f5 = (f - f3) / 2.0f;
        float f6 = (f - f4) / 2.0f;
        RectF rectF = new RectF(f5, f6, f3 + f5, f4 + f6);
        Bitmap m50199c = m50199c(bitmapPool, bitmap);
        Bitmap bitmap2 = bitmapPool.get(min, min, m50198d(bitmap));
        bitmap2.setHasAlpha(true);
        Lock lock = f42382e;
        lock.lock();
        try {
            Canvas canvas = new Canvas(bitmap2);
            canvas.drawCircle(f2, f2, f2, f42379b);
            canvas.drawBitmap(m50199c, (Rect) null, rectF, f42380c);
            m50200b(canvas);
            lock.unlock();
            if (!m50199c.equals(bitmap)) {
                bitmapPool.put(m50199c);
            }
            return bitmap2;
        } catch (Throwable th2) {
            f42382e.unlock();
            throw th2;
        }
    }

    /* renamed from: d */
    public static Bitmap.Config m50198d(Bitmap bitmap) {
        Bitmap.Config config;
        Bitmap.Config config2;
        if (Build.VERSION.SDK_INT >= 26) {
            config = Bitmap.Config.RGBA_F16;
            if (config.equals(bitmap.getConfig())) {
                config2 = Bitmap.Config.RGBA_F16;
                return config2;
            }
        }
        return Bitmap.Config.ARGB_8888;
    }

    /* renamed from: e */
    public static Bitmap.Config m50197e(Bitmap bitmap) {
        if (bitmap.getConfig() != null) {
            return bitmap.getConfig();
        }
        return Bitmap.Config.ARGB_8888;
    }

    /* renamed from: f */
    public static void m50196f(int i, Matrix matrix) {
        switch (i) {
            case 2:
                matrix.setScale(-1.0f, 1.0f);
                return;
            case 3:
                matrix.setRotate(180.0f);
                return;
            case 4:
                matrix.setRotate(180.0f);
                matrix.postScale(-1.0f, 1.0f);
                return;
            case 5:
                matrix.setRotate(90.0f);
                matrix.postScale(-1.0f, 1.0f);
                return;
            case 6:
                matrix.setRotate(90.0f);
                return;
            case 7:
                matrix.setRotate(-90.0f);
                matrix.postScale(-1.0f, 1.0f);
                return;
            case 8:
                matrix.setRotate(-90.0f);
                return;
            default:
                return;
        }
    }

    public static Bitmap fitCenter(@NonNull BitmapPool bitmapPool, @NonNull Bitmap bitmap, int i, int i2) {
        if (bitmap.getWidth() == i && bitmap.getHeight() == i2) {
            Log.isLoggable("TransformationUtils", 2);
            return bitmap;
        }
        float min = Math.min(i / bitmap.getWidth(), i2 / bitmap.getHeight());
        int round = Math.round(bitmap.getWidth() * min);
        int round2 = Math.round(bitmap.getHeight() * min);
        if (bitmap.getWidth() == round && bitmap.getHeight() == round2) {
            Log.isLoggable("TransformationUtils", 2);
            return bitmap;
        }
        Bitmap bitmap2 = bitmapPool.get((int) (bitmap.getWidth() * min), (int) (bitmap.getHeight() * min), m50197e(bitmap));
        setAlpha(bitmap, bitmap2);
        if (Log.isLoggable("TransformationUtils", 2)) {
            StringBuilder sb = new StringBuilder();
            sb.append("request: ");
            sb.append(i);
            sb.append("x");
            sb.append(i2);
            StringBuilder sb2 = new StringBuilder();
            sb2.append("toFit:   ");
            sb2.append(bitmap.getWidth());
            sb2.append("x");
            sb2.append(bitmap.getHeight());
            StringBuilder sb3 = new StringBuilder();
            sb3.append("toReuse: ");
            sb3.append(bitmap2.getWidth());
            sb3.append("x");
            sb3.append(bitmap2.getHeight());
            StringBuilder sb4 = new StringBuilder();
            sb4.append("minPct:   ");
            sb4.append(min);
        }
        Matrix matrix = new Matrix();
        matrix.setScale(min, min);
        m50201a(bitmap, bitmap2, matrix);
        return bitmap2;
    }

    /* renamed from: g */
    public static Bitmap m50195g(BitmapPool bitmapPool, Bitmap bitmap, InterfaceC5874c interfaceC5874c) {
        Bitmap.Config m50198d = m50198d(bitmap);
        Bitmap m50199c = m50199c(bitmapPool, bitmap);
        Bitmap bitmap2 = bitmapPool.get(m50199c.getWidth(), m50199c.getHeight(), m50198d);
        bitmap2.setHasAlpha(true);
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(m50199c, tileMode, tileMode);
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setShader(bitmapShader);
        RectF rectF = new RectF(0.0f, 0.0f, bitmap2.getWidth(), bitmap2.getHeight());
        Lock lock = f42382e;
        lock.lock();
        try {
            Canvas canvas = new Canvas(bitmap2);
            canvas.drawColor(0, PorterDuff.Mode.CLEAR);
            interfaceC5874c.mo50194a(canvas, paint, rectF);
            m50200b(canvas);
            lock.unlock();
            if (!m50199c.equals(bitmap)) {
                bitmapPool.put(m50199c);
            }
            return bitmap2;
        } catch (Throwable th2) {
            f42382e.unlock();
            throw th2;
        }
    }

    public static Lock getBitmapDrawableLock() {
        return f42382e;
    }

    public static int getExifOrientationDegrees(int i) {
        switch (i) {
            case 3:
            case 4:
                return BitmapUtil.IMAGE_180_DEGREE;
            case 5:
            case 6:
                return 90;
            case 7:
            case 8:
                return BitmapUtil.IMAGE_270_DEGREE;
            default:
                return 0;
        }
    }

    public static boolean isExifOrientationRequired(int i) {
        switch (i) {
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
                return true;
            default:
                return false;
        }
    }

    public static Bitmap rotateImage(@NonNull Bitmap bitmap, int i) {
        if (i != 0) {
            try {
                Matrix matrix = new Matrix();
                matrix.setRotate(i);
                return Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
            } catch (Exception unused) {
                Log.isLoggable("TransformationUtils", 6);
                return bitmap;
            }
        }
        return bitmap;
    }

    public static Bitmap rotateImageExif(@NonNull BitmapPool bitmapPool, @NonNull Bitmap bitmap, int i) {
        if (!isExifOrientationRequired(i)) {
            return bitmap;
        }
        Matrix matrix = new Matrix();
        m50196f(i, matrix);
        RectF rectF = new RectF(0.0f, 0.0f, bitmap.getWidth(), bitmap.getHeight());
        matrix.mapRect(rectF);
        Bitmap bitmap2 = bitmapPool.get(Math.round(rectF.width()), Math.round(rectF.height()), m50197e(bitmap));
        matrix.postTranslate(-rectF.left, -rectF.top);
        bitmap2.setHasAlpha(bitmap.hasAlpha());
        m50201a(bitmap, bitmap2, matrix);
        return bitmap2;
    }

    @Deprecated
    public static Bitmap roundedCorners(@NonNull BitmapPool bitmapPool, @NonNull Bitmap bitmap, int i, int i2, int i3) {
        return roundedCorners(bitmapPool, bitmap, i3);
    }

    public static void setAlpha(Bitmap bitmap, Bitmap bitmap2) {
        bitmap2.setHasAlpha(bitmap.hasAlpha());
    }

    public static Bitmap roundedCorners(@NonNull BitmapPool bitmapPool, @NonNull Bitmap bitmap, int i) {
        Preconditions.checkArgument(i > 0, "roundingRadius must be greater than 0.");
        return m50195g(bitmapPool, bitmap, new C5872a(i));
    }

    public static Bitmap roundedCorners(@NonNull BitmapPool bitmapPool, @NonNull Bitmap bitmap, float f, float f2, float f3, float f4) {
        return m50195g(bitmapPool, bitmap, new C5873b(f, f2, f3, f4));
    }
}
