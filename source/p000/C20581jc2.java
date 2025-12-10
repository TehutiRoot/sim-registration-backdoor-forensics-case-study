package p000;

import android.app.Activity;
import android.app.Fragment;
import android.os.RemoteException;
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

/* renamed from: jc2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C20581jc2 extends DeferredLifecycleHelper {

    /* renamed from: e */
    public final Fragment f67314e;

    /* renamed from: f */
    public OnDelegateCreatedListener f67315f;

    /* renamed from: g */
    public Activity f67316g;

    /* renamed from: h */
    public final List f67317h = new ArrayList();

    public C20581jc2(Fragment fragment) {
        this.f67314e = fragment;
    }

    /* renamed from: g */
    public static /* synthetic */ void m29186g(C20581jc2 c20581jc2, Activity activity) {
        c20581jc2.f67316g = activity;
        c20581jc2.m29184i();
    }

    @Override // com.google.android.gms.dynamic.DeferredLifecycleHelper
    public final void createDelegate(OnDelegateCreatedListener onDelegateCreatedListener) {
        this.f67315f = onDelegateCreatedListener;
        m29184i();
    }

    /* renamed from: h */
    public final void m29185h(OnStreetViewPanoramaReadyCallback onStreetViewPanoramaReadyCallback) {
        if (getDelegate() != null) {
            ((C19721ec2) getDelegate()).getStreetViewPanoramaAsync(onStreetViewPanoramaReadyCallback);
        } else {
            this.f67317h.add(onStreetViewPanoramaReadyCallback);
        }
    }

    /* renamed from: i */
    public final void m29184i() {
        if (this.f67316g != null && this.f67315f != null && getDelegate() == null) {
            try {
                MapsInitializer.initialize(this.f67316g);
                this.f67315f.onDelegateCreated(new C19721ec2(this.f67314e, zzcc.zza(this.f67316g, null).zzh(ObjectWrapper.wrap(this.f67316g))));
                for (OnStreetViewPanoramaReadyCallback onStreetViewPanoramaReadyCallback : this.f67317h) {
                    ((C19721ec2) getDelegate()).getStreetViewPanoramaAsync(onStreetViewPanoramaReadyCallback);
                }
                this.f67317h.clear();
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            } catch (GooglePlayServicesNotAvailableException unused) {
            }
        }
    }
}
