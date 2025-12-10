package ch.qos.logback.classic.pattern;

import ch.qos.logback.classic.spi.ILoggingEvent;
import ch.qos.logback.classic.spi.IThrowableProxy;
import ch.qos.logback.classic.spi.StackTraceElementProxy;
import ch.qos.logback.classic.spi.ThrowableProxyUtil;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.boolex.EvaluationException;
import ch.qos.logback.core.boolex.EventEvaluator;
import ch.qos.logback.core.status.ErrorStatus;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class ThrowableProxyConverter extends ThrowableHandlingConverter {
    protected static final int BUILDER_CAPACITY = 2048;

    /* renamed from: e */
    public int f39630e;

    /* renamed from: f */
    public List f39631f = null;

    /* renamed from: g */
    public List f39632g = null;

    /* renamed from: h */
    public int f39633h = 0;

    /* renamed from: a */
    private void m51593a(EventEvaluator eventEvaluator) {
        if (this.f39631f == null) {
            this.f39631f = new ArrayList();
        }
        this.f39631f.add(eventEvaluator);
    }

    /* renamed from: b */
    public final void m51592b(String str) {
        if (this.f39632g == null) {
            this.f39632g = new ArrayList();
        }
        this.f39632g.add(str);
    }

    /* renamed from: c */
    public final boolean m51591c(String str) {
        List<String> list = this.f39632g;
        if (list != null) {
            for (String str2 : list) {
                if (str.contains(str2)) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    @Override // ch.qos.logback.core.pattern.Converter
    public String convert(ILoggingEvent iLoggingEvent) {
        IThrowableProxy throwableProxy = iLoggingEvent.getThrowableProxy();
        if (throwableProxy == null) {
            return "";
        }
        if (this.f39631f != null) {
            for (int i = 0; i < this.f39631f.size(); i++) {
                EventEvaluator eventEvaluator = (EventEvaluator) this.f39631f.get(i);
                try {
                } catch (EvaluationException e) {
                    this.f39633h++;
                    if (this.f39633h < 4) {
                        addError("Exception thrown for evaluator named [" + eventEvaluator.getName() + "]", e);
                    } else if (this.f39633h == 4) {
                        ErrorStatus errorStatus = new ErrorStatus("Exception thrown for evaluator named [" + eventEvaluator.getName() + "].", this, e);
                        errorStatus.add(new ErrorStatus("This was the last warning about this evaluator's errors.We don't want the StatusManager to get flooded.", this));
                        addStatus(errorStatus);
                    }
                }
                if (eventEvaluator.evaluate(iLoggingEvent)) {
                    return "";
                }
            }
        }
        return throwableProxyToString(throwableProxy);
    }

    /* renamed from: d */
    public final void m51590d(StringBuilder sb, int i) {
        sb.append(" [");
        sb.append(i);
        sb.append(" skipped]");
    }

    public void extraData(StringBuilder sb, StackTraceElementProxy stackTraceElementProxy) {
    }

    /* renamed from: f */
    public final void m51589f(StringBuilder sb, int i, StackTraceElementProxy stackTraceElementProxy) {
        sb.append(stackTraceElementProxy);
        extraData(sb, stackTraceElementProxy);
        if (i > 0) {
            m51590d(sb, i);
        }
    }

    /* renamed from: g */
    public final void m51588g(StringBuilder sb, String str, int i, IThrowableProxy iThrowableProxy) {
        if (iThrowableProxy == null) {
            return;
        }
        m51586j(sb, str, i, iThrowableProxy);
        sb.append(CoreConstants.LINE_SEPARATOR);
        subjoinSTEPArray(sb, i, iThrowableProxy);
        IThrowableProxy[] suppressed = iThrowableProxy.getSuppressed();
        if (suppressed != null) {
            for (IThrowableProxy iThrowableProxy2 : suppressed) {
                m51588g(sb, CoreConstants.SUPPRESSED, i + 1, iThrowableProxy2);
            }
        }
        m51588g(sb, CoreConstants.CAUSED_BY, i, iThrowableProxy.getCause());
    }

    /* renamed from: i */
    public final void m51587i(StringBuilder sb, IThrowableProxy iThrowableProxy) {
        sb.append(iThrowableProxy.getClassName());
        sb.append(": ");
        sb.append(iThrowableProxy.getMessage());
    }

    /* renamed from: j */
    public final void m51586j(StringBuilder sb, String str, int i, IThrowableProxy iThrowableProxy) {
        ThrowableProxyUtil.indent(sb, i - 1);
        if (str != null) {
            sb.append(str);
        }
        m51587i(sb, iThrowableProxy);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x005c  */
    @Override // ch.qos.logback.core.pattern.DynamicConverter, ch.qos.logback.core.spi.LifeCycle
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void start() {
        /*
            r6 = this;
            java.lang.String r0 = r6.getFirstOption()
            r1 = 2147483647(0x7fffffff, float:NaN)
            r2 = 1
            if (r0 != 0) goto Ld
        La:
            r6.f39630e = r1
            goto L4a
        Ld:
            java.util.Locale r3 = java.util.Locale.US
            java.lang.String r0 = r0.toLowerCase(r3)
            java.lang.String r3 = "full"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L1d
            goto La
        L1d:
            java.lang.String r3 = "short"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L29
            r6.f39630e = r2
            goto L4a
        L29:
            int r3 = java.lang.Integer.parseInt(r0)     // Catch: java.lang.NumberFormatException -> L30
            r6.f39630e = r3     // Catch: java.lang.NumberFormatException -> L30
            goto L4a
        L30:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Could not parse ["
            r3.append(r4)
            r3.append(r0)
            java.lang.String r0 = "] as an integer"
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            r6.addError(r0)
            goto La
        L4a:
            java.util.List r0 = r6.getOptionList()
            if (r0 == 0) goto L80
            int r1 = r0.size()
            if (r1 <= r2) goto L80
            int r1 = r0.size()
        L5a:
            if (r2 >= r1) goto L80
            java.lang.Object r3 = r0.get(r2)
            java.lang.String r3 = (java.lang.String) r3
            ch.qos.logback.core.Context r4 = r6.getContext()
            java.lang.String r5 = "EVALUATOR_MAP"
            java.lang.Object r4 = r4.getObject(r5)
            java.util.Map r4 = (java.util.Map) r4
            java.lang.Object r4 = r4.get(r3)
            ch.qos.logback.core.boolex.EventEvaluator r4 = (ch.qos.logback.core.boolex.EventEvaluator) r4
            if (r4 == 0) goto L7a
            r6.m51593a(r4)
            goto L7d
        L7a:
            r6.m51592b(r3)
        L7d:
            int r2 = r2 + 1
            goto L5a
        L80:
            super.start()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ch.qos.logback.classic.pattern.ThrowableProxyConverter.start():void");
    }

    @Override // ch.qos.logback.core.pattern.DynamicConverter, ch.qos.logback.core.spi.LifeCycle
    public void stop() {
        this.f39631f = null;
        super.stop();
    }

    public void subjoinSTEPArray(StringBuilder sb, int i, IThrowableProxy iThrowableProxy) {
        StackTraceElementProxy[] stackTraceElementProxyArray = iThrowableProxy.getStackTraceElementProxyArray();
        int commonFrames = iThrowableProxy.getCommonFrames();
        int i2 = this.f39630e;
        boolean z = i2 > stackTraceElementProxyArray.length;
        if (z) {
            i2 = stackTraceElementProxyArray.length;
        }
        if (commonFrames > 0 && z) {
            i2 -= commonFrames;
        }
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            StackTraceElementProxy stackTraceElementProxy = stackTraceElementProxyArray[i4];
            if (m51591c(stackTraceElementProxy.toString())) {
                i3++;
                if (i2 < stackTraceElementProxyArray.length) {
                    i2++;
                }
            } else {
                ThrowableProxyUtil.indent(sb, i);
                m51589f(sb, i3, stackTraceElementProxy);
                sb.append(CoreConstants.LINE_SEPARATOR);
                i3 = 0;
            }
        }
        if (i3 > 0) {
            m51590d(sb, i3);
            sb.append(CoreConstants.LINE_SEPARATOR);
        }
        if (commonFrames <= 0 || !z) {
            return;
        }
        ThrowableProxyUtil.indent(sb, i);
        sb.append("... ");
        sb.append(iThrowableProxy.getCommonFrames());
        sb.append(" common frames omitted");
        sb.append(CoreConstants.LINE_SEPARATOR);
    }

    public String throwableProxyToString(IThrowableProxy iThrowableProxy) {
        StringBuilder sb = new StringBuilder(2048);
        m51588g(sb, null, 1, iThrowableProxy);
        return sb.toString();
    }
}
