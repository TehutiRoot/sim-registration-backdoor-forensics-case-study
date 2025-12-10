package com.google.android.gms.maps.model;

import android.os.RemoteException;
import androidx.annotation.NonNull;
import com.google.android.gms.internal.maps.zzbl;
import java.util.Map;

/* loaded from: classes3.dex */
public final class DatasetFeature extends Feature {

    /* renamed from: b */
    public final com.google.android.gms.internal.maps.zzp f47915b;

    public DatasetFeature(com.google.android.gms.internal.maps.zzp zzpVar) {
        super(zzpVar);
        this.f47915b = zzpVar;
    }

    @NonNull
    public Map<String, String> getDatasetAttributes() {
        try {
            return zzbl.zzc(this.f47915b.zzh().entrySet());
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    @NonNull
    public String getDatasetId() {
        try {
            return this.f47915b.zze();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }
}
