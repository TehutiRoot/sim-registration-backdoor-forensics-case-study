package com.google.firebase.p015ml.vision.document;

import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: com.google.firebase.ml.vision.document.FirebaseVisionCloudDocumentRecognizerOptions */
/* loaded from: classes4.dex */
public class FirebaseVisionCloudDocumentRecognizerOptions {

    /* renamed from: a */
    public final List f55938a;

    /* renamed from: b */
    public final boolean f55939b;

    /* renamed from: com.google.firebase.ml.vision.document.FirebaseVisionCloudDocumentRecognizerOptions$Builder */
    /* loaded from: classes4.dex */
    public static class Builder {

        /* renamed from: a */
        public List f55940a = new ArrayList();

        /* renamed from: b */
        public boolean f55941b = false;

        @NonNull
        public FirebaseVisionCloudDocumentRecognizerOptions build() {
            return new FirebaseVisionCloudDocumentRecognizerOptions(this.f55940a, this.f55941b);
        }

        @NonNull
        public Builder enforceCertFingerprintMatch() {
            this.f55941b = true;
            return this;
        }

        @NonNull
        public Builder setLanguageHints(@NonNull List<String> list) {
            Preconditions.checkNotNull(list, "Provided hinted languages can not be null");
            this.f55940a = list;
            Collections.sort(list);
            return this;
        }
    }

    public FirebaseVisionCloudDocumentRecognizerOptions(List list, boolean z) {
        Preconditions.checkNotNull(list, "Provided hinted languages can not be null");
        this.f55938a = list;
        this.f55939b = z;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof FirebaseVisionCloudDocumentRecognizerOptions)) {
            return false;
        }
        FirebaseVisionCloudDocumentRecognizerOptions firebaseVisionCloudDocumentRecognizerOptions = (FirebaseVisionCloudDocumentRecognizerOptions) obj;
        if (this.f55938a.equals(firebaseVisionCloudDocumentRecognizerOptions.getHintedLanguages()) && this.f55939b == firebaseVisionCloudDocumentRecognizerOptions.f55939b) {
            return true;
        }
        return false;
    }

    @NonNull
    public List<String> getHintedLanguages() {
        return this.f55938a;
    }

    public int hashCode() {
        return Objects.hashCode(this.f55938a, Boolean.valueOf(this.f55939b));
    }

    public final boolean isEnforceCertFingerprintMatch() {
        return this.f55939b;
    }
}
