package com.google.firebase.analytics.connector;

import android.content.Context;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresPermission;
import androidx.annotation.Size;
import androidx.annotation.WorkerThread;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzee;
import com.google.android.gms.measurement.AppMeasurement;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.firebase.DataCollectionDefaultChange;
import com.google.firebase.FirebaseApp;
import com.google.firebase.analytics.connector.AnalyticsConnector;
import com.google.firebase.analytics.connector.internal.zzc;
import com.google.firebase.analytics.connector.internal.zze;
import com.google.firebase.analytics.connector.internal.zzg;
import com.google.firebase.events.Event;
import com.google.firebase.events.Subscriber;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes4.dex */
public class AnalyticsConnectorImpl implements AnalyticsConnector {

    /* renamed from: c */
    public static volatile AnalyticsConnector f54545c;

    /* renamed from: a */
    public final AppMeasurementSdk f54546a;

    /* renamed from: b */
    public final Map f54547b;

    /* renamed from: com.google.firebase.analytics.connector.AnalyticsConnectorImpl$a */
    /* loaded from: classes4.dex */
    public class C8337a implements AnalyticsConnector.AnalyticsConnectorHandle {

        /* renamed from: a */
        public final /* synthetic */ String f54548a;

        public C8337a(String str) {
            this.f54548a = str;
        }

        @Override // com.google.firebase.analytics.connector.AnalyticsConnector.AnalyticsConnectorHandle
        public void registerEventNames(Set set) {
            if (AnalyticsConnectorImpl.this.m39280c(this.f54548a) && this.f54548a.equals("fiam") && set != null && !set.isEmpty()) {
                ((com.google.firebase.analytics.connector.internal.zza) AnalyticsConnectorImpl.this.f54547b.get(this.f54548a)).zzb(set);
            }
        }

        @Override // com.google.firebase.analytics.connector.AnalyticsConnector.AnalyticsConnectorHandle
        public final void unregister() {
            if (!AnalyticsConnectorImpl.this.m39280c(this.f54548a)) {
                return;
            }
            AnalyticsConnector.AnalyticsConnectorListener zza = ((com.google.firebase.analytics.connector.internal.zza) AnalyticsConnectorImpl.this.f54547b.get(this.f54548a)).zza();
            if (zza != null) {
                zza.onMessageTriggered(0, null);
            }
            AnalyticsConnectorImpl.this.f54547b.remove(this.f54548a);
        }

        @Override // com.google.firebase.analytics.connector.AnalyticsConnector.AnalyticsConnectorHandle
        public void unregisterEventNames() {
            if (AnalyticsConnectorImpl.this.m39280c(this.f54548a) && this.f54548a.equals("fiam")) {
                ((com.google.firebase.analytics.connector.internal.zza) AnalyticsConnectorImpl.this.f54547b.get(this.f54548a)).zzc();
            }
        }
    }

    public AnalyticsConnectorImpl(AppMeasurementSdk appMeasurementSdk) {
        Preconditions.checkNotNull(appMeasurementSdk);
        this.f54546a = appMeasurementSdk;
        this.f54547b = new ConcurrentHashMap();
    }

    /* renamed from: a */
    public static /* synthetic */ void m39282a(Event event) {
        boolean z = ((DataCollectionDefaultChange) event.getPayload()).enabled;
        synchronized (AnalyticsConnectorImpl.class) {
            ((AnalyticsConnectorImpl) Preconditions.checkNotNull(f54545c)).f54546a.zza(z);
        }
    }

    @NonNull
    @KeepForSdk
    public static AnalyticsConnector getInstance() {
        return getInstance(FirebaseApp.getInstance());
    }

    /* renamed from: c */
    public final boolean m39280c(String str) {
        if (!str.isEmpty() && this.f54547b.containsKey(str) && this.f54547b.get(str) != null) {
            return true;
        }
        return false;
    }

    @Override // com.google.firebase.analytics.connector.AnalyticsConnector
    @KeepForSdk
    public void clearConditionalUserProperty(@NonNull @Size(max = 24, min = 1) String str, @NonNull String str2, @NonNull Bundle bundle) {
        if (str2 != null && !zzc.zzj(str2, bundle)) {
            return;
        }
        this.f54546a.clearConditionalUserProperty(str, str2, bundle);
    }

    @Override // com.google.firebase.analytics.connector.AnalyticsConnector
    @NonNull
    @KeepForSdk
    @WorkerThread
    public List<AnalyticsConnector.ConditionalUserProperty> getConditionalUserProperties(@NonNull String str, @NonNull @Size(max = 23, min = 1) String str2) {
        ArrayList arrayList = new ArrayList();
        for (Bundle bundle : this.f54546a.getConditionalUserProperties(str, str2)) {
            arrayList.add(zzc.zzb(bundle));
        }
        return arrayList;
    }

