package p000;

import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.util.Log;
import com.bumptech.glide.load.Key;
import com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool;
import com.bumptech.glide.load.engine.cache.MemoryCache;
import com.bumptech.glide.load.engine.prefill.PreFillType;
import com.bumptech.glide.load.resource.bitmap.BitmapResource;
import com.bumptech.glide.util.Util;
import java.security.MessageDigest;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/* renamed from: tb */
/* loaded from: classes3.dex */
public final class RunnableC14010tb implements Runnable {

    /* renamed from: i */
    public static final C14011a f80145i = new C14011a();

    /* renamed from: j */
    public static final long f80146j = TimeUnit.SECONDS.toMillis(1);

    /* renamed from: a */
    public final BitmapPool f80147a;

    /* renamed from: b */
    public final MemoryCache f80148b;

    /* renamed from: c */
    public final C17551El1 f80149c;

    /* renamed from: d */
    public final C14011a f80150d;

    /* renamed from: e */
    public final Set f80151e;

    /* renamed from: f */
    public final Handler f80152f;

    /* renamed from: g */
    public long f80153g;

    /* renamed from: h */
    public boolean f80154h;

    /* renamed from: tb$a */
    /* loaded from: classes3.dex */
    public static class C14011a {
        /* renamed from: a */
        public long m22389a() {
            return SystemClock.currentThreadTimeMillis();
        }
    }

    /* renamed from: tb$b */
    /* loaded from: classes3.dex */
    public static final class C14012b implements Key {
        @Override // com.bumptech.glide.load.Key
        public void updateDiskCacheKey(MessageDigest messageDigest) {
            throw new UnsupportedOperationException();
        }
    }

    public RunnableC14010tb(BitmapPool bitmapPool, MemoryCache memoryCache, C17551El1 c17551El1) {
        this(bitmapPool, memoryCache, c17551El1, f80145i, new Handler(Looper.getMainLooper()));
    }

    /* renamed from: a */
    public boolean m22394a() {
        Bitmap createBitmap;
        long m22389a = this.f80150d.m22389a();
        while (!this.f80149c.m68467a() && !m22390f(m22389a)) {
            PreFillType m68466b = this.f80149c.m68466b();
            if (!this.f80151e.contains(m68466b)) {
                this.f80151e.add(m68466b);
                createBitmap = this.f80147a.getDirty(m68466b.m50313d(), m68466b.m50315b(), m68466b.m50316a());
            } else {
                createBitmap = Bitmap.createBitmap(m68466b.m50313d(), m68466b.m50315b(), m68466b.m50316a());
            }
            int bitmapByteSize = Util.getBitmapByteSize(createBitmap);
            if (m22392c() >= bitmapByteSize) {
                this.f80148b.put(new C14012b(), BitmapResource.obtain(createBitmap, this.f80147a));
            } else {
                this.f80147a.put(createBitmap);
            }
            if (Log.isLoggable("PreFillRunner", 3)) {
                StringBuilder sb = new StringBuilder();
                sb.append("allocated [");
                sb.append(m68466b.m50313d());
                sb.append("x");
                sb.append(m68466b.m50315b());
                sb.append("] ");
                sb.append(m68466b.m50316a());
                sb.append(" size: ");
                sb.append(bitmapByteSize);
            }
        }
        if (!this.f80154h && !this.f80149c.m68467a()) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public void m22393b() {
        this.f80154h = true;
    }

    /* renamed from: c */
    public final long m22392c() {
        return this.f80148b.getMaxSize() - this.f80148b.getCurrentSize();
    }

    /* renamed from: d */
    public final long m22391d() {
        long j = this.f80153g;
        this.f80153g = Math.min(4 * j, f80146j);
        return j;
    }

    /* renamed from: f */
    public final boolean m22390f(long j) {
        if (this.f80150d.m22389a() - j >= 32) {
            return true;
        }
        return false;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (m22394a()) {
            this.f80152f.postDelayed(this, m22391d());
        }
    }

    public RunnableC14010tb(BitmapPool bitmapPool, MemoryCache memoryCache, C17551El1 c17551El1, C14011a c14011a, Handler handler) {
        this.f80151e = new HashSet();
        this.f80153g = 40L;
        this.f80147a = bitmapPool;
        this.f80148b = memoryCache;
        this.f80149c = c17551El1;
        this.f80150d = c14011a;
        this.f80152f = handler;
    }
}
