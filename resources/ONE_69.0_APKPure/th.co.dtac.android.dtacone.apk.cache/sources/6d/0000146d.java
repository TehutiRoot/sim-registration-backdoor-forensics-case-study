package p000;

import androidx.camera.core.internal.TargetConfig;

/* renamed from: VR1 */
/* loaded from: classes.dex */
public abstract /* synthetic */ class VR1 {
    /* renamed from: a */
    public static Class m65992a(TargetConfig targetConfig) {
        return (Class) targetConfig.retrieveOption(TargetConfig.OPTION_TARGET_CLASS);
    }

    /* renamed from: b */
    public static Class m65991b(TargetConfig targetConfig, Class cls) {
        return (Class) targetConfig.retrieveOption(TargetConfig.OPTION_TARGET_CLASS, cls);
    }

    /* renamed from: c */
    public static String m65990c(TargetConfig targetConfig) {
        return (String) targetConfig.retrieveOption(TargetConfig.OPTION_TARGET_NAME);
    }

    /* renamed from: d */
    public static String m65989d(TargetConfig targetConfig, String str) {
        return (String) targetConfig.retrieveOption(TargetConfig.OPTION_TARGET_NAME, str);
    }
}