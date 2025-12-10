package com.google.firebase.p015ml.common.modeldownload;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import java.util.EnumMap;
import java.util.Map;

/* renamed from: com.google.firebase.ml.common.modeldownload.FirebaseRemoteModel */
/* loaded from: classes4.dex */
public class FirebaseRemoteModel {

    /* renamed from: d */
    public static final Map f55811d;

    /* renamed from: e */
    public static final Map f55812e;

    /* renamed from: a */
    public final String f55813a;

    /* renamed from: b */
    public final BaseModel f55814b;

    /* renamed from: c */
    public String f55815c;

    static {
        EnumMap enumMap = new EnumMap(BaseModel.class);
        f55811d = enumMap;
        EnumMap enumMap2 = new EnumMap(BaseModel.class);
        f55812e = enumMap2;
        BaseModel baseModel = BaseModel.FACE_DETECTION;
        enumMap2.put((EnumMap) baseModel, (BaseModel) "face_detector_model_m41");
        BaseModel baseModel2 = BaseModel.SMART_REPLY;
        enumMap2.put((EnumMap) baseModel2, (BaseModel) "smart_reply_model_m41");
        BaseModel baseModel3 = BaseModel.TRANSLATE;
        enumMap2.put((EnumMap) baseModel3, (BaseModel) "translate_model_m41");
        enumMap.put((EnumMap) baseModel, (BaseModel) "modelHash");
        enumMap.put((EnumMap) baseModel2, (BaseModel) "smart_reply_model_hash");
        enumMap.put((EnumMap) baseModel3, (BaseModel) "modelHash");
    }

    @KeepForSdk
    public FirebaseRemoteModel(@Nullable String str, @Nullable BaseModel baseModel) {
        boolean z;
        boolean isEmpty = TextUtils.isEmpty(str);
        if (baseModel != null) {
            z = true;
        } else {
            z = false;
        }
        Preconditions.checkArgument(isEmpty == z, "One of cloud model name and base model cannot be empty");
        this.f55813a = str;
        this.f55814b = baseModel;
    }

    @KeepForSdk
    public boolean baseModelHashMatches(@NonNull String str) {
        BaseModel baseModel = this.f55814b;
        if (baseModel == null) {
            return false;
        }
        return str.equals(f55811d.get(baseModel));
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof FirebaseRemoteModel)) {
            return false;
        }
        FirebaseRemoteModel firebaseRemoteModel = (FirebaseRemoteModel) obj;
        if (Objects.equal(this.f55813a, firebaseRemoteModel.f55813a) && Objects.equal(this.f55814b, firebaseRemoteModel.f55814b)) {
            return true;
        }
        return false;
    }

    @KeepForSdk
    public String getModelHash() {
        return this.f55815c;
    }

    @Nullable
    @KeepForSdk
    public String getModelName() {
        return this.f55813a;
    }

    @KeepForSdk
    public String getModelNameForBackend() {
        String str = this.f55813a;
        if (str != null) {
            return str;
        }
        return (String) f55812e.get(this.f55814b);
    }

    @KeepForSdk
    public String getUniqueModelNameForPersist() {
        String str = this.f55813a;
        if (str != null) {
            return str;
        }
        String valueOf = String.valueOf((String) f55812e.get(this.f55814b));
        if (valueOf.length() != 0) {
            return "COM.GOOGLE.BASE_".concat(valueOf);
        }
        return new String("COM.GOOGLE.BASE_");
    }

    public int hashCode() {
        return Objects.hashCode(this.f55813a, this.f55814b);
    }

    @KeepForSdk
    public boolean isBaseModel() {
        if (this.f55814b != null) {
            return true;
        }
        return false;
    }

    @KeepForSdk
    public void setModelHash(@NonNull String str) {
        this.f55815c = str;
    }
}
