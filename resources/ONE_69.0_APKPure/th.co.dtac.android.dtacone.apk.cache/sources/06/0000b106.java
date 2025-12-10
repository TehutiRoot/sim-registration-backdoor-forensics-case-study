package com.google.firebase.p015ml.common.internal.modeldownload;

import android.net.Uri;
import androidx.annotation.NonNull;

/* renamed from: com.google.firebase.ml.common.internal.modeldownload.zzac */
/* loaded from: classes4.dex */
public final class zzac {

    /* renamed from: a */
    public final String f55757a;

    /* renamed from: b */
    public final Uri f55758b;

    /* renamed from: c */
    public final String f55759c;

    /* renamed from: d */
    public final zzn f55760d;

    public zzac(@NonNull String str, @NonNull Uri uri, @NonNull String str2, @NonNull zzn zznVar) {
        this.f55757a = str;
        this.f55758b = uri;
        this.f55759c = str2;
        this.f55760d = zznVar;
    }

    public final String getModelHash() {
        return this.f55759c;
    }

    public final String zzpw() {
        return this.f55757a;
    }

    public final zzn zzpx() {
        return this.f55760d;
    }
}