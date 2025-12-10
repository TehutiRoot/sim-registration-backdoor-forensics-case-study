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
    public static final Paint f42390a = new Paint(6);

    /* renamed from: b */
    public static final Paint f42391b = new Paint(7);

    /* renamed from: c */
    public static final Paint f42392c;

    /* renamed from: d */
    public static final Set f42393d;

    /* renamed from: e */
    public static final Lock f42394e;

    /* renamed from: com.bumptech.glide.load.resource.bitmap.TransformationUtils$a */
    /* loaded from: classes3.dex */
    public class C5861a implements InterfaceC5863c {

        /* renamed from: a */
        public final /* synthetic */ int f42395a;

        public C5861a(int i) {
            this.f42395a = i;
        }

        @Override // com.bumptech.glide.load.resource.bitmap.TransformationUtils.InterfaceC5863c
        /* renamed from: a */
        public void mo50191a(Canvas canvas, Paint paint, RectF rectF) {
            int i = this.f42395a;
            canvas.drawRoundRect(rectF, i, i, paint);
        }
    }

    /* renamed from: com.bumptech.glide.load.resource.bitmap.TransformationUtils$b */
    /* loaded from: classes3.dex */
    public class C5862b implements InterfaceC5863c {

        /* renamed from: a */
        public final /* synthetic */ float f42396a;

        /* renamed from: b */
        public final /* synthetic */ float f42397b;

        /* renamed from: c */
        public final /* synthetic */ float f42398c;

        /* renamed from: d */
        public final /* synthetic */ float f42399d;

        public C5862b(float f, float f2, float f3, float f4) {
            this.f42396a = f;
            this.f42397b = f2;
            this.f42398c = f3;
            this.f42399d = f4;
        }

        @Override // com.bumptech.glide.load.resource.bitmap.TransformationUtils.InterfaceC5863c
        /* renamed from: a */
        public void mo50191a(Canvas canvas, Paint paint, RectF rectF) {
            Path path = new Path();
            float f = this.f42396a;
            float f2 = this.f42397b;
            float f3 = this.f42398c;
            float f4 = this.f42399d;
            path.addRoundRect(rectF, new float[]{f, f, f2, f2, f3, f3, f4, f4}, Path.Direction.CW);
            canvas.drawPath(path, paint);
        }
    }

    /* renamed from: com.bumptech.glide.load.resource.bitmap.TransformationUtils$c */
    /* loaded from: classes3.dex */
    public interface InterfaceC5863c {
        /* renamed from: a */
        void mo50191a(Canvas canvas, Paint paint, RectF rectF);
    }

    /* renamed from: com.bumptech.glide.load.resource.bitmap.TransformationUtils$d  reason: invalid class name */
    /* loaded from: classes3.dex */
    public static final class locksLockC5864d implements Lock {
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
        Lock lockslockc5864d;
        HashSet hashSet = new HashSet(Arrays.asList("XT1085", "XT1092", "XT1093", "XT1094", "XT1095", "XT1096", "XT1097", "XT1098", "XT1031", "XT1028", "XT937C", "XT1032", "XT1008", "XT1033", "XT1035", "XT1034", "XT939G", "XT1039", "XT1040", "XT1042", "XT1045", "XT1063", "XT1064", "XT1068", "XT1069", "XT1072", "XT1077", "XT1078", "XT1079"));
        f42393d = hashSet;
        if (hashSet.contains(Build.MODEL)) {
            lockslockc5864d = new ReentrantLock();
        } else {
            lockslockc5864d = new locksLockC5864d();
        }
        f42394e = lockslockc5864d;
        Paint paint = new Paint(7);
        f42392c = paint;
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
    }

    /* renamed from: a */
    public static void m50198a(Bitmap bitmap, Bitmap bitmap2, Matrix matrix) {
        Lock lock = f42394e;
        lock.lock();
        try {
            Canvas canvas = new Canvas(bitmap2);
            canvas.drawBitmap(bitmap, matrix, f42390a);
            m50197b(canvas);
            lock.unlock();
        } catch (Throwable th2) {
            f42394e.unlock();
            throw th2;
        }
    }

    /* renamed from: b */
    public static void m50197b(Canvas canvas) {
        canvas.setBitmap(null);
    }

    /* renamed from: c */
    public static Bitmap m50196c(BitmapPool bitmapPool, Bitmap bitmap) {
        Bitmap.Config m50195d = m50195d(bitmap);
        if (m50195d.equals(bitmap.getConfig())) {
            return bitmap;
        }
        Bitmap bitmap2 = bitmapPool.get(bitmap.getWidth(), bitmap.getHeight(), m50195d);
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
        Bitmap bitmap2 = bitmapPool.get(i, i2, m50194e(bitmap));
        setAlpha(bitmap, bitmap2);
        m50198a(bitmap, bitmap2, matrix);
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
        Bitmap m50196c = m50196c(bitmapPool, bitmap);
        Bitmap bitmap2 = bitmapPool.get(min, min, m50195d(bitmap));
        bitmap2.setHasAlpha(true);
        Lock lock = f42394e;
        lock.lock();
        try {
            Canvas canvas = new Canvas(bitmap2);
            canvas.drawCircle(f2, f2, f2, f42391b);
            canvas.drawBitmap(m50196c, (Rect) null, rectF, f42392c);
            m50197b(canvas);
            lock.unlock();
            if (!m50196c.equals(bitmap)) {
                bitmapPool.put(m50196c);
            }
            return bitmap2;
        } catch (Throwable th2) {
            f42394e.unlock();
            throw th2;
        }
    }

    /* renamed from: d */
    public static Bitmap.Config m50195d(Bitmap bitmap) {
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
    public static Bitmap.Config m50194e(Bitmap bitmap) {
        if (bitmap.getConfig() != null) {
            return bitmap.getConfig();
        }
        return Bitmap.Config.ARGB_8888;
    }

    /* renamed from: f */
    public static void m50193f(int i, Matrix matrix) {
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
        Bitmap bitmap2 = bitmapPool.get((int) (bitmap.getWidth() * min), (int) (bitmap.getHeight() * min), m50194e(bitmap));
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
        m50198a(bitmap, bitmap2, matrix);
        return bitmap2;
    }

    /* renamed from: g */
    public static Bitmap m50192g(BitmapPool bitmapPool, Bitmap bitmap, InterfaceC5863c interfaceC5863c) {
        Bitmap.Config m50195d = m50195d(bitmap);
        Bitmap m50196c = m50196c(bitmapPool, bitmap);
        Bitmap bitmap2 = bitmapPool.get(m50196c.getWidth(), m50196c.getHeight(), m50195d);
        bitmap2.setHasAlpha(true);
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(m50196c, tileMode, tileMode);
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setShader(bitmapShader);
        RectF rectF = new RectF(0.0f, 0.0f, bitmap2.getWidth(), bitmap2.getHeight());
        Lock lock = f42394e;
        lock.lock();
        try {
            Canvas canvas = new Canvas(bitmap2);
            canvas.drawColor(0, PorterDuff.Mode.CLEAR);
            interfaceC5863c.mo50191a(canvas, paint, rectF);
            m50197b(canvas);
            lock.unlock();
            if (!m50196c.equals(bitmap)) {
                bitmapPool.put(m50196c);
            }
            return bitmap2;
        } catch (Throwable th2) {
            f42394e.unlock();
            throw th2;
        }
    }

    public static Lock getBitmapDrawableLock() {
        return f42394e;
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
        m50193f(i, matrix);
        RectF rectF = new RectF(0.0f, 0.0f, bitmap.getWidth(), bitmap.getHeight());
        matrix.mapRect(rectF);
        Bitmap bitmap2 = bitmapPool.get(Math.round(rectF.width()), Math.round(rectF.height()), m50194e(bitmap));
        matrix.postTranslate(-rectF.left, -rectF.top);
        bitmap2.setHasAlpha(bitmap.hasAlpha());
        m50198a(bitmap, bitmap2, matrix);
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
        return m50192g(bitmapPool, bitmap, new C5861a(i));
    }

    public static Bitmap roundedCorners(@NonNull BitmapPool bitmapPool, @NonNull Bitmap bitmap, float f, float f2, float f3, float f4) {
        return m50192g(bitmapPool, bitmap, new C5862b(f, f2, f3, f4));
    }
}