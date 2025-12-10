package p000;

import org.bson.json.Converter;
import org.bson.json.StrictJsonWriter;

/* renamed from: QT */
/* loaded from: classes4.dex */
public class C1160QT implements Converter {
    @Override // org.bson.json.Converter
    /* renamed from: a */
    public void convert(Long l, StrictJsonWriter strictJsonWriter) {
        strictJsonWriter.writeStartObject();
        strictJsonWriter.writeName("$numberLong");
        strictJsonWriter.writeString(Long.toString(l.longValue()));
        strictJsonWriter.writeEndObject();
    }
}