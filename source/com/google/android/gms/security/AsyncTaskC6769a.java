package com.google.android.gms.security;

import android.content.Context;
import android.os.AsyncTask;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import com.google.android.gms.security.ProviderInstaller;

/* renamed from: com.google.android.gms.security.a */
/* loaded from: classes3.dex */
public final class AsyncTaskC6769a extends AsyncTask {

    /* renamed from: a */
    public final /* synthetic */ Context f48541a;

    /* renamed from: b */
    public final /* synthetic */ ProviderInstaller.ProviderInstallListener f48542b;

    public AsyncTaskC6769a(Context context, ProviderInstaller.ProviderInstallListener providerInstallListener) {
        this.f48541a = context;
        this.f48542b = providerInstallListener;
    }

    @Override // android.os.AsyncTask
    public final /* bridge */ /* synthetic */ Object doInBackground(Object[] objArr) {
        Void[] voidArr = (Void[]) objArr;
        try {
            ProviderInstaller.installIfNeeded(this.f48541a);
            return 0;
        } catch (GooglePlayServicesNotAvailableException e) {
            return Integer.valueOf(e.errorCode);
        } catch (GooglePlayServicesRepairableException e2) {
            return Integer.valueOf(e2.getConnectionStatusCode());
        }
    }

    @Override // android.os.AsyncTask
    public final /* bridge */ /* synthetic */ void onPostExecute(Object obj) {
        GoogleApiAvailabilityLight googleApiAvailabilityLight;
        Integer num = (Integer) obj;
        if (num.intValue() == 0) {
            this.f48542b.onProviderInstalled();
            return;
        }
        Context context = this.f48541a;
        googleApiAvailabilityLight = ProviderInstaller.f48537a;
        this.f48542b.onProviderInstallFailed(num.intValue(), googleApiAvailabilityLight.getErrorResolutionIntent(context, num.intValue(), "pi"));
    }
}
