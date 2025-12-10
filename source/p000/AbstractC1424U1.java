package p000;

import android.app.Activity;
import android.app.Application;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.List;

/* renamed from: U1 */
/* loaded from: classes2.dex */
public abstract class AbstractC1424U1 {

    /* renamed from: a */
    public static final Class f6167a;

    /* renamed from: b */
    public static final Field f6168b;

    /* renamed from: c */
    public static final Field f6169c;

    /* renamed from: d */
    public static final Method f6170d;

    /* renamed from: e */
    public static final Method f6171e;

    /* renamed from: f */
    public static final Method f6172f;

    /* renamed from: g */
    public static final Handler f6173g = new Handler(Looper.getMainLooper());

    /* renamed from: U1$a */
    /* loaded from: classes2.dex */
    public class RunnableC1425a implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ C1428d f6174a;

        /* renamed from: b */
        public final /* synthetic */ Object f6175b;

        public RunnableC1425a(C1428d c1428d, Object obj) {
            this.f6174a = c1428d;
            this.f6175b = obj;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f6174a.f6180a = this.f6175b;
        }
    }

    /* renamed from: U1$b */
    /* loaded from: classes2.dex */
    public class RunnableC1426b implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ Application f6176a;

        /* renamed from: b */
        public final /* synthetic */ C1428d f6177b;

        public RunnableC1426b(Application application, C1428d c1428d) {
            this.f6176a = application;
            this.f6177b = c1428d;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f6176a.unregisterActivityLifecycleCallbacks(this.f6177b);
        }
    }

    /* renamed from: U1$c */
    /* loaded from: classes2.dex */
    public class RunnableC1427c implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ Object f6178a;

        /* renamed from: b */
        public final /* synthetic */ Object f6179b;

        public RunnableC1427c(Object obj, Object obj2) {
            this.f6178a = obj;
            this.f6179b = obj2;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                Method method = AbstractC1424U1.f6170d;
                if (method != null) {
                    method.invoke(this.f6178a, this.f6179b, Boolean.FALSE, "AppCompat recreation");
                } else {
                    AbstractC1424U1.f6171e.invoke(this.f6178a, this.f6179b, Boolean.FALSE);
                }
            } catch (RuntimeException e) {
                if (e.getClass() == RuntimeException.class && e.getMessage() != null && e.getMessage().startsWith("Unable to stop")) {
                    throw e;
                }
            } catch (Throwable unused) {
            }
        }
    }

    static {
        Class m66157a = m66157a();
        f6167a = m66157a;
        f6168b = m66156b();
        f6169c = m66152f();
        f6170d = m66154d(m66157a);
        f6171e = m66155c(m66157a);
        f6172f = m66153e(m66157a);
    }

    /* renamed from: a */
    public static Class m66157a() {
        try {
            return Class.forName("android.app.ActivityThread");
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: b */
    public static Field m66156b() {
        try {
            Field declaredField = Activity.class.getDeclaredField("mMainThread");
            declaredField.setAccessible(true);
            return declaredField;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: c */
    public static Method m66155c(Class cls) {
        if (cls == null) {
            return null;
        }
        try {
            Method declaredMethod = cls.getDeclaredMethod("performStopActivity", IBinder.class, Boolean.TYPE);
            declaredMethod.setAccessible(true);
            return declaredMethod;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: d */
    public static Method m66154d(Class cls) {
        if (cls == null) {
            return null;
        }
        try {
            Method declaredMethod = cls.getDeclaredMethod("performStopActivity", IBinder.class, Boolean.TYPE, String.class);
            declaredMethod.setAccessible(true);
            return declaredMethod;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: e */
    public static Method m66153e(Class cls) {
        if (m66151g() && cls != null) {
            try {
                Class<?> cls2 = Boolean.TYPE;
                Method declaredMethod = cls.getDeclaredMethod("requestRelaunchActivity", IBinder.class, List.class, List.class, Integer.TYPE, cls2, Configuration.class, Configuration.class, cls2, cls2);
                declaredMethod.setAccessible(true);
                return declaredMethod;
            } catch (Throwable unused) {
            }
        }
        return null;
    }

    /* renamed from: f */
    public static Field m66152f() {
        try {
            Field declaredField = Activity.class.getDeclaredField("mToken");
            declaredField.setAccessible(true);
            return declaredField;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: g */
    public static boolean m66151g() {
        int i = Build.VERSION.SDK_INT;
        if (i != 26 && i != 27) {
            return false;
        }
        return true;
    }

    /* renamed from: h */
    public static boolean m66150h(Object obj, int i, Activity activity) {
        try {
            Object obj2 = f6169c.get(activity);
            if (obj2 == obj && activity.hashCode() == i) {
                f6173g.postAtFrontOfQueue(new RunnableC1427c(f6168b.get(activity), obj2));
                return true;
            }
        } catch (Throwable unused) {
        }
        return false;
    }

    /* renamed from: i */
    public static boolean m66149i(Activity activity) {
        Object obj;
        if (Build.VERSION.SDK_INT >= 28) {
            activity.recreate();
            return true;
        } else if (m66151g() && f6172f == null) {
            return false;
        } else {
            if (f6171e == null && f6170d == null) {
                return false;
            }
            try {
                Object obj2 = f6169c.get(activity);
                if (obj2 == null || (obj = f6168b.get(activity)) == null) {
                    return false;
                }
                Application application = activity.getApplication();
                C1428d c1428d = new C1428d(activity);
                application.registerActivityLifecycleCallbacks(c1428d);
                Handler handler = f6173g;
                handler.post(new RunnableC1425a(c1428d, obj2));
                if (m66151g()) {
                    Method method = f6172f;
                    Boolean bool = Boolean.FALSE;
                    method.invoke(obj, obj2, null, null, 0, bool, null, null, bool, bool);
                } else {
                    activity.recreate();
                }
                handler.post(new RunnableC1426b(application, c1428d));
                return true;
            } catch (Throwable unused) {
                return false;
            }
        }
    }

    /* renamed from: U1$d */
    /* loaded from: classes2.dex */
    public static final class C1428d implements Application.ActivityLifecycleCallbacks {

        /* renamed from: a */
        public Object f6180a;

        /* renamed from: b */
        public Activity f6181b;

        /* renamed from: c */
        public final int f6182c;

        /* renamed from: d */
        public boolean f6183d = false;

        /* renamed from: e */
        public boolean f6184e = false;

        /* renamed from: f */
        public boolean f6185f = false;

        public C1428d(Activity activity) {
            this.f6181b = activity;
            this.f6182c = activity.hashCode();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
            if (this.f6181b == activity) {
                this.f6181b = null;
                this.f6184e = true;
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
            if (this.f6184e && !this.f6185f && !this.f6183d && AbstractC1424U1.m66150h(this.f6180a, this.f6182c, activity)) {
                this.f6185f = true;
                this.f6180a = null;
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
            if (this.f6181b == activity) {
                this.f6183d = true;
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }
    }
}
