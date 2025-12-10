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
    public static final int[] f49576a = {R.attr.dynamicColorThemeOverlay};

    /* renamed from: b */
    public static final InterfaceC6887c f49577b;

    /* renamed from: c */
    public static final InterfaceC6887c f49578c;

    /* renamed from: d */
    public static final Map f49579d;

    /* renamed from: e */
    public static final Map f49580e;

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
    public class C6885a implements InterfaceC6887c {
        @Override // com.google.android.material.color.DynamicColors.InterfaceC6887c
        public boolean isSupported() {
            return true;
        }
    }

    /* renamed from: com.google.android.material.color.DynamicColors$b */
    /* loaded from: classes4.dex */
    public class C6886b implements InterfaceC6887c {

        /* renamed from: a */
        public Long f49581a;

        @Override // com.google.android.material.color.DynamicColors.InterfaceC6887c
        public boolean isSupported() {
            if (this.f49581a == null) {
                try {
                    Method declaredMethod = Build.class.getDeclaredMethod("getLong", String.class);
                    declaredMethod.setAccessible(true);
                    Long l = (Long) declaredMethod.invoke(null, "ro.build.version.oneui");
                    l.longValue();
                    this.f49581a = l;
                } catch (Exception unused) {
                    this.f49581a = -1L;
                }
            }
            if (this.f49581a.longValue() < 40100) {
                return false;
            }
            return true;
        }
    }

    /* renamed from: com.google.android.material.color.DynamicColors$c */
    /* loaded from: classes4.dex */
    public interface InterfaceC6887c {
        boolean isSupported();
    }

    /* renamed from: com.google.android.material.color.DynamicColors$d */
    /* loaded from: classes4.dex */
    public static class C6888d implements Application.ActivityLifecycleCallbacks {

        /* renamed from: a */
        public final DynamicColorsOptions f49582a;

        public C6888d(DynamicColorsOptions dynamicColorsOptions) {
            this.f49582a = dynamicColorsOptions;
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
            DynamicColors.applyToActivityIfAvailable(activity, this.f49582a);
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
        C6885a c6885a = new C6885a();
        f49577b = c6885a;
        C6886b c6886b = new C6886b();
        f49578c = c6886b;
        HashMap hashMap = new HashMap();
        hashMap.put("fcnt", c6885a);
        hashMap.put("google", c6885a);
        hashMap.put("hmd global", c6885a);
        hashMap.put("infinix", c6885a);
        hashMap.put("infinix mobility limited", c6885a);
        hashMap.put("itel", c6885a);
        hashMap.put("kyocera", c6885a);
        hashMap.put("lenovo", c6885a);
        hashMap.put("lge", c6885a);
        hashMap.put("motorola", c6885a);
        hashMap.put("nothing", c6885a);
        hashMap.put("oneplus", c6885a);
        hashMap.put("oppo", c6885a);
        hashMap.put("realme", c6885a);
        hashMap.put("robolectric", c6885a);
        hashMap.put("samsung", c6886b);
        hashMap.put("sharp", c6885a);
        hashMap.put("sony", c6885a);
        hashMap.put("tcl", c6885a);
        hashMap.put("tecno", c6885a);
        hashMap.put("tecno mobile limited", c6885a);
        hashMap.put("vivo", c6885a);
        hashMap.put("wingtech", c6885a);
        hashMap.put("xiaomi", c6885a);
        f49579d = Collections.unmodifiableMap(hashMap);
        HashMap hashMap2 = new HashMap();
        hashMap2.put("asus", c6885a);
        hashMap2.put("jio", c6885a);
        f49580e = Collections.unmodifiableMap(hashMap2);
    }

    /* renamed from: a */
    public static int m45360a(Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(f49576a);
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
        InterfaceC6887c interfaceC6887c = (InterfaceC6887c) f49579d.get(Build.MANUFACTURER.toLowerCase());
        if (interfaceC6887c == null) {
            interfaceC6887c = (InterfaceC6887c) f49580e.get(Build.BRAND.toLowerCase());
        }
        if (interfaceC6887c == null || !interfaceC6887c.isSupported()) {
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
                i = m45360a(activity);
            } else {
                i = dynamicColorsOptions.getThemeOverlay();
            }
            if (dynamicColorsOptions.getPrecondition().shouldApplyDynamicColors(activity, i)) {
                if (dynamicColorsOptions.getContentBasedSeedColor() != null) {
                    SchemeContent schemeContent = new SchemeContent(Hct.fromInt(dynamicColorsOptions.getContentBasedSeedColor().intValue()), !MaterialAttributes.resolveBoolean(activity, R.attr.isLightTheme, true), 0.0d);
                    ColorResourcesOverride m67166a = AbstractC0974Ns.m67166a();
                    if (m67166a == null || !m67166a.applyIfPossible(activity, MaterialColorUtilitiesHelper.createColorResourcesIdsToColorValues(schemeContent))) {
                        return;
                    }
                } else {
                    LS1.m67520a(activity, i);
                }
                dynamicColorsOptions.getOnAppliedCallback().onApplied(activity);
            }
        }
    }

    @NonNull
    public static Context wrapContextIfAvailable(@NonNull Context context, @StyleRes int i) {
        if (isDynamicColorAvailable()) {
            if (i == 0) {
                i = m45360a(context);
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
        application.registerActivityLifecycleCallbacks(new C6888d(dynamicColorsOptions));
    }
}
