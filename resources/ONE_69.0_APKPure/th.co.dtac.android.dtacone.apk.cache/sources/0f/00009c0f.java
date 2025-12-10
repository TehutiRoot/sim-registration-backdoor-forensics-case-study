package com.google.android.gms.internal.vision;

import android.content.Context;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.mlkit.common.sdkinternal.OptionalModuleUtils;

/* loaded from: classes3.dex */
public final class zzu {
    public static boolean zza(Context context, String str) {
        if (DynamiteModule.getLocalVersion(context, str) > DynamiteModule.getRemoteVersion(context, OptionalModuleUtils.DEPRECATED_DYNAMITE_MODULE_ID)) {
            return true;
        }
        return false;
    }
}