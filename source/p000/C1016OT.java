package p000;

import org.bson.BsonMinKey;
import org.bson.json.Converter;
import org.bson.json.StrictJsonWriter;

/* renamed from: OT */
/* loaded from: classes4.dex */
public class C1016OT implements Converter {
    @Override // org.bson.json.Converter
    /* renamed from: a */
    public void convert(BsonMinKey bsonMinKey, StrictJsonWriter strictJsonWriter) {
        strictJsonWriter.writeStartObject();
        strictJsonWriter.writeNumber("$minKey", "1");
        strictJsonWriter.writeEndObject();
    }
}
