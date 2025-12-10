package com.google.android.gms.location;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import android.location.Location;
import android.os.Looper;
import android.os.SystemClock;
import android.os.WorkSource;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresPermission;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.common.api.internal.ListenerHolders;
import com.google.android.gms.common.api.internal.RegistrationMethods;
import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.common.api.internal.TaskApiCall;
import com.google.android.gms.common.internal.ClientIdentity;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.WorkSourceUtil;
import com.google.android.gms.location.CurrentLocationRequest;
import com.google.android.gms.location.LastLocationRequest;
import com.google.android.gms.tasks.CancellationToken;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.List;
import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
public class FusedLocationProviderClient extends GoogleApi<Api.ApiOptions.NoOptions> {
    @NonNull
    public static final String KEY_MOCK_LOCATION = "mockLocation";
    @NonNull
    public static final String KEY_VERTICAL_ACCURACY = "verticalAccuracy";

    @VisibleForTesting(otherwise = 3)
    public FusedLocationProviderClient(@NonNull Activity activity) {
        super(activity, LocationServices.API, Api.ApiOptions.NO_OPTIONS, GoogleApi.Settings.DEFAULT_SETTINGS);
    }

    /* renamed from: c */
    public final Task m46404c(final com.google.android.gms.internal.location.zzbf zzbfVar, final ListenerHolder listenerHolder) {
        final C21613pc2 c21613pc2 = new C21613pc2(this, listenerHolder);
        return doRegisterEventListener(RegistrationMethods.builder().register(new RemoteCall() { // from class: com.google.android.gms.location.zzan
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(Object obj, Object obj2) {
                FusedLocationProviderClient fusedLocationProviderClient = FusedLocationProviderClient.this;
                AbstractC18677Wc2 abstractC18677Wc2 = c21613pc2;
                ListenerHolder listenerHolder2 = listenerHolder;
                ((com.google.android.gms.internal.location.zzbe) obj).zzB(zzbfVar, listenerHolder2, new BinderC17909Kc2((TaskCompletionSource) obj2, new zzaf(fusedLocationProviderClient, abstractC18677Wc2, listenerHolder2), null));
            }
        }).unregister(c21613pc2).withHolder(listenerHolder).setMethodKey(2436).build());
    }

    @NonNull
    public Task<Void> flushLocations() {
        return doWrite(TaskApiCall.builder().run(zzad.zza).setMethodKey(2422).build());
    }

