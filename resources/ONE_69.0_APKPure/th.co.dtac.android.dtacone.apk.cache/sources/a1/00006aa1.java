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
    public static Method f34053a;

    /* renamed from: b */
    public static Constructor f34054b;

    /* renamed from: androidx.core.os.UserHandleCompat$a */
    /* loaded from: classes2.dex */
    public static class C4034a {
        @NonNull
        /* renamed from: a */
        public static UserHandle m57105a(int i) {
            return UserHandle.getUserHandleForUid(i);
        }
    }

    /* renamed from: a */
    public static Method m57107a() {
        if (f34053a == null) {
            Method declaredMethod = UserHandle.class.getDeclaredMethod("getUserId", Integer.TYPE);
            f34053a = declaredMethod;
            declaredMethod.setAccessible(true);
        }
        return f34053a;
    }

    /* renamed from: b */
    public static Constructor m57106b() {
        if (f34054b == null) {
            Constructor declaredConstructor = UserHandle.class.getDeclaredConstructor(Integer.TYPE);
            f34054b = declaredConstructor;
            declaredConstructor.setAccessible(true);
        }
        return f34054b;
    }

    @NonNull
    public static UserHandle getUserHandleForUid(int i) {
        if (Build.VERSION.SDK_INT >= 24) {
            return C4034a.m57105a(i);
        }
        try {
            return (UserHandle) m57106b().newInstance((Integer) m57107a().invoke(null, Integer.valueOf(i)));
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