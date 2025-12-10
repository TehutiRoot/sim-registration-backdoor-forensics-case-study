package p000;

import androidx.camera.core.internal.TargetConfig;

/* renamed from: YQ1 */
/* loaded from: classes.dex */
public abstract /* synthetic */ class YQ1 {
    /* renamed from: a */
    public static Class m65362a(TargetConfig targetConfig) {
        return (Class) targetConfig.retrieveOption(TargetConfig.OPTION_TARGET_CLASS);
    }

    /* renamed from: b */
    public static Class m65361b(TargetConfig targetConfig, Class cls) {
        return (Class) targetConfig.retrieveOption(TargetConfig.OPTION_TARGET_CLASS, cls);
    }

    /* renamed from: c */
    public static String m65360c(TargetConfig targetConfig) {
        return (String) targetConfig.retrieveOption(TargetConfig.OPTION_TARGET_NAME);
    }

    /* renamed from: d */
    public static String m65359d(TargetConfig targetConfig, String str) {
        return (String) targetConfig.retrieveOption(TargetConfig.OPTION_TARGET_NAME, str);
    }
}
