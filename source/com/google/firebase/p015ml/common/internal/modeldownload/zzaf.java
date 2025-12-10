package com.google.firebase.p015ml.common.internal.modeldownload;

import androidx.annotation.WorkerThread;
import com.google.android.gms.common.internal.GmsLogger;
import com.google.android.gms.common.util.IOUtils;
import com.google.android.gms.internal.firebase_ml.zznq;
import com.google.android.gms.internal.firebase_ml.zzoa;
import com.google.android.gms.internal.firebase_ml.zzqn;
import com.google.firebase.p015ml.common.FirebaseMLException;
import com.google.firebase.p015ml.common.modeldownload.FirebaseRemoteModel;
import com.google.firebase.perf.util.Constants;
import java.io.IOException;
import java.io.InputStream;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.util.Locale;
import javax.net.ssl.HttpsURLConnection;

@WorkerThread
/* renamed from: com.google.firebase.ml.common.internal.modeldownload.zzaf */
/* loaded from: classes4.dex */
public final class zzaf {

    /* renamed from: a */
    public static final GmsLogger f55749a = new GmsLogger("RmModelInfoRetriever", "");

    /* renamed from: a */
    public static zzac m38401a(zzqn zzqnVar, FirebaseRemoteModel firebaseRemoteModel, zzy zzyVar) {
        zzac m38384a;
        if (firebaseRemoteModel.isBaseModel()) {
            m38384a = AbstractC22488uh2.m1225a(firebaseRemoteModel, zzyVar);
        } else {
            m38384a = zzu.m38384a(zzqnVar, zzqnVar.zzos(), firebaseRemoteModel, zzyVar);
        }
        if (m38384a != null) {
            zzyVar.zza(zzoa.NO_ERROR, false, m38384a.zzpx(), zznq.zzak.zzb.MODEL_INFO_RETRIEVAL_SUCCEEDED);
        }
        return m38384a;
    }

    /* renamed from: b */
    public static HttpsURLConnection m38400b(String str, zzy zzyVar) {
        String str2;
        String str3;
        zzoa zzoaVar;
        String str4;
        if (str == null) {
            return null;
        }
        try {
            zzak zzakVar = new zzak(str);
            GmsLogger gmsLogger = f55749a;
            if (str.length() != 0) {
                str3 = "Checking model URL: ".concat(str);
            } else {
                str3 = new String("Checking model URL: ");
            }
            gmsLogger.m48408d("RmModelInfoRetriever", str3);
            HttpsURLConnection httpsURLConnection = (HttpsURLConnection) zzakVar.openConnection();
            httpsURLConnection.setConnectTimeout(Constants.MAX_URL_LENGTH);
            httpsURLConnection.connect();
            int responseCode = httpsURLConnection.getResponseCode();
            if (responseCode != 200 && responseCode != 304) {
                if (responseCode == 408) {
                    zzoaVar = zzoa.TIME_OUT_FETCHING_MODEL_METADATA;
                } else {
                    zzoaVar = zzoa.MODEL_INFO_DOWNLOAD_UNSUCCESSFUL_HTTP_STATUS;
                }
                zzyVar.m38358a(zzoaVar, httpsURLConnection.getResponseCode());
                InputStream errorStream = httpsURLConnection.getErrorStream();
                if (errorStream == null) {
                    str4 = "";
                } else {
                    str4 = new String(IOUtils.readInputStreamFully(errorStream));
                }
                throw new FirebaseMLException(String.format(Locale.getDefault(), "Failed to connect to Firebase ML console server with HTTP status code: %d and error message: %s", Integer.valueOf(httpsURLConnection.getResponseCode()), str4), 13);
            }
            return httpsURLConnection;
        } catch (SocketTimeoutException e) {
            zzyVar.m38356c(zzoa.TIME_OUT_FETCHING_MODEL_METADATA);
            throw new FirebaseMLException("Failed to get model URL due to time out", 13, e);
        } catch (IOException e2) {
            zzoa zzoaVar2 = zzoa.MODEL_INFO_DOWNLOAD_CONNECTION_FAILED;
            if (e2 instanceof UnknownHostException) {
                zzoaVar2 = zzoa.NO_NETWORK_CONNECTION;
                str2 = "Failed to retrieve model info due to no internet connection.";
            } else {
                str2 = "Failed to get model URL";
            }
            zzyVar.m38356c(zzoaVar2);
            throw new FirebaseMLException(str2, 13, e2);
        }
    }
}
