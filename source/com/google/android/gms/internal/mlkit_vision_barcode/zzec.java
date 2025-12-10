package com.google.android.gms.internal.mlkit_vision_barcode;

import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.util.Locale;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.CheckForNull;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.apache.commons.cli.HelpFormatter;
import th.p047co.dtac.android.dtacone.util.Constant;

/* loaded from: classes3.dex */
public abstract class zzec<V> extends zzez implements zzev<V> {

    /* renamed from: d */
    public static final boolean f46579d;

    /* renamed from: e */
    public static final Logger f46580e;

    /* renamed from: f */
    public static final AbstractC6560u f46581f;

    /* renamed from: g */
    public static final Object f46582g;

    /* renamed from: a */
    public volatile Object f46583a;

    /* renamed from: b */
    public volatile C6562w f46584b;

    /* renamed from: c */
    public volatile C6537B f46585c;

    /* loaded from: classes3.dex */
    public final class zzc {

        /* renamed from: b */
        public static final zzc f46586b = new zzc(new Throwable("Failure occurred while trying to finish a future.") { // from class: com.google.android.gms.internal.mlkit_vision_barcode.zzec.zzc.1
            {
                super("Failure occurred while trying to finish a future.");
            }

            @Override // java.lang.Throwable
            public final synchronized Throwable fillInStackTrace() {
                return this;
            }
        });

        /* renamed from: a */
        public final Throwable f46587a;

        public zzc(Throwable th2) {
            th2.getClass();
            this.f46587a = th2;
        }
    }

    static {
        boolean z;
        AbstractC6560u c6564y;
        Throwable th2;
        try {
            z = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
        } catch (SecurityException unused) {
            z = false;
        }
        f46579d = z;
        f46580e = Logger.getLogger(zzec.class.getName());
        try {
            th2 = null;
            c6564y = new C6535A(null);
            e = null;
        } catch (Error | RuntimeException e) {
            e = e;
            try {
                th2 = null;
                c6564y = new C6563x(AtomicReferenceFieldUpdater.newUpdater(C6537B.class, Thread.class, PDPageLabelRange.STYLE_LETTERS_LOWER), AtomicReferenceFieldUpdater.newUpdater(C6537B.class, C6537B.class, OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE), AtomicReferenceFieldUpdater.newUpdater(zzec.class, C6537B.class, OperatorName.CURVE_TO), AtomicReferenceFieldUpdater.newUpdater(zzec.class, C6562w.class, OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE), AtomicReferenceFieldUpdater.newUpdater(zzec.class, Object.class, PDPageLabelRange.STYLE_LETTERS_LOWER));
            } catch (Error | RuntimeException e2) {
                c6564y = new C6564y(null);
                th2 = e2;
            }
        }
        f46581f = c6564y;
        if (th2 != null) {
            Logger logger = f46580e;
            Level level = Level.SEVERE;
            logger.logp(level, "com.google.common.util.concurrent.AbstractFuture", "<clinit>", "UnsafeAtomicHelper is broken!", e);
            logger.logp(level, "com.google.common.util.concurrent.AbstractFuture", "<clinit>", "SafeAtomicHelper is broken!", th2);
        }
        f46582g = new Object();
    }

    /* renamed from: j */
    public static Object m47053j(zzev zzevVar) {
        Throwable zzf;
        if (zzevVar instanceof InterfaceC6565z) {
            Object obj = ((zzec) zzevVar).f46583a;
            if (obj instanceof C6561v) {
                C6561v c6561v = (C6561v) obj;
                if (c6561v.f46560a) {
                    Throwable th2 = c6561v.f46561b;
                    obj = th2 != null ? new C6561v(false, th2) : C6561v.f46559d;
                }
            }
            obj.getClass();
            return obj;
        } else if ((zzevVar instanceof zzez) && (zzf = ((zzez) zzevVar).zzf()) != null) {
            return new zzc(zzf);
        } else {
            boolean isCancelled = zzevVar.isCancelled();
            if ((!f46579d) & isCancelled) {
                C6561v c6561v2 = C6561v.f46559d;
                c6561v2.getClass();
                return c6561v2;
            }
            try {
                Object m47052k = m47052k(zzevVar);
                if (isCancelled) {
                    String valueOf = String.valueOf(zzevVar);
                    return new C6561v(false, new IllegalArgumentException("get() did not throw CancellationException, despite reporting isCancelled() == true: " + valueOf));
                } else if (m47052k == null) {
                    return f46582g;
                } else {
                    return m47052k;
                }
            } catch (Error e) {
                e = e;
                return new zzc(e);
            } catch (CancellationException e2) {
                if (!isCancelled) {
                    return new zzc(new IllegalArgumentException("get() threw CancellationException, despite reporting isCancelled() == false: ".concat(String.valueOf(zzevVar)), e2));
                }
                return new C6561v(false, e2);
            } catch (RuntimeException e3) {
                e = e3;
                return new zzc(e);
            } catch (ExecutionException e4) {
                if (isCancelled) {
                    return new C6561v(false, new IllegalArgumentException("get() did not throw CancellationException, despite reporting isCancelled() == true: ".concat(String.valueOf(zzevVar)), e4));
                }
                return new zzc(e4.getCause());
            }
        }
    }

