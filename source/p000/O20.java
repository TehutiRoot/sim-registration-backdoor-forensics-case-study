package p000;

import com.google.android.datatransport.Encoding;
import com.google.android.datatransport.Event;
import com.google.android.datatransport.Transformer;
import com.google.android.datatransport.Transport;
import com.google.android.datatransport.TransportFactory;
import com.google.firebase.inject.Provider;
import com.google.firebase.perf.logging.AndroidLogger;
import com.google.firebase.perf.p016v1.PerfMetric;

/* renamed from: O20 */
/* loaded from: classes4.dex */
public final class O20 {

    /* renamed from: d */
    public static final AndroidLogger f4276d = AndroidLogger.getInstance();

    /* renamed from: a */
    public final String f4277a;

    /* renamed from: b */
    public final Provider f4278b;

    /* renamed from: c */
    public Transport f4279c;

    public O20(Provider provider, String str) {
        this.f4277a = str;
        this.f4278b = provider;
    }

    /* renamed from: a */
    public final boolean m67138a() {
        if (this.f4279c == null) {
            TransportFactory transportFactory = (TransportFactory) this.f4278b.get();
            if (transportFactory != null) {
                this.f4279c = transportFactory.getTransport(this.f4277a, PerfMetric.class, Encoding.m49169of("proto"), new Transformer() { // from class: N20
                    @Override // com.google.android.datatransport.Transformer
                    public final Object apply(Object obj) {
                        return ((PerfMetric) obj).toByteArray();
                    }
                });
            } else {
                f4276d.warn("Flg TransportFactory is not available at the moment");
            }
        }
        if (this.f4279c != null) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public void m67137b(PerfMetric perfMetric) {
        if (!m67138a()) {
            f4276d.warn("Unable to dispatch event because Flg Transport is not available");
        } else {
            this.f4279c.send(Event.ofData(perfMetric));
        }
    }
}
