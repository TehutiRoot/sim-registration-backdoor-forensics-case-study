package th.p047co.dtac.android.dtacone.manager.bus.event;

/* renamed from: th.co.dtac.android.dtacone.manager.bus.event.ReaderStatusEvent */
/* loaded from: classes7.dex */
public class ReaderStatusEvent {
    public static final int CONNECTED = 1;
    public static final int CONNECTION_ERROR = 3;
    public static final int DISCONNECT = 2;
    public static final int POWER_ERROR = 6;
    public static final int POWER_OFF = 5;
    public static final int POWER_ON = 4;

    /* renamed from: a */
    public int f84919a;

    public ReaderStatusEvent(int i) {
        this.f84919a = i;
    }

    public int getStatus() {
        return this.f84919a;
    }
}