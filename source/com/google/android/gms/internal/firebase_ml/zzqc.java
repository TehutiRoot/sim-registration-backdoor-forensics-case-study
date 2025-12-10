package com.google.android.gms.internal.firebase_ml;

import androidx.annotation.Nullable;
import androidx.annotation.WorkerThread;
import com.google.android.gms.internal.firebase_ml.zzqg;
import com.google.firebase.p015ml.common.FirebaseMLException;

/* loaded from: classes3.dex */
public interface zzqc<T, S extends zzqg> {
    @WorkerThread
    T zza(S s) throws FirebaseMLException;

    @Nullable
    zzqx zzon();
}
