package p000;

import com.google.android.gms.common.internal.GmsLogger;
import com.google.android.gms.internal.firebase_ml.zzqn;
import com.google.firebase.p015ml.common.internal.modeldownload.zzab;
import com.google.firebase.p015ml.common.internal.modeldownload.zzi;
import com.google.firebase.p015ml.common.internal.modeldownload.zzk;
import com.google.firebase.p015ml.common.internal.modeldownload.zzn;
import java.io.File;

/* renamed from: Dc2  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C17487Dc2 implements zzk {

    /* renamed from: a */
    public final zzqn f1058a;

    /* renamed from: b */
    public final String f1059b;

    public C17487Dc2(zzqn zzqnVar, String str) {
        this.f1058a = zzqnVar;
        this.f1059b = str;
    }

    @Override // com.google.firebase.p015ml.common.internal.modeldownload.zzk
    public final File zza(File file) {
        GmsLogger gmsLogger;
        GmsLogger gmsLogger2;
        String str;
        GmsLogger gmsLogger3;
        File m38382c = new zzi(this.f1058a).m38382c(this.f1059b, zzn.TRANSLATE);
        File file2 = new File(m38382c, String.valueOf(zzi.m38383b(m38382c) + 1));
        if (file.renameTo(file2)) {
            gmsLogger3 = zzab.f55748i;
            gmsLogger3.m48405d("RemoteModelFileManager", "Rename to serving model successfully");
            file2.setExecutable(false);
            file2.setWritable(false);
            return file2;
        }
        gmsLogger = zzab.f55748i;
        gmsLogger.m48405d("RemoteModelFileManager", "Rename to serving model failed, remove the temp file.");
        if (!file.delete()) {
            gmsLogger2 = zzab.f55748i;
            String valueOf = String.valueOf(file.getAbsolutePath());
            if (valueOf.length() != 0) {
                str = "Failed to delete the temp file: ".concat(valueOf);
            } else {
                str = new String("Failed to delete the temp file: ");
            }
            gmsLogger2.m48405d("RemoteModelFileManager", str);
            return null;
        }
        return null;
    }
}