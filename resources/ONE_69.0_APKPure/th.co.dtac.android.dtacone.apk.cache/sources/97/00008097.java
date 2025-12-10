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
    public static final Bitmap.Config f42005k = Bitmap.Config.ARGB_8888;

    /* renamed from: a */
    public final InterfaceC17323An0 f42006a;

    /* renamed from: b */
    public final Set f42007b;

    /* renamed from: c */
    public final long f42008c;

    /* renamed from: d */
    public final InterfaceC5784a f42009d;

    /* renamed from: e */
    public long f42010e;

    /* renamed from: f */
    public long f42011f;

    /* renamed from: g */
    public int f42012g;

    /* renamed from: h */
    public int f42013h;

    /* renamed from: i */
    public int f42014i;

    /* renamed from: j */
    public int f42015j;

    /* renamed from: com.bumptech.glide.load.engine.bitmap_recycle.LruBitmapPool$a */
    /* loaded from: classes3.dex */
    public interface InterfaceC5784a {
        /* renamed from: a */
        void mo50397a(Bitmap bitmap);

        /* renamed from: b */
        void mo50396b(Bitmap bitmap);
    }

    /* renamed from: com.bumptech.glide.load.engine.bitmap_recycle.LruBitmapPool$b */
    /* loaded from: classes3.dex */
    public static final class C5785b implements InterfaceC5784a {
        @Override // com.bumptech.glide.load.engine.bitmap_recycle.LruBitmapPool.InterfaceC5784a
        /* renamed from: a */
        public void mo50397a(Bitmap bitmap) {
        }

        @Override // com.bumptech.glide.load.engine.bitmap_recycle.LruBitmapPool.InterfaceC5784a
        /* renamed from: b */
        public void mo50396b(Bitmap bitmap) {
        }
    }

    public LruBitmapPool(long j, InterfaceC17323An0 interfaceC17323An0, Set set) {
        this.f42008c = j;
        this.f42010e = j;
        this.f42006a = interfaceC17323An0;
        this.f42007b = set;
        this.f42009d = new C5785b();
    }

    /* renamed from: a */
    public static void m50408a(Bitmap.Config config) {
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
    public static Bitmap m50407b(int i, int i2, Bitmap.Config config) {
        if (config == null) {
            config = f42005k;
        }
        return Bitmap.createBitmap(i, i2, config);
    }

    /* renamed from: f */
    public static Set m50403f() {
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
    public static InterfaceC17323An0 m50402g() {
        return new SizeConfigStrategy();
    }

    /* renamed from: i */
    public static void m50400i(Bitmap bitmap) {
        bitmap.setPremultiplied(true);
    }

    /* renamed from: j */
    public static void m50399j(Bitmap bitmap) {
        bitmap.setHasAlpha(true);
        m50400i(bitmap);
    }

    /* renamed from: c */
    public final void m50406c() {
        if (Log.isLoggable("LruBitmapPool", 2)) {
            m50405d();
        }
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool
    public void clearMemory() {
        Log.isLoggable("LruBitmapPool", 3);
        m50398k(0L);
    }

    /* renamed from: d */
    public final void m50405d() {
        StringBuilder sb = new StringBuilder();
        sb.append("Hits=");
        sb.append(this.f42012g);
        sb.append(", misses=");
        sb.append(this.f42013h);
        sb.append(", puts=");
        sb.append(this.f42014i);
        sb.append(", evictions=");
        sb.append(this.f42015j);
        sb.append(", currentSize=");
        sb.append(this.f42011f);
        sb.append(", maxSize=");
        sb.append(this.f42010e);
        sb.append("\nStrategy=");
        sb.append(this.f42006a);
    }

    /* renamed from: e */
    public final void m50404e() {
        m50398k(this.f42010e);
    }

    public long evictionCount() {
        return this.f42015j;
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool
    @NonNull
    public Bitmap get(int i, int i2, Bitmap.Config config) {
        Bitmap m50401h = m50401h(i, i2, config);
        if (m50401h != null) {
            m50401h.eraseColor(0);
            return m50401h;
        }
        return m50407b(i, i2, config);
    }

    public long getCurrentSize() {
        return this.f42011f;
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool
    @NonNull
    public Bitmap getDirty(int i, int i2, Bitmap.Config config) {
        Bitmap m50401h = m50401h(i, i2, config);
        if (m50401h == null) {
            return m50407b(i, i2, config);
        }
        return m50401h;
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool
    public long getMaxSize() {
        return this.f42010e;
    }

    /* renamed from: h */
    public final synchronized Bitmap m50401h(int i, int i2, Bitmap.Config config) {
        Bitmap.Config config2;
        Bitmap bitmap;
        try {
            m50408a(config);
            InterfaceC17323An0 interfaceC17323An0 = this.f42006a;
            if (config != null) {
                config2 = config;
            } else {
                config2 = f42005k;
            }
            bitmap = interfaceC17323An0.get(i, i2, config2);
            if (bitmap == null) {
                if (Log.isLoggable("LruBitmapPool", 3)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Missing bitmap=");
                    sb.append(this.f42006a.logBitmap(i, i2, config));
                }
                this.f42013h++;
            } else {
                this.f42012g++;
                this.f42011f -= this.f42006a.getSize(bitmap);
                this.f42009d.mo50396b(bitmap);
                m50399j(bitmap);
            }
            if (Log.isLoggable("LruBitmapPool", 2)) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Get bitmap=");
                sb2.append(this.f42006a.logBitmap(i, i2, config));
            }
            m50406c();
        } catch (Throwable th2) {
            throw th2;
        }
        return bitmap;
    }

    public long hitCount() {
        return this.f42012g;
    }

    /* renamed from: k */
    public final synchronized void m50398k(long j) {
        while (this.f42011f > j) {
            try {
                Bitmap removeLast = this.f42006a.removeLast();
                if (removeLast == null) {
                    if (Log.isLoggable("LruBitmapPool", 5)) {
                        Log.w("LruBitmapPool", "Size mismatch, resetting");
                        m50405d();
                    }
                    this.f42011f = 0L;
                    return;
                }
                this.f42009d.mo50396b(removeLast);
                this.f42011f -= this.f42006a.getSize(removeLast);
                this.f42015j++;
                if (Log.isLoggable("LruBitmapPool", 3)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Evicting bitmap=");
                    sb.append(this.f42006a.logBitmap(removeLast));
                }
                m50406c();
                removeLast.recycle();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public long missCount() {
        return this.f42013h;
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool
    public synchronized void put(Bitmap bitmap) {
        try {
            if (bitmap != null) {
                if (!bitmap.isRecycled()) {
                    if (bitmap.isMutable() && this.f42006a.getSize(bitmap) <= this.f42010e && this.f42007b.contains(bitmap.getConfig())) {
                        int size = this.f42006a.getSize(bitmap);
                        this.f42006a.put(bitmap);
                        this.f42009d.mo50397a(bitmap);
                        this.f42014i++;
                        this.f42011f += size;
                        if (Log.isLoggable("LruBitmapPool", 2)) {
                            StringBuilder sb = new StringBuilder();
                            sb.append("Put bitmap in pool=");
                            sb.append(this.f42006a.logBitmap(bitmap));
                        }
                        m50406c();
                        m50404e();
                        return;
                    }
                    if (Log.isLoggable("LruBitmapPool", 2)) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("Reject bitmap from pool, bitmap: ");
                        sb2.append(this.f42006a.logBitmap(bitmap));
                        sb2.append(", is mutable: ");
                        sb2.append(bitmap.isMutable());
                        sb2.append(", is allowed config: ");
                        sb2.append(this.f42007b.contains(bitmap.getConfig()));
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
        this.f42010e = Math.round(((float) this.f42008c) * f);
        m50404e();
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
                m50398k(getMaxSize() / 2);
                return;
            }
            return;
        }
        clearMemory();
    }

    public LruBitmapPool(long j) {
        this(j, m50402g(), m50403f());
    }

    public LruBitmapPool(long j, Set<Bitmap.Config> set) {
        this(j, m50402g(), set);
    }
}