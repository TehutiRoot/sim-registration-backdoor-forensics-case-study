package com.google.android.gms.common.api;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ShowFirstParty;

/* loaded from: classes3.dex */
public class BooleanResult implements Result {

    /* renamed from: a */
    public final Status f44708a;

    /* renamed from: b */
    public final boolean f44709b;

    @ShowFirstParty
    @KeepForSdk
    public BooleanResult(@NonNull Status status, boolean z) {
        this.f44708a = (Status) Preconditions.checkNotNull(status, "Status must not be null");
        this.f44709b = z;
    }

    public final boolean equals(@Nullable Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BooleanResult)) {
            return false;
        }
        BooleanResult booleanResult = (BooleanResult) obj;
        if (!this.f44708a.equals(booleanResult.f44708a) || this.f44709b != booleanResult.f44709b) {
            return false;
        }
        return true;
    }

    @Override // com.google.android.gms.common.api.Result
    @NonNull
    public Status getStatus() {
        return this.f44708a;
    }

    public boolean getValue() {
        return this.f44709b;
    }

    public final int hashCode() {
        return ((this.f44708a.hashCode() + 527) * 31) + (this.f44709b ? 1 : 0);
    }
}