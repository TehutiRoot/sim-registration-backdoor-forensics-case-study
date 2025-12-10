package com.google.mlkit.common.sdkinternal;

import android.net.Uri;
import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;

@KeepForSdk
/* loaded from: classes4.dex */
public class ModelInfo {

    /* renamed from: a */
    public final String f56922a;

    /* renamed from: b */
    public final Uri f56923b;

    /* renamed from: c */
    public final String f56924c;

    /* renamed from: d */
    public final ModelType f56925d;

    @KeepForSdk
    public ModelInfo(@NonNull String str, @NonNull Uri uri, @NonNull String str2, @NonNull ModelType modelType) {
        this.f56922a = str;
        this.f56923b = uri;
        this.f56924c = str2;
        this.f56925d = modelType;
    }

    @NonNull
    @KeepForSdk
    public String getModelHash() {
        return this.f56924c;
    }

    @NonNull
    @KeepForSdk
    public String getModelNameForPersist() {
        return this.f56922a;
    }

    @NonNull
    @KeepForSdk
    public ModelType getModelType() {
        return this.f56925d;
    }

    @NonNull
    @KeepForSdk
    public Uri getModelUri() {
        return this.f56923b;
    }
}
