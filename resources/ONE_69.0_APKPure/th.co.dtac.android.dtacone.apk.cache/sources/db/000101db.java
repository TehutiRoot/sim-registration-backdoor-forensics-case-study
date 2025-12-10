package org.bson.codecs;

import org.bson.Document;
import org.bson.Transformer;
import org.bson.assertions.Assertions;
import org.bson.codecs.configuration.CodecProvider;
import org.bson.codecs.configuration.CodecRegistry;
import org.bson.types.CodeWithScope;

/* loaded from: classes6.dex */
public class DocumentCodecProvider implements CodecProvider {

    /* renamed from: a */
    public final BsonTypeClassMap f75914a;

    /* renamed from: b */
    public final Transformer f75915b;

    public DocumentCodecProvider() {
        this(new BsonTypeClassMap());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DocumentCodecProvider documentCodecProvider = (DocumentCodecProvider) obj;
        if (!this.f75914a.equals(documentCodecProvider.f75914a)) {
            return false;
        }
        Transformer transformer = this.f75915b;
        Transformer transformer2 = documentCodecProvider.f75915b;
        if (transformer == null ? transformer2 == null : transformer.equals(transformer2)) {
            return true;
        }
        return false;
    }

    @Override // org.bson.codecs.configuration.CodecProvider
    public <T> Codec<T> get(Class<T> cls, CodecRegistry codecRegistry) {
        if (cls == CodeWithScope.class) {
            return new CodeWithScopeCodec(codecRegistry.get(Document.class));
        }
        if (cls == Document.class) {
            return new DocumentCodec(codecRegistry, this.f75914a, this.f75915b);
        }
        return null;
    }

    public int hashCode() {
        int i;
        int hashCode = this.f75914a.hashCode() * 31;
        Transformer transformer = this.f75915b;
        if (transformer != null) {
            i = transformer.hashCode();
        } else {
            i = 0;
        }
        return hashCode + i;
    }

    public DocumentCodecProvider(Transformer transformer) {
        this(new BsonTypeClassMap(), transformer);
    }

    public DocumentCodecProvider(BsonTypeClassMap bsonTypeClassMap) {
        this(bsonTypeClassMap, null);
    }

    public DocumentCodecProvider(BsonTypeClassMap bsonTypeClassMap, Transformer transformer) {
        this.f75914a = (BsonTypeClassMap) Assertions.notNull("bsonTypeClassMap", bsonTypeClassMap);
        this.f75915b = transformer;
    }
}