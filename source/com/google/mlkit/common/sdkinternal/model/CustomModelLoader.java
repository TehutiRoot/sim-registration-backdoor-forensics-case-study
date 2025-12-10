package com.google.mlkit.common.sdkinternal.model;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.annotation.WorkerThread;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.GmsLogger;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.mlkit_common.zzsh;
import com.google.android.gms.internal.mlkit_common.zzss;
import com.google.mlkit.common.MlKitException;
import com.google.mlkit.common.model.CustomRemoteModel;
import com.google.mlkit.common.model.LocalModel;
import com.google.mlkit.common.model.RemoteModel;
import com.google.mlkit.common.sdkinternal.Constants;
import com.google.mlkit.common.sdkinternal.MlKitContext;
import com.google.mlkit.common.sdkinternal.SharedPrefManager;
import java.io.File;
import java.util.HashMap;
import java.util.Map;

@KeepForSdk
/* loaded from: classes4.dex */
public class CustomModelLoader {

    /* renamed from: h */
    public static final GmsLogger f56936h = new GmsLogger("CustomModelLoader", "");

    /* renamed from: i */
    public static final Map f56937i = new HashMap();

    /* renamed from: a */
    public final MlKitContext f56938a;

    /* renamed from: b */
    public final LocalModel f56939b;

    /* renamed from: c */
    public final CustomRemoteModel f56940c;

    /* renamed from: d */
    public final RemoteModelDownloadManager f56941d;

    /* renamed from: e */
    public final RemoteModelFileManager f56942e;

    /* renamed from: f */
    public final zzsh f56943f;

    /* renamed from: g */
    public boolean f56944g;

    @KeepForSdk
    /* loaded from: classes4.dex */
    public interface CustomModelLoaderHelper {
        @KeepForSdk
        void logLoad() throws MlKitException;

        @KeepForSdk
        boolean tryLoad(@NonNull LocalModel localModel) throws MlKitException;
    }

    public CustomModelLoader(MlKitContext mlKitContext, LocalModel localModel, CustomRemoteModel customRemoteModel) {
        if (customRemoteModel != null) {
            RemoteModelFileManager remoteModelFileManager = new RemoteModelFileManager(mlKitContext, customRemoteModel, null, new ModelFileHelper(mlKitContext), new com.google.mlkit.common.internal.model.zza(mlKitContext, customRemoteModel.getUniqueModelNameForPersist()));
            this.f56942e = remoteModelFileManager;
            this.f56941d = RemoteModelDownloadManager.getInstance(mlKitContext, customRemoteModel, new ModelFileHelper(mlKitContext), remoteModelFileManager, (ModelInfoRetrieverInterop) mlKitContext.get(ModelInfoRetrieverInterop.class));
            this.f56944g = true;
        } else {
            this.f56942e = null;
            this.f56941d = null;
        }
        this.f56938a = mlKitContext;
        this.f56939b = localModel;
        this.f56940c = customRemoteModel;
        this.f56943f = zzss.zzb("common");
    }

    /* renamed from: c */
    public static final LocalModel m37226c(File file) {
        if (file.isDirectory()) {
            LocalModel.Builder builder = new LocalModel.Builder();
            builder.setAbsoluteManifestFilePath(new File(file.getAbsolutePath(), Constants.AUTOML_IMAGE_LABELING_MANIFEST_JSON_FILE_NAME).toString());
            return builder.build();
        }
        LocalModel.Builder builder2 = new LocalModel.Builder();
        builder2.setAbsoluteFilePath(file.getAbsolutePath());
        return builder2.build();
    }

