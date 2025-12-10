package androidx.multidex;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Build;
import android.util.Log;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import dalvik.system.BaseDexClassLoader;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.StringTokenizer;

/* loaded from: classes2.dex */
public final class MultiDex {

    /* renamed from: a */
    public static final Set f36157a = new HashSet();

    /* renamed from: b */
    public static final boolean f36158b = m53926m(System.getProperty("java.vm.version"));

    /* renamed from: androidx.multidex.MultiDex$a */
    /* loaded from: classes2.dex */
    public static final class C4801a {
        /* renamed from: a */
        public static void m53924a(ClassLoader classLoader, List list, File file) {
            IOException[] iOExceptionArr;
            Object obj = MultiDex.m53932g(classLoader, "pathList").get(classLoader);
            ArrayList arrayList = new ArrayList();
            MultiDex.m53933f(obj, "dexElements", m53923b(obj, new ArrayList(list), file, arrayList));
            if (arrayList.size() > 0) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    Log.w("MultiDex", "Exception in makeDexElement", (IOException) it.next());
                }
                Field m53932g = MultiDex.m53932g(obj, "dexElementsSuppressedExceptions");
                IOException[] iOExceptionArr2 = (IOException[]) m53932g.get(obj);
                if (iOExceptionArr2 == null) {
                    iOExceptionArr = (IOException[]) arrayList.toArray(new IOException[arrayList.size()]);
                } else {
                    IOException[] iOExceptionArr3 = new IOException[arrayList.size() + iOExceptionArr2.length];
                    arrayList.toArray(iOExceptionArr3);
                    System.arraycopy(iOExceptionArr2, 0, iOExceptionArr3, arrayList.size(), iOExceptionArr2.length);
                    iOExceptionArr = iOExceptionArr3;
                }
                m53932g.set(obj, iOExceptionArr);
                IOException iOException = new IOException("I/O exception during makeDexElement");
                iOException.initCause((Throwable) arrayList.get(0));
                throw iOException;
            }
        }

        /* renamed from: b */
        public static Object[] m53923b(Object obj, ArrayList arrayList, File file, ArrayList arrayList2) {
            return (Object[]) MultiDex.m53931h(obj, "makeDexElements", ArrayList.class, File.class, ArrayList.class).invoke(obj, arrayList, file, arrayList2);
        }
    }

    /* renamed from: d */
    public static void m53935d(Context context) {
        File file = new File(context.getFilesDir(), "secondary-dexes");
        if (file.isDirectory()) {
            StringBuilder sb = new StringBuilder();
            sb.append("Clearing old secondary dex dir (");
            sb.append(file.getPath());
            sb.append(").");
            File[] listFiles = file.listFiles();
            if (listFiles == null) {
                Log.w("MultiDex", "Failed to list secondary dex dir content (" + file.getPath() + ").");
                return;
            }
            for (File file2 : listFiles) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Trying to delete old file ");
                sb2.append(file2.getPath());
                sb2.append(" of size ");
                sb2.append(file2.length());
                if (!file2.delete()) {
                    Log.w("MultiDex", "Failed to delete old file " + file2.getPath());
                } else {
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append("Deleted old file ");
                    sb3.append(file2.getPath());
                }
            }
            if (!file.delete()) {
                Log.w("MultiDex", "Failed to delete secondary dex dir " + file.getPath());
                return;
            }
            StringBuilder sb4 = new StringBuilder();
            sb4.append("Deleted old secondary dex dir ");
            sb4.append(file.getPath());
        }
    }

    /* renamed from: e */
    public static void m53934e(Context context, File file, File file2, String str, String str2, boolean z) {
        Set set = f36157a;
        synchronized (set) {
            try {
                if (set.contains(file)) {
                    return;
                }
                set.add(file);
                int i = Build.VERSION.SDK_INT;
                Log.w("MultiDex", "MultiDex is not guaranteed to work in SDK version " + i + ": SDK version higher than 20 should be backed by runtime with built-in multidex capabilty but it's not the case here: java.vm.version=\"" + System.getProperty("java.vm.version") + OperatorName.SHOW_TEXT_LINE_AND_SPACE);
                ClassLoader m53929j = m53929j(context);
                if (m53929j == null) {
                    return;
                }
                m53935d(context);
                File m53928k = m53928k(context, file2, str);
                MultiDexExtractor multiDexExtractor = new MultiDexExtractor(file, m53928k);
                try {
                    m53927l(m53929j, m53928k, multiDexExtractor.m53915m(context, str2, false));
                } catch (IOException e) {
                    if (z) {
                        Log.w("MultiDex", "Failed to install extracted secondary dex files, retrying with forced extraction", e);
                        m53927l(m53929j, m53928k, multiDexExtractor.m53915m(context, str2, true));
                    } else {
                        throw e;
                    }
                }
                try {
                    multiDexExtractor.close();
                    e = null;
                } catch (IOException e2) {
                    e = e2;
                }
                if (e == null) {
                    return;
                }
                throw e;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: f */
    public static void m53933f(Object obj, String str, Object[] objArr) {
        Field m53932g = m53932g(obj, str);
        Object[] objArr2 = (Object[]) m53932g.get(obj);
        Object[] objArr3 = (Object[]) Array.newInstance(objArr2.getClass().getComponentType(), objArr2.length + objArr.length);
        System.arraycopy(objArr2, 0, objArr3, 0, objArr2.length);
        System.arraycopy(objArr, 0, objArr3, objArr2.length, objArr.length);
        m53932g.set(obj, objArr3);
    }

    /* renamed from: g */
    public static Field m53932g(Object obj, String str) {
        for (Class<?> cls = obj.getClass(); cls != null; cls = cls.getSuperclass()) {
            try {
                Field declaredField = cls.getDeclaredField(str);
                if (!declaredField.isAccessible()) {
                    declaredField.setAccessible(true);
                }
                return declaredField;
            } catch (NoSuchFieldException unused) {
            }
        }
        throw new NoSuchFieldException("Field " + str + " not found in " + obj.getClass());
    }

    /* renamed from: h */
    public static Method m53931h(Object obj, String str, Class... clsArr) {
        for (Class<?> cls = obj.getClass(); cls != null; cls = cls.getSuperclass()) {
            try {
                Method declaredMethod = cls.getDeclaredMethod(str, clsArr);
                if (!declaredMethod.isAccessible()) {
                    declaredMethod.setAccessible(true);
                }
                return declaredMethod;
            } catch (NoSuchMethodException unused) {
            }
        }
        throw new NoSuchMethodException("Method " + str + " with parameters " + Arrays.asList(clsArr) + " not found in " + obj.getClass());
    }

    /* renamed from: i */
    public static ApplicationInfo m53930i(Context context) {
        try {
            return context.getApplicationInfo();
        } catch (RuntimeException e) {
            Log.w("MultiDex", "Failure while trying to obtain ApplicationInfo from Context. Must be running in test mode. Skip patching.", e);
            return null;
        }
    }

    public static void install(Context context) {
        if (f36158b) {
            return;
        }
        try {
            ApplicationInfo m53930i = m53930i(context);
            if (m53930i == null) {
                return;
            }
            m53934e(context, new File(m53930i.sourceDir), new File(m53930i.dataDir), "secondary-dexes", "", true);
        } catch (Exception e) {
            throw new RuntimeException("MultiDex installation failed (" + e.getMessage() + ").");
        }
    }

    public static void installInstrumentation(Context context, Context context2) {
        ApplicationInfo m53930i;
        if (f36158b) {
            return;
        }
        try {
            ApplicationInfo m53930i2 = m53930i(context);
            if (m53930i2 == null || (m53930i = m53930i(context2)) == null) {
                return;
            }
            String str = context.getPackageName() + ".";
            File file = new File(m53930i.dataDir);
            m53934e(context2, new File(m53930i2.sourceDir), file, str + "secondary-dexes", str, false);
            m53934e(context2, new File(m53930i.sourceDir), file, "secondary-dexes", "", false);
        } catch (Exception e) {
            throw new RuntimeException("MultiDex installation failed (" + e.getMessage() + ").");
        }
    }

    /* renamed from: j */
    public static ClassLoader m53929j(Context context) {
        try {
            ClassLoader classLoader = context.getClassLoader();
            if (!(classLoader instanceof BaseDexClassLoader)) {
                return null;
            }
            return classLoader;
        } catch (RuntimeException e) {
            Log.w("MultiDex", "Failure while trying to obtain Context class loader. Must be running in test mode. Skip patching.", e);
            return null;
        }
    }

    /* renamed from: k */
    public static File m53928k(Context context, File file, String str) {
        File file2 = new File(file, "code_cache");
        try {
            m53925n(file2);
        } catch (IOException unused) {
            file2 = new File(context.getFilesDir(), "code_cache");
            m53925n(file2);
        }
        File file3 = new File(file2, str);
        m53925n(file3);
        return file3;
    }

    /* renamed from: l */
    public static void m53927l(ClassLoader classLoader, File file, List list) {
        if (!list.isEmpty()) {
            C4801a.m53924a(classLoader, list, file);
        }
    }

    /* renamed from: m */
    public static boolean m53926m(String str) {
        String str2;
        String str3;
        boolean z = false;
        if (str != null) {
            StringTokenizer stringTokenizer = new StringTokenizer(str, ".");
            String str4 = null;
            if (stringTokenizer.hasMoreTokens()) {
                str3 = stringTokenizer.nextToken();
            } else {
                str3 = null;
            }
            if (stringTokenizer.hasMoreTokens()) {
                str4 = stringTokenizer.nextToken();
            }
            if (str3 != null && str4 != null) {
                try {
                    int parseInt = Integer.parseInt(str3);
                    int parseInt2 = Integer.parseInt(str4);
                    if (parseInt > 2 || (parseInt == 2 && parseInt2 >= 1)) {
                        z = true;
                    }
                } catch (NumberFormatException unused) {
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append("VM with version ");
        sb.append(str);
        if (z) {
            str2 = " has multidex support";
        } else {
            str2 = " does not have multidex support";
        }
        sb.append(str2);
        return z;
    }

    /* renamed from: n */
    public static void m53925n(File file) {
        file.mkdir();
        if (!file.isDirectory()) {
            File parentFile = file.getParentFile();
            if (parentFile == null) {
                StringBuilder sb = new StringBuilder();
                sb.append("Failed to create dir ");
                sb.append(file.getPath());
                sb.append(". Parent file is null.");
            } else {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Failed to create dir ");
                sb2.append(file.getPath());
                sb2.append(". parent file is a dir ");
                sb2.append(parentFile.isDirectory());
                sb2.append(", a file ");
                sb2.append(parentFile.isFile());
                sb2.append(", exists ");
                sb2.append(parentFile.exists());
                sb2.append(", readable ");
                sb2.append(parentFile.canRead());
                sb2.append(", writable ");
                sb2.append(parentFile.canWrite());
            }
            throw new IOException("Failed to create directory " + file.getPath());
        }
    }
}
