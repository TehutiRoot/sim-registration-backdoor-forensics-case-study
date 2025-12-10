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

/* renamed from: CY1 */
/* loaded from: classes2.dex */
public class CY1 implements ServiceConnection {

    /* renamed from: b */
    public ResolvableFuture f765b;

    /* renamed from: c */
    public final Context f766c;

    /* renamed from: a */
    public IUnusedAppRestrictionsBackportService f764a = null;

    /* renamed from: d */
    public boolean f767d = false;

    /* renamed from: CY1$a */
    /* loaded from: classes2.dex */
    public class BinderC0192a extends IUnusedAppRestrictionsBackportCallback.Stub {
        public BinderC0192a() {
        }

        @Override // androidx.core.app.unusedapprestrictions.IUnusedAppRestrictionsBackportCallback
        public void onIsPermissionRevocationEnabledForAppResult(boolean z, boolean z2) {
            if (z) {
                if (z2) {
                    CY1.this.f765b.set(3);
                    return;
                } else {
                    CY1.this.f765b.set(2);
                    return;
                }
            }
            CY1.this.f765b.set(0);
        }
    }

    public CY1(Context context) {
        this.f766c = context;
    }

    /* renamed from: a */
    public void m68757a(ResolvableFuture resolvableFuture) {
        if (!this.f767d) {
            this.f767d = true;
            this.f765b = resolvableFuture;
            this.f766c.bindService(new Intent(UnusedAppRestrictionsBackportService.ACTION_UNUSED_APP_RESTRICTIONS_BACKPORT_CONNECTION).setPackage(PackageManagerCompat.getPermissionRevocationVerifierApp(this.f766c.getPackageManager())), this, 1);
            return;
        }
        throw new IllegalStateException("Each UnusedAppRestrictionsBackportServiceConnection can only be bound once.");
    }

    /* renamed from: b */
    public void m68756b() {
        if (this.f767d) {
            this.f767d = false;
            this.f766c.unbindService(this);
            return;
        }
        throw new IllegalStateException("bindService must be called before unbind");
    }

    /* renamed from: c */
    public final IUnusedAppRestrictionsBackportCallback m68755c() {
        return new BinderC0192a();
    }

    @Override // android.content.ServiceConnection
    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        IUnusedAppRestrictionsBackportService asInterface = IUnusedAppRestrictionsBackportService.Stub.asInterface(iBinder);
        this.f764a = asInterface;
        try {
            asInterface.isPermissionRevocationEnabledForApp(m68755c());
        } catch (RemoteException unused) {
            this.f765b.set(0);
        }
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(ComponentName componentName) {
        this.f764a = null;
    }
}
