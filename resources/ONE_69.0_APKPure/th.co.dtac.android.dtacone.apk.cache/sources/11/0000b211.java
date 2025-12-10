package com.google.firebase.perf.util;

import android.content.Context;
import android.content.res.Resources;
import androidx.annotation.NonNull;
import com.google.firebase.perf.logging.AndroidLogger;
import java.net.URI;

/* loaded from: classes4.dex */
public class URLAllowlist {

    /* renamed from: a */
    public static String[] f56298a;

    public static boolean isURLAllowlisted(@NonNull URI uri, @NonNull Context context) {
        Resources resources = context.getResources();
        int identifier = resources.getIdentifier("firebase_performance_whitelisted_domains", "array", context.getPackageName());
        if (identifier == 0) {
            return true;
        }
        AndroidLogger.getInstance().debug("Detected domain allowlist, only allowlisted domains will be measured.");
        if (f56298a == null) {
            f56298a = resources.getStringArray(identifier);
        }
        String host = uri.getHost();
        if (host == null) {
            return true;
        }
        for (String str : f56298a) {
            if (host.contains(str)) {
                return true;
            }
        }
        return false;
    }
}