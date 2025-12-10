package p000;

import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.cloudmessaging.zzd;
import java.util.Objects;

/* renamed from: FJ2 */
/* loaded from: classes3.dex */
public final class FJ2 {

    /* renamed from: a */
    public final Messenger f1655a;

    /* renamed from: b */
    public final zzd f1656b;

    public FJ2(IBinder iBinder) {
        String interfaceDescriptor = iBinder.getInterfaceDescriptor();
        if (Objects.equals(interfaceDescriptor, "android.os.IMessenger")) {
            this.f1655a = new Messenger(iBinder);
            this.f1656b = null;
        } else if (Objects.equals(interfaceDescriptor, "com.google.android.gms.iid.IMessengerCompat")) {
            this.f1656b = new zzd(iBinder);
            this.f1655a = null;
        } else {
            Log.w("MessengerIpcClient", "Invalid interface descriptor: ".concat(String.valueOf(interfaceDescriptor)));
            throw new RemoteException();
        }
    }

    /* renamed from: a */
    public final void m68430a(Message message) {
        Messenger messenger = this.f1655a;
        if (messenger != null) {
            messenger.send(message);
            return;
        }
        zzd zzdVar = this.f1656b;
        if (zzdVar != null) {
            zzdVar.zzb(message);
            return;
        }
        throw new IllegalStateException("Both messengers are null");
    }
}