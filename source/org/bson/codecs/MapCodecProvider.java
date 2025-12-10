package org.bson.codecs;

import java.util.Map;
import org.bson.Transformer;
import org.bson.assertions.Assertions;
import org.bson.codecs.configuration.CodecProvider;
import org.bson.codecs.configuration.CodecRegistry;

/* loaded from: classes6.dex */
public class MapCodecProvider implements CodecProvider {

    /* renamed from: a */
    public final BsonTypeClassMap f75849a;

    /* renamed from: b */
    public final Transformer f75850b;

    public MapCodecProvider() {
        this(new BsonTypeClassMap());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        MapCodecProvider mapCodecProvider = (MapCodecProvider) obj;
        if (!this.f75849a.equals(mapCodecProvider.f75849a)) {
            return false;
        }
        Transformer transformer = this.f75850b;
        Transformer transformer2 = mapCodecProvider.f75850b;
        if (transformer == null ? transformer2 == null : transformer.equals(transformer2)) {
            return true;
        }
        return false;
    }

    @Override // org.bson.codecs.configuration.CodecProvider
    public <T> Codec<T> get(Class<T> cls, CodecRegistry codecRegistry) {
        if (Map.class.isAssignableFrom(cls)) {
            return new MapCodec(codecRegistry, this.f75849a, this.f75850b);
        }
        return null;
    }

    public int hashCode() {
        int i;
        int hashCode = this.f75849a.hashCode() * 31;
        Transformer transformer = this.f75850b;
        if (transformer != null) {
            i = transformer.hashCode();
        } else {
            i = 0;
        }
        return hashCode + i;
    }

    public MapCodecProvider(BsonTypeClassMap bsonTypeClassMap) {
        this(bsonTypeClassMap, null);
    }

    public MapCodecProvider(Transformer transformer) {
        this(new BsonTypeClassMap(), transformer);
    }

    public MapCodecProvider(BsonTypeClassMap bsonTypeClassMap, Transformer transformer) {
        this.f75849a = (BsonTypeClassMap) Assertions.notNull("bsonTypeClassMap", bsonTypeClassMap);
        this.f75850b = transformer;
    }
}
