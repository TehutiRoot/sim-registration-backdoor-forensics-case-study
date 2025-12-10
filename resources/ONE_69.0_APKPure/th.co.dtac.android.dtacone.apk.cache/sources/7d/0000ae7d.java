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
    public static volatile AnalyticsConnector f54557c;

    /* renamed from: a */
    public final AppMeasurementSdk f54558a;

    /* renamed from: b */
    public final Map f54559b;

    /* renamed from: com.google.firebase.analytics.connector.AnalyticsConnectorImpl$a */
    /* loaded from: classes4.dex */
    public class C8326a implements AnalyticsConnector.AnalyticsConnectorHandle {

        /* renamed from: a */
        public final /* synthetic */ String f54560a;

        public C8326a(String str) {
            this.f54560a = str;
        }

        @Override // com.google.firebase.analytics.connector.AnalyticsConnector.AnalyticsConnectorHandle
        public void registerEventNames(Set set) {
            if (AnalyticsConnectorImpl.this.m39272c(this.f54560a) && this.f54560a.equals("fiam") && set != null && !set.isEmpty()) {
                ((com.google.firebase.analytics.connector.internal.zza) AnalyticsConnectorImpl.this.f54559b.get(this.f54560a)).zzb(set);
            }
        }

        @Override // com.google.firebase.analytics.connector.AnalyticsConnector.AnalyticsConnectorHandle
        public final void unregister() {
            if (!AnalyticsConnectorImpl.this.m39272c(this.f54560a)) {
                return;
            }
            AnalyticsConnector.AnalyticsConnectorListener zza = ((com.google.firebase.analytics.connector.internal.zza) AnalyticsConnectorImpl.this.f54559b.get(this.f54560a)).zza();
            if (zza != null) {
                zza.onMessageTriggered(0, null);
            }
            AnalyticsConnectorImpl.this.f54559b.remove(this.f54560a);
        }

        @Override // com.google.firebase.analytics.connector.AnalyticsConnector.AnalyticsConnectorHandle
        public void unregisterEventNames() {
            if (AnalyticsConnectorImpl.this.m39272c(this.f54560a) && this.f54560a.equals("fiam")) {
                ((com.google.firebase.analytics.connector.internal.zza) AnalyticsConnectorImpl.this.f54559b.get(this.f54560a)).zzc();
            }
        }
    }

    public AnalyticsConnectorImpl(AppMeasurementSdk appMeasurementSdk) {
        Preconditions.checkNotNull(appMeasurementSdk);
        this.f54558a = appMeasurementSdk;
        this.f54559b = new ConcurrentHashMap();
    }

    /* renamed from: a */
    public static /* synthetic */ void m39274a(Event event) {
        boolean z = ((DataCollectionDefaultChange) event.getPayload()).enabled;
        synchronized (AnalyticsConnectorImpl.class) {
            ((AnalyticsConnectorImpl) Preconditions.checkNotNull(f54557c)).f54558a.zza(z);
        }
    }

    @NonNull
    @KeepForSdk
    public static AnalyticsConnector getInstance() {
        return getInstance(FirebaseApp.getInstance());
    }

    /* renamed from: c */
    public final boolean m39272c(String str) {
        if (!str.isEmpty() && this.f54559b.containsKey(str) && this.f54559b.get(str) != null) {
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
        this.f54558a.clearConditionalUserProperty(str, str2, bundle);
    }

    @Override // com.google.firebase.analytics.connector.AnalyticsConnector
    @NonNull
    @KeepForSdk
    @WorkerThread
    public List<AnalyticsConnector.ConditionalUserProperty> getConditionalUserProperties(@NonNull String str, @NonNull @Size(max = 23, min = 1) String str2) {
        ArrayList arrayList = new ArrayList();
        for (Bundle bundle : this.f54558a.getConditionalUserProperties(str, str2)) {
            arrayList.add(zzc.zzb(bundle));
        }
        return arrayList;
    }

    @Override // com.google.firebase.analytics.connector.AnalyticsConnector
    @KeepForSdk
    @WorkerThread
    public int getMaxUserProperties(@NonNull @Size(min = 1) String str) {
        return this.f54558a.getMaxUserProperties(str);
    }

    @Override // com.google.firebase.analytics.connector.AnalyticsConnector
    @NonNull
    @KeepForSdk
    @WorkerThread
    public Map<String, Object> getUserProperties(boolean z) {
        return this.f54558a.getUserProperties(null, null, z);
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
        this.f54558a.logEvent(str, str2, bundle);
    }

    @Override // com.google.firebase.analytics.connector.AnalyticsConnector
    @NonNull
    @KeepForSdk
    @WorkerThread
    public AnalyticsConnector.AnalyticsConnectorHandle registerAnalyticsConnectorListener(@NonNull String str, @NonNull AnalyticsConnector.AnalyticsConnectorListener analyticsConnectorListener) {
        com.google.firebase.analytics.connector.internal.zza zzgVar;
        Preconditions.checkNotNull(analyticsConnectorListener);
        if (!zzc.zzl(str) || m39272c(str)) {
            return null;
        }
        AppMeasurementSdk appMeasurementSdk = this.f54558a;
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
        this.f54559b.put(str, zzgVar);
        return new C8326a(str);
    }

    @Override // com.google.firebase.analytics.connector.AnalyticsConnector
    @KeepForSdk
    public void setConditionalUserProperty(@NonNull AnalyticsConnector.ConditionalUserProperty conditionalUserProperty) {
        if (!zzc.zzi(conditionalUserProperty)) {
            return;
        }
        this.f54558a.setConditionalUserProperty(zzc.zza(conditionalUserProperty));
    }

    @Override // com.google.firebase.analytics.connector.AnalyticsConnector
    @KeepForSdk
    public void setUserProperty(@NonNull String str, @NonNull String str2, @NonNull Object obj) {
        if (!zzc.zzl(str) || !zzc.zzm(str, str2)) {
            return;
        }
        this.f54558a.setUserProperty(str, str2, obj);
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
        if (f54557c == null) {
            synchronized (AnalyticsConnectorImpl.class) {
                try {
                    if (f54557c == null) {
                        Bundle bundle = new Bundle(1);
                        if (firebaseApp.isDefaultApp()) {
                            subscriber.subscribe(DataCollectionDefaultChange.class, zza.zza, zzb.zza);
                            bundle.putBoolean("dataCollectionDefaultEnabled", firebaseApp.isDataCollectionDefaultEnabled());
                        }
                        f54557c = new AnalyticsConnectorImpl(zzee.zzg(context, null, null, null, bundle).zzd());
                    }
                } finally {
                }
            }
        }
        return f54557c;
    }
}