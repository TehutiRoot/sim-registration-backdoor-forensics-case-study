package com.google.android.gms.common.api;

import com.google.android.gms.common.api.PendingResult;

/* renamed from: com.google.android.gms.common.api.a */
/* loaded from: classes3.dex */
public final class C6330a implements PendingResult.StatusListener {

    /* renamed from: a */
    public final /* synthetic */ Batch f44749a;

    public C6330a(Batch batch) {
        this.f44749a = batch;
    }

    @Override // com.google.android.gms.common.api.PendingResult.StatusListener
    public final void onComplete(Status status) {
        Object obj;
        int i;
        int i2;
        boolean z;
        boolean z2;
        Status status2;
        PendingResult[] pendingResultArr;
        obj = this.f44749a.f44703e;
        synchronized (obj) {
            try {
                if (this.f44749a.isCanceled()) {
                    return;
                }
                if (status.isCanceled()) {
                    this.f44749a.f44701c = true;
                } else if (!status.isSuccess()) {
                    this.f44749a.f44700b = true;
                }
                Batch batch = this.f44749a;
                i = batch.f44699a;
                batch.f44699a = i - 1;
                Batch batch2 = this.f44749a;
                i2 = batch2.f44699a;
                if (i2 == 0) {
                    z = batch2.f44701c;
                    if (z) {
                        super/*com.google.android.gms.common.api.internal.BasePendingResult*/.cancel();
                    } else {
                        z2 = batch2.f44700b;
                        if (z2) {
                            status2 = new Status(13);
                        } else {
                            status2 = Status.RESULT_SUCCESS;
                        }
                        Batch batch3 = this.f44749a;
                        pendingResultArr = batch3.f44702d;
                        batch3.setResult(new BatchResult(status2, pendingResultArr));
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}