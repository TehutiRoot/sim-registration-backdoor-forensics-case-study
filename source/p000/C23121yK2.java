package p000;

import android.app.Activity;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.DuplicateTaskCompletionException;
import com.google.android.gms.tasks.OnCanceledListener;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.RuntimeExecutionException;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskExecutors;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;

/* renamed from: yK2 */
/* loaded from: classes4.dex */
public final class C23121yK2 extends Task {

    /* renamed from: a */
    public final Object f108719a = new Object();

    /* renamed from: b */
    public final C20194hJ2 f108720b = new C20194hJ2();

    /* renamed from: c */
    public boolean f108721c;

    /* renamed from: d */
    public volatile boolean f108722d;

    /* renamed from: e */
    public Object f108723e;

    /* renamed from: f */
    public Exception f108724f;

    /* renamed from: a */
    public final void m287a(Exception exc) {
        Preconditions.checkNotNull(exc, "Exception must not be null");
        synchronized (this.f108719a) {
            m280h();
            this.f108721c = true;
            this.f108724f = exc;
        }
        this.f108720b.m30892b(this);
    }

    @Override // com.google.android.gms.tasks.Task
    public final Task addOnCanceledListener(Activity activity, OnCanceledListener onCanceledListener) {
        C19428ct2 c19428ct2 = new C19428ct2(TaskExecutors.MAIN_THREAD, onCanceledListener);
        this.f108720b.m30893a(c19428ct2);
        C20885lK2.m26482a(activity).m26481b(c19428ct2);
        m279i();
        return this;
    }

    @Override // com.google.android.gms.tasks.Task
    public final Task addOnCompleteListener(Activity activity, OnCompleteListener onCompleteListener) {
        C22198sz2 c22198sz2 = new C22198sz2(TaskExecutors.MAIN_THREAD, onCompleteListener);
        this.f108720b.m30893a(c22198sz2);
        C20885lK2.m26482a(activity).m26481b(c22198sz2);
        m279i();
        return this;
    }

    @Override // com.google.android.gms.tasks.Task
    public final Task addOnFailureListener(Activity activity, OnFailureListener onFailureListener) {
        TD2 td2 = new TD2(TaskExecutors.MAIN_THREAD, onFailureListener);
        this.f108720b.m30893a(td2);
        C20885lK2.m26482a(activity).m26481b(td2);
        m279i();
        return this;
    }

    @Override // com.google.android.gms.tasks.Task
    public final Task addOnSuccessListener(Activity activity, OnSuccessListener onSuccessListener) {
        GH2 gh2 = new GH2(TaskExecutors.MAIN_THREAD, onSuccessListener);
        this.f108720b.m30893a(gh2);
        C20885lK2.m26482a(activity).m26481b(gh2);
        m279i();
        return this;
    }

    /* renamed from: b */
    public final void m286b(Object obj) {
        synchronized (this.f108719a) {
            m280h();
            this.f108721c = true;
            this.f108723e = obj;
        }
        this.f108720b.m30892b(this);
    }

