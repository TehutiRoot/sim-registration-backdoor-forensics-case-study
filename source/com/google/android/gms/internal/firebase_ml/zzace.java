package com.google.android.gms.internal.firebase_ml;

import kotlin.text.Typography;

/* loaded from: classes3.dex */
public enum zzace implements zzxk {
    UNKNOWN_EVENT_TYPE(0),
    VALIDATION_TEST(1),
    CONTINUOUS_FEEDBACK(2);
    
    private static final zzxn<zzace> zzac = new zzxn() { // from class: fb2
    };
    private final int value;

    zzace(int i) {
        this.value = i;
    }

    public static zzace zzeu(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    return null;
                }
                return CONTINUOUS_FEEDBACK;
            }
            return VALIDATION_TEST;
        }
        return UNKNOWN_EVENT_TYPE;
    }

    public static zzxm zzf() {
        return C20062gb2.f62205a;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "<" + zzace.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.value + " name=" + name() + Typography.greater;
    }

    @Override // com.google.android.gms.internal.firebase_ml.zzxk
    public final int zzd() {
        return this.value;
    }
}
