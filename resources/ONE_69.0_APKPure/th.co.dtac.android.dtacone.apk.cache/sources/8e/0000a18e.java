package com.google.android.material.color;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import androidx.annotation.ChecksSdkIntAtLeast;
import androidx.annotation.NonNull;
import androidx.annotation.StyleRes;
import androidx.core.p005os.BuildCompat;
import com.google.android.material.R;
import com.google.android.material.color.DynamicColorsOptions;
import com.google.android.material.color.utilities.Hct;
import com.google.android.material.color.utilities.SchemeContent;
import com.google.android.material.resources.MaterialAttributes;
import java.lang.reflect.Method;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes4.dex */
public class DynamicColors {

    /* renamed from: a */
    public static final int[] f49588a = {R.attr.dynamicColorThemeOverlay};

    /* renamed from: b */
    public static final InterfaceC6876c f49589b;

    /* renamed from: c */
    public static final InterfaceC6876c f49590c;

    /* renamed from: d */
    public static final Map f49591d;

    /* renamed from: e */
    public static final Map f49592e;

    /* loaded from: classes4.dex */
    public interface OnAppliedCallback {
        void onApplied(@NonNull Activity activity);
    }

    /* loaded from: classes4.dex */
    public interface Precondition {
        boolean shouldApplyDynamicColors(@NonNull Activity activity, @StyleRes int i);
    }

    /* renamed from: com.google.android.material.color.DynamicColors$a */
    /* loaded from: classes4.dex */
    public class C6874a implements InterfaceC6876c {
        @Override // com.google.android.material.color.DynamicColors.InterfaceC6876c
        public boolean isSupported() {
            return true;
        }
    }

    /* renamed from: com.google.android.material.color.DynamicColors$b */
    /* loaded from: classes4.dex */
    public class C6875b implements InterfaceC6876c {

        /* renamed from: a */
        public Long f49593a;

        @Override // com.google.android.material.color.DynamicColors.InterfaceC6876c
        public boolean isSupported() {
            if (this.f49593a == null) {
                try {
                    Method declaredMethod = Build.class.getDeclaredMethod("getLong", String.class);
                    declaredMethod.setAccessible(true);
                    Long l = (Long) declaredMethod.invoke(null, "ro.build.version.oneui");
                    l.longValue();
                    this.f49593a = l;
                } catch (Exception unused) {
                    this.f49593a = -1L;
                }
            }
            if (this.f49593a.longValue() < 40100) {
                return false;
            }
            return true;
        }
    }

    /* renamed from: com.google.android.material.color.DynamicColors$c */
    /* loaded from: classes4.dex */
    public interface InterfaceC6876c {
        boolean isSupported();
    }

    /* renamed from: com.google.android.material.color.DynamicColors$d */
    /* loaded from: classes4.dex */
    public static class C6877d implements Application.ActivityLifecycleCallbacks {

        /* renamed from: a */
        public final DynamicColorsOptions f49594a;

        public C6877d(DynamicColorsOptions dynamicColorsOptions) {
            this.f49594a = dynamicColorsOptions;
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPreCreated(Activity activity, Bundle bundle) {
            DynamicColors.applyToActivityIfAvailable(activity, this.f49594a);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
        }
    }

    static {
        C6874a c6874a = new C6874a();
        f49589b = c6874a;
        C6875b c6875b = new C6875b();
        f49590c = c6875b;
        HashMap hashMap = new HashMap();
        hashMap.put("fcnt", c6874a);
        hashMap.put("google", c6874a);
        hashMap.put("hmd global", c6874a);
        hashMap.put("infinix", c6874a);
        hashMap.put("infinix mobility limited", c6874a);
        hashMap.put("itel", c6874a);
        hashMap.put("kyocera", c6874a);
        hashMap.put("lenovo", c6874a);
        hashMap.put("lge", c6874a);
        hashMap.put("motorola", c6874a);
        hashMap.put("nothing", c6874a);
        hashMap.put("oneplus", c6874a);
        hashMap.put("oppo", c6874a);
        hashMap.put("realme", c6874a);
        hashMap.put("robolectric", c6874a);
        hashMap.put("samsung", c6875b);
        hashMap.put("sharp", c6874a);
        hashMap.put("sony", c6874a);
        hashMap.put("tcl", c6874a);
        hashMap.put("tecno", c6874a);
        hashMap.put("tecno mobile limited", c6874a);
        hashMap.put("vivo", c6874a);
        hashMap.put("wingtech", c6874a);
        hashMap.put("xiaomi", c6874a);
        f49591d = Collections.unmodifiableMap(hashMap);
        HashMap hashMap2 = new HashMap();
        hashMap2.put("asus", c6874a);
        hashMap2.put("jio", c6874a);
        f49592e = Collections.unmodifiableMap(hashMap2);
    }