    @NonNull
    @RequiresPermission(anyOf = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
    public Task<Location> getCurrentLocation(int i, @Nullable final CancellationToken cancellationToken) {
        LocationRequest create = LocationRequest.create();
        create.setPriority(i);
        create.setInterval(0L);
        create.setFastestInterval(0L);
        create.setExpirationDuration(30000L);
        final com.google.android.gms.internal.location.zzbf zzc = com.google.android.gms.internal.location.zzbf.zzc(null, create);
        zzc.zzd(true);
        zzc.zze(30000L);
        if (cancellationToken != null) {
            Preconditions.checkArgument(true ^ cancellationToken.isCancellationRequested(), "cancellationToken may not be already canceled");
        }
        Task doRead = doRead(TaskApiCall.builder().run(new RemoteCall() { // from class: com.google.android.gms.location.zzaa
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(Object obj, Object obj2) {
                FusedLocationProviderClient fusedLocationProviderClient = FusedLocationProviderClient.this;
                com.google.android.gms.internal.location.zzbf zzbfVar = zzc;
                CancellationToken cancellationToken2 = cancellationToken;
                com.google.android.gms.internal.location.zzbe zzbeVar = (com.google.android.gms.internal.location.zzbe) obj;
                TaskCompletionSource taskCompletionSource = (TaskCompletionSource) obj2;
                CurrentLocationRequest.Builder builder = new CurrentLocationRequest.Builder();
                builder.setPriority(zzbfVar.zzb().getPriority());
                long j = Long.MAX_VALUE;
                if (zzbfVar.zzb().getExpirationTime() != Long.MAX_VALUE) {
                    j = zzbfVar.zzb().getExpirationTime() - SystemClock.elapsedRealtime();
                }
                builder.setDurationMillis(j);
                builder.setMaxUpdateAgeMillis(zzbfVar.zza());
                builder.zza(zzbfVar.zzg());
                List<ClientIdentity> zzf = zzbfVar.zzf();
                WorkSource workSource = new WorkSource();
                for (ClientIdentity clientIdentity : zzf) {
                    WorkSourceUtil.add(workSource, clientIdentity.uid, clientIdentity.packageName);
                }
                builder.zzb(workSource);
                zzbeVar.zzt(builder.build(), cancellationToken2, new BinderC20409ic2(fusedLocationProviderClient, taskCompletionSource));
            }
        }).setMethodKey(2415).build());
        if (cancellationToken != null) {
            final TaskCompletionSource taskCompletionSource = new TaskCompletionSource(cancellationToken);
            doRead.continueWith(new Continuation() { // from class: com.google.android.gms.location.zzag
                @Override // com.google.android.gms.tasks.Continuation
                public final Object then(Task task) {
                    TaskCompletionSource taskCompletionSource2 = TaskCompletionSource.this;
                    if (task.isSuccessful()) {
                        taskCompletionSource2.trySetResult((Location) task.getResult());
                        return null;
                    }
                    taskCompletionSource2.trySetException((Exception) Preconditions.checkNotNull(task.getException()));
                    return null;
                }
            });
            return taskCompletionSource.getTask();
        }
        return doRead;
    }

    @NonNull
    @RequiresPermission(anyOf = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
    public Task<Location> getLastLocation() {
        return doRead(TaskApiCall.builder().run(new RemoteCall() { // from class: com.google.android.gms.location.zzak
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(Object obj, Object obj2) {
                ((com.google.android.gms.internal.location.zzbe) obj).zzu(new LastLocationRequest.Builder().build(), new BinderC17461Dc2(FusedLocationProviderClient.this, (TaskCompletionSource) obj2));
            }
        }).setMethodKey(2414).build());
    }

    @NonNull
    @RequiresPermission(anyOf = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
    public Task<LocationAvailability> getLocationAvailability() {
        return doRead(TaskApiCall.builder().run(zzae.zza).setMethodKey(2416).build());
    }

    @NonNull
    public Task<Void> removeLocationUpdates(@NonNull final PendingIntent pendingIntent) {
        return doWrite(TaskApiCall.builder().run(new RemoteCall() { // from class: com.google.android.gms.location.zzz
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(Object obj, Object obj2) {
                ((com.google.android.gms.internal.location.zzbe) obj).zzA(pendingIntent, new BinderC18293Qc2((TaskCompletionSource) obj2));
            }
        }).setMethodKey(2418).build());
    }

    @NonNull
    @RequiresPermission(anyOf = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
    public Task<Void> requestLocationUpdates(@NonNull LocationRequest locationRequest, @NonNull final PendingIntent pendingIntent) {
        final com.google.android.gms.internal.location.zzbf zzc = com.google.android.gms.internal.location.zzbf.zzc(null, locationRequest);
        return doWrite(TaskApiCall.builder().run(new RemoteCall() { // from class: com.google.android.gms.location.zzac
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(Object obj, Object obj2) {
                ((com.google.android.gms.internal.location.zzbe) obj).zzD(com.google.android.gms.internal.location.zzbf.this, pendingIntent, new BinderC18293Qc2((TaskCompletionSource) obj2));
            }
        }).setMethodKey(2417).build());
    }

    @NonNull
    @RequiresPermission(anyOf = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
    public Task<Void> setMockLocation(@NonNull final Location location) {
        boolean z;
        if (location != null) {
            z = true;
        } else {
            z = false;
        }
        Preconditions.checkArgument(z);
        return doWrite(TaskApiCall.builder().run(new RemoteCall() { // from class: com.google.android.gms.location.zzal
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(Object obj, Object obj2) {
                com.google.android.gms.internal.location.zzbe zzbeVar = (com.google.android.gms.internal.location.zzbe) obj;
                zzbeVar.zzE(location, new BinderC22989xc2(FusedLocationProviderClient.this, (TaskCompletionSource) obj2));
            }
        }).setMethodKey(2421).build());
    }

    @NonNull
    @RequiresPermission(anyOf = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
    public Task<Void> setMockMode(final boolean z) {
        return doWrite(TaskApiCall.builder().run(new RemoteCall() { // from class: com.google.android.gms.location.zzab
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(Object obj, Object obj2) {
                com.google.android.gms.internal.location.zzbe zzbeVar = (com.google.android.gms.internal.location.zzbe) obj;
                zzbeVar.zzF(z, new BinderC22989xc2(FusedLocationProviderClient.this, (TaskCompletionSource) obj2));
            }
        }).setMethodKey(2420).build());
    }

    @VisibleForTesting(otherwise = 3)
    public FusedLocationProviderClient(@NonNull Context context) {
        super(context, LocationServices.API, Api.ApiOptions.NO_OPTIONS, GoogleApi.Settings.DEFAULT_SETTINGS);
    }

    @NonNull
    @RequiresPermission(anyOf = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
    public Task<Location> getLastLocation(@NonNull final LastLocationRequest lastLocationRequest) {
        return doRead(TaskApiCall.builder().run(new RemoteCall() { // from class: com.google.android.gms.location.zzao
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(Object obj, Object obj2) {
                com.google.android.gms.internal.location.zzbe zzbeVar = (com.google.android.gms.internal.location.zzbe) obj;
                zzbeVar.zzu(lastLocationRequest, new BinderC17461Dc2(FusedLocationProviderClient.this, (TaskCompletionSource) obj2));
            }
        }).setMethodKey(2414).setFeatures(zzy.zzf).build());
    }

    @NonNull
    public Task<Void> removeLocationUpdates(@NonNull LocationCallback locationCallback) {
        return doUnregisterEventListener(ListenerHolders.createListenerKey(locationCallback, LocationCallback.class.getSimpleName()), 2418).continueWith(zzaj.zza, zzai.zza);
    }

    @NonNull
    @RequiresPermission(anyOf = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
    public Task<Void> requestLocationUpdates(@NonNull LocationRequest locationRequest, @NonNull LocationCallback locationCallback, @Nullable Looper looper) {
        com.google.android.gms.internal.location.zzbf zzc = com.google.android.gms.internal.location.zzbf.zzc(null, locationRequest);
        if (looper == null && (looper = Looper.myLooper()) == null) {
            throw new IllegalStateException();
        }
        return m46404c(zzc, ListenerHolders.createListenerHolder(locationCallback, looper, LocationCallback.class.getSimpleName()));
    }

    @NonNull
    @RequiresPermission(anyOf = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
    public Task<Void> requestLocationUpdates(@NonNull LocationRequest locationRequest, @NonNull Executor executor, @NonNull LocationCallback locationCallback) {
        return m46404c(com.google.android.gms.internal.location.zzbf.zzc(null, locationRequest), ListenerHolders.createListenerHolder(locationCallback, executor, LocationCallback.class.getSimpleName()));
    }

    @NonNull
    @RequiresPermission(anyOf = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
    public Task<Location> getCurrentLocation(@NonNull final CurrentLocationRequest currentLocationRequest, @Nullable final CancellationToken cancellationToken) {
        if (cancellationToken != null) {
            Preconditions.checkArgument(!cancellationToken.isCancellationRequested(), "cancellationToken may not be already canceled");
        }
        Task doRead = doRead(TaskApiCall.builder().run(new RemoteCall() { // from class: com.google.android.gms.location.zzam
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(Object obj, Object obj2) {
                com.google.android.gms.internal.location.zzbe zzbeVar = (com.google.android.gms.internal.location.zzbe) obj;
                zzbeVar.zzt(currentLocationRequest, cancellationToken, new BinderC17461Dc2(FusedLocationProviderClient.this, (TaskCompletionSource) obj2));
            }
        }).setFeatures(zzy.zze).setMethodKey(2415).build());
        if (cancellationToken != null) {
            final TaskCompletionSource taskCompletionSource = new TaskCompletionSource(cancellationToken);
            doRead.continueWith(new Continuation() { // from class: com.google.android.gms.location.zzah
                @Override // com.google.android.gms.tasks.Continuation
                public final Object then(Task task) {
                    TaskCompletionSource taskCompletionSource2 = TaskCompletionSource.this;
                    if (task.isSuccessful()) {
                        taskCompletionSource2.trySetResult((Location) task.getResult());
                        return null;
                    }
                    taskCompletionSource2.trySetException((Exception) Preconditions.checkNotNull(task.getException()));
                    return null;
                }
            });
            return taskCompletionSource.getTask();
        }
        return doRead;
    }
}
