package p000;

import android.os.Looper;
import android.os.Message;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.SafeParcelableSerializer;
import com.google.android.gms.internal.wallet.zzh;
import com.google.android.gms.wallet.callback.CallbackInput;

/* renamed from: Ma2  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class HandlerC18066Ma2 extends zzh {

    /* renamed from: a */
    public final /* synthetic */ AbstractServiceC21347ni2 f3921a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HandlerC18066Ma2(AbstractServiceC21347ni2 abstractServiceC21347ni2, Looper looper) {
        super(looper);
        this.f3921a = abstractServiceC21347ni2;
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
        this.f3921a.f72551b.execute(new RunnableC22206sg2(this.f3921a, callbackInput, message.replyTo, string, message.arg1));
    }
}