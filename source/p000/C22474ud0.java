package p000;

import android.app.Activity;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import java.lang.reflect.Field;

/* renamed from: ud0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C22474ud0 implements LifecycleEventObserver {

    /* renamed from: b */
    public static int f107408b;

    /* renamed from: c */
    public static Field f107409c;

    /* renamed from: d */
    public static Field f107410d;

    /* renamed from: e */
    public static Field f107411e;

    /* renamed from: a */
    public Activity f107412a;

    public C22474ud0(Activity activity) {
        this.f107412a = activity;
    }

    /* renamed from: a */
    public static void m1246a() {
        try {
            f107408b = 2;
            Field declaredField = InputMethodManager.class.getDeclaredField("mServedView");
            f107410d = declaredField;
            declaredField.setAccessible(true);
            Field declaredField2 = InputMethodManager.class.getDeclaredField("mNextServedView");
            f107411e = declaredField2;
            declaredField2.setAccessible(true);
            Field declaredField3 = InputMethodManager.class.getDeclaredField("mH");
            f107409c = declaredField3;
            declaredField3.setAccessible(true);
            f107408b = 1;
        } catch (NoSuchFieldException unused) {
        }
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (event != Lifecycle.Event.ON_DESTROY) {
            return;
        }
        if (f107408b == 0) {
            m1246a();
        }
        if (f107408b == 1) {
            InputMethodManager inputMethodManager = (InputMethodManager) this.f107412a.getSystemService("input_method");
            try {
                Object obj = f107409c.get(inputMethodManager);
                if (obj == null) {
                    return;
                }
                synchronized (obj) {
                    try {
                        try {
                            try {
                                View view = (View) f107410d.get(inputMethodManager);
                                if (view == null) {
                                    return;
                                }
                                if (view.isAttachedToWindow()) {
                                    return;
                                }
                                try {
                                    f107411e.set(inputMethodManager, null);
                                    inputMethodManager.isActive();
                                } catch (IllegalAccessException unused) {
                                }
                            } catch (IllegalAccessException unused2) {
                            }
                        } catch (ClassCastException unused3) {
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            } catch (IllegalAccessException unused4) {
            }
        }
    }
}
