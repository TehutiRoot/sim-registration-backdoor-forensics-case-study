package p000;

import android.view.View;
import com.mixpanel.android.util.MPLog;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: ph */
/* loaded from: classes5.dex */
public class C13106ph {

    /* renamed from: a */
    public final String f76651a;

    /* renamed from: b */
    public final Object[] f76652b;

    /* renamed from: c */
    public final Class f76653c;

    /* renamed from: d */
    public final Class f76654d;

    /* renamed from: e */
    public final Method f76655e;

    public C13106ph(Class cls, String str, Object[] objArr, Class cls2) {
        this.f76651a = str;
        this.f76652b = objArr;
        this.f76653c = cls2;
        Method m23630f = m23630f(cls);
        this.f76655e = m23630f;
        if (m23630f != null) {
            this.f76654d = m23630f.getDeclaringClass();
            return;
        }
        throw new NoSuchMethodException("Method " + cls.getName() + "." + str + " doesn't exit");
    }

    /* renamed from: d */
    public static Class m23632d(Class cls) {
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
    public Object m23635a(View view) {
        return m23634b(view, this.f76652b);
    }

    /* renamed from: b */
    public Object m23634b(View view, Object[] objArr) {
        if (this.f76654d.isAssignableFrom(view.getClass())) {
            try {
                return this.f76655e.invoke(view, objArr);
            } catch (IllegalAccessException e) {
                MPLog.m33456e("MixpanelABTest.Caller", "Method " + this.f76655e.getName() + " appears not to be public", e);
                return null;
            } catch (IllegalArgumentException e2) {
                MPLog.m33456e("MixpanelABTest.Caller", "Method " + this.f76655e.getName() + " called with arguments of the wrong type", e2);
                return null;
            } catch (InvocationTargetException e3) {
                MPLog.m33456e("MixpanelABTest.Caller", "Method " + this.f76655e.getName() + " threw an exception", e3);
                return null;
            }
        }
        return null;
    }

    /* renamed from: c */
    public boolean m23633c(Object[] objArr) {
        Class<?>[] parameterTypes = this.f76655e.getParameterTypes();
        if (objArr.length != parameterTypes.length) {
            return false;
        }
        for (int i = 0; i < objArr.length; i++) {
            Class m23632d = m23632d(parameterTypes[i]);
            Object obj = objArr[i];
            if (obj == null) {
                if (m23632d == Byte.TYPE || m23632d == Short.TYPE || m23632d == Integer.TYPE || m23632d == Long.TYPE || m23632d == Float.TYPE || m23632d == Double.TYPE || m23632d == Boolean.TYPE || m23632d == Character.TYPE) {
                    return false;
                }
            } else if (!m23632d.isAssignableFrom(m23632d(obj.getClass()))) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: e */
    public Object[] m23631e() {
        return this.f76652b;
    }

    /* renamed from: f */
    public final Method m23630f(Class cls) {
        Method[] methods;
        Class[] clsArr = new Class[this.f76652b.length];
        int i = 0;
        while (true) {
            Object[] objArr = this.f76652b;
            if (i >= objArr.length) {
                break;
            }
            clsArr[i] = objArr[i].getClass();
            i++;
        }
        for (Method method : cls.getMethods()) {
            String name = method.getName();
            Class<?>[] parameterTypes = method.getParameterTypes();
            if (name.equals(this.f76651a) && parameterTypes.length == this.f76652b.length && m23632d(this.f76653c).isAssignableFrom(m23632d(method.getReturnType()))) {
                boolean z = true;
                for (int i2 = 0; i2 < parameterTypes.length && z; i2++) {
                    z = m23632d(parameterTypes[i2]).isAssignableFrom(m23632d(clsArr[i2]));
                }
                if (z) {
                    return method;
                }
            }
        }
        return null;
    }

    public String toString() {
        return "[Caller " + this.f76651a + "(" + this.f76652b + ")]";
    }
}
