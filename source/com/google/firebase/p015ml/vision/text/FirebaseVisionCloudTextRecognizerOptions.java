package com.google.firebase.p015ml.vision.text;

import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: com.google.firebase.ml.vision.text.FirebaseVisionCloudTextRecognizerOptions */
/* loaded from: classes4.dex */
public class FirebaseVisionCloudTextRecognizerOptions {
    public static final int DENSE_MODEL = 2;
    public static final int SPARSE_MODEL = 1;

    /* renamed from: a */
    public final List f56024a;

    /* renamed from: b */
    public final int f56025b;

    /* renamed from: c */
    public final boolean f56026c;

    /* renamed from: com.google.firebase.ml.vision.text.FirebaseVisionCloudTextRecognizerOptions$Builder */
    /* loaded from: classes4.dex */
    public static class Builder {

        /* renamed from: a */
        public List f56027a = new ArrayList();

        /* renamed from: b */
        public int f56028b = 1;

        /* renamed from: c */
        public boolean f56029c = false;

        @NonNull
        public FirebaseVisionCloudTextRecognizerOptions build() {
            return new FirebaseVisionCloudTextRecognizerOptions(this.f56027a, this.f56028b, this.f56029c);
        }

        @NonNull
        public Builder enforceCertFingerprintMatch() {
            this.f56029c = true;
            return this;
        }

        @NonNull
        public Builder setLanguageHints(@NonNull List<String> list) {
            Preconditions.checkNotNull(list, "Provided hinted languages can not be null");
            this.f56027a = list;
            Collections.sort(list);
            return this;
        }

        @NonNull
        public Builder setModelType(@CloudTextModelType int i) {
            boolean z = true;
            if (i != 1 && i != 2) {
                z = false;
            }
            Preconditions.checkArgument(z, "modelType should be either SPARSE_MODEL or DENSE_MODEL");
            this.f56028b = i;
            return this;
        }
    }

    @Retention(RetentionPolicy.CLASS)
    /* renamed from: com.google.firebase.ml.vision.text.FirebaseVisionCloudTextRecognizerOptions$CloudTextModelType */
    /* loaded from: classes4.dex */
    public @interface CloudTextModelType {
    }

    public FirebaseVisionCloudTextRecognizerOptions(List list, int i, boolean z) {
        Preconditions.checkNotNull(list, "Provided hinted languages can not be null");
        this.f56024a = list;
        this.f56025b = i;
        this.f56026c = z;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof FirebaseVisionCloudTextRecognizerOptions)) {
            return false;
        }
        FirebaseVisionCloudTextRecognizerOptions firebaseVisionCloudTextRecognizerOptions = (FirebaseVisionCloudTextRecognizerOptions) obj;
        if (this.f56024a.equals(firebaseVisionCloudTextRecognizerOptions.getHintedLanguages()) && this.f56025b == firebaseVisionCloudTextRecognizerOptions.f56025b && this.f56026c == firebaseVisionCloudTextRecognizerOptions.f56026c) {
            return true;
        }
        return false;
    }

    @NonNull
    public List<String> getHintedLanguages() {
        return this.f56024a;
    }

    @CloudTextModelType
    public int getModelType() {
        return this.f56025b;
    }

    public int hashCode() {
        return Objects.hashCode(this.f56024a, Integer.valueOf(this.f56025b), Boolean.valueOf(this.f56026c));
    }

    public final boolean isEnforceCertFingerprintMatch() {
        return this.f56026c;
    }
}
