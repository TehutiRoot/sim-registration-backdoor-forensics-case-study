package org.bson.codecs;

import org.bson.BsonInvalidOperationException;
import org.bson.BsonReader;
import org.bson.BsonWriter;

/* loaded from: classes6.dex */
public class ShortCodec implements Codec<Short> {
    @Override // org.bson.codecs.Encoder
    public Class<Short> getEncoderClass() {
        return Short.class;
    }

    @Override // org.bson.codecs.Decoder
    public Short decode(BsonReader bsonReader, DecoderContext decoderContext) {
        int m23345b = AbstractC21912rJ0.m23345b(bsonReader);
        if (m23345b >= -32768 && m23345b <= 32767) {
            return Short.valueOf((short) m23345b);
        }
        throw new BsonInvalidOperationException(String.format("%s can not be converted into a Short.", Integer.valueOf(m23345b)));
    }

    @Override // org.bson.codecs.Encoder
    public void encode(BsonWriter bsonWriter, Short sh, EncoderContext encoderContext) {
        bsonWriter.writeInt32(sh.shortValue());
    }
}
