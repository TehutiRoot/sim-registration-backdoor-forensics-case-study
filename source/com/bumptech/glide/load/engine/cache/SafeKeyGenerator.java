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
    public final LruCache f42067a = new LruCache(1000);

    /* renamed from: b */
    public final Pools.Pool f42068b = FactoryPools.threadSafe(10, new C5808a());

    /* renamed from: com.bumptech.glide.load.engine.cache.SafeKeyGenerator$a */
    /* loaded from: classes3.dex */
    public class C5808a implements FactoryPools.Factory {
        public C5808a() {
        }

        @Override // com.bumptech.glide.util.pool.FactoryPools.Factory
        /* renamed from: a */
        public C5809b create() {
            try {
                return new C5809b(MessageDigest.getInstance("SHA-256"));
            } catch (NoSuchAlgorithmException e) {
                throw new RuntimeException(e);
            }
        }
    }

    /* renamed from: com.bumptech.glide.load.engine.cache.SafeKeyGenerator$b */
    /* loaded from: classes3.dex */
    public static final class C5809b implements FactoryPools.Poolable {

        /* renamed from: a */
        public final MessageDigest f42070a;

        /* renamed from: b */
        public final StateVerifier f42071b = StateVerifier.newInstance();

        public C5809b(MessageDigest messageDigest) {
            this.f42070a = messageDigest;
        }

        @Override // com.bumptech.glide.util.pool.FactoryPools.Poolable
        public StateVerifier getVerifier() {
            return this.f42071b;
        }
    }

    /* renamed from: a */
    public final String m50355a(Key key) {
        C5809b c5809b = (C5809b) Preconditions.checkNotNull(this.f42068b.acquire());
        try {
            key.updateDiskCacheKey(c5809b.f42070a);
            return Util.sha256BytesToHex(c5809b.f42070a.digest());
        } finally {
            this.f42068b.release(c5809b);
        }
    }

    public String getSafeKey(Key key) {
        String str;
        synchronized (this.f42067a) {
            str = (String) this.f42067a.get(key);
        }
        if (str == null) {
            str = m50355a(key);
        }
        synchronized (this.f42067a) {
            this.f42067a.put(key, str);
        }
        return str;
    }
}
