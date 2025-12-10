package com.google.android.datatransport.cct.internal;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.datatransport.cct.internal.C6226d;
import com.google.auto.value.AutoValue;

@AutoValue
/* loaded from: classes3.dex */
public abstract class ExperimentIds {

    @AutoValue.Builder
    /* loaded from: classes3.dex */
    public static abstract class Builder {
        @NonNull
        public abstract ExperimentIds build();

        @NonNull
        public abstract Builder setClearBlob(@Nullable byte[] bArr);

        @NonNull
        public abstract Builder setEncryptedBlob(@Nullable byte[] bArr);
    }

    @NonNull
    public static Builder builder() {
        return new C6226d.C6228b();
    }

    @Nullable
    public abstract byte[] getClearBlob();

    @Nullable
    public abstract byte[] getEncryptedBlob();
}