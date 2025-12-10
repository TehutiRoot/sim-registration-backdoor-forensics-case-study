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

/* renamed from: C60 */
/* loaded from: classes4.dex */
public class C60 {

    /* renamed from: a */
    public final FirebaseApp f645a;

    /* renamed from: b */
    public final C23105xs0 f646b;

    /* renamed from: c */
    public final Rpc f647c;

    /* renamed from: d */
    public final Provider f648d;

    /* renamed from: e */
    public final Provider f649e;

    /* renamed from: f */
    public final FirebaseInstallationsApi f650f;

    public C60(FirebaseApp firebaseApp, C23105xs0 c23105xs0, Provider provider, Provider provider2, FirebaseInstallationsApi firebaseInstallationsApi) {
        this(firebaseApp, c23105xs0, new Rpc(firebaseApp.getApplicationContext()), provider, provider2, firebaseInstallationsApi);
    }

    /* renamed from: a */
    public static /* synthetic */ String m69012a(C60 c60, Task task) {
        return c60.m69003j(task);
    }

    /* renamed from: b */
    public static String m69011b(byte[] bArr) {
        return Base64.encodeToString(bArr, 11);
    }

    /* renamed from: i */
    public static boolean m69004i(String str) {
        if (!GmsRpc.ERROR_SERVICE_NOT_AVAILABLE.equals(str) && !GmsRpc.ERROR_INTERNAL_SERVER_ERROR.equals(str) && !"InternalServerError".equals(str)) {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    public Task m69010c() {
        Bundle bundle = new Bundle();
        bundle.putString("delete", "1");
        return m69009d(m69000m(C23105xs0.m474c(this.f645a), Marker.ANY_MARKER, bundle));
    }

    /* renamed from: d */
    public final Task m69009d(Task task) {
        return task.continueWith(new ExecutorC21540op1(), new Continuation() { // from class: A60
            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task2) {
                return C60.m69012a(C60.this, task2);
            }
        });
    }

    /* renamed from: e */
    public final String m69008e() {
        try {
            return m69011b(MessageDigest.getInstance("SHA-1").digest(this.f645a.getName().getBytes()));
        } catch (NoSuchAlgorithmException unused) {
            return "[HASH-ERROR]";
        }
    }

    /* renamed from: f */
    public Task m69007f() {
        return this.f647c.getProxiedNotificationData();
    }

    /* renamed from: g */
    public Task m69006g() {
        return m69009d(m69000m(C23105xs0.m474c(this.f645a), Marker.ANY_MARKER, new Bundle()));
    }

    /* renamed from: h */
    public final String m69005h(Bundle bundle) {
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
    public final /* synthetic */ String m69003j(Task task) {
        return m69005h((Bundle) task.getResult(IOException.class));
    }

    /* renamed from: k */
    public final void m69002k(String str, String str2, Bundle bundle) {
        HeartBeatInfo.HeartBeat heartBeatCode;
        bundle.putString(Action.SCOPE_ATTRIBUTE, str2);
        bundle.putString("sender", str);
        bundle.putString("subtype", str);
        bundle.putString("gmp_app_id", this.f645a.getOptions().getApplicationId());
        bundle.putString("gmsv", Integer.toString(this.f646b.m473d()));
        bundle.putString("osv", Integer.toString(Build.VERSION.SDK_INT));
        bundle.putString("app_ver", this.f646b.m476a());
        bundle.putString("app_ver_name", this.f646b.m475b());
        bundle.putString("firebase-app-name-hash", m69008e());
        try {
            String token = ((InstallationTokenResult) Tasks.await(this.f650f.getToken(false))).getToken();
            if (!TextUtils.isEmpty(token)) {
                bundle.putString("Goog-Firebase-Installations-Auth", token);
            } else {
                Log.w(Constants.TAG, "FIS auth token is empty");
            }
        } catch (InterruptedException | ExecutionException unused) {
        }
        bundle.putString("appid", (String) Tasks.await(this.f650f.getId()));
        bundle.putString("cliv", "fcm-" + BuildConfig.VERSION_NAME);
        HeartBeatInfo heartBeatInfo = (HeartBeatInfo) this.f649e.get();
        UserAgentPublisher userAgentPublisher = (UserAgentPublisher) this.f648d.get();
        if (heartBeatInfo != null && userAgentPublisher != null && (heartBeatCode = heartBeatInfo.getHeartBeatCode("fire-iid")) != HeartBeatInfo.HeartBeat.NONE) {
            bundle.putString("Firebase-Client-Log-Type", Integer.toString(heartBeatCode.getCode()));
            bundle.putString("Firebase-Client", userAgentPublisher.getUserAgent());
        }
    }

    /* renamed from: l */
    public Task m69001l(boolean z) {
        return this.f647c.setRetainProxiedNotifications(z);
    }

    /* renamed from: m */
    public final Task m69000m(String str, String str2, Bundle bundle) {
        try {
            m69002k(str, str2, bundle);
            return this.f647c.send(bundle);
        } catch (InterruptedException | ExecutionException e) {
            return Tasks.forException(e);
        }
    }

    /* renamed from: n */
    public Task m68999n(String str, String str2) {
        Bundle bundle = new Bundle();
        bundle.putString("gcm.topic", "/topics/" + str2);
        return m69009d(m69000m(str, "/topics/" + str2, bundle));
    }

    /* renamed from: o */
    public Task m68998o(String str, String str2) {
        Bundle bundle = new Bundle();
        bundle.putString("gcm.topic", "/topics/" + str2);
        bundle.putString("delete", "1");
        return m69009d(m69000m(str, "/topics/" + str2, bundle));
    }

    public C60(FirebaseApp firebaseApp, C23105xs0 c23105xs0, Rpc rpc, Provider provider, Provider provider2, FirebaseInstallationsApi firebaseInstallationsApi) {
        this.f645a = firebaseApp;
        this.f646b = c23105xs0;
        this.f647c = rpc;
        this.f648d = provider;
        this.f649e = provider2;
        this.f650f = firebaseInstallationsApi;
    }
}