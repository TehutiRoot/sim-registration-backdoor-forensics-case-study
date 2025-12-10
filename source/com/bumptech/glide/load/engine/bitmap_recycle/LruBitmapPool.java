package com.bumptech.glide.load.engine.bitmap_recycle;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.os.Build;
import android.util.Log;
import androidx.annotation.NonNull;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes3.dex */
public class LruBitmapPool implements BitmapPool {

    /* renamed from: k */
    public static final Bitmap.Config f41993k = Bitmap.Config.ARGB_8888;

    /* renamed from: a */
    public final InterfaceC22504un0 f41994a;

    /* renamed from: b */
    public final Set f41995b;

    /* renamed from: c */
    public final long f41996c;

    /* renamed from: d */
    public final InterfaceC5795a f41997d;

    /* renamed from: e */
    public long f41998e;

    /* renamed from: f */
    public long f41999f;

    /* renamed from: g */
    public int f42000g;

    /* renamed from: h */
    public int f42001h;

    /* renamed from: i */
    public int f42002i;

    /* renamed from: j */
    public int f42003j;

    /* renamed from: com.bumptech.glide.load.engine.bitmap_recycle.LruBitmapPool$a */
    /* loaded from: classes3.dex */
    public interface InterfaceC5795a {
        /* renamed from: a */
        void mo50400a(Bitmap bitmap);

        /* renamed from: b */
        void mo50399b(Bitmap bitmap);
    }

    /* renamed from: com.bumptech.glide.load.engine.bitmap_recycle.LruBitmapPool$b */
    /* loaded from: classes3.dex */
    public static final class C5796b implements InterfaceC5795a {
        @Override // com.bumptech.glide.load.engine.bitmap_recycle.LruBitmapPool.InterfaceC5795a
        /* renamed from: a */
        public void mo50400a(Bitmap bitmap) {
        }

        @Override // com.bumptech.glide.load.engine.bitmap_recycle.LruBitmapPool.InterfaceC5795a
        /* renamed from: b */
        public void mo50399b(Bitmap bitmap) {
        }
    }

    public LruBitmapPool(long j, InterfaceC22504un0 interfaceC22504un0, Set set) {
        this.f41996c = j;
        this.f41998e = j;
        this.f41994a = interfaceC22504un0;
        this.f41995b = set;
        this.f41997d = new C5796b();
    }

    /* renamed from: a */
    public static void m50411a(Bitmap.Config config) {
        Bitmap.Config config2;
        if (Build.VERSION.SDK_INT >= 26) {
            config2 = Bitmap.Config.HARDWARE;
            if (config != config2) {
                return;
            }
            throw new IllegalArgumentException("Cannot create a mutable Bitmap with config: " + config + ". Consider setting Downsampler#ALLOW_HARDWARE_CONFIG to false in your RequestOptions and/or in GlideBuilder.setDefaultRequestOptions");
        }
    }

    /* renamed from: b */
    public static Bitmap m50410b(int i, int i2, Bitmap.Config config) {
        if (config == null) {
            config = f41993k;
        }
        return Bitmap.createBitmap(i, i2, config);
    }

    /* renamed from: f */
    public static Set m50406f() {
        Bitmap.Config config;
        HashSet hashSet = new HashSet(Arrays.asList(Bitmap.Config.values()));
        int i = Build.VERSION.SDK_INT;
        hashSet.add(null);
        if (i >= 26) {
            config = Bitmap.Config.HARDWARE;
            hashSet.remove(config);
        }
        return Collections.unmodifiableSet(hashSet);
    }

    /* renamed from: g */
    public static InterfaceC22504un0 m50405g() {
        return new SizeConfigStrategy();
    }

    /* renamed from: i */
    public static void m50403i(Bitmap bitmap) {
        bitmap.setPremultiplied(true);
    }

    /* renamed from: j */
    public static void m50402j(Bitmap bitmap) {
        bitmap.setHasAlpha(true);
        m50403i(bitmap);
    }

