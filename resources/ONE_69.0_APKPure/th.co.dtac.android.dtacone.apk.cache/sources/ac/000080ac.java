package com.bumptech.glide.load.engine.cache;

import android.content.Context;
import com.bumptech.glide.load.engine.cache.DiskCache;
import com.bumptech.glide.load.engine.cache.DiskLruCacheFactory;
import java.io.File;

/* loaded from: classes3.dex */
public final class ExternalPreferredCacheDiskCacheFactory extends DiskLruCacheFactory {

    /* renamed from: com.bumptech.glide.load.engine.cache.ExternalPreferredCacheDiskCacheFactory$a */
    /* loaded from: classes3.dex */
    public class C5793a implements DiskLruCacheFactory.CacheDirectoryGetter {

        /* renamed from: a */
        public final /* synthetic */ Context f42059a;

        /* renamed from: b */
        public final /* synthetic */ String f42060b;

        public C5793a(Context context, String str) {
            this.f42059a = context;
            this.f42060b = str;
        }

        /* renamed from: a */
        public final File m50358a() {
            File cacheDir = this.f42059a.getCacheDir();
            if (cacheDir == null) {
                return null;
            }
            if (this.f42060b != null) {
                return new File(cacheDir, this.f42060b);
            }
            return cacheDir;
        }

        @Override // com.bumptech.glide.load.engine.cache.DiskLruCacheFactory.CacheDirectoryGetter
        public File getCacheDirectory() {
            File m50358a = m50358a();
            if (m50358a != null && m50358a.exists()) {
                return m50358a;
            }
            File externalCacheDir = this.f42059a.getExternalCacheDir();
            if (externalCacheDir != null && externalCacheDir.canWrite()) {
                if (this.f42060b != null) {
                    return new File(externalCacheDir, this.f42060b);
                }
                return externalCacheDir;
            }
            return m50358a;
        }
    }

    public ExternalPreferredCacheDiskCacheFactory(Context context) {
        this(context, DiskCache.Factory.DEFAULT_DISK_CACHE_DIR, 262144000L);
    }

    public ExternalPreferredCacheDiskCacheFactory(Context context, long j) {
        this(context, DiskCache.Factory.DEFAULT_DISK_CACHE_DIR, j);
    }

    public ExternalPreferredCacheDiskCacheFactory(Context context, String str, long j) {
        super(new C5793a(context, str), j);
    }
}