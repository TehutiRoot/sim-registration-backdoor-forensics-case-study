package org.bson.codecs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import org.bson.BsonDocument;
import org.bson.BsonDocumentWriter;
import org.bson.BsonReader;
import org.bson.BsonType;
import org.bson.BsonValue;
import org.bson.BsonWriter;
import org.bson.Document;
import org.bson.Transformer;
import org.bson.UuidRepresentation;
import org.bson.assertions.Assertions;
import org.bson.codecs.configuration.CodecRegistries;
import org.bson.codecs.configuration.CodecRegistry;

/* loaded from: classes6.dex */
public class DocumentCodec implements CollectibleCodec<Document>, OverridableUuidRepresentationCodec<Document> {

    /* renamed from: f */
    public static final CodecRegistry f75822f = CodecRegistries.fromProviders(Arrays.asList(new ValueCodecProvider(), new BsonValueCodecProvider(), new DocumentCodecProvider()));

    /* renamed from: g */
    public static final BsonTypeClassMap f75823g = new BsonTypeClassMap();

    /* renamed from: a */
    public final BsonTypeCodecMap f75824a;

    /* renamed from: b */
    public final CodecRegistry f75825b;

    /* renamed from: c */
    public final IdGenerator f75826c;

    /* renamed from: d */
    public final Transformer f75827d;

    /* renamed from: e */
    public final UuidRepresentation f75828e;

    /* renamed from: org.bson.codecs.DocumentCodec$a */
    /* loaded from: classes6.dex */
    public class C12912a implements Transformer {
        public C12912a() {
        }

        @Override // org.bson.Transformer
        public Object transform(Object obj) {
            return obj;
        }
    }

    public DocumentCodec() {
        this(f75822f);
    }

    /* renamed from: a */
    public final void m24291a(BsonWriter bsonWriter, EncoderContext encoderContext, Map map) {
        if (encoderContext.isEncodingCollectibleDocument() && map.containsKey("_id")) {
            bsonWriter.writeName("_id");
            m24285g(bsonWriter, encoderContext, map.get("_id"));
        }
    }

    /* renamed from: b */
    public final List m24290b(BsonReader bsonReader, DecoderContext decoderContext) {
        bsonReader.readStartArray();
        ArrayList arrayList = new ArrayList();
        while (bsonReader.readBsonType() != BsonType.END_OF_DOCUMENT) {
            arrayList.add(m24289c(bsonReader, decoderContext));
        }
        bsonReader.readEndArray();
        return arrayList;
    }

    /* renamed from: c */
    public final Object m24289c(BsonReader bsonReader, DecoderContext decoderContext) {
        UuidRepresentation uuidRepresentation;
        BsonType currentBsonType = bsonReader.getCurrentBsonType();
        if (currentBsonType == BsonType.NULL) {
            bsonReader.readNull();
            return null;
        } else if (currentBsonType == BsonType.ARRAY) {
            return m24290b(bsonReader, decoderContext);
        } else {
            Codec<?> codec = this.f75824a.get(currentBsonType);
            if (currentBsonType == BsonType.BINARY && bsonReader.peekBinarySize() == 16) {
                byte peekBinarySubType = bsonReader.peekBinarySubType();
                if (peekBinarySubType != 3) {
                    if (peekBinarySubType == 4 && ((uuidRepresentation = this.f75828e) == UuidRepresentation.JAVA_LEGACY || uuidRepresentation == UuidRepresentation.STANDARD)) {
                        codec = this.f75825b.get(UUID.class);
                    }
                } else {
                    UuidRepresentation uuidRepresentation2 = this.f75828e;
                    if (uuidRepresentation2 == UuidRepresentation.JAVA_LEGACY || uuidRepresentation2 == UuidRepresentation.C_SHARP_LEGACY || uuidRepresentation2 == UuidRepresentation.PYTHON_LEGACY) {
                        codec = this.f75825b.get(UUID.class);
                    }
                }
            }
            return this.f75827d.transform(codec.decode(bsonReader, decoderContext));
        }
    }

