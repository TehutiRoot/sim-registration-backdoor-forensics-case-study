package p000;

import org.bson.json.Converter;
import org.bson.json.StrictJsonWriter;

/* renamed from: IT */
/* loaded from: classes4.dex */
public class C0600IT implements Converter {
    @Override // org.bson.json.Converter
    /* renamed from: a */
    public void convert(Long l, StrictJsonWriter strictJsonWriter) {
        strictJsonWriter.writeStartObject();
        strictJsonWriter.writeStartObject("$date");
        strictJsonWriter.writeString("$numberLong", Long.toString(l.longValue()));
        strictJsonWriter.writeEndObject();
        strictJsonWriter.writeEndObject();
    }
}
