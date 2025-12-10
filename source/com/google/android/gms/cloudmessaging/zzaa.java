package com.google.android.gms.cloudmessaging;

import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.firebase.iid.GmsRpc;
import java.io.IOException;

/* loaded from: classes3.dex */
public final /* synthetic */ class zzaa implements Continuation {
    public static final /* synthetic */ zzaa zza = new zzaa();

    @Override // com.google.android.gms.tasks.Continuation
    public final Object then(Task task) {
        if (task.isSuccessful()) {
            return (Bundle) task.getResult();
        }
        if (Log.isLoggable("Rpc", 3)) {
            "Error making request: ".concat(String.valueOf(task.getException()));
        }
        throw new IOException(GmsRpc.ERROR_SERVICE_NOT_AVAILABLE, task.getException());
    }
}
