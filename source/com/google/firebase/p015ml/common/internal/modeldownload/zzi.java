package com.google.firebase.p015ml.common.internal.modeldownload;

import androidx.annotation.NonNull;
import androidx.annotation.WorkerThread;
import com.google.android.gms.common.internal.GmsLogger;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.firebase_ml.zzqn;
import com.google.firebase.p015ml.common.FirebaseMLException;
import com.google.firebase.sessions.settings.RemoteSettings;
import io.reactivex.annotations.SchedulerSupport;
import java.io.File;

/* renamed from: com.google.firebase.ml.common.internal.modeldownload.zzi */
/* loaded from: classes4.dex */
public final class zzi {

    /* renamed from: b */
    public static final GmsLogger f55767b = new GmsLogger("ModelFileHelper", "");

    /* renamed from: c */
    public static final String f55768c = String.format("com.google.firebase.ml.%s.models", SchedulerSupport.CUSTOM);

    /* renamed from: d */
    public static final String f55769d = String.format("com.google.firebase.ml.%s.models", "automl");

    /* renamed from: e */
    public static final String f55770e = String.format("com.google.firebase.ml.%s.models", "base");

    /* renamed from: f */
    public static final String f55771f = String.format("com.google.firebase.ml.%s.models", "translate");

    /* renamed from: a */
    public final zzqn f55772a;

    public zzi(zzqn zzqnVar) {
        this.f55772a = zzqnVar;
    }

    /* renamed from: b */
    public static int m38391b(File file) {
        String str;
        File[] listFiles = file.listFiles();
        int i = -1;
        if (listFiles != null && listFiles.length != 0) {
            for (File file2 : listFiles) {
                try {
                    i = Math.max(i, Integer.parseInt(file2.getName()));
                } catch (NumberFormatException unused) {
                    GmsLogger gmsLogger = f55767b;
                    String valueOf = String.valueOf(file2.getName());
                    if (valueOf.length() != 0) {
                        str = "Contains non-integer file name ".concat(valueOf);
                    } else {
                        str = new String("Contains non-integer file name ");
                    }
                    gmsLogger.m48408d("ModelFileHelper", str);
                }
            }
        }
        return i;
    }

    /* renamed from: a */
    public final File m38392a(String str, zzn zznVar, boolean z) {
        String str2;
        File zzb = zzb(str, zznVar, z);
        if (!zzb.exists()) {
            GmsLogger gmsLogger = f55767b;
            String valueOf = String.valueOf(zzb.getAbsolutePath());
            if (valueOf.length() != 0) {
                str2 = "model folder does not exist, creating one: ".concat(valueOf);
            } else {
                str2 = new String("model folder does not exist, creating one: ");
            }
            gmsLogger.m48408d("ModelFileHelper", str2);
            if (!zzb.mkdirs()) {
                String valueOf2 = String.valueOf(zzb);
                StringBuilder sb = new StringBuilder(valueOf2.length() + 31);
                sb.append("Failed to create model folder: ");
                sb.append(valueOf2);
                throw new FirebaseMLException(sb.toString(), 13);
            }
        } else if (!zzb.isDirectory()) {
            String valueOf3 = String.valueOf(zzb);
            StringBuilder sb2 = new StringBuilder(valueOf3.length() + 71);
            sb2.append("Can not create model folder, since an existing file has the same name: ");
            sb2.append(valueOf3);
            throw new FirebaseMLException(sb2.toString(), 6);
        }
        return zzb;
    }

    /* renamed from: c */
    public final File m38390c(String str, zzn zznVar) {
        return m38392a(str, zznVar, false);
    }

    /* renamed from: d */
    public final boolean m38389d(File file) {
        boolean z;
        File[] fileArr;
        if (file == null) {
            return false;
        }
        if (file.isDirectory()) {
            z = true;
            for (File file2 : (File[]) Preconditions.checkNotNull(file.listFiles())) {
                if (z && m38389d(file2)) {
                    z = true;
                } else {
                    z = false;
                }
            }
        } else {
            z = true;
        }
        if (!z || !file.delete()) {
            return false;
        }
        return true;
    }

    /* renamed from: e */
    public final File m38388e(String str, zzn zznVar) {
        return m38392a(str, zznVar, true);
    }

    public final void zza(String str, zzn zznVar) throws FirebaseMLException {
        if (zznVar != zzn.AUTOML) {
            return;
        }
        File parentFile = zza.zza(this.f55772a, str).getParentFile();
        if (m38389d(parentFile)) {
            return;
        }
        GmsLogger gmsLogger = f55767b;
        String valueOf = String.valueOf(parentFile != null ? parentFile.getAbsolutePath() : null);
        gmsLogger.m48406e("ModelFileHelper", valueOf.length() != 0 ? "Failed to delete the temp labels file directory: ".concat(valueOf) : new String("Failed to delete the temp labels file directory: "));
    }

    public final boolean zzb(String str, zzn zznVar) throws FirebaseMLException {
        String sb;
        if (zznVar == zzn.UNKNOWN) {
            return false;
        }
        File m38392a = m38392a(str, zznVar, false);
        int m38391b = m38391b(m38392a);
        if (m38391b == -1) {
            sb = null;
        } else {
            String absolutePath = m38392a.getAbsolutePath();
            StringBuilder sb2 = new StringBuilder(String.valueOf(absolutePath).length() + 12);
            sb2.append(absolutePath);
            sb2.append(RemoteSettings.FORWARD_SLASH_STRING);
            sb2.append(m38391b);
            sb = sb2.toString();
        }
        return sb != null;
    }

    public final File zzb(@NonNull String str, @NonNull zzn zznVar, boolean z) {
        String str2;
        int i = AbstractC19772et2.f61646a[zznVar.ordinal()];
        if (i == 1) {
            str2 = f55768c;
        } else if (i == 2) {
            str2 = f55770e;
        } else if (i == 3) {
            str2 = f55769d;
        } else if (i == 4) {
            str2 = f55771f;
        } else {
            String name = zznVar.name();
            StringBuilder sb = new StringBuilder(String.valueOf(name).length() + 69);
            sb.append("Unknown model type ");
            sb.append(name);
            sb.append(". Cannot find a dir to store the downloaded model.");
            throw new IllegalArgumentException(sb.toString());
        }
        File file = new File(this.f55772a.getApplicationContext().getNoBackupFilesDir(), str2);
        if (z) {
            file = new File(file, "temp");
        }
        return new File(new File(file, this.f55772a.getPersistenceKey()), str);
    }

    @WorkerThread
    public final synchronized void zza(zzn zznVar, String str) {
        m38389d(zzb(str, zznVar, false));
        m38389d(zzb(str, zznVar, true));
    }
}
