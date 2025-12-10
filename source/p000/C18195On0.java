package p000;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.bson.codecs.Codec;
import org.bson.codecs.configuration.CodecProvider;
import org.bson.codecs.configuration.CodecRegistry;

/* renamed from: On0  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C18195On0 implements CodecProvider {

    /* renamed from: a */
    public final Map f4498a = new HashMap();

    public C18195On0(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Codec codec = (Codec) it.next();
            this.f4498a.put(codec.getEncoderClass(), codec);
        }
    }

    @Override // org.bson.codecs.configuration.CodecProvider
    public Codec get(Class cls, CodecRegistry codecRegistry) {
        return (Codec) this.f4498a.get(cls);
    }
}
