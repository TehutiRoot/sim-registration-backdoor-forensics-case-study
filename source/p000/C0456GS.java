package p000;

import org.bson.BsonReader;
import org.bson.BsonWriter;
import org.bson.codecs.Codec;
import org.bson.codecs.DecoderContext;
import org.bson.codecs.EncoderContext;
import org.bson.codecs.configuration.CodecConfigurationException;
import org.bson.codecs.configuration.CodecRegistry;
import org.bson.codecs.pojo.PropertyCodecProvider;
import org.bson.codecs.pojo.PropertyCodecRegistry;
import org.bson.codecs.pojo.TypeWithTypeParameters;

/* renamed from: GS */
/* loaded from: classes6.dex */
public final class C0456GS implements PropertyCodecProvider {

    /* renamed from: a */
    public final CodecRegistry f1931a;

    /* renamed from: GS$a */
    /* loaded from: classes6.dex */
    public static class C0457a implements Codec {

        /* renamed from: a */
        public final Class f1932a;

        public C0457a(Class cls) {
            this.f1932a = cls;
        }

        @Override // org.bson.codecs.Decoder
        /* renamed from: a */
        public Enum decode(BsonReader bsonReader, DecoderContext decoderContext) {
            return Enum.valueOf(this.f1932a, bsonReader.readString());
        }

        @Override // org.bson.codecs.Encoder
        /* renamed from: b */
        public void encode(BsonWriter bsonWriter, Enum r2, EncoderContext encoderContext) {
            bsonWriter.writeString(r2.name());
        }

        @Override // org.bson.codecs.Encoder
        public Class getEncoderClass() {
            return this.f1932a;
        }
    }

    public C0456GS(CodecRegistry codecRegistry) {
        this.f1931a = codecRegistry;
    }

    @Override // org.bson.codecs.pojo.PropertyCodecProvider
    public Codec get(TypeWithTypeParameters typeWithTypeParameters, PropertyCodecRegistry propertyCodecRegistry) {
        Class type = typeWithTypeParameters.getType();
        if (Enum.class.isAssignableFrom(type)) {
            try {
                return this.f1931a.get(type);
            } catch (CodecConfigurationException unused) {
                return new C0457a(type);
            }
        }
        return null;
    }
}
