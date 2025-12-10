package p000;

import android.content.Context;
import android.os.RemoteException;
import android.view.ViewGroup;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.dynamic.DeferredLifecycleHelper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamic.OnDelegateCreatedListener;
import com.google.android.gms.maps.MapsInitializer;
import com.google.android.gms.maps.OnStreetViewPanoramaReadyCallback;
import com.google.android.gms.maps.StreetViewPanoramaOptions;
import com.google.android.gms.maps.internal.zzcc;
import com.google.android.gms.maps.model.RuntimeRemoteException;
import java.util.ArrayList;
import java.util.List;

/* renamed from: Bd2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C17360Bd2 extends DeferredLifecycleHelper {

    /* renamed from: e */
    public final ViewGroup f444e;

    /* renamed from: f */
    public final Context f445f;

    /* renamed from: g */
    public OnDelegateCreatedListener f446g;

    /* renamed from: h */
    public final StreetViewPanoramaOptions f447h;

    /* renamed from: i */
    public final List f448i = new ArrayList();

    public C17360Bd2(ViewGroup viewGroup, Context context, StreetViewPanoramaOptions streetViewPanoramaOptions) {
        this.f444e = viewGroup;
        this.f445f = context;
        this.f447h = streetViewPanoramaOptions;
    }

    @Override // com.google.android.gms.dynamic.DeferredLifecycleHelper
    public final void createDelegate(OnDelegateCreatedListener onDelegateCreatedListener) {
        this.f446g = onDelegateCreatedListener;
        m69093h();
    }

    /* renamed from: g */
    public final void m69094g(OnStreetViewPanoramaReadyCallback onStreetViewPanoramaReadyCallback) {
        if (getDelegate() != null) {
            ((C22716vd2) getDelegate()).getStreetViewPanoramaAsync(onStreetViewPanoramaReadyCallback);
        } else {
            this.f448i.add(onStreetViewPanoramaReadyCallback);
        }
    }

    /* renamed from: h */
    public final void m69093h() {
        if (this.f446g != null && getDelegate() == null) {
            try {
                MapsInitializer.initialize(this.f445f);
                this.f446g.onDelegateCreated(new C22716vd2(this.f444e, zzcc.zza(this.f445f, null).zzi(ObjectWrapper.wrap(this.f445f), this.f447h)));
                for (OnStreetViewPanoramaReadyCallback onStreetViewPanoramaReadyCallback : this.f448i) {
                    ((C22716vd2) getDelegate()).getStreetViewPanoramaAsync(onStreetViewPanoramaReadyCallback);
                }
                this.f448i.clear();
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            } catch (GooglePlayServicesNotAvailableException unused) {
            }
        }
    }
}