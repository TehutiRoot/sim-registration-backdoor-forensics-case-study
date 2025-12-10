package p000;

import com.google.android.datatransport.Encoding;
import com.google.android.datatransport.Event;
import com.google.android.datatransport.Transformer;
import com.google.android.datatransport.Transport;
import com.google.android.datatransport.TransportFactory;
import com.google.firebase.inject.Provider;
import com.google.firebase.perf.logging.AndroidLogger;
import com.google.firebase.perf.p016v1.PerfMetric;

/* renamed from: S20 */
/* loaded from: classes4.dex */
public final class S20 {

    /* renamed from: d */
    public static final AndroidLogger f5714d = AndroidLogger.getInstance();

    /* renamed from: a */
    public final String f5715a;

    /* renamed from: b */
    public final Provider f5716b;

    /* renamed from: c */
    public Transport f5717c;

    public S20(Provider provider, String str) {
        this.f5715a = str;
        this.f5716b = provider;
    }

    /* renamed from: a */
    public final boolean m66554a() {
        if (this.f5717c == null) {
            TransportFactory transportFactory = (TransportFactory) this.f5716b.get();
            if (transportFactory != null) {
                this.f5717c = transportFactory.getTransport(this.f5715a, PerfMetric.class, Encoding.m49166of("proto"), new Transformer() { // from class: R20
                    @Override // com.google.android.datatransport.Transformer
                    public final Object apply(Object obj) {
                        return ((PerfMetric) obj).toByteArray();
                    }
                });
            } else {
                f5714d.warn("Flg TransportFactory is not available at the moment");
            }
        }
        if (this.f5717c != null) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public void m66553b(PerfMetric perfMetric) {
        if (!m66554a()) {
            f5714d.warn("Unable to dispatch event because Flg Transport is not available");
        } else {
            this.f5717c.send(Event.ofData(perfMetric));
        }
    }
}