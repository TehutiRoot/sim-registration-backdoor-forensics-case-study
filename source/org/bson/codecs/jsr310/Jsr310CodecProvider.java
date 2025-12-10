package org.bson.codecs.jsr310;

import java.util.HashMap;
import java.util.Map;
import org.bson.codecs.Codec;
import org.bson.codecs.configuration.CodecProvider;
import org.bson.codecs.configuration.CodecRegistry;

/* loaded from: classes6.dex */
public class Jsr310CodecProvider implements CodecProvider {

    /* renamed from: a */
    public static final Map f75855a = new HashMap();

    static {
        try {
            Class.forName("java.time.Instant");
            m24274a(new InstantCodec());
            m24274a(new LocalDateCodec());
            m24274a(new LocalDateTimeCodec());
            m24274a(new LocalTimeCodec());
        } catch (ClassNotFoundException unused) {
        }
    }

    /* renamed from: a */
    public static void m24274a(Codec codec) {
        f75855a.put(codec.getEncoderClass(), codec);
    }

    @Override // org.bson.codecs.configuration.CodecProvider
    public <T> Codec<T> get(Class<T> cls, CodecRegistry codecRegistry) {
        return (Codec) f75855a.get(cls);
    }
}
