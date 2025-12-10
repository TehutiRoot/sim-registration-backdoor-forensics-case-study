package p000;

import android.app.Activity;
import android.os.RemoteException;
import androidx.fragment.app.Fragment;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.dynamic.DeferredLifecycleHelper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamic.OnDelegateCreatedListener;
import com.google.android.gms.maps.MapsInitializer;
import com.google.android.gms.maps.OnStreetViewPanoramaReadyCallback;
import com.google.android.gms.maps.internal.zzcc;
import com.google.android.gms.maps.model.RuntimeRemoteException;
import java.util.ArrayList;
import java.util.List;

/* renamed from: kd2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C20756kd2 extends DeferredLifecycleHelper {

    /* renamed from: e */
    public final Fragment f67961e;

    /* renamed from: f */
    public OnDelegateCreatedListener f67962f;

    /* renamed from: g */
    public Activity f67963g;

    /* renamed from: h */
    public final List f67964h = new ArrayList();

    public C20756kd2(Fragment fragment) {
        this.f67961e = fragment;
    }

    /* renamed from: g */
    public static /* synthetic */ void m28904g(C20756kd2 c20756kd2, Activity activity) {
        c20756kd2.f67963g = activity;
        c20756kd2.m28902i();
    }

    @Override // com.google.android.gms.dynamic.DeferredLifecycleHelper
    public final void createDelegate(OnDelegateCreatedListener onDelegateCreatedListener) {
        this.f67962f = onDelegateCreatedListener;
        m28902i();
    }

    /* renamed from: h */
    public final void m28903h(OnStreetViewPanoramaReadyCallback onStreetViewPanoramaReadyCallback) {
        if (getDelegate() != null) {
            ((C20240hd2) getDelegate()).getStreetViewPanoramaAsync(onStreetViewPanoramaReadyCallback);
        } else {
            this.f67964h.add(onStreetViewPanoramaReadyCallback);
        }
    }

    /* renamed from: i */
    public final void m28902i() {
        if (this.f67963g != null && this.f67962f != null && getDelegate() == null) {
            try {
                MapsInitializer.initialize(this.f67963g);
                this.f67962f.onDelegateCreated(new C20240hd2(this.f67961e, zzcc.zza(this.f67963g, null).zzh(ObjectWrapper.wrap(this.f67963g))));
                for (OnStreetViewPanoramaReadyCallback onStreetViewPanoramaReadyCallback : this.f67964h) {
                    ((C20240hd2) getDelegate()).getStreetViewPanoramaAsync(onStreetViewPanoramaReadyCallback);
                }
                this.f67964h.clear();
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            } catch (GooglePlayServicesNotAvailableException unused) {
            }
        }
    }
}
