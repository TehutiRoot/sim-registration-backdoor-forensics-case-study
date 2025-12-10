package androidx.core.p005os;

import androidx.annotation.DoNotInline;
import androidx.annotation.Nullable;

/* renamed from: androidx.core.os.CancellationSignal */
/* loaded from: classes2.dex */
public final class CancellationSignal {

    /* renamed from: a */
    public boolean f33944a;

    /* renamed from: b */
    public OnCancelListener f33945b;

    /* renamed from: c */
    public Object f33946c;

    /* renamed from: d */
    public boolean f33947d;

    /* renamed from: androidx.core.os.CancellationSignal$OnCancelListener */
    /* loaded from: classes2.dex */
    public interface OnCancelListener {
        void onCancel();
    }

    /* renamed from: androidx.core.os.CancellationSignal$a */
    /* loaded from: classes2.dex */
    public static class C4035a {
        @DoNotInline
        /* renamed from: a */
        public static void m57195a(Object obj) {
            ((android.os.CancellationSignal) obj).cancel();
        }

        @DoNotInline
        /* renamed from: b */
        public static android.os.CancellationSignal m57194b() {
            return new android.os.CancellationSignal();
        }
    }

    /* renamed from: a */
    public final void m57196a() {
        while (this.f33947d) {
            try {
                wait();
            } catch (InterruptedException unused) {
            }
        }
    }

    public void cancel() {
        synchronized (this) {
            try {
                if (this.f33944a) {
                    return;
                }
                this.f33944a = true;
                this.f33947d = true;
                OnCancelListener onCancelListener = this.f33945b;
                Object obj = this.f33946c;
                if (onCancelListener != null) {
                    try {
                        onCancelListener.onCancel();
                    } catch (Throwable th2) {
                        synchronized (this) {
                            this.f33947d = false;
                            notifyAll();
                            throw th2;
                        }
                    }
                }
                if (obj != null) {
                    C4035a.m57195a(obj);
                }
                synchronized (this) {
                    this.f33947d = false;
                    notifyAll();
                }
            } finally {
            }
        }
    }

    @Nullable
    public Object getCancellationSignalObject() {
        Object obj;
        synchronized (this) {
            try {
                if (this.f33946c == null) {
                    android.os.CancellationSignal m57194b = C4035a.m57194b();
                    this.f33946c = m57194b;
                    if (this.f33944a) {
                        C4035a.m57195a(m57194b);
                    }
                }
                obj = this.f33946c;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return obj;
    }

    public boolean isCanceled() {
        boolean z;
        synchronized (this) {
            z = this.f33944a;
        }
        return z;
    }

    public void setOnCancelListener(@Nullable OnCancelListener onCancelListener) {
        synchronized (this) {
            try {
                m57196a();
                if (this.f33945b == onCancelListener) {
                    return;
                }
                this.f33945b = onCancelListener;
                if (this.f33944a && onCancelListener != null) {
                    onCancelListener.onCancel();
                }
            } finally {
            }
        }
    }

    public void throwIfCanceled() {
        if (!isCanceled()) {
            return;
        }
        throw new OperationCanceledException();
    }
}
