package com.bumptech.glide.load.engine.cache;

import android.content.Context;
import com.bumptech.glide.load.engine.cache.DiskCache;
import com.bumptech.glide.load.engine.cache.DiskLruCacheFactory;
import java.io.File;

@Deprecated
/* loaded from: classes3.dex */
public final class ExternalCacheDiskCacheFactory extends DiskLruCacheFactory {

    /* renamed from: com.bumptech.glide.load.engine.cache.ExternalCacheDiskCacheFactory$a */
    /* loaded from: classes3.dex */
    public class C5792a implements DiskLruCacheFactory.CacheDirectoryGetter {

        /* renamed from: a */
        public final /* synthetic */ Context f42057a;

        /* renamed from: b */
        public final /* synthetic */ String f42058b;

        public C5792a(Context context, String str) {
            this.f42057a = context;
            this.f42058b = str;
        }

        @Override // com.bumptech.glide.load.engine.cache.DiskLruCacheFactory.CacheDirectoryGetter
        public File getCacheDirectory() {
            File externalCacheDir = this.f42057a.getExternalCacheDir();
            if (externalCacheDir == null) {
                return null;
            }
            if (this.f42058b != null) {
                return new File(externalCacheDir, this.f42058b);
            }
            return externalCacheDir;
        }
    }

    public ExternalCacheDiskCacheFactory(Context context) {
        this(context, DiskCache.Factory.DEFAULT_DISK_CACHE_DIR, DiskCache.Factory.DEFAULT_DISK_CACHE_SIZE);
    }

    public ExternalCacheDiskCacheFactory(Context context, int i) {
        this(context, DiskCache.Factory.DEFAULT_DISK_CACHE_DIR, i);
    }

    public ExternalCacheDiskCacheFactory(Context context, String str, int i) {
        super(new C5792a(context, str), i);
    }
}