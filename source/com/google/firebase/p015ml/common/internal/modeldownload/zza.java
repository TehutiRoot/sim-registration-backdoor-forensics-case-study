package com.google.firebase.p015ml.common.internal.modeldownload;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.GmsLogger;
import com.google.android.gms.internal.firebase_ml.zznf;
import com.google.android.gms.internal.firebase_ml.zzqn;
import com.google.firebase.p015ml.common.FirebaseMLException;
import com.google.firebase.p015ml.common.internal.modeldownload.zza;
import com.google.mlkit.common.sdkinternal.Constants;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.google.firebase.ml.common.internal.modeldownload.zza */
/* loaded from: classes4.dex */
public final class zza implements zzk {

    /* renamed from: d */
    public static final GmsLogger f55732d = new GmsLogger("AutoMLModelFileManager", "");

    /* renamed from: a */
    public final zzqn f55733a;

    /* renamed from: b */
    public final String f55734b;

    /* renamed from: c */
    public final zzi f55735c;

    public zza(zzqn zzqnVar, String str) {
        this.f55733a = zzqnVar;
        this.f55734b = str;
        this.f55735c = new zzi(zzqnVar);
    }

    /* renamed from: a */
    public static void m38407a(File file, InterfaceC19401ck2 interfaceC19401ck2) {
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file), Charset.forName("UTF-8")));
        try {
            interfaceC19401ck2.mo229a(bufferedWriter);
            bufferedWriter.close();
        } catch (Throwable th2) {
            try {
                bufferedWriter.close();
            } catch (Throwable th3) {
                zznf.zza(th2, th3);
            }
            throw th2;
        }
    }

    /* renamed from: b */
    public static final /* synthetic */ void m38406b(String str, BufferedWriter bufferedWriter) {
        bufferedWriter.write(str);
    }

    /* renamed from: c */
    public static final /* synthetic */ void m38405c(List list, BufferedWriter bufferedWriter) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            bufferedWriter.write((String) it.next());
            bufferedWriter.newLine();
        }
    }

    @Override // com.google.firebase.p015ml.common.internal.modeldownload.zzk
    @Nullable
    public final File zza(File file) throws FirebaseMLException {
        File m38390c = this.f55735c.m38390c(this.f55734b, zzn.AUTOML);
        File file2 = new File(new File(m38390c, String.valueOf(zzi.m38391b(m38390c) + 1)), Constants.MODEL_FILE_NAME);
        File parentFile = file2.getParentFile();
        if (!parentFile.exists()) {
            parentFile.mkdirs();
        }
        File zza = zza(this.f55733a, this.f55734b);
        File file3 = new File(parentFile, Constants.AUTOML_IMAGE_LABELING_LABELS_FILE_NAME);
        if (file.renameTo(file2) && zza.renameTo(file3)) {
            f55732d.m48408d("AutoMLModelFileManager", "Rename to serving model successfully");
            file2.setExecutable(false);
            file2.setWritable(false);
            file3.setExecutable(false);
            file3.setWritable(false);
            try {
                m38407a(new File(parentFile, Constants.AUTOML_IMAGE_LABELING_MANIFEST_JSON_FILE_NAME), new InterfaceC19401ck2(String.format("{\n\t\"modelType\": \"%s\",\n\t\"modelFile\": \"%s\",\n\t\"labelsFile\": \"%s\"\n}", Constants.AUTOML_IMAGE_LABELING_MODEL_TYPE, Constants.MODEL_FILE_NAME, Constants.AUTOML_IMAGE_LABELING_LABELS_FILE_NAME)) { // from class: yf2

                    /* renamed from: a */
                    public final String f108810a;

                    {
                        this.f108810a = r1;
                    }

                    @Override // p000.InterfaceC19401ck2
                    /* renamed from: a */
                    public final void mo229a(BufferedWriter bufferedWriter) {
                        zza.m38406b(this.f108810a, bufferedWriter);
                    }
                });
                return file2.getParentFile();
            } catch (IOException e) {
                String valueOf = String.valueOf(this.f55734b);
                throw new FirebaseMLException(valueOf.length() != 0 ? "Failed to write manifest json for the AutoML model: ".concat(valueOf) : new String("Failed to write manifest json for the AutoML model: "), 13, e);
            }
        }
        GmsLogger gmsLogger = f55732d;
        gmsLogger.m48408d("AutoMLModelFileManager", "Rename to serving model failed, remove the temp file.");
        if (!file.delete()) {
            String valueOf2 = String.valueOf(file.getAbsolutePath());
            gmsLogger.m48408d("AutoMLModelFileManager", valueOf2.length() != 0 ? "Failed to delete the temp model file: ".concat(valueOf2) : new String("Failed to delete the temp model file: "));
        }
        if (zza.delete()) {
            return null;
        }
        String valueOf3 = String.valueOf(zza.getAbsolutePath());
        gmsLogger.m48408d("AutoMLModelFileManager", valueOf3.length() != 0 ? "Failed to delete the temp labels file: ".concat(valueOf3) : new String("Failed to delete the temp labels file: "));
        return null;
    }

    public static void zza(@NonNull zzqn zzqnVar, @NonNull String str, @NonNull List<String> list) throws FirebaseMLException {
        try {
            m38407a(zza(zzqnVar, str), new InterfaceC19401ck2(list) { // from class: rd2

                /* renamed from: a */
                public final List f77336a;

                {
                    this.f77336a = list;
                }

                @Override // p000.InterfaceC19401ck2
                /* renamed from: a */
                public final void mo229a(BufferedWriter bufferedWriter) {
                    zza.m38405c(this.f77336a, bufferedWriter);
                }
            });
        } catch (IOException e) {
            String valueOf = String.valueOf(str);
            throw new FirebaseMLException(valueOf.length() != 0 ? "Failed to write labels file for the AutoML model: ".concat(valueOf) : new String("Failed to write labels file for the AutoML model: "), 13, e);
        }
    }

    public static File zza(@NonNull zzqn zzqnVar, @NonNull String str) throws FirebaseMLException {
        File m38388e = new zzi(zzqnVar).m38388e(str, zzn.AUTOML);
        if (m38388e.exists() && m38388e.isFile() && !m38388e.delete()) {
            String valueOf = String.valueOf(m38388e.getAbsolutePath());
            throw new FirebaseMLException(valueOf.length() != 0 ? "Failed to delete the temp labels file: ".concat(valueOf) : new String("Failed to delete the temp labels file: "), 13);
        }
        if (!m38388e.exists()) {
            GmsLogger gmsLogger = f55732d;
            String valueOf2 = String.valueOf(m38388e.getAbsolutePath());
            gmsLogger.m48408d("AutoMLModelFileManager", valueOf2.length() != 0 ? "Temp labels folder does not exist, creating one: ".concat(valueOf2) : new String("Temp labels folder does not exist, creating one: "));
            if (!m38388e.mkdirs()) {
                throw new FirebaseMLException("Failed to create a directory to hold the AutoML model's labels file.", 13);
            }
        }
        return new File(m38388e, Constants.AUTOML_IMAGE_LABELING_LABELS_FILE_NAME);
    }
}
