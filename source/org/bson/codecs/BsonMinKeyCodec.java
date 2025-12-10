package org.bson.codecs;

import org.bson.BsonMinKey;
import org.bson.BsonReader;
import org.bson.BsonWriter;

/* loaded from: classes6.dex */
public class BsonMinKeyCodec implements Codec<BsonMinKey> {
    @Override // org.bson.codecs.Encoder
    public Class<BsonMinKey> getEncoderClass() {
        return BsonMinKey.class;
    }

    @Override // org.bson.codecs.Decoder
    public BsonMinKey decode(BsonReader bsonReader, DecoderContext decoderContext) {
        bsonReader.readMinKey();
        return new BsonMinKey();
    }

    @Override // org.bson.codecs.Encoder
    public void encode(BsonWriter bsonWriter, BsonMinKey bsonMinKey, EncoderContext encoderContext) {
        bsonWriter.writeMinKey();
    }
}
