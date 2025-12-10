package org.bson.codecs;

import org.bson.BsonDocument;
import org.bson.BsonJavaScriptWithScope;
import org.bson.BsonReader;
import org.bson.BsonWriter;

/* loaded from: classes6.dex */
public class BsonJavaScriptWithScopeCodec implements Codec<BsonJavaScriptWithScope> {

    /* renamed from: a */
    public final Codec f75811a;

    public BsonJavaScriptWithScopeCodec(Codec<BsonDocument> codec) {
        this.f75811a = codec;
    }

    @Override // org.bson.codecs.Encoder
    public Class<BsonJavaScriptWithScope> getEncoderClass() {
        return BsonJavaScriptWithScope.class;
    }

    @Override // org.bson.codecs.Decoder
    public BsonJavaScriptWithScope decode(BsonReader bsonReader, DecoderContext decoderContext) {
        return new BsonJavaScriptWithScope(bsonReader.readJavaScriptWithScope(), (BsonDocument) this.f75811a.decode(bsonReader, decoderContext));
    }

    @Override // org.bson.codecs.Encoder
    public void encode(BsonWriter bsonWriter, BsonJavaScriptWithScope bsonJavaScriptWithScope, EncoderContext encoderContext) {
        bsonWriter.writeJavaScriptWithScope(bsonJavaScriptWithScope.getCode());
        this.f75811a.encode(bsonWriter, bsonJavaScriptWithScope.getScope(), encoderContext);
    }
}
