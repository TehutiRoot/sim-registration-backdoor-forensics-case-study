package com.google.firebase.p015ml.common.internal.modeldownload;

import android.net.Uri;
import androidx.annotation.NonNull;

/* renamed from: com.google.firebase.ml.common.internal.modeldownload.zzac */
/* loaded from: classes4.dex */
public final class zzac {

    /* renamed from: a */
    public final String f55745a;

    /* renamed from: b */
    public final Uri f55746b;

    /* renamed from: c */
    public final String f55747c;

    /* renamed from: d */
    public final zzn f55748d;

    public zzac(@NonNull String str, @NonNull Uri uri, @NonNull String str2, @NonNull zzn zznVar) {
        this.f55745a = str;
        this.f55746b = uri;
        this.f55747c = str2;
        this.f55748d = zznVar;
    }

    public final String getModelHash() {
        return this.f55747c;
    }

    public final String zzpw() {
        return this.f55745a;
    }

    public final zzn zzpx() {
        return this.f55748d;
    }
}
