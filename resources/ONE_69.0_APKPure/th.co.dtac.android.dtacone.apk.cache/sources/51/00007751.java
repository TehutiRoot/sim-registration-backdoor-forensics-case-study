package androidx.work.impl.utils;

import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.work.Operation;
import androidx.work.impl.OperationImpl;
import androidx.work.impl.WorkManagerImpl;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes.dex */
public class PruneWorkRunnable implements Runnable {

    /* renamed from: a */
    public final WorkManagerImpl f38807a;

    /* renamed from: b */
    public final OperationImpl f38808b = new OperationImpl();

    public PruneWorkRunnable(@NonNull WorkManagerImpl workManagerImpl) {
        this.f38807a = workManagerImpl;
    }

    @NonNull
    public Operation getOperation() {
        return this.f38808b;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            this.f38807a.getWorkDatabase().workSpecDao().pruneFinishedWorkWithZeroDependentsIgnoringKeepForAtLeast();
            this.f38808b.markState(Operation.SUCCESS);
        } catch (Throwable th2) {
            this.f38808b.markState(new Operation.State.FAILURE(th2));
        }
    }
}