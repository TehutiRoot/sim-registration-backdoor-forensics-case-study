package androidx.camera.core.impl;

import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;

@RequiresApi(21)
/* loaded from: classes.dex */
public class CameraCaptureFailure {

    /* renamed from: a */
    public final Reason f11090a;

    /* loaded from: classes.dex */
    public enum Reason {
        ERROR
    }

    public CameraCaptureFailure(@NonNull Reason reason) {
        this.f11090a = reason;
    }

    @NonNull
    public Reason getReason() {
        return this.f11090a;
    }
}
