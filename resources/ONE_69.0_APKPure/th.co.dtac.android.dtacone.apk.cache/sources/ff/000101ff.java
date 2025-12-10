package org.bson.codecs.jsr310;

import java.time.Instant;
import org.bson.BsonReader;
import org.bson.BsonWriter;
import org.bson.codecs.DecoderContext;
import org.bson.codecs.EncoderContext;
import org.bson.codecs.configuration.CodecConfigurationException;

/* loaded from: classes6.dex */
public class InstantCodec extends AbstractC1652XD {
    @Override // org.bson.codecs.Encoder
    public /* bridge */ /* synthetic */ void encode(BsonWriter bsonWriter, Object obj, EncoderContext encoderContext) {
        encode(bsonWriter, JG1.m67914a(obj), encoderContext);
    }

    @Override // org.bson.codecs.Encoder
    public Class<Instant> getEncoderClass() {
        return AbstractC20644jf0.m29499a();
    }

    @Override // org.bson.codecs.Decoder
    public Instant decode(BsonReader bsonReader, DecoderContext decoderContext) {
        Instant ofEpochMilli;
        ofEpochMilli = Instant.ofEpochMilli(m65623a(bsonReader));
        return ofEpochMilli;
    }

    public void encode(BsonWriter bsonWriter, Instant instant, EncoderContext encoderContext) {
        long epochMilli;
        try {
            epochMilli = instant.toEpochMilli();
            bsonWriter.writeDateTime(epochMilli);
        } catch (ArithmeticException e) {
            throw new CodecConfigurationException(String.format("Unsupported Instant value '%s' could not be converted to milliseconds: %s", instant, e.getMessage()), e);
        }
    }
}