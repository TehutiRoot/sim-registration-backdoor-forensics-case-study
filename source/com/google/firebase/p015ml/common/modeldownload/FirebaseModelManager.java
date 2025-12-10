package com.google.firebase.p015ml.common.modeldownload;

import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.FirebaseApp;
import com.google.firebase.inject.Provider;
import com.google.firebase.p015ml.common.FirebaseMLException;
import com.google.firebase.p015ml.common.internal.modeldownload.RemoteModelManagerInterface;
import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* renamed from: com.google.firebase.ml.common.modeldownload.FirebaseModelManager */
/* loaded from: classes4.dex */
public class FirebaseModelManager {

    /* renamed from: a */
    public final Map f55808a = new HashMap();

    @KeepForSdk
    /* renamed from: com.google.firebase.ml.common.modeldownload.FirebaseModelManager$RemoteModelManagerRegistration */
    /* loaded from: classes4.dex */
    public static class RemoteModelManagerRegistration {

        /* renamed from: a */
        public final Class f55809a;

        /* renamed from: b */
        public final Provider f55810b;

        public <TRemote extends FirebaseRemoteModel> RemoteModelManagerRegistration(Class<TRemote> cls, Provider<? extends RemoteModelManagerInterface<TRemote>> provider) {
            this.f55809a = cls;
            this.f55810b = provider;
        }

        /* renamed from: a */
        public final Class m38354a() {
            return this.f55809a;
        }

        /* renamed from: b */
        public final Provider m38353b() {
            return this.f55810b;
        }
    }

    @KeepForSdk
    public FirebaseModelManager(Set<RemoteModelManagerRegistration> set) {
        for (RemoteModelManagerRegistration remoteModelManagerRegistration : set) {
            this.f55808a.put(remoteModelManagerRegistration.m38354a(), remoteModelManagerRegistration.m38353b());
        }
    }

    @NonNull
    public static synchronized FirebaseModelManager getInstance() {
        FirebaseModelManager firebaseModelManager;
        synchronized (FirebaseModelManager.class) {
            firebaseModelManager = getInstance(FirebaseApp.getInstance());
        }
        return firebaseModelManager;
    }

    /* renamed from: a */
    public final RemoteModelManagerInterface m38355a(Class cls) {
        return (RemoteModelManagerInterface) ((Provider) this.f55808a.get(cls)).get();
    }

    @NonNull
    public Task<Void> deleteDownloadedModel(@NonNull FirebaseRemoteModel firebaseRemoteModel) {
        Preconditions.checkNotNull(firebaseRemoteModel, "FirebaseRemoteModel cannot be null");
        return m38355a(firebaseRemoteModel.getClass()).deleteDownloadedModel(firebaseRemoteModel);
    }

    @NonNull
    public Task<Void> download(@NonNull FirebaseRemoteModel firebaseRemoteModel, @NonNull FirebaseModelDownloadConditions firebaseModelDownloadConditions) {
        Preconditions.checkNotNull(firebaseRemoteModel, "FirebaseRemoteModel cannot be null");
        Preconditions.checkNotNull(firebaseModelDownloadConditions, "FirebaseModelDownloadConditions cannot be null");
        if (this.f55808a.containsKey(firebaseRemoteModel.getClass())) {
            return m38355a(firebaseRemoteModel.getClass()).download(firebaseRemoteModel, firebaseModelDownloadConditions);
        }
        return Tasks.forException(new FirebaseMLException("Feature model doesn't have a corresponding modelmanager registered.", 13));
    }

    @NonNull
    public <T extends FirebaseRemoteModel> Task<Set<T>> getDownloadedModels(@NonNull Class<T> cls) {
        return ((RemoteModelManagerInterface) ((Provider) this.f55808a.get(cls)).get()).getDownloadedModels();
    }

    @NonNull
    public Task<File> getLatestModelFile(@NonNull FirebaseRemoteModel firebaseRemoteModel) {
        Preconditions.checkNotNull(firebaseRemoteModel, "FirebaseRemoteModel cannot be null");
        if (this.f55808a.containsKey(firebaseRemoteModel.getClass())) {
            return m38355a(firebaseRemoteModel.getClass()).getLatestModelFile(firebaseRemoteModel);
        }
        return Tasks.forException(new FirebaseMLException("Feature model doesn't have a corresponding modelmanager registered.", 13));
    }

    @NonNull
    public Task<Boolean> isModelDownloaded(@NonNull FirebaseRemoteModel firebaseRemoteModel) {
        Preconditions.checkNotNull(firebaseRemoteModel, "FirebaseRemoteModel cannot be null");
        return m38355a(firebaseRemoteModel.getClass()).isModelDownloaded(firebaseRemoteModel);
    }

    @NonNull
    public static synchronized FirebaseModelManager getInstance(@NonNull FirebaseApp firebaseApp) {
        FirebaseModelManager firebaseModelManager;
        synchronized (FirebaseModelManager.class) {
            Preconditions.checkNotNull(firebaseApp, "Please provide a valid FirebaseApp");
            firebaseModelManager = (FirebaseModelManager) firebaseApp.get(FirebaseModelManager.class);
        }
        return firebaseModelManager;
    }
}
