package p000;

import org.bson.BsonReader;
import org.bson.BsonWriter;
import org.bson.codecs.Codec;
import org.bson.codecs.DecoderContext;
import org.bson.codecs.EncoderContext;
import org.bson.codecs.configuration.CodecRegistry;

/* renamed from: li0  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C20941li0 implements Codec {

    /* renamed from: a */
    public final CodecRegistry f71696a;

    /* renamed from: b */
    public final Class f71697b;

    /* renamed from: c */
    public volatile Codec f71698c;

    public C20941li0(CodecRegistry codecRegistry, Class cls) {
        this.f71696a = codecRegistry;
        this.f71697b = cls;
    }

    /* renamed from: a */
    public final Codec m26423a() {
        if (this.f71698c == null) {
            this.f71698c = this.f71696a.get(this.f71697b);
        }
        return this.f71698c;
    }

    @Override // org.bson.codecs.Decoder
    public Object decode(BsonReader bsonReader, DecoderContext decoderContext) {
        return m26423a().decode(bsonReader, decoderContext);
    }

    @Override // org.bson.codecs.Encoder
    public void encode(BsonWriter bsonWriter, Object obj, EncoderContext encoderContext) {
        m26423a().encode(bsonWriter, obj, encoderContext);
    }

    @Override // org.bson.codecs.Encoder
    public Class getEncoderClass() {
        return this.f71697b;
    }
}
