package com.google.mlkit.common.model;

import android.net.Uri;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.mlkit_common.zzq;
import com.google.android.gms.internal.mlkit_common.zzr;

/* loaded from: classes4.dex */
public class LocalModel {

    /* renamed from: a */
    public final String f56888a;

    /* renamed from: b */
    public final String f56889b;

    /* renamed from: c */
    public final Uri f56890c;

    /* renamed from: d */
    public final boolean f56891d;

    /* loaded from: classes4.dex */
    public static class Builder {

        /* renamed from: a */
        public String f56892a = null;

        /* renamed from: b */
        public String f56893b = null;

        /* renamed from: c */
        public Uri f56894c = null;

        /* renamed from: d */
        public boolean f56895d = false;

        @NonNull
        public LocalModel build() {
            String str = this.f56892a;
            boolean z = true;
            if ((str == null || this.f56893b != null || this.f56894c != null) && ((str != null || this.f56893b == null || this.f56894c != null) && (str != null || this.f56893b != null || this.f56894c == null))) {
                z = false;
            }
            Preconditions.checkArgument(z, "Set one of filePath, assetFilePath and URI.");
            return new LocalModel(this.f56892a, this.f56893b, this.f56894c, this.f56895d, null);
        }

        @NonNull
        public Builder setAbsoluteFilePath(@NonNull String str) {
            Preconditions.checkNotEmpty(str, "Model Source file path can not be empty");
            boolean z = false;
            if (this.f56893b == null && this.f56894c == null && !this.f56895d) {
                z = true;
            }
            Preconditions.checkArgument(z, "A local model source is from absolute file path, asset file path or URI, you can only set one of them.");
            this.f56892a = str;
            return this;
        }

        @NonNull
        public Builder setAbsoluteManifestFilePath(@NonNull String str) {
            Preconditions.checkNotEmpty(str, "Manifest file path can not be empty");
            boolean z = false;
            if (this.f56893b == null && this.f56894c == null && (this.f56892a == null || this.f56895d)) {
                z = true;
            }
            Preconditions.checkArgument(z, "A local model source is from absolute file path, asset file path or URI, you can only set one of them.");
            this.f56892a = str;
            this.f56895d = true;
            return this;
        }

        @NonNull
        public Builder setAssetFilePath(@NonNull String str) {
            Preconditions.checkNotEmpty(str, "Model Source file path can not be empty");
            boolean z = false;
            if (this.f56892a == null && this.f56894c == null && !this.f56895d) {
                z = true;
            }
            Preconditions.checkArgument(z, "A local model source is from absolute file path, asset file path or URI, you can only set one of them.");
            this.f56893b = str;
            return this;
        }

        @NonNull
        public Builder setAssetManifestFilePath(@NonNull String str) {
            Preconditions.checkNotEmpty(str, "Manifest file path can not be empty");
            boolean z = false;
            if (this.f56892a == null && this.f56894c == null && (this.f56893b == null || this.f56895d)) {
                z = true;
            }
            Preconditions.checkArgument(z, "A local model source is from absolute file path, asset file path or URI, you can only set one of them.");
            this.f56893b = str;
            this.f56895d = true;
            return this;
        }

        @NonNull
        public Builder setUri(@NonNull Uri uri) {
            boolean z = false;
            if (this.f56892a == null && this.f56893b == null) {
                z = true;
            }
            Preconditions.checkArgument(z, "A local model source is from absolute file path, asset file path or URI, you can only set one of them.");
            this.f56894c = uri;
            return this;
        }
    }

    public /* synthetic */ LocalModel(String str, String str2, Uri uri, boolean z, zzc zzcVar) {
        this.f56888a = str;
        this.f56889b = str2;
        this.f56890c = uri;
        this.f56891d = z;
    }

    public boolean equals(@Nullable Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof LocalModel)) {
            return false;
        }
        LocalModel localModel = (LocalModel) obj;
        if (!Objects.equal(this.f56888a, localModel.f56888a) || !Objects.equal(this.f56889b, localModel.f56889b) || !Objects.equal(this.f56890c, localModel.f56890c) || this.f56891d != localModel.f56891d) {
            return false;
        }
        return true;
    }

    @Nullable
    @KeepForSdk
    public String getAbsoluteFilePath() {
        return this.f56888a;
    }

    @Nullable
    @KeepForSdk
    public String getAssetFilePath() {
        return this.f56889b;
    }

    @Nullable
    @KeepForSdk
    public Uri getUri() {
        return this.f56890c;
    }

    public int hashCode() {
        return Objects.hashCode(this.f56888a, this.f56889b, this.f56890c, Boolean.valueOf(this.f56891d));
    }

    @KeepForSdk
    public boolean isManifestFile() {
        return this.f56891d;
    }

    @NonNull
    public String toString() {
        zzq zza = zzr.zza(this);
        zza.zza("absoluteFilePath", this.f56888a);
        zza.zza("assetFilePath", this.f56889b);
        zza.zza("uri", this.f56890c);
        zza.zzb("isManifestFile", this.f56891d);
        return zza.toString();
    }
}
