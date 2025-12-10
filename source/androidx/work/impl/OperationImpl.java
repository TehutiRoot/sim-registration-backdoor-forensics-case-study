package androidx.work.impl;

import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.work.Operation;
import androidx.work.impl.utils.futures.SettableFuture;
import com.google.common.util.concurrent.ListenableFuture;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes.dex */
public class OperationImpl implements Operation {

    /* renamed from: a */
    public final MutableLiveData f38299a = new MutableLiveData();

    /* renamed from: b */
    public final SettableFuture f38300b = SettableFuture.create();

    public OperationImpl() {
        markState(Operation.IN_PROGRESS);
    }

    @Override // androidx.work.Operation
    @NonNull
    public ListenableFuture<Operation.State.SUCCESS> getResult() {
        return this.f38300b;
    }

    @Override // androidx.work.Operation
    @NonNull
    public LiveData<Operation.State> getState() {
        return this.f38299a;
    }

    public void markState(@NonNull Operation.State state) {
        this.f38299a.postValue(state);
        if (state instanceof Operation.State.SUCCESS) {
            this.f38300b.set((Operation.State.SUCCESS) state);
        } else if (state instanceof Operation.State.FAILURE) {
            this.f38300b.setException(((Operation.State.FAILURE) state).getThrowable());
        }
    }
}
