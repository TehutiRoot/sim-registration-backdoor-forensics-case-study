package p000;

import android.content.Context;
import android.os.RemoteException;
import android.view.ViewGroup;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.dynamic.DeferredLifecycleHelper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamic.OnDelegateCreatedListener;
import com.google.android.gms.maps.GoogleMapOptions;
import com.google.android.gms.maps.MapsInitializer;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.internal.IMapViewDelegate;
import com.google.android.gms.maps.internal.zzcc;
import com.google.android.gms.maps.model.RuntimeRemoteException;
import java.util.ArrayList;
import java.util.List;

/* renamed from: Mb2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C18034Mb2 extends DeferredLifecycleHelper {

    /* renamed from: e */
    public final ViewGroup f3817e;

    /* renamed from: f */
    public final Context f3818f;

    /* renamed from: g */
    public OnDelegateCreatedListener f3819g;

    /* renamed from: h */
    public final GoogleMapOptions f3820h;

    /* renamed from: i */
    public final List f3821i = new ArrayList();

    public C18034Mb2(ViewGroup viewGroup, Context context, GoogleMapOptions googleMapOptions) {
        this.f3817e = viewGroup;
        this.f3818f = context;
        this.f3820h = googleMapOptions;
    }

    @Override // com.google.android.gms.dynamic.DeferredLifecycleHelper
    public final void createDelegate(OnDelegateCreatedListener onDelegateCreatedListener) {
        this.f3819g = onDelegateCreatedListener;
        m67323h();
    }

    /* renamed from: g */
    public final void m67324g(OnMapReadyCallback onMapReadyCallback) {
        if (getDelegate() != null) {
            ((C17778Ib2) getDelegate()).getMapAsync(onMapReadyCallback);
        } else {
            this.f3821i.add(onMapReadyCallback);
        }
    }

    /* renamed from: h */
    public final void m67323h() {
        if (this.f3819g != null && getDelegate() == null) {
            try {
                MapsInitializer.initialize(this.f3818f);
                IMapViewDelegate zzg = zzcc.zza(this.f3818f, null).zzg(ObjectWrapper.wrap(this.f3818f), this.f3820h);
                if (zzg != null) {
                    this.f3819g.onDelegateCreated(new C17778Ib2(this.f3817e, zzg));
                    for (OnMapReadyCallback onMapReadyCallback : this.f3821i) {
                        ((C17778Ib2) getDelegate()).getMapAsync(onMapReadyCallback);
                    }
                    this.f3821i.clear();
                }
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            } catch (GooglePlayServicesNotAvailableException unused) {
            }
        }
    }
}
