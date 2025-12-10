package com.google.firebase.installations.local;

import android.content.SharedPreferences;
import android.util.Base64;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.stats.CodePackage;
import com.google.firebase.FirebaseApp;
import com.google.firebase.messaging.FirebaseMessaging;
import java.security.KeyFactory;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.X509EncodedKeySpec;
import org.json.JSONException;
import org.json.JSONObject;
import org.slf4j.Marker;

/* loaded from: classes4.dex */
public class IidStore {

    /* renamed from: c */
    public static final String[] f55538c = {Marker.ANY_MARKER, FirebaseMessaging.INSTANCE_ID_SCOPE, CodePackage.GCM, ""};

    /* renamed from: a */
    public final SharedPreferences f55539a;

    /* renamed from: b */
    public final String f55540b;

    public IidStore(@NonNull FirebaseApp firebaseApp) {
        this.f55539a = firebaseApp.getApplicationContext().getSharedPreferences("com.google.android.gms.appid", 0);
        this.f55540b = m38607b(firebaseApp);
    }

    /* renamed from: b */
    public static String m38607b(FirebaseApp firebaseApp) {
        String gcmSenderId = firebaseApp.getOptions().getGcmSenderId();
        if (gcmSenderId != null) {
            return gcmSenderId;
        }
        String applicationId = firebaseApp.getOptions().getApplicationId();
        if (!applicationId.startsWith("1:") && !applicationId.startsWith("2:")) {
            return applicationId;
        }
        String[] split = applicationId.split(":");
        if (split.length != 4) {
            return null;
        }
        String str = split[1];
        if (str.isEmpty()) {
            return null;
        }
        return str;
    }

    /* renamed from: c */
    public static String m38606c(PublicKey publicKey) {
        try {
            byte[] digest = MessageDigest.getInstance("SHA1").digest(publicKey.getEncoded());
            digest[0] = (byte) (((digest[0] & 15) + 112) & 255);
            return Base64.encodeToString(digest, 0, 8, 11);
        } catch (NoSuchAlgorithmException unused) {
            Log.w("ContentValues", "Unexpected error, device missing required algorithms");
            return null;
        }
    }

    /* renamed from: a */
    public final String m38608a(String str, String str2) {
        return "|T|" + str + "|" + str2;
    }

    /* renamed from: d */
    public final String m38605d(String str) {
        try {
            return new JSONObject(str).getString("token");
        } catch (JSONException unused) {
            return null;
        }
    }

    /* renamed from: e */
    public final PublicKey m38604e(String str) {
        try {
            return KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(Base64.decode(str, 8)));
        } catch (IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException e) {
            Log.w("ContentValues", "Invalid key stored " + e);
            return null;
        }
    }

    /* renamed from: f */
    public final String m38603f() {
        String string;
        synchronized (this.f55539a) {
            string = this.f55539a.getString("|S|id", null);
        }
        return string;
    }

    /* renamed from: g */
    public final String m38602g() {
        synchronized (this.f55539a) {
            try {
                String string = this.f55539a.getString("|S||P|", null);
                if (string == null) {
                    return null;
                }
                PublicKey m38604e = m38604e(string);
                if (m38604e == null) {
                    return null;
                }
                return m38606c(m38604e);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Nullable
    public String readIid() {
        synchronized (this.f55539a) {
            try {
                String m38603f = m38603f();
                if (m38603f != null) {
                    return m38603f;
                }
                return m38602g();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Nullable
    public String readToken() {
        synchronized (this.f55539a) {
            try {
                for (String str : f55538c) {
                    String string = this.f55539a.getString(m38608a(this.f55540b, str), null);
                    if (string != null && !string.isEmpty()) {
                        if (string.startsWith("{")) {
                            string = m38605d(string);
                        }
                        return string;
                    }
                }
                return null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @VisibleForTesting
    public IidStore(@NonNull SharedPreferences sharedPreferences, @Nullable String str) {
        this.f55539a = sharedPreferences;
        this.f55540b = str;
    }
}