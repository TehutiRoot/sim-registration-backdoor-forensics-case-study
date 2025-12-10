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
    public static final Method f39654j;

    /* renamed from: k */
    public static final ThrowableProxy[] f39655k;

    /* renamed from: l */
    public static final StackTraceElementProxy[] f39656l;

    /* renamed from: a */
    public Throwable f39657a;

    /* renamed from: b */
    public String f39658b;

    /* renamed from: c */
    public String f39659c;

    /* renamed from: d */
    public StackTraceElementProxy[] f39660d;

    /* renamed from: e */
    public int f39661e;

    /* renamed from: f */
    public ThrowableProxy f39662f;

    /* renamed from: g */
    public ThrowableProxy[] f39663g;

    /* renamed from: h */
    public transient PackagingDataCalculator f39664h;

    /* renamed from: i */
    public boolean f39665i;

    static {
        Method method = null;
        try {
            method = Throwable.class.getMethod("getSuppressed", null);
        } catch (NoSuchMethodException unused) {
        }
        f39654j = method;
        f39655k = new ThrowableProxy[0];
        f39656l = new StackTraceElementProxy[0];
    }

    public ThrowableProxy(Throwable th2) {
        this(th2, Collections.newSetFromMap(new IdentityHashMap(1)));
    }

    public void calculatePackagingData() {
        PackagingDataCalculator packagingDataCalculator;
        if (this.f39665i || (packagingDataCalculator = getPackagingDataCalculator()) == null) {
            return;
        }
        this.f39665i = true;
        packagingDataCalculator.calculate(this);
    }

    public void fullDump() {
        StackTraceElementProxy[] stackTraceElementProxyArr;
        StringBuilder sb = new StringBuilder();
        for (StackTraceElementProxy stackTraceElementProxy : this.f39660d) {
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
        return this.f39662f;
    }

    @Override // ch.qos.logback.classic.spi.IThrowableProxy
    public String getClassName() {
        return this.f39658b;
    }

    @Override // ch.qos.logback.classic.spi.IThrowableProxy
    public int getCommonFrames() {
        return this.f39661e;
    }

    @Override // ch.qos.logback.classic.spi.IThrowableProxy
    public String getMessage() {
        return this.f39659c;
    }

    public PackagingDataCalculator getPackagingDataCalculator() {
        if (this.f39657a != null && this.f39664h == null) {
            this.f39664h = new PackagingDataCalculator();
        }
        return this.f39664h;
    }

    @Override // ch.qos.logback.classic.spi.IThrowableProxy
    public StackTraceElementProxy[] getStackTraceElementProxyArray() {
        return this.f39660d;
    }

    @Override // ch.qos.logback.classic.spi.IThrowableProxy
    public IThrowableProxy[] getSuppressed() {
        return this.f39663g;
    }

    public Throwable getThrowable() {
        return this.f39657a;
    }

    public ThrowableProxy(Throwable th2, Set set) {
        this.f39663g = f39655k;
        this.f39665i = false;
        this.f39657a = th2;
        this.f39658b = th2.getClass().getName();
        this.f39659c = th2.getMessage();
        this.f39660d = ThrowableProxyUtil.m51565c(th2.getStackTrace());
        if (set.contains(th2)) {
            this.f39658b = "CIRCULAR REFERENCE:" + th2.getClass().getName();
            this.f39660d = f39656l;
            return;
        }
        set.add(th2);
        Throwable cause = th2.getCause();
        if (cause != null) {
            ThrowableProxy throwableProxy = new ThrowableProxy(cause, set);
            this.f39662f = throwableProxy;
            throwableProxy.f39661e = ThrowableProxyUtil.m51567a(cause.getStackTrace(), this.f39660d);
        }
        Method method = f39654j;
        if (method != null) {
            try {
                Object invoke = method.invoke(th2, null);
                if (invoke instanceof Throwable[]) {
                    Throwable[] thArr = (Throwable[]) invoke;
                    if (thArr.length > 0) {
                        this.f39663g = new ThrowableProxy[thArr.length];
                        for (int i = 0; i < thArr.length; i++) {
                            this.f39663g[i] = new ThrowableProxy(thArr[i], set);
                            this.f39663g[i].f39661e = ThrowableProxyUtil.m51567a(thArr[i].getStackTrace(), this.f39660d);
                        }
                    }
                }
            } catch (IllegalAccessException | InvocationTargetException unused) {
            }
        }
    }
}