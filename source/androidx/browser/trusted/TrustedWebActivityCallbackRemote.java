package androidx.browser.trusted;

import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.support.customtabs.trusted.ITrustedWebActivityCallback;
import androidx.annotation.NonNull;

/* loaded from: classes.dex */
public class TrustedWebActivityCallbackRemote {

    /* renamed from: a */
    public final ITrustedWebActivityCallback f10220a;

    public TrustedWebActivityCallbackRemote(ITrustedWebActivityCallback iTrustedWebActivityCallback) {
        this.f10220a = iTrustedWebActivityCallback;
    }

    /* renamed from: a */
    public static TrustedWebActivityCallbackRemote m64007a(IBinder iBinder) {
        ITrustedWebActivityCallback asInterface;
        if (iBinder == null) {
            asInterface = null;
        } else {
            asInterface = ITrustedWebActivityCallback.Stub.asInterface(iBinder);
        }
        if (asInterface == null) {
            return null;
        }
        return new TrustedWebActivityCallbackRemote(asInterface);
    }

    public void runExtraCallback(@NonNull String str, @NonNull Bundle bundle) throws RemoteException {
        this.f10220a.onExtraCallback(str, bundle);
    }
}
