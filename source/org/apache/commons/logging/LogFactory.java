package org.apache.commons.logging;

import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.io.UnsupportedEncodingException;
import java.net.URL;
import java.security.AccessController;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Properties;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* loaded from: classes6.dex */
public abstract class LogFactory {
    public static final String DIAGNOSTICS_DEST_PROPERTY = "org.apache.commons.logging.diagnostics.dest";
    public static final String FACTORY_DEFAULT = "org.apache.commons.logging.impl.LogFactoryImpl";
    public static final String FACTORY_PROPERTIES = "commons-logging.properties";
    public static final String FACTORY_PROPERTY = "org.apache.commons.logging.LogFactory";
    public static final String HASHTABLE_IMPLEMENTATION_PROPERTY = "org.apache.commons.logging.LogFactory.HashtableImpl";
    public static final String PRIORITY_KEY = "priority";
    protected static final String SERVICE_ID = "META-INF/services/org.apache.commons.logging.LogFactory";
    public static final String TCCL_KEY = "use_tccl";

    /* renamed from: a */
    public static PrintStream f73595a;

    /* renamed from: b */
    public static final String f73596b;

    /* renamed from: c */
    public static final ClassLoader f73597c;

    /* renamed from: d */
    public static /* synthetic */ Class f73598d;
    protected static Hashtable factories;
    protected static volatile LogFactory nullClassLoaderFactory;

    static {
        String str;
        Class cls = f73598d;
        if (cls == null) {
            cls = class$(FACTORY_PROPERTY);
            f73598d = cls;
        }
        ClassLoader classLoader = getClassLoader(cls);
        f73597c = classLoader;
        if (classLoader == null) {
            str = "BOOTLOADER";
        } else {
            try {
                str = objectId(classLoader);
            } catch (SecurityException unused) {
                str = "UNKNOWN";
            }
        }
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("[LogFactory from ");
        stringBuffer.append(str);
        stringBuffer.append("] ");
        f73596b = stringBuffer.toString();
        f73595a = m24858l();
        Class cls2 = f73598d;
        if (cls2 == null) {
            cls2 = class$(FACTORY_PROPERTY);
            f73598d = cls2;
        }
        m24857m(cls2);
        factories = m24867c();
        if (isDiagnosticsEnabled()) {
            logDiagnostic("BOOTSTRAP COMPLETED");
        }
    }

    /* renamed from: b */
    public static void m24868b(ClassLoader classLoader, LogFactory logFactory) {
        if (logFactory != null) {
            if (classLoader == null) {
                nullClassLoaderFactory = logFactory;
            } else {
                factories.put(classLoader, logFactory);
            }
        }
    }

    /* renamed from: c */
    public static final Hashtable m24867c() {
        String str;
        Hashtable hashtable = null;
        try {
            str = m24860j(HASHTABLE_IMPLEMENTATION_PROPERTY, null);
        } catch (SecurityException unused) {
            str = null;
        }
        if (str == null) {
            str = "org.apache.commons.logging.impl.WeakHashtable";
        }
        try {
            hashtable = (Hashtable) Class.forName(str).newInstance();
        } catch (Throwable th2) {
            handleThrowable(th2);
            if (!"org.apache.commons.logging.impl.WeakHashtable".equals(str)) {
                if (isDiagnosticsEnabled()) {
                    logDiagnostic("[ERROR] LogFactory: Load of custom hashtable failed");
                } else {
                    System.err.println("[ERROR] LogFactory: Load of custom hashtable failed");
                }
            }
        }
        if (hashtable == null) {
            return new Hashtable();
        }
        return hashtable;
    }

