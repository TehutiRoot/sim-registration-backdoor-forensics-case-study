package p000;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import org.bson.codecs.Codec;
import org.bson.codecs.configuration.CodecConfigurationException;
import org.bson.internal.Optional;

/* renamed from: oq */
/* loaded from: classes6.dex */
public final class C12476oq {

    /* renamed from: a */
    public final ConcurrentMap f72942a = new ConcurrentHashMap();

    /* renamed from: a */
    public boolean m25779a(Class cls) {
        return this.f72942a.containsKey(cls);
    }

    /* renamed from: b */
    public Codec m25778b(Class cls) {
        if (this.f72942a.containsKey(cls)) {
            Optional optional = (Optional) this.f72942a.get(cls);
            if (!optional.isEmpty()) {
                return (Codec) optional.get();
            }
        }
        throw new CodecConfigurationException(String.format("Can't find a codec for %s.", cls));
    }

    /* renamed from: c */
    public void m25777c(Class cls, Codec codec) {
        this.f72942a.put(cls, Optional.m24194of(codec));
    }
}
