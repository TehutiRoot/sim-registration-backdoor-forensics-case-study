package p000;

import android.app.Activity;
import android.app.Fragment;
import android.os.RemoteException;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.dynamic.DeferredLifecycleHelper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamic.OnDelegateCreatedListener;
import com.google.android.gms.maps.MapsInitializer;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.internal.IMapFragmentDelegate;
import com.google.android.gms.maps.internal.zzcc;
import com.google.android.gms.maps.model.RuntimeRemoteException;
import java.util.ArrayList;
import java.util.List;

/* renamed from: zb2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C23330zb2 extends DeferredLifecycleHelper {

    /* renamed from: e */
    public final Fragment f109112e;

    /* renamed from: f */
    public OnDelegateCreatedListener f109113f;

    /* renamed from: g */
    public Activity f109114g;

    /* renamed from: h */
    public final List f109115h = new ArrayList();

    public C23330zb2(Fragment fragment) {
        this.f109112e = fragment;
    }

    /* renamed from: g */
    public static /* synthetic */ void m70g(C23330zb2 c23330zb2, Activity activity) {
        c23330zb2.f109114g = activity;
        c23330zb2.m68i();
    }

    @Override // com.google.android.gms.dynamic.DeferredLifecycleHelper
    public final void createDelegate(OnDelegateCreatedListener onDelegateCreatedListener) {
        this.f109113f = onDelegateCreatedListener;
        m68i();
    }

    /* renamed from: h */
    public final void m69h(OnMapReadyCallback onMapReadyCallback) {
        if (getDelegate() != null) {
            ((C22298tb2) getDelegate()).getMapAsync(onMapReadyCallback);
        } else {
            this.f109115h.add(onMapReadyCallback);
        }
    }

    /* renamed from: i */
    public final void m68i() {
        if (this.f109114g != null && this.f109113f != null && getDelegate() == null) {
            try {
                MapsInitializer.initialize(this.f109114g);
                IMapFragmentDelegate zzf = zzcc.zza(this.f109114g, null).zzf(ObjectWrapper.wrap(this.f109114g));
                if (zzf != null) {
                    this.f109113f.onDelegateCreated(new C22298tb2(this.f109112e, zzf));
                    for (OnMapReadyCallback onMapReadyCallback : this.f109115h) {
                        ((C22298tb2) getDelegate()).getMapAsync(onMapReadyCallback);
                    }
                    this.f109115h.clear();
                }
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            } catch (GooglePlayServicesNotAvailableException unused) {
            }
        }
    }
}
