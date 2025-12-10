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

/* renamed from: Xc2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C18741Xc2 extends DeferredLifecycleHelper {

    /* renamed from: e */
    public final Fragment f7530e;

    /* renamed from: f */
    public OnDelegateCreatedListener f7531f;

    /* renamed from: g */
    public Activity f7532g;

    /* renamed from: h */
    public final List f7533h = new ArrayList();

    public C18741Xc2(Fragment fragment) {
        this.f7530e = fragment;
    }

    /* renamed from: g */
    public static /* synthetic */ void m65474g(C18741Xc2 c18741Xc2, Activity activity) {
        c18741Xc2.f7532g = activity;
        c18741Xc2.m65472i();
    }

    @Override // com.google.android.gms.dynamic.DeferredLifecycleHelper
    public final void createDelegate(OnDelegateCreatedListener onDelegateCreatedListener) {
        this.f7531f = onDelegateCreatedListener;
        m65472i();
    }

    /* renamed from: h */
    public final void m65473h(OnMapReadyCallback onMapReadyCallback) {
        if (getDelegate() != null) {
            ((C18357Rc2) getDelegate()).getMapAsync(onMapReadyCallback);
        } else {
            this.f7533h.add(onMapReadyCallback);
        }
    }

    /* renamed from: i */
    public final void m65472i() {
        if (this.f7532g != null && this.f7531f != null && getDelegate() == null) {
            try {
                MapsInitializer.initialize(this.f7532g);
                IMapFragmentDelegate zzf = zzcc.zza(this.f7532g, null).zzf(ObjectWrapper.wrap(this.f7532g));
                if (zzf != null) {
                    this.f7531f.onDelegateCreated(new C18357Rc2(this.f7530e, zzf));
                    for (OnMapReadyCallback onMapReadyCallback : this.f7533h) {
                        ((C18357Rc2) getDelegate()).getMapAsync(onMapReadyCallback);
                    }
                    this.f7533h.clear();
                }
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            } catch (GooglePlayServicesNotAvailableException unused) {
            }
        }
    }
}
