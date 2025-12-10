package com.google.android.gms.common.api;

import com.google.android.gms.common.api.PendingResult;

/* renamed from: com.google.android.gms.common.api.a */
/* loaded from: classes3.dex */
public final class C6341a implements PendingResult.StatusListener {

    /* renamed from: a */
    public final /* synthetic */ Batch f44737a;

    public C6341a(Batch batch) {
        this.f44737a = batch;
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
        obj = this.f44737a.f44691e;
        synchronized (obj) {
            try {
                if (this.f44737a.isCanceled()) {
                    return;
                }
                if (status.isCanceled()) {
                    this.f44737a.f44689c = true;
                } else if (!status.isSuccess()) {
                    this.f44737a.f44688b = true;
                }
                Batch batch = this.f44737a;
                i = batch.f44687a;
                batch.f44687a = i - 1;
                Batch batch2 = this.f44737a;
                i2 = batch2.f44687a;
                if (i2 == 0) {
                    z = batch2.f44689c;
                    if (z) {
                        super/*com.google.android.gms.common.api.internal.BasePendingResult*/.cancel();
                    } else {
                        z2 = batch2.f44688b;
                        if (z2) {
                            status2 = new Status(13);
                        } else {
                            status2 = Status.RESULT_SUCCESS;
                        }
                        Batch batch3 = this.f44737a;
                        pendingResultArr = batch3.f44690d;
                        batch3.setResult(new BatchResult(status2, pendingResultArr));
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
