package com.google.mlkit.common.sdkinternal.model;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.util.Base64Utils;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.mlkit.common.sdkinternal.MLTaskExecutor;
import java.io.File;
import java.util.concurrent.Executor;

@KeepForSdk
/* loaded from: classes4.dex */
public abstract class LegacyModelMigrator {

    /* renamed from: b */
    public final Context f56946b;
    @NonNull
    @KeepForSdk
    protected final ModelFileHelper modelFileHelper;

    /* renamed from: a */
    public final TaskCompletionSource f56945a = new TaskCompletionSource();

    /* renamed from: c */
    public final Executor f56947c = MLTaskExecutor.workerThreadExecutor();

    @KeepForSdk
    public LegacyModelMigrator(@NonNull Context context, @NonNull ModelFileHelper modelFileHelper) {
        this.f56946b = context;
        this.modelFileHelper = modelFileHelper;
    }

    @KeepForSdk
    public static void deleteIfEmpty(@NonNull File file) {
        File[] listFiles = file.listFiles();
        if ((listFiles == null || listFiles.length == 0) && !file.delete()) {
            "Error deleting model directory ".concat(String.valueOf(file));
        }
    }

    @KeepForSdk
    public static boolean isValidFirebasePersistenceKey(@NonNull String str) {
        String[] split = str.split("\\+", -1);
        if (split.length != 2) {
            return false;
        }
        try {
            Base64Utils.decodeUrlSafeNoPadding(split[0]);
            Base64Utils.decodeUrlSafeNoPadding(split[1]);
            return true;
        } catch (IllegalArgumentException unused) {
            return false;
        }
    }

    @KeepForSdk
    @VisibleForTesting
    public static void migrateFile(@NonNull File file, @NonNull File file2) {
        if (file.exists()) {
            if (!file2.exists() && !file.renameTo(file2)) {
                String valueOf = String.valueOf(file);
                String valueOf2 = String.valueOf(file2);
                StringBuilder sb = new StringBuilder();
                sb.append("Error moving model file ");
                sb.append(valueOf);
                sb.append(" to ");
                sb.append(valueOf2);
            }
            if (file.exists() && !file.delete()) {
                "Error deleting model file ".concat(String.valueOf(file));
            }
        }
    }

    /* renamed from: a */
    public final /* synthetic */ void m37225a() {
        File legacyRootDir = getLegacyRootDir();
        File[] listFiles = legacyRootDir.listFiles();
        if (listFiles != null) {
            for (File file : listFiles) {
                migrateAllModelDirs(file);
            }
            deleteIfEmpty(legacyRootDir);
        }
        this.f56945a.setResult(null);
    }

    @NonNull
    @KeepForSdk
    @VisibleForTesting
    public abstract String getLegacyModelDirName();

    @NonNull
    @KeepForSdk
    @VisibleForTesting
    public File getLegacyRootDir() {
        Context context = this.f56946b;
        return new File(context.getNoBackupFilesDir(), getLegacyModelDirName());
    }

    @NonNull
    @KeepForSdk
    public Task<Void> getMigrationTask() {
        return this.f56945a.getTask();
    }

    @KeepForSdk
    public abstract void migrateAllModelDirs(@NonNull File file);

    @KeepForSdk
    public void start() {
        this.f56947c.execute(new Runnable() { // from class: com.google.mlkit.common.sdkinternal.model.zza
            {
                LegacyModelMigrator.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                LegacyModelMigrator.this.m37225a();
            }
        });
    }
}
