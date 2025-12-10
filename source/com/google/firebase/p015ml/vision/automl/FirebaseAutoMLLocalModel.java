package com.google.firebase.p015ml.vision.automl;

import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.Preconditions;
import com.google.firebase.p015ml.common.modeldownload.FirebaseLocalModel;

@Deprecated
/* renamed from: com.google.firebase.ml.vision.automl.FirebaseAutoMLLocalModel */
/* loaded from: classes4.dex */
public class FirebaseAutoMLLocalModel extends FirebaseLocalModel {

    /* renamed from: com.google.firebase.ml.vision.automl.FirebaseAutoMLLocalModel$Builder */
    /* loaded from: classes4.dex */
    public static class Builder {

        /* renamed from: a */
        public String f55826a = null;

        /* renamed from: b */
        public String f55827b = null;

        @NonNull
        public FirebaseAutoMLLocalModel build() {
            boolean z;
            String str = this.f55826a;
            if ((str != null && this.f55827b == null) || (str == null && this.f55827b != null)) {
                z = true;
            } else {
                z = false;
            }
            Preconditions.checkArgument(z, "Set either filePath or assetFilePath.");
            return new FirebaseAutoMLLocalModel(this.f55826a, this.f55827b);
        }

        @NonNull
        public Builder setAssetFilePath(@NonNull String str) {
            boolean z;
            Preconditions.checkNotEmpty(str, "Model Source file path can not be empty");
            if (this.f55826a == null) {
                z = true;
            } else {
                z = false;
            }
            Preconditions.checkArgument(z, "A local model source is either from local file or for asset, you can not set both.");
            this.f55827b = str;
            return this;
        }

        @NonNull
        public Builder setFilePath(@NonNull String str) {
            boolean z;
            Preconditions.checkNotEmpty(str, "Model Source file path can not be empty");
            if (this.f55827b == null) {
                z = true;
            } else {
                z = false;
            }
            Preconditions.checkArgument(z, "A local model source is either from local file or for asset, you can not set both.");
            this.f55826a = str;
            return this;
        }
    }

    public FirebaseAutoMLLocalModel(String str, String str2) {
        super(null, str, str2);
    }
}
