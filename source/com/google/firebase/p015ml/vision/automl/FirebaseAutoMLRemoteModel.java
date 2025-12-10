package com.google.firebase.p015ml.vision.automl;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.Preconditions;
import com.google.firebase.p015ml.common.modeldownload.FirebaseRemoteModel;

@Deprecated
/* renamed from: com.google.firebase.ml.vision.automl.FirebaseAutoMLRemoteModel */
/* loaded from: classes4.dex */
public class FirebaseAutoMLRemoteModel extends FirebaseRemoteModel {

    /* renamed from: com.google.firebase.ml.vision.automl.FirebaseAutoMLRemoteModel$Builder */
    /* loaded from: classes4.dex */
    public static class Builder {

        /* renamed from: a */
        public final String f55828a;

        public Builder(@NonNull String str) {
            this.f55828a = str;
        }

        @NonNull
        public FirebaseAutoMLRemoteModel build() {
            Preconditions.checkArgument(!TextUtils.isEmpty(this.f55828a), "Model name cannot be empty");
            return new FirebaseAutoMLRemoteModel(this.f55828a);
        }
    }

    public FirebaseAutoMLRemoteModel(String str) {
        super(str, null);
    }
}
