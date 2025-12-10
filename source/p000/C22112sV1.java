package p000;

import com.google.android.datatransport.Encoding;
import com.google.android.datatransport.Transformer;
import com.google.android.datatransport.Transport;
import com.google.android.datatransport.TransportFactory;
import com.google.android.datatransport.runtime.C6281e;
import com.google.android.datatransport.runtime.TransportContext;
import java.util.Set;

/* renamed from: sV1  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C22112sV1 implements TransportFactory {

    /* renamed from: a */
    public final Set f79801a;

    /* renamed from: b */
    public final TransportContext f79802b;

    /* renamed from: c */
    public final InterfaceC22456uV1 f79803c;

    public C22112sV1(Set set, TransportContext transportContext, InterfaceC22456uV1 interfaceC22456uV1) {
        this.f79801a = set;
        this.f79802b = transportContext;
        this.f79803c = interfaceC22456uV1;
    }

    @Override // com.google.android.datatransport.TransportFactory
    public Transport getTransport(String str, Class cls, Transformer transformer) {
        return getTransport(str, cls, Encoding.m49169of("proto"), transformer);
    }

    @Override // com.google.android.datatransport.TransportFactory
    public Transport getTransport(String str, Class cls, Encoding encoding, Transformer transformer) {
        if (this.f79801a.contains(encoding)) {
            return new C6281e(this.f79802b, str, encoding, transformer, this.f79803c);
        }
        throw new IllegalArgumentException(String.format("%s is not supported byt this factory. Supported encodings are: %s.", encoding, this.f79801a));
    }
}
