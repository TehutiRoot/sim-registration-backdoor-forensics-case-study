package org.bson.codecs.pojo;

import java.util.HashMap;
import java.util.Map;
import org.bson.BsonReader;
import org.bson.BsonType;
import org.bson.BsonWriter;
import org.bson.codecs.Codec;
import org.bson.codecs.DecoderContext;
import org.bson.codecs.EncoderContext;
import org.bson.codecs.configuration.CodecConfigurationException;

/* renamed from: org.bson.codecs.pojo.b */
/* loaded from: classes6.dex */
public final class C12922b implements PropertyCodecProvider {

    /* renamed from: org.bson.codecs.pojo.b$a */
    /* loaded from: classes6.dex */
    public static class C12923a implements Codec {

        /* renamed from: a */
        public final Class f75916a;

        /* renamed from: b */
        public final Codec f75917b;

        public C12923a(Class cls, Codec codec) {
            this.f75916a = cls;
            this.f75917b = codec;
        }

        @Override // org.bson.codecs.Decoder
        /* renamed from: a */
        public Map decode(BsonReader bsonReader, DecoderContext decoderContext) {
            bsonReader.readStartDocument();
            Map m24235c = m24235c();
            while (bsonReader.readBsonType() != BsonType.END_OF_DOCUMENT) {
                if (bsonReader.getCurrentBsonType() == BsonType.NULL) {
                    m24235c.put(bsonReader.readName(), null);
                    bsonReader.readNull();
                } else {
                    m24235c.put(bsonReader.readName(), this.f75917b.decode(bsonReader, decoderContext));
                }
            }
            bsonReader.readEndDocument();
            return m24235c;
        }

        @Override // org.bson.codecs.Encoder
        /* renamed from: b */
        public void encode(BsonWriter bsonWriter, Map map, EncoderContext encoderContext) {
            bsonWriter.writeStartDocument();
            for (Map.Entry entry : map.entrySet()) {
                bsonWriter.writeName((String) entry.getKey());
                if (entry.getValue() == null) {
                    bsonWriter.writeNull();
                } else {
                    this.f75917b.encode(bsonWriter, entry.getValue(), encoderContext);
                }
            }
            bsonWriter.writeEndDocument();
        }

        /* renamed from: c */
        public final Map m24235c() {
            if (this.f75916a.isInterface()) {
                return new HashMap();
            }
            try {
                return (Map) this.f75916a.getDeclaredConstructor(null).newInstance(null);
            } catch (Exception e) {
                throw new CodecConfigurationException(e.getMessage(), e);
            }
        }

        @Override // org.bson.codecs.Encoder
        public Class getEncoderClass() {
            return this.f75916a;
        }
    }

    @Override // org.bson.codecs.pojo.PropertyCodecProvider
    public Codec get(TypeWithTypeParameters typeWithTypeParameters, PropertyCodecRegistry propertyCodecRegistry) {
        if (Map.class.isAssignableFrom(typeWithTypeParameters.getType()) && typeWithTypeParameters.getTypeParameters().size() == 2) {
            Class<?> type = typeWithTypeParameters.getTypeParameters().get(0).getType();
            if (type.equals(String.class)) {
                try {
                    return new C12923a(typeWithTypeParameters.getType(), propertyCodecRegistry.get(typeWithTypeParameters.getTypeParameters().get(1)));
                } catch (CodecConfigurationException e) {
                    if (typeWithTypeParameters.getTypeParameters().get(1).getType() == Object.class) {
                        try {
                            return propertyCodecRegistry.get(TypeData.m24250b(Map.class).build());
                        } catch (CodecConfigurationException unused) {
                            throw e;
                        }
                    }
                    throw e;
                }
            }
            throw new CodecConfigurationException(String.format("Invalid Map type. Maps MUST have string keys, found %s instead.", type));
        }
        return null;
    }
}
