package com.google.mlkit.common.model;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.internal.mlkit_common.zzq;
import com.google.android.gms.internal.mlkit_common.zzr;

/* loaded from: classes4.dex */
public abstract class RemoteModelSource {

    /* renamed from: a */
    public final String f56904a;

    @KeepForSdk
    public RemoteModelSource(@Nullable String str) {
        this.f56904a = str;
    }

    public boolean equals(@Nullable Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null) {
            if (obj.getClass().equals(getClass())) {
                return Objects.equal(this.f56904a, ((RemoteModelSource) obj).f56904a);
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        return Objects.hashCode(this.f56904a);
    }

    @NonNull
    public String toString() {
        zzq zzb = zzr.zzb("RemoteModelSource");
        zzb.zza("firebaseModelName", this.f56904a);
        return zzb.toString();
    }

    @Nullable
    public final String zza() {
        return this.f56904a;
    }
}
