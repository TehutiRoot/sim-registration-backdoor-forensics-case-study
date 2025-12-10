package com.google.android.gms.common.api;

import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.Preconditions;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public final class BatchResult implements Result {

    /* renamed from: a */
    public final Status f44694a;

    /* renamed from: b */
    public final PendingResult[] f44695b;

    public BatchResult(Status status, PendingResult[] pendingResultArr) {
        this.f44694a = status;
        this.f44695b = pendingResultArr;
    }

    @Override // com.google.android.gms.common.api.Result
    @NonNull
    public Status getStatus() {
        return this.f44694a;
    }

    @NonNull
    @ResultIgnorabilityUnspecified
    public <R extends Result> R take(@NonNull BatchResultToken<R> batchResultToken) {
        boolean z;
        if (batchResultToken.mId < this.f44695b.length) {
            z = true;
        } else {
            z = false;
        }
        Preconditions.checkArgument(z, "The result token does not belong to this batch");
        return (R) this.f44695b[batchResultToken.mId].await(0L, TimeUnit.MILLISECONDS);
    }
}
