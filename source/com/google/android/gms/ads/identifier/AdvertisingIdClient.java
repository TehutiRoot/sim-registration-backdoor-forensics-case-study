package com.google.android.gms.ads.identifier;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.RemoteException;
import android.os.SystemClock;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.BlockingServiceConnection;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import com.google.android.gms.common.GooglePlayServicesUtilLight;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.annotation.KeepForSdkWithMembers;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.stats.ConnectionTracker;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.ads_identifier.zze;
import com.google.android.gms.internal.ads_identifier.zzf;
import com.google.firebase.messaging.Constants;
import java.io.IOException;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;
import javax.annotation.ParametersAreNonnullByDefault;

@KeepForSdk
@ParametersAreNonnullByDefault
/* loaded from: classes3.dex */
public class AdvertisingIdClient {

    /* renamed from: a */
    public BlockingServiceConnection f44356a;

    /* renamed from: b */
    public zzf f44357b;

    /* renamed from: c */
    public boolean f44358c;

    /* renamed from: d */
    public final Object f44359d;

    /* renamed from: e */
    public C17848Jd2 f44360e;

    /* renamed from: f */
    public final Context f44361f;

    /* renamed from: g */
    public final long f44362g;

    @KeepForSdkWithMembers
    /* loaded from: classes3.dex */
    public static final class Info {

        /* renamed from: a */
        public final String f44363a;

        /* renamed from: b */
        public final boolean f44364b;

        @Deprecated
        public Info(@Nullable String str, boolean z) {
            this.f44363a = str;
            this.f44364b = z;
        }

        @Nullable
        public String getId() {
            return this.f44363a;
        }

        public boolean isLimitAdTrackingEnabled() {
            return this.f44364b;
        }

