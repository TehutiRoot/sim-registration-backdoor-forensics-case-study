package p000;

import org.bson.BsonUndefined;
import org.bson.json.Converter;
import org.bson.json.StrictJsonWriter;

/* renamed from: WT */
/* loaded from: classes4.dex */
public class C1599WT implements Converter {
    @Override // org.bson.json.Converter
    /* renamed from: a */
    public void convert(BsonUndefined bsonUndefined, StrictJsonWriter strictJsonWriter) {
        strictJsonWriter.writeStartObject();
        strictJsonWriter.writeBoolean("$undefined", true);
        strictJsonWriter.writeEndObject();
    }
}