    /* renamed from: a */
    public static int m45336a(Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(f49588a);
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        obtainStyledAttributes.recycle();
        return resourceId;
    }

    @Deprecated
    public static void applyIfAvailable(@NonNull Activity activity) {
        applyToActivityIfAvailable(activity);
    }

    public static void applyToActivitiesIfAvailable(@NonNull Application application) {
        applyToActivitiesIfAvailable(application, new DynamicColorsOptions.Builder().build());
    }

    public static void applyToActivityIfAvailable(@NonNull Activity activity) {
        applyToActivityIfAvailable(activity, new DynamicColorsOptions.Builder().build());
    }

    @ChecksSdkIntAtLeast(api = 31)
    @SuppressLint({"DefaultLocale"})
    public static boolean isDynamicColorAvailable() {
        if (Build.VERSION.SDK_INT < 31) {
            return false;
        }
        if (BuildCompat.isAtLeastT()) {
            return true;
        }
        InterfaceC6876c interfaceC6876c = (InterfaceC6876c) f49591d.get(Build.MANUFACTURER.toLowerCase());
        if (interfaceC6876c == null) {
            interfaceC6876c = (InterfaceC6876c) f49592e.get(Build.BRAND.toLowerCase());
        }
        if (interfaceC6876c == null || !interfaceC6876c.isSupported()) {
            return false;
        }
        return true;
    }

    @NonNull
    public static Context wrapContextIfAvailable(@NonNull Context context) {
        return wrapContextIfAvailable(context, 0);
    }

    @Deprecated
    public static void applyIfAvailable(@NonNull Activity activity, @StyleRes int i) {
        applyToActivityIfAvailable(activity, new DynamicColorsOptions.Builder().setThemeOverlay(i).build());
    }

    @Deprecated
    public static void applyToActivitiesIfAvailable(@NonNull Application application, @StyleRes int i) {
        applyToActivitiesIfAvailable(application, new DynamicColorsOptions.Builder().setThemeOverlay(i).build());
    }

    public static void applyToActivityIfAvailable(@NonNull Activity activity, @NonNull DynamicColorsOptions dynamicColorsOptions) {
        int i;
        if (isDynamicColorAvailable()) {
            if (dynamicColorsOptions.getContentBasedSeedColor() != null) {
                i = 0;
            } else if (dynamicColorsOptions.getThemeOverlay() == 0) {
                i = m45336a(activity);
            } else {
                i = dynamicColorsOptions.getThemeOverlay();
            }
            if (dynamicColorsOptions.getPrecondition().shouldApplyDynamicColors(activity, i)) {
                if (dynamicColorsOptions.getContentBasedSeedColor() != null) {
                    SchemeContent schemeContent = new SchemeContent(Hct.fromInt(dynamicColorsOptions.getContentBasedSeedColor().intValue()), !MaterialAttributes.resolveBoolean(activity, R.attr.isLightTheme, true), 0.0d);
                    ColorResourcesOverride m67192a = AbstractC0963Ns.m67192a();
                    if (m67192a == null || !m67192a.applyIfPossible(activity, MaterialColorUtilitiesHelper.createColorResourcesIdsToColorValues(schemeContent))) {
                        return;
                    }
                } else {
                    IT1.m68011a(activity, i);
                }
                dynamicColorsOptions.getOnAppliedCallback().onApplied(activity);
            }
        }
    }

    @NonNull
    public static Context wrapContextIfAvailable(@NonNull Context context, @StyleRes int i) {
        if (isDynamicColorAvailable()) {
            if (i == 0) {
                i = m45336a(context);
            }
            return i == 0 ? context : new ContextThemeWrapper(context, i);
        }
        return context;
    }

    @Deprecated
    public static void applyIfAvailable(@NonNull Activity activity, @NonNull Precondition precondition) {
        applyToActivityIfAvailable(activity, new DynamicColorsOptions.Builder().setPrecondition(precondition).build());
    }

    @Deprecated
    public static void applyToActivitiesIfAvailable(@NonNull Application application, @NonNull Precondition precondition) {
        applyToActivitiesIfAvailable(application, new DynamicColorsOptions.Builder().setPrecondition(precondition).build());
    }

    @Deprecated
    public static void applyToActivitiesIfAvailable(@NonNull Application application, @StyleRes int i, @NonNull Precondition precondition) {
        applyToActivitiesIfAvailable(application, new DynamicColorsOptions.Builder().setThemeOverlay(i).setPrecondition(precondition).build());
    }

    public static void applyToActivitiesIfAvailable(@NonNull Application application, @NonNull DynamicColorsOptions dynamicColorsOptions) {
        application.registerActivityLifecycleCallbacks(new C6877d(dynamicColorsOptions));
    }
}