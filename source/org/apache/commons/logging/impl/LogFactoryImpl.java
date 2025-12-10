package org.apache.commons.logging.impl;

import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.AccessController;
import java.util.Hashtable;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogConfigurationException;
import org.apache.commons.logging.LogFactory;

/* loaded from: classes6.dex */
public class LogFactoryImpl extends LogFactory {
    public static final String ALLOW_FLAWED_CONTEXT_PROPERTY = "org.apache.commons.logging.Log.allowFlawedContext";
    public static final String ALLOW_FLAWED_DISCOVERY_PROPERTY = "org.apache.commons.logging.Log.allowFlawedDiscovery";
    public static final String ALLOW_FLAWED_HIERARCHY_PROPERTY = "org.apache.commons.logging.Log.allowFlawedHierarchy";
    public static final String LOG_PROPERTY = "org.apache.commons.logging.Log";
    protected static final String LOG_PROPERTY_OLD = "org.apache.commons.logging.log";

    /* renamed from: k */
    public static final int f73602k = 32;

    /* renamed from: l */
    public static final String[] f73603l = {"org.apache.commons.logging.impl.Log4JLogger", "org.apache.commons.logging.impl.Jdk14Logger", "org.apache.commons.logging.impl.Jdk13LumberjackLogger", "org.apache.commons.logging.impl.SimpleLog"};

    /* renamed from: m */
    public static /* synthetic */ Class f73604m;

    /* renamed from: n */
    public static /* synthetic */ Class f73605n;

    /* renamed from: o */
    public static /* synthetic */ Class f73606o;

    /* renamed from: p */
    public static /* synthetic */ Class f73607p;

    /* renamed from: f */
    public String f73609f;

    /* renamed from: g */
    public String f73610g;

    /* renamed from: h */
    public boolean f73611h;

    /* renamed from: i */
    public boolean f73612i;

    /* renamed from: j */
    public boolean f73613j;
    protected Class[] logConstructorSignature;
    protected Method logMethod;
    protected Class[] logMethodSignature;

    /* renamed from: e */
    public boolean f73608e = true;
    protected Hashtable attributes = new Hashtable();
    protected Hashtable instances = new Hashtable();
    protected Constructor logConstructor = null;

    public LogFactoryImpl() {
        Class cls = f73604m;
        if (cls == null) {
            cls = class$("java.lang.String");
            f73604m = cls;
        }
        this.logConstructorSignature = new Class[]{cls};
        this.logMethod = null;
        Class cls2 = f73605n;
        if (cls2 == null) {
            cls2 = class$(LogFactory.FACTORY_PROPERTY);
            f73605n = cls2;
        }
        this.logMethodSignature = new Class[]{cls2};
        m24852C();
        if (isDiagnosticsEnabled()) {
            logDiagnostic("Instance created.");
        }
    }