        @NonNull
        public String toString() {
            String str = this.f44363a;
            boolean z = this.f44364b;
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 7);
            sb.append("{");
            sb.append(str);
            sb.append("}");
            sb.append(z);
            return sb.toString();
        }
    }

    @KeepForSdk
    public AdvertisingIdClient(@NonNull Context context) {
        this(context, 30000L, false, false);
    }

    @NonNull
    @KeepForSdk
    public static Info getAdvertisingIdInfo(@NonNull Context context) throws IOException, IllegalStateException, GooglePlayServicesNotAvailableException, GooglePlayServicesRepairableException {
        AdvertisingIdClient advertisingIdClient = new AdvertisingIdClient(context, -1L, true, false);
        try {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            advertisingIdClient.zzb(false);
            Info m48768b = advertisingIdClient.m48768b(-1);
            advertisingIdClient.m48769a(m48768b, true, 0.0f, SystemClock.elapsedRealtime() - elapsedRealtime, "", null);
            return m48768b;
        } finally {
        }
    }

    @KeepForSdk
    public static boolean getIsAdIdFakeForDebugLogging(@NonNull Context context) throws IOException, GooglePlayServicesNotAvailableException, GooglePlayServicesRepairableException {
        boolean zzd;
        AdvertisingIdClient advertisingIdClient = new AdvertisingIdClient(context, -1L, false, false);
        try {
            advertisingIdClient.zzb(false);
            Preconditions.checkNotMainThread("Calling this from your main thread can lead to deadlock");
            synchronized (advertisingIdClient) {
                if (!advertisingIdClient.f44358c) {
                    synchronized (advertisingIdClient.f44359d) {
                        C17848Jd2 c17848Jd2 = advertisingIdClient.f44360e;
                        if (c17848Jd2 == null || !c17848Jd2.f2851d) {
                            throw new IOException("AdvertisingIdClient is not connected.");
                        }
                    }
                    try {
                        advertisingIdClient.zzb(false);
                        if (!advertisingIdClient.f44358c) {
                            throw new IOException("AdvertisingIdClient cannot reconnect.");
                        }
                    } catch (Exception e) {
                        throw new IOException("AdvertisingIdClient cannot reconnect.", e);
                    }
                }
                Preconditions.checkNotNull(advertisingIdClient.f44356a);
                Preconditions.checkNotNull(advertisingIdClient.f44357b);
                try {
                    zzd = advertisingIdClient.f44357b.zzd();
                } catch (RemoteException unused) {
                    throw new IOException("Remote exception");
                }
            }
            advertisingIdClient.m48767c();
            return zzd;
        } finally {
            advertisingIdClient.zza();
        }
    }

    @ShowFirstParty
    @KeepForSdk
    public static void setShouldSkipGmsCoreVersionCheck(boolean z) {
    }

    /* renamed from: a */
    public final boolean m48769a(Info info, boolean z, float f, long j, String str, Throwable th2) {
        if (Math.random() <= 0.0d) {
            HashMap hashMap = new HashMap();
            String str2 = "1";
            hashMap.put("app_context", "1");
            if (info != null) {
                if (true != info.isLimitAdTrackingEnabled()) {
                    str2 = "0";
                }
                hashMap.put("limit_ad_tracking", str2);
                String id2 = info.getId();
                if (id2 != null) {
                    hashMap.put("ad_id_size", Integer.toString(id2.length()));
                }
            }
            if (th2 != null) {
                hashMap.put(Constants.IPC_BUNDLE_KEY_SEND_ERROR, th2.getClass().getName());
            }
            hashMap.put("tag", "AdvertisingIdClient");
            hashMap.put("time_spent", Long.toString(j));
            new C6315a(this, hashMap).start();
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public final Info m48768b(int i) {
        Info info;
        Preconditions.checkNotMainThread("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            try {
                if (!this.f44358c) {
                    synchronized (this.f44359d) {
                        C17848Jd2 c17848Jd2 = this.f44360e;
                        if (c17848Jd2 == null || !c17848Jd2.f2851d) {
                            throw new IOException("AdvertisingIdClient is not connected.");
                        }
                    }
                    try {
                        zzb(false);
                        if (!this.f44358c) {
                            throw new IOException("AdvertisingIdClient cannot reconnect.");
                        }
                    } catch (Exception e) {
                        throw new IOException("AdvertisingIdClient cannot reconnect.", e);
                    }
                }
                Preconditions.checkNotNull(this.f44356a);
                Preconditions.checkNotNull(this.f44357b);
                try {
                    info = new Info(this.f44357b.zzc(), this.f44357b.zze(true));
                } catch (RemoteException unused) {
                    throw new IOException("Remote exception");
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        m48767c();
        return info;
    }

    /* renamed from: c */
    public final void m48767c() {
        synchronized (this.f44359d) {
            C17848Jd2 c17848Jd2 = this.f44360e;
            if (c17848Jd2 != null) {
                c17848Jd2.f2850c.countDown();
                try {
                    this.f44360e.join();
                } catch (InterruptedException unused) {
                }
            }
            long j = this.f44362g;
            if (j > 0) {
                this.f44360e = new C17848Jd2(this, j);
            }
        }
    }

    public final void finalize() throws Throwable {
        zza();
        super.finalize();
    }

    @NonNull
    @KeepForSdk
    public Info getInfo() throws IOException {
        return m48768b(-1);
    }

    @KeepForSdk
    public void start() throws IOException, IllegalStateException, GooglePlayServicesNotAvailableException, GooglePlayServicesRepairableException {
        zzb(true);
    }

    public final void zza() {
        Preconditions.checkNotMainThread("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            try {
                if (this.f44361f != null && this.f44356a != null) {
                    try {
                        if (this.f44358c) {
                            ConnectionTracker.getInstance().unbindService(this.f44361f, this.f44356a);
                        }
                    } catch (Throwable unused) {
                    }
                    this.f44358c = false;
                    this.f44357b = null;
                    this.f44356a = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @VisibleForTesting
    public final void zzb(boolean z) throws IOException, IllegalStateException, GooglePlayServicesNotAvailableException, GooglePlayServicesRepairableException {
        Preconditions.checkNotMainThread("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            try {
                if (this.f44358c) {
                    zza();
                }
                Context context = this.f44361f;
                try {
                    context.getPackageManager().getPackageInfo("com.android.vending", 0);
                    int isGooglePlayServicesAvailable = GoogleApiAvailabilityLight.getInstance().isGooglePlayServicesAvailable(context, GooglePlayServicesUtilLight.GOOGLE_PLAY_SERVICES_VERSION_CODE);
                    if (isGooglePlayServicesAvailable != 0 && isGooglePlayServicesAvailable != 2) {
                        throw new IOException("Google Play services not available");
                    }
                    BlockingServiceConnection blockingServiceConnection = new BlockingServiceConnection();
                    Intent intent = new Intent("com.google.android.gms.ads.identifier.service.START");
                    intent.setPackage("com.google.android.gms");
                    if (ConnectionTracker.getInstance().bindService(context, intent, blockingServiceConnection, 1)) {
                        this.f44356a = blockingServiceConnection;
                        try {
                            this.f44357b = zze.zza(blockingServiceConnection.getServiceWithTimeout(10000L, TimeUnit.MILLISECONDS));
                            this.f44358c = true;
                            if (z) {
                                m48767c();
                            }
                        } catch (InterruptedException unused) {
                            throw new IOException("Interrupted exception");
                        } catch (Throwable th2) {
                            throw new IOException(th2);
                        }
                    } else {
                        throw new IOException("Connection failure");
                    }
                } catch (PackageManager.NameNotFoundException unused2) {
                    throw new GooglePlayServicesNotAvailableException(9);
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    @VisibleForTesting
    public AdvertisingIdClient(@NonNull Context context, long j, boolean z, boolean z2) {
        Context applicationContext;
        this.f44359d = new Object();
        Preconditions.checkNotNull(context);
        if (z && (applicationContext = context.getApplicationContext()) != null) {
            context = applicationContext;
        }
        this.f44361f = context;
        this.f44358c = false;
        this.f44362g = j;
    }
}
