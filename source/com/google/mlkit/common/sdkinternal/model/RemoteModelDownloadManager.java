package com.google.mlkit.common.sdkinternal.model;

import android.app.DownloadManager;
import android.content.IntentFilter;
import android.database.Cursor;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.util.LongSparseArray;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.WorkerThread;
import androidx.core.app.NotificationCompat;
import androidx.core.content.ContextCompat;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.GmsLogger;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.mlkit_common.zzmu;
import com.google.android.gms.internal.mlkit_common.zzna;
import com.google.android.gms.internal.mlkit_common.zzsh;
import com.google.android.gms.internal.mlkit_common.zzsk;
import com.google.android.gms.internal.mlkit_common.zzss;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.mlkit.common.MlKitException;
import com.google.mlkit.common.model.DownloadConditions;
import com.google.mlkit.common.model.RemoteModel;
import com.google.mlkit.common.sdkinternal.CommonUtils;
import com.google.mlkit.common.sdkinternal.MLTaskExecutor;
import com.google.mlkit.common.sdkinternal.MlKitContext;
import com.google.mlkit.common.sdkinternal.ModelInfo;
import com.google.mlkit.common.sdkinternal.ModelType;
import com.google.mlkit.common.sdkinternal.SharedPrefManager;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;

@KeepForSdk
/* loaded from: classes4.dex */
public class RemoteModelDownloadManager {

    /* renamed from: m */
    public static final GmsLogger f56959m = new GmsLogger("ModelDownloadManager", "");

    /* renamed from: n */
    public static final Map f56960n = new HashMap();

    /* renamed from: a */
    public final LongSparseArray f56961a = new LongSparseArray();

    /* renamed from: b */
    public final LongSparseArray f56962b = new LongSparseArray();

    /* renamed from: c */
    public final MlKitContext f56963c;

    /* renamed from: d */
    public final DownloadManager f56964d;

    /* renamed from: e */
    public final RemoteModel f56965e;

    /* renamed from: f */
    public final ModelType f56966f;

    /* renamed from: g */
    public final zzsh f56967g;

    /* renamed from: h */
    public final SharedPrefManager f56968h;

    /* renamed from: i */
    public final ModelFileHelper f56969i;

    /* renamed from: j */
    public final ModelInfoRetrieverInterop f56970j;

    /* renamed from: k */
    public final RemoteModelFileManager f56971k;

    /* renamed from: l */
    public DownloadConditions f56972l;

    public RemoteModelDownloadManager(MlKitContext mlKitContext, RemoteModel remoteModel, ModelFileHelper modelFileHelper, RemoteModelFileManager remoteModelFileManager, ModelInfoRetrieverInterop modelInfoRetrieverInterop, zzsh zzshVar) {
        this.f56963c = mlKitContext;
        this.f56966f = remoteModel.getModelType();
        this.f56965e = remoteModel;
        DownloadManager downloadManager = (DownloadManager) mlKitContext.getApplicationContext().getSystemService("download");
        this.f56964d = downloadManager;
        this.f56967g = zzshVar;
        if (downloadManager == null) {
            f56959m.m48408d("ModelDownloadManager", "Download manager service is not available in the service.");
        }
        this.f56969i = modelFileHelper;
        this.f56968h = SharedPrefManager.getInstance(mlKitContext);
        this.f56970j = modelInfoRetrieverInterop;
        this.f56971k = remoteModelFileManager;
    }

