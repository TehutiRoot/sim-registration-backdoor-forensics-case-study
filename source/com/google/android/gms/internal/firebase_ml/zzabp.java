package com.google.android.gms.internal.firebase_ml;

import kotlin.text.Typography;

/* loaded from: classes3.dex */
public enum zzabp implements zzxk {
    NNAPI_EXECUTION_PREFERENCE_UNDEFINED(0),
    NNAPI_EXECUTION_PREFERENCE_LOW_POWER(1),
    NNAPI_EXECUTION_PREFERENCE_FAST_SINGLE_ANSWER(2),
    NNAPI_EXECUTION_PREFERENCE_SUSTAINED_SPEED(3);
    
    private static final zzxn<zzabp> zzac = new zzxn() { // from class: Wa2
    };
    private final int value;

    zzabp(int i) {
        this.value = i;
    }

    public static zzabp zzep(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        return null;
                    }
                    return NNAPI_EXECUTION_PREFERENCE_SUSTAINED_SPEED;
                }
                return NNAPI_EXECUTION_PREFERENCE_FAST_SINGLE_ANSWER;
            }
            return NNAPI_EXECUTION_PREFERENCE_LOW_POWER;
        }
        return NNAPI_EXECUTION_PREFERENCE_UNDEFINED;
    }

    public static zzxm zzf() {
        return C18607Va2.f6747a;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "<" + zzabp.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.value + " name=" + name() + Typography.greater;
    }

    @Override // com.google.android.gms.internal.firebase_ml.zzxk
    public final int zzd() {
        return this.value;
    }
}
