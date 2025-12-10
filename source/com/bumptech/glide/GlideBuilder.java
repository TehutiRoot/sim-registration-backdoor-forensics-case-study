package com.bumptech.glide;

import android.content.Context;
import android.os.Build;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.collection.ArrayMap;
import com.bumptech.glide.Glide;
import com.bumptech.glide.GlideExperiments;
import com.bumptech.glide.load.engine.Engine;
import com.bumptech.glide.load.engine.bitmap_recycle.ArrayPool;
import com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool;
import com.bumptech.glide.load.engine.bitmap_recycle.BitmapPoolAdapter;
import com.bumptech.glide.load.engine.bitmap_recycle.LruArrayPool;
import com.bumptech.glide.load.engine.bitmap_recycle.LruBitmapPool;
import com.bumptech.glide.load.engine.cache.DiskCache;
import com.bumptech.glide.load.engine.cache.InternalCacheDiskCacheFactory;
import com.bumptech.glide.load.engine.cache.LruResourceCache;
import com.bumptech.glide.load.engine.cache.MemoryCache;
import com.bumptech.glide.load.engine.cache.MemorySizeCalculator;
import com.bumptech.glide.load.engine.executor.GlideExecutor;
import com.bumptech.glide.manager.ConnectivityMonitorFactory;
import com.bumptech.glide.manager.DefaultConnectivityMonitorFactory;
import com.bumptech.glide.manager.RequestManagerRetriever;
import com.bumptech.glide.module.AppGlideModule;
import com.bumptech.glide.request.RequestListener;
import com.bumptech.glide.request.RequestOptions;
import com.bumptech.glide.util.Preconditions;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public final class GlideBuilder {

    /* renamed from: c */
    public Engine f41665c;

    /* renamed from: d */
    public BitmapPool f41666d;

    /* renamed from: e */
    public ArrayPool f41667e;

    /* renamed from: f */
    public MemoryCache f41668f;

    /* renamed from: g */
    public GlideExecutor f41669g;

    /* renamed from: h */
    public GlideExecutor f41670h;

    /* renamed from: i */
    public DiskCache.Factory f41671i;

    /* renamed from: j */
    public MemorySizeCalculator f41672j;

    /* renamed from: k */
    public ConnectivityMonitorFactory f41673k;

    /* renamed from: n */
    public RequestManagerRetriever.RequestManagerFactory f41676n;

    /* renamed from: o */
    public GlideExecutor f41677o;

    /* renamed from: p */
    public boolean f41678p;

    /* renamed from: q */
    public List f41679q;

    /* renamed from: a */
    public final Map f41663a = new ArrayMap();

    /* renamed from: b */
    public final GlideExperiments.C5731a f41664b = new GlideExperiments.C5731a();

    /* renamed from: l */
    public int f41674l = 4;

    /* renamed from: m */
    public Glide.RequestOptionsFactory f41675m = new C5728a();

    /* loaded from: classes3.dex */
    public static final class LogRequestOrigins implements GlideExperiments.InterfaceC5732b {
    }

    /* renamed from: com.bumptech.glide.GlideBuilder$a */
    /* loaded from: classes3.dex */
    public class C5728a implements Glide.RequestOptionsFactory {
        public C5728a() {
            GlideBuilder.this = r1;
        }

        @Override // com.bumptech.glide.Glide.RequestOptionsFactory
        public RequestOptions build() {
            return new RequestOptions();
        }
    }

    /* renamed from: com.bumptech.glide.GlideBuilder$b */
    /* loaded from: classes3.dex */
    public class C5729b implements Glide.RequestOptionsFactory {

        /* renamed from: a */
        public final /* synthetic */ RequestOptions f41681a;

        public C5729b(RequestOptions requestOptions) {
            GlideBuilder.this = r1;
            this.f41681a = requestOptions;
        }

        @Override // com.bumptech.glide.Glide.RequestOptionsFactory
        public RequestOptions build() {
            RequestOptions requestOptions = this.f41681a;
            if (requestOptions == null) {
                return new RequestOptions();
            }
            return requestOptions;
        }
    }

    /* renamed from: com.bumptech.glide.GlideBuilder$c */
    /* loaded from: classes3.dex */
    public static final class C5730c implements GlideExperiments.InterfaceC5732b {
    }

    /* renamed from: a */
    public Glide m50616a(Context context, List list, AppGlideModule appGlideModule) {
        if (this.f41669g == null) {
            this.f41669g = GlideExecutor.newSourceExecutor();
        }
        if (this.f41670h == null) {
            this.f41670h = GlideExecutor.newDiskCacheExecutor();
        }
        if (this.f41677o == null) {
            this.f41677o = GlideExecutor.newAnimationExecutor();
        }
        if (this.f41672j == null) {
            this.f41672j = new MemorySizeCalculator.Builder(context).build();
        }
        if (this.f41673k == null) {
            this.f41673k = new DefaultConnectivityMonitorFactory();
        }
        if (this.f41666d == null) {
            int bitmapPoolSize = this.f41672j.getBitmapPoolSize();
            if (bitmapPoolSize > 0) {
                this.f41666d = new LruBitmapPool(bitmapPoolSize);
            } else {
                this.f41666d = new BitmapPoolAdapter();
            }
        }
        if (this.f41667e == null) {
            this.f41667e = new LruArrayPool(this.f41672j.getArrayPoolSizeInBytes());
        }
        if (this.f41668f == null) {
            this.f41668f = new LruResourceCache(this.f41672j.getMemoryCacheSize());
        }
        if (this.f41671i == null) {
            this.f41671i = new InternalCacheDiskCacheFactory(context);
        }
        if (this.f41665c == null) {
            this.f41665c = new Engine(this.f41668f, this.f41671i, this.f41670h, this.f41669g, GlideExecutor.newUnlimitedSourceExecutor(), this.f41677o, this.f41678p);
        }
        List list2 = this.f41679q;
        if (list2 == null) {
            this.f41679q = Collections.emptyList();
        } else {
            this.f41679q = Collections.unmodifiableList(list2);
        }
        GlideExperiments m50612c = this.f41664b.m50612c();
        return new Glide(context, this.f41665c, this.f41668f, this.f41666d, this.f41667e, new RequestManagerRetriever(this.f41676n), this.f41673k, this.f41674l, this.f41675m, this.f41663a, this.f41679q, list, appGlideModule, m50612c);
    }

    @NonNull
    public GlideBuilder addGlobalRequestListener(@NonNull RequestListener<Object> requestListener) {
        if (this.f41679q == null) {
            this.f41679q = new ArrayList();
        }
        this.f41679q.add(requestListener);
        return this;
    }

    /* renamed from: b */
    public void m50615b(RequestManagerRetriever.RequestManagerFactory requestManagerFactory) {
        this.f41676n = requestManagerFactory;
    }

    @NonNull
    public GlideBuilder setAnimationExecutor(@Nullable GlideExecutor glideExecutor) {
        this.f41677o = glideExecutor;
        return this;
    }

    @NonNull
    public GlideBuilder setArrayPool(@Nullable ArrayPool arrayPool) {
        this.f41667e = arrayPool;
        return this;
    }

    @NonNull
    public GlideBuilder setBitmapPool(@Nullable BitmapPool bitmapPool) {
        this.f41666d = bitmapPool;
        return this;
    }

    @NonNull
    public GlideBuilder setConnectivityMonitorFactory(@Nullable ConnectivityMonitorFactory connectivityMonitorFactory) {
        this.f41673k = connectivityMonitorFactory;
        return this;
    }

    @NonNull
    public GlideBuilder setDefaultRequestOptions(@Nullable RequestOptions requestOptions) {
        return setDefaultRequestOptions(new C5729b(requestOptions));
    }

    @NonNull
    public <T> GlideBuilder setDefaultTransitionOptions(@NonNull Class<T> cls, @Nullable TransitionOptions<?, T> transitionOptions) {
        this.f41663a.put(cls, transitionOptions);
        return this;
    }

    @Deprecated
    public GlideBuilder setDisableHardwareBitmapsOnO(boolean z) {
        return this;
    }

    @NonNull
    public GlideBuilder setDiskCache(@Nullable DiskCache.Factory factory) {
        this.f41671i = factory;
        return this;
    }

    @NonNull
    public GlideBuilder setDiskCacheExecutor(@Nullable GlideExecutor glideExecutor) {
        this.f41670h = glideExecutor;
        return this;
    }

    public GlideBuilder setImageDecoderEnabledForBitmaps(boolean z) {
        boolean z2;
        GlideExperiments.C5731a c5731a = this.f41664b;
        C5730c c5730c = new C5730c();
        if (z && Build.VERSION.SDK_INT >= 29) {
            z2 = true;
        } else {
            z2 = false;
        }
        c5731a.m50611d(c5730c, z2);
        return this;
    }

    @NonNull
    public GlideBuilder setIsActiveResourceRetentionAllowed(boolean z) {
        this.f41678p = z;
        return this;
    }

    @NonNull
    public GlideBuilder setLogLevel(int i) {
        if (i >= 2 && i <= 6) {
            this.f41674l = i;
            return this;
        }
        throw new IllegalArgumentException("Log level must be one of Log.VERBOSE, Log.DEBUG, Log.INFO, Log.WARN, or Log.ERROR");
    }

    public GlideBuilder setLogRequestOrigins(boolean z) {
        this.f41664b.m50611d(new LogRequestOrigins(), z);
        return this;
    }

    @NonNull
    public GlideBuilder setMemoryCache(@Nullable MemoryCache memoryCache) {
        this.f41668f = memoryCache;
        return this;
    }

    @NonNull
    public GlideBuilder setMemorySizeCalculator(@NonNull MemorySizeCalculator.Builder builder) {
        return setMemorySizeCalculator(builder.build());
    }

    @Deprecated
    public GlideBuilder setResizeExecutor(@Nullable GlideExecutor glideExecutor) {
        return setSourceExecutor(glideExecutor);
    }

    @NonNull
    public GlideBuilder setSourceExecutor(@Nullable GlideExecutor glideExecutor) {
        this.f41669g = glideExecutor;
        return this;
    }

    @NonNull
    public GlideBuilder setDefaultRequestOptions(@NonNull Glide.RequestOptionsFactory requestOptionsFactory) {
        this.f41675m = (Glide.RequestOptionsFactory) Preconditions.checkNotNull(requestOptionsFactory);
        return this;
    }

    @NonNull
    public GlideBuilder setMemorySizeCalculator(@Nullable MemorySizeCalculator memorySizeCalculator) {
        this.f41672j = memorySizeCalculator;
        return this;
    }
}