    @NonNull
    @KeepForSdk
    public static synchronized RemoteModelDownloadManager getInstance(@NonNull MlKitContext mlKitContext, @NonNull RemoteModel remoteModel, @NonNull ModelFileHelper modelFileHelper, @NonNull RemoteModelFileManager remoteModelFileManager, @Nullable ModelInfoRetrieverInterop modelInfoRetrieverInterop) {
        RemoteModelDownloadManager remoteModelDownloadManager;
        synchronized (RemoteModelDownloadManager.class) {
            try {
                Map map = f56960n;
                if (!map.containsKey(remoteModel)) {
                    map.put(remoteModel, new RemoteModelDownloadManager(mlKitContext, remoteModel, modelFileHelper, remoteModelFileManager, modelInfoRetrieverInterop, zzss.zzb("common")));
                }
                remoteModelDownloadManager = (RemoteModelDownloadManager) map.get(remoteModel);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return remoteModelDownloadManager;
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x00af, code lost:
        r1 = m37207n(r1, r13.f56972l);
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00b5, code lost:
        if (r1 == null) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00bf, code lost:
        return m37212i(r1.longValue());
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00c0, code lost:
        com.google.mlkit.common.sdkinternal.model.RemoteModelDownloadManager.f56959m.m48404i("ModelDownloadManager", "Didn't schedule download for the updated model");
     */
    @androidx.annotation.NonNull
    @com.google.android.gms.common.annotation.KeepForSdk
    @androidx.annotation.WorkerThread
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.google.android.gms.tasks.Task<java.lang.Void> ensureModelDownloaded() {
        /*
            r13 = this;
            com.google.android.gms.internal.mlkit_common.zzsh r0 = r13.f56967g
            com.google.android.gms.internal.mlkit_common.zzry r1 = com.google.android.gms.internal.mlkit_common.zzsk.zzg()
            com.google.mlkit.common.model.RemoteModel r2 = r13.f56965e
            com.google.android.gms.internal.mlkit_common.zzmu r3 = com.google.android.gms.internal.mlkit_common.zzmu.NO_ERROR
            com.google.mlkit.common.sdkinternal.ModelType r5 = com.google.mlkit.common.sdkinternal.ModelType.UNKNOWN
            com.google.android.gms.internal.mlkit_common.zzna r6 = com.google.android.gms.internal.mlkit_common.zzna.EXPLICITLY_REQUESTED
            r4 = 0
            r0.zzf(r1, r2, r3, r4, r5, r6)
            r0 = 0
            com.google.mlkit.common.sdkinternal.ModelInfo r1 = r13.m37214g()     // Catch: com.google.mlkit.common.MlKitException -> L19
            r2 = r0
            goto L1c
        L19:
            r1 = move-exception
            r2 = r1
            r1 = r0
        L1c:
            r3 = 13
            java.lang.Integer r4 = r13.getDownloadingModelStatusCode()     // Catch: com.google.mlkit.common.MlKitException -> L38
            java.lang.Long r5 = r13.getDownloadingId()     // Catch: com.google.mlkit.common.MlKitException -> L38
            boolean r6 = r13.modelExistsLocally()     // Catch: com.google.mlkit.common.MlKitException -> L38
            if (r6 != 0) goto Lad
            if (r4 == 0) goto L3b
            int r6 = r4.intValue()     // Catch: com.google.mlkit.common.MlKitException -> L38
            r7 = 8
            if (r6 != r7) goto L3b
            goto Lad
        L38:
            r0 = move-exception
            goto Lce
        L3b:
            if (r4 == 0) goto L51
            int r6 = r4.intValue()     // Catch: com.google.mlkit.common.MlKitException -> L38
            r7 = 16
            if (r6 != r7) goto L51
            com.google.mlkit.common.MlKitException r0 = r13.m37210k(r5)     // Catch: com.google.mlkit.common.MlKitException -> L38
            r13.removeOrCancelDownload()     // Catch: com.google.mlkit.common.MlKitException -> L38
            com.google.android.gms.tasks.Task r0 = com.google.android.gms.tasks.Tasks.forException(r0)     // Catch: com.google.mlkit.common.MlKitException -> L38
            return r0
        L51:
            if (r4 == 0) goto L8d
            int r6 = r4.intValue()     // Catch: com.google.mlkit.common.MlKitException -> L38
            r7 = 4
            if (r6 == r7) goto L68
            int r6 = r4.intValue()     // Catch: com.google.mlkit.common.MlKitException -> L38
            r7 = 2
            if (r6 == r7) goto L68
            int r4 = r4.intValue()     // Catch: com.google.mlkit.common.MlKitException -> L38
            r6 = 1
            if (r4 != r6) goto L8d
        L68:
            if (r5 == 0) goto L8d
            java.lang.String r4 = r13.getDownloadingModelHash()     // Catch: com.google.mlkit.common.MlKitException -> L38
            if (r4 == 0) goto L8d
            com.google.android.gms.internal.mlkit_common.zzsh r6 = r13.f56967g     // Catch: com.google.mlkit.common.MlKitException -> L38
            com.google.android.gms.internal.mlkit_common.zzry r7 = com.google.android.gms.internal.mlkit_common.zzsk.zzg()     // Catch: com.google.mlkit.common.MlKitException -> L38
            com.google.mlkit.common.model.RemoteModel r8 = r13.f56965e     // Catch: com.google.mlkit.common.MlKitException -> L38
            com.google.android.gms.internal.mlkit_common.zzmu r9 = com.google.android.gms.internal.mlkit_common.zzmu.NO_ERROR     // Catch: com.google.mlkit.common.MlKitException -> L38
            com.google.mlkit.common.sdkinternal.ModelType r11 = r8.getModelType()     // Catch: com.google.mlkit.common.MlKitException -> L38
            com.google.android.gms.internal.mlkit_common.zzna r12 = com.google.android.gms.internal.mlkit_common.zzna.DOWNLOADING     // Catch: com.google.mlkit.common.MlKitException -> L38
            r10 = 0
            r6.zzf(r7, r8, r9, r10, r11, r12)     // Catch: com.google.mlkit.common.MlKitException -> L38
            long r0 = r5.longValue()     // Catch: com.google.mlkit.common.MlKitException -> L38
            com.google.android.gms.tasks.Task r0 = r13.m37212i(r0)     // Catch: com.google.mlkit.common.MlKitException -> L38
            return r0
        L8d:
            if (r1 != 0) goto L90
            goto L96
        L90:
            com.google.mlkit.common.model.DownloadConditions r0 = r13.f56972l     // Catch: com.google.mlkit.common.MlKitException -> L38
            java.lang.Long r0 = r13.m37207n(r1, r0)     // Catch: com.google.mlkit.common.MlKitException -> L38
        L96:
            if (r0 != 0) goto La4
            com.google.mlkit.common.MlKitException r0 = new com.google.mlkit.common.MlKitException     // Catch: com.google.mlkit.common.MlKitException -> L38
            java.lang.String r1 = "Failed to schedule the download task"
            r0.<init>(r1, r3, r2)     // Catch: com.google.mlkit.common.MlKitException -> L38
            com.google.android.gms.tasks.Task r0 = com.google.android.gms.tasks.Tasks.forException(r0)     // Catch: com.google.mlkit.common.MlKitException -> L38
            return r0
        La4:
            long r0 = r0.longValue()     // Catch: com.google.mlkit.common.MlKitException -> L38
            com.google.android.gms.tasks.Task r0 = r13.m37212i(r0)     // Catch: com.google.mlkit.common.MlKitException -> L38
            return r0
        Lad:
            if (r1 == 0) goto Lc9
            com.google.mlkit.common.model.DownloadConditions r2 = r13.f56972l     // Catch: com.google.mlkit.common.MlKitException -> L38
            java.lang.Long r1 = r13.m37207n(r1, r2)     // Catch: com.google.mlkit.common.MlKitException -> L38
            if (r1 == 0) goto Lc0
            long r0 = r1.longValue()     // Catch: com.google.mlkit.common.MlKitException -> L38
            com.google.android.gms.tasks.Task r0 = r13.m37212i(r0)     // Catch: com.google.mlkit.common.MlKitException -> L38
            return r0
        Lc0:
            com.google.android.gms.common.internal.GmsLogger r1 = com.google.mlkit.common.sdkinternal.model.RemoteModelDownloadManager.f56959m     // Catch: com.google.mlkit.common.MlKitException -> L38
            java.lang.String r2 = "ModelDownloadManager"
            java.lang.String r4 = "Didn't schedule download for the updated model"
            r1.m48404i(r2, r4)     // Catch: com.google.mlkit.common.MlKitException -> L38
        Lc9:
            com.google.android.gms.tasks.Task r0 = com.google.android.gms.tasks.Tasks.forResult(r0)     // Catch: com.google.mlkit.common.MlKitException -> L38
            return r0
        Lce:
            com.google.mlkit.common.MlKitException r1 = new com.google.mlkit.common.MlKitException
            java.lang.String r2 = "Failed to ensure the model is downloaded."
            r1.<init>(r2, r3, r0)
            com.google.android.gms.tasks.Task r0 = com.google.android.gms.tasks.Tasks.forException(r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.mlkit.common.sdkinternal.model.RemoteModelDownloadManager.ensureModelDownloaded():com.google.android.gms.tasks.Task");
    }

    /* renamed from: g */
    public final synchronized ModelInfo m37214g() {
        boolean z;
        try {
            boolean modelExistsLocally = modelExistsLocally();
            if (modelExistsLocally) {
                zzsh zzshVar = this.f56967g;
                RemoteModel remoteModel = this.f56965e;
                zzshVar.zzf(zzsk.zzg(), remoteModel, zzmu.NO_ERROR, false, remoteModel.getModelType(), zzna.LIVE);
            }
            ModelInfoRetrieverInterop modelInfoRetrieverInterop = this.f56970j;
            if (modelInfoRetrieverInterop != null) {
                ModelInfo retrieveRemoteModelInfo = modelInfoRetrieverInterop.retrieveRemoteModelInfo(this.f56965e);
                if (retrieveRemoteModelInfo == null) {
                    return null;
                }
                MlKitContext mlKitContext = this.f56963c;
                RemoteModel remoteModel2 = this.f56965e;
                String modelHash = retrieveRemoteModelInfo.getModelHash();
                SharedPrefManager sharedPrefManager = SharedPrefManager.getInstance(mlKitContext);
                boolean equals = modelHash.equals(sharedPrefManager.getIncompatibleModelHash(remoteModel2));
                boolean z2 = false;
                if (equals && CommonUtils.getAppVersion(mlKitContext.getApplicationContext()).equals(sharedPrefManager.getPreviousAppVersion())) {
                    f56959m.m48406e("ModelDownloadManager", "The model is incompatible with TFLite and the app is not upgraded, do not download");
                    z = false;
                } else {
                    z = true;
                }
                if (!modelExistsLocally) {
                    this.f56968h.clearLatestModelHash(this.f56965e);
                }
                boolean z3 = !retrieveRemoteModelInfo.getModelHash().equals(SharedPrefManager.getInstance(this.f56963c).getLatestModelHash(this.f56965e));
                if (z) {
                    if (!modelExistsLocally || z3) {
                        return retrieveRemoteModelInfo;
                    }
                } else {
                    z2 = z3;
                }
                if (modelExistsLocally && (z2 ^ z)) {
                    return null;
                }
                throw new MlKitException("The model " + this.f56965e.getModelName() + " is incompatible with TFLite runtime", 100);
            }
            throw new MlKitException("Please include com.google.mlkit:linkfirebase sdk as your dependency when you try to download from Firebase.", 14);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Nullable
    @KeepForSdk
    public synchronized ParcelFileDescriptor getDownloadedFile() {
        DownloadManager downloadManager = this.f56964d;
        Long downloadingId = getDownloadingId();
        ParcelFileDescriptor parcelFileDescriptor = null;
        if (downloadManager == null || downloadingId == null) {
            return null;
        }
        try {
            parcelFileDescriptor = downloadManager.openDownloadedFile(downloadingId.longValue());
        } catch (FileNotFoundException unused) {
            f56959m.m48406e("ModelDownloadManager", "Downloaded file is not found");
        }
        return parcelFileDescriptor;
    }

    @Nullable
    @KeepForSdk
    public synchronized Long getDownloadingId() {
        return this.f56968h.getDownloadingModelId(this.f56965e);
    }

    @Nullable
    @KeepForSdk
    public synchronized String getDownloadingModelHash() {
        return this.f56968h.getDownloadingModelHash(this.f56965e);
    }

    @Nullable
    @KeepForSdk
    public synchronized Integer getDownloadingModelStatusCode() {
        Integer num;
        DownloadManager downloadManager = this.f56964d;
        Long downloadingId = getDownloadingId();
        Integer num2 = null;
        if (downloadManager != null && downloadingId != null) {
            Cursor query = downloadManager.query(new DownloadManager.Query().setFilterById(downloadingId.longValue()));
            if (query != null && query.moveToFirst()) {
                num = Integer.valueOf(query.getInt(query.getColumnIndex(NotificationCompat.CATEGORY_STATUS)));
            } else {
                num = null;
            }
            if (num == null) {
                if (query != null) {
                    query.close();
                }
            } else {
                if (num.intValue() == 2 || num.intValue() == 4 || num.intValue() == 1 || num.intValue() == 8 || num.intValue() == 16) {
                    num2 = num;
                }
                query.close();
                return num2;
            }
        }
        return null;
    }

    @KeepForSdk
    public int getFailureReason(@NonNull Long l) {
        int columnIndex;
        DownloadManager downloadManager = this.f56964d;
        Cursor cursor = null;
        if (downloadManager != null && l != null) {
            cursor = downloadManager.query(new DownloadManager.Query().setFilterById(l.longValue()));
        }
        if (cursor == null || !cursor.moveToFirst() || (columnIndex = cursor.getColumnIndex("reason")) == -1) {
            return 0;
        }
        return cursor.getInt(columnIndex);
    }

    /* renamed from: i */
    public final Task m37212i(long j) {
        MlKitContext mlKitContext = this.f56963c;
        ContextCompat.registerReceiver(mlKitContext.getApplicationContext(), m37209l(j), new IntentFilter("android.intent.action.DOWNLOAD_COMPLETE"), null, MLTaskExecutor.getInstance().getHandler(), 2);
        return m37211j(j).getTask();
    }

    @KeepForSdk
    @WorkerThread
    public boolean isModelDownloadedAndValid() throws MlKitException {
        try {
            if (modelExistsLocally()) {
                return true;
            }
        } catch (MlKitException unused) {
            f56959m.m48408d("ModelDownloadManager", "Failed to check if the model exist locally.");
        }
        Long downloadingId = getDownloadingId();
        String downloadingModelHash = getDownloadingModelHash();
        if (downloadingId != null && downloadingModelHash != null) {
            Integer downloadingModelStatusCode = getDownloadingModelStatusCode();
            f56959m.m48408d("ModelDownloadManager", "Download Status code: ".concat(String.valueOf(downloadingModelStatusCode)));
            if (downloadingModelStatusCode == null) {
                removeOrCancelDownload();
                return false;
            } else if (Objects.equal(downloadingModelStatusCode, 8) && zzi(downloadingModelHash) != null) {
                return true;
            } else {
                return false;
            }
        }
        f56959m.m48408d("ModelDownloadManager", "No new model is downloading.");
        removeOrCancelDownload();
        return false;
    }

    /* renamed from: j */
    public final synchronized TaskCompletionSource m37211j(long j) {
        TaskCompletionSource taskCompletionSource = (TaskCompletionSource) this.f56962b.get(j);
        if (taskCompletionSource == null) {
            TaskCompletionSource taskCompletionSource2 = new TaskCompletionSource();
            this.f56962b.put(j, taskCompletionSource2);
            return taskCompletionSource2;
        }
        return taskCompletionSource;
    }

    /* renamed from: k */
    public final MlKitException m37210k(Long l) {
        DownloadManager downloadManager = this.f56964d;
        Cursor cursor = null;
        if (downloadManager != null && l != null) {
            cursor = downloadManager.query(new DownloadManager.Query().setFilterById(l.longValue()));
        }
        int i = 13;
        String str = "Model downloading failed";
        if (cursor != null && cursor.moveToFirst()) {
            int i2 = cursor.getInt(cursor.getColumnIndex("reason"));
            if (i2 == 1006) {
                str = "Model downloading failed due to insufficient space on the device.";
                i = 101;
            } else {
                str = "Model downloading failed due to error code: " + i2 + " from Android DownloadManager";
            }
        }
        return new MlKitException(str, i);
    }

    /* renamed from: l */
    public final synchronized C17534Ef2 m37209l(long j) {
        C17534Ef2 c17534Ef2 = (C17534Ef2) this.f56961a.get(j);
        if (c17534Ef2 == null) {
            C17534Ef2 c17534Ef22 = new C17534Ef2(this, j, m37211j(j), null);
            this.f56961a.put(j, c17534Ef22);
            return c17534Ef22;
        }
        return c17534Ef2;
    }

    /* renamed from: m */
    public final synchronized Long m37208m(DownloadManager.Request request, ModelInfo modelInfo) {
        DownloadManager downloadManager = this.f56964d;
        if (downloadManager == null) {
            return null;
        }
        long enqueue = downloadManager.enqueue(request);
        GmsLogger gmsLogger = f56959m;
        gmsLogger.m48408d("ModelDownloadManager", "Schedule a new downloading task: " + enqueue);
        this.f56968h.setDownloadingModelInfo(enqueue, modelInfo);
        this.f56967g.zzf(zzsk.zzg(), this.f56965e, zzmu.NO_ERROR, false, modelInfo.getModelType(), zzna.SCHEDULED);
        return Long.valueOf(enqueue);
    }

    @KeepForSdk
    public boolean modelExistsLocally() throws MlKitException {
        return this.f56969i.modelExistsLocally(this.f56965e.getUniqueModelNameForPersist(), this.f56966f);
    }

    /* renamed from: n */
    public final synchronized Long m37207n(ModelInfo modelInfo, DownloadConditions downloadConditions) {
        try {
            Preconditions.checkNotNull(downloadConditions, "DownloadConditions can not be null");
            String downloadingModelHash = this.f56968h.getDownloadingModelHash(this.f56965e);
            Integer downloadingModelStatusCode = getDownloadingModelStatusCode();
            if (downloadingModelHash != null && downloadingModelHash.equals(modelInfo.getModelHash()) && downloadingModelStatusCode != null) {
                Integer downloadingModelStatusCode2 = getDownloadingModelStatusCode();
                if (downloadingModelStatusCode2 != null) {
                    if (downloadingModelStatusCode2.intValue() != 8 && downloadingModelStatusCode2.intValue() != 16) {
                    }
                    f56959m.m48408d("ModelDownloadManager", "New model is already in downloading, do nothing.");
                    return null;
                }
                zzsh zzshVar = this.f56967g;
                RemoteModel remoteModel = this.f56965e;
                zzshVar.zzf(zzsk.zzg(), remoteModel, zzmu.NO_ERROR, false, remoteModel.getModelType(), zzna.DOWNLOADING);
                f56959m.m48408d("ModelDownloadManager", "New model is already in downloading, do nothing.");
                return null;
            }
            GmsLogger gmsLogger = f56959m;
            gmsLogger.m48408d("ModelDownloadManager", "Need to download a new model.");
            removeOrCancelDownload();
            DownloadManager.Request request = new DownloadManager.Request(modelInfo.getModelUri());
            if (this.f56969i.modelExistsLocally(modelInfo.getModelNameForPersist(), modelInfo.getModelType())) {
                gmsLogger.m48408d("ModelDownloadManager", "Model update is enabled and have a previous downloaded model, use download condition");
                this.f56967g.zzf(zzsk.zzg(), this.f56965e, zzmu.NO_ERROR, false, modelInfo.getModelType(), zzna.UPDATE_AVAILABLE);
            }
            if (Build.VERSION.SDK_INT >= 24) {
                request.setRequiresCharging(downloadConditions.isChargingRequired());
            }
            if (downloadConditions.isWifiRequired()) {
                request.setAllowedNetworkTypes(2);
            }
            return m37208m(request, modelInfo);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @KeepForSdk
    public synchronized void removeOrCancelDownload() throws MlKitException {
        try {
            DownloadManager downloadManager = this.f56964d;
            Long downloadingId = getDownloadingId();
            if (downloadManager != null && downloadingId != null) {
                f56959m.m48408d("ModelDownloadManager", "Cancel or remove existing downloading task: ".concat(downloadingId.toString()));
                if (this.f56964d.remove(downloadingId.longValue()) <= 0) {
                    if (getDownloadingModelStatusCode() == null) {
                    }
                }
                ModelFileHelper modelFileHelper = this.f56969i;
                RemoteModel remoteModel = this.f56965e;
                modelFileHelper.deleteTempFilesInPrivateFolder(remoteModel.getUniqueModelNameForPersist(), remoteModel.getModelType());
                this.f56968h.clearDownloadingModelInfo(this.f56965e);
            }
        } finally {
        }
    }

    @KeepForSdk
    public void setDownloadConditions(@NonNull DownloadConditions downloadConditions) {
        Preconditions.checkNotNull(downloadConditions, "DownloadConditions can not be null");
        this.f56972l = downloadConditions;
    }

    @KeepForSdk
    public synchronized void updateLatestModelHashAndType(@NonNull String str) throws MlKitException {
        this.f56968h.setLatestModelHash(this.f56965e, str);
        removeOrCancelDownload();
    }

    @Nullable
    public final File zzi(@NonNull String str) throws MlKitException {
        GmsLogger gmsLogger = f56959m;
        gmsLogger.m48408d("ModelDownloadManager", "Model downloaded successfully");
        this.f56967g.zzf(zzsk.zzg(), this.f56965e, zzmu.NO_ERROR, true, this.f56966f, zzna.SUCCEEDED);
        ParcelFileDescriptor downloadedFile = getDownloadedFile();
        if (downloadedFile == null) {
            removeOrCancelDownload();
            return null;
        }
        gmsLogger.m48408d("ModelDownloadManager", "moving downloaded model from external storage to private folder.");
        try {
            return this.f56971k.moveModelToPrivateFolder(downloadedFile, str, this.f56965e);
        } finally {
            removeOrCancelDownload();
        }
    }
}
