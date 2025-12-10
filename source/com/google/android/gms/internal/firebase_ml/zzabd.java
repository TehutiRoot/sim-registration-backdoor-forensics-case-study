package com.google.android.gms.internal.firebase_ml;

import kotlin.text.Typography;

/* loaded from: classes3.dex */
public enum zzabd implements zzxk {
    DELEGATE_NONE(0),
    NNAPI(1),
    GPU(2),
    HEXAGON(3),
    EDGETPU(4);
    
    private static final zzxn<zzabd> zzac = new zzxn() { // from class: Oa2
    };
    private final int value;

    zzabd(int i) {
        this.value = i;
    }

    public static zzabd zzel(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            return null;
                        }
                        return EDGETPU;
                    }
                    return HEXAGON;
                }
                return GPU;
            }
            return NNAPI;
        }
        return DELEGATE_NONE;
    }

    public static zzxm zzf() {
        return C18095Na2.f4142a;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "<" + zzabd.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.value + " name=" + name() + Typography.greater;
    }

    @Override // com.google.android.gms.internal.firebase_ml.zzxk
    public final int zzd() {
        return this.value;
    }
}
