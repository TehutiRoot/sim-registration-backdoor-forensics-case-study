package p000;

import org.bson.BsonRegularExpression;
import org.bson.json.Converter;
import org.bson.json.StrictJsonWriter;

/* renamed from: UT */
/* loaded from: classes4.dex */
public class C1446UT implements Converter {
    @Override // org.bson.json.Converter
    /* renamed from: a */
    public void convert(BsonRegularExpression bsonRegularExpression, StrictJsonWriter strictJsonWriter) {
        strictJsonWriter.writeStartObject();
        strictJsonWriter.writeStartObject("$regularExpression");
        strictJsonWriter.writeString("pattern", bsonRegularExpression.getPattern());
        strictJsonWriter.writeString("options", bsonRegularExpression.getOptions());
        strictJsonWriter.writeEndObject();
        strictJsonWriter.writeEndObject();
    }
}