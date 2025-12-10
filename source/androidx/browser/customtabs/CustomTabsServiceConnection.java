package androidx.browser.customtabs;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.support.customtabs.ICustomTabsService;
import androidx.annotation.NonNull;

/* loaded from: classes.dex */
public abstract class CustomTabsServiceConnection implements ServiceConnection {

    /* renamed from: a */
    public Context f10192a;

    /* renamed from: androidx.browser.customtabs.CustomTabsServiceConnection$a */
    /* loaded from: classes.dex */
    public class C2322a extends CustomTabsClient {
        public C2322a(ICustomTabsService iCustomTabsService, ComponentName componentName, Context context) {
            super(iCustomTabsService, componentName, context);
        }
    }

    /* renamed from: a */
    public void m64036a(Context context) {
        this.f10192a = context;
    }

    public abstract void onCustomTabsServiceConnected(@NonNull ComponentName componentName, @NonNull CustomTabsClient customTabsClient);

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(@NonNull ComponentName componentName, @NonNull IBinder iBinder) {
        if (this.f10192a != null) {
            onCustomTabsServiceConnected(componentName, new C2322a(ICustomTabsService.Stub.asInterface(iBinder), componentName, this.f10192a));
            return;
        }
        throw new IllegalStateException("Custom Tabs Service connected before an applicationcontext has been provided.");
    }
}