    /* renamed from: k */
    public static Object m47052k(Future future) {
        Object obj;
        boolean z = false;
        while (true) {
            try {
                obj = future.get();
                break;
            } catch (InterruptedException unused) {
                z = true;
            } catch (Throwable th2) {
                if (z) {
                    Thread.currentThread().interrupt();
                }
                throw th2;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
        return obj;
    }

    /* renamed from: n */
    public static void m47049n(zzec zzecVar, boolean z) {
        for (C6537B mo47075b = f46581f.mo47075b(zzecVar, C6537B.f46516c); mo47075b != null; mo47075b = mo47075b.f46518b) {
            Thread thread = mo47075b.f46517a;
            if (thread != null) {
                mo47075b.f46517a = null;
                LockSupport.unpark(thread);
            }
        }
        zzecVar.zzk();
        C6562w mo47076a = f46581f.mo47076a(zzecVar, C6562w.f46562d);
        C6562w c6562w = null;
        while (mo47076a != null) {
            C6562w c6562w2 = mo47076a.f46565c;
            mo47076a.f46565c = c6562w;
            c6562w = mo47076a;
            mo47076a = c6562w2;
        }
        while (c6562w != null) {
            C6562w c6562w3 = c6562w.f46565c;
            Runnable runnable = c6562w.f46563a;
            runnable.getClass();
            Executor executor = c6562w.f46564b;
            executor.getClass();
            m47048o(runnable, executor);
            c6562w = c6562w3;
        }
    }

    /* renamed from: o */
    public static void m47048o(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e) {
            Logger logger = f46580e;
            Level level = Level.SEVERE;
            String valueOf = String.valueOf(runnable);
            String valueOf2 = String.valueOf(executor);
            logger.logp(level, "com.google.common.util.concurrent.AbstractFuture", "executeListener", "RuntimeException while executing runnable " + valueOf + " with executor " + valueOf2, (Throwable) e);
        }
    }

    /* renamed from: q */
    public static final Object m47046q(Object obj) {
        if (!(obj instanceof C6561v)) {
            if (!(obj instanceof zzc)) {
                if (obj == f46582g) {
                    return null;
                }
                return obj;
            }
            throw new ExecutionException(((zzc) obj).f46587a);
        }
        Throwable th2 = ((C6561v) obj).f46561b;
        CancellationException cancellationException = new CancellationException("Task was cancelled.");
        cancellationException.initCause(th2);
        throw cancellationException;
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        boolean z2;
        C6561v c6561v;
        Object obj = this.f46583a;
        if (obj == null) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            if (f46579d) {
                c6561v = new C6561v(z, new CancellationException("Future.cancel() was called."));
            } else {
                if (z) {
                    c6561v = C6561v.f46558c;
                } else {
                    c6561v = C6561v.f46559d;
                }
                c6561v.getClass();
            }
            if (f46581f.mo47071f(this, obj, c6561v)) {
                m47049n(this, z);
                return true;
            }
        }
        return false;
    }

