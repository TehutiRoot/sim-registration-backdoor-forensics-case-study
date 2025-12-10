package org.bson.codecs;

import org.bson.BsonReader;
import org.bson.BsonWriter;

/* loaded from: classes6.dex */
public class DoubleCodec implements Codec<Double> {
    @Override // org.bson.codecs.Encoder
    public Class<Double> getEncoderClass() {
        return Double.class;
    }

    @Override // org.bson.codecs.Decoder
    public Double decode(BsonReader bsonReader, DecoderContext decoderContext) {
        return Double.valueOf(AbstractC21912rJ0.m23346a(bsonReader));
    }

    @Override // org.bson.codecs.Encoder
    public void encode(BsonWriter bsonWriter, Double d, EncoderContext encoderContext) {
        bsonWriter.writeDouble(d.doubleValue());
    }
}
