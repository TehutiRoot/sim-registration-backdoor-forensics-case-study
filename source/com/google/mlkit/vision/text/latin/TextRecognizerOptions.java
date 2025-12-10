package com.google.mlkit.vision.text.latin;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Objects;
import com.google.mlkit.common.sdkinternal.OptionalModuleUtils;
import com.google.mlkit.vision.text.TextRecognizerOptionsInterface;
import com.google.mlkit.vision.text.internal.TextRecognizerOptionsUtils;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import th.p047co.dtac.android.dtacone.util.constant.LanguageSupport;

/* loaded from: classes4.dex */
public class TextRecognizerOptions implements TextRecognizerOptionsInterface {
    @NonNull
    public static final TextRecognizerOptions DEFAULT_OPTIONS = new Builder().build();

    /* renamed from: b */
    public final Executor f57184b;

    /* renamed from: a */
    public final AtomicReference f57183a = new AtomicReference();

    /* renamed from: c */
    public final String f57185c = "taser_tflite_gocrlatin_mbv2_scriptid_aksara_layout_gcn_mobile";

    /* loaded from: classes4.dex */
    public static class Builder {

        /* renamed from: a */
        public Executor f57186a;

        @NonNull
        public TextRecognizerOptions build() {
            return new TextRecognizerOptions(this.f57186a, "taser_tflite_gocrlatin_mbv2_scriptid_aksara_layout_gcn_mobile");
        }

        @NonNull
        public Builder setExecutor(@NonNull Executor executor) {
            this.f57186a = executor;
            return this;
        }
    }

    public TextRecognizerOptions(@Nullable Executor executor, @NonNull String str) {
        this.f57184b = executor;
    }

    public boolean equals(@Nullable Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof TextRecognizerOptions)) {
            return false;
        }
        return Objects.equal(this.f57184b, ((TextRecognizerOptions) obj).f57184b);
    }

    @Override // com.google.mlkit.vision.text.TextRecognizerOptionsInterface
    @NonNull
    public final String getConfigLabel() {
        return this.f57185c;
    }

    @Override // com.google.mlkit.vision.text.TextRecognizerOptionsInterface
    @Nullable
    public final Executor getExecutor() {
        return this.f57184b;
    }

    @Override // com.google.mlkit.vision.text.TextRecognizerOptionsInterface
    public final boolean getIsThickClient() {
        return TextRecognizerOptionsUtils.isThickClient(this.f57183a, "com.google.mlkit.dynamite.text.latin");
    }

    @Override // com.google.mlkit.vision.text.TextRecognizerOptionsInterface
    @NonNull
    public final String getLanguageHint() {
        return LanguageSupport.LANG_EN;
    }

    @Override // com.google.mlkit.vision.text.TextRecognizerOptionsInterface
    public final int getLoggingEventId() {
        if (getIsThickClient()) {
            return 24317;
        }
        return 24306;
    }

    @Override // com.google.mlkit.vision.text.TextRecognizerOptionsInterface
    @TextRecognizerOptionsInterface.LanguageOption
    public final int getLoggingLanguageOption() {
        return 1;
    }

    @Override // com.google.mlkit.vision.text.TextRecognizerOptionsInterface
    @NonNull
    public final String getLoggingLibraryName() {
        if (true != getIsThickClient()) {
            return "play-services-mlkit-text-recognition";
        }
        return "text-recognition";
    }

    @Override // com.google.mlkit.vision.text.TextRecognizerOptionsInterface
    @NonNull
    public final String getLoggingLibraryNameForOptionalModule() {
        return "optional-module-text-latin";
    }

    @Override // com.google.mlkit.vision.text.TextRecognizerOptionsInterface
    @NonNull
    public final String getModuleId() {
        if (true != getIsThickClient()) {
            return OptionalModuleUtils.OCR_MODULE_ID;
        }
        return "com.google.mlkit.dynamite.text.latin";
    }

    public int hashCode() {
        return Objects.hashCode(this.f57184b);
    }
}
