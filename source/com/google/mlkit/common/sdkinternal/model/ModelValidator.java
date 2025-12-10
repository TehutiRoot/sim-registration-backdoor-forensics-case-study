package com.google.mlkit.common.sdkinternal.model;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.mlkit.common.model.RemoteModel;
import java.io.File;

@KeepForSdk
/* loaded from: classes4.dex */
public interface ModelValidator {

    @KeepForSdk
    /* loaded from: classes4.dex */
    public static class ValidationResult {
        @NonNull
        @KeepForSdk
        public static final ValidationResult VALID = new ValidationResult(ErrorCode.OK, null);

        /* renamed from: a */
        public final ErrorCode f56956a;

        /* renamed from: b */
        public final String f56957b;

        @KeepForSdk
        /* loaded from: classes4.dex */
        public enum ErrorCode {
            OK,
            TFLITE_VERSION_INCOMPATIBLE,
            MODEL_FORMAT_INVALID
        }

        @KeepForSdk
        public ValidationResult(@NonNull ErrorCode errorCode, @Nullable String str) {
            this.f56956a = errorCode;
            this.f56957b = str;
        }

        @NonNull
        @KeepForSdk
        public ErrorCode getErrorCode() {
            return this.f56956a;
        }

        @Nullable
        @KeepForSdk
        public String getErrorMessage() {
            return this.f56957b;
        }

        @KeepForSdk
        public boolean isValid() {
            if (this.f56956a == ErrorCode.OK) {
                return true;
            }
            return false;
        }
    }

    @NonNull
    @KeepForSdk
    ValidationResult validateModel(@NonNull File file, @NonNull RemoteModel remoteModel);
}
