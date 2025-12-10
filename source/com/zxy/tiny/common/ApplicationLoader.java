package com.zxy.tiny.common;

import android.app.Application;
import java.lang.reflect.Method;

/* loaded from: classes5.dex */
public class ApplicationLoader {

    /* renamed from: a */
    public static Application f60956a;

    /* renamed from: a */
    public static Application m31989a() {
        try {
            try {
                Method declaredMethod = Class.forName("android.app.AppGlobals").getDeclaredMethod("getInitialApplication", null);
                declaredMethod.setAccessible(true);
                return (Application) declaredMethod.invoke(null, null);
            } catch (Exception unused) {
                Method declaredMethod2 = Class.forName("android.app.ActivityThread").getDeclaredMethod("currentApplication", null);
                declaredMethod2.setAccessible(true);
                return (Application) declaredMethod2.invoke(null, null);
            }
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static Application get() {
        Application application = f60956a;
        if (application == null) {
            return m31989a();
        }
        return application;
    }
}
