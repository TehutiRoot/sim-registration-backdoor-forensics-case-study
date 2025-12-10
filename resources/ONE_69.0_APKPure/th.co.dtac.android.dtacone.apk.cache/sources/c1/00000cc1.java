package p000;

import org.bson.json.Converter;
import org.bson.json.StrictJsonWriter;
import org.bson.types.Decimal128;

/* renamed from: NT */
/* loaded from: classes4.dex */
public class C0935NT implements Converter {
    @Override // org.bson.json.Converter
    /* renamed from: a */
    public void convert(Decimal128 decimal128, StrictJsonWriter strictJsonWriter) {
        strictJsonWriter.writeStartObject();
        strictJsonWriter.writeName("$numberDecimal");
        strictJsonWriter.writeString(decimal128.toString());
        strictJsonWriter.writeEndObject();
    }
}