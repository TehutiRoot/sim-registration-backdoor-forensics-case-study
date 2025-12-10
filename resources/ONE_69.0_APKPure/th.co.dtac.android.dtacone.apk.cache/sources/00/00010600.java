package p000;

import android.view.View;
import com.mixpanel.android.util.MPLog;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: ph */
/* loaded from: classes5.dex */
public class C13108ph {

    /* renamed from: a */
    public final String f76878a;

    /* renamed from: b */
    public final Object[] f76879b;

    /* renamed from: c */
    public final Class f76880c;

    /* renamed from: d */
    public final Class f76881d;

    /* renamed from: e */
    public final Method f76882e;

    public C13108ph(Class cls, String str, Object[] objArr, Class cls2) {
        this.f76878a = str;
        this.f76879b = objArr;
        this.f76880c = cls2;
        Method m23781f = m23781f(cls);
        this.f76882e = m23781f;
        if (m23781f != null) {
            this.f76881d = m23781f.getDeclaringClass();
            return;
        }
        throw new NoSuchMethodException("Method " + cls.getName() + "." + str + " doesn't exit");
    }

    /* renamed from: d */
    public static Class m23783d(Class cls) {
        if (cls == Byte.class) {
            return Byte.TYPE;
        }
        if (cls == Short.class) {
            return Short.TYPE;
        }
        if (cls == Integer.class) {
            return Integer.TYPE;
        }
        if (cls == Long.class) {
            return Long.TYPE;
        }
        if (cls == Float.class) {
            return Float.TYPE;
        }
        if (cls == Double.class) {
            return Double.TYPE;
        }
        if (cls == Boolean.class) {
            return Boolean.TYPE;
        }
        if (cls == Character.class) {
            return Character.TYPE;
        }
        return cls;
    }

    /* renamed from: a */
    public Object m23786a(View view) {
        return m23785b(view, this.f76879b);
    }

    /* renamed from: b */
    public Object m23785b(View view, Object[] objArr) {
        if (this.f76881d.isAssignableFrom(view.getClass())) {
            try {
                return this.f76882e.invoke(view, objArr);
            } catch (IllegalAccessException e) {
                MPLog.m33448e("MixpanelABTest.Caller", "Method " + this.f76882e.getName() + " appears not to be public", e);
                return null;
            } catch (IllegalArgumentException e2) {
                MPLog.m33448e("MixpanelABTest.Caller", "Method " + this.f76882e.getName() + " called with arguments of the wrong type", e2);
                return null;
            } catch (InvocationTargetException e3) {
                MPLog.m33448e("MixpanelABTest.Caller", "Method " + this.f76882e.getName() + " threw an exception", e3);
                return null;
            }
        }
        return null;
    }

    /* renamed from: c */
    public boolean m23784c(Object[] objArr) {
        Class<?>[] parameterTypes = this.f76882e.getParameterTypes();
        if (objArr.length != parameterTypes.length) {
            return false;
        }
        for (int i = 0; i < objArr.length; i++) {
            Class m23783d = m23783d(parameterTypes[i]);
            Object obj = objArr[i];
            if (obj == null) {
                if (m23783d == Byte.TYPE || m23783d == Short.TYPE || m23783d == Integer.TYPE || m23783d == Long.TYPE || m23783d == Float.TYPE || m23783d == Double.TYPE || m23783d == Boolean.TYPE || m23783d == Character.TYPE) {
                    return false;
                }
            } else if (!m23783d.isAssignableFrom(m23783d(obj.getClass()))) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: e */
    public Object[] m23782e() {
        return this.f76879b;
    }

    /* renamed from: f */
    public final Method m23781f(Class cls) {
        Method[] methods;
        Class[] clsArr = new Class[this.f76879b.length];
        int i = 0;
        while (true) {
            Object[] objArr = this.f76879b;
            if (i >= objArr.length) {
                break;
            }
            clsArr[i] = objArr[i].getClass();
            i++;
        }
        for (Method method : cls.getMethods()) {
            String name = method.getName();
            Class<?>[] parameterTypes = method.getParameterTypes();
            if (name.equals(this.f76878a) && parameterTypes.length == this.f76879b.length && m23783d(this.f76880c).isAssignableFrom(m23783d(method.getReturnType()))) {
                boolean z = true;
                for (int i2 = 0; i2 < parameterTypes.length && z; i2++) {
                    z = m23783d(parameterTypes[i2]).isAssignableFrom(m23783d(clsArr[i2]));
                }
                if (z) {
                    return method;
                }
            }
        }
        return null;
    }

    public String toString() {
        return "[Caller " + this.f76878a + "(" + this.f76879b + ")]";
    }
}