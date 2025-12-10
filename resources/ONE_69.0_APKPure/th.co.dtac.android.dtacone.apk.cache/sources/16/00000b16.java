package p000;

import org.bson.json.Converter;
import org.bson.json.StrictJsonWriter;

/* renamed from: Li0  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C18023Li0 implements Converter {
    @Override // org.bson.json.Converter
    /* renamed from: a */
    public void convert(Long l, StrictJsonWriter strictJsonWriter) {
        strictJsonWriter.writeStartObject();
        strictJsonWriter.writeNumber("$date", Long.toString(l.longValue()));
        strictJsonWriter.writeEndObject();
    }
}