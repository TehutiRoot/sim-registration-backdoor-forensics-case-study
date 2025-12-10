package p000;

import org.bson.BsonReader;
import org.bson.BsonWriter;
import org.bson.codecs.Codec;
import org.bson.codecs.DecoderContext;
import org.bson.codecs.EncoderContext;
import org.bson.codecs.configuration.CodecRegistry;

/* renamed from: ri0  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C22037ri0 implements Codec {

    /* renamed from: a */
    public final CodecRegistry f77604a;

    /* renamed from: b */
    public final Class f77605b;

    /* renamed from: c */
    public volatile Codec f77606c;

    public C22037ri0(CodecRegistry codecRegistry, Class cls) {
        this.f77604a = codecRegistry;
        this.f77605b = cls;
    }

    /* renamed from: a */
    public final Codec m23457a() {
        if (this.f77606c == null) {
            this.f77606c = this.f77604a.get(this.f77605b);
        }
        return this.f77606c;
    }

    @Override // org.bson.codecs.Decoder
    public Object decode(BsonReader bsonReader, DecoderContext decoderContext) {
        return m23457a().decode(bsonReader, decoderContext);
    }

    @Override // org.bson.codecs.Encoder
    public void encode(BsonWriter bsonWriter, Object obj, EncoderContext encoderContext) {
        m23457a().encode(bsonWriter, obj, encoderContext);
    }

    @Override // org.bson.codecs.Encoder
    public Class getEncoderClass() {
        return this.f77605b;
    }
}