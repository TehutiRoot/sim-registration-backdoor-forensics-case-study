package p000;

import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.cloudmessaging.zzd;
import java.util.Objects;

/* renamed from: II2 */
/* loaded from: classes3.dex */
public final class II2 {

    /* renamed from: a */
    public final Messenger f2480a;

    /* renamed from: b */
    public final zzd f2481b;

    public II2(IBinder iBinder) {
        String interfaceDescriptor = iBinder.getInterfaceDescriptor();
        if (Objects.equals(interfaceDescriptor, "android.os.IMessenger")) {
            this.f2480a = new Messenger(iBinder);
            this.f2481b = null;
        } else if (Objects.equals(interfaceDescriptor, "com.google.android.gms.iid.IMessengerCompat")) {
            this.f2481b = new zzd(iBinder);
            this.f2480a = null;
        } else {
            Log.w("MessengerIpcClient", "Invalid interface descriptor: ".concat(String.valueOf(interfaceDescriptor)));
            throw new RemoteException();
        }
    }

    /* renamed from: a */
    public final void m67919a(Message message) {
        Messenger messenger = this.f2480a;
        if (messenger != null) {
            messenger.send(message);
            return;
        }
        zzd zzdVar = this.f2481b;
        if (zzdVar != null) {
            zzdVar.zzb(message);
            return;
        }
        throw new IllegalStateException("Both messengers are null");
    }
}
