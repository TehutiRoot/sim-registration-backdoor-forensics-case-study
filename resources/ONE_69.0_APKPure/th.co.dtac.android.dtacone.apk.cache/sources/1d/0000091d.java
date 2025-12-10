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

/* renamed from: Jc2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C17877Jc2 extends DeferredLifecycleHelper {

    /* renamed from: e */
    public final ViewGroup f3052e;

    /* renamed from: f */
    public final Context f3053f;

    /* renamed from: g */
    public OnDelegateCreatedListener f3054g;

    /* renamed from: h */
    public final GoogleMapOptions f3055h;

    /* renamed from: i */
    public final List f3056i = new ArrayList();

    public C17877Jc2(ViewGroup viewGroup, Context context, GoogleMapOptions googleMapOptions) {
        this.f3052e = viewGroup;
        this.f3053f = context;
        this.f3055h = googleMapOptions;
    }

    @Override // com.google.android.gms.dynamic.DeferredLifecycleHelper
    public final void createDelegate(OnDelegateCreatedListener onDelegateCreatedListener) {
        this.f3054g = onDelegateCreatedListener;
        m67811h();
    }

    /* renamed from: g */
    public final void m67812g(OnMapReadyCallback onMapReadyCallback) {
        if (getDelegate() != null) {
            ((C17617Fc2) getDelegate()).getMapAsync(onMapReadyCallback);
        } else {
            this.f3056i.add(onMapReadyCallback);
        }
    }

    /* renamed from: h */
    public final void m67811h() {
        if (this.f3054g != null && getDelegate() == null) {
            try {
                MapsInitializer.initialize(this.f3053f);
                IMapViewDelegate zzg = zzcc.zza(this.f3053f, null).zzg(ObjectWrapper.wrap(this.f3053f), this.f3055h);
                if (zzg != null) {
                    this.f3054g.onDelegateCreated(new C17617Fc2(this.f3052e, zzg));
                    for (OnMapReadyCallback onMapReadyCallback : this.f3056i) {
                        ((C17617Fc2) getDelegate()).getMapAsync(onMapReadyCallback);
                    }
                    this.f3056i.clear();
                }
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            } catch (GooglePlayServicesNotAvailableException unused) {
            }
        }
    }
}