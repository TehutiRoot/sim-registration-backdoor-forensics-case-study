package com.bumptech.glide.load;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import ch.qos.logback.core.CoreConstants;
import com.bumptech.glide.util.Preconditions;
import java.security.MessageDigest;

/* loaded from: classes3.dex */
public final class Option<T> {

    /* renamed from: e */
    public static final CacheKeyUpdater f41840e = new C5762a();

    /* renamed from: a */
    public final Object f41841a;

    /* renamed from: b */
    public final CacheKeyUpdater f41842b;

    /* renamed from: c */
    public final String f41843c;

    /* renamed from: d */
    public volatile byte[] f41844d;

    /* loaded from: classes3.dex */
    public interface CacheKeyUpdater<T> {
        void update(@NonNull byte[] bArr, @NonNull T t, @NonNull MessageDigest messageDigest);
    }

    /* renamed from: com.bumptech.glide.load.Option$a */
    /* loaded from: classes3.dex */
    public class C5762a implements CacheKeyUpdater {
        @Override // com.bumptech.glide.load.Option.CacheKeyUpdater
        public void update(byte[] bArr, Object obj, MessageDigest messageDigest) {
        }
    }

    public Option(String str, Object obj, CacheKeyUpdater cacheKeyUpdater) {
        this.f41843c = Preconditions.checkNotEmpty(str);
        this.f41841a = obj;
        this.f41842b = (CacheKeyUpdater) Preconditions.checkNotNull(cacheKeyUpdater);
    }

    /* renamed from: a */
    public static CacheKeyUpdater m50504a() {
        return f41840e;
    }

    @NonNull
    public static <T> Option<T> disk(@NonNull String str, @NonNull CacheKeyUpdater<T> cacheKeyUpdater) {
        return new Option<>(str, null, cacheKeyUpdater);
    }

    @NonNull
    public static <T> Option<T> memory(@NonNull String str) {
        return new Option<>(str, null, m50504a());
    }

    /* renamed from: b */
    public final byte[] m50503b() {
        if (this.f41844d == null) {
            this.f41844d = this.f41843c.getBytes(Key.CHARSET);
        }
        return this.f41844d;
    }

    public boolean equals(Object obj) {
        if (obj instanceof Option) {
            return this.f41843c.equals(((Option) obj).f41843c);
        }
        return false;
    }

    @Nullable
    public T getDefaultValue() {
        return (T) this.f41841a;
    }

    public int hashCode() {
        return this.f41843c.hashCode();
    }

    public String toString() {
        return "Option{key='" + this.f41843c + CoreConstants.SINGLE_QUOTE_CHAR + '}';
    }

    public void update(@NonNull T t, @NonNull MessageDigest messageDigest) {
        this.f41842b.update(m50503b(), t, messageDigest);
    }

    @NonNull
    public static <T> Option<T> disk(@NonNull String str, @Nullable T t, @NonNull CacheKeyUpdater<T> cacheKeyUpdater) {
        return new Option<>(str, t, cacheKeyUpdater);
    }

    @NonNull
    public static <T> Option<T> memory(@NonNull String str, @NonNull T t) {
        return new Option<>(str, t, m50504a());
    }
}
