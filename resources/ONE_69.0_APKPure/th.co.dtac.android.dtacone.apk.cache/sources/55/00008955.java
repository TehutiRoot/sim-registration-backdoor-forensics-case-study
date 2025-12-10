package com.google.android.datatransport;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.datatransport.C6203a;
import com.google.auto.value.AutoValue;

@AutoValue
/* loaded from: classes3.dex */
public abstract class EventContext {

    @AutoValue.Builder
    /* loaded from: classes3.dex */
    public static abstract class Builder {
        @NonNull
        public abstract EventContext build();

        @NonNull
        public abstract Builder setExperimentIdsClear(byte[] bArr);

        @NonNull
        public abstract Builder setExperimentIdsEncrypted(byte[] bArr);

        @NonNull
        public abstract Builder setPseudonymousId(String str);
    }

    public static Builder builder() {
        return new C6203a.C6205b();
    }

    @Nullable
    public abstract byte[] getExperimentIdsClear();

    @Nullable
    public abstract byte[] getExperimentIdsEncrypted();

    @Nullable
    public abstract String getPseudonymousId();
}