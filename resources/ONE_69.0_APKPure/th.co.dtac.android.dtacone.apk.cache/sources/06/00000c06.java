package p000;

import org.bson.BsonRegularExpression;
import org.bson.json.Converter;
import org.bson.json.StrictJsonWriter;

/* renamed from: Mi0  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C18088Mi0 implements Converter {
    @Override // org.bson.json.Converter
    /* renamed from: a */
    public void convert(BsonRegularExpression bsonRegularExpression, StrictJsonWriter strictJsonWriter) {
        strictJsonWriter.writeStartObject();
        strictJsonWriter.writeString("$regex", bsonRegularExpression.getPattern());
        strictJsonWriter.writeString("$options", bsonRegularExpression.getOptions());
        strictJsonWriter.writeEndObject();
    }
}