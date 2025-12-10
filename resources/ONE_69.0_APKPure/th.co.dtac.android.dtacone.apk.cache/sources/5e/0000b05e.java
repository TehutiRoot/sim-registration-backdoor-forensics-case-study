package com.google.firebase.iid;

import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import ch.qos.logback.core.joran.action.Action;
import com.google.android.gms.cloudmessaging.Rpc;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.FirebaseApp;
import com.google.firebase.heartbeatinfo.HeartBeatInfo;
import com.google.firebase.iid.GmsRpc;
import com.google.firebase.inject.Provider;
import com.google.firebase.installations.FirebaseInstallationsApi;
import com.google.firebase.installations.InstallationTokenResult;
import com.google.firebase.messaging.Constants;
import com.google.firebase.platforminfo.UserAgentPublisher;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.concurrent.ExecutionException;
import org.slf4j.Marker;

@KeepForSdk
/* loaded from: classes4.dex */
public class GmsRpc {
    @KeepForSdk
    public static final String ERROR_INTERNAL_SERVER_ERROR = "INTERNAL_SERVER_ERROR";
    @KeepForSdk
    public static final String ERROR_SERVICE_NOT_AVAILABLE = "SERVICE_NOT_AVAILABLE";

    /* renamed from: a */
    public final FirebaseApp f55477a;

    /* renamed from: b */
    public final Metadata f55478b;

    /* renamed from: c */
    public final Rpc f55479c;

    /* renamed from: d */
    public final Provider f55480d;

    /* renamed from: e */
    public final Provider f55481e;

    /* renamed from: f */
    public final FirebaseInstallationsApi f55482f;

    public GmsRpc(FirebaseApp firebaseApp, Metadata metadata, Rpc rpc, Provider provider, Provider provider2, FirebaseInstallationsApi firebaseInstallationsApi) {
        this.f55477a = firebaseApp;
        this.f55478b = metadata;
        this.f55479c = rpc;
        this.f55480d = provider;
        this.f55481e = provider2;
        this.f55482f = firebaseInstallationsApi;
    }

    /* renamed from: a */
    public static String m38683a(byte[] bArr) {
        return Base64.encodeToString(bArr, 11);
    }

