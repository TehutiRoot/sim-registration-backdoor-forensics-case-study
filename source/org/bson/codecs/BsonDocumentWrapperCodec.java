package org.bson.codecs;

import org.bson.BsonDocument;
import org.bson.BsonDocumentWrapper;
import org.bson.BsonReader;
import org.bson.BsonWriter;

/* loaded from: classes6.dex */
public class BsonDocumentWrapperCodec implements Codec<BsonDocumentWrapper> {

    /* renamed from: a */
    public final Codec f75810a;

    public BsonDocumentWrapperCodec(Codec<BsonDocument> codec) {
        this.f75810a = codec;
    }

    @Override // org.bson.codecs.Encoder
    public Class<BsonDocumentWrapper> getEncoderClass() {
        return BsonDocumentWrapper.class;
    }

    @Override // org.bson.codecs.Decoder
    public BsonDocumentWrapper decode(BsonReader bsonReader, DecoderContext decoderContext) {
        throw new UnsupportedOperationException("Decoding into a BsonDocumentWrapper is not allowed");
    }

    @Override // org.bson.codecs.Encoder
    public void encode(BsonWriter bsonWriter, BsonDocumentWrapper bsonDocumentWrapper, EncoderContext encoderContext) {
        if (bsonDocumentWrapper.isUnwrapped()) {
            this.f75810a.encode(bsonWriter, bsonDocumentWrapper, encoderContext);
        } else {
            bsonDocumentWrapper.getEncoder().encode(bsonWriter, bsonDocumentWrapper.getWrappedDocument(), encoderContext);
        }
    }
}
