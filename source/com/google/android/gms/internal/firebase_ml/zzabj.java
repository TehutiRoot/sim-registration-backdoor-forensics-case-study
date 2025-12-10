package com.google.android.gms.internal.firebase_ml;

import kotlin.text.Typography;

/* loaded from: classes3.dex */
public enum zzabj implements zzxk {
    GPU_BACKEND_UNSET(0),
    GPU_BACKEND_OPENCL(1),
    GPU_BACKEND_OPENGL(2);
    
    private static final zzxn<zzabj> zzac = new zzxn() { // from class: Sa2
    };
    private final int value;

    zzabj(int i) {
        this.value = i;
    }

    public static zzabj zzen(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    return null;
                }
                return GPU_BACKEND_OPENGL;
            }
            return GPU_BACKEND_OPENCL;
        }
        return GPU_BACKEND_UNSET;
    }

    public static zzxm zzf() {
        return C18351Ra2.f5367a;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "<" + zzabj.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.value + " name=" + name() + Typography.greater;
    }

    @Override // com.google.android.gms.internal.firebase_ml.zzxk
    public final int zzd() {
        return this.value;
    }
}