    /* renamed from: e */
    public static boolean m38679e(String str) {
        if (!ERROR_SERVICE_NOT_AVAILABLE.equals(str) && !ERROR_INTERNAL_SERVER_ERROR.equals(str) && !"InternalServerError".equals(str)) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public final Task m38682b(Task task) {
        return task.continueWith(AbstractC22094s10.m22911a(), new Continuation(this) { // from class: B60

            /* renamed from: a */
            public final GmsRpc f317a;

            {
                this.f317a = this;
            }

            @Override // com.google.android.gms.tasks.Continuation
            public Object then(Task task2) {
                return this.f317a.m38678f(task2);
            }
        });
    }

    /* renamed from: c */
    public final String m38681c() {
        try {
            return m38683a(MessageDigest.getInstance("SHA-1").digest(this.f55477a.getName().getBytes()));
        } catch (NoSuchAlgorithmException unused) {
            return "[HASH-ERROR]";
        }
    }

    /* renamed from: d */
    public final String m38680d(Bundle bundle) {
        if (bundle != null) {
            String string = bundle.getString("registration_id");
            if (string != null) {
                return string;
            }
            String string2 = bundle.getString("unregistered");
            if (string2 != null) {
                return string2;
            }
            String string3 = bundle.getString(Constants.IPC_BUNDLE_KEY_SEND_ERROR);
            if (!"RST".equals(string3)) {
                if (string3 != null) {
                    throw new IOException(string3);
                }
                String valueOf = String.valueOf(bundle);
                StringBuilder sb = new StringBuilder(valueOf.length() + 21);
                sb.append("Unexpected response: ");
                sb.append(valueOf);
                Log.w("FirebaseInstanceId", sb.toString(), new Throwable());
                throw new IOException(ERROR_SERVICE_NOT_AVAILABLE);
            }
            throw new IOException("INSTANCE_ID_RESET");
        }
        throw new IOException(ERROR_SERVICE_NOT_AVAILABLE);
    }

    public Task<?> deleteInstanceId(String str) {
        Bundle bundle = new Bundle();
        bundle.putString("iid-operation", "delete");
        bundle.putString("delete", "1");
        return m38682b(m38676h(str, Marker.ANY_MARKER, Marker.ANY_MARKER, bundle));
    }

    public Task<?> deleteToken(String str, String str2, String str3) {
        Bundle bundle = new Bundle();
        bundle.putString("delete", "1");
        return m38682b(m38676h(str, str2, str3, bundle));
    }

    /* renamed from: f */
    public final /* synthetic */ String m38678f(Task task) {
        return m38680d((Bundle) task.getResult(IOException.class));
    }

    /* renamed from: g */
    public final Bundle m38677g(String str, String str2, String str3, Bundle bundle) {
        HeartBeatInfo.HeartBeat heartBeatCode;
        bundle.putString(Action.SCOPE_ATTRIBUTE, str3);
        bundle.putString("sender", str2);
        bundle.putString("subtype", str2);
        bundle.putString("appid", str);
        bundle.putString("gmp_app_id", this.f55477a.getOptions().getApplicationId());
        bundle.putString("gmsv", Integer.toString(this.f55478b.getGmsVersionCode()));
        bundle.putString("osv", Integer.toString(Build.VERSION.SDK_INT));
        bundle.putString("app_ver", this.f55478b.getAppVersionCode());
        bundle.putString("app_ver_name", this.f55478b.getAppVersionName());
        bundle.putString("firebase-app-name-hash", m38681c());
        try {
            String token = ((InstallationTokenResult) Tasks.await(this.f55482f.getToken(false))).getToken();
            if (!TextUtils.isEmpty(token)) {
                bundle.putString("Goog-Firebase-Installations-Auth", token);
            } else {
                Log.w("FirebaseInstanceId", "FIS auth token is empty");
            }
        } catch (InterruptedException | ExecutionException unused) {
        }
        bundle.putString("cliv", "fiid-21.1.0");
        HeartBeatInfo heartBeatInfo = (HeartBeatInfo) this.f55481e.get();
        UserAgentPublisher userAgentPublisher = (UserAgentPublisher) this.f55480d.get();
        if (heartBeatInfo != null && userAgentPublisher != null && (heartBeatCode = heartBeatInfo.getHeartBeatCode("fire-iid")) != HeartBeatInfo.HeartBeat.NONE) {
            bundle.putString("Firebase-Client-Log-Type", Integer.toString(heartBeatCode.getCode()));
            bundle.putString("Firebase-Client", userAgentPublisher.getUserAgent());
        }
        return bundle;
    }

    public Task<String> getToken(String str, String str2, String str3) {
        return m38682b(m38676h(str, str2, str3, new Bundle()));
    }

    /* renamed from: h */
    public final Task m38676h(String str, String str2, String str3, Bundle bundle) {
        m38677g(str, str2, str3, bundle);
        return this.f55479c.send(bundle);
    }

    @KeepForSdk
    public Task<?> subscribeToTopic(String str, String str2, String str3) {
        String str4;
        String str5;
        Bundle bundle = new Bundle();
        String valueOf = String.valueOf(str3);
        if (valueOf.length() != 0) {
            str4 = "/topics/".concat(valueOf);
        } else {
            str4 = new String("/topics/");
        }
        bundle.putString("gcm.topic", str4);
        String valueOf2 = String.valueOf(str3);
        if (valueOf2.length() != 0) {
            str5 = "/topics/".concat(valueOf2);
        } else {
            str5 = new String("/topics/");
        }
        return m38682b(m38676h(str, str2, str5, bundle));
    }

    @KeepForSdk
    public Task<?> unsubscribeFromTopic(String str, String str2, String str3) {
        String str4;
        String str5;
        Bundle bundle = new Bundle();
        String valueOf = String.valueOf(str3);
        if (valueOf.length() != 0) {
            str4 = "/topics/".concat(valueOf);
        } else {
            str4 = new String("/topics/");
        }
        bundle.putString("gcm.topic", str4);
        bundle.putString("delete", "1");
        String valueOf2 = String.valueOf(str3);
        if (valueOf2.length() != 0) {
            str5 = "/topics/".concat(valueOf2);
        } else {
            str5 = new String("/topics/");
        }
        return m38682b(m38676h(str, str2, str5, bundle));
    }

    public GmsRpc(FirebaseApp firebaseApp, Metadata metadata, Provider<UserAgentPublisher> provider, Provider<HeartBeatInfo> provider2, FirebaseInstallationsApi firebaseInstallationsApi) {
        this(firebaseApp, metadata, new Rpc(firebaseApp.getApplicationContext()), provider, provider2, firebaseInstallationsApi);
    }
}