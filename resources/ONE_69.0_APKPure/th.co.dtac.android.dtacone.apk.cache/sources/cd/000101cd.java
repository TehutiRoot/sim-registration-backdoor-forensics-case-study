package org.bson.codecs;

import org.bson.BsonInvalidOperationException;
import org.bson.BsonReader;
import org.bson.BsonWriter;

/* loaded from: classes6.dex */
public class ByteCodec implements Codec<Byte> {
    @Override // org.bson.codecs.Encoder
    public Class<Byte> getEncoderClass() {
        return Byte.class;
    }

    @Override // org.bson.codecs.Decoder
    public Byte decode(BsonReader bsonReader, DecoderContext decoderContext) {
        int m563b = AbstractC23013xJ0.m563b(bsonReader);
        if (m563b >= -128 && m563b <= 127) {
            return Byte.valueOf((byte) m563b);
        }
        throw new BsonInvalidOperationException(String.format("%s can not be converted into a Byte.", Integer.valueOf(m563b)));
    }

    @Override // org.bson.codecs.Encoder
    public void encode(BsonWriter bsonWriter, Byte b, EncoderContext encoderContext) {
        bsonWriter.writeInt32(b.byteValue());
    }
}