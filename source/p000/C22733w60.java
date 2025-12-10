package p000;

import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import ch.qos.logback.core.joran.action.Action;
import com.google.android.gms.cloudmessaging.Rpc;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.FirebaseApp;
import com.google.firebase.heartbeatinfo.HeartBeatInfo;
import com.google.firebase.iid.GmsRpc;
import com.google.firebase.inject.Provider;
import com.google.firebase.installations.FirebaseInstallationsApi;
import com.google.firebase.installations.InstallationTokenResult;
import com.google.firebase.messaging.BuildConfig;
import com.google.firebase.messaging.Constants;
import com.google.firebase.platforminfo.UserAgentPublisher;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.concurrent.ExecutionException;
import org.slf4j.Marker;

/* renamed from: w60 */
/* loaded from: classes4.dex */
public class C22733w60 {

    /* renamed from: a */
    public final FirebaseApp f107898a;

    /* renamed from: b */
    public final C22003rs0 f107899b;

    /* renamed from: c */
    public final Rpc f107900c;

    /* renamed from: d */
    public final Provider f107901d;

    /* renamed from: e */
    public final Provider f107902e;

    /* renamed from: f */
    public final FirebaseInstallationsApi f107903f;

    public C22733w60(FirebaseApp firebaseApp, C22003rs0 c22003rs0, Provider provider, Provider provider2, FirebaseInstallationsApi firebaseInstallationsApi) {
        this(firebaseApp, c22003rs0, new Rpc(firebaseApp.getApplicationContext()), provider, provider2, firebaseInstallationsApi);
    }

    /* renamed from: a */
    public static /* synthetic */ String m920a(C22733w60 c22733w60, Task task) {
        return c22733w60.m911j(task);
    }

    /* renamed from: b */
    public static String m919b(byte[] bArr) {
        return Base64.encodeToString(bArr, 11);
    }

    /* renamed from: i */
    public static boolean m912i(String str) {
        if (!GmsRpc.ERROR_SERVICE_NOT_AVAILABLE.equals(str) && !GmsRpc.ERROR_INTERNAL_SERVER_ERROR.equals(str) && !"InternalServerError".equals(str)) {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    public Task m918c() {
        Bundle bundle = new Bundle();
        bundle.putString("delete", "1");
        return m917d(m908m(C22003rs0.m23250c(this.f107898a), Marker.ANY_MARKER, bundle));
    }

    /* renamed from: d */
    public final Task m917d(Task task) {
        return task.continueWith(new ExecutorC21992ro1(), new Continuation() { // from class: u60
            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task2) {
                return C22733w60.m920a(C22733w60.this, task2);
            }
        });
    }

    /* renamed from: e */
    public final String m916e() {
        try {
            return m919b(MessageDigest.getInstance("SHA-1").digest(this.f107898a.getName().getBytes()));
        } catch (NoSuchAlgorithmException unused) {
            return "[HASH-ERROR]";
        }
    }

    /* renamed from: f */
    public Task m915f() {
        return this.f107900c.getProxiedNotificationData();
    }

    /* renamed from: g */
    public Task m914g() {
        return m917d(m908m(C22003rs0.m23250c(this.f107898a), Marker.ANY_MARKER, new Bundle()));
    }

    /* renamed from: h */
    public final String m913h(Bundle bundle) {
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
                Log.w(Constants.TAG, "Unexpected response: " + bundle, new Throwable());
                throw new IOException(GmsRpc.ERROR_SERVICE_NOT_AVAILABLE);
            }
            throw new IOException("INSTANCE_ID_RESET");
        }
        throw new IOException(GmsRpc.ERROR_SERVICE_NOT_AVAILABLE);
    }

    /* renamed from: j */
    public final /* synthetic */ String m911j(Task task) {
        return m913h((Bundle) task.getResult(IOException.class));
    }

    /* renamed from: k */
    public final void m910k(String str, String str2, Bundle bundle) {
        HeartBeatInfo.HeartBeat heartBeatCode;
        bundle.putString(Action.SCOPE_ATTRIBUTE, str2);
        bundle.putString("sender", str);
        bundle.putString("subtype", str);
        bundle.putString("gmp_app_id", this.f107898a.getOptions().getApplicationId());
        bundle.putString("gmsv", Integer.toString(this.f107899b.m23249d()));
        bundle.putString("osv", Integer.toString(Build.VERSION.SDK_INT));
        bundle.putString("app_ver", this.f107899b.m23252a());
        bundle.putString("app_ver_name", this.f107899b.m23251b());
        bundle.putString("firebase-app-name-hash", m916e());
        try {
            String token = ((InstallationTokenResult) Tasks.await(this.f107903f.getToken(false))).getToken();
            if (!TextUtils.isEmpty(token)) {
                bundle.putString("Goog-Firebase-Installations-Auth", token);
            } else {
                Log.w(Constants.TAG, "FIS auth token is empty");
            }
        } catch (InterruptedException | ExecutionException unused) {
        }
        bundle.putString("appid", (String) Tasks.await(this.f107903f.getId()));
        bundle.putString("cliv", "fcm-" + BuildConfig.VERSION_NAME);
        HeartBeatInfo heartBeatInfo = (HeartBeatInfo) this.f107902e.get();
        UserAgentPublisher userAgentPublisher = (UserAgentPublisher) this.f107901d.get();
        if (heartBeatInfo != null && userAgentPublisher != null && (heartBeatCode = heartBeatInfo.getHeartBeatCode("fire-iid")) != HeartBeatInfo.HeartBeat.NONE) {
            bundle.putString("Firebase-Client-Log-Type", Integer.toString(heartBeatCode.getCode()));
            bundle.putString("Firebase-Client", userAgentPublisher.getUserAgent());
        }
    }

    /* renamed from: l */
    public Task m909l(boolean z) {
        return this.f107900c.setRetainProxiedNotifications(z);
    }

    /* renamed from: m */
    public final Task m908m(String str, String str2, Bundle bundle) {
        try {
            m910k(str, str2, bundle);
            return this.f107900c.send(bundle);
        } catch (InterruptedException | ExecutionException e) {
            return Tasks.forException(e);
        }
    }

    /* renamed from: n */
    public Task m907n(String str, String str2) {
        Bundle bundle = new Bundle();
        bundle.putString("gcm.topic", "/topics/" + str2);
        return m917d(m908m(str, "/topics/" + str2, bundle));
    }

    /* renamed from: o */
    public Task m906o(String str, String str2) {
        Bundle bundle = new Bundle();
        bundle.putString("gcm.topic", "/topics/" + str2);
        bundle.putString("delete", "1");
        return m917d(m908m(str, "/topics/" + str2, bundle));
    }

    public C22733w60(FirebaseApp firebaseApp, C22003rs0 c22003rs0, Rpc rpc, Provider provider, Provider provider2, FirebaseInstallationsApi firebaseInstallationsApi) {
        this.f107898a = firebaseApp;
        this.f107899b = c22003rs0;
        this.f107900c = rpc;
        this.f107901d = provider;
        this.f107902e = provider2;
        this.f107903f = firebaseInstallationsApi;
    }
}
