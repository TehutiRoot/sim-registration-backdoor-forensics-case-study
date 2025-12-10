package org.bson.codecs;

import org.bson.BsonReader;
import org.bson.BsonValue;
import org.bson.BsonWriter;
import org.bson.codecs.configuration.CodecRegistries;
import org.bson.codecs.configuration.CodecRegistry;

/* loaded from: classes6.dex */
public class BsonValueCodec implements Codec<BsonValue> {

    /* renamed from: a */
    public final CodecRegistry f75899a;

    public BsonValueCodec() {
        this(CodecRegistries.fromProviders(new BsonValueCodecProvider()));
    }

    @Override // org.bson.codecs.Encoder
    public Class<BsonValue> getEncoderClass() {
        return BsonValue.class;
    }

    public BsonValueCodec(CodecRegistry codecRegistry) {
        this.f75899a = codecRegistry;
    }

    @Override // org.bson.codecs.Decoder
    public BsonValue decode(BsonReader bsonReader, DecoderContext decoderContext) {
        return (BsonValue) this.f75899a.get(BsonValueCodecProvider.getClassForBsonType(bsonReader.getCurrentBsonType())).decode(bsonReader, decoderContext);
    }

    @Override // org.bson.codecs.Encoder
    public void encode(BsonWriter bsonWriter, BsonValue bsonValue, EncoderContext encoderContext) {
        encoderContext.encodeWithChildContext(this.f75899a.get(bsonValue.getClass()), bsonWriter, bsonValue);
    }
}