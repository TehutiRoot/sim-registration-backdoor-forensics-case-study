package com.google.android.gms.internal.location;

import android.app.PendingIntent;
import android.content.Context;
import android.location.Location;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BaseImplementation;
import com.google.android.gms.common.api.internal.ConnectionCallbacks;
import com.google.android.gms.common.api.internal.IStatusCallback;
import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.common.api.internal.ListenerHolders;
import com.google.android.gms.common.api.internal.OnConnectionFailedListener;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.common.internal.GmsClient;
import com.google.android.gms.common.internal.ICancelToken;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.location.CurrentLocationRequest;
import com.google.android.gms.location.GeofencingRequest;
import com.google.android.gms.location.LastLocationRequest;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationCallback;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationSettingsRequest;
import com.google.android.gms.location.zzy;
import com.google.android.gms.tasks.CancellationToken;
import com.google.android.gms.tasks.OnTokenCanceledListener;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public final class zzbe extends GmsClient {
    public static final /* synthetic */ int zze = 0;

    /* renamed from: F */
    public final Map f46143F;

    /* renamed from: G */
    public final Map f46144G;

    /* renamed from: H */
    public final Map f46145H;

    /* renamed from: I */
    public final String f46146I;

    /* renamed from: J */
    public boolean f46147J;

    public zzbe(Context context, Looper looper, ClientSettings clientSettings, ConnectionCallbacks connectionCallbacks, OnConnectionFailedListener onConnectionFailedListener, String str) {
        super(context, looper, 23, clientSettings, connectionCallbacks, onConnectionFailedListener);
        this.f46143F = new HashMap();
        this.f46144G = new HashMap();
        this.f46145H = new HashMap();
        this.f46146I = str;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final /* synthetic */ IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
        if (queryLocalInterface instanceof zzam) {
            return (zzam) queryLocalInterface;
        }
        return new zzal(iBinder);
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient, com.google.android.gms.common.api.Api.Client
    public final void disconnect() {
        synchronized (this) {
            if (isConnected()) {
                try {
                    synchronized (this.f46143F) {
                        try {
                            for (BinderC18360Rd2 binderC18360Rd2 : this.f46143F.values()) {
                                ((zzam) getService()).zzz(zzbh.zzb(binderC18360Rd2, null));
                            }
                            this.f46143F.clear();
                        } finally {
                        }
                    }
                    synchronized (this.f46144G) {
                        try {
                            for (BinderC19724ed2 binderC19724ed2 : this.f46144G.values()) {
                                ((zzam) getService()).zzz(zzbh.zza(binderC19724ed2, null));
                            }
                            this.f46144G.clear();
                        } finally {
                        }
                    }
                    synchronized (this.f46145H) {
                        try {
                            for (Object obj : this.f46145H.values()) {
                                AbstractC22494uj2.m1214a(obj);
                                ((zzam) getService()).zzy(new zzj(2, null, null, null));
                            }
                            this.f46145H.clear();
                        } finally {
                        }
                    }
                    if (this.f46147J) {
                        zzF(false, new BinderC17333Bc2(this));
                    }
                } catch (Exception unused) {
                }
            }
            super.disconnect();
        }
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final Feature[] getApiFeatures() {
        return zzy.zzj;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final Bundle getGetServiceRequestExtraArgs() {
        Bundle bundle = new Bundle();
        bundle.putString("client_name", this.f46146I);
        return bundle;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient, com.google.android.gms.common.api.Api.Client
    public final int getMinApkVersion() {
        return 11717000;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final String getServiceDescriptor() {
        return "com.google.android.gms.location.internal.IGoogleLocationManagerService";
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final String getStartServiceAction() {
        return "com.google.android.location.internal.GoogleLocationManagerService.START";
    }

    /* renamed from: p */
    public final boolean m47411p(Feature feature) {
        Feature feature2;
        Feature[] availableFeatures = getAvailableFeatures();
        if (availableFeatures == null) {
            return false;
        }
        int length = availableFeatures.length;
        int i = 0;
        while (true) {
            if (i < length) {
                feature2 = availableFeatures[i];
                if (feature.getName().equals(feature2.getName())) {
                    break;
                }
                i++;
            } else {
                feature2 = null;
                break;
            }
        }
        if (feature2 == null || feature2.getVersion() < feature.getVersion()) {
            return false;
        }
        return true;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final boolean usesClientTelemetry() {
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void zzA(PendingIntent pendingIntent, zzai zzaiVar) throws RemoteException {
        ((zzam) getService()).zzz(new zzbh(2, null, null, null, pendingIntent, zzaiVar, null));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void zzB(zzbf zzbfVar, ListenerHolder listenerHolder, zzai zzaiVar) throws RemoteException {
        BinderC19724ed2 binderC19724ed2;
        ListenerHolder.ListenerKey listenerKey = listenerHolder.getListenerKey();
        if (listenerKey == null) {
            new RuntimeException();
            return;
        }
        getContext();
        synchronized (this) {
            synchronized (this.f46144G) {
                BinderC19724ed2 binderC19724ed22 = (BinderC19724ed2) this.f46144G.get(listenerKey);
                if (binderC19724ed22 == null) {
                    binderC19724ed22 = new BinderC19724ed2(listenerHolder);
                    this.f46144G.put(listenerKey, binderC19724ed22);
                }
                binderC19724ed2 = binderC19724ed22;
            }
            ((zzam) getService()).zzz(new zzbh(1, zzbfVar, null, binderC19724ed2, null, zzaiVar, listenerKey.toIdString()));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void zzC(zzbf zzbfVar, ListenerHolder listenerHolder, zzai zzaiVar) throws RemoteException {
        BinderC18360Rd2 binderC18360Rd2;
        ListenerHolder.ListenerKey listenerKey = listenerHolder.getListenerKey();
        if (listenerKey == null) {
            new RuntimeException();
            return;
        }
        getContext();
        synchronized (this) {
            synchronized (this.f46143F) {
                BinderC18360Rd2 binderC18360Rd22 = (BinderC18360Rd2) this.f46143F.get(listenerKey);
                if (binderC18360Rd22 == null) {
                    binderC18360Rd22 = new BinderC18360Rd2(listenerHolder);
                    this.f46143F.put(listenerKey, binderC18360Rd22);
                }
                binderC18360Rd2 = binderC18360Rd22;
            }
            ((zzam) getService()).zzz(new zzbh(1, zzbfVar, binderC18360Rd2, null, null, zzaiVar, listenerKey.toIdString()));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void zzD(zzbf zzbfVar, PendingIntent pendingIntent, zzai zzaiVar) throws RemoteException {
        getContext();
        int hashCode = pendingIntent.hashCode();
        StringBuilder sb = new StringBuilder(25);
        sb.append("PendingIntent@");
        sb.append(hashCode);
        ((zzam) getService()).zzz(new zzbh(1, zzbfVar, null, null, pendingIntent, zzaiVar, sb.toString()));
    }

    public final void zzE(Location location, IStatusCallback iStatusCallback) throws RemoteException {
        if (m47411p(zzy.zzh)) {
            ((zzam) getService()).zzv(location, iStatusCallback);
            return;
        }
        ((zzam) getService()).zzu(location);
        iStatusCallback.onResult(Status.RESULT_SUCCESS);
    }

    public final void zzF(boolean z, IStatusCallback iStatusCallback) throws RemoteException {
        if (m47411p(zzy.zzg)) {
            ((zzam) getService()).zzx(z, iStatusCallback);
        } else {
            ((zzam) getService()).zzw(z);
            iStatusCallback.onResult(Status.RESULT_SUCCESS);
        }
        this.f46147J = z;
    }

    public final LocationAvailability zzp() throws RemoteException {
        return ((zzam) getService()).zzf(getContext().getPackageName());
    }

    public final void zzq(GeofencingRequest geofencingRequest, PendingIntent pendingIntent, BaseImplementation.ResultHolder resultHolder) throws RemoteException {
        Preconditions.checkNotNull(geofencingRequest, "geofencingRequest can't be null.");
        Preconditions.checkNotNull(pendingIntent, "PendingIntent must be specified.");
        Preconditions.checkNotNull(resultHolder, "ResultHolder not provided.");
        ((zzam) getService()).zzg(geofencingRequest, pendingIntent, new BinderC18104Nd2(resultHolder));
    }

    public final void zzr(LocationSettingsRequest locationSettingsRequest, BaseImplementation.ResultHolder resultHolder, String str) throws RemoteException {
        boolean z;
        boolean z2 = false;
        if (locationSettingsRequest != null) {
            z = true;
        } else {
            z = false;
        }
        Preconditions.checkArgument(z, "locationSettingsRequest can't be null nor empty.");
        if (resultHolder != null) {
            z2 = true;
        }
        Preconditions.checkArgument(z2, "listener can't be null.");
        ((zzam) getService()).zzh(locationSettingsRequest, new BinderC18680Wd2(resultHolder), null);
    }

    public final void zzs(zzai zzaiVar) throws RemoteException {
        ((zzam) getService()).zzi(zzaiVar);
    }

    public final void zzt(CurrentLocationRequest currentLocationRequest, CancellationToken cancellationToken, zzao zzaoVar) throws RemoteException {
        if (m47411p(zzy.zze)) {
            final ICancelToken zze2 = ((zzam) getService()).zze(currentLocationRequest, zzaoVar);
            if (cancellationToken != null) {
                cancellationToken.onCanceledRequested(new OnTokenCanceledListener() { // from class: com.google.android.gms.internal.location.zzar
                    @Override // com.google.android.gms.tasks.OnTokenCanceledListener
                    public final void onCanceled() {
                        ICancelToken iCancelToken = zze2;
                        int i = zzbe.zze;
                        try {
                            iCancelToken.cancel();
                        } catch (RemoteException unused) {
                        }
                    }
                });
                return;
            }
            return;
        }
        final AtomicReference atomicReference = new AtomicReference();
        OnTokenCanceledListener onTokenCanceledListener = new OnTokenCanceledListener() { // from class: com.google.android.gms.internal.location.zzas
            @Override // com.google.android.gms.tasks.OnTokenCanceledListener
            public final void onCanceled() {
                zzbe zzbeVar = zzbe.this;
                ListenerHolder.ListenerKey listenerKey = ((ListenerHolder) Preconditions.checkNotNull((ListenerHolder) atomicReference.get())).getListenerKey();
                if (listenerKey != null) {
                    try {
                        zzbeVar.zzy(listenerKey, null);
                    } catch (RemoteException unused) {
                    }
                }
            }
        };
        ListenerHolder createListenerHolder = ListenerHolders.createListenerHolder(new C17717Hc2(this, zzaoVar, onTokenCanceledListener), zzbn.zza(Looper.getMainLooper()), LocationCallback.class.getSimpleName());
        atomicReference.set(createListenerHolder);
        if (cancellationToken != null) {
            cancellationToken.onCanceledRequested(onTokenCanceledListener);
        }
        LocationRequest create = LocationRequest.create();
        create.setPriority(currentLocationRequest.getPriority());
        create.setInterval(0L);
        create.setFastestInterval(0L);
        create.setExpirationDuration(currentLocationRequest.getDurationMillis());
        zzbf zzc = zzbf.zzc(null, create);
        zzc.f46157i = true;
        zzc.zze(currentLocationRequest.getMaxUpdateAgeMillis());
        zzB(zzc, createListenerHolder, new BinderC18165Oc2(this, zzaoVar));
    }

    public final void zzu(LastLocationRequest lastLocationRequest, zzao zzaoVar) throws RemoteException {
        if (m47411p(zzy.zzf)) {
            ((zzam) getService()).zzj(lastLocationRequest, zzaoVar);
        } else {
            zzaoVar.zzb(Status.RESULT_SUCCESS, ((zzam) getService()).zzd());
        }
    }

    public final void zzv(PendingIntent pendingIntent) throws RemoteException {
        Preconditions.checkNotNull(pendingIntent);
        ((zzam) getService()).zzl(pendingIntent);
    }

    public final void zzw(PendingIntent pendingIntent, BaseImplementation.ResultHolder resultHolder) throws RemoteException {
        Preconditions.checkNotNull(pendingIntent, "PendingIntent must be specified.");
        Preconditions.checkNotNull(resultHolder, "ResultHolder not provided.");
        ((zzam) getService()).zzn(pendingIntent, new BinderC18104Nd2(resultHolder), getContext().getPackageName());
    }

    public final void zzx(List list, BaseImplementation.ResultHolder resultHolder) throws RemoteException {
        boolean z;
        if (list != null && list.size() > 0) {
            z = true;
        } else {
            z = false;
        }
        Preconditions.checkArgument(z, "geofenceRequestIds can't be null nor empty.");
        Preconditions.checkNotNull(resultHolder, "ResultHolder not provided.");
        BinderC18104Nd2 binderC18104Nd2 = new BinderC18104Nd2(resultHolder);
        ((zzam) getService()).zzo((String[]) list.toArray(new String[0]), binderC18104Nd2, getContext().getPackageName());
    }

    public final void zzy(ListenerHolder.ListenerKey listenerKey, zzai zzaiVar) throws RemoteException {
        Preconditions.checkNotNull(listenerKey, "Invalid null listener key");
        synchronized (this.f46144G) {
            try {
                BinderC19724ed2 binderC19724ed2 = (BinderC19724ed2) this.f46144G.remove(listenerKey);
                if (binderC19724ed2 != null) {
                    binderC19724ed2.zzc();
                    ((zzam) getService()).zzz(zzbh.zza(binderC19724ed2, zzaiVar));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void zzz(ListenerHolder.ListenerKey listenerKey, zzai zzaiVar) throws RemoteException {
        Preconditions.checkNotNull(listenerKey, "Invalid null listener key");
        synchronized (this.f46143F) {
            try {
                BinderC18360Rd2 binderC18360Rd2 = (BinderC18360Rd2) this.f46143F.remove(listenerKey);
                if (binderC18360Rd2 != null) {
                    binderC18360Rd2.zzc();
                    ((zzam) getService()).zzz(zzbh.zzb(binderC18360Rd2, zzaiVar));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
