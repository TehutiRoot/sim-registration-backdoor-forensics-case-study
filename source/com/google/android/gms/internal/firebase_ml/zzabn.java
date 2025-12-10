package com.google.android.gms.internal.firebase_ml;

import kotlin.text.Typography;

/* loaded from: classes3.dex */
public enum zzabn implements zzxk {
    HANG_DETECTION_DEFAULT(0),
    HANG_DETECTION_NONE(1),
    HANG_DETECTION_LOG_ONLY(2),
    HANG_DETECTION_CRASH_PROCESS(3),
    HANG_DETECTION_ABANDON_THREAD(4);
    
    private static final zzxn<zzabn> zzac = new zzxn() { // from class: Ta2
    };
    private final int value;

    zzabn(int i) {
        this.value = i;
    }

    public static zzabn zzeo(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            return null;
                        }
                        return HANG_DETECTION_ABANDON_THREAD;
                    }
                    return HANG_DETECTION_CRASH_PROCESS;
                }
                return HANG_DETECTION_LOG_ONLY;
            }
            return HANG_DETECTION_NONE;
        }
        return HANG_DETECTION_DEFAULT;
    }

    public static zzxm zzf() {
        return C18543Ua2.f6368a;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "<" + zzabn.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.value + " name=" + name() + Typography.greater;
    }

    @Override // com.google.android.gms.internal.firebase_ml.zzxk
    public final int zzd() {
        return this.value;
    }
}
