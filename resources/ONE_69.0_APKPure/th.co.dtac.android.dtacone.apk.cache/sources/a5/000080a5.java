package com.bumptech.glide.load.engine.cache;

import com.bumptech.glide.load.engine.cache.DiskCache;
import java.io.File;

/* loaded from: classes3.dex */
public class DiskLruCacheFactory implements DiskCache.Factory {

    /* renamed from: a */
    public final long f42046a;

    /* renamed from: b */
    public final CacheDirectoryGetter f42047b;

    /* loaded from: classes3.dex */
    public interface CacheDirectoryGetter {
        File getCacheDirectory();
    }

    /* renamed from: com.bumptech.glide.load.engine.cache.DiskLruCacheFactory$a */
    /* loaded from: classes3.dex */
    public class C5790a implements CacheDirectoryGetter {

        /* renamed from: a */
        public final /* synthetic */ String f42048a;

        public C5790a(String str) {
            this.f42048a = str;
        }

        @Override // com.bumptech.glide.load.engine.cache.DiskLruCacheFactory.CacheDirectoryGetter
        public File getCacheDirectory() {
            return new File(this.f42048a);
        }
    }

    /* renamed from: com.bumptech.glide.load.engine.cache.DiskLruCacheFactory$b */
    /* loaded from: classes3.dex */
    public class C5791b implements CacheDirectoryGetter {

        /* renamed from: a */
        public final /* synthetic */ String f42049a;

        /* renamed from: b */
        public final /* synthetic */ String f42050b;

        public C5791b(String str, String str2) {
            this.f42049a = str;
            this.f42050b = str2;
        }

        @Override // com.bumptech.glide.load.engine.cache.DiskLruCacheFactory.CacheDirectoryGetter
        public File getCacheDirectory() {
            return new File(this.f42049a, this.f42050b);
        }
    }

    public DiskLruCacheFactory(String str, long j) {
        this(new C5790a(str), j);
    }

    @Override // com.bumptech.glide.load.engine.cache.DiskCache.Factory
    public DiskCache build() {
        File cacheDirectory = this.f42047b.getCacheDirectory();
        if (cacheDirectory == null) {
            return null;
        }
        if (!cacheDirectory.isDirectory() && !cacheDirectory.mkdirs()) {
            return null;
        }
        return DiskLruCacheWrapper.create(cacheDirectory, this.f42046a);
    }

    public DiskLruCacheFactory(String str, String str2, long j) {
        this(new C5791b(str, str2), j);
    }

    public DiskLruCacheFactory(CacheDirectoryGetter cacheDirectoryGetter, long j) {
        this.f42046a = j;
        this.f42047b = cacheDirectoryGetter;
    }
}