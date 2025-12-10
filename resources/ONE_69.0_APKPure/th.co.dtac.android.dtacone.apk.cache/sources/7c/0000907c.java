package com.google.android.gms.internal.firebase_ml;

import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.GmsLogger;
import com.google.android.gms.common.internal.Preconditions;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.concurrent.ConcurrentHashMap;
import org.apache.http.cookie.ClientCookie;

/* loaded from: classes3.dex */
public class zzqd {

    /* renamed from: b */
    public static final GmsLogger f45972b = new GmsLogger("LibraryVersion", "");

    /* renamed from: c */
    public static zzqd f45973c = new zzqd();

    /* renamed from: a */
    public final ConcurrentHashMap f45974a = new ConcurrentHashMap();

    public static zzqd zzoo() {
        return f45973c;
    }

    public final String getVersion(@NonNull String str) {
        String str2;
        String str3;
        Preconditions.checkNotEmpty(str, "Please provide a valid libraryName");
        if (this.f45974a.containsKey(str)) {
            return (String) this.f45974a.get(str);
        }
        Properties properties = new Properties();
        String str4 = null;
        try {
            InputStream resourceAsStream = zzqd.class.getResourceAsStream(String.format("/%s.properties", str));
            if (resourceAsStream != null) {
                properties.load(resourceAsStream);
                str4 = properties.getProperty(ClientCookie.VERSION_ATTR, null);
                GmsLogger gmsLogger = f45972b;
                StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 12 + String.valueOf(str4).length());
                sb.append(str);
                sb.append(" version is ");
                sb.append(str4);
                gmsLogger.m48399v("LibraryVersion", sb.toString());
            } else {
                GmsLogger gmsLogger2 = f45972b;
                String valueOf = String.valueOf(str);
                if (valueOf.length() != 0) {
                    str3 = "Failed to get app version for libraryName: ".concat(valueOf);
                } else {
                    str3 = new String("Failed to get app version for libraryName: ");
                }
                gmsLogger2.m48403e("LibraryVersion", str3);
            }
        } catch (IOException e) {
            GmsLogger gmsLogger3 = f45972b;
            String valueOf2 = String.valueOf(str);
            if (valueOf2.length() != 0) {
                str2 = "Failed to get app version for libraryName: ".concat(valueOf2);
            } else {
                str2 = new String("Failed to get app version for libraryName: ");
            }
            gmsLogger3.m48402e("LibraryVersion", str2, e);
        }
        if (str4 == null) {
            f45972b.m48405d("LibraryVersion", ".properties file is dropped during release process. Failure to read app version is expected during Google internal testing where locally-built libraries are used");
            str4 = "UNKNOWN";
        }
        this.f45974a.put(str, str4);
        return str4;
    }
}