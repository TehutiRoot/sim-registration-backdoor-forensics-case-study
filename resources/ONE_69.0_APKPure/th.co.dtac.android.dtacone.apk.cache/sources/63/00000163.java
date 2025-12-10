package p000;

import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.support.customtabs.IEngagementSignalsCallback;
import androidx.browser.customtabs.EngagementSignalsCallback;

/* renamed from: BS */
/* loaded from: classes.dex */
public final class C0103BS implements EngagementSignalsCallback {

    /* renamed from: a */
    public final IEngagementSignalsCallback f400a;

    public C0103BS(IEngagementSignalsCallback iEngagementSignalsCallback) {
        this.f400a = iEngagementSignalsCallback;
    }

    /* renamed from: a */
    public static C0103BS m69102a(IBinder iBinder) {
        return new C0103BS(IEngagementSignalsCallback.Stub.asInterface(iBinder));
    }

    @Override // androidx.browser.customtabs.EngagementSignalsCallback
    public void onGreatestScrollPercentageIncreased(int i, Bundle bundle) {
        try {
            this.f400a.onGreatestScrollPercentageIncreased(i, bundle);
        } catch (RemoteException unused) {
        }
    }

    @Override // androidx.browser.customtabs.EngagementSignalsCallback
    public void onSessionEnded(boolean z, Bundle bundle) {
        try {
            this.f400a.onSessionEnded(z, bundle);
        } catch (RemoteException unused) {
        }
    }

    @Override // androidx.browser.customtabs.EngagementSignalsCallback
    public void onVerticalScrollEvent(boolean z, Bundle bundle) {
        try {
            this.f400a.onVerticalScrollEvent(z, bundle);
        } catch (RemoteException unused) {
        }
    }
}