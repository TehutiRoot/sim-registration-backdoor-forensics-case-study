package p000;

import org.bson.BsonReader;
import org.bson.BsonWriter;
import org.bson.codecs.DecoderContext;
import org.bson.codecs.EncoderContext;
import org.bson.codecs.configuration.CodecConfigurationException;
import org.bson.codecs.pojo.ClassModel;

/* renamed from: O9 */
/* loaded from: classes6.dex */
public final class C0984O9 extends AbstractC18163Nl1 {

    /* renamed from: a */
    public final AbstractC18163Nl1 f4375a;

    public C0984O9(AbstractC18163Nl1 abstractC18163Nl1) {
        this.f4375a = abstractC18163Nl1;
    }

    @Override // p000.AbstractC18163Nl1
    /* renamed from: a */
    public ClassModel mo24413a() {
        return this.f4375a.mo24413a();
    }

    @Override // org.bson.codecs.Decoder
    public Object decode(BsonReader bsonReader, DecoderContext decoderContext) {
        try {
            return this.f4375a.decode(bsonReader, decoderContext);
        } catch (CodecConfigurationException e) {
            throw new CodecConfigurationException(String.format("An exception occurred when decoding using the AutomaticPojoCodec.%nDecoding into a '%s' failed with the following exception:%n%n%s%n%nA custom Codec or PojoCodec may need to be explicitly configured and registered to handle this type.", this.f4375a.getEncoderClass().getSimpleName(), e.getMessage()), e);
        }
    }

    @Override // org.bson.codecs.Encoder
    public void encode(BsonWriter bsonWriter, Object obj, EncoderContext encoderContext) {
        try {
            this.f4375a.encode(bsonWriter, obj, encoderContext);
        } catch (CodecConfigurationException e) {
            throw new CodecConfigurationException(String.format("An exception occurred when encoding using the AutomaticPojoCodec.%nEncoding a %s: '%s' failed with the following exception:%n%n%s%n%nA custom Codec or PojoCodec may need to be explicitly configured and registered to handle this type.", getEncoderClass().getSimpleName(), obj, e.getMessage()), e);
        }
    }

    @Override // org.bson.codecs.Encoder
    public Class getEncoderClass() {
        return this.f4375a.getEncoderClass();
    }
}