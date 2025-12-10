package com.google.android.gms.internal.firebase_ml;

import kotlin.text.Typography;

/* loaded from: classes3.dex */
public enum zzabt implements zzxk {
    NNAPI_EXECUTION_PRIORITY_UNDEFINED(0),
    NNAPI_EXECUTION_PRIORITY_LOW(1),
    NNAPI_EXECUTION_PRIORITY_MEDIUM(2),
    NNAPI_EXECUTION_PRIORITY_HIGH(3);
    
    private static final zzxn<zzabt> zzac = new zzxn() { // from class: Xa2
    };
    private final int value;

    zzabt(int i) {
        this.value = i;
    }

    public static zzabt zzeq(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        return null;
                    }
                    return NNAPI_EXECUTION_PRIORITY_HIGH;
                }
                return NNAPI_EXECUTION_PRIORITY_MEDIUM;
            }
            return NNAPI_EXECUTION_PRIORITY_LOW;
        }
        return NNAPI_EXECUTION_PRIORITY_UNDEFINED;
    }

    public static zzxm zzf() {
        return C18799Ya2.f7789a;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "<" + zzabt.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.value + " name=" + name() + Typography.greater;
    }

    @Override // com.google.android.gms.internal.firebase_ml.zzxk
    public final int zzd() {
        return this.value;
    }
}
