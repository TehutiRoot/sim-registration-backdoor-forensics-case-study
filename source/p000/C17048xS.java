package p000;

import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.support.customtabs.IEngagementSignalsCallback;
import androidx.browser.customtabs.EngagementSignalsCallback;

/* renamed from: xS */
/* loaded from: classes.dex */
public final class C17048xS implements EngagementSignalsCallback {

    /* renamed from: a */
    public final IEngagementSignalsCallback f108371a;

    public C17048xS(IEngagementSignalsCallback iEngagementSignalsCallback) {
        this.f108371a = iEngagementSignalsCallback;
    }

    /* renamed from: a */
    public static C17048xS m508a(IBinder iBinder) {
        return new C17048xS(IEngagementSignalsCallback.Stub.asInterface(iBinder));
    }

    @Override // androidx.browser.customtabs.EngagementSignalsCallback
    public void onGreatestScrollPercentageIncreased(int i, Bundle bundle) {
        try {
            this.f108371a.onGreatestScrollPercentageIncreased(i, bundle);
        } catch (RemoteException unused) {
        }
    }

    @Override // androidx.browser.customtabs.EngagementSignalsCallback
    public void onSessionEnded(boolean z, Bundle bundle) {
        try {
            this.f108371a.onSessionEnded(z, bundle);
        } catch (RemoteException unused) {
        }
    }

    @Override // androidx.browser.customtabs.EngagementSignalsCallback
    public void onVerticalScrollEvent(boolean z, Bundle bundle) {
        try {
            this.f108371a.onVerticalScrollEvent(z, bundle);
        } catch (RemoteException unused) {
        }
    }
}
