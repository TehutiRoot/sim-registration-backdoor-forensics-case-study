package com.google.firebase.p015ml.common.modeldownload;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.firebase_ml.zznq;
import com.google.android.gms.internal.firebase_ml.zzxh;
import com.google.firebase.p015ml.common.internal.modeldownload.zzn;

/* renamed from: com.google.firebase.ml.common.modeldownload.FirebaseLocalModel */
/* loaded from: classes4.dex */
public class FirebaseLocalModel {

    /* renamed from: a */
    public final String f55796a;

    /* renamed from: b */
    public final String f55797b;

    /* renamed from: c */
    public final String f55798c;

    /* renamed from: com.google.firebase.ml.common.modeldownload.FirebaseLocalModel$Builder */
    /* loaded from: classes4.dex */
    public static class Builder {

        /* renamed from: a */
        public final String f55799a;

        /* renamed from: b */
        public String f55800b = null;

        /* renamed from: c */
        public String f55801c = null;

        public Builder(@NonNull String str) {
            Preconditions.checkNotEmpty(str, "Model name can not be empty");
            this.f55799a = str;
        }

        @NonNull
        public FirebaseLocalModel build() {
            boolean z;
            String str = this.f55800b;
            if ((str != null && this.f55801c == null) || (str == null && this.f55801c != null)) {
                z = true;
            } else {
                z = false;
            }
            Preconditions.checkArgument(z, "Set either filePath or assetFilePath.");
            return new FirebaseLocalModel(this.f55799a, this.f55800b, this.f55801c);
        }

        @NonNull
        public Builder setAssetFilePath(@NonNull String str) {
            boolean z;
            Preconditions.checkNotEmpty(str, "Model Source file path can not be empty");
            if (this.f55800b == null) {
                z = true;
            } else {
                z = false;
            }
            Preconditions.checkArgument(z, "A local model source is either from local file or for asset, you can not set both.");
            this.f55801c = str;
            return this;
        }

        @NonNull
        public Builder setFilePath(@NonNull String str) {
            boolean z;
            Preconditions.checkNotEmpty(str, "Model Source file path can not be empty");
            if (this.f55801c == null) {
                z = true;
            } else {
                z = false;
            }
            Preconditions.checkArgument(z, "A local model source is either from local file or for asset, you can not set both.");
            this.f55800b = str;
            return this;
        }
    }

    @KeepForSdk
    public FirebaseLocalModel(@NonNull String str, @Nullable String str2, @Nullable String str3) {
        this.f55796a = str;
        this.f55797b = str2;
        this.f55798c = str3;
    }

    public boolean equals(@Nullable Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof FirebaseLocalModel)) {
            return false;
        }
        FirebaseLocalModel firebaseLocalModel = (FirebaseLocalModel) obj;
        if (!Objects.equal(this.f55796a, firebaseLocalModel.f55796a) || !Objects.equal(this.f55797b, firebaseLocalModel.f55797b) || !Objects.equal(this.f55798c, firebaseLocalModel.f55798c)) {
            return false;
        }
        return true;
    }

    @Nullable
    @KeepForSdk
    public String getAssetFilePath() {
        return this.f55798c;
    }

    @Nullable
    @KeepForSdk
    public String getFilePath() {
        return this.f55797b;
    }

    public int hashCode() {
        return Objects.hashCode(this.f55796a, this.f55797b, this.f55798c);
    }

    public final zznq.zzam zza(zzn zznVar) {
        zznq.zzal.zzc zzcVar;
        zznq.zzam.zzb zzmv = zznq.zzam.zzmv();
        zznq.zzal.zzb zzd = zznq.zzal.zzmt().zzd(zznVar.zzph());
        String str = this.f55797b;
        if (str == null) {
            str = this.f55798c;
        }
        zznq.zzal.zzb zzbg = zzd.zzbg(str);
        if (this.f55797b != null) {
            zzcVar = zznq.zzal.zzc.LOCAL;
        } else if (this.f55798c != null) {
            zzcVar = zznq.zzal.zzc.APP_ASSET;
        } else {
            zzcVar = zznq.zzal.zzc.SOURCE_UNKNOWN;
        }
        return (zznq.zzam) ((zzxh) zzmv.zza(zzbg.zzb(zzcVar)).zzvn());
    }
}
