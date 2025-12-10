package com.google.firebase.p015ml.common.internal.modeldownload;

import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.tasks.Task;
import com.google.firebase.p015ml.common.modeldownload.FirebaseModelDownloadConditions;
import com.google.firebase.p015ml.common.modeldownload.FirebaseRemoteModel;
import java.io.File;
import java.util.Set;

@KeepForSdk
/* renamed from: com.google.firebase.ml.common.internal.modeldownload.RemoteModelManagerInterface */
/* loaded from: classes4.dex */
public interface RemoteModelManagerInterface<TRemote extends FirebaseRemoteModel> {
    @KeepForSdk
    Task<Void> deleteDownloadedModel(TRemote tremote);

    @KeepForSdk
    Task<Void> download(TRemote tremote, FirebaseModelDownloadConditions firebaseModelDownloadConditions);

    @KeepForSdk
    Task<Set<TRemote>> getDownloadedModels();

    @KeepForSdk
    Task<File> getLatestModelFile(TRemote tremote);

    @KeepForSdk
    Task<Boolean> isModelDownloaded(TRemote tremote);
}
