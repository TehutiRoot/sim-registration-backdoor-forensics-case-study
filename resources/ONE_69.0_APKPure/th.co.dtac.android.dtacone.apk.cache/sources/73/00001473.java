package p000;

import org.bouncycastle.asn1.cmc.BodyPartID;
import org.bson.BsonTimestamp;
import org.bson.internal.UnsignedLongs;
import org.bson.json.Converter;
import org.bson.json.StrictJsonWriter;

/* renamed from: VT */
/* loaded from: classes4.dex */
public class C1520VT implements Converter {
    @Override // org.bson.json.Converter
    /* renamed from: a */
    public void convert(BsonTimestamp bsonTimestamp, StrictJsonWriter strictJsonWriter) {
        strictJsonWriter.writeStartObject();
        strictJsonWriter.writeStartObject("$timestamp");
        strictJsonWriter.writeNumber("t", UnsignedLongs.toString(m65983b(bsonTimestamp.getTime())));
        strictJsonWriter.writeNumber("i", UnsignedLongs.toString(m65983b(bsonTimestamp.getInc())));
        strictJsonWriter.writeEndObject();
        strictJsonWriter.writeEndObject();
    }

    /* renamed from: b */
    public final long m65983b(int i) {
        return i & BodyPartID.bodyIdMax;
    }
}