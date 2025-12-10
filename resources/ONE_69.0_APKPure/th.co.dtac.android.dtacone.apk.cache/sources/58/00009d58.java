package com.google.android.gms.maps.model;

import android.os.RemoteException;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.maps.zzaj;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public final class FeatureLayer {

    /* renamed from: a */
    public final com.google.android.gms.internal.maps.zzs f47930a;

    /* renamed from: b */
    public StyleFactory f47931b;

    /* renamed from: c */
    public final Map f47932c = new HashMap();

    /* loaded from: classes3.dex */
    public interface OnFeatureClickListener {
        void onFeatureClick(@NonNull FeatureClickEvent featureClickEvent);
    }

    /* loaded from: classes3.dex */
    public interface StyleFactory {
        @Nullable
        FeatureStyle getStyle(@NonNull Feature feature);
    }

    public FeatureLayer(com.google.android.gms.internal.maps.zzs zzsVar) {
        this.f47930a = (com.google.android.gms.internal.maps.zzs) Preconditions.checkNotNull(zzsVar);
    }

    public final void addOnFeatureClickListener(@NonNull OnFeatureClickListener onFeatureClickListener) {
        try {
            BinderC6667b binderC6667b = new BinderC6667b(this, onFeatureClickListener);
            this.f47932c.put(onFeatureClickListener, binderC6667b);
            this.f47930a.zzf(binderC6667b);
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    @Nullable
    public String getDatasetId() {
        try {
            return this.f47930a.zzd();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    @Nullable
    public StyleFactory getFeatureStyle() {
        return this.f47931b;
    }

    @NonNull
    @FeatureType
    public String getFeatureType() {
        try {
            return this.f47930a.zze();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public boolean isAvailable() {
        try {
            return this.f47930a.zzi();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public final void removeOnFeatureClickListener(@NonNull OnFeatureClickListener onFeatureClickListener) {
        try {
            if (this.f47932c.containsKey(onFeatureClickListener)) {
                this.f47930a.zzg((zzaj) this.f47932c.get(onFeatureClickListener));
                this.f47932c.remove(onFeatureClickListener);
            }
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public void setFeatureStyle(@Nullable StyleFactory styleFactory) {
        this.f47931b = styleFactory;
        if (styleFactory == null) {
            try {
                this.f47930a.zzh(null);
                return;
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }
        try {
            this.f47930a.zzh(new BinderC6666a(this, styleFactory));
        } catch (RemoteException e2) {
            throw new RuntimeRemoteException(e2);
        }
    }
}