package com.google.android.gms.maps.model;

import android.os.IBinder;
import android.os.RemoteException;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.Preconditions;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Nullable;

/* loaded from: classes3.dex */
public final class IndoorBuilding {

    /* renamed from: a */
    public final com.google.android.gms.internal.maps.zzy f47947a;

    public IndoorBuilding(com.google.android.gms.internal.maps.zzy zzyVar) {
        QD2 qd2 = QD2.f4996a;
        this.f47947a = (com.google.android.gms.internal.maps.zzy) Preconditions.checkNotNull(zzyVar, "delegate");
        QD2 qd22 = (QD2) Preconditions.checkNotNull(qd2, "shim");
    }

    public boolean equals(@Nullable Object obj) {
        if (!(obj instanceof IndoorBuilding)) {
            return false;
        }
        try {
            return this.f47947a.zzh(((IndoorBuilding) obj).f47947a);
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public int getActiveLevelIndex() {
        try {
            return this.f47947a.zzd();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public int getDefaultLevelIndex() {
        try {
            return this.f47947a.zze();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    @NonNull
    public List<IndoorLevel> getLevels() {
        try {
            List<IBinder> zzg = this.f47947a.zzg();
            ArrayList arrayList = new ArrayList(zzg.size());
            for (IBinder iBinder : zzg) {
                arrayList.add(new IndoorLevel(com.google.android.gms.internal.maps.zzaa.zzb(iBinder)));
            }
            return arrayList;
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public int hashCode() {
        try {
            return this.f47947a.zzf();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public boolean isUnderground() {
        try {
            return this.f47947a.zzi();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }
}
