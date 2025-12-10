package com.google.mlkit.common.sdkinternal;

import android.net.Uri;
import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;

@KeepForSdk
/* loaded from: classes4.dex */
public class ModelInfo {

    /* renamed from: a */
    public final String f56934a;

    /* renamed from: b */
    public final Uri f56935b;

    /* renamed from: c */
    public final String f56936c;

    /* renamed from: d */
    public final ModelType f56937d;

    @KeepForSdk
    public ModelInfo(@NonNull String str, @NonNull Uri uri, @NonNull String str2, @NonNull ModelType modelType) {
        this.f56934a = str;
        this.f56935b = uri;
        this.f56936c = str2;
        this.f56937d = modelType;
    }

    @NonNull
    @KeepForSdk
    public String getModelHash() {
        return this.f56936c;
    }

    @NonNull
    @KeepForSdk
    public String getModelNameForPersist() {
        return this.f56934a;
    }

    @NonNull
    @KeepForSdk
    public ModelType getModelType() {
        return this.f56937d;
    }

    @NonNull
    @KeepForSdk
    public Uri getModelUri() {
        return this.f56935b;
    }
}