package p000;

import com.google.android.gms.common.internal.GmsLogger;
import com.google.android.gms.internal.firebase_ml.zzqn;
import com.google.firebase.p015ml.common.internal.modeldownload.zzab;
import com.google.firebase.p015ml.common.internal.modeldownload.zzi;
import com.google.firebase.p015ml.common.internal.modeldownload.zzk;
import com.google.firebase.p015ml.common.internal.modeldownload.zzn;
import java.io.File;

/* renamed from: Gb2  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C17650Gb2 implements zzk {

    /* renamed from: a */
    public final zzqn f1962a;

    /* renamed from: b */
    public final String f1963b;

    public C17650Gb2(zzqn zzqnVar, String str) {
        this.f1962a = zzqnVar;
        this.f1963b = str;
    }

    @Override // com.google.firebase.p015ml.common.internal.modeldownload.zzk
    public final File zza(File file) {
        GmsLogger gmsLogger;
        GmsLogger gmsLogger2;
        String str;
        GmsLogger gmsLogger3;
        File m38390c = new zzi(this.f1962a).m38390c(this.f1963b, zzn.TRANSLATE);
        File file2 = new File(m38390c, String.valueOf(zzi.m38391b(m38390c) + 1));
        if (file.renameTo(file2)) {
            gmsLogger3 = zzab.f55736i;
            gmsLogger3.m48408d("RemoteModelFileManager", "Rename to serving model successfully");
            file2.setExecutable(false);
            file2.setWritable(false);
            return file2;
        }
        gmsLogger = zzab.f55736i;
        gmsLogger.m48408d("RemoteModelFileManager", "Rename to serving model failed, remove the temp file.");
        if (!file.delete()) {
            gmsLogger2 = zzab.f55736i;
            String valueOf = String.valueOf(file.getAbsolutePath());
            if (valueOf.length() != 0) {
                str = "Failed to delete the temp file: ".concat(valueOf);
            } else {
                str = new String("Failed to delete the temp file: ");
            }
            gmsLogger2.m48408d("RemoteModelFileManager", str);
            return null;
        }
        return null;
    }
}