    @Override // com.google.firebase.analytics.connector.AnalyticsConnector
    @KeepForSdk
    @WorkerThread
    public int getMaxUserProperties(@NonNull @Size(min = 1) String str) {
        return this.f54546a.getMaxUserProperties(str);
    }

    @Override // com.google.firebase.analytics.connector.AnalyticsConnector
    @NonNull
    @KeepForSdk
    @WorkerThread
    public Map<String, Object> getUserProperties(boolean z) {
        return this.f54546a.getUserProperties(null, null, z);
    }

    @Override // com.google.firebase.analytics.connector.AnalyticsConnector
    @KeepForSdk
    public void logEvent(@NonNull String str, @NonNull String str2, @NonNull Bundle bundle) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        if (!zzc.zzl(str) || !zzc.zzj(str2, bundle) || !zzc.zzh(str, str2, bundle)) {
            return;
        }
        zzc.zze(str, str2, bundle);
        this.f54546a.logEvent(str, str2, bundle);
    }

    @Override // com.google.firebase.analytics.connector.AnalyticsConnector
    @NonNull
    @KeepForSdk
    @WorkerThread
    public AnalyticsConnector.AnalyticsConnectorHandle registerAnalyticsConnectorListener(@NonNull String str, @NonNull AnalyticsConnector.AnalyticsConnectorListener analyticsConnectorListener) {
        com.google.firebase.analytics.connector.internal.zza zzgVar;
        Preconditions.checkNotNull(analyticsConnectorListener);
        if (!zzc.zzl(str) || m39280c(str)) {
            return null;
        }
        AppMeasurementSdk appMeasurementSdk = this.f54546a;
        if ("fiam".equals(str)) {
            zzgVar = new zze(appMeasurementSdk, analyticsConnectorListener);
        } else if (!AppMeasurement.CRASH_ORIGIN.equals(str) && !"clx".equals(str)) {
            zzgVar = null;
        } else {
            zzgVar = new zzg(appMeasurementSdk, analyticsConnectorListener);
        }
        if (zzgVar == null) {
            return null;
        }
        this.f54547b.put(str, zzgVar);
        return new C8337a(str);
    }

    @Override // com.google.firebase.analytics.connector.AnalyticsConnector
    @KeepForSdk
    public void setConditionalUserProperty(@NonNull AnalyticsConnector.ConditionalUserProperty conditionalUserProperty) {
        if (!zzc.zzi(conditionalUserProperty)) {
            return;
        }
        this.f54546a.setConditionalUserProperty(zzc.zza(conditionalUserProperty));
    }

    @Override // com.google.firebase.analytics.connector.AnalyticsConnector
    @KeepForSdk
    public void setUserProperty(@NonNull String str, @NonNull String str2, @NonNull Object obj) {
        if (!zzc.zzl(str) || !zzc.zzm(str, str2)) {
            return;
        }
        this.f54546a.setUserProperty(str, str2, obj);
    }

    @NonNull
    @KeepForSdk
    public static AnalyticsConnector getInstance(@NonNull FirebaseApp firebaseApp) {
        return (AnalyticsConnector) firebaseApp.get(AnalyticsConnector.class);
    }

    @NonNull
    @RequiresPermission(allOf = {"android.permission.INTERNET", "android.permission.ACCESS_NETWORK_STATE", "android.permission.WAKE_LOCK"})
    @KeepForSdk
    public static AnalyticsConnector getInstance(@NonNull FirebaseApp firebaseApp, @NonNull Context context, @NonNull Subscriber subscriber) {
        Preconditions.checkNotNull(firebaseApp);
        Preconditions.checkNotNull(context);
        Preconditions.checkNotNull(subscriber);
        Preconditions.checkNotNull(context.getApplicationContext());
        if (f54545c == null) {
            synchronized (AnalyticsConnectorImpl.class) {
                try {
                    if (f54545c == null) {
                        Bundle bundle = new Bundle(1);
                        if (firebaseApp.isDefaultApp()) {
                            subscriber.subscribe(DataCollectionDefaultChange.class, zza.zza, zzb.zza);
                            bundle.putBoolean("dataCollectionDefaultEnabled", firebaseApp.isDataCollectionDefaultEnabled());
                        }
                        f54545c = new AnalyticsConnectorImpl(zzee.zzg(context, null, null, null, bundle).zzd());
                    }
                } finally {
                }
            }
        }
        return f54545c;
    }
}
