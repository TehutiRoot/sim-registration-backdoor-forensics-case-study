package p000;

import android.os.Looper;
import android.os.Message;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.SafeParcelableSerializer;
import com.google.android.gms.internal.wallet.zzh;
import com.google.android.gms.wallet.callback.CallbackInput;

/* renamed from: P92 */
/* loaded from: classes4.dex */
public final class P92 extends zzh {

    /* renamed from: a */
    public final /* synthetic */ AbstractServiceC21800qh2 f4667a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public P92(AbstractServiceC21800qh2 abstractServiceC21800qh2, Looper looper) {
        super(looper);
        this.f4667a = abstractServiceC21800qh2;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        if (message.replyTo == null) {
            return;
        }
        byte[] byteArray = message.getData().getByteArray("extra_callback_input");
        Preconditions.checkNotNull(byteArray);
        CallbackInput callbackInput = (CallbackInput) SafeParcelableSerializer.deserializeFromBytes(byteArray, CallbackInput.CREATOR);
        String string = message.getData().getString("message_task_tag");
        Preconditions.checkNotNull(string);
        this.f4667a.f77041b.execute(new RunnableC22654vf2(this.f4667a, callbackInput, message.replyTo, string, message.arg1));
    }
}
