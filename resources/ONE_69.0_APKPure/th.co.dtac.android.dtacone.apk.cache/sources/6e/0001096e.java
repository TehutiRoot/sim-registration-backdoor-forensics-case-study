package p046rx.exceptions;

import ch.qos.logback.classic.net.SyslogAppender;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;

/* renamed from: rx.exceptions.CompositeException */
/* loaded from: classes5.dex */
public final class CompositeException extends RuntimeException {
    private static final long serialVersionUID = 3026362227162912146L;
    private Throwable cause;
    private final List<Throwable> exceptions;
    private final String message;

    /* renamed from: rx.exceptions.CompositeException$CompositeExceptionCausalChain */
    /* loaded from: classes5.dex */
    public static final class CompositeExceptionCausalChain extends RuntimeException {
        static final String MESSAGE = "Chain of Causes for CompositeException In Order Received =>";
        private static final long serialVersionUID = 3875212506787802066L;

        @Override // java.lang.Throwable
        public String getMessage() {
            return MESSAGE;
        }
    }

    /* renamed from: rx.exceptions.CompositeException$a */
    /* loaded from: classes5.dex */
    public static abstract class AbstractC13400a {
        /* renamed from: a */
        public abstract Object mo23356a();

        /* renamed from: b */
        public abstract void mo23355b(Object obj);
    }

    /* renamed from: rx.exceptions.CompositeException$b */
    /* loaded from: classes5.dex */
    public static final class C13401b extends AbstractC13400a {

        /* renamed from: a */
        public final PrintStream f77912a;

        public C13401b(PrintStream printStream) {
            this.f77912a = printStream;
        }

        @Override // p046rx.exceptions.CompositeException.AbstractC13400a
        /* renamed from: a */
        public Object mo23356a() {
            return this.f77912a;
        }

        @Override // p046rx.exceptions.CompositeException.AbstractC13400a
        /* renamed from: b */
        public void mo23355b(Object obj) {
            this.f77912a.println(obj);
        }
    }

    /* renamed from: rx.exceptions.CompositeException$c */
    /* loaded from: classes5.dex */
    public static final class C13402c extends AbstractC13400a {

        /* renamed from: a */
        public final PrintWriter f77913a;

        public C13402c(PrintWriter printWriter) {
            this.f77913a = printWriter;
        }

        @Override // p046rx.exceptions.CompositeException.AbstractC13400a
        /* renamed from: a */
        public Object mo23356a() {
            return this.f77913a;
        }

        @Override // p046rx.exceptions.CompositeException.AbstractC13400a
        /* renamed from: b */
        public void mo23355b(Object obj) {
            this.f77913a.println(obj);
        }
    }

