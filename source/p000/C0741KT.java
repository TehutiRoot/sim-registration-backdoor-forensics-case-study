package p000;

import org.bson.json.Converter;
import org.bson.json.StrictJsonWriter;

/* renamed from: KT */
/* loaded from: classes4.dex */
public class C0741KT implements Converter {
    @Override // org.bson.json.Converter
    /* renamed from: a */
    public void convert(Double d, StrictJsonWriter strictJsonWriter) {
        strictJsonWriter.writeStartObject();
        strictJsonWriter.writeName("$numberDouble");
        strictJsonWriter.writeString(Double.toString(d.doubleValue()));
        strictJsonWriter.writeEndObject();
    }
}
