package com.google.android.gms.internal.firebase_ml;

import kotlin.text.Typography;

/* loaded from: classes3.dex */
public enum zzabh implements zzxk {
    ANY_EXECUTION_PREFERENCE(0),
    LOW_LATENCY(1),
    LOW_POWER(2),
    FORCE_CPU(3);
    
    private final int value;
    private static final zzabh zzcwa = ANY_EXECUTION_PREFERENCE;
    private static final zzxn<zzabh> zzac = new zzxn() { // from class: Pa2
    };

    zzabh(int i) {
        this.value = i;
    }

    public static zzabh zzem(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        return null;
                    }
                    return FORCE_CPU;
                }
                return LOW_POWER;
            }
            return LOW_LATENCY;
        }
        return ANY_EXECUTION_PREFERENCE;
    }

    public static zzxm zzf() {
        return C18287Qa2.f5088a;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "<" + zzabh.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.value + " name=" + name() + Typography.greater;
    }

    @Override // com.google.android.gms.internal.firebase_ml.zzxk
    public final int zzd() {
        return this.value;
    }
}
