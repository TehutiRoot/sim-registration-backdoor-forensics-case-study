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
    public final ConcurrentMap f73025a = new ConcurrentHashMap();

    /* renamed from: a */
    public boolean m25952a(Class cls) {
        return this.f73025a.containsKey(cls);
    }

    /* renamed from: b */
    public Codec m25951b(Class cls) {
        if (this.f73025a.containsKey(cls)) {
            Optional optional = (Optional) this.f73025a.get(cls);
            if (!optional.isEmpty()) {
                return (Codec) optional.get();
            }
        }
        throw new CodecConfigurationException(String.format("Can't find a codec for %s.", cls));
    }

    /* renamed from: c */
    public void m25950c(Class cls, Codec codec) {
        this.f73025a.put(cls, Optional.m24383of(codec));
    }
}