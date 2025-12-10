package p000;

import java.util.concurrent.ConcurrentMap;
import org.bson.BsonReader;
import org.bson.BsonWriter;
import org.bson.codecs.Codec;
import org.bson.codecs.DecoderContext;
import org.bson.codecs.EncoderContext;
import org.bson.codecs.configuration.CodecRegistry;
import org.bson.codecs.pojo.C12925d;
import org.bson.codecs.pojo.ClassModel;
import org.bson.codecs.pojo.PropertyCodecRegistry;

/* renamed from: zi0  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C23349zi0 extends AbstractC18316Qk1 {

    /* renamed from: a */
    public final ClassModel f109155a;

    /* renamed from: b */
    public final CodecRegistry f109156b;

    /* renamed from: c */
    public final PropertyCodecRegistry f109157c;

    /* renamed from: d */
    public final C10217fJ f109158d;

    /* renamed from: e */
    public final ConcurrentMap f109159e;

    /* renamed from: f */
    public volatile C12925d f109160f;

    public C23349zi0(ClassModel classModel, CodecRegistry codecRegistry, PropertyCodecRegistry propertyCodecRegistry, C10217fJ c10217fJ, ConcurrentMap concurrentMap) {
        this.f109155a = classModel;
        this.f109156b = codecRegistry;
        this.f109157c = propertyCodecRegistry;
        this.f109158d = c10217fJ;
        this.f109159e = concurrentMap;
    }

    @Override // p000.AbstractC18316Qk1
    /* renamed from: a */
    public ClassModel mo42a() {
        return this.f109155a;
    }

    /* renamed from: b */
    public final Codec m41b() {
        if (this.f109160f == null) {
            this.f109160f = new C12925d(this.f109155a, this.f109156b, this.f109157c, this.f109158d, this.f109159e, true);
        }
        return this.f109160f;
    }

    @Override // org.bson.codecs.Decoder
    public Object decode(BsonReader bsonReader, DecoderContext decoderContext) {
        return m41b().decode(bsonReader, decoderContext);
    }

    @Override // org.bson.codecs.Encoder
    public void encode(BsonWriter bsonWriter, Object obj, EncoderContext encoderContext) {
        m41b().encode(bsonWriter, obj, encoderContext);
    }

    @Override // org.bson.codecs.Encoder
    public Class getEncoderClass() {
        return this.f109155a.getType();
    }
}
