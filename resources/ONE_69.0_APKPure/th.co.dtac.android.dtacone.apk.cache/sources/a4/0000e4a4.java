package kotlinx.coroutines;

import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.sequences.Sequence;
import kotlinx.coroutines.Job;

/* renamed from: kotlinx.coroutines.a */
/* loaded from: classes6.dex */
public abstract /* synthetic */ class AbstractC12015a {
    /* renamed from: A */
    public static final boolean m27612A(CoroutineContext coroutineContext) {
        Job job = (Job) coroutineContext.get(Job.Key);
        if (job != null) {
            return job.isActive();
        }
        return true;
    }

    /* renamed from: B */
    public static final Throwable m27611B(Throwable th2, Job job) {
        if (th2 == null) {
            return new JobCancellationException("Job was cancelled", null, job);
        }
        return th2;
    }

    /* renamed from: a */
    public static final CompletableJob m27610a(Job job) {
        return new JobImpl(job);
    }

    /* renamed from: b */
    public static final /* synthetic */ Job m27609b(Job job) {
        return JobKt.Job(job);
    }

    /* renamed from: c */
    public static /* synthetic */ CompletableJob m27608c(Job job, int i, Object obj) {
        if ((i & 1) != 0) {
            job = null;
        }
        return JobKt.Job(job);
    }

    /* renamed from: d */
    public static /* synthetic */ Job m27607d(Job job, int i, Object obj) {
        Job m27609b;
        if ((i & 1) != 0) {
            job = null;
        }
        m27609b = m27609b(job);
        return m27609b;
    }

    /* renamed from: e */
    public static final /* synthetic */ void m27606e(CoroutineContext coroutineContext) {
        JobKt.cancel(coroutineContext, (CancellationException) null);
    }

    /* renamed from: f */
    public static final void m27605f(CoroutineContext coroutineContext, CancellationException cancellationException) {
        Job job = (Job) coroutineContext.get(Job.Key);
        if (job != null) {
            job.cancel(cancellationException);
        }
    }

    /* renamed from: g */
    public static final void m27604g(Job job, String str, Throwable th2) {
        job.cancel(ExceptionsKt.CancellationException(str, th2));
    }

    /* renamed from: h */
    public static final /* synthetic */ boolean m27603h(CoroutineContext coroutineContext, Throwable th2) {
        JobSupport jobSupport;
        CoroutineContext.Element element = coroutineContext.get(Job.Key);
        if (element instanceof JobSupport) {
            jobSupport = (JobSupport) element;
        } else {
            jobSupport = null;
        }
        if (jobSupport == null) {
            return false;
        }
        jobSupport.cancelInternal(m27611B(th2, jobSupport));
        return true;
    }

    /* renamed from: i */
    public static /* synthetic */ void m27602i(CoroutineContext coroutineContext, CancellationException cancellationException, int i, Object obj) {
        if ((i & 1) != 0) {
            cancellationException = null;
        }
        JobKt.cancel(coroutineContext, cancellationException);
    }

    /* renamed from: j */
    public static /* synthetic */ void m27601j(Job job, String str, Throwable th2, int i, Object obj) {
        if ((i & 2) != 0) {
            th2 = null;
        }
        JobKt.cancel(job, str, th2);
    }

    /* renamed from: k */
    public static /* synthetic */ boolean m27600k(CoroutineContext coroutineContext, Throwable th2, int i, Object obj) {
        boolean m27603h;
        if ((i & 1) != 0) {
            th2 = null;
        }
        m27603h = m27603h(coroutineContext, th2);
        return m27603h;
    }

    /* renamed from: l */
    public static final Object m27599l(Job job, Continuation continuation) {
        Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        Object join = job.join(continuation);
        if (join == AbstractC19782eg0.getCOROUTINE_SUSPENDED()) {
            return join;
        }
        return Unit.INSTANCE;
    }

    /* renamed from: m */
    public static final /* synthetic */ void m27598m(CoroutineContext coroutineContext) {
        JobKt.cancelChildren(coroutineContext, (CancellationException) null);
    }

    /* renamed from: n */
    public static final /* synthetic */ void m27597n(CoroutineContext coroutineContext, Throwable th2) {
        JobSupport jobSupport;
        Job job = (Job) coroutineContext.get(Job.Key);
        if (job == null) {
            return;
        }
        for (Job job2 : job.getChildren()) {
            if (job2 instanceof JobSupport) {
                jobSupport = (JobSupport) job2;
            } else {
                jobSupport = null;
            }
            if (jobSupport != null) {
                jobSupport.cancelInternal(m27611B(th2, job));
            }
        }
    }

    /* renamed from: o */
    public static final void m27596o(CoroutineContext coroutineContext, CancellationException cancellationException) {
        Sequence<Job> children;
        Job job = (Job) coroutineContext.get(Job.Key);
        if (job != null && (children = job.getChildren()) != null) {
            for (Job job2 : children) {
                job2.cancel(cancellationException);
            }
        }
    }

    /* renamed from: p */
    public static final /* synthetic */ void m27595p(Job job) {
        JobKt.cancelChildren(job, (CancellationException) null);
    }

    /* renamed from: q */
    public static final /* synthetic */ void m27594q(Job job, Throwable th2) {
        JobSupport jobSupport;
        for (Job job2 : job.getChildren()) {
            if (job2 instanceof JobSupport) {
                jobSupport = (JobSupport) job2;
            } else {
                jobSupport = null;
            }
            if (jobSupport != null) {
                jobSupport.cancelInternal(m27611B(th2, job));
            }
        }
    }

    /* renamed from: r */
    public static final void m27593r(Job job, CancellationException cancellationException) {
        for (Job job2 : job.getChildren()) {
            job2.cancel(cancellationException);
        }
    }

    /* renamed from: s */
    public static /* synthetic */ void m27592s(CoroutineContext coroutineContext, Throwable th2, int i, Object obj) {
        if ((i & 1) != 0) {
            th2 = null;
        }
        m27597n(coroutineContext, th2);
    }

    /* renamed from: t */
    public static /* synthetic */ void m27591t(CoroutineContext coroutineContext, CancellationException cancellationException, int i, Object obj) {
        if ((i & 1) != 0) {
            cancellationException = null;
        }
        JobKt.cancelChildren(coroutineContext, cancellationException);
    }

    /* renamed from: u */
    public static /* synthetic */ void m27590u(Job job, Throwable th2, int i, Object obj) {
        if ((i & 1) != 0) {
            th2 = null;
        }
        m27594q(job, th2);
    }

    /* renamed from: v */
    public static /* synthetic */ void m27589v(Job job, CancellationException cancellationException, int i, Object obj) {
        if ((i & 1) != 0) {
            cancellationException = null;
        }
        JobKt.cancelChildren(job, cancellationException);
    }

    /* renamed from: w */
    public static final DisposableHandle m27588w(Job job, DisposableHandle disposableHandle) {
        return job.invokeOnCompletion(new DisposeOnCompletion(disposableHandle));
    }

    /* renamed from: x */
    public static final void m27587x(CoroutineContext coroutineContext) {
        Job job = (Job) coroutineContext.get(Job.Key);
        if (job != null) {
            JobKt.ensureActive(job);
        }
    }

    /* renamed from: y */
    public static final void m27586y(Job job) {
        if (job.isActive()) {
            return;
        }
        throw job.getCancellationException();
    }

    /* renamed from: z */
    public static final Job m27585z(CoroutineContext coroutineContext) {
        Job job = (Job) coroutineContext.get(Job.Key);
        if (job != null) {
            return job;
        }
        throw new IllegalStateException(("Current context doesn't contain Job in it: " + coroutineContext).toString());
    }
}