package com.google.mlkit.common.model;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.mlkit_common.zzq;
import com.google.android.gms.internal.mlkit_common.zzr;
import com.google.mlkit.common.sdkinternal.ModelType;
import com.google.mlkit.common.sdkinternal.model.BaseModel;
import java.util.EnumMap;
import java.util.Map;

/* loaded from: classes4.dex */
public abstract class RemoteModel {

    /* renamed from: e */
    public static final Map f56896e = new EnumMap(BaseModel.class);
    @NonNull
    @VisibleForTesting
    public static final Map zza = new EnumMap(BaseModel.class);

    /* renamed from: a */
    public final String f56897a;

    /* renamed from: b */
    public final BaseModel f56898b;

    /* renamed from: c */
    public final ModelType f56899c;

    /* renamed from: d */
    public String f56900d;

    @KeepForSdk
    public RemoteModel(@Nullable String str, @Nullable BaseModel baseModel, @NonNull ModelType modelType) {
        boolean z;
        boolean isEmpty = TextUtils.isEmpty(str);
        if (baseModel == null) {
            z = false;
        } else {
            z = true;
        }
        Preconditions.checkArgument(isEmpty == z, "One of cloud model name and base model cannot be empty");
        this.f56897a = str;
        this.f56898b = baseModel;
        this.f56899c = modelType;
    }

    @KeepForSdk
    public boolean baseModelHashMatches(@NonNull String str) {
        BaseModel baseModel = this.f56898b;
        if (baseModel == null) {
            return false;
        }
        return str.equals(f56896e.get(baseModel));
    }

    public boolean equals(@Nullable Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof RemoteModel)) {
            return false;
        }
        RemoteModel remoteModel = (RemoteModel) obj;
        if (Objects.equal(this.f56897a, remoteModel.f56897a) && Objects.equal(this.f56898b, remoteModel.f56898b) && Objects.equal(this.f56899c, remoteModel.f56899c)) {
            return true;
        }
        return false;
    }

    @NonNull
    @KeepForSdk
    public String getModelHash() {
        return this.f56900d;
    }

    @Nullable
    @KeepForSdk
    public String getModelName() {
        return this.f56897a;
    }

    @NonNull
    @KeepForSdk
    public String getModelNameForBackend() {
        String str = this.f56897a;
        if (str != null) {
            return str;
        }
        return (String) zza.get(this.f56898b);
    }

    @NonNull
    @KeepForSdk
    public ModelType getModelType() {
        return this.f56899c;
    }

    @NonNull
    @KeepForSdk
    public String getUniqueModelNameForPersist() {
        String str = this.f56897a;
        if (str != null) {
            return str;
        }
        return "COM.GOOGLE.BASE_".concat(String.valueOf((String) zza.get(this.f56898b)));
    }

    public int hashCode() {
        return Objects.hashCode(this.f56897a, this.f56898b, this.f56899c);
    }

    @KeepForSdk
    public boolean isBaseModel() {
        return this.f56898b != null;
    }

    @KeepForSdk
    public void setModelHash(@NonNull String str) {
        this.f56900d = str;
    }

    @NonNull
    public String toString() {
        zzq zzb = zzr.zzb("RemoteModel");
        zzb.zza("modelName", this.f56897a);
        zzb.zza("baseModel", this.f56898b);
        zzb.zza("modelType", this.f56899c);
        return zzb.toString();
    }
}
