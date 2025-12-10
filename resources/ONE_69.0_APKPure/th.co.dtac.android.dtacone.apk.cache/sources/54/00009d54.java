package com.google.android.gms.maps.model;

import android.os.RemoteException;
import androidx.annotation.NonNull;
import com.google.android.gms.internal.maps.zzbl;
import java.util.Map;

/* loaded from: classes3.dex */
public final class DatasetFeature extends Feature {

    /* renamed from: b */
    public final com.google.android.gms.internal.maps.zzp f47927b;

    public DatasetFeature(com.google.android.gms.internal.maps.zzp zzpVar) {
        super(zzpVar);
        this.f47927b = zzpVar;
    }

    @NonNull
    public Map<String, String> getDatasetAttributes() {
        try {
            return zzbl.zzc(this.f47927b.zzh().entrySet());
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    @NonNull
    public String getDatasetId() {
        try {
            return this.f47927b.zze();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }
}