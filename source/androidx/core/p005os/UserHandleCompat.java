package androidx.core.p005os;

import android.os.Build;
import android.os.UserHandle;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

@RequiresApi(17)
/* renamed from: androidx.core.os.UserHandleCompat */
/* loaded from: classes2.dex */
public class UserHandleCompat {

    /* renamed from: a */
    public static Method f33965a;

    /* renamed from: b */
    public static Constructor f33966b;

    /* renamed from: androidx.core.os.UserHandleCompat$a */
    /* loaded from: classes2.dex */
    public static class C4052a {
        @NonNull
        /* renamed from: a */
        public static UserHandle m57155a(int i) {
            return UserHandle.getUserHandleForUid(i);
        }
    }

    /* renamed from: a */
    public static Method m57157a() {
        if (f33965a == null) {
            Method declaredMethod = UserHandle.class.getDeclaredMethod("getUserId", Integer.TYPE);
            f33965a = declaredMethod;
            declaredMethod.setAccessible(true);
        }
        return f33965a;
    }

    /* renamed from: b */
    public static Constructor m57156b() {
        if (f33966b == null) {
            Constructor declaredConstructor = UserHandle.class.getDeclaredConstructor(Integer.TYPE);
            f33966b = declaredConstructor;
            declaredConstructor.setAccessible(true);
        }
        return f33966b;
    }

    @NonNull
    public static UserHandle getUserHandleForUid(int i) {
        if (Build.VERSION.SDK_INT >= 24) {
            return C4052a.m57155a(i);
        }
        try {
            return (UserHandle) m57156b().newInstance((Integer) m57157a().invoke(null, Integer.valueOf(i)));
        } catch (IllegalAccessException e) {
            IllegalAccessError illegalAccessError = new IllegalAccessError();
            illegalAccessError.initCause(e);
            throw illegalAccessError;
        } catch (InstantiationException e2) {
            InstantiationError instantiationError = new InstantiationError();
            instantiationError.initCause(e2);
            throw instantiationError;
        } catch (NoSuchMethodException e3) {
            NoSuchMethodError noSuchMethodError = new NoSuchMethodError();
            noSuchMethodError.initCause(e3);
            throw noSuchMethodError;
        } catch (InvocationTargetException e4) {
            throw new RuntimeException(e4);
        }
    }
}
