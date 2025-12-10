package com.bumptech.glide.load;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import ch.qos.logback.core.CoreConstants;
import com.bumptech.glide.util.Preconditions;
import java.security.MessageDigest;

/* loaded from: classes3.dex */
public final class Option<T> {

    /* renamed from: e */
    public static final CacheKeyUpdater f41852e = new C5751a();

    /* renamed from: a */
    public final Object f41853a;

    /* renamed from: b */
    public final CacheKeyUpdater f41854b;

    /* renamed from: c */
    public final String f41855c;

    /* renamed from: d */
    public volatile byte[] f41856d;

    /* loaded from: classes3.dex */
    public interface CacheKeyUpdater<T> {
        void update(@NonNull byte[] bArr, @NonNull T t, @NonNull MessageDigest messageDigest);
    }

    /* renamed from: com.bumptech.glide.load.Option$a */
    /* loaded from: classes3.dex */
    public class C5751a implements CacheKeyUpdater {
        @Override // com.bumptech.glide.load.Option.CacheKeyUpdater
        public void update(byte[] bArr, Object obj, MessageDigest messageDigest) {
        }
    }

    public Option(String str, Object obj, CacheKeyUpdater cacheKeyUpdater) {
        this.f41855c = Preconditions.checkNotEmpty(str);
        this.f41853a = obj;
        this.f41854b = (CacheKeyUpdater) Preconditions.checkNotNull(cacheKeyUpdater);
    }

    /* renamed from: a */
    public static CacheKeyUpdater m50501a() {
        return f41852e;
    }

    @NonNull
    public static <T> Option<T> disk(@NonNull String str, @NonNull CacheKeyUpdater<T> cacheKeyUpdater) {
        return new Option<>(str, null, cacheKeyUpdater);
    }

    @NonNull
    public static <T> Option<T> memory(@NonNull String str) {
        return new Option<>(str, null, m50501a());
    }

    /* renamed from: b */
    public final byte[] m50500b() {
        if (this.f41856d == null) {
            this.f41856d = this.f41855c.getBytes(Key.CHARSET);
        }
        return this.f41856d;
    }

    public boolean equals(Object obj) {
        if (obj instanceof Option) {
            return this.f41855c.equals(((Option) obj).f41855c);
        }
        return false;
    }

    @Nullable
    public T getDefaultValue() {
        return (T) this.f41853a;
    }

    public int hashCode() {
        return this.f41855c.hashCode();
    }

    public String toString() {
        return "Option{key='" + this.f41855c + CoreConstants.SINGLE_QUOTE_CHAR + '}';
    }

    public void update(@NonNull T t, @NonNull MessageDigest messageDigest) {
        this.f41854b.update(m50500b(), t, messageDigest);
    }

    @NonNull
    public static <T> Option<T> disk(@NonNull String str, @Nullable T t, @NonNull CacheKeyUpdater<T> cacheKeyUpdater) {
        return new Option<>(str, t, cacheKeyUpdater);
    }

    @NonNull
    public static <T> Option<T> memory(@NonNull String str, @NonNull T t) {
        return new Option<>(str, t, m50501a());
    }
}