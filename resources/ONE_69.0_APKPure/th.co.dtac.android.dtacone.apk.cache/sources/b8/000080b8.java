package com.bumptech.glide.load.engine.cache;

import androidx.core.util.Pools;
import com.bumptech.glide.load.Key;
import com.bumptech.glide.util.LruCache;
import com.bumptech.glide.util.Preconditions;
import com.bumptech.glide.util.Util;
import com.bumptech.glide.util.pool.FactoryPools;
import com.bumptech.glide.util.pool.StateVerifier;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* loaded from: classes3.dex */
public class SafeKeyGenerator {

    /* renamed from: a */
    public final LruCache f42079a = new LruCache(1000);

    /* renamed from: b */
    public final Pools.Pool f42080b = FactoryPools.threadSafe(10, new C5797a());

    /* renamed from: com.bumptech.glide.load.engine.cache.SafeKeyGenerator$a */
    /* loaded from: classes3.dex */
    public class C5797a implements FactoryPools.Factory {
        public C5797a() {
        }

        @Override // com.bumptech.glide.util.pool.FactoryPools.Factory
        /* renamed from: a */
        public C5798b create() {
            try {
                return new C5798b(MessageDigest.getInstance("SHA-256"));
            } catch (NoSuchAlgorithmException e) {
                throw new RuntimeException(e);
            }
        }
    }

    /* renamed from: com.bumptech.glide.load.engine.cache.SafeKeyGenerator$b */
    /* loaded from: classes3.dex */
    public static final class C5798b implements FactoryPools.Poolable {

        /* renamed from: a */
        public final MessageDigest f42082a;

        /* renamed from: b */
        public final StateVerifier f42083b = StateVerifier.newInstance();

        public C5798b(MessageDigest messageDigest) {
            this.f42082a = messageDigest;
        }

        @Override // com.bumptech.glide.util.pool.FactoryPools.Poolable
        public StateVerifier getVerifier() {
            return this.f42083b;
        }
    }

    /* renamed from: a */
    public final String m50352a(Key key) {
        C5798b c5798b = (C5798b) Preconditions.checkNotNull(this.f42080b.acquire());
        try {
            key.updateDiskCacheKey(c5798b.f42082a);
            return Util.sha256BytesToHex(c5798b.f42082a.digest());
        } finally {
            this.f42080b.release(c5798b);
        }
    }

    public String getSafeKey(Key key) {
        String str;
        synchronized (this.f42079a) {
            str = (String) this.f42079a.get(key);
        }
        if (str == null) {
            str = m50352a(key);
        }
        synchronized (this.f42079a) {
            this.f42079a.put(key, str);
        }
        return str;
    }
}