package ch.qos.logback.classic.spi;

import ch.qos.logback.core.CoreConstants;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Set;

/* loaded from: classes.dex */
public class ThrowableProxy implements IThrowableProxy {

    /* renamed from: j */
    public static final Method f39656j;

    /* renamed from: k */
    public static final ThrowableProxy[] f39657k;

    /* renamed from: l */
    public static final StackTraceElementProxy[] f39658l;

    /* renamed from: a */
    public Throwable f39659a;

    /* renamed from: b */
    public String f39660b;

    /* renamed from: c */
    public String f39661c;

    /* renamed from: d */
    public StackTraceElementProxy[] f39662d;

    /* renamed from: e */
    public int f39663e;

    /* renamed from: f */
    public ThrowableProxy f39664f;

    /* renamed from: g */
    public ThrowableProxy[] f39665g;

    /* renamed from: h */
    public transient PackagingDataCalculator f39666h;

    /* renamed from: i */
    public boolean f39667i;

    static {
        Method method = null;
        try {
            method = Throwable.class.getMethod("getSuppressed", null);
        } catch (NoSuchMethodException unused) {
        }
        f39656j = method;
        f39657k = new ThrowableProxy[0];
        f39658l = new StackTraceElementProxy[0];
    }

    public ThrowableProxy(Throwable th2) {
        this(th2, Collections.newSetFromMap(new IdentityHashMap(1)));
    }

    public void calculatePackagingData() {
        PackagingDataCalculator packagingDataCalculator;
        if (this.f39667i || (packagingDataCalculator = getPackagingDataCalculator()) == null) {
            return;
        }
        this.f39667i = true;
        packagingDataCalculator.calculate(this);
    }

    public void fullDump() {
        StackTraceElementProxy[] stackTraceElementProxyArr;
        StringBuilder sb = new StringBuilder();
        for (StackTraceElementProxy stackTraceElementProxy : this.f39662d) {
            String stackTraceElementProxy2 = stackTraceElementProxy.toString();
            sb.append('\t');
            sb.append(stackTraceElementProxy2);
            ThrowableProxyUtil.subjoinPackagingData(sb, stackTraceElementProxy);
            sb.append(CoreConstants.LINE_SEPARATOR);
        }
        System.out.println(sb.toString());
    }

    @Override // ch.qos.logback.classic.spi.IThrowableProxy
    public IThrowableProxy getCause() {
        return this.f39664f;
    }

    @Override // ch.qos.logback.classic.spi.IThrowableProxy
    public String getClassName() {
        return this.f39660b;
    }

    @Override // ch.qos.logback.classic.spi.IThrowableProxy
    public int getCommonFrames() {
        return this.f39663e;
    }

    @Override // ch.qos.logback.classic.spi.IThrowableProxy
    public String getMessage() {
        return this.f39661c;
    }

    public PackagingDataCalculator getPackagingDataCalculator() {
        if (this.f39659a != null && this.f39666h == null) {
            this.f39666h = new PackagingDataCalculator();
        }
        return this.f39666h;
    }

    @Override // ch.qos.logback.classic.spi.IThrowableProxy
    public StackTraceElementProxy[] getStackTraceElementProxyArray() {
        return this.f39662d;
    }

    @Override // ch.qos.logback.classic.spi.IThrowableProxy
    public IThrowableProxy[] getSuppressed() {
        return this.f39665g;
    }

    public Throwable getThrowable() {
        return this.f39659a;
    }

    public ThrowableProxy(Throwable th2, Set set) {
        this.f39665g = f39657k;
        this.f39667i = false;
        this.f39659a = th2;
        this.f39660b = th2.getClass().getName();
        this.f39661c = th2.getMessage();
        this.f39662d = ThrowableProxyUtil.m51570c(th2.getStackTrace());
        if (set.contains(th2)) {
            this.f39660b = "CIRCULAR REFERENCE:" + th2.getClass().getName();
            this.f39662d = f39658l;
            return;
        }
        set.add(th2);
        Throwable cause = th2.getCause();
        if (cause != null) {
            ThrowableProxy throwableProxy = new ThrowableProxy(cause, set);
            this.f39664f = throwableProxy;
            throwableProxy.f39663e = ThrowableProxyUtil.m51572a(cause.getStackTrace(), this.f39662d);
        }
        Method method = f39656j;
        if (method != null) {
            try {
                Object invoke = method.invoke(th2, null);
                if (invoke instanceof Throwable[]) {
                    Throwable[] thArr = (Throwable[]) invoke;
                    if (thArr.length > 0) {
                        this.f39665g = new ThrowableProxy[thArr.length];
                        for (int i = 0; i < thArr.length; i++) {
                            this.f39665g[i] = new ThrowableProxy(thArr[i], set);
                            this.f39665g[i].f39663e = ThrowableProxyUtil.m51572a(thArr[i].getStackTrace(), this.f39662d);
                        }
                    }
                }
            } catch (IllegalAccessException | InvocationTargetException unused) {
            }
        }
    }
}