    @NonNull
    @KeepForSdk
    public static synchronized CustomModelLoader getInstance(@NonNull MlKitContext mlKitContext, @Nullable LocalModel localModel, @Nullable CustomRemoteModel customRemoteModel) {
        String uniqueModelNameForPersist;
        CustomModelLoader customModelLoader;
        synchronized (CustomModelLoader.class) {
            try {
                if (customRemoteModel == null) {
                    uniqueModelNameForPersist = ((LocalModel) Preconditions.checkNotNull(localModel)).toString();
                } else {
                    uniqueModelNameForPersist = customRemoteModel.getUniqueModelNameForPersist();
                }
                Map map = f56937i;
                if (!map.containsKey(uniqueModelNameForPersist)) {
                    map.put(uniqueModelNameForPersist, new CustomModelLoader(mlKitContext, localModel, customRemoteModel));
                }
                customModelLoader = (CustomModelLoader) map.get(uniqueModelNameForPersist);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return customModelLoader;
    }

    /* renamed from: a */
    public final File m37228a() {
        String zzb = ((RemoteModelFileManager) Preconditions.checkNotNull(this.f56942e)).zzb();
        if (zzb == null) {
            f56936h.m48408d("CustomModelLoader", "No existing model file");
            return null;
        }
        File file = new File(zzb);
        File[] listFiles = file.listFiles();
        if (((File[]) Preconditions.checkNotNull(listFiles)).length == 1) {
            return listFiles[0];
        }
        return file;
    }

    /* renamed from: b */
    public final void m37227b() {
        ((RemoteModelDownloadManager) Preconditions.checkNotNull(this.f56941d)).removeOrCancelDownload();
    }

    @VisibleForTesting
    @Nullable
    @KeepForSdk
    @WorkerThread
    public synchronized LocalModel createLocalModelByLatestExistingModel() throws MlKitException {
        f56936h.m48408d("CustomModelLoader", "Try to get the latest existing model file.");
        File m37228a = m37228a();
        if (m37228a == null) {
            return null;
        }
        return m37226c(m37228a);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x009c A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x009e A[Catch: all -> 0x002f, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x002f, blocks: (B:3:0x0001, B:7:0x0022, B:9:0x002a, B:27:0x009e, B:13:0x0032, B:15:0x0049, B:18:0x0052, B:19:0x006b, B:21:0x0073, B:22:0x008f), top: B:32:0x0001 }] */
    @androidx.annotation.VisibleForTesting
    @androidx.annotation.Nullable
    @com.google.android.gms.common.annotation.KeepForSdk
    @androidx.annotation.WorkerThread
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public synchronized com.google.mlkit.common.model.LocalModel createLocalModelByNewlyDownloadedModel() throws com.google.mlkit.common.MlKitException {
        /*
            r7 = this;
            monitor-enter(r7)
            com.google.android.gms.common.internal.GmsLogger r0 = com.google.mlkit.common.sdkinternal.model.CustomModelLoader.f56936h     // Catch: java.lang.Throwable -> L2f
            java.lang.String r1 = "CustomModelLoader"
            java.lang.String r2 = "Try to get newly downloaded model file."
            r0.m48408d(r1, r2)     // Catch: java.lang.Throwable -> L2f
            com.google.mlkit.common.sdkinternal.model.RemoteModelDownloadManager r1 = r7.f56941d     // Catch: java.lang.Throwable -> L2f
            java.lang.Object r1 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r1)     // Catch: java.lang.Throwable -> L2f
            com.google.mlkit.common.sdkinternal.model.RemoteModelDownloadManager r1 = (com.google.mlkit.common.sdkinternal.model.RemoteModelDownloadManager) r1     // Catch: java.lang.Throwable -> L2f
            java.lang.Long r1 = r1.getDownloadingId()     // Catch: java.lang.Throwable -> L2f
            com.google.mlkit.common.sdkinternal.model.RemoteModelDownloadManager r2 = r7.f56941d     // Catch: java.lang.Throwable -> L2f
            java.lang.String r2 = r2.getDownloadingModelHash()     // Catch: java.lang.Throwable -> L2f
            r3 = 0
            if (r1 == 0) goto L8f
            if (r2 != 0) goto L22
            goto L8f
        L22:
            com.google.mlkit.common.sdkinternal.model.RemoteModelDownloadManager r4 = r7.f56941d     // Catch: java.lang.Throwable -> L2f
            java.lang.Integer r4 = r4.getDownloadingModelStatusCode()     // Catch: java.lang.Throwable -> L2f
            if (r4 != 0) goto L32
            r7.m37227b()     // Catch: java.lang.Throwable -> L2f
        L2d:
            r1 = r3
            goto L9a
        L2f:
            r0 = move-exception
            goto La4
        L32:
            java.lang.String r5 = "Download Status code: "
            java.lang.String r6 = r4.toString()     // Catch: java.lang.Throwable -> L2f
            java.lang.String r5 = r5.concat(r6)     // Catch: java.lang.Throwable -> L2f
            java.lang.String r6 = "CustomModelLoader"
            r0.m48408d(r6, r5)     // Catch: java.lang.Throwable -> L2f
            int r5 = r4.intValue()     // Catch: java.lang.Throwable -> L2f
            r6 = 8
            if (r5 != r6) goto L6b
            com.google.mlkit.common.sdkinternal.model.RemoteModelDownloadManager r1 = r7.f56941d     // Catch: java.lang.Throwable -> L2f
            java.io.File r1 = r1.zzi(r2)     // Catch: java.lang.Throwable -> L2f
            if (r1 != 0) goto L52
            goto L2d
        L52:
            java.lang.String r4 = r1.getParent()     // Catch: java.lang.Throwable -> L2f
            java.lang.String r4 = java.lang.String.valueOf(r4)     // Catch: java.lang.Throwable -> L2f
            java.lang.String r5 = "Moved the downloaded model to private folder successfully: "
            java.lang.String r6 = "CustomModelLoader"
            java.lang.String r4 = r5.concat(r4)     // Catch: java.lang.Throwable -> L2f
            r0.m48408d(r6, r4)     // Catch: java.lang.Throwable -> L2f
            com.google.mlkit.common.sdkinternal.model.RemoteModelDownloadManager r0 = r7.f56941d     // Catch: java.lang.Throwable -> L2f
            r0.updateLatestModelHashAndType(r2)     // Catch: java.lang.Throwable -> L2f
            goto L9a
        L6b:
            int r0 = r4.intValue()     // Catch: java.lang.Throwable -> L2f
            r2 = 16
            if (r0 != r2) goto L2d
            com.google.android.gms.internal.mlkit_common.zzsh r0 = r7.f56943f     // Catch: java.lang.Throwable -> L2f
            com.google.mlkit.common.model.CustomRemoteModel r2 = r7.f56940c     // Catch: java.lang.Throwable -> L2f
            com.google.android.gms.internal.mlkit_common.zzry r4 = com.google.android.gms.internal.mlkit_common.zzsk.zzg()     // Catch: java.lang.Throwable -> L2f
            java.lang.Object r2 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r2)     // Catch: java.lang.Throwable -> L2f
            com.google.mlkit.common.model.RemoteModel r2 = (com.google.mlkit.common.model.RemoteModel) r2     // Catch: java.lang.Throwable -> L2f
            com.google.mlkit.common.sdkinternal.model.RemoteModelDownloadManager r5 = r7.f56941d     // Catch: java.lang.Throwable -> L2f
            int r1 = r5.getFailureReason(r1)     // Catch: java.lang.Throwable -> L2f
            r5 = 0
            r0.zze(r4, r2, r5, r1)     // Catch: java.lang.Throwable -> L2f
            r7.m37227b()     // Catch: java.lang.Throwable -> L2f
            goto L2d
        L8f:
            java.lang.String r1 = "CustomModelLoader"
            java.lang.String r2 = "No new model is downloading."
            r0.m48408d(r1, r2)     // Catch: java.lang.Throwable -> L2f
            r7.m37227b()     // Catch: java.lang.Throwable -> L2f
            goto L2d
        L9a:
            if (r1 != 0) goto L9e
            monitor-exit(r7)
            return r3
        L9e:
            com.google.mlkit.common.model.LocalModel r0 = m37226c(r1)     // Catch: java.lang.Throwable -> L2f
            monitor-exit(r7)
            return r0
        La4:
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L2f
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.mlkit.common.sdkinternal.model.CustomModelLoader.createLocalModelByNewlyDownloadedModel():com.google.mlkit.common.model.LocalModel");
    }

    @KeepForSdk
    @VisibleForTesting
    @WorkerThread
    public void deleteLatestExistingModel() throws MlKitException {
        File m37228a = m37228a();
        if (m37228a != null) {
            ((RemoteModelFileManager) Preconditions.checkNotNull(this.f56942e)).zzc(m37228a);
            SharedPrefManager.getInstance(this.f56938a).clearLatestModelHash((RemoteModel) Preconditions.checkNotNull(this.f56940c));
        }
    }

    @KeepForSdk
    @VisibleForTesting
    @WorkerThread
    public void deleteOldModels(@NonNull LocalModel localModel) throws MlKitException {
        File parentFile = new File((String) Preconditions.checkNotNull(localModel.getAbsoluteFilePath())).getParentFile();
        if (((RemoteModelFileManager) Preconditions.checkNotNull(this.f56942e)).zzd((File) Preconditions.checkNotNull(parentFile))) {
            f56936h.m48408d("CustomModelLoader", "All old models are deleted.");
            this.f56942e.zza(parentFile);
            return;
        }
        f56936h.m48406e("CustomModelLoader", "Failed to delete old models");
    }

    @KeepForSdk
    @WorkerThread
    public synchronized void load(@NonNull CustomModelLoaderHelper customModelLoaderHelper) throws MlKitException {
        try {
            LocalModel localModel = this.f56939b;
            if (localModel == null) {
                localModel = createLocalModelByNewlyDownloadedModel();
            }
            if (localModel == null) {
                localModel = createLocalModelByLatestExistingModel();
            }
            if (localModel != null) {
                while (!customModelLoaderHelper.tryLoad(localModel)) {
                    if (this.f56940c != null) {
                        deleteLatestExistingModel();
                        localModel = createLocalModelByLatestExistingModel();
                        continue;
                    } else {
                        localModel = null;
                        continue;
                    }
                    if (localModel == null) {
                        customModelLoaderHelper.logLoad();
                        return;
                    }
                }
                if (this.f56940c != null && this.f56944g) {
                    deleteOldModels((LocalModel) Preconditions.checkNotNull(localModel));
                    this.f56944g = false;
                }
                customModelLoaderHelper.logLoad();
                return;
            }
            throw new MlKitException("Model is not available.", 14);
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
