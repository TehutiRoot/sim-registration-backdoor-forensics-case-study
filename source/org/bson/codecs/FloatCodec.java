package org.bson.codecs;

import org.bson.BsonInvalidOperationException;
import org.bson.BsonReader;
import org.bson.BsonWriter;

/* loaded from: classes6.dex */
public class FloatCodec implements Codec<Float> {
    @Override // org.bson.codecs.Encoder
    public Class<Float> getEncoderClass() {
        return Float.class;
    }

    @Override // org.bson.codecs.Decoder
    public Float decode(BsonReader bsonReader, DecoderContext decoderContext) {
        double m23346a = AbstractC21912rJ0.m23346a(bsonReader);
        if (m23346a >= -3.4028234663852886E38d && m23346a <= 3.4028234663852886E38d) {
            return Float.valueOf((float) m23346a);
        }
        throw new BsonInvalidOperationException(String.format("%s can not be converted into a Float.", Double.valueOf(m23346a)));
    }

    @Override // org.bson.codecs.Encoder
    public void encode(BsonWriter bsonWriter, Float f, EncoderContext encoderContext) {
        bsonWriter.writeDouble(f.floatValue());
    }
}
