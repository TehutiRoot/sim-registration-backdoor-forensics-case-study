package org.bson.codecs;

import org.bson.BsonReader;
import org.bson.BsonWriter;

/* loaded from: classes6.dex */
public class IntegerCodec implements Codec<Integer> {
    @Override // org.bson.codecs.Encoder
    public Class<Integer> getEncoderClass() {
        return Integer.class;
    }

    @Override // org.bson.codecs.Decoder
    public Integer decode(BsonReader bsonReader, DecoderContext decoderContext) {
        return Integer.valueOf(AbstractC21912rJ0.m23345b(bsonReader));
    }

    @Override // org.bson.codecs.Encoder
    public void encode(BsonWriter bsonWriter, Integer num, EncoderContext encoderContext) {
        bsonWriter.writeInt32(num.intValue());
    }
}
