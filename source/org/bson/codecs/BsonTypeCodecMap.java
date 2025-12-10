package org.bson.codecs;

import org.bson.BsonType;
import org.bson.assertions.Assertions;
import org.bson.codecs.configuration.CodecConfigurationException;
import org.bson.codecs.configuration.CodecRegistry;

/* loaded from: classes6.dex */
public class BsonTypeCodecMap {

    /* renamed from: a */
    public final BsonTypeClassMap f75813a;

    /* renamed from: b */
    public final Codec[] f75814b = new Codec[256];

    public BsonTypeCodecMap(BsonTypeClassMap bsonTypeClassMap, CodecRegistry codecRegistry) {
        this.f75813a = (BsonTypeClassMap) Assertions.notNull("bsonTypeClassMap", bsonTypeClassMap);
        Assertions.notNull("codecRegistry", codecRegistry);
        for (BsonType bsonType : bsonTypeClassMap.m24294b()) {
            Class<?> cls = bsonTypeClassMap.get(bsonType);
            if (cls != null) {
                try {
                    this.f75814b[bsonType.getValue()] = codecRegistry.get(cls);
                } catch (CodecConfigurationException unused) {
                }
            }
        }
    }

    public Codec<?> get(BsonType bsonType) {
        Codec<?> codec = this.f75814b[bsonType.getValue()];
        if (codec == null) {
            Class<?> cls = this.f75813a.get(bsonType);
            if (cls == null) {
                throw new CodecConfigurationException(String.format("No class mapped for BSON type %s.", bsonType));
            }
            throw new CodecConfigurationException(String.format("Can't find a codec for %s.", cls));
        }
        return codec;
    }
}
