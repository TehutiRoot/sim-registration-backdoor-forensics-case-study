package com.google.android.gms.common.api;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ShowFirstParty;

/* loaded from: classes3.dex */
public class BooleanResult implements Result {

    /* renamed from: a */
    public final Status f44696a;

    /* renamed from: b */
    public final boolean f44697b;

    @ShowFirstParty
    @KeepForSdk
    public BooleanResult(@NonNull Status status, boolean z) {
        this.f44696a = (Status) Preconditions.checkNotNull(status, "Status must not be null");
        this.f44697b = z;
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
        if (!this.f44696a.equals(booleanResult.f44696a) || this.f44697b != booleanResult.f44697b) {
            return false;
        }
        return true;
    }

    @Override // com.google.android.gms.common.api.Result
    @NonNull
    public Status getStatus() {
        return this.f44696a;
    }

    public boolean getValue() {
        return this.f44697b;
    }

    public final int hashCode() {
        return ((this.f44696a.hashCode() + 527) * 31) + (this.f44697b ? 1 : 0);
    }
}
