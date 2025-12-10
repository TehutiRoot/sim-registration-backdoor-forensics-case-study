package org.bson.codecs;

import java.util.ArrayList;
import java.util.Map;
import org.bson.BsonDocument;
import org.bson.BsonElement;
import org.bson.BsonObjectId;
import org.bson.BsonReader;
import org.bson.BsonType;
import org.bson.BsonValue;
import org.bson.BsonWriter;
import org.bson.codecs.configuration.CodecRegistries;
import org.bson.codecs.configuration.CodecRegistry;
import org.bson.types.ObjectId;

/* loaded from: classes6.dex */
public class BsonDocumentCodec implements CollectibleCodec<BsonDocument> {

    /* renamed from: c */
    public static final CodecRegistry f75807c = CodecRegistries.fromProviders(new BsonValueCodecProvider());

    /* renamed from: a */
    public final CodecRegistry f75808a;

    /* renamed from: b */
    public final BsonTypeCodecMap f75809b;

    public BsonDocumentCodec() {
        this(f75807c);
    }

    /* renamed from: b */
    private boolean m24297b(EncoderContext encoderContext, String str) {
        if (encoderContext.isEncodingCollectibleDocument() && str.equals("_id")) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final void m24298a(BsonWriter bsonWriter, EncoderContext encoderContext, BsonDocument bsonDocument) {
        if (encoderContext.isEncodingCollectibleDocument() && bsonDocument.containsKey("_id")) {
            bsonWriter.writeName("_id");
            m24296c(bsonWriter, encoderContext, bsonDocument.get("_id"));
        }
    }

    /* renamed from: c */
    public final void m24296c(BsonWriter bsonWriter, EncoderContext encoderContext, BsonValue bsonValue) {
        encoderContext.encodeWithChildContext(this.f75808a.get(bsonValue.getClass()), bsonWriter, bsonValue);
    }

    public CodecRegistry getCodecRegistry() {
        return this.f75808a;
    }

    @Override // org.bson.codecs.Encoder
    public Class<BsonDocument> getEncoderClass() {
        return BsonDocument.class;
    }

    public BsonValue readValue(BsonReader bsonReader, DecoderContext decoderContext) {
        return (BsonValue) this.f75809b.get(bsonReader.getCurrentBsonType()).decode(bsonReader, decoderContext);
    }

    public BsonDocumentCodec(CodecRegistry codecRegistry) {
        if (codecRegistry != null) {
            this.f75808a = codecRegistry;
            this.f75809b = new BsonTypeCodecMap(BsonValueCodecProvider.getBsonTypeClassMap(), codecRegistry);
            return;
        }
        throw new IllegalArgumentException("Codec registry can not be null");
    }

    @Override // org.bson.codecs.Decoder
    public BsonDocument decode(BsonReader bsonReader, DecoderContext decoderContext) {
        ArrayList arrayList = new ArrayList();
        bsonReader.readStartDocument();
        while (bsonReader.readBsonType() != BsonType.END_OF_DOCUMENT) {
            arrayList.add(new BsonElement(bsonReader.readName(), readValue(bsonReader, decoderContext)));
        }
        bsonReader.readEndDocument();
        return new BsonDocument(arrayList);
    }

    @Override // org.bson.codecs.CollectibleCodec
    public boolean documentHasId(BsonDocument bsonDocument) {
        return bsonDocument.containsKey("_id");
    }

    @Override // org.bson.codecs.Encoder
    public void encode(BsonWriter bsonWriter, BsonDocument bsonDocument, EncoderContext encoderContext) {
        bsonWriter.writeStartDocument();
        m24298a(bsonWriter, encoderContext, bsonDocument);
        for (Map.Entry<String, BsonValue> entry : bsonDocument.entrySet()) {
            if (!m24297b(encoderContext, entry.getKey())) {
                bsonWriter.writeName(entry.getKey());
                m24296c(bsonWriter, encoderContext, entry.getValue());
            }
        }
        bsonWriter.writeEndDocument();
    }

    @Override // org.bson.codecs.CollectibleCodec
    public BsonDocument generateIdIfAbsentFromDocument(BsonDocument bsonDocument) {
        if (!documentHasId(bsonDocument)) {
            bsonDocument.put("_id", (BsonValue) new BsonObjectId(new ObjectId()));
        }
        return bsonDocument;
    }

    @Override // org.bson.codecs.CollectibleCodec
    public BsonValue getDocumentId(BsonDocument bsonDocument) {
        return bsonDocument.get("_id");
    }
}
