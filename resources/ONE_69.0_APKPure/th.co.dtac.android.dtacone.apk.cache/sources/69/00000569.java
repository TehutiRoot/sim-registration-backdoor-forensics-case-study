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

/* renamed from: Fi0  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C17633Fi0 extends AbstractC18163Nl1 {

    /* renamed from: a */
    public final ClassModel f1751a;

    /* renamed from: b */
    public final CodecRegistry f1752b;

    /* renamed from: c */
    public final PropertyCodecRegistry f1753c;

    /* renamed from: d */
    public final C10283gJ f1754d;

    /* renamed from: e */
    public final ConcurrentMap f1755e;

    /* renamed from: f */
    public volatile C12925d f1756f;

    public C17633Fi0(ClassModel classModel, CodecRegistry codecRegistry, PropertyCodecRegistry propertyCodecRegistry, C10283gJ c10283gJ, ConcurrentMap concurrentMap) {
        this.f1751a = classModel;
        this.f1752b = codecRegistry;
        this.f1753c = propertyCodecRegistry;
        this.f1754d = c10283gJ;
        this.f1755e = concurrentMap;
    }

    @Override // p000.AbstractC18163Nl1
    /* renamed from: a */
    public ClassModel mo24413a() {
        return this.f1751a;
    }

    /* renamed from: b */
    public final Codec m68394b() {
        if (this.f1756f == null) {
            this.f1756f = new C12925d(this.f1751a, this.f1752b, this.f1753c, this.f1754d, this.f1755e, true);
        }
        return this.f1756f;
    }

    @Override // org.bson.codecs.Decoder
    public Object decode(BsonReader bsonReader, DecoderContext decoderContext) {
        return m68394b().decode(bsonReader, decoderContext);
    }

    @Override // org.bson.codecs.Encoder
    public void encode(BsonWriter bsonWriter, Object obj, EncoderContext encoderContext) {
        m68394b().encode(bsonWriter, obj, encoderContext);
    }

    @Override // org.bson.codecs.Encoder
    public Class getEncoderClass() {
        return this.f1751a.getType();
    }
}