    @Deprecated
    public CompositeException(String str, Collection<? extends Throwable> collection) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        ArrayList arrayList = new ArrayList();
        if (collection != null) {
            for (Throwable th2 : collection) {
                if (th2 instanceof CompositeException) {
                    linkedHashSet.addAll(((CompositeException) th2).getExceptions());
                } else if (th2 != null) {
                    linkedHashSet.add(th2);
                } else {
                    linkedHashSet.add(new NullPointerException());
                }
            }
        } else {
            linkedHashSet.add(new NullPointerException());
        }
        arrayList.addAll(linkedHashSet);
        List<Throwable> unmodifiableList = Collections.unmodifiableList(arrayList);
        this.exceptions = unmodifiableList;
        this.message = unmodifiableList.size() + " exceptions occurred. ";
    }

    private void appendStackTrace(StringBuilder sb, Throwable th2, String str) {
        StackTraceElement[] stackTrace;
        sb.append(str);
        sb.append(th2);
        sb.append('\n');
        for (StackTraceElement stackTraceElement : th2.getStackTrace()) {
            sb.append("\t\tat ");
            sb.append(stackTraceElement);
            sb.append('\n');
        }
        if (th2.getCause() != null) {
            sb.append("\tCaused by: ");
            appendStackTrace(sb, th2.getCause(), "");
        }
    }

    private List<Throwable> getListOfCauses(Throwable th2) {
        ArrayList arrayList = new ArrayList();
        Throwable cause = th2.getCause();
        if (cause != null && cause != th2) {
            while (true) {
                arrayList.add(cause);
                Throwable cause2 = cause.getCause();
                if (cause2 == null || cause2 == cause) {
                    break;
                }
                cause = cause.getCause();
            }
        }
        return arrayList;
    }

    private Throwable getRootCause(Throwable th2) {
        Throwable cause = th2.getCause();
        if (cause != null && cause != th2) {
            while (true) {
                Throwable cause2 = cause.getCause();
                if (cause2 == null || cause2 == cause) {
                    break;
                }
                cause = cause.getCause();
            }
            return cause;
        }
        return th2;
    }

    @Override // java.lang.Throwable
    public synchronized Throwable getCause() {
        try {
            if (this.cause == null) {
                CompositeExceptionCausalChain compositeExceptionCausalChain = new CompositeExceptionCausalChain();
                HashSet hashSet = new HashSet();
                Iterator<Throwable> it = this.exceptions.iterator();
                CompositeExceptionCausalChain compositeExceptionCausalChain2 = compositeExceptionCausalChain;
                while (it.hasNext()) {
                    Throwable next = it.next();
                    if (!hashSet.contains(next)) {
                        hashSet.add(next);
                        for (Throwable th2 : getListOfCauses(next)) {
                            if (hashSet.contains(th2)) {
                                next = new RuntimeException("Duplicate found in causal chain so cropping to prevent loop ...");
                            } else {
                                hashSet.add(th2);
                            }
                        }
                        try {
                            compositeExceptionCausalChain2.initCause(next);
                        } catch (Throwable unused) {
                        }
                        compositeExceptionCausalChain2 = getRootCause(compositeExceptionCausalChain2);
                    }
                }
                this.cause = compositeExceptionCausalChain;
            }
        } catch (Throwable th3) {
            throw th3;
        }
        return this.cause;
    }

    public List<Throwable> getExceptions() {
        return this.exceptions;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return this.message;
    }

    @Override // java.lang.Throwable
    public void printStackTrace() {
        printStackTrace(System.err);
    }

    @Override // java.lang.Throwable
    public void printStackTrace(PrintStream printStream) {
        printStackTrace(new C13401b(printStream));
    }

    @Override // java.lang.Throwable
    public void printStackTrace(PrintWriter printWriter) {
        printStackTrace(new C13402c(printWriter));
    }

    private void printStackTrace(AbstractC13400a abstractC13400a) {
        StackTraceElement[] stackTrace;
        StringBuilder sb = new StringBuilder(128);
        sb.append(this);
        sb.append('\n');
        for (StackTraceElement stackTraceElement : getStackTrace()) {
            sb.append("\tat ");
            sb.append(stackTraceElement);
            sb.append('\n');
        }
        int i = 1;
        for (Throwable th2 : this.exceptions) {
            sb.append("  ComposedException ");
            sb.append(i);
            sb.append(" :\n");
            appendStackTrace(sb, th2, SyslogAppender.DEFAULT_STACKTRACE_PATTERN);
            i++;
        }
        synchronized (abstractC13400a.mo23356a()) {
            abstractC13400a.mo23355b(sb.toString());
        }
    }

    public CompositeException(Collection<? extends Throwable> collection) {
        this(null, collection);
    }

    public CompositeException(Throwable... thArr) {
        List<Throwable> unmodifiableList;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        ArrayList arrayList = new ArrayList();
        if (thArr != null) {
            for (Throwable th2 : thArr) {
                if (th2 instanceof CompositeException) {
                    linkedHashSet.addAll(((CompositeException) th2).getExceptions());
                } else if (th2 != null) {
                    linkedHashSet.add(th2);
                } else {
                    linkedHashSet.add(new NullPointerException());
                }
            }
        } else {
            linkedHashSet.add(new NullPointerException());
        }
        arrayList.addAll(linkedHashSet);
        this.exceptions = Collections.unmodifiableList(arrayList);
        this.message = unmodifiableList.size() + " exceptions occurred. ";
    }
}