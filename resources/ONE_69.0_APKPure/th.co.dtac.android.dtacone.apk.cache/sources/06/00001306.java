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
public abstract class AbstractC1406U1 {

    /* renamed from: a */
    public static final Class f6482a;

    /* renamed from: b */
    public static final Field f6483b;

    /* renamed from: c */
    public static final Field f6484c;

    /* renamed from: d */
    public static final Method f6485d;

    /* renamed from: e */
    public static final Method f6486e;

    /* renamed from: f */
    public static final Method f6487f;

    /* renamed from: g */
    public static final Handler f6488g = new Handler(Looper.getMainLooper());

    /* renamed from: U1$a */
    /* loaded from: classes2.dex */
    public class RunnableC1407a implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ C1410d f6489a;

        /* renamed from: b */
        public final /* synthetic */ Object f6490b;

        public RunnableC1407a(C1410d c1410d, Object obj) {
            this.f6489a = c1410d;
            this.f6490b = obj;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f6489a.f6495a = this.f6490b;
        }
    }

    /* renamed from: U1$b */
    /* loaded from: classes2.dex */
    public class RunnableC1408b implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ Application f6491a;

        /* renamed from: b */
        public final /* synthetic */ C1410d f6492b;

        public RunnableC1408b(Application application, C1410d c1410d) {
            this.f6491a = application;
            this.f6492b = c1410d;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f6491a.unregisterActivityLifecycleCallbacks(this.f6492b);
        }
    }

    /* renamed from: U1$c */
    /* loaded from: classes2.dex */
    public class RunnableC1409c implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ Object f6493a;

        /* renamed from: b */
        public final /* synthetic */ Object f6494b;

        public RunnableC1409c(Object obj, Object obj2) {
            this.f6493a = obj;
            this.f6494b = obj2;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                Method method = AbstractC1406U1.f6485d;
                if (method != null) {
                    method.invoke(this.f6493a, this.f6494b, Boolean.FALSE, "AppCompat recreation");
                } else {
                    AbstractC1406U1.f6486e.invoke(this.f6493a, this.f6494b, Boolean.FALSE);
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
        Class m66285a = m66285a();
        f6482a = m66285a;
        f6483b = m66284b();
        f6484c = m66280f();
        f6485d = m66282d(m66285a);
        f6486e = m66283c(m66285a);
        f6487f = m66281e(m66285a);
    }

    /* renamed from: a */
    public static Class m66285a() {
        try {
            return Class.forName("android.app.ActivityThread");
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: b */
    public static Field m66284b() {
        try {
            Field declaredField = Activity.class.getDeclaredField("mMainThread");
            declaredField.setAccessible(true);
            return declaredField;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: c */
    public static Method m66283c(Class cls) {
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
    public static Method m66282d(Class cls) {
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
    public static Method m66281e(Class cls) {
        if (m66279g() && cls != null) {
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
    public static Field m66280f() {
        try {
            Field declaredField = Activity.class.getDeclaredField("mToken");
            declaredField.setAccessible(true);
            return declaredField;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: g */
    public static boolean m66279g() {
        int i = Build.VERSION.SDK_INT;
        if (i != 26 && i != 27) {
            return false;
        }
        return true;
    }

    /* renamed from: h */
    public static boolean m66278h(Object obj, int i, Activity activity) {
        try {
            Object obj2 = f6484c.get(activity);
            if (obj2 == obj && activity.hashCode() == i) {
                f6488g.postAtFrontOfQueue(new RunnableC1409c(f6483b.get(activity), obj2));
                return true;
            }
        } catch (Throwable unused) {
        }
        return false;
    }

    /* renamed from: i */
    public static boolean m66277i(Activity activity) {
        Object obj;
        if (Build.VERSION.SDK_INT >= 28) {
            activity.recreate();
            return true;
        } else if (m66279g() && f6487f == null) {
            return false;
        } else {
            if (f6486e == null && f6485d == null) {
                return false;
            }
            try {
                Object obj2 = f6484c.get(activity);
                if (obj2 == null || (obj = f6483b.get(activity)) == null) {
                    return false;
                }
                Application application = activity.getApplication();
                C1410d c1410d = new C1410d(activity);
                application.registerActivityLifecycleCallbacks(c1410d);
                Handler handler = f6488g;
                handler.post(new RunnableC1407a(c1410d, obj2));
                if (m66279g()) {
                    Method method = f6487f;
                    Boolean bool = Boolean.FALSE;
                    method.invoke(obj, obj2, null, null, 0, bool, null, null, bool, bool);
                } else {
                    activity.recreate();
                }
                handler.post(new RunnableC1408b(application, c1410d));
                return true;
            } catch (Throwable unused) {
                return false;
            }
        }
    }

    /* renamed from: U1$d */
    /* loaded from: classes2.dex */
    public static final class C1410d implements Application.ActivityLifecycleCallbacks {

        /* renamed from: a */
        public Object f6495a;

        /* renamed from: b */
        public Activity f6496b;

        /* renamed from: c */
        public final int f6497c;

        /* renamed from: d */
        public boolean f6498d = false;

        /* renamed from: e */
        public boolean f6499e = false;

        /* renamed from: f */
        public boolean f6500f = false;

        public C1410d(Activity activity) {
            this.f6496b = activity;
            this.f6497c = activity.hashCode();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
            if (this.f6496b == activity) {
                this.f6496b = null;
                this.f6499e = true;
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
            if (this.f6499e && !this.f6500f && !this.f6498d && AbstractC1406U1.m66278h(this.f6495a, this.f6497c, activity)) {
                this.f6500f = true;
                this.f6495a = null;
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
            if (this.f6496b == activity) {
                this.f6498d = true;
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