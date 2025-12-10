package p000;

import org.bson.json.Converter;
import org.bson.json.StrictJsonWriter;

/* renamed from: LT */
/* loaded from: classes4.dex */
public class C0805LT implements Converter {
    @Override // org.bson.json.Converter
    /* renamed from: a */
    public void convert(Integer num, StrictJsonWriter strictJsonWriter) {
        strictJsonWriter.writeStartObject();
        strictJsonWriter.writeName("$numberInt");
        strictJsonWriter.writeString(Integer.toString(num.intValue()));
        strictJsonWriter.writeEndObject();
    }
}
