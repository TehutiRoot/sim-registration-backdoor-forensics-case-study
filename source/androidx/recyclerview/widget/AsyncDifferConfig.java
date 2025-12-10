package androidx.recyclerview.widget;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.recyclerview.widget.DiffUtil;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/* loaded from: classes2.dex */
public final class AsyncDifferConfig<T> {

    /* renamed from: a */
    public final Executor f36553a;

    /* renamed from: b */
    public final Executor f36554b;

    /* renamed from: c */
    public final DiffUtil.ItemCallback f36555c;

    /* loaded from: classes2.dex */
    public static final class Builder<T> {

        /* renamed from: d */
        public static final Object f36556d = new Object();

        /* renamed from: e */
        public static Executor f36557e;

        /* renamed from: a */
        public Executor f36558a;

        /* renamed from: b */
        public Executor f36559b;

        /* renamed from: c */
        public final DiffUtil.ItemCallback f36560c;

        public Builder(@NonNull DiffUtil.ItemCallback<T> itemCallback) {
            this.f36560c = itemCallback;
        }

        @NonNull
        public AsyncDifferConfig<T> build() {
            if (this.f36559b == null) {
                synchronized (f36556d) {
                    try {
                        if (f36557e == null) {
                            f36557e = Executors.newFixedThreadPool(2);
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                this.f36559b = f36557e;
            }
            return new AsyncDifferConfig<>(this.f36558a, this.f36559b, this.f36560c);
        }

        @NonNull
        public Builder<T> setBackgroundThreadExecutor(@Nullable Executor executor) {
            this.f36559b = executor;
            return this;
        }

        @NonNull
        @RestrictTo({RestrictTo.Scope.LIBRARY})
        public Builder<T> setMainThreadExecutor(@Nullable Executor executor) {
            this.f36558a = executor;
            return this;
        }
    }

    public AsyncDifferConfig(Executor executor, Executor executor2, DiffUtil.ItemCallback itemCallback) {
        this.f36553a = executor;
        this.f36554b = executor2;
        this.f36555c = itemCallback;
    }

    @NonNull
    public Executor getBackgroundThreadExecutor() {
        return this.f36554b;
    }

    @NonNull
    public DiffUtil.ItemCallback<T> getDiffCallback() {
        return this.f36555c;
    }

    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public Executor getMainThreadExecutor() {
        return this.f36553a;
    }
}
