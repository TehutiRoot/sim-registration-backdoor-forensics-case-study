package p000;

import android.app.Activity;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import java.lang.reflect.Field;

/* renamed from: Ad0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C17293Ad0 implements LifecycleEventObserver {

    /* renamed from: b */
    public static int f167b;

    /* renamed from: c */
    public static Field f168c;

    /* renamed from: d */
    public static Field f169d;

    /* renamed from: e */
    public static Field f170e;

    /* renamed from: a */
    public Activity f171a;

    public C17293Ad0(Activity activity) {
        this.f171a = activity;
    }

    /* renamed from: a */
    public static void m69212a() {
        try {
            f167b = 2;
            Field declaredField = InputMethodManager.class.getDeclaredField("mServedView");
            f169d = declaredField;
            declaredField.setAccessible(true);
            Field declaredField2 = InputMethodManager.class.getDeclaredField("mNextServedView");
            f170e = declaredField2;
            declaredField2.setAccessible(true);
            Field declaredField3 = InputMethodManager.class.getDeclaredField("mH");
            f168c = declaredField3;
            declaredField3.setAccessible(true);
            f167b = 1;
        } catch (NoSuchFieldException unused) {
        }
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (event != Lifecycle.Event.ON_DESTROY) {
            return;
        }
        if (f167b == 0) {
            m69212a();
        }
        if (f167b == 1) {
            InputMethodManager inputMethodManager = (InputMethodManager) this.f171a.getSystemService("input_method");
            try {
                Object obj = f168c.get(inputMethodManager);
                if (obj == null) {
                    return;
                }
                synchronized (obj) {
                    try {
                        try {
                            try {
                                View view = (View) f169d.get(inputMethodManager);
                                if (view == null) {
                                    return;
                                }
                                if (view.isAttachedToWindow()) {
                                    return;
                                }
                                try {
                                    f170e.set(inputMethodManager, null);
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