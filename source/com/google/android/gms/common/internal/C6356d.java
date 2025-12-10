package com.google.android.gms.common.internal;

import com.google.android.gms.common.api.Response;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.internal.PendingResultUtil;

/* renamed from: com.google.android.gms.common.internal.d */
/* loaded from: classes3.dex */
public final class C6356d implements PendingResultUtil.ResultConverter {

    /* renamed from: a */
    public final /* synthetic */ Response f45136a;

    public C6356d(Response response) {
        this.f45136a = response;
    }

    @Override // com.google.android.gms.common.internal.PendingResultUtil.ResultConverter
    public final /* bridge */ /* synthetic */ Object convert(Result result) {
        this.f45136a.setResult(result);
        return this.f45136a;
    }
}
