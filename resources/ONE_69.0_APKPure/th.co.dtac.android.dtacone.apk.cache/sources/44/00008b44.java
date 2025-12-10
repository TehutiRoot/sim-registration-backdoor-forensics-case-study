package com.google.android.gms.common.api;

import androidx.annotation.NonNull;
import com.google.android.gms.common.api.internal.BasePendingResult;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public final class Batch extends BasePendingResult<BatchResult> {

    /* renamed from: a */
    public int f44699a;

    /* renamed from: b */
    public boolean f44700b;

    /* renamed from: c */
    public boolean f44701c;

    /* renamed from: d */
    public final PendingResult[] f44702d;

    /* renamed from: e */
    public final Object f44703e;

    /* loaded from: classes3.dex */
    public static final class Builder {

        /* renamed from: a */
        public final List f44704a = new ArrayList();

        /* renamed from: b */
        public final GoogleApiClient f44705b;

        public Builder(@NonNull GoogleApiClient googleApiClient) {
            this.f44705b = googleApiClient;
        }

        @NonNull
        @ResultIgnorabilityUnspecified
        public <R extends Result> BatchResultToken<R> add(@NonNull PendingResult<R> pendingResult) {
            BatchResultToken<R> batchResultToken = new BatchResultToken<>(this.f44704a.size());
            this.f44704a.add(pendingResult);
            return batchResultToken;
        }

        @NonNull
        public Batch build() {
            return new Batch(this.f44704a, this.f44705b, null);
        }
    }

    public /* synthetic */ Batch(List list, GoogleApiClient googleApiClient, zac zacVar) {
        super(googleApiClient);
        this.f44703e = new Object();
        int size = list.size();
        this.f44699a = size;
        PendingResult[] pendingResultArr = new PendingResult[size];
        this.f44702d = pendingResultArr;
        if (!list.isEmpty()) {
            for (int i = 0; i < list.size(); i++) {
                PendingResult pendingResult = (PendingResult) list.get(i);
                this.f44702d[i] = pendingResult;
                pendingResult.addStatusListener(new C6330a(this));
            }
            return;
        }
        setResult(new BatchResult(Status.RESULT_SUCCESS, pendingResultArr));
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult, com.google.android.gms.common.api.PendingResult
    public void cancel() {
        super.cancel();
        int i = 0;
        while (true) {
            PendingResult[] pendingResultArr = this.f44702d;
            if (i < pendingResultArr.length) {
                pendingResultArr[i].cancel();
                i++;
            } else {
                return;
            }
        }
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    @NonNull
    public BatchResult createFailedResult(@NonNull Status status) {
        return new BatchResult(status, this.f44702d);
    }
}