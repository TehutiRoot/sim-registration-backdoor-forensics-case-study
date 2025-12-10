package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.WorkerThread;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.BaseGmsClient;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.stats.ConnectionTracker;
import com.google.android.gms.common.util.VisibleForTesting;

@VisibleForTesting
/* loaded from: classes3.dex */
public final class zzjr implements ServiceConnection, BaseGmsClient.BaseConnectionCallbacks, BaseGmsClient.BaseOnConnectionFailedListener {

    /* renamed from: a */
    public volatile boolean f48430a;

    /* renamed from: b */
    public volatile zzek f48431b;

    /* renamed from: c */
    public final /* synthetic */ zzjs f48432c;

    public zzjr(zzjs zzjsVar) {
        this.f48432c = zzjsVar;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    @MainThread
    public final void onConnected(Bundle bundle) {
        Preconditions.checkMainThread("MeasurementServiceConnection.onConnected");
        synchronized (this) {
            try {
                Preconditions.checkNotNull(this.f48431b);
                this.f48432c.zzs.zzaz().zzp(new RunnableC6719a0(this, (zzee) this.f48431b.getService()));
            } catch (DeadObjectException | IllegalStateException unused) {
                this.f48431b = null;
                this.f48430a = false;
            }
        }
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseOnConnectionFailedListener
    @MainThread
    public final void onConnectionFailed(@NonNull ConnectionResult connectionResult) {
        Preconditions.checkMainThread("MeasurementServiceConnection.onConnectionFailed");
        zzeo zzl = this.f48432c.zzs.zzl();
        if (zzl != null) {
            zzl.zzk().zzb("Service connection failed", connectionResult);
        }
        synchronized (this) {
            this.f48430a = false;
            this.f48431b = null;
        }
        this.f48432c.zzs.zzaz().zzp(new IA2(this));
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    @MainThread
    public final void onConnectionSuspended(int i) {
        Preconditions.checkMainThread("MeasurementServiceConnection.onConnectionSuspended");
        this.f48432c.zzs.zzay().zzc().zza("Service connection suspended");
        this.f48432c.zzs.zzaz().zzp(new RunnableC6721b0(this));
    }

    @Override // android.content.ServiceConnection
    @MainThread
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        zzjr zzjrVar;
        zzee zzecVar;
        Preconditions.checkMainThread("MeasurementServiceConnection.onServiceConnected");
        synchronized (this) {
            if (iBinder == null) {
                this.f48430a = false;
                this.f48432c.zzs.zzay().zzd().zza("Service connected with null binder");
                return;
            }
            zzee zzeeVar = null;
            try {
                String interfaceDescriptor = iBinder.getInterfaceDescriptor();
                if ("com.google.android.gms.measurement.internal.IMeasurementService".equals(interfaceDescriptor)) {
                    IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.measurement.internal.IMeasurementService");
                    if (queryLocalInterface instanceof zzee) {
                        zzecVar = (zzee) queryLocalInterface;
                    } else {
                        zzecVar = new zzec(iBinder);
                    }
                    zzeeVar = zzecVar;
                    this.f48432c.zzs.zzay().zzj().zza("Bound to IMeasurementService interface");
                } else {
                    this.f48432c.zzs.zzay().zzd().zzb("Got binder with a wrong descriptor", interfaceDescriptor);
                }
            } catch (RemoteException unused) {
                this.f48432c.zzs.zzay().zzd().zza("Service connect failed to get IMeasurementService");
            }
            if (zzeeVar == null) {
                this.f48430a = false;
                try {
                    ConnectionTracker connectionTracker = ConnectionTracker.getInstance();
                    Context zzau = this.f48432c.zzs.zzau();
                    zzjrVar = this.f48432c.f48433b;
                    connectionTracker.unbindService(zzau, zzjrVar);
                } catch (IllegalArgumentException unused2) {
                }
            } else {
                this.f48432c.zzs.zzaz().zzp(new RunnableC6717Z(this, zzeeVar));
            }
        }
    }

    @Override // android.content.ServiceConnection
    @MainThread
    public final void onServiceDisconnected(ComponentName componentName) {
        Preconditions.checkMainThread("MeasurementServiceConnection.onServiceDisconnected");
        this.f48432c.zzs.zzay().zzc().zza("Service disconnected");
        this.f48432c.zzs.zzaz().zzp(new RunnableC22575vA2(this, componentName));
    }

    @WorkerThread
    public final void zzb(Intent intent) {
        zzjr zzjrVar;
        this.f48432c.zzg();
        Context zzau = this.f48432c.zzs.zzau();
        ConnectionTracker connectionTracker = ConnectionTracker.getInstance();
        synchronized (this) {
            try {
                if (this.f48430a) {
                    this.f48432c.zzs.zzay().zzj().zza("Connection attempt already in progress");
                    return;
                }
                this.f48432c.zzs.zzay().zzj().zza("Using local app measurement service");
                this.f48430a = true;
                zzjrVar = this.f48432c.f48433b;
                connectionTracker.bindService(zzau, intent, zzjrVar, 129);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @WorkerThread
    public final void zzc() {
        this.f48432c.zzg();
        Context zzau = this.f48432c.zzs.zzau();
        synchronized (this) {
            try {
                if (this.f48430a) {
                    this.f48432c.zzs.zzay().zzj().zza("Connection attempt already in progress");
                } else if (this.f48431b != null && (this.f48431b.isConnecting() || this.f48431b.isConnected())) {
                    this.f48432c.zzs.zzay().zzj().zza("Already awaiting connection attempt");
                } else {
                    this.f48431b = new zzek(zzau, Looper.getMainLooper(), this, this);
                    this.f48432c.zzs.zzay().zzj().zza("Connecting to remote service");
                    this.f48430a = true;
                    Preconditions.checkNotNull(this.f48431b);
                    this.f48431b.checkAvailabilityAndConnect();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @WorkerThread
    public final void zzd() {
        if (this.f48431b != null && (this.f48431b.isConnected() || this.f48431b.isConnecting())) {
            this.f48431b.disconnect();
        }
        this.f48431b = null;
    }
}
