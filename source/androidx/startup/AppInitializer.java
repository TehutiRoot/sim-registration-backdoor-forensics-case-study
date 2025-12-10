package androidx.startup;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.tracing.Trace;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes2.dex */
public final class AppInitializer {

    /* renamed from: d */
    public static volatile AppInitializer f37526d;

    /* renamed from: e */
    public static final Object f37527e = new Object();

    /* renamed from: c */
    public final Context f37530c;

    /* renamed from: b */
    public final Set f37529b = new HashSet();

    /* renamed from: a */
    public final Map f37528a = new HashMap();

    public AppInitializer(Context context) {
        this.f37530c = context.getApplicationContext();
    }

    @NonNull
    public static AppInitializer getInstance(@NonNull Context context) {
        if (f37526d == null) {
            synchronized (f37527e) {
                try {
                    if (f37526d == null) {
                        f37526d = new AppInitializer(context);
                    }
                } finally {
                }
            }
        }
        return f37526d;
    }

    /* renamed from: a */
    public void m52792a() {
        try {
            try {
                Trace.beginSection("Startup");
                m52791b(this.f37530c.getPackageManager().getProviderInfo(new ComponentName(this.f37530c.getPackageName(), InitializationProvider.class.getName()), 128).metaData);
            } catch (PackageManager.NameNotFoundException e) {
                throw new StartupException(e);
            }
        } finally {
            Trace.endSection();
        }
    }

    /* renamed from: b */
    public void m52791b(Bundle bundle) {
        String string = this.f37530c.getString(R.string.androidx_startup);
        if (bundle != null) {
            try {
                HashSet hashSet = new HashSet();
                for (String str : bundle.keySet()) {
                    if (string.equals(bundle.getString(str, null))) {
                        Class<?> cls = Class.forName(str);
                        if (Initializer.class.isAssignableFrom(cls)) {
                            this.f37529b.add(cls);
                        }
                    }
                }
                for (Class cls2 : this.f37529b) {
                    m52789d(cls2, hashSet);
                }
            } catch (ClassNotFoundException e) {
                throw new StartupException(e);
            }
        }
    }

    /* renamed from: c */
    public Object m52790c(Class cls) {
        Object obj;
        synchronized (f37527e) {
            try {
                obj = this.f37528a.get(cls);
                if (obj == null) {
                    obj = m52789d(cls, new HashSet());
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return obj;
    }

    /* renamed from: d */
    public final Object m52789d(Class cls, Set set) {
        Object obj;
        if (Trace.isEnabled()) {
            try {
                Trace.beginSection(cls.getSimpleName());
            } catch (Throwable th2) {
                Trace.endSection();
                throw th2;
            }
        }
        if (!set.contains(cls)) {
            if (!this.f37528a.containsKey(cls)) {
                set.add(cls);
                Initializer initializer = (Initializer) cls.getDeclaredConstructor(null).newInstance(null);
                List<Class<? extends Initializer<?>>> dependencies = initializer.dependencies();
                if (!dependencies.isEmpty()) {
                    for (Class<? extends Initializer<?>> cls2 : dependencies) {
                        if (!this.f37528a.containsKey(cls2)) {
                            m52789d(cls2, set);
                        }
                    }
                }
                obj = initializer.create(this.f37530c);
                set.remove(cls);
                this.f37528a.put(cls, obj);
            } else {
                obj = this.f37528a.get(cls);
            }
            Trace.endSection();
            return obj;
        }
        throw new IllegalStateException(String.format("Cannot initialize %s. Cycle detected.", cls.getName()));
    }

    @NonNull
    public <T> T initializeComponent(@NonNull Class<? extends Initializer<T>> cls) {
        return (T) m52790c(cls);
    }

    public boolean isEagerlyInitialized(@NonNull Class<? extends Initializer<?>> cls) {
        return this.f37529b.contains(cls);
    }
}