    /* renamed from: d */
    public final boolean m24288d(EncoderContext encoderContext, String str) {
        if (encoderContext.isEncodingCollectibleDocument() && str.equals("_id")) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    public final void m24287e(BsonWriter bsonWriter, Iterable iterable, EncoderContext encoderContext) {
        bsonWriter.writeStartArray();
        for (Object obj : iterable) {
            m24285g(bsonWriter, encoderContext, obj);
        }
        bsonWriter.writeEndArray();
    }

    /* renamed from: f */
    public final void m24286f(BsonWriter bsonWriter, Map map, EncoderContext encoderContext) {
        bsonWriter.writeStartDocument();
        m24291a(bsonWriter, encoderContext, map);
        for (Map.Entry entry : map.entrySet()) {
            if (!m24288d(encoderContext, (String) entry.getKey())) {
                bsonWriter.writeName((String) entry.getKey());
                m24285g(bsonWriter, encoderContext, entry.getValue());
            }
        }
        bsonWriter.writeEndDocument();
    }

    /* renamed from: g */
    public final void m24285g(BsonWriter bsonWriter, EncoderContext encoderContext, Object obj) {
        if (obj == null) {
            bsonWriter.writeNull();
        } else if (obj instanceof Iterable) {
            m24287e(bsonWriter, (Iterable) obj, encoderContext.getChildContext());
        } else if (obj instanceof Map) {
            m24286f(bsonWriter, (Map) obj, encoderContext.getChildContext());
        } else {
            encoderContext.encodeWithChildContext(this.f75825b.get(obj.getClass()), bsonWriter, obj);
        }
    }

    @Override // org.bson.codecs.Encoder
    public Class<Document> getEncoderClass() {
        return Document.class;
    }

    @Override // org.bson.codecs.OverridableUuidRepresentationCodec
    public Codec<Document> withUuidRepresentation(UuidRepresentation uuidRepresentation) {
        return new DocumentCodec(this.f75825b, this.f75824a, this.f75826c, this.f75827d, uuidRepresentation);
    }

    public DocumentCodec(CodecRegistry codecRegistry) {
        this(codecRegistry, f75823g);
    }

    @Override // org.bson.codecs.Decoder
    public Document decode(BsonReader bsonReader, DecoderContext decoderContext) {
        Document document = new Document();
        bsonReader.readStartDocument();
        while (bsonReader.readBsonType() != BsonType.END_OF_DOCUMENT) {
            document.put(bsonReader.readName(), m24289c(bsonReader, decoderContext));
        }
        bsonReader.readEndDocument();
        return document;
    }

    @Override // org.bson.codecs.CollectibleCodec
    public boolean documentHasId(Document document) {
        return document.containsKey("_id");
    }

    @Override // org.bson.codecs.Encoder
    public void encode(BsonWriter bsonWriter, Document document, EncoderContext encoderContext) {
        m24286f(bsonWriter, document, encoderContext);
    }

    @Override // org.bson.codecs.CollectibleCodec
    public Document generateIdIfAbsentFromDocument(Document document) {
        if (!documentHasId(document)) {
            document.put("_id", this.f75826c.generate());
        }
        return document;
    }

    @Override // org.bson.codecs.CollectibleCodec
    public BsonValue getDocumentId(Document document) {
        if (documentHasId(document)) {
            Object obj = document.get("_id");
            if (obj instanceof BsonValue) {
                return (BsonValue) obj;
            }
            BsonDocument bsonDocument = new BsonDocument();
            BsonDocumentWriter bsonDocumentWriter = new BsonDocumentWriter(bsonDocument);
            bsonDocumentWriter.writeStartDocument();
            bsonDocumentWriter.writeName("_id");
            m24285g(bsonDocumentWriter, EncoderContext.builder().build(), obj);
            bsonDocumentWriter.writeEndDocument();
            return bsonDocument.get((Object) "_id");
        }
        throw new IllegalStateException("The document does not contain an _id");
    }

    public DocumentCodec(CodecRegistry codecRegistry, BsonTypeClassMap bsonTypeClassMap) {
        this(codecRegistry, bsonTypeClassMap, null);
    }

    public DocumentCodec(CodecRegistry codecRegistry, BsonTypeClassMap bsonTypeClassMap, Transformer transformer) {
        this(codecRegistry, new BsonTypeCodecMap((BsonTypeClassMap) Assertions.notNull("bsonTypeClassMap", bsonTypeClassMap), codecRegistry), new ObjectIdGenerator(), transformer, UuidRepresentation.JAVA_LEGACY);
    }

    public DocumentCodec(CodecRegistry codecRegistry, BsonTypeCodecMap bsonTypeCodecMap, IdGenerator idGenerator, Transformer transformer, UuidRepresentation uuidRepresentation) {
        this.f75825b = (CodecRegistry) Assertions.notNull("registry", codecRegistry);
        this.f75824a = bsonTypeCodecMap;
        this.f75826c = idGenerator;
        this.f75827d = transformer == null ? new C12912a() : transformer;
        this.f75828e = uuidRepresentation;
    }
}
