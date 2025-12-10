package com.google.mlkit.common.sdkinternal.model;

import android.annotation.SuppressLint;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.WorkerThread;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.GmsLogger;
import com.google.mlkit.common.MlKitException;
import com.google.mlkit.common.model.RemoteModel;
import com.google.mlkit.common.sdkinternal.MlKitContext;
import com.google.mlkit.common.sdkinternal.ModelType;
import com.google.mlkit.common.sdkinternal.SharedPrefManager;
import java.io.File;

@KeepForSdk
/* loaded from: classes4.dex */
public class RemoteModelFileManager {

    /* renamed from: h */
    public static final GmsLogger f56973h = new GmsLogger("RemoteModelFileManager", "");

    /* renamed from: a */
    public final MlKitContext f56974a;

    /* renamed from: b */
    public final String f56975b;

    /* renamed from: c */
    public final ModelType f56976c;

    /* renamed from: d */
    public final ModelValidator f56977d;

    /* renamed from: e */
    public final RemoteModelFileMover f56978e;

    /* renamed from: f */
    public final SharedPrefManager f56979f;

    /* renamed from: g */
    public final ModelFileHelper f56980g;

    @SuppressLint({"FirebaseLambdaLast"})
    public RemoteModelFileManager(@NonNull MlKitContext mlKitContext, @NonNull RemoteModel remoteModel, @Nullable ModelValidator modelValidator, @NonNull ModelFileHelper modelFileHelper, @NonNull RemoteModelFileMover remoteModelFileMover) {
        String uniqueModelNameForPersist;
        this.f56974a = mlKitContext;
        ModelType modelType = remoteModel.getModelType();
        this.f56976c = modelType;
        if (modelType == ModelType.TRANSLATE) {
            uniqueModelNameForPersist = remoteModel.getModelNameForBackend();
        } else {
            uniqueModelNameForPersist = remoteModel.getUniqueModelNameForPersist();
        }
        this.f56975b = uniqueModelNameForPersist;
        this.f56977d = modelValidator;
        this.f56979f = SharedPrefManager.getInstance(mlKitContext);
        this.f56980g = modelFileHelper;
        this.f56978e = remoteModelFileMover;
    }

    @NonNull
    @KeepForSdk
    public File getModelDirUnsafe(boolean z) {
        return this.f56980g.getModelDirUnsafe(this.f56975b, this.f56976c, z);
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x009f, code lost:
        com.google.mlkit.common.sdkinternal.model.RemoteModelFileManager.f56973h.m48408d("RemoteModelFileManager", "Hash does not match with expected: ".concat(java.lang.String.valueOf(r12)));
        com.google.android.gms.internal.mlkit_common.zzss.zzb("common").zzf(com.google.android.gms.internal.mlkit_common.zzsk.zzg(), r13, com.google.android.gms.internal.mlkit_common.zzmu.MODEL_HASH_MISMATCH, true, r10.f56976c, com.google.android.gms.internal.mlkit_common.zzna.SUCCEEDED);
        r11 = new com.google.mlkit.common.MlKitException("Hash does not match with expected", 102);
     */
    @androidx.annotation.Nullable
    @com.google.android.gms.common.annotation.KeepForSdk
    @androidx.annotation.WorkerThread
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public synchronized java.io.File moveModelToPrivateFolder(@androidx.annotation.NonNull android.os.ParcelFileDescriptor r11, @androidx.annotation.NonNull java.lang.String r12, @androidx.annotation.NonNull com.google.mlkit.common.model.RemoteModel r13) throws com.google.mlkit.common.MlKitException {
        /*
            Method dump skipped, instructions count: 287
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.mlkit.common.sdkinternal.model.RemoteModelFileManager.moveModelToPrivateFolder(android.os.ParcelFileDescriptor, java.lang.String, com.google.mlkit.common.model.RemoteModel):java.io.File");
    }

    @NonNull
    @WorkerThread
    public final synchronized File zza(@NonNull File file) throws MlKitException {
        File file2 = new File(String.valueOf(this.f56980g.getModelDir(this.f56975b, this.f56976c).getAbsolutePath()).concat("/0"));
        if (file2.exists()) {
            return file;
        }
        if (file.renameTo(file2)) {
            return file2;
        }
        return file;
    }

    @Nullable
    @WorkerThread
    public final synchronized String zzb() throws MlKitException {
        return this.f56980g.zzb(this.f56975b, this.f56976c);
    }

    @WorkerThread
    public final synchronized void zzc(@NonNull File file) {
        File[] listFiles;
        File modelDirUnsafe = getModelDirUnsafe(false);
        if (modelDirUnsafe.exists() && (listFiles = modelDirUnsafe.listFiles()) != null) {
            for (File file2 : listFiles) {
                if (file2.equals(file)) {
                    this.f56980g.deleteRecursively(file);
                    return;
                }
            }
        }
    }

    @WorkerThread
    public final synchronized boolean zzd(@NonNull File file) throws MlKitException {
        File modelDir = this.f56980g.getModelDir(this.f56975b, this.f56976c);
        if (!modelDir.exists()) {
            return false;
        }
        File[] listFiles = modelDir.listFiles();
        boolean z = true;
        if (listFiles == null) {
            return true;
        }
        for (File file2 : listFiles) {
            if (!file2.equals(file) && !this.f56980g.deleteRecursively(file2)) {
                z = false;
            }
        }
        return z;
    }
}
