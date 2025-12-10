package org.bson.codecs;

import org.bson.BsonDocument;
import org.bson.BsonReader;
import org.bson.BsonWriter;
import org.bson.codecs.configuration.CodecConfigurationException;
import org.bson.codecs.configuration.CodecRegistry;
import org.bson.conversions.Bson;

/* loaded from: classes6.dex */
public class BsonCodec implements Codec<Bson> {

    /* renamed from: b */
    public static final Codec f75805b = new BsonDocumentCodec();

    /* renamed from: a */
    public final CodecRegistry f75806a;

    public BsonCodec(CodecRegistry codecRegistry) {
        this.f75806a = codecRegistry;
    }

    @Override // org.bson.codecs.Encoder
    public Class<Bson> getEncoderClass() {
        return Bson.class;
    }

    @Override // org.bson.codecs.Decoder
    public Bson decode(BsonReader bsonReader, DecoderContext decoderContext) {
        throw new UnsupportedOperationException("The BsonCodec can only encode to Bson");
    }

    @Override // org.bson.codecs.Encoder
    public void encode(BsonWriter bsonWriter, Bson bson, EncoderContext encoderContext) {
        try {
            f75805b.encode(bsonWriter, bson.toBsonDocument(BsonDocument.class, this.f75806a), encoderContext);
        } catch (Exception e) {
            throw new CodecConfigurationException(String.format("Unable to encode a Bson implementation: %s", bson), e);
        }
    }
}
