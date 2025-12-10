package p000;

import android.net.Uri;
import com.google.android.gms.common.internal.GmsLogger;
import com.google.android.gms.internal.firebase_ml.zznq;
import com.google.android.gms.internal.firebase_ml.zzoa;
import com.google.firebase.p015ml.common.FirebaseMLException;
import com.google.firebase.p015ml.common.internal.modeldownload.zzac;
import com.google.firebase.p015ml.common.internal.modeldownload.zzaf;
import com.google.firebase.p015ml.common.internal.modeldownload.zzn;
import com.google.firebase.p015ml.common.internal.modeldownload.zzy;
import com.google.firebase.p015ml.common.modeldownload.FirebaseRemoteModel;
import javax.net.ssl.HttpsURLConnection;

/* renamed from: uh2  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC22488uh2 {

    /* renamed from: a */
    public static final GmsLogger f107435a = new GmsLogger("BaseModelInfoRetriever", "");

    /* renamed from: a */
    public static zzac m1225a(FirebaseRemoteModel firebaseRemoteModel, zzy zzyVar) {
        String str;
        HttpsURLConnection m38400b = zzaf.m38400b(String.format("https://mlkit.googleapis.com/_i/v1/1p/m?n=%s", firebaseRemoteModel.getModelNameForBackend()), zzyVar);
        if (m38400b == null) {
            return null;
        }
        String headerField = m38400b.getHeaderField("Content-Location");
        String headerField2 = m38400b.getHeaderField("ETag");
        GmsLogger gmsLogger = f107435a;
        String valueOf = String.valueOf(headerField);
        if (valueOf.length() != 0) {
            str = "Received download URL: ".concat(valueOf);
        } else {
            str = new String("Received download URL: ");
        }
        gmsLogger.m48408d("BaseModelInfoRetriever", str);
        if (headerField == null) {
            return null;
        }
        if (headerField2 != null) {
            if (firebaseRemoteModel.baseModelHashMatches(headerField2)) {
                firebaseRemoteModel.setModelHash(headerField2);
                return new zzac(firebaseRemoteModel.getUniqueModelNameForPersist(), Uri.parse(headerField), headerField2, zzn.BASE);
            }
            throw new FirebaseMLException("Downloaded model hash doesn't match the expected. ", 13);
        }
        zzyVar.zza(zzoa.MODEL_INFO_DOWNLOAD_NO_HASH, false, zzn.BASE, zznq.zzak.zzb.MODEL_INFO_RETRIEVAL_FAILED);
        throw new FirebaseMLException("No hash value for the base model", 13);
    }
}