    /* renamed from: c */
    public final void m50409c() {
        if (Log.isLoggable("LruBitmapPool", 2)) {
            m50408d();
        }
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool
    public void clearMemory() {
        Log.isLoggable("LruBitmapPool", 3);
        m50401k(0L);
    }

    /* renamed from: d */
    public final void m50408d() {
        StringBuilder sb = new StringBuilder();
        sb.append("Hits=");
        sb.append(this.f42000g);
        sb.append(", misses=");
        sb.append(this.f42001h);
        sb.append(", puts=");
        sb.append(this.f42002i);
        sb.append(", evictions=");
        sb.append(this.f42003j);
        sb.append(", currentSize=");
        sb.append(this.f41999f);
        sb.append(", maxSize=");
        sb.append(this.f41998e);
        sb.append("\nStrategy=");
        sb.append(this.f41994a);
    }

    /* renamed from: e */
    public final void m50407e() {
        m50401k(this.f41998e);
    }

    public long evictionCount() {
        return this.f42003j;
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool
    @NonNull
    public Bitmap get(int i, int i2, Bitmap.Config config) {
        Bitmap m50404h = m50404h(i, i2, config);
        if (m50404h != null) {
            m50404h.eraseColor(0);
            return m50404h;
        }
        return m50410b(i, i2, config);
    }

    public long getCurrentSize() {
        return this.f41999f;
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool
    @NonNull
    public Bitmap getDirty(int i, int i2, Bitmap.Config config) {
        Bitmap m50404h = m50404h(i, i2, config);
        if (m50404h == null) {
            return m50410b(i, i2, config);
        }
        return m50404h;
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool
    public long getMaxSize() {
        return this.f41998e;
    }

    /* renamed from: h */
    public final synchronized Bitmap m50404h(int i, int i2, Bitmap.Config config) {
        Bitmap.Config config2;
        Bitmap bitmap;
        try {
            m50411a(config);
            InterfaceC22504un0 interfaceC22504un0 = this.f41994a;
            if (config != null) {
                config2 = config;
            } else {
                config2 = f41993k;
            }
            bitmap = interfaceC22504un0.get(i, i2, config2);
            if (bitmap == null) {
                if (Log.isLoggable("LruBitmapPool", 3)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Missing bitmap=");
                    sb.append(this.f41994a.logBitmap(i, i2, config));
                }
                this.f42001h++;
            } else {
                this.f42000g++;
                this.f41999f -= this.f41994a.getSize(bitmap);
                this.f41997d.mo50399b(bitmap);
                m50402j(bitmap);
            }
            if (Log.isLoggable("LruBitmapPool", 2)) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Get bitmap=");
                sb2.append(this.f41994a.logBitmap(i, i2, config));
            }
            m50409c();
        } catch (Throwable th2) {
            throw th2;
        }
        return bitmap;
    }

    public long hitCount() {
        return this.f42000g;
    }

    /* renamed from: k */
    public final synchronized void m50401k(long j) {
        while (this.f41999f > j) {
            try {
                Bitmap removeLast = this.f41994a.removeLast();
                if (removeLast == null) {
                    if (Log.isLoggable("LruBitmapPool", 5)) {
                        Log.w("LruBitmapPool", "Size mismatch, resetting");
                        m50408d();
                    }
                    this.f41999f = 0L;
                    return;
                }
                this.f41997d.mo50399b(removeLast);
                this.f41999f -= this.f41994a.getSize(removeLast);
                this.f42003j++;
                if (Log.isLoggable("LruBitmapPool", 3)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Evicting bitmap=");
                    sb.append(this.f41994a.logBitmap(removeLast));
                }
                m50409c();
                removeLast.recycle();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public long missCount() {
        return this.f42001h;
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool
    public synchronized void put(Bitmap bitmap) {
        try {
            if (bitmap != null) {
                if (!bitmap.isRecycled()) {
                    if (bitmap.isMutable() && this.f41994a.getSize(bitmap) <= this.f41998e && this.f41995b.contains(bitmap.getConfig())) {
                        int size = this.f41994a.getSize(bitmap);
                        this.f41994a.put(bitmap);
                        this.f41997d.mo50400a(bitmap);
                        this.f42002i++;
                        this.f41999f += size;
                        if (Log.isLoggable("LruBitmapPool", 2)) {
                            StringBuilder sb = new StringBuilder();
                            sb.append("Put bitmap in pool=");
                            sb.append(this.f41994a.logBitmap(bitmap));
                        }
                        m50409c();
                        m50407e();
                        return;
                    }
                    if (Log.isLoggable("LruBitmapPool", 2)) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("Reject bitmap from pool, bitmap: ");
                        sb2.append(this.f41994a.logBitmap(bitmap));
                        sb2.append(", is mutable: ");
                        sb2.append(bitmap.isMutable());
                        sb2.append(", is allowed config: ");
                        sb2.append(this.f41995b.contains(bitmap.getConfig()));
                    }
                    bitmap.recycle();
                    return;
                }
                throw new IllegalStateException("Cannot pool recycled bitmap");
            }
            throw new NullPointerException("Bitmap must not be null");
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool
    public synchronized void setSizeMultiplier(float f) {
        this.f41998e = Math.round(((float) this.f41996c) * f);
        m50407e();
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool
    @SuppressLint({"InlinedApi"})
    public void trimMemory(int i) {
        if (Log.isLoggable("LruBitmapPool", 3)) {
            StringBuilder sb = new StringBuilder();
            sb.append("trimMemory, level=");
            sb.append(i);
        }
        if (i < 40 && (Build.VERSION.SDK_INT < 23 || i < 20)) {
            if (i >= 20 || i == 15) {
                m50401k(getMaxSize() / 2);
                return;
            }
            return;
        }
        clearMemory();
    }

    public LruBitmapPool(long j) {
        this(j, m50405g(), m50406f());
    }

    public LruBitmapPool(long j, Set<Bitmap.Config> set) {
        this(j, m50405g(), set);
    }
}
