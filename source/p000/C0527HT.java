package p000;

import org.bson.BsonBinary;
import org.bson.internal.Base64;
import org.bson.json.Converter;
import org.bson.json.StrictJsonWriter;

/* renamed from: HT */
/* loaded from: classes4.dex */
public class C0527HT implements Converter {
    @Override // org.bson.json.Converter
    /* renamed from: a */
    public void convert(BsonBinary bsonBinary, StrictJsonWriter strictJsonWriter) {
        strictJsonWriter.writeStartObject();
        strictJsonWriter.writeStartObject("$binary");
        strictJsonWriter.writeString("base64", Base64.encode(bsonBinary.getData()));
        strictJsonWriter.writeString("subType", String.format("%02X", Byte.valueOf(bsonBinary.getType())));
        strictJsonWriter.writeEndObject();
        strictJsonWriter.writeEndObject();
    }
}
