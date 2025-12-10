package com.google.mlkit.vision.text.internal;

import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.mlkit.common.sdkinternal.MlKitContext;
import java.util.concurrent.atomic.AtomicReference;

@KeepForSdk
/* loaded from: classes4.dex */
public final class TextRecognizerOptionsUtils {
    @KeepForSdk
    public static boolean isThickClient(@NonNull AtomicReference<Boolean> atomicReference, @NonNull String str) {
        boolean z;
        if (atomicReference.get() != null) {
            return atomicReference.get().booleanValue();
        }
        if (DynamiteModule.getLocalVersion(MlKitContext.getInstance().getApplicationContext(), str) > 0) {
            z = true;
        } else {
            z = false;
        }
        atomicReference.set(Boolean.valueOf(z));
        return z;
    }
}