    @Override // java.util.concurrent.Future
    public final Object get() throws InterruptedException, ExecutionException {
        Object obj;
        boolean z;
        if (!Thread.interrupted()) {
            Object obj2 = this.f46583a;
            if (obj2 != null) {
                return m47046q(obj2);
            }
            C6537B c6537b = this.f46585c;
            if (c6537b != C6537B.f46516c) {
                C6537B c6537b2 = new C6537B();
                do {
                    AbstractC6560u abstractC6560u = f46581f;
                    abstractC6560u.mo47074c(c6537b2, c6537b);
                    if (abstractC6560u.mo47070g(this, c6537b, c6537b2)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.f46583a;
                                if (obj != null) {
                                    z = true;
                                    continue;
                                } else {
                                    z = false;
                                    continue;
                                }
                            } else {
                                m47047p(c6537b2);
                                throw new InterruptedException();
                            }
                        } while (!z);
                        return m47046q(obj);
                    }
                    c6537b = this.f46585c;
                } while (c6537b != C6537B.f46516c);
                Object obj3 = this.f46583a;
                obj3.getClass();
                return m47046q(obj3);
            }
            Object obj32 = this.f46583a;
            obj32.getClass();
            return m47046q(obj32);
        }
        throw new InterruptedException();
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f46583a instanceof C6561v;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.f46583a != null;
    }

    /* renamed from: l */
    public final void m47051l(StringBuilder sb) {
        try {
            Object m47052k = m47052k(this);
            sb.append("SUCCESS, result=[");
            if (m47052k == null) {
                sb.append(AbstractJsonLexerKt.NULL);
            } else if (m47052k == this) {
                sb.append("this future");
            } else {
                sb.append(m47052k.getClass().getName());
                sb.append("@");
                sb.append(Integer.toHexString(System.identityHashCode(m47052k)));
            }
            sb.append("]");
        } catch (CancellationException unused) {
            sb.append(Constant.QueryTransactionStatus.CANCELLED);
        } catch (RuntimeException e) {
            sb.append("UNKNOWN, cause=[");
            sb.append(e.getClass());
            sb.append(" thrown from get()]");
        } catch (ExecutionException e2) {
            sb.append("FAILURE, cause=[");
            sb.append(e2.getCause());
            sb.append("]");
        }
    }

    /* renamed from: m */
    public final void m47050m(StringBuilder sb) {
        String concat;
        int length = sb.length();
        sb.append("PENDING");
        try {
            concat = zzbd.zza(zze());
        } catch (RuntimeException | StackOverflowError e) {
            concat = "Exception thrown from implementation: ".concat(String.valueOf(e.getClass()));
        }
        if (concat != null) {
            sb.append(", info=[");
            sb.append(concat);
            sb.append("]");
        }
        if (isDone()) {
            sb.delete(length, sb.length());
            m47051l(sb);
        }
    }

    /* renamed from: p */
    public final void m47047p(C6537B c6537b) {
        c6537b.f46517a = null;
        while (true) {
            C6537B c6537b2 = this.f46585c;
            if (c6537b2 != C6537B.f46516c) {
                C6537B c6537b3 = null;
                while (c6537b2 != null) {
                    C6537B c6537b4 = c6537b2.f46518b;
                    if (c6537b2.f46517a != null) {
                        c6537b3 = c6537b2;
                    } else if (c6537b3 != null) {
                        c6537b3.f46518b = c6537b4;
                        if (c6537b3.f46517a == null) {
                            break;
                        }
                    } else if (!f46581f.mo47070g(this, c6537b2, c6537b4)) {
                        break;
                    }
                    c6537b2 = c6537b4;
                }
                return;
            }
            return;
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (getClass().getName().startsWith("com.google.common.util.concurrent.")) {
            sb.append(getClass().getSimpleName());
        } else {
            sb.append(getClass().getName());
        }
        sb.append('@');
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("[status=");
        if (this.f46583a instanceof C6561v) {
            sb.append(Constant.QueryTransactionStatus.CANCELLED);
        } else if (isDone()) {
            m47051l(sb);
        } else {
            m47050m(sb);
        }
        sb.append("]");
        return sb.toString();
    }

    @CheckForNull
    public String zze() {
        if (this instanceof ScheduledFuture) {
            long delay = ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS);
            return "remaining delay=[" + delay + " ms]";
        }
        return null;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzez
    @CheckForNull
    public final Throwable zzf() {
        if (this instanceof InterfaceC6565z) {
            Object obj = this.f46583a;
            if (obj instanceof zzc) {
                return ((zzc) obj).f46587a;
            }
            return null;
        }
        return null;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzev
    public final void zzj(Runnable runnable, Executor executor) {
        C6562w c6562w;
        if (executor != null) {
            if (!isDone() && (c6562w = this.f46584b) != C6562w.f46562d) {
                C6562w c6562w2 = new C6562w(runnable, executor);
                do {
                    c6562w2.f46565c = c6562w;
                    if (f46581f.mo47072e(this, c6562w, c6562w2)) {
                        return;
                    }
                    c6562w = this.f46584b;
                } while (c6562w != C6562w.f46562d);
                m47048o(runnable, executor);
                return;
            }
            m47048o(runnable, executor);
            return;
        }
        throw new NullPointerException("Executor was null.");
    }

    public void zzk() {
    }

    public final boolean zzl(Throwable th2) {
        if (!f46581f.mo47071f(this, null, new zzc(th2))) {
            return false;
        }
        m47049n(this, false);
        return true;
    }

    public final boolean zzm(zzev zzevVar) {
        zzevVar.getClass();
        Object obj = this.f46583a;
        if (obj == null) {
            if (!f46581f.mo47071f(this, null, m47053j(zzevVar))) {
                return false;
            }
            m47049n(this, false);
            return true;
        }
        if (obj instanceof C6561v) {
            C6561v c6561v = (C6561v) obj;
        }
        return false;
    }

    public final boolean zzn() {
        Object obj = this.f46583a;
        if ((obj instanceof C6561v) && ((C6561v) obj).f46560a) {
            return true;
        }
        return false;
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) throws InterruptedException, TimeoutException, ExecutionException {
        long nanos = timeUnit.toNanos(j);
        if (!Thread.interrupted()) {
            Object obj = this.f46583a;
            boolean z = true;
            if (obj != null) {
                return m47046q(obj);
            }
            long nanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
            if (nanos >= 1000) {
                C6537B c6537b = this.f46585c;
                if (c6537b != C6537B.f46516c) {
                    C6537B c6537b2 = new C6537B();
                    do {
                        AbstractC6560u abstractC6560u = f46581f;
                        abstractC6560u.mo47074c(c6537b2, c6537b);
                        if (abstractC6560u.mo47070g(this, c6537b, c6537b2)) {
                            do {
                                LockSupport.parkNanos(this, Math.min(nanos, 2147483647999999999L));
                                if (!Thread.interrupted()) {
                                    Object obj2 = this.f46583a;
                                    if (obj2 != null) {
                                        return m47046q(obj2);
                                    }
                                    nanos = nanoTime - System.nanoTime();
                                } else {
                                    m47047p(c6537b2);
                                    throw new InterruptedException();
                                }
                            } while (nanos >= 1000);
                            m47047p(c6537b2);
                        } else {
                            c6537b = this.f46585c;
                        }
                    } while (c6537b != C6537B.f46516c);
                    Object obj3 = this.f46583a;
                    obj3.getClass();
                    return m47046q(obj3);
                }
                Object obj32 = this.f46583a;
                obj32.getClass();
                return m47046q(obj32);
            }
            while (nanos > 0) {
                Object obj4 = this.f46583a;
                if (obj4 != null) {
                    return m47046q(obj4);
                }
                if (!Thread.interrupted()) {
                    nanos = nanoTime - System.nanoTime();
                } else {
                    throw new InterruptedException();
                }
            }
            String zzecVar = toString();
            String obj5 = timeUnit.toString();
            Locale locale = Locale.ROOT;
            String lowerCase = obj5.toLowerCase(locale);
            String str = "Waited " + j + HelpFormatter.DEFAULT_LONG_OPT_SEPARATOR + timeUnit.toString().toLowerCase(locale);
            if (nanos + 1000 < 0) {
                String concat = str.concat(" (plus ");
                long j2 = -nanos;
                long convert = timeUnit.convert(j2, TimeUnit.NANOSECONDS);
                long nanos2 = j2 - timeUnit.toNanos(convert);
                int i = (convert > 0L ? 1 : (convert == 0L ? 0 : -1));
                if (i != 0 && nanos2 <= 1000) {
                    z = false;
                }
                if (i > 0) {
                    String str2 = concat + convert + HelpFormatter.DEFAULT_LONG_OPT_SEPARATOR + lowerCase;
                    if (z) {
                        str2 = str2.concat(",");
                    }
                    concat = str2.concat(HelpFormatter.DEFAULT_LONG_OPT_SEPARATOR);
                }
                if (z) {
                    concat = concat + nanos2 + " nanoseconds ";
                }
                str = concat.concat("delay)");
            }
            if (isDone()) {
                throw new TimeoutException(str.concat(" but future completed as timeout expired"));
            }
            throw new TimeoutException(str + " for " + zzecVar);
        }
        throw new InterruptedException();
    }
}
