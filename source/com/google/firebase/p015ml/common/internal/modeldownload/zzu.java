package com.google.firebase.p015ml.common.internal.modeldownload;

import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.VisibleForTesting;
import androidx.annotation.WorkerThread;
import com.google.android.gms.common.internal.GmsLogger;
import com.google.android.gms.common.util.IOUtils;
import com.google.android.gms.internal.firebase_ml.zznq;
import com.google.android.gms.internal.firebase_ml.zzoa;
import com.google.android.gms.internal.firebase_ml.zzqn;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.FirebaseApp;
import com.google.firebase.installations.FirebaseInstallations;
import com.google.firebase.installations.InstallationTokenResult;
import com.google.firebase.p015ml.common.FirebaseMLException;
import com.google.firebase.p015ml.common.modeldownload.FirebaseRemoteModel;
import java.io.IOException;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.concurrent.ExecutionException;
import javax.net.ssl.HttpsURLConnection;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@VisibleForTesting
@WorkerThread
/* renamed from: com.google.firebase.ml.common.internal.modeldownload.zzu */
/* loaded from: classes4.dex */
public final class zzu {

    /* renamed from: a */
    public static final GmsLogger f55779a = new GmsLogger("ModelInfoRetriever", "");

    /* renamed from: b */
    public static zzw f55780b = LJ2.f3441a;

    /* renamed from: a */
    public static zzac m38384a(zzqn zzqnVar, FirebaseApp firebaseApp, FirebaseRemoteModel firebaseRemoteModel, zzy zzyVar) {
        String str;
        zzn zznVar;
        JSONObject jSONObject;
        HttpsURLConnection m38400b = zzaf.m38400b(m38383b(firebaseApp, firebaseRemoteModel.getModelNameForBackend(), zzyVar), zzyVar);
        if (m38400b == null) {
            return null;
        }
        String headerField = m38400b.getHeaderField("Content-Location");
        String headerField2 = m38400b.getHeaderField("ETag");
        GmsLogger gmsLogger = f55779a;
        String valueOf = String.valueOf(headerField);
        if (valueOf.length() != 0) {
            str = "Received download URL: ".concat(valueOf);
        } else {
            str = new String("Received download URL: ");
        }
        gmsLogger.m48408d("ModelInfoRetriever", str);
        if (headerField == null) {
            return null;
        }
        if (headerField2 != null) {
            firebaseRemoteModel.setModelHash(headerField2);
            try {
                String str2 = new String(IOUtils.readInputStreamFully(m38400b.getInputStream()));
                if (TextUtils.isEmpty(str2)) {
                    str2 = "{}";
                }
                JSONObject jSONObject2 = new JSONObject(str2);
                if (jSONObject2.has("inferenceInfo")) {
                    zznVar = zzn.AUTOML;
                } else {
                    zznVar = zzn.CUSTOM;
                }
                if (zznVar.equals(zzn.AUTOML) && (jSONObject = jSONObject2.getJSONObject("inferenceInfo")) != null) {
                    JSONArray jSONArray = jSONObject.getJSONArray("labels");
                    if (jSONArray != null && jSONArray.length() != 0) {
                        ArrayList arrayList = new ArrayList();
                        for (int i = 0; i < jSONArray.length(); i++) {
                            arrayList.add(jSONArray.getString(i));
                        }
                        zza.zza(zzqnVar, firebaseRemoteModel.getUniqueModelNameForPersist(), arrayList);
                    } else {
                        throw new FirebaseMLException("Cannot parse AutoML model's labels from model downloading backend.", 13);
                    }
                }
                return new zzac(firebaseRemoteModel.getUniqueModelNameForPersist(), Uri.parse(headerField), headerField2, zznVar);
            } catch (IOException e) {
                e = e;
                throw new FirebaseMLException("Failed to parse the model backend response message", 13, e);
            } catch (JSONException e2) {
                e = e2;
                throw new FirebaseMLException("Failed to parse the model backend response message", 13, e);
            }
        }
        zzyVar.zza(zzoa.MODEL_INFO_DOWNLOAD_NO_HASH, false, zzn.UNKNOWN, zznq.zzak.zzb.MODEL_INFO_RETRIEVAL_FAILED);
        throw new FirebaseMLException("No hash value for the custom model", 13);
    }

    /* renamed from: b */
    public static String m38383b(FirebaseApp firebaseApp, String str, zzy zzyVar) {
        String str2;
        if (firebaseApp.getOptions().getGcmSenderId() != null) {
            FirebaseInstallations zza = f55780b.zza(firebaseApp);
            if (zza == null) {
                f55779a.m48400w("ModelInfoRetriever", "Cannot get a valid instance of FirebaseInstanceId. Cannot retrieve model info.");
                return null;
            }
            try {
                try {
                    return String.format("https://mlkit.googleapis.com/v1beta1/projects/%s/models/%s/versions/active?key=%s&app_instance_id=%s&app_instance_token=%s", firebaseApp.getOptions().getProjectId(), str, firebaseApp.getOptions().getApiKey(), (String) Tasks.await(zza.getId()), ((InstallationTokenResult) Tasks.await(zza.getToken(false))).getToken());
                } catch (InterruptedException unused) {
                    throw new FirebaseMLException("Interrupted while retrieving model info", 13);
                } catch (ExecutionException e) {
                    zzoa zzoaVar = zzoa.MODEL_INFO_DOWNLOAD_CONNECTION_FAILED;
                    if (e.getCause() instanceof UnknownHostException) {
                        zzoaVar = zzoa.NO_NETWORK_CONNECTION;
                        str2 = "Failed to retrieve model info due to no internet connection.";
                    } else {
                        str2 = "Failed to get model URL";
                    }
                    zzyVar.zza(zzoaVar, false, zzn.UNKNOWN, zznq.zzak.zzb.MODEL_INFO_RETRIEVAL_FAILED);
                    throw new FirebaseMLException(str2, 13, e.getCause());
                }
            } catch (InterruptedException unused2) {
                throw new FirebaseMLException("Interrupted while retrieving model info", 13);
            } catch (ExecutionException e2) {
                f55779a.m48399w("ModelInfoRetriever", "Failed to retrieve Firebase instance id. Cannot retrieve model info.", e2.getCause());
                throw new FirebaseMLException("Error while retrieving model info", 13, e2.getCause());
            }
        }
        throw new FirebaseMLException("GCM sender id cannot be null in FirebaseOptions. Please configure FirebaseApp properly.", 9);
    }
}