    public static /* synthetic */ Class class$(String str) {
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException e) {
            throw new NoClassDefFoundError(e.getMessage());
        }
    }

    public static Object createFactory(String str, ClassLoader classLoader) {
        Class<?> cls = null;
        try {
            if (classLoader != null) {
                try {
                    try {
                        cls = classLoader.loadClass(str);
                        Class cls2 = f73598d;
                        if (cls2 == null) {
                            cls2 = class$(FACTORY_PROPERTY);
                            f73598d = cls2;
                        }
                        if (cls2.isAssignableFrom(cls)) {
                            if (isDiagnosticsEnabled()) {
                                StringBuffer stringBuffer = new StringBuffer();
                                stringBuffer.append("Loaded class ");
                                stringBuffer.append(cls.getName());
                                stringBuffer.append(" from classloader ");
                                stringBuffer.append(objectId(classLoader));
                                logDiagnostic(stringBuffer.toString());
                            }
                        } else if (isDiagnosticsEnabled()) {
                            StringBuffer stringBuffer2 = new StringBuffer();
                            stringBuffer2.append("Factory class ");
                            stringBuffer2.append(cls.getName());
                            stringBuffer2.append(" loaded from classloader ");
                            stringBuffer2.append(objectId(cls.getClassLoader()));
                            stringBuffer2.append(" does not extend '");
                            Class cls3 = f73598d;
                            if (cls3 == null) {
                                cls3 = class$(FACTORY_PROPERTY);
                                f73598d = cls3;
                            }
                            stringBuffer2.append(cls3.getName());
                            stringBuffer2.append("' as loaded by this classloader.");
                            logDiagnostic(stringBuffer2.toString());
                            m24856n("[BAD CL TREE] ", classLoader);
                        }
                        return (LogFactory) cls.newInstance();
                    } catch (ClassCastException unused) {
                        if (classLoader == f73597c) {
                            boolean m24859k = m24859k(cls);
                            StringBuffer stringBuffer3 = new StringBuffer();
                            stringBuffer3.append("The application has specified that a custom LogFactory implementation ");
                            stringBuffer3.append("should be used but Class '");
                            stringBuffer3.append(str);
                            stringBuffer3.append("' cannot be converted to '");
                            Class cls4 = f73598d;
                            if (cls4 == null) {
                                cls4 = class$(FACTORY_PROPERTY);
                                f73598d = cls4;
                            }
                            stringBuffer3.append(cls4.getName());
                            stringBuffer3.append("'. ");
                            if (m24859k) {
                                stringBuffer3.append("The conflict is caused by the presence of multiple LogFactory classes ");
                                stringBuffer3.append("in incompatible classloaders. ");
                                stringBuffer3.append("Background can be found in http://commons.apache.org/logging/tech.html. ");
                                stringBuffer3.append("If you have not explicitly specified a custom LogFactory then it is likely ");
                                stringBuffer3.append("that the container has set one without your knowledge. ");
                                stringBuffer3.append("In this case, consider using the commons-logging-adapters.jar file or ");
                                stringBuffer3.append("specifying the standard LogFactory from the command line. ");
                            } else {
                                stringBuffer3.append("Please check the custom implementation. ");
                            }
                            stringBuffer3.append("Help can be found @http://commons.apache.org/logging/troubleshooting.html.");
                            if (isDiagnosticsEnabled()) {
                                logDiagnostic(stringBuffer3.toString());
                            }
                            throw new ClassCastException(stringBuffer3.toString());
                        }
                    } catch (ClassNotFoundException e) {
                        if (classLoader == f73597c) {
                            if (isDiagnosticsEnabled()) {
                                StringBuffer stringBuffer4 = new StringBuffer();
                                stringBuffer4.append("Unable to locate any class called '");
                                stringBuffer4.append(str);
                                stringBuffer4.append("' via classloader ");
                                stringBuffer4.append(objectId(classLoader));
                                logDiagnostic(stringBuffer4.toString());
                            }
                            throw e;
                        }
                    }
                } catch (NoClassDefFoundError e2) {
                    if (classLoader == f73597c) {
                        if (isDiagnosticsEnabled()) {
                            StringBuffer stringBuffer5 = new StringBuffer();
                            stringBuffer5.append("Class '");
                            stringBuffer5.append(str);
                            stringBuffer5.append("' cannot be loaded");
                            stringBuffer5.append(" via classloader ");
                            stringBuffer5.append(objectId(classLoader));
                            stringBuffer5.append(" - it depends on some other class that cannot be found.");
                            logDiagnostic(stringBuffer5.toString());
                        }
                        throw e2;
                    }
                }
            }
            if (isDiagnosticsEnabled()) {
                StringBuffer stringBuffer6 = new StringBuffer();
                stringBuffer6.append("Unable to load factory class via classloader ");
                stringBuffer6.append(objectId(classLoader));
                stringBuffer6.append(" - trying the classloader associated with this LogFactory.");
                logDiagnostic(stringBuffer6.toString());
            }
            return (LogFactory) Class.forName(str).newInstance();
        } catch (Exception e3) {
            if (isDiagnosticsEnabled()) {
                logDiagnostic("Unable to create LogFactory instance.");
            }
            if (cls != null) {
                Class cls5 = f73598d;
                if (cls5 == null) {
                    cls5 = class$(FACTORY_PROPERTY);
                    f73598d = cls5;
                }
                if (!cls5.isAssignableFrom(cls)) {
                    return new LogConfigurationException("The chosen LogFactory implementation does not extend LogFactory. Please check your configuration.", e3);
                }
            }
            return new LogConfigurationException(e3);
        }
    }

    /* renamed from: d */
    public static LogFactory m24866d(ClassLoader classLoader) {
        if (classLoader == null) {
            return nullClassLoaderFactory;
        }
        return (LogFactory) factories.get(classLoader);
    }

    public static ClassLoader directGetContextClassLoader() throws LogConfigurationException {
        try {
            return Thread.currentThread().getContextClassLoader();
        } catch (SecurityException unused) {
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x00f1  */
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.util.Properties m24865e(java.lang.ClassLoader r14, java.lang.String r15) {
        /*
            Method dump skipped, instructions count: 303
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.commons.logging.LogFactory.m24865e(java.lang.ClassLoader, java.lang.String):java.util.Properties");
    }

    /* renamed from: f */
    private static ClassLoader m24864f() {
        return (ClassLoader) AccessController.doPrivileged(new C17931Kk0());
    }

    /* renamed from: g */
    public static Properties m24863g(URL url) {
        return (Properties) AccessController.doPrivileged(new C18187Ok0(url));
    }

    public static ClassLoader getClassLoader(Class cls) {
        try {
            return cls.getClassLoader();
        } catch (SecurityException e) {
            if (isDiagnosticsEnabled()) {
                StringBuffer stringBuffer = new StringBuffer();
                stringBuffer.append("Unable to get classloader for class '");
                stringBuffer.append(cls);
                stringBuffer.append("' due to security restrictions - ");
                stringBuffer.append(e.getMessage());
                logDiagnostic(stringBuffer.toString());
            }
            throw e;
        }
    }

    public static ClassLoader getContextClassLoader() throws LogConfigurationException {
        return directGetContextClassLoader();
    }

    public static LogFactory getFactory() throws LogConfigurationException {
        ClassLoader classLoader;
        BufferedReader bufferedReader;
        String property;
        ClassLoader m24864f = m24864f();
        if (m24864f == null && isDiagnosticsEnabled()) {
            logDiagnostic("Context classloader is null.");
        }
        LogFactory m24866d = m24866d(m24864f);
        if (m24866d != null) {
            return m24866d;
        }
        if (isDiagnosticsEnabled()) {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("[LOOKUP] LogFactory implementation requested for the first time for context classloader ");
            stringBuffer.append(objectId(m24864f));
            logDiagnostic(stringBuffer.toString());
            m24856n("[LOOKUP] ", m24864f);
        }
        Properties m24865e = m24865e(m24864f, FACTORY_PROPERTIES);
        if (m24865e != null && (property = m24865e.getProperty(TCCL_KEY)) != null && !Boolean.valueOf(property).booleanValue()) {
            classLoader = f73597c;
        } else {
            classLoader = m24864f;
        }
        if (isDiagnosticsEnabled()) {
            logDiagnostic("[LOOKUP] Looking for system property [org.apache.commons.logging.LogFactory] to define the LogFactory subclass to use...");
        }
        try {
            String m24860j = m24860j(FACTORY_PROPERTY, null);
            if (m24860j != null) {
                if (isDiagnosticsEnabled()) {
                    StringBuffer stringBuffer2 = new StringBuffer();
                    stringBuffer2.append("[LOOKUP] Creating an instance of LogFactory class '");
                    stringBuffer2.append(m24860j);
                    stringBuffer2.append("' as specified by system property ");
                    stringBuffer2.append(FACTORY_PROPERTY);
                    logDiagnostic(stringBuffer2.toString());
                }
                m24866d = newFactory(m24860j, classLoader, m24864f);
            } else if (isDiagnosticsEnabled()) {
                logDiagnostic("[LOOKUP] No system property [org.apache.commons.logging.LogFactory] defined.");
            }
        } catch (SecurityException e) {
            if (isDiagnosticsEnabled()) {
                StringBuffer stringBuffer3 = new StringBuffer();
                stringBuffer3.append("[LOOKUP] A security exception occurred while trying to create an instance of the custom factory class: [");
                stringBuffer3.append(m24855o(e.getMessage()));
                stringBuffer3.append("]. Trying alternative implementations...");
                logDiagnostic(stringBuffer3.toString());
            }
        } catch (RuntimeException e2) {
            if (isDiagnosticsEnabled()) {
                StringBuffer stringBuffer4 = new StringBuffer();
                stringBuffer4.append("[LOOKUP] An exception occurred while trying to create an instance of the custom factory class: [");
                stringBuffer4.append(m24855o(e2.getMessage()));
                stringBuffer4.append("] as specified by a system property.");
                logDiagnostic(stringBuffer4.toString());
            }
            throw e2;
        }
        if (m24866d == null) {
            if (isDiagnosticsEnabled()) {
                logDiagnostic("[LOOKUP] Looking for a resource file of name [META-INF/services/org.apache.commons.logging.LogFactory] to define the LogFactory subclass to use...");
            }
            try {
                InputStream m24862h = m24862h(m24864f, SERVICE_ID);
                if (m24862h != null) {
                    try {
                        bufferedReader = new BufferedReader(new InputStreamReader(m24862h, "UTF-8"));
                    } catch (UnsupportedEncodingException unused) {
                        bufferedReader = new BufferedReader(new InputStreamReader(m24862h));
                    }
                    String readLine = bufferedReader.readLine();
                    bufferedReader.close();
                    if (readLine != null && !"".equals(readLine)) {
                        if (isDiagnosticsEnabled()) {
                            StringBuffer stringBuffer5 = new StringBuffer();
                            stringBuffer5.append("[LOOKUP]  Creating an instance of LogFactory class ");
                            stringBuffer5.append(readLine);
                            stringBuffer5.append(" as specified by file '");
                            stringBuffer5.append(SERVICE_ID);
                            stringBuffer5.append("' which was present in the path of the context classloader.");
                            logDiagnostic(stringBuffer5.toString());
                        }
                        m24866d = newFactory(readLine, classLoader, m24864f);
                    }
                } else if (isDiagnosticsEnabled()) {
                    logDiagnostic("[LOOKUP] No resource file with name 'META-INF/services/org.apache.commons.logging.LogFactory' found.");
                }
            } catch (Exception e3) {
                if (isDiagnosticsEnabled()) {
                    StringBuffer stringBuffer6 = new StringBuffer();
                    stringBuffer6.append("[LOOKUP] A security exception occurred while trying to create an instance of the custom factory class: [");
                    stringBuffer6.append(m24855o(e3.getMessage()));
                    stringBuffer6.append("]. Trying alternative implementations...");
                    logDiagnostic(stringBuffer6.toString());
                }
            }
        }
        if (m24866d == null) {
            if (m24865e != null) {
                if (isDiagnosticsEnabled()) {
                    logDiagnostic("[LOOKUP] Looking in properties file for entry with key 'org.apache.commons.logging.LogFactory' to define the LogFactory subclass to use...");
                }
                String property2 = m24865e.getProperty(FACTORY_PROPERTY);
                if (property2 != null) {
                    if (isDiagnosticsEnabled()) {
                        StringBuffer stringBuffer7 = new StringBuffer();
                        stringBuffer7.append("[LOOKUP] Properties file specifies LogFactory subclass '");
                        stringBuffer7.append(property2);
                        stringBuffer7.append(OperatorName.SHOW_TEXT_LINE);
                        logDiagnostic(stringBuffer7.toString());
                    }
                    m24866d = newFactory(property2, classLoader, m24864f);
                } else if (isDiagnosticsEnabled()) {
                    logDiagnostic("[LOOKUP] Properties file has no entry specifying LogFactory subclass.");
                }
            } else if (isDiagnosticsEnabled()) {
                logDiagnostic("[LOOKUP] No properties file available to determine LogFactory subclass from..");
            }
        }
        if (m24866d == null) {
            if (isDiagnosticsEnabled()) {
                logDiagnostic("[LOOKUP] Loading the default LogFactory implementation 'org.apache.commons.logging.impl.LogFactoryImpl' via the same classloader that loaded this LogFactory class (ie not looking in the context classloader).");
            }
            m24866d = newFactory(FACTORY_DEFAULT, f73597c, m24864f);
        }
        if (m24866d != null) {
            m24868b(m24864f, m24866d);
            if (m24865e != null) {
                Enumeration<?> propertyNames = m24865e.propertyNames();
                while (propertyNames.hasMoreElements()) {
                    String str = (String) propertyNames.nextElement();
                    m24866d.setAttribute(str, m24865e.getProperty(str));
                }
            }
        }
        return m24866d;
    }

    public static Log getLog(Class cls) throws LogConfigurationException {
        return getFactory().getInstance(cls);
    }

    /* renamed from: h */
    public static InputStream m24862h(ClassLoader classLoader, String str) {
        return (InputStream) AccessController.doPrivileged(new C18059Mk0(classLoader, str));
    }

    public static void handleThrowable(Throwable th2) {
        if (!(th2 instanceof ThreadDeath)) {
            if (!(th2 instanceof VirtualMachineError)) {
                return;
            }
            throw ((VirtualMachineError) th2);
        }
        throw ((ThreadDeath) th2);
    }

    /* renamed from: i */
    public static Enumeration m24861i(ClassLoader classLoader, String str) {
        return (Enumeration) AccessController.doPrivileged(new C18123Nk0(classLoader, str));
    }

    public static boolean isDiagnosticsEnabled() {
        if (f73595a != null) {
            return true;
        }
        return false;
    }

    /* renamed from: j */
    private static String m24860j(String str, String str2) {
        return (String) AccessController.doPrivileged(new C18251Pk0(str, str2));
    }

    /* renamed from: k */
    public static boolean m24859k(Class cls) {
        boolean z = false;
        if (cls != null) {
            try {
                ClassLoader classLoader = cls.getClassLoader();
                if (classLoader == null) {
                    logDiagnostic("[CUSTOM LOG FACTORY] was loaded by the boot classloader");
                } else {
                    m24856n("[CUSTOM LOG FACTORY] ", classLoader);
                    z = Class.forName(FACTORY_PROPERTY, false, classLoader).isAssignableFrom(cls);
                    if (z) {
                        StringBuffer stringBuffer = new StringBuffer();
                        stringBuffer.append("[CUSTOM LOG FACTORY] ");
                        stringBuffer.append(cls.getName());
                        stringBuffer.append(" implements LogFactory but was loaded by an incompatible classloader.");
                        logDiagnostic(stringBuffer.toString());
                    } else {
                        StringBuffer stringBuffer2 = new StringBuffer();
                        stringBuffer2.append("[CUSTOM LOG FACTORY] ");
                        stringBuffer2.append(cls.getName());
                        stringBuffer2.append(" does not implement LogFactory.");
                        logDiagnostic(stringBuffer2.toString());
                    }
                }
            } catch (ClassNotFoundException unused) {
                logDiagnostic("[CUSTOM LOG FACTORY] LogFactory class cannot be loaded by classloader which loaded the custom LogFactory implementation. Is the custom factory in the right classloader?");
            } catch (LinkageError e) {
                StringBuffer stringBuffer3 = new StringBuffer();
                stringBuffer3.append("[CUSTOM LOG FACTORY] LinkageError thrown whilst trying to determine whether the compatibility was caused by a classloader conflict: ");
                stringBuffer3.append(e.getMessage());
                logDiagnostic(stringBuffer3.toString());
            } catch (SecurityException e2) {
                StringBuffer stringBuffer4 = new StringBuffer();
                stringBuffer4.append("[CUSTOM LOG FACTORY] SecurityException thrown whilst trying to determine whether the compatibility was caused by a classloader conflict: ");
                stringBuffer4.append(e2.getMessage());
                logDiagnostic(stringBuffer4.toString());
            }
        }
        return z;
    }

    /* renamed from: l */
    public static PrintStream m24858l() {
        try {
            String m24860j = m24860j(DIAGNOSTICS_DEST_PROPERTY, null);
            if (m24860j == null) {
                return null;
            }
            if (m24860j.equals("STDOUT")) {
                return System.out;
            }
            if (m24860j.equals("STDERR")) {
                return System.err;
            }
            return new PrintStream(new FileOutputStream(m24860j, true));
        } catch (IOException | SecurityException unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void logDiagnostic(String str) {
        PrintStream printStream = f73595a;
        if (printStream != null) {
            printStream.print(f73596b);
            f73595a.println(str);
            f73595a.flush();
        }
    }

    public static final void logRawDiagnostic(String str) {
        PrintStream printStream = f73595a;
        if (printStream != null) {
            printStream.println(str);
            f73595a.flush();
        }
    }

    /* renamed from: m */
    public static void m24857m(Class cls) {
        if (!isDiagnosticsEnabled()) {
            return;
        }
        try {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("[ENV] Extension directories (java.ext.dir): ");
            stringBuffer.append(System.getProperty("java.ext.dir"));
            logDiagnostic(stringBuffer.toString());
            StringBuffer stringBuffer2 = new StringBuffer();
            stringBuffer2.append("[ENV] Application classpath (java.class.path): ");
            stringBuffer2.append(System.getProperty("java.class.path"));
            logDiagnostic(stringBuffer2.toString());
        } catch (SecurityException unused) {
            logDiagnostic("[ENV] Security setting prevent interrogation of system classpaths.");
        }
        String name = cls.getName();
        try {
            ClassLoader classLoader = getClassLoader(cls);
            StringBuffer stringBuffer3 = new StringBuffer();
            stringBuffer3.append("[ENV] Class ");
            stringBuffer3.append(name);
            stringBuffer3.append(" was loaded via classloader ");
            stringBuffer3.append(objectId(classLoader));
            logDiagnostic(stringBuffer3.toString());
            StringBuffer stringBuffer4 = new StringBuffer();
            stringBuffer4.append("[ENV] Ancestry of classloader which loaded ");
            stringBuffer4.append(name);
            stringBuffer4.append(" is ");
            m24856n(stringBuffer4.toString(), classLoader);
        } catch (SecurityException unused2) {
            StringBuffer stringBuffer5 = new StringBuffer();
            stringBuffer5.append("[ENV] Security forbids determining the classloader for ");
            stringBuffer5.append(name);
            logDiagnostic(stringBuffer5.toString());
        }
    }

    /* renamed from: n */
    public static void m24856n(String str, ClassLoader classLoader) {
        if (!isDiagnosticsEnabled()) {
            return;
        }
        if (classLoader != null) {
            String obj = classLoader.toString();
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append(str);
            stringBuffer.append(objectId(classLoader));
            stringBuffer.append(" == '");
            stringBuffer.append(obj);
            stringBuffer.append(OperatorName.SHOW_TEXT_LINE);
            logDiagnostic(stringBuffer.toString());
        }
        try {
            ClassLoader systemClassLoader = ClassLoader.getSystemClassLoader();
            if (classLoader != null) {
                StringBuffer stringBuffer2 = new StringBuffer();
                stringBuffer2.append(str);
                stringBuffer2.append("ClassLoader tree:");
                StringBuffer stringBuffer3 = new StringBuffer(stringBuffer2.toString());
                do {
                    stringBuffer3.append(objectId(classLoader));
                    if (classLoader == systemClassLoader) {
                        stringBuffer3.append(" (SYSTEM) ");
                    }
                    try {
                        classLoader = classLoader.getParent();
                        stringBuffer3.append(" --> ");
                    } catch (SecurityException unused) {
                        stringBuffer3.append(" --> SECRET");
                    }
                } while (classLoader != null);
                stringBuffer3.append("BOOT");
                logDiagnostic(stringBuffer3.toString());
            }
        } catch (SecurityException unused2) {
            StringBuffer stringBuffer4 = new StringBuffer();
            stringBuffer4.append(str);
            stringBuffer4.append("Security forbids determining the system classloader.");
            logDiagnostic(stringBuffer4.toString());
        }
    }

    public static LogFactory newFactory(String str, ClassLoader classLoader, ClassLoader classLoader2) throws LogConfigurationException {
        Object doPrivileged = AccessController.doPrivileged(new C17995Lk0(str, classLoader));
        if (doPrivileged instanceof LogConfigurationException) {
            LogConfigurationException logConfigurationException = (LogConfigurationException) doPrivileged;
            if (isDiagnosticsEnabled()) {
                StringBuffer stringBuffer = new StringBuffer();
                stringBuffer.append("An error occurred while loading the factory class:");
                stringBuffer.append(logConfigurationException.getMessage());
                logDiagnostic(stringBuffer.toString());
            }
            throw logConfigurationException;
        }
        if (isDiagnosticsEnabled()) {
            StringBuffer stringBuffer2 = new StringBuffer();
            stringBuffer2.append("Created object ");
            stringBuffer2.append(objectId(doPrivileged));
            stringBuffer2.append(" to manage classloader ");
            stringBuffer2.append(objectId(classLoader2));
            logDiagnostic(stringBuffer2.toString());
        }
        return (LogFactory) doPrivileged;
    }

    /* renamed from: o */
    public static String m24855o(String str) {
        if (str == null) {
            return null;
        }
        return str.trim();
    }

    public static String objectId(Object obj) {
        if (obj == null) {
            return AbstractJsonLexerKt.NULL;
        }
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(obj.getClass().getName());
        stringBuffer.append("@");
        stringBuffer.append(System.identityHashCode(obj));
        return stringBuffer.toString();
    }

    public static void release(ClassLoader classLoader) {
        if (isDiagnosticsEnabled()) {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("Releasing factory for classloader ");
            stringBuffer.append(objectId(classLoader));
            logDiagnostic(stringBuffer.toString());
        }
        Hashtable hashtable = factories;
        synchronized (hashtable) {
            try {
                if (classLoader == null) {
                    if (nullClassLoaderFactory != null) {
                        nullClassLoaderFactory.release();
                        nullClassLoaderFactory = null;
                    }
                } else {
                    LogFactory logFactory = (LogFactory) hashtable.get(classLoader);
                    if (logFactory != null) {
                        logFactory.release();
                        hashtable.remove(classLoader);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static void releaseAll() {
        if (isDiagnosticsEnabled()) {
            logDiagnostic("Releasing factory for all classloaders.");
        }
        Hashtable hashtable = factories;
        synchronized (hashtable) {
            try {
                Enumeration elements = hashtable.elements();
                while (elements.hasMoreElements()) {
                    ((LogFactory) elements.nextElement()).release();
                }
                hashtable.clear();
                if (nullClassLoaderFactory != null) {
                    nullClassLoaderFactory.release();
                    nullClassLoaderFactory = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public abstract Object getAttribute(String str);

    public abstract String[] getAttributeNames();

    public abstract Log getInstance(Class cls) throws LogConfigurationException;

    public abstract Log getInstance(String str) throws LogConfigurationException;

    public abstract void release();

    public abstract void removeAttribute(String str);

    public abstract void setAttribute(String str, Object obj);

    public static Log getLog(String str) throws LogConfigurationException {
        return getFactory().getInstance(str);
    }

    public static LogFactory newFactory(String str, ClassLoader classLoader) {
        return newFactory(str, classLoader, null);
    }
}
