package com.google.android.gms.common.internal;

import android.content.Context;
import android.content.res.Resources;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.google.android.gms.common.R;
import com.google.android.gms.common.annotation.KeepForSdk;

@KeepForSdk
/* loaded from: classes3.dex */
public class StringResourceValueReader {

    /* renamed from: a */
    public final Resources f45124a;

    /* renamed from: b */
    public final String f45125b;

    public StringResourceValueReader(@NonNull Context context) {
        Preconditions.checkNotNull(context);
        Resources resources = context.getResources();
        this.f45124a = resources;
        this.f45125b = resources.getResourcePackageName(R.string.common_google_play_services_unknown_issue);
    }

    @Nullable
    @KeepForSdk
    public String getString(@NonNull String str) {
        int identifier = this.f45124a.getIdentifier(str, TypedValues.Custom.S_STRING, this.f45125b);
        if (identifier == 0) {
            return null;
        }
        return this.f45124a.getString(identifier);
    }
}
