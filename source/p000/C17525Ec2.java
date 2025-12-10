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

/* renamed from: Ec2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C17525Ec2 extends DeferredLifecycleHelper {

    /* renamed from: e */
    public final ViewGroup f1335e;

    /* renamed from: f */
    public final Context f1336f;

    /* renamed from: g */
    public OnDelegateCreatedListener f1337g;

    /* renamed from: h */
    public final StreetViewPanoramaOptions f1338h;

    /* renamed from: i */
    public final List f1339i = new ArrayList();

    public C17525Ec2(ViewGroup viewGroup, Context context, StreetViewPanoramaOptions streetViewPanoramaOptions) {
        this.f1335e = viewGroup;
        this.f1336f = context;
        this.f1338h = streetViewPanoramaOptions;
    }

    @Override // com.google.android.gms.dynamic.DeferredLifecycleHelper
    public final void createDelegate(OnDelegateCreatedListener onDelegateCreatedListener) {
        this.f1337g = onDelegateCreatedListener;
        m68477h();
    }

    /* renamed from: g */
    public final void m68478g(OnStreetViewPanoramaReadyCallback onStreetViewPanoramaReadyCallback) {
        if (getDelegate() != null) {
            ((C23161yc2) getDelegate()).getStreetViewPanoramaAsync(onStreetViewPanoramaReadyCallback);
        } else {
            this.f1339i.add(onStreetViewPanoramaReadyCallback);
        }
    }

    /* renamed from: h */
    public final void m68477h() {
        if (this.f1337g != null && getDelegate() == null) {
            try {
                MapsInitializer.initialize(this.f1336f);
                this.f1337g.onDelegateCreated(new C23161yc2(this.f1335e, zzcc.zza(this.f1336f, null).zzi(ObjectWrapper.wrap(this.f1336f), this.f1338h)));
                for (OnStreetViewPanoramaReadyCallback onStreetViewPanoramaReadyCallback : this.f1339i) {
                    ((C23161yc2) getDelegate()).getStreetViewPanoramaAsync(onStreetViewPanoramaReadyCallback);
                }
                this.f1339i.clear();
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            } catch (GooglePlayServicesNotAvailableException unused) {
            }
        }
    }
}
