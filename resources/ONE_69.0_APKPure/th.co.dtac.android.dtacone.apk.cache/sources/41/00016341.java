package p000;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.RemoteException;
import androidx.concurrent.futures.ResolvableFuture;
import androidx.core.app.unusedapprestrictions.IUnusedAppRestrictionsBackportCallback;
import androidx.core.app.unusedapprestrictions.IUnusedAppRestrictionsBackportService;
import androidx.core.content.PackageManagerCompat;
import androidx.core.content.UnusedAppRestrictionsBackportService;

/* renamed from: zZ1  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class ServiceConnectionC23396zZ1 implements ServiceConnection {

    /* renamed from: b */
    public ResolvableFuture f109418b;

    /* renamed from: c */
    public final Context f109419c;

    /* renamed from: a */
    public IUnusedAppRestrictionsBackportService f109417a = null;

    /* renamed from: d */
    public boolean f109420d = false;

    /* renamed from: zZ1$a */
    /* loaded from: classes2.dex */
    public class BinderC17228a extends IUnusedAppRestrictionsBackportCallback.Stub {
        public BinderC17228a() {
        }

        @Override // androidx.core.app.unusedapprestrictions.IUnusedAppRestrictionsBackportCallback
        public void onIsPermissionRevocationEnabledForAppResult(boolean z, boolean z2) {
            if (z) {
                if (z2) {
                    ServiceConnectionC23396zZ1.this.f109418b.set(3);
                    return;
                } else {
                    ServiceConnectionC23396zZ1.this.f109418b.set(2);
                    return;
                }
            }
            ServiceConnectionC23396zZ1.this.f109418b.set(0);
        }
    }

    public ServiceConnectionC23396zZ1(Context context) {
        this.f109419c = context;
    }

    /* renamed from: a */
    public void m105a(ResolvableFuture resolvableFuture) {
        if (!this.f109420d) {
            this.f109420d = true;
            this.f109418b = resolvableFuture;
            this.f109419c.bindService(new Intent(UnusedAppRestrictionsBackportService.ACTION_UNUSED_APP_RESTRICTIONS_BACKPORT_CONNECTION).setPackage(PackageManagerCompat.getPermissionRevocationVerifierApp(this.f109419c.getPackageManager())), this, 1);
            return;
        }
        throw new IllegalStateException("Each UnusedAppRestrictionsBackportServiceConnection can only be bound once.");
    }

    /* renamed from: b */
    public void m104b() {
        if (this.f109420d) {
            this.f109420d = false;
            this.f109419c.unbindService(this);
            return;
        }
        throw new IllegalStateException("bindService must be called before unbind");
    }

    /* renamed from: c */
    public final IUnusedAppRestrictionsBackportCallback m103c() {
        return new BinderC17228a();
    }

    @Override // android.content.ServiceConnection
    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        IUnusedAppRestrictionsBackportService asInterface = IUnusedAppRestrictionsBackportService.Stub.asInterface(iBinder);
        this.f109417a = asInterface;
        try {
            asInterface.isPermissionRevocationEnabledForApp(m103c());
        } catch (RemoteException unused) {
            this.f109418b.set(0);
        }
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(ComponentName componentName) {
        this.f109417a = null;
    }
}