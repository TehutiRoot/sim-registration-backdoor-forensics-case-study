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
    public final int f42065a;

    /* renamed from: b */
    public final int f42066b;

    /* renamed from: c */
    public final Context f42067c;

    /* renamed from: d */
    public final int f42068d;

    /* loaded from: classes3.dex */
    public static final class Builder {

        /* renamed from: i */
        public static final int f42069i;

        /* renamed from: a */
        public final Context f42070a;

        /* renamed from: b */
        public ActivityManager f42071b;

        /* renamed from: c */
        public InterfaceC5796b f42072c;

        /* renamed from: e */
        public float f42074e;

        /* renamed from: d */
        public float f42073d = 2.0f;

        /* renamed from: f */
        public float f42075f = 0.4f;

        /* renamed from: g */
        public float f42076g = 0.33f;

        /* renamed from: h */
        public int f42077h = 4194304;

        static {
            int i;
            if (Build.VERSION.SDK_INT < 26) {
                i = 4;
            } else {
                i = 1;
            }
            f42069i = i;
        }

        public Builder(Context context) {
            this.f42074e = f42069i;
            this.f42070a = context;
            this.f42071b = (ActivityManager) context.getSystemService("activity");
            this.f42072c = new C5795a(context.getResources().getDisplayMetrics());
            if (Build.VERSION.SDK_INT >= 26 && MemorySizeCalculator.m50356b(this.f42071b)) {
                this.f42074e = 0.0f;
            }
        }

        public MemorySizeCalculator build() {
            return new MemorySizeCalculator(this);
        }

        public Builder setArrayPoolSize(int i) {
            this.f42077h = i;
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
            this.f42074e = f;
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
            this.f42076g = f;
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
            this.f42075f = f;
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
            this.f42073d = f;
            return this;
        }
    }

    /* renamed from: com.bumptech.glide.load.engine.cache.MemorySizeCalculator$a */
    /* loaded from: classes3.dex */
    public static final class C5795a implements InterfaceC5796b {

        /* renamed from: a */
        public final DisplayMetrics f42078a;

        public C5795a(DisplayMetrics displayMetrics) {
            this.f42078a = displayMetrics;
        }

        @Override // com.bumptech.glide.load.engine.cache.MemorySizeCalculator.InterfaceC5796b
        /* renamed from: a */
        public int mo50354a() {
            return this.f42078a.heightPixels;
        }

        @Override // com.bumptech.glide.load.engine.cache.MemorySizeCalculator.InterfaceC5796b
        /* renamed from: b */
        public int mo50353b() {
            return this.f42078a.widthPixels;
        }
    }

    /* renamed from: com.bumptech.glide.load.engine.cache.MemorySizeCalculator$b */
    /* loaded from: classes3.dex */
    public interface InterfaceC5796b {
        /* renamed from: a */
        int mo50354a();

        /* renamed from: b */
        int mo50353b();
    }

    public MemorySizeCalculator(Builder builder) {
        int i;
        boolean z;
        this.f42067c = builder.f42070a;
        if (m50356b(builder.f42071b)) {
            i = builder.f42077h / 2;
        } else {
            i = builder.f42077h;
        }
        this.f42068d = i;
        int m50357a = m50357a(builder.f42071b, builder.f42075f, builder.f42076g);
        float mo50353b = builder.f42072c.mo50353b() * builder.f42072c.mo50354a() * 4;
        int round = Math.round(builder.f42074e * mo50353b);
        int round2 = Math.round(mo50353b * builder.f42073d);
        int i2 = m50357a - i;
        int i3 = round2 + round;
        if (i3 <= i2) {
            this.f42066b = round2;
            this.f42065a = round;
        } else {
            float f = i2;
            float f2 = builder.f42074e;
            float f3 = builder.f42073d;
            float f4 = f / (f2 + f3);
            this.f42066b = Math.round(f3 * f4);
            this.f42065a = Math.round(f4 * builder.f42074e);
        }
        if (Log.isLoggable("MemorySizeCalculator", 3)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Calculation complete, Calculated memory cache size: ");
            sb.append(m50355c(this.f42066b));
            sb.append(", pool size: ");
            sb.append(m50355c(this.f42065a));
            sb.append(", byte array size: ");
            sb.append(m50355c(i));
            sb.append(", memory class limited? ");
            if (i3 > m50357a) {
                z = true;
            } else {
                z = false;
            }
            sb.append(z);
            sb.append(", max size: ");
            sb.append(m50355c(m50357a));
            sb.append(", memoryClass: ");
            sb.append(builder.f42071b.getMemoryClass());
            sb.append(", isLowMemoryDevice: ");
            sb.append(m50356b(builder.f42071b));
        }
    }

    /* renamed from: a */
    public static int m50357a(ActivityManager activityManager, float f, float f2) {
        boolean m50356b = m50356b(activityManager);
        float memoryClass = activityManager.getMemoryClass() * 1048576;
        if (m50356b) {
            f = f2;
        }
        return Math.round(memoryClass * f);
    }

    /* renamed from: b */
    public static boolean m50356b(ActivityManager activityManager) {
        return activityManager.isLowRamDevice();
    }

    /* renamed from: c */
    public final String m50355c(int i) {
        return Formatter.formatFileSize(this.f42067c, i);
    }

    public int getArrayPoolSizeInBytes() {
        return this.f42068d;
    }

    public int getBitmapPoolSize() {
        return this.f42065a;
    }

    public int getMemoryCacheSize() {
        return this.f42066b;
    }
}