    /* renamed from: c */
    public final boolean m285c() {
        synchronized (this.f108719a) {
            try {
                if (this.f108721c) {
                    return false;
                }
                this.f108721c = true;
                this.f108722d = true;
                this.f108720b.m30892b(this);
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.google.android.gms.tasks.Task
    public final Task continueWith(Continuation continuation) {
        return continueWith(TaskExecutors.MAIN_THREAD, continuation);
    }

    @Override // com.google.android.gms.tasks.Task
    public final Task continueWithTask(Continuation continuation) {
        return continueWithTask(TaskExecutors.MAIN_THREAD, continuation);
    }

    /* renamed from: d */
    public final boolean m284d(Exception exc) {
        Preconditions.checkNotNull(exc, "Exception must not be null");
        synchronized (this.f108719a) {
            try {
                if (this.f108721c) {
                    return false;
                }
                this.f108721c = true;
                this.f108724f = exc;
                this.f108720b.m30892b(this);
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: e */
    public final boolean m283e(Object obj) {
        synchronized (this.f108719a) {
            try {
                if (this.f108721c) {
                    return false;
                }
                this.f108721c = true;
                this.f108723e = obj;
                this.f108720b.m30892b(this);
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: f */
    public final void m282f() {
        Preconditions.checkState(this.f108721c, "Task is not yet complete");
    }

    /* renamed from: g */
    public final void m281g() {
        if (!this.f108722d) {
            return;
        }
        throw new CancellationException("Task is already canceled.");
    }

    @Override // com.google.android.gms.tasks.Task
    public final Exception getException() {
        Exception exc;
        synchronized (this.f108719a) {
            exc = this.f108724f;
        }
        return exc;
    }

    @Override // com.google.android.gms.tasks.Task
    public final Object getResult() {
        Object obj;
        synchronized (this.f108719a) {
            try {
                m282f();
                m281g();
                Exception exc = this.f108724f;
                if (exc == null) {
                    obj = this.f108723e;
                } else {
                    throw new RuntimeExecutionException(exc);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return obj;
    }

    /* renamed from: h */
    public final void m280h() {
        if (!this.f108721c) {
            return;
        }
        throw DuplicateTaskCompletionException.m46051of(this);
    }

    /* renamed from: i */
    public final void m279i() {
        synchronized (this.f108719a) {
            try {
                if (!this.f108721c) {
                    return;
                }
                this.f108720b.m30892b(this);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.google.android.gms.tasks.Task
    public final boolean isCanceled() {
        return this.f108722d;
    }

    @Override // com.google.android.gms.tasks.Task
    public final boolean isComplete() {
        boolean z;
        synchronized (this.f108719a) {
            z = this.f108721c;
        }
        return z;
    }

    @Override // com.google.android.gms.tasks.Task
    public final boolean isSuccessful() {
        boolean z;
        synchronized (this.f108719a) {
            try {
                z = false;
                if (this.f108721c && !this.f108722d && this.f108724f == null) {
                    z = true;
                }
            } finally {
            }
        }
        return z;
    }

    @Override // com.google.android.gms.tasks.Task
    public final Task onSuccessTask(SuccessContinuation successContinuation) {
        Executor executor = TaskExecutors.MAIN_THREAD;
        C23121yK2 c23121yK2 = new C23121yK2();
        this.f108720b.m30893a(new FI2(executor, successContinuation, c23121yK2));
        m279i();
        return c23121yK2;
    }

    @Override // com.google.android.gms.tasks.Task
    public final Task continueWith(Executor executor, Continuation continuation) {
        C23121yK2 c23121yK2 = new C23121yK2();
        this.f108720b.m30893a(new C21456oh2(executor, continuation, c23121yK2));
        m279i();
        return c23121yK2;
    }

    @Override // com.google.android.gms.tasks.Task
    public final Task continueWithTask(Executor executor, Continuation continuation) {
        C23121yK2 c23121yK2 = new C23121yK2();
        this.f108720b.m30893a(new Pm2(executor, continuation, c23121yK2));
        m279i();
        return c23121yK2;
    }

    @Override // com.google.android.gms.tasks.Task
    public final Task addOnCanceledListener(OnCanceledListener onCanceledListener) {
        addOnCanceledListener(TaskExecutors.MAIN_THREAD, onCanceledListener);
        return this;
    }

    @Override // com.google.android.gms.tasks.Task
    public final Task addOnCompleteListener(OnCompleteListener onCompleteListener) {
        this.f108720b.m30893a(new C22198sz2(TaskExecutors.MAIN_THREAD, onCompleteListener));
        m279i();
        return this;
    }

    @Override // com.google.android.gms.tasks.Task
    public final Task addOnFailureListener(OnFailureListener onFailureListener) {
        addOnFailureListener(TaskExecutors.MAIN_THREAD, onFailureListener);
        return this;
    }

    @Override // com.google.android.gms.tasks.Task
    public final Task addOnSuccessListener(OnSuccessListener onSuccessListener) {
        addOnSuccessListener(TaskExecutors.MAIN_THREAD, onSuccessListener);
        return this;
    }

    @Override // com.google.android.gms.tasks.Task
    public final Task onSuccessTask(Executor executor, SuccessContinuation successContinuation) {
        C23121yK2 c23121yK2 = new C23121yK2();
        this.f108720b.m30893a(new FI2(executor, successContinuation, c23121yK2));
        m279i();
        return c23121yK2;
    }

    @Override // com.google.android.gms.tasks.Task
    public final Task addOnCanceledListener(Executor executor, OnCanceledListener onCanceledListener) {
        this.f108720b.m30893a(new C19428ct2(executor, onCanceledListener));
        m279i();
        return this;
    }

    @Override // com.google.android.gms.tasks.Task
    public final Task addOnFailureListener(Executor executor, OnFailureListener onFailureListener) {
        this.f108720b.m30893a(new TD2(executor, onFailureListener));
        m279i();
        return this;
    }

    @Override // com.google.android.gms.tasks.Task
    public final Task addOnSuccessListener(Executor executor, OnSuccessListener onSuccessListener) {
        this.f108720b.m30893a(new GH2(executor, onSuccessListener));
        m279i();
        return this;
    }

    @Override // com.google.android.gms.tasks.Task
    public final Task addOnCompleteListener(Executor executor, OnCompleteListener onCompleteListener) {
        this.f108720b.m30893a(new C22198sz2(executor, onCompleteListener));
        m279i();
        return this;
    }

    @Override // com.google.android.gms.tasks.Task
    public final Object getResult(Class cls) {
        Object obj;
        synchronized (this.f108719a) {
            try {
                m282f();
                m281g();
                if (!cls.isInstance(this.f108724f)) {
                    Exception exc = this.f108724f;
                    if (exc == null) {
                        obj = this.f108723e;
                    } else {
                        throw new RuntimeExecutionException(exc);
                    }
                } else {
                    throw ((Throwable) cls.cast(this.f108724f));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return obj;
    }
}
