package org.bson.codecs;

import org.bson.Transformer;
import org.bson.assertions.Assertions;
import org.bson.codecs.configuration.CodecProvider;
import org.bson.codecs.configuration.CodecRegistry;

/* loaded from: classes6.dex */
public class IterableCodecProvider implements CodecProvider {

    /* renamed from: a */
    public final BsonTypeClassMap f75840a;

    /* renamed from: b */
    public final Transformer f75841b;

    public IterableCodecProvider() {
        this(new BsonTypeClassMap());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        IterableCodecProvider iterableCodecProvider = (IterableCodecProvider) obj;
        if (!this.f75840a.equals(iterableCodecProvider.f75840a)) {
            return false;
        }
        Transformer transformer = this.f75841b;
        Transformer transformer2 = iterableCodecProvider.f75841b;
        if (transformer == null ? transformer2 == null : transformer.equals(transformer2)) {
            return true;
        }
        return false;
    }

    @Override // org.bson.codecs.configuration.CodecProvider
    public <T> Codec<T> get(Class<T> cls, CodecRegistry codecRegistry) {
        if (Iterable.class.isAssignableFrom(cls)) {
            return new IterableCodec(codecRegistry, this.f75840a, this.f75841b);
        }
        return null;
    }

    public int hashCode() {
        int i;
        int hashCode = this.f75840a.hashCode() * 31;
        Transformer transformer = this.f75841b;
        if (transformer != null) {
            i = transformer.hashCode();
        } else {
            i = 0;
        }
        return hashCode + i;
    }

    public IterableCodecProvider(Transformer transformer) {
        this(new BsonTypeClassMap(), transformer);
    }

    public IterableCodecProvider(BsonTypeClassMap bsonTypeClassMap) {
        this(bsonTypeClassMap, null);
    }

    public IterableCodecProvider(BsonTypeClassMap bsonTypeClassMap, Transformer transformer) {
        this.f75840a = (BsonTypeClassMap) Assertions.notNull("bsonTypeClassMap", bsonTypeClassMap);
        this.f75841b = transformer;
    }
}
