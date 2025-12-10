package com.google.mlkit.common.internal.model;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.GmsLogger;
import com.google.android.gms.common.internal.Preconditions;
import com.google.mlkit.common.MlKitException;
import com.google.mlkit.common.sdkinternal.Constants;
import com.google.mlkit.common.sdkinternal.MlKitContext;
import com.google.mlkit.common.sdkinternal.ModelType;
import com.google.mlkit.common.sdkinternal.model.ModelFileHelper;
import com.google.mlkit.common.sdkinternal.model.RemoteModelFileMover;
import java.io.File;

/* loaded from: classes4.dex */
public final class zza implements RemoteModelFileMover {

    /* renamed from: c */
    public static final GmsLogger f56877c = new GmsLogger("CustomModelFileMover", "");

    /* renamed from: a */
    public final String f56878a;

    /* renamed from: b */
    public final ModelFileHelper f56879b;

    public zza(@NonNull MlKitContext mlKitContext, @NonNull String str) {
        this.f56878a = str;
        this.f56879b = new ModelFileHelper(mlKitContext);
    }

    /* renamed from: a */
    public static boolean m37250a(File file, File file2) {
        String absolutePath = file.getAbsolutePath();
        String absolutePath2 = file2.getAbsolutePath();
        if (file.renameTo(file2)) {
            f56877c.m48408d("CustomModelFileMover", String.format("Moved file from %s to %s successfully", absolutePath, absolutePath2));
            file2.setExecutable(false);
            file2.setWritable(false);
            return true;
        }
        GmsLogger gmsLogger = f56877c;
        gmsLogger.m48408d("CustomModelFileMover", String.format("Move file to %s failed, remove the temp file %s.", absolutePath2, absolutePath));
        if (!file.delete()) {
            gmsLogger.m48408d("CustomModelFileMover", "Failed to delete the temp file: ".concat(String.valueOf(absolutePath)));
        }
        return false;
    }

    @Override // com.google.mlkit.common.sdkinternal.model.RemoteModelFileMover
    public final File getModelFileDestination() throws MlKitException {
        File modelDir = this.f56879b.getModelDir(this.f56878a, ModelType.CUSTOM);
        return new File(new File(modelDir, String.valueOf(this.f56879b.getLatestCachedModelVersion(modelDir) + 1)), Constants.MODEL_FILE_NAME);
    }

    @Override // com.google.mlkit.common.sdkinternal.model.RemoteModelFileMover
    @Nullable
    public final File moveAllFilesFromPrivateTempToPrivateDestination(File file) throws MlKitException {
        File file2;
        ModelFileHelper modelFileHelper = this.f56879b;
        String str = this.f56878a;
        ModelType modelType = ModelType.CUSTOM;
        File modelDir = modelFileHelper.getModelDir(str, modelType);
        File file3 = new File(new File(modelDir, String.valueOf(this.f56879b.getLatestCachedModelVersion(modelDir) + 1)), Constants.MODEL_FILE_NAME);
        File parentFile = file3.getParentFile();
        if (parentFile != null && !parentFile.exists()) {
            ((File) Preconditions.checkNotNull(parentFile)).mkdirs();
        }
        File file4 = null;
        if (!m37250a(file, file3)) {
            return null;
        }
        File tempFileInPrivateFolder = this.f56879b.getTempFileInPrivateFolder(this.f56878a, modelType, Constants.AUTOML_IMAGE_LABELING_LABELS_FILE_NAME);
        if (tempFileInPrivateFolder.exists()) {
            file2 = new File(parentFile, Constants.AUTOML_IMAGE_LABELING_LABELS_FILE_NAME);
            if (!m37250a(tempFileInPrivateFolder, file2)) {
                return null;
            }
        } else {
            file2 = null;
        }
        File tempFileInPrivateFolder2 = this.f56879b.getTempFileInPrivateFolder(this.f56878a, modelType, Constants.AUTOML_IMAGE_LABELING_MANIFEST_JSON_FILE_NAME);
        if (tempFileInPrivateFolder2.exists()) {
            File file5 = new File(parentFile, Constants.AUTOML_IMAGE_LABELING_MANIFEST_JSON_FILE_NAME);
            if (!m37250a(tempFileInPrivateFolder2, file5)) {
                return null;
            }
            file4 = file5;
        }
        if (file2 == null && file4 == null) {
            return file3;
        }
        return parentFile;
    }
}
