package com.bumptech.glide.load.engine.cache;

import android.content.Context;
import com.bumptech.glide.load.engine.cache.DiskCache;
import com.bumptech.glide.load.engine.cache.DiskLruCacheFactory;
import java.io.File;

/* loaded from: classes3.dex */
public final class ExternalPreferredCacheDiskCacheFactory extends DiskLruCacheFactory {

    /* renamed from: com.bumptech.glide.load.engine.cache.ExternalPreferredCacheDiskCacheFactory$a */
    /* loaded from: classes3.dex */
    public class C5804a implements DiskLruCacheFactory.CacheDirectoryGetter {

        /* renamed from: a */
        public final /* synthetic */ Context f42047a;

        /* renamed from: b */
        public final /* synthetic */ String f42048b;

        public C5804a(Context context, String str) {
            this.f42047a = context;
            this.f42048b = str;
        }

        /* renamed from: a */
        public final File m50361a() {
            File cacheDir = this.f42047a.getCacheDir();
            if (cacheDir == null) {
                return null;
            }
            if (this.f42048b != null) {
                return new File(cacheDir, this.f42048b);
            }
            return cacheDir;
        }

        @Override // com.bumptech.glide.load.engine.cache.DiskLruCacheFactory.CacheDirectoryGetter
        public File getCacheDirectory() {
            File m50361a = m50361a();
            if (m50361a != null && m50361a.exists()) {
                return m50361a;
            }
            File externalCacheDir = this.f42047a.getExternalCacheDir();
            if (externalCacheDir != null && externalCacheDir.canWrite()) {
                if (this.f42048b != null) {
                    return new File(externalCacheDir, this.f42048b);
                }
                return externalCacheDir;
            }
            return m50361a;
        }
    }

    public ExternalPreferredCacheDiskCacheFactory(Context context) {
        this(context, DiskCache.Factory.DEFAULT_DISK_CACHE_DIR, 262144000L);
    }

    public ExternalPreferredCacheDiskCacheFactory(Context context, long j) {
        this(context, DiskCache.Factory.DEFAULT_DISK_CACHE_DIR, j);
    }

    public ExternalPreferredCacheDiskCacheFactory(Context context, String str, long j) {
        super(new C5804a(context, str), j);
    }
}
