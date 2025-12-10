package org.bson.codecs;

import org.bson.BsonReader;
import org.bson.BsonWriter;
import org.bson.Document;
import org.bson.types.CodeWithScope;

/* loaded from: classes6.dex */
public class CodeWithScopeCodec implements Codec<CodeWithScope> {

    /* renamed from: a */
    public final Codec f75818a;

    public CodeWithScopeCodec(Codec<Document> codec) {
        this.f75818a = codec;
    }

    @Override // org.bson.codecs.Encoder
    public Class<CodeWithScope> getEncoderClass() {
        return CodeWithScope.class;
    }

    @Override // org.bson.codecs.Decoder
    public CodeWithScope decode(BsonReader bsonReader, DecoderContext decoderContext) {
        return new CodeWithScope(bsonReader.readJavaScriptWithScope(), (Document) this.f75818a.decode(bsonReader, decoderContext));
    }

    @Override // org.bson.codecs.Encoder
    public void encode(BsonWriter bsonWriter, CodeWithScope codeWithScope, EncoderContext encoderContext) {
        bsonWriter.writeJavaScriptWithScope(codeWithScope.getCode());
        this.f75818a.encode(bsonWriter, codeWithScope.getScope(), encoderContext);
    }
}
