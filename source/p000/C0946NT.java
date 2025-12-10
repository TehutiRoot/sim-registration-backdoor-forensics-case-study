package p000;

import org.bson.BsonMaxKey;
import org.bson.json.Converter;
import org.bson.json.StrictJsonWriter;

/* renamed from: NT */
/* loaded from: classes4.dex */
public class C0946NT implements Converter {
    @Override // org.bson.json.Converter
    /* renamed from: a */
    public void convert(BsonMaxKey bsonMaxKey, StrictJsonWriter strictJsonWriter) {
        strictJsonWriter.writeStartObject();
        strictJsonWriter.writeNumber("$maxKey", "1");
        strictJsonWriter.writeEndObject();
    }
}
