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
    public final Executor f36641a;

    /* renamed from: b */
    public final Executor f36642b;

    /* renamed from: c */
    public final DiffUtil.ItemCallback f36643c;

    /* loaded from: classes2.dex */
    public static final class Builder<T> {

        /* renamed from: d */
        public static final Object f36644d = new Object();

        /* renamed from: e */
        public static Executor f36645e;

        /* renamed from: a */
        public Executor f36646a;

        /* renamed from: b */
        public Executor f36647b;

        /* renamed from: c */
        public final DiffUtil.ItemCallback f36648c;

        public Builder(@NonNull DiffUtil.ItemCallback<T> itemCallback) {
            this.f36648c = itemCallback;
        }

        @NonNull
        public AsyncDifferConfig<T> build() {
            if (this.f36647b == null) {
                synchronized (f36644d) {
                    try {
                        if (f36645e == null) {
                            f36645e = Executors.newFixedThreadPool(2);
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                this.f36647b = f36645e;
            }
            return new AsyncDifferConfig<>(this.f36646a, this.f36647b, this.f36648c);
        }

        @NonNull
        public Builder<T> setBackgroundThreadExecutor(@Nullable Executor executor) {
            this.f36647b = executor;
            return this;
        }

        @NonNull
        @RestrictTo({RestrictTo.Scope.LIBRARY})
        public Builder<T> setMainThreadExecutor(@Nullable Executor executor) {
            this.f36646a = executor;
            return this;
        }
    }

    public AsyncDifferConfig(Executor executor, Executor executor2, DiffUtil.ItemCallback itemCallback) {
        this.f36641a = executor;
        this.f36642b = executor2;
        this.f36643c = itemCallback;
    }

    @NonNull
    public Executor getBackgroundThreadExecutor() {
        return this.f36642b;
    }

    @NonNull
    public DiffUtil.ItemCallback<T> getDiffCallback() {
        return this.f36643c;
    }

    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public Executor getMainThreadExecutor() {
        return this.f36641a;
    }
}