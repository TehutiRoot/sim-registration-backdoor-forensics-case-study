package com.bumptech.glide.load.engine.cache;

import com.bumptech.glide.load.engine.cache.DiskCache;
import java.io.File;

/* loaded from: classes3.dex */
public class DiskLruCacheFactory implements DiskCache.Factory {

    /* renamed from: a */
    public final long f42034a;

    /* renamed from: b */
    public final CacheDirectoryGetter f42035b;

    /* loaded from: classes3.dex */
    public interface CacheDirectoryGetter {
        File getCacheDirectory();
    }

    /* renamed from: com.bumptech.glide.load.engine.cache.DiskLruCacheFactory$a */
    /* loaded from: classes3.dex */
    public class C5801a implements CacheDirectoryGetter {

        /* renamed from: a */
        public final /* synthetic */ String f42036a;

        public C5801a(String str) {
            this.f42036a = str;
        }

        @Override // com.bumptech.glide.load.engine.cache.DiskLruCacheFactory.CacheDirectoryGetter
        public File getCacheDirectory() {
            return new File(this.f42036a);
        }
    }

    /* renamed from: com.bumptech.glide.load.engine.cache.DiskLruCacheFactory$b */
    /* loaded from: classes3.dex */
    public class C5802b implements CacheDirectoryGetter {

        /* renamed from: a */
        public final /* synthetic */ String f42037a;

        /* renamed from: b */
        public final /* synthetic */ String f42038b;

        public C5802b(String str, String str2) {
            this.f42037a = str;
            this.f42038b = str2;
        }

        @Override // com.bumptech.glide.load.engine.cache.DiskLruCacheFactory.CacheDirectoryGetter
        public File getCacheDirectory() {
            return new File(this.f42037a, this.f42038b);
        }
    }

    public DiskLruCacheFactory(String str, long j) {
        this(new C5801a(str), j);
    }

    @Override // com.bumptech.glide.load.engine.cache.DiskCache.Factory
    public DiskCache build() {
        File cacheDirectory = this.f42035b.getCacheDirectory();
        if (cacheDirectory == null) {
            return null;
        }
        if (!cacheDirectory.isDirectory() && !cacheDirectory.mkdirs()) {
            return null;
        }
        return DiskLruCacheWrapper.create(cacheDirectory, this.f42034a);
    }

    public DiskLruCacheFactory(String str, String str2, long j) {
        this(new C5802b(str, str2), j);
    }

    public DiskLruCacheFactory(CacheDirectoryGetter cacheDirectoryGetter, long j) {
        this.f42034a = j;
        this.f42035b = cacheDirectoryGetter;
    }
}
