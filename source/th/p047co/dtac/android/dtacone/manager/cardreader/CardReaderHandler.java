package th.p047co.dtac.android.dtacone.manager.cardreader;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import th.p047co.dtac.android.dtacone.manager.bus.RxBus;
import th.p047co.dtac.android.dtacone.manager.bus.event.CardDetectionEvent;

/* renamed from: th.co.dtac.android.dtacone.manager.cardreader.CardReaderHandler */
/* loaded from: classes7.dex */
public class CardReaderHandler extends Handler {

    /* renamed from: a */
    public RxBus f84822a;

    public CardReaderHandler(Looper looper, RxBus<Object> rxBus) {
        super(looper);
        this.f84822a = rxBus;
    }

    /* renamed from: a */
    public final void m19434a(int i) {
        this.f84822a.post(new CardDetectionEvent(i));
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) {
        if (message.what == 57345) {
            int i = message.arg1;
            if (i != 1 && i != 2 && i != 3 && i != 612) {
                StringBuilder sb = new StringBuilder();
                sb.append("IFD card DK status ");
                sb.append(message.arg1);
            }
            m19434a(message.arg1);
        }
    }
}
