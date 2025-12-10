package com.google.android.gms.maps.model;

import android.os.RemoteException;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Preconditions;

/* loaded from: classes3.dex */
public final class IndoorLevel {

    /* renamed from: a */
    public final com.google.android.gms.internal.maps.zzab f47948a;

    public IndoorLevel(com.google.android.gms.internal.maps.zzab zzabVar) {
        this.f47948a = (com.google.android.gms.internal.maps.zzab) Preconditions.checkNotNull(zzabVar);
    }

    public void activate() {
        try {
            this.f47948a.zzg();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public boolean equals(@Nullable Object obj) {
        if (!(obj instanceof IndoorLevel)) {
            return false;
        }
        try {
            return this.f47948a.zzh(((IndoorLevel) obj).f47948a);
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    @NonNull
    public String getName() {
        try {
            return this.f47948a.zze();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    @NonNull
    public String getShortName() {
        try {
            return this.f47948a.zzf();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public int hashCode() {
        try {
            return this.f47948a.zzd();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }
}
