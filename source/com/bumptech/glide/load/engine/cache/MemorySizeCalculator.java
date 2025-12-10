package com.bumptech.glide.load.engine.cache;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;
import android.text.format.Formatter;
import android.util.DisplayMetrics;
import android.util.Log;
import com.bumptech.glide.util.Preconditions;

/* loaded from: classes3.dex */
public final class MemorySizeCalculator {

    /* renamed from: a */
    public final int f42053a;

    /* renamed from: b */
    public final int f42054b;

    /* renamed from: c */
    public final Context f42055c;

    /* renamed from: d */
    public final int f42056d;

    /* loaded from: classes3.dex */
    public static final class Builder {

        /* renamed from: i */
        public static final int f42057i;

        /* renamed from: a */
        public final Context f42058a;

        /* renamed from: b */
        public ActivityManager f42059b;

        /* renamed from: c */
        public InterfaceC5807b f42060c;

        /* renamed from: e */
        public float f42062e;

        /* renamed from: d */
        public float f42061d = 2.0f;

        /* renamed from: f */
        public float f42063f = 0.4f;

        /* renamed from: g */
        public float f42064g = 0.33f;

        /* renamed from: h */
        public int f42065h = 4194304;

        static {
            int i;
            if (Build.VERSION.SDK_INT < 26) {
                i = 4;
            } else {
                i = 1;
            }
            f42057i = i;
        }

        public Builder(Context context) {
            this.f42062e = f42057i;
            this.f42058a = context;
            this.f42059b = (ActivityManager) context.getSystemService("activity");
            this.f42060c = new C5806a(context.getResources().getDisplayMetrics());
            if (Build.VERSION.SDK_INT >= 26 && MemorySizeCalculator.m50359b(this.f42059b)) {
                this.f42062e = 0.0f;
            }
        }

        public MemorySizeCalculator build() {
            return new MemorySizeCalculator(this);
        }

        public Builder setArrayPoolSize(int i) {
            this.f42065h = i;
            return this;
        }

        public Builder setBitmapPoolScreens(float f) {
            boolean z;
            if (f >= 0.0f) {
                z = true;
            } else {
                z = false;
            }
            Preconditions.checkArgument(z, "Bitmap pool screens must be greater than or equal to 0");
            this.f42062e = f;
            return this;
        }

        public Builder setLowMemoryMaxSizeMultiplier(float f) {
            boolean z;
            if (f >= 0.0f && f <= 1.0f) {
                z = true;
            } else {
                z = false;
            }
            Preconditions.checkArgument(z, "Low memory max size multiplier must be between 0 and 1");
            this.f42064g = f;
            return this;
        }

        public Builder setMaxSizeMultiplier(float f) {
            boolean z;
            if (f >= 0.0f && f <= 1.0f) {
                z = true;
            } else {
                z = false;
            }
            Preconditions.checkArgument(z, "Size multiplier must be between 0 and 1");
            this.f42063f = f;
            return this;
        }

        public Builder setMemoryCacheScreens(float f) {
            boolean z;
            if (f >= 0.0f) {
                z = true;
            } else {
                z = false;
            }
            Preconditions.checkArgument(z, "Memory cache screens must be greater than or equal to 0");
            this.f42061d = f;
            return this;
        }
    }

    /* renamed from: com.bumptech.glide.load.engine.cache.MemorySizeCalculator$a */
    /* loaded from: classes3.dex */
    public static final class C5806a implements InterfaceC5807b {

        /* renamed from: a */
        public final DisplayMetrics f42066a;

        public C5806a(DisplayMetrics displayMetrics) {
            this.f42066a = displayMetrics;
        }

        @Override // com.bumptech.glide.load.engine.cache.MemorySizeCalculator.InterfaceC5807b
        /* renamed from: a */
        public int mo50357a() {
            return this.f42066a.heightPixels;
        }

        @Override // com.bumptech.glide.load.engine.cache.MemorySizeCalculator.InterfaceC5807b
        /* renamed from: b */
        public int mo50356b() {
            return this.f42066a.widthPixels;
        }
    }

    /* renamed from: com.bumptech.glide.load.engine.cache.MemorySizeCalculator$b */
    /* loaded from: classes3.dex */
    public interface InterfaceC5807b {
        /* renamed from: a */
        int mo50357a();

        /* renamed from: b */
        int mo50356b();
    }

    public MemorySizeCalculator(Builder builder) {
        int i;
        boolean z;
        this.f42055c = builder.f42058a;
        if (m50359b(builder.f42059b)) {
            i = builder.f42065h / 2;
        } else {
            i = builder.f42065h;
        }
        this.f42056d = i;
        int m50360a = m50360a(builder.f42059b, builder.f42063f, builder.f42064g);
        float mo50356b = builder.f42060c.mo50356b() * builder.f42060c.mo50357a() * 4;
        int round = Math.round(builder.f42062e * mo50356b);
        int round2 = Math.round(mo50356b * builder.f42061d);
        int i2 = m50360a - i;
        int i3 = round2 + round;
        if (i3 <= i2) {
            this.f42054b = round2;
            this.f42053a = round;
        } else {
            float f = i2;
            float f2 = builder.f42062e;
            float f3 = builder.f42061d;
            float f4 = f / (f2 + f3);
            this.f42054b = Math.round(f3 * f4);
            this.f42053a = Math.round(f4 * builder.f42062e);
        }
        if (Log.isLoggable("MemorySizeCalculator", 3)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Calculation complete, Calculated memory cache size: ");
            sb.append(m50358c(this.f42054b));
            sb.append(", pool size: ");
            sb.append(m50358c(this.f42053a));
            sb.append(", byte array size: ");
            sb.append(m50358c(i));
            sb.append(", memory class limited? ");
            if (i3 > m50360a) {
                z = true;
            } else {
                z = false;
            }
            sb.append(z);
            sb.append(", max size: ");
            sb.append(m50358c(m50360a));
            sb.append(", memoryClass: ");
            sb.append(builder.f42059b.getMemoryClass());
            sb.append(", isLowMemoryDevice: ");
            sb.append(m50359b(builder.f42059b));
        }
    }

    /* renamed from: a */
    public static int m50360a(ActivityManager activityManager, float f, float f2) {
        boolean m50359b = m50359b(activityManager);
        float memoryClass = activityManager.getMemoryClass() * 1048576;
        if (m50359b) {
            f = f2;
        }
        return Math.round(memoryClass * f);
    }

    /* renamed from: b */
    public static boolean m50359b(ActivityManager activityManager) {
        return activityManager.isLowRamDevice();
    }

    /* renamed from: c */
    public final String m50358c(int i) {
        return Formatter.formatFileSize(this.f42055c, i);
    }

    public int getArrayPoolSizeInBytes() {
        return this.f42056d;
    }

    public int getBitmapPoolSize() {
        return this.f42053a;
    }

    public int getMemoryCacheSize() {
        return this.f42054b;
    }
}
