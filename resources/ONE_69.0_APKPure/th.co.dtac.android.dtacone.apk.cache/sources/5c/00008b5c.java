package com.google.android.gms.common.api;

import androidx.annotation.NonNull;
import com.google.android.gms.common.api.Result;

/* loaded from: classes3.dex */
public class Response<T extends Result> {

    /* renamed from: a */
    public Result f44742a;

    public Response() {
    }

    @NonNull
    public T getResult() {
        return (T) this.f44742a;
    }

    public void setResult(@NonNull T t) {
        this.f44742a = t;
    }

    public Response(@NonNull T t) {
        this.f44742a = t;
    }
}