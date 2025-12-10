package p000;

import android.app.Activity;
import android.os.RemoteException;
import androidx.fragment.app.Fragment;
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

/* renamed from: Ud2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C18595Ud2 extends DeferredLifecycleHelper {

    /* renamed from: e */
    public final Fragment f6673e;

    /* renamed from: f */
    public OnDelegateCreatedListener f6674f;

    /* renamed from: g */
    public Activity f6675g;

    /* renamed from: h */
    public final List f6676h = new ArrayList();

    public C18595Ud2(Fragment fragment) {
        this.f6673e = fragment;
    }

    /* renamed from: g */
    public static /* synthetic */ void m66129g(C18595Ud2 c18595Ud2, Activity activity) {
        c18595Ud2.f6675g = activity;
        c18595Ud2.m66127i();
    }

    @Override // com.google.android.gms.dynamic.DeferredLifecycleHelper
    public final void createDelegate(OnDelegateCreatedListener onDelegateCreatedListener) {
        this.f6674f = onDelegateCreatedListener;
        m66127i();
    }

    /* renamed from: h */
    public final void m66128h(OnMapReadyCallback onMapReadyCallback) {
        if (getDelegate() != null) {
            ((C18205Od2) getDelegate()).getMapAsync(onMapReadyCallback);
        } else {
            this.f6676h.add(onMapReadyCallback);
        }
    }

    /* renamed from: i */
    public final void m66127i() {
        if (this.f6675g != null && this.f6674f != null && getDelegate() == null) {
            try {
                MapsInitializer.initialize(this.f6675g);
                IMapFragmentDelegate zzf = zzcc.zza(this.f6675g, null).zzf(ObjectWrapper.wrap(this.f6675g));
                if (zzf != null) {
                    this.f6674f.onDelegateCreated(new C18205Od2(this.f6673e, zzf));
                    for (OnMapReadyCallback onMapReadyCallback : this.f6676h) {
                        ((C18205Od2) getDelegate()).getMapAsync(onMapReadyCallback);
                    }
                    this.f6676h.clear();
                }
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            } catch (GooglePlayServicesNotAvailableException unused) {
            }
        }
    }
}