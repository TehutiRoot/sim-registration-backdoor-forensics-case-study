package com.google.android.gms.security;

import android.content.Context;
import android.content.Intent;
import android.os.SystemClock;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import com.google.android.gms.common.GooglePlayServicesUtilLight;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamite.DynamiteModule;
import java.lang.reflect.Method;

/* loaded from: classes3.dex */
public class ProviderInstaller {
    @NonNull
    public static final String PROVIDER_NAME = "GmsCore_OpenSSL";

    /* renamed from: a */
    public static final GoogleApiAvailabilityLight f48549a = GoogleApiAvailabilityLight.getInstance();

    /* renamed from: b */
    public static final Object f48550b = new Object();

    /* renamed from: c */
    public static Method f48551c = null;

    /* renamed from: d */
    public static Method f48552d = null;

    /* loaded from: classes3.dex */
    public interface ProviderInstallListener {
        void onProviderInstallFailed(int i, @Nullable Intent intent);

        void onProviderInstalled();
    }

    /* renamed from: b */
    public static Method m46042b(Context context, String str, String str2, Class[] clsArr) {
        return context.getClassLoader().loadClass(str).getMethod(str2, clsArr);
    }

    /* renamed from: c */
    public static void m46041c(Context context, Context context2, String str) {
        String message;
        try {
            if (f48551c == null) {
                f48551c = m46042b(context, str, "insertProvider", new Class[]{Context.class});
            }
            f48551c.invoke(null, context);
        } catch (Exception e) {
            Throwable cause = e.getCause();
            if (Log.isLoggable("ProviderInstaller", 6)) {
                if (cause == null) {
                    message = e.getMessage();
                } else {
                    message = cause.getMessage();
                }
                "Failed to install provider: ".concat(String.valueOf(message));
            }
            throw new GooglePlayServicesNotAvailableException(8);
        }
    }

    public static void installIfNeeded(@NonNull Context context) throws GooglePlayServicesRepairableException, GooglePlayServicesNotAvailableException {
        Context context2;
        Preconditions.checkNotNull(context, "Context must not be null");
        f48549a.verifyGooglePlayServicesIsAvailable(context, 11925000);
        synchronized (f48550b) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            try {
                context2 = DynamiteModule.load(context, DynamiteModule.PREFER_HIGHEST_OR_LOCAL_VERSION_NO_FORCE_STAGING, "com.google.android.gms.providerinstaller.dynamite").getModuleContext();
            } catch (DynamiteModule.LoadingException e) {
                Log.w("ProviderInstaller", "Failed to load providerinstaller module: ".concat(String.valueOf(e.getMessage())));
                context2 = null;
            }
            if (context2 != null) {
                m46041c(context2, context, "com.google.android.gms.providerinstaller.ProviderInstallerImpl");
                return;
            }
            long elapsedRealtime2 = SystemClock.elapsedRealtime();
            Context remoteContext = GooglePlayServicesUtilLight.getRemoteContext(context);
            if (remoteContext != null) {
                try {
                    if (f48552d == null) {
                        Class cls = Long.TYPE;
                        f48552d = m46042b(remoteContext, "com.google.android.gms.common.security.ProviderInstallerImpl", "reportRequestStats", new Class[]{Context.class, cls, cls});
                    }
                    f48552d.invoke(null, context, Long.valueOf(elapsedRealtime), Long.valueOf(elapsedRealtime2));
                } catch (Exception e2) {
                    Log.w("ProviderInstaller", "Failed to report request stats: ".concat(String.valueOf(e2.getMessage())));
                }
            }
            if (remoteContext != null) {
                m46041c(remoteContext, context, "com.google.android.gms.common.security.ProviderInstallerImpl");
                return;
            }
            throw new GooglePlayServicesNotAvailableException(8);
        }
    }

    public static void installIfNeededAsync(@NonNull Context context, @NonNull ProviderInstallListener providerInstallListener) {
        Preconditions.checkNotNull(context, "Context must not be null");
        Preconditions.checkNotNull(providerInstallListener, "Listener must not be null");
        Preconditions.checkMainThread("Must be called on the UI thread");
        new AsyncTaskC6758a(context, providerInstallListener).execute(new Void[0]);
    }
}