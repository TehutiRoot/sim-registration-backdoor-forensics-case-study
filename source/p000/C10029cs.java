package p000;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import org.bson.BsonReader;
import org.bson.BsonType;
import org.bson.BsonWriter;
import org.bson.codecs.Codec;
import org.bson.codecs.DecoderContext;
import org.bson.codecs.EncoderContext;
import org.bson.codecs.configuration.CodecConfigurationException;
import org.bson.codecs.pojo.PropertyCodecProvider;
import org.bson.codecs.pojo.PropertyCodecRegistry;
import org.bson.codecs.pojo.TypeWithTypeParameters;

/* renamed from: cs */
/* loaded from: classes6.dex */
public final class C10029cs implements PropertyCodecProvider {

    /* renamed from: cs$a */
    /* loaded from: classes6.dex */
    public static class C10030a implements Codec {

        /* renamed from: a */
        public final Class f60987a;

        /* renamed from: b */
        public final Codec f60988b;

        public C10030a(Class cls, Codec codec) {
            this.f60987a = cls;
            this.f60988b = codec;
        }

        @Override // org.bson.codecs.Decoder
        /* renamed from: a */
        public Collection decode(BsonReader bsonReader, DecoderContext decoderContext) {
            Collection m31962c = m31962c();
            bsonReader.readStartArray();
            while (bsonReader.readBsonType() != BsonType.END_OF_DOCUMENT) {
                if (bsonReader.getCurrentBsonType() == BsonType.NULL) {
                    m31962c.add(null);
                    bsonReader.readNull();
                } else {
                    m31962c.add(this.f60988b.decode(bsonReader, decoderContext));
                }
            }
            bsonReader.readEndArray();
            return m31962c;
        }

        @Override // org.bson.codecs.Encoder
        /* renamed from: b */
        public void encode(BsonWriter bsonWriter, Collection collection, EncoderContext encoderContext) {
            bsonWriter.writeStartArray();
            for (Object obj : collection) {
                if (obj == null) {
                    bsonWriter.writeNull();
                } else {
                    this.f60988b.encode(bsonWriter, obj, encoderContext);
                }
            }
            bsonWriter.writeEndArray();
        }

        /* renamed from: c */
        public final Collection m31962c() {
            if (this.f60987a.isInterface()) {
                if (this.f60987a.isAssignableFrom(ArrayList.class)) {
                    return new ArrayList();
                }
                if (this.f60987a.isAssignableFrom(HashSet.class)) {
                    return new HashSet();
                }
                throw new CodecConfigurationException(String.format("Unsupported Collection interface of %s!", this.f60987a.getName()));
            }
            try {
                return (Collection) this.f60987a.getDeclaredConstructor(null).newInstance(null);
            } catch (Exception e) {
                throw new CodecConfigurationException(e.getMessage(), e);
            }
        }

        @Override // org.bson.codecs.Encoder
        public Class getEncoderClass() {
            return this.f60987a;
        }
    }

    @Override // org.bson.codecs.pojo.PropertyCodecProvider
    public Codec get(TypeWithTypeParameters typeWithTypeParameters, PropertyCodecRegistry propertyCodecRegistry) {
        if (Collection.class.isAssignableFrom(typeWithTypeParameters.getType()) && typeWithTypeParameters.getTypeParameters().size() == 1) {
            return new C10030a(typeWithTypeParameters.getType(), propertyCodecRegistry.get(typeWithTypeParameters.getTypeParameters().get(0)));
        }
        return null;
    }
}
