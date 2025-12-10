package org.bson.codecs;

import java.util.HashMap;
import java.util.Map;
import org.bson.codecs.configuration.CodecProvider;
import org.bson.codecs.configuration.CodecRegistry;

/* loaded from: classes6.dex */
public class ValueCodecProvider implements CodecProvider {

    /* renamed from: a */
    public final Map f75853a = new HashMap();

    public ValueCodecProvider() {
        m24276b();
    }

    /* renamed from: a */
    private void m24277a(Codec codec) {
        this.f75853a.put(codec.getEncoderClass(), codec);
    }

    /* renamed from: b */
    private void m24276b() {
        m24277a(new BinaryCodec());
        m24277a(new BooleanCodec());
        m24277a(new DateCodec());
        m24277a(new DoubleCodec());
        m24277a(new IntegerCodec());
        m24277a(new LongCodec());
        m24277a(new MinKeyCodec());
        m24277a(new MaxKeyCodec());
        m24277a(new CodeCodec());
        m24277a(new Decimal128Codec());
        m24277a(new BigDecimalCodec());
        m24277a(new ObjectIdCodec());
        m24277a(new CharacterCodec());
        m24277a(new StringCodec());
        m24277a(new SymbolCodec());
        m24277a(new OverridableUuidRepresentationUuidCodec());
        m24277a(new ByteCodec());
        m24277a(new PatternCodec());
        m24277a(new ShortCodec());
        m24277a(new ByteArrayCodec());
        m24277a(new FloatCodec());
        m24277a(new AtomicBooleanCodec());
        m24277a(new AtomicIntegerCodec());
        m24277a(new AtomicLongCodec());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return true;
        }
        return false;
    }

    @Override // org.bson.codecs.configuration.CodecProvider
    public <T> Codec<T> get(Class<T> cls, CodecRegistry codecRegistry) {
        return (Codec) this.f75853a.get(cls);
    }

    public int hashCode() {
        return 0;
    }
}
