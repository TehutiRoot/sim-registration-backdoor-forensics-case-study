package com.google.android.gms.tasks;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* loaded from: classes4.dex */
public class TaskCompletionSource<TResult> {

    /* renamed from: a */
    public final C23121yK2 f48590a = new C23121yK2();

    public TaskCompletionSource() {
    }

    @NonNull
    public Task<TResult> getTask() {
        return this.f48590a;
    }

    public void setException(@NonNull Exception exc) {
        this.f48590a.m287a(exc);
    }

    public void setResult(@Nullable TResult tresult) {
        this.f48590a.m286b(tresult);
    }

    public boolean trySetException(@NonNull Exception exc) {
        return this.f48590a.m284d(exc);
    }

    public boolean trySetResult(@Nullable TResult tresult) {
        return this.f48590a.m283e(tresult);
    }

    public TaskCompletionSource(@NonNull CancellationToken cancellationToken) {
        cancellationToken.onCanceledRequested(new C22258tJ2(this));
    }
}
