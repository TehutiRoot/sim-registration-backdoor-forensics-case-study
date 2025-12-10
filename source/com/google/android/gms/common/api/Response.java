package com.google.android.gms.common.api;

import androidx.annotation.NonNull;
import com.google.android.gms.common.api.Result;

/* loaded from: classes3.dex */
public class Response<T extends Result> {

    /* renamed from: a */
    public Result f44730a;

    public Response() {
    }

    @NonNull
    public T getResult() {
        return (T) this.f44730a;
    }

    public void setResult(@NonNull T t) {
        this.f44730a = t;
    }

    public Response(@NonNull T t) {
        this.f44730a = t;
    }
}