    public static /* synthetic */ Class class$(String str) {
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException e) {
            throw new NoClassDefFoundError(e.getMessage());
        }
    }

    /* renamed from: f */
    public static ClassLoader m24850f() {
        return (ClassLoader) AccessController.doPrivileged(new C18315Qk0());
    }

    public static ClassLoader getClassLoader(Class cls) {
        return LogFactory.getClassLoader(cls);
    }

    public static ClassLoader getContextClassLoader() throws LogConfigurationException {
        return LogFactory.getContextClassLoader();
    }

    public static boolean isDiagnosticsEnabled() {
        return LogFactory.isDiagnosticsEnabled();
    }

    /* renamed from: j */
    public static String m24849j(String str, String str2) {
        return (String) AccessController.doPrivileged(new C18379Rk0(str, str2));
    }

    /* renamed from: A */
    public final void m24854A(StringBuffer stringBuffer, String str, String str2) {
        if (!str.equals(str2) && str.regionMatches(true, 0, str2, 0, f73602k + 5)) {
            stringBuffer.append(" Did you mean '");
            stringBuffer.append(str2);
            stringBuffer.append("'?");
        }
    }

    /* renamed from: B */
    public final void m24853B() {
        this.f73611h = m24843u(ALLOW_FLAWED_CONTEXT_PROPERTY, true);
        this.f73612i = m24843u(ALLOW_FLAWED_DISCOVERY_PROPERTY, true);
        this.f73613j = m24843u(ALLOW_FLAWED_HIERARCHY_PROPERTY, true);
    }

    /* renamed from: C */
    public final void m24852C() {
        String str;
        ClassLoader classLoader = getClassLoader(getClass());
        if (classLoader == null) {
            str = "BOOTLOADER";
        } else {
            try {
                str = LogFactory.objectId(classLoader);
            } catch (SecurityException unused) {
                str = "UNKNOWN";
            }
        }
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("[LogFactoryImpl@");
        stringBuffer.append(System.identityHashCode(this));
        stringBuffer.append(" from ");
        stringBuffer.append(str);
        stringBuffer.append("] ");
        this.f73609f = stringBuffer.toString();
    }

    /* renamed from: D */
    public final boolean m24851D(String str, String str2) {
        if (isDiagnosticsEnabled()) {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("Checking for '");
            stringBuffer.append(str);
            stringBuffer.append("'.");
            logDiagnostic(stringBuffer.toString());
        }
        try {
            if (m24847q(str2, getClass().getName(), false) == null) {
                if (isDiagnosticsEnabled()) {
                    StringBuffer stringBuffer2 = new StringBuffer();
                    stringBuffer2.append("Did not find '");
                    stringBuffer2.append(str);
                    stringBuffer2.append("'.");
                    logDiagnostic(stringBuffer2.toString());
                }
                return false;
            } else if (isDiagnosticsEnabled()) {
                StringBuffer stringBuffer3 = new StringBuffer();
                stringBuffer3.append("Found '");
                stringBuffer3.append(str);
                stringBuffer3.append("'.");
                logDiagnostic(stringBuffer3.toString());
                return true;
            } else {
                return true;
            }
        } catch (LogConfigurationException unused) {
            if (isDiagnosticsEnabled()) {
                StringBuffer stringBuffer4 = new StringBuffer();
                stringBuffer4.append("Logging system '");
                stringBuffer4.append(str);
                stringBuffer4.append("' is available but not useable.");
                logDiagnostic(stringBuffer4.toString());
            }
            return false;
        }
    }

    @Override // org.apache.commons.logging.LogFactory
    public Object getAttribute(String str) {
        return this.attributes.get(str);
    }

    @Override // org.apache.commons.logging.LogFactory
    public String[] getAttributeNames() {
        return (String[]) this.attributes.keySet().toArray(new String[this.attributes.size()]);
    }

    @Override // org.apache.commons.logging.LogFactory
    public Log getInstance(Class cls) throws LogConfigurationException {
        return getInstance(cls.getName());
    }

    public String getLogClassName() {
        if (this.f73610g == null) {
            m24846r(getClass().getName());
        }
        return this.f73610g;
    }

    public Constructor getLogConstructor() throws LogConfigurationException {
        if (this.logConstructor == null) {
            m24846r(getClass().getName());
        }
        return this.logConstructor;
    }

    public boolean isJdk13LumberjackAvailable() {
        return m24851D("Jdk13Lumberjack", "org.apache.commons.logging.impl.Jdk13LumberjackLogger");
    }

    public boolean isJdk14Available() {
        return m24851D("Jdk14", "org.apache.commons.logging.impl.Jdk14Logger");
    }

    public boolean isLog4JAvailable() {
        return m24851D("Log4J", "org.apache.commons.logging.impl.Log4JLogger");
    }

    public void logDiagnostic(String str) {
        if (isDiagnosticsEnabled()) {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append(this.f73609f);
            stringBuffer.append(str);
            LogFactory.logRawDiagnostic(stringBuffer.toString());
        }
    }

    public Log newInstance(String str) throws LogConfigurationException {
        Log log;
        try {
            Constructor constructor = this.logConstructor;
            if (constructor == null) {
                log = m24846r(str);
            } else {
                log = (Log) constructor.newInstance(str);
            }
            Method method = this.logMethod;
            if (method != null) {
                method.invoke(log, this);
            }
            return log;
        } catch (InvocationTargetException e) {
            e = e;
            Throwable targetException = e.getTargetException();
            if (targetException != null) {
                e = targetException;
            }
            throw new LogConfigurationException(e);
        } catch (LogConfigurationException e2) {
            throw e2;
        } catch (Throwable th2) {
            LogFactory.handleThrowable(th2);
            throw new LogConfigurationException(th2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x0164 A[LOOP:0: B:6:0x0037->B:49:0x0164, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01c7 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0159 A[EDGE_INSN: B:72:0x0159->B:45:0x0159 ?: BREAK  , SYNTHETIC] */
    /* renamed from: q */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final org.apache.commons.logging.Log m24847q(java.lang.String r17, java.lang.String r18, boolean r19) {
        /*
            Method dump skipped, instructions count: 581
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.commons.logging.impl.LogFactoryImpl.m24847q(java.lang.String, java.lang.String, boolean):org.apache.commons.logging.Log");
    }

    /* renamed from: r */
    public final Log m24846r(String str) {
        if (isDiagnosticsEnabled()) {
            logDiagnostic("Discovering a Log implementation...");
        }
        m24853B();
        String m24845s = m24845s();
        if (m24845s != null) {
            if (isDiagnosticsEnabled()) {
                StringBuffer stringBuffer = new StringBuffer();
                stringBuffer.append("Attempting to load user-specified log class '");
                stringBuffer.append(m24845s);
                stringBuffer.append("'...");
                logDiagnostic(stringBuffer.toString());
            }
            Log m24847q = m24847q(m24845s, str, true);
            if (m24847q != null) {
                return m24847q;
            }
            StringBuffer stringBuffer2 = new StringBuffer("User-specified log class '");
            stringBuffer2.append(m24845s);
            stringBuffer2.append("' cannot be found or is not useable.");
            m24854A(stringBuffer2, m24845s, "org.apache.commons.logging.impl.Log4JLogger");
            m24854A(stringBuffer2, m24845s, "org.apache.commons.logging.impl.Jdk14Logger");
            m24854A(stringBuffer2, m24845s, "org.apache.commons.logging.impl.Jdk13LumberjackLogger");
            m24854A(stringBuffer2, m24845s, "org.apache.commons.logging.impl.SimpleLog");
            throw new LogConfigurationException(stringBuffer2.toString());
        }
        if (isDiagnosticsEnabled()) {
            logDiagnostic("No user-specified Log implementation; performing discovery using the standard supported logging implementations...");
        }
        Log log = null;
        int i = 0;
        while (true) {
            String[] strArr = f73603l;
            if (i >= strArr.length || log != null) {
                break;
            }
            log = m24847q(strArr[i], str, true);
            i++;
        }
        if (log != null) {
            return log;
        }
        throw new LogConfigurationException("No suitable Log implementation");
    }

    @Override // org.apache.commons.logging.LogFactory
    public void release() {
        logDiagnostic("Releasing all known loggers");
        this.instances.clear();
    }

    @Override // org.apache.commons.logging.LogFactory
    public void removeAttribute(String str) {
        this.attributes.remove(str);
    }

    /* renamed from: s */
    public final String m24845s() {
        if (isDiagnosticsEnabled()) {
            logDiagnostic("Trying to get log class from attribute 'org.apache.commons.logging.Log'");
        }
        String str = (String) getAttribute(LOG_PROPERTY);
        if (str == null) {
            if (isDiagnosticsEnabled()) {
                logDiagnostic("Trying to get log class from attribute 'org.apache.commons.logging.log'");
            }
            str = (String) getAttribute(LOG_PROPERTY_OLD);
        }
        if (str == null) {
            if (isDiagnosticsEnabled()) {
                logDiagnostic("Trying to get log class from system property 'org.apache.commons.logging.Log'");
            }
            try {
                str = m24849j(LOG_PROPERTY, null);
            } catch (SecurityException e) {
                if (isDiagnosticsEnabled()) {
                    StringBuffer stringBuffer = new StringBuffer();
                    stringBuffer.append("No access allowed to system property 'org.apache.commons.logging.Log' - ");
                    stringBuffer.append(e.getMessage());
                    logDiagnostic(stringBuffer.toString());
                }
            }
        }
        if (str == null) {
            if (isDiagnosticsEnabled()) {
                logDiagnostic("Trying to get log class from system property 'org.apache.commons.logging.log'");
            }
            try {
                str = m24849j(LOG_PROPERTY_OLD, null);
            } catch (SecurityException e2) {
                if (isDiagnosticsEnabled()) {
                    StringBuffer stringBuffer2 = new StringBuffer();
                    stringBuffer2.append("No access allowed to system property 'org.apache.commons.logging.log' - ");
                    stringBuffer2.append(e2.getMessage());
                    logDiagnostic(stringBuffer2.toString());
                }
            }
        }
        if (str != null) {
            return str.trim();
        }
        return str;
    }

    @Override // org.apache.commons.logging.LogFactory
    public void setAttribute(String str, Object obj) {
        boolean z;
        if (this.logConstructor != null) {
            logDiagnostic("setAttribute: call too late; configuration already performed.");
        }
        if (obj == null) {
            this.attributes.remove(str);
        } else {
            this.attributes.put(str, obj);
        }
        if (str.equals(LogFactory.TCCL_KEY)) {
            if (obj != null && Boolean.valueOf(obj.toString()).booleanValue()) {
                z = true;
            } else {
                z = false;
            }
            this.f73608e = z;
        }
    }

    /* renamed from: t */
    public final ClassLoader m24844t() {
        Class cls = f73606o;
        if (cls == null) {
            cls = class$(LogFactory.FACTORY_DEFAULT);
            f73606o = cls;
        }
        ClassLoader classLoader = getClassLoader(cls);
        if (!this.f73608e) {
            return classLoader;
        }
        ClassLoader m24850f = m24850f();
        ClassLoader m24841w = m24841w(m24850f, classLoader);
        if (m24841w == null) {
            if (this.f73611h) {
                if (isDiagnosticsEnabled()) {
                    logDiagnostic("[WARNING] the context classloader is not part of a parent-child relationship with the classloader that loaded LogFactoryImpl.");
                }
                return m24850f;
            }
            throw new LogConfigurationException("Bad classloader hierarchy; LogFactoryImpl was loaded via a classloader that is not related to the current context classloader.");
        }
        if (m24841w != m24850f) {
            if (this.f73611h) {
                if (isDiagnosticsEnabled()) {
                    logDiagnostic("Warning: the context classloader is an ancestor of the classloader that loaded LogFactoryImpl; it should be the same or a descendant. The application using commons-logging should ensure the context classloader is used correctly.");
                }
            } else {
                throw new LogConfigurationException("Bad classloader hierarchy; LogFactoryImpl was loaded via a classloader that is not related to the current context classloader.");
            }
        }
        return m24841w;
    }

    /* renamed from: u */
    public final boolean m24843u(String str, boolean z) {
        String m24842v = m24842v(str);
        if (m24842v == null) {
            return z;
        }
        return Boolean.valueOf(m24842v).booleanValue();
    }

    /* renamed from: v */
    public final String m24842v(String str) {
        String m24849j;
        if (isDiagnosticsEnabled()) {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("[ENV] Trying to get configuration for item ");
            stringBuffer.append(str);
            logDiagnostic(stringBuffer.toString());
        }
        Object attribute = getAttribute(str);
        if (attribute != null) {
            if (isDiagnosticsEnabled()) {
                StringBuffer stringBuffer2 = new StringBuffer();
                stringBuffer2.append("[ENV] Found LogFactory attribute [");
                stringBuffer2.append(attribute);
                stringBuffer2.append("] for ");
                stringBuffer2.append(str);
                logDiagnostic(stringBuffer2.toString());
            }
            return attribute.toString();
        }
        if (isDiagnosticsEnabled()) {
            StringBuffer stringBuffer3 = new StringBuffer();
            stringBuffer3.append("[ENV] No LogFactory attribute found for ");
            stringBuffer3.append(str);
            logDiagnostic(stringBuffer3.toString());
        }
        try {
            m24849j = m24849j(str, null);
        } catch (SecurityException unused) {
            if (isDiagnosticsEnabled()) {
                StringBuffer stringBuffer4 = new StringBuffer();
                stringBuffer4.append("[ENV] Security prevented reading system property ");
                stringBuffer4.append(str);
                logDiagnostic(stringBuffer4.toString());
            }
        }
        if (m24849j != null) {
            if (isDiagnosticsEnabled()) {
                StringBuffer stringBuffer5 = new StringBuffer();
                stringBuffer5.append("[ENV] Found system property [");
                stringBuffer5.append(m24849j);
                stringBuffer5.append("] for ");
                stringBuffer5.append(str);
                logDiagnostic(stringBuffer5.toString());
            }
            return m24849j;
        }
        if (isDiagnosticsEnabled()) {
            StringBuffer stringBuffer6 = new StringBuffer();
            stringBuffer6.append("[ENV] No system property found for property ");
            stringBuffer6.append(str);
            logDiagnostic(stringBuffer6.toString());
        }
        if (isDiagnosticsEnabled()) {
            StringBuffer stringBuffer7 = new StringBuffer();
            stringBuffer7.append("[ENV] No configuration defined for item ");
            stringBuffer7.append(str);
            logDiagnostic(stringBuffer7.toString());
        }
        return null;
    }

    /* renamed from: w */
    public final ClassLoader m24841w(ClassLoader classLoader, ClassLoader classLoader2) {
        if (classLoader == null) {
            return classLoader2;
        }
        if (classLoader2 == null) {
            return classLoader;
        }
        ClassLoader classLoader3 = classLoader;
        while (classLoader3 != null) {
            if (classLoader3 == classLoader2) {
                return classLoader;
            }
            classLoader3 = m24840x(classLoader3);
        }
        ClassLoader classLoader4 = classLoader2;
        while (classLoader4 != null) {
            if (classLoader4 == classLoader) {
                return classLoader2;
            }
            classLoader4 = m24840x(classLoader4);
        }
        return null;
    }

    /* renamed from: x */
    public final ClassLoader m24840x(ClassLoader classLoader) {
        try {
            return (ClassLoader) AccessController.doPrivileged(new C18443Sk0(this, classLoader));
        } catch (SecurityException unused) {
            logDiagnostic("[SECURITY] Unable to obtain parent classloader");
            return null;
        }
    }

    /* renamed from: y */
    public final void m24839y(String str, ClassLoader classLoader, Throwable th2) {
        Throwable targetException;
        Throwable exception;
        if (isDiagnosticsEnabled()) {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("Could not instantiate Log '");
            stringBuffer.append(str);
            stringBuffer.append("' -- ");
            stringBuffer.append(th2.getClass().getName());
            stringBuffer.append(": ");
            stringBuffer.append(th2.getLocalizedMessage());
            logDiagnostic(stringBuffer.toString());
            if ((th2 instanceof InvocationTargetException) && (targetException = ((InvocationTargetException) th2).getTargetException()) != null) {
                StringBuffer stringBuffer2 = new StringBuffer();
                stringBuffer2.append("... InvocationTargetException: ");
                stringBuffer2.append(targetException.getClass().getName());
                stringBuffer2.append(": ");
                stringBuffer2.append(targetException.getLocalizedMessage());
                logDiagnostic(stringBuffer2.toString());
                if ((targetException instanceof ExceptionInInitializerError) && (exception = ((ExceptionInInitializerError) targetException).getException()) != null) {
                    StringWriter stringWriter = new StringWriter();
                    exception.printStackTrace(new PrintWriter((Writer) stringWriter, true));
                    StringBuffer stringBuffer3 = new StringBuffer();
                    stringBuffer3.append("... ExceptionInInitializerError: ");
                    stringBuffer3.append(stringWriter.toString());
                    logDiagnostic(stringBuffer3.toString());
                }
            }
        }
        if (this.f73612i) {
            return;
        }
        throw new LogConfigurationException(th2);
    }

    /* renamed from: z */
    public final void m24838z(ClassLoader classLoader, Class cls) {
        Class cls2 = f73607p;
        if (cls2 == null) {
            cls2 = class$(LOG_PROPERTY);
            f73607p = cls2;
        }
        String name = cls2.getName();
        for (Class<?> cls3 : cls.getInterfaces()) {
            if (name.equals(cls3.getName())) {
                if (isDiagnosticsEnabled()) {
                    try {
                        Class cls4 = f73607p;
                        if (cls4 == null) {
                            cls4 = class$(LOG_PROPERTY);
                            f73607p = cls4;
                        }
                        ClassLoader classLoader2 = getClassLoader(cls4);
                        StringBuffer stringBuffer = new StringBuffer();
                        stringBuffer.append("Class '");
                        stringBuffer.append(cls.getName());
                        stringBuffer.append("' was found in classloader ");
                        stringBuffer.append(LogFactory.objectId(classLoader));
                        stringBuffer.append(". It is bound to a Log interface which is not");
                        stringBuffer.append(" the one loaded from classloader ");
                        stringBuffer.append(LogFactory.objectId(classLoader2));
                        logDiagnostic(stringBuffer.toString());
                    } catch (Throwable th2) {
                        LogFactory.handleThrowable(th2);
                        StringBuffer stringBuffer2 = new StringBuffer();
                        stringBuffer2.append("Error while trying to output diagnostics about bad class '");
                        stringBuffer2.append(cls);
                        stringBuffer2.append(OperatorName.SHOW_TEXT_LINE);
                        logDiagnostic(stringBuffer2.toString());
                    }
                }
                if (!this.f73613j) {
                    StringBuffer stringBuffer3 = new StringBuffer();
                    stringBuffer3.append("Terminating logging for this context ");
                    stringBuffer3.append("due to bad log hierarchy. ");
                    stringBuffer3.append("You have more than one version of '");
                    Class cls5 = f73607p;
                    if (cls5 == null) {
                        cls5 = class$(LOG_PROPERTY);
                        f73607p = cls5;
                    }
                    stringBuffer3.append(cls5.getName());
                    stringBuffer3.append("' visible.");
                    if (isDiagnosticsEnabled()) {
                        logDiagnostic(stringBuffer3.toString());
                    }
                    throw new LogConfigurationException(stringBuffer3.toString());
                } else if (isDiagnosticsEnabled()) {
                    StringBuffer stringBuffer4 = new StringBuffer();
                    stringBuffer4.append("Warning: bad log hierarchy. ");
                    stringBuffer4.append("You have more than one version of '");
                    Class cls6 = f73607p;
                    if (cls6 == null) {
                        cls6 = class$(LOG_PROPERTY);
                        f73607p = cls6;
                    }
                    stringBuffer4.append(cls6.getName());
                    stringBuffer4.append("' visible.");
                    logDiagnostic(stringBuffer4.toString());
                    return;
                } else {
                    return;
                }
            }
        }
        if (!this.f73612i) {
            StringBuffer stringBuffer5 = new StringBuffer();
            stringBuffer5.append("Terminating logging for this context. ");
            stringBuffer5.append("Log class '");
            stringBuffer5.append(cls.getName());
            stringBuffer5.append("' does not implement the Log interface.");
            if (isDiagnosticsEnabled()) {
                logDiagnostic(stringBuffer5.toString());
            }
            throw new LogConfigurationException(stringBuffer5.toString());
        } else if (isDiagnosticsEnabled()) {
            StringBuffer stringBuffer6 = new StringBuffer();
            stringBuffer6.append("[WARNING] Log class '");
            stringBuffer6.append(cls.getName());
            stringBuffer6.append("' does not implement the Log interface.");
            logDiagnostic(stringBuffer6.toString());
        }
    }

    @Override // org.apache.commons.logging.LogFactory
    public Log getInstance(String str) throws LogConfigurationException {
        Log log = (Log) this.instances.get(str);
        if (log == null) {
            Log newInstance = newInstance(str);
            this.instances.put(str, newInstance);
            return newInstance;
        }
        return log;
    }
}
