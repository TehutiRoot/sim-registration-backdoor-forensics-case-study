package com.google.android.gms.common.api.internal;

import android.os.Looper;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.concurrent.HandlerExecutor;
import java.util.concurrent.Executor;

@KeepForSdk
/* loaded from: classes3.dex */
public final class ListenerHolder<L> {

    /* renamed from: a */
    public final Executor f44775a;

    /* renamed from: b */
    public volatile Object f44776b;

    /* renamed from: c */
    public volatile ListenerKey f44777c;

    @KeepForSdk
    /* loaded from: classes3.dex */
    public static final class ListenerKey<L> {

        /* renamed from: a */
        public final Object f44778a;

        /* renamed from: b */
        public final String f44779b;

        public ListenerKey(Object obj, String str) {
            this.f44778a = obj;
            this.f44779b = str;
        }

        @KeepForSdk
        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ListenerKey)) {
                return false;
            }
            ListenerKey listenerKey = (ListenerKey) obj;
            if (this.f44778a == listenerKey.f44778a && this.f44779b.equals(listenerKey.f44779b)) {
                return true;
            }
            return false;
        }

        @KeepForSdk
        public int hashCode() {
            return (System.identityHashCode(this.f44778a) * 31) + this.f44779b.hashCode();
        }

        @NonNull
        @KeepForSdk
        public String toIdString() {
            int identityHashCode = System.identityHashCode(this.f44778a);
            return this.f44779b + "@" + identityHashCode;
        }
    }

    @KeepForSdk
    /* loaded from: classes3.dex */
    public interface Notifier<L> {
        @KeepForSdk
        void notifyListener(@NonNull L l);

        @KeepForSdk
        void onNotifyListenerFailed();
    }

    public ListenerHolder(Looper looper, Object obj, String str) {
        this.f44775a = new HandlerExecutor(looper);
        this.f44776b = Preconditions.checkNotNull(obj, "Listener must not be null");
        this.f44777c = new ListenerKey(obj, Preconditions.checkNotEmpty(str));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public final void m48582a(Notifier notifier) {
        Object obj = this.f44776b;
        if (obj == null) {
            notifier.onNotifyListenerFailed();
            return;
        }
        try {
            notifier.notifyListener(obj);
        } catch (RuntimeException e) {
            notifier.onNotifyListenerFailed();
            throw e;
        }
    }

    @KeepForSdk
    public void clear() {
        this.f44776b = null;
        this.f44777c = null;
    }

    @Nullable
    @KeepForSdk
    public ListenerKey<L> getListenerKey() {
        return this.f44777c;
    }

    @KeepForSdk
    public boolean hasListener() {
        return this.f44776b != null;
    }

    @KeepForSdk
    public void notifyListener(@NonNull final Notifier<? super L> notifier) {
        Preconditions.checkNotNull(notifier, "Notifier must not be null");
        this.f44775a.execute(new Runnable() { // from class: com.google.android.gms.common.api.internal.zacb
            @Override // java.lang.Runnable
            public final void run() {
                ListenerHolder.this.m48582a(notifier);
            }
        });
    }

    public ListenerHolder(Executor executor, Object obj, String str) {
        this.f44775a = (Executor) Preconditions.checkNotNull(executor, "Executor must not be null");
        this.f44776b = Preconditions.checkNotNull(obj, "Listener must not be null");
        this.f44777c = new ListenerKey(obj, Preconditions.checkNotEmpty(str));
    }
}
