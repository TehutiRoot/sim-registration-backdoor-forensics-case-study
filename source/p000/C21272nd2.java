package p000;

import android.os.Bundle;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.SafeParcelableSerializer;
import com.google.android.gms.wallet.callback.CallbackOutput;
import com.google.android.gms.wallet.callback.OnCompleteListener;

/* renamed from: nd2  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C21272nd2 implements OnCompleteListener {

    /* renamed from: a */
    public Messenger f72260a;

    /* renamed from: b */
    public final int f72261b;

    public C21272nd2(Messenger messenger, int i) {
        this.f72260a = messenger;
        this.f72261b = i;
    }

    @Override // com.google.android.gms.wallet.callback.OnCompleteListener
    /* renamed from: a */
    public final synchronized void complete(CallbackOutput callbackOutput) {
        boolean z;
        try {
            if (this.f72260a != null) {
                try {
                    if (callbackOutput.f48852b != 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    Preconditions.checkArgument(z, "Callback Response Status must be set - status value must be non-zero.");
                    Message obtain = Message.obtain();
                    obtain.what = 1;
                    obtain.arg1 = this.f72261b;
                    Bundle bundle = new Bundle();
                    bundle.putByteArray("extra_callback_output", SafeParcelableSerializer.serializeToBytes(callbackOutput));
                    obtain.setData(bundle);
                    Messenger messenger = this.f72260a;
                    if (messenger != null) {
                        messenger.send(obtain);
                    }
                    this.f72260a = null;
                } catch (RemoteException unused) {
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
