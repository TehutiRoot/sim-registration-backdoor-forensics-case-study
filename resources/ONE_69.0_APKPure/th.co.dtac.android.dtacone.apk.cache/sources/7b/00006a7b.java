package androidx.core.p005os;

import androidx.annotation.DoNotInline;
import androidx.annotation.Nullable;

/* renamed from: androidx.core.os.CancellationSignal */
/* loaded from: classes2.dex */
public final class CancellationSignal {

    /* renamed from: a */
    public boolean f34032a;

    /* renamed from: b */
    public OnCancelListener f34033b;

    /* renamed from: c */
    public Object f34034c;

    /* renamed from: d */
    public boolean f34035d;

    /* renamed from: androidx.core.os.CancellationSignal$OnCancelListener */
    /* loaded from: classes2.dex */
    public interface OnCancelListener {
        void onCancel();
    }

    /* renamed from: androidx.core.os.CancellationSignal$a */
    /* loaded from: classes2.dex */
    public static class C4017a {
        @DoNotInline
        /* renamed from: a */
        public static void m57145a(Object obj) {
            ((android.os.CancellationSignal) obj).cancel();
        }

        @DoNotInline
        /* renamed from: b */
        public static android.os.CancellationSignal m57144b() {
            return new android.os.CancellationSignal();
        }
    }

    /* renamed from: a */
    public final void m57146a() {
        while (this.f34035d) {
            try {
                wait();
            } catch (InterruptedException unused) {
            }
        }
    }

    public void cancel() {
        synchronized (this) {
            try {
                if (this.f34032a) {
                    return;
                }
                this.f34032a = true;
                this.f34035d = true;
                OnCancelListener onCancelListener = this.f34033b;
                Object obj = this.f34034c;
                if (onCancelListener != null) {
                    try {
                        onCancelListener.onCancel();
                    } catch (Throwable th2) {
                        synchronized (this) {
                            this.f34035d = false;
                            notifyAll();
                            throw th2;
                        }
                    }
                }
                if (obj != null) {
                    C4017a.m57145a(obj);
                }
                synchronized (this) {
                    this.f34035d = false;
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
                if (this.f34034c == null) {
                    android.os.CancellationSignal m57144b = C4017a.m57144b();
                    this.f34034c = m57144b;
                    if (this.f34032a) {
                        C4017a.m57145a(m57144b);
                    }
                }
                obj = this.f34034c;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return obj;
    }

    public boolean isCanceled() {
        boolean z;
        synchronized (this) {
            z = this.f34032a;
        }
        return z;
    }

    public void setOnCancelListener(@Nullable OnCancelListener onCancelListener) {
        synchronized (this) {
            try {
                m57146a();
                if (this.f34033b == onCancelListener) {
                    return;
                }
                this.f34033b = onCancelListener;
                if (this.f34032a && onCancelListener != null) {
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