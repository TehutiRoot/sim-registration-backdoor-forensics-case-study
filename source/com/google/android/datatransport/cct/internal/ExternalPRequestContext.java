package com.google.android.datatransport.cct.internal;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.datatransport.cct.internal.C6240e;
import com.google.auto.value.AutoValue;

@AutoValue
/* loaded from: classes3.dex */
public abstract class ExternalPRequestContext {

    @AutoValue.Builder
    /* loaded from: classes3.dex */
    public static abstract class Builder {
        @NonNull
        public abstract ExternalPRequestContext build();

        @NonNull
        public abstract Builder setOriginAssociatedProductId(@Nullable Integer num);
    }

    @NonNull
    public static Builder builder() {
        return new C6240e.C6242b();
    }

    @Nullable
    public abstract Integer getOriginAssociatedProductId();
}
