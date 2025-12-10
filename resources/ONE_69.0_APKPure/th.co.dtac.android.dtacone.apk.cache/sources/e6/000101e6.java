package org.bson.codecs;

import org.bson.Transformer;
import org.bson.assertions.Assertions;
import org.bson.codecs.configuration.CodecProvider;
import org.bson.codecs.configuration.CodecRegistry;

/* loaded from: classes6.dex */
public class IterableCodecProvider implements CodecProvider {

    /* renamed from: a */
    public final BsonTypeClassMap f75924a;

    /* renamed from: b */
    public final Transformer f75925b;

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
        if (!this.f75924a.equals(iterableCodecProvider.f75924a)) {
            return false;
        }
        Transformer transformer = this.f75925b;
        Transformer transformer2 = iterableCodecProvider.f75925b;
        if (transformer == null ? transformer2 == null : transformer.equals(transformer2)) {
            return true;
        }
        return false;
    }

    @Override // org.bson.codecs.configuration.CodecProvider
    public <T> Codec<T> get(Class<T> cls, CodecRegistry codecRegistry) {
        if (Iterable.class.isAssignableFrom(cls)) {
            return new IterableCodec(codecRegistry, this.f75924a, this.f75925b);
        }
        return null;
    }

    public int hashCode() {
        int i;
        int hashCode = this.f75924a.hashCode() * 31;
        Transformer transformer = this.f75925b;
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
        this.f75924a = (BsonTypeClassMap) Assertions.notNull("bsonTypeClassMap", bsonTypeClassMap);
        this.f75925b = transformer;
    }
}