package p000;

import org.bson.json.Converter;
import org.bson.json.StrictJsonWriter;

/* renamed from: xh0  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C23072xh0 implements Converter {
    @Override // org.bson.json.Converter
    /* renamed from: a */
    public void convert(String str, StrictJsonWriter strictJsonWriter) {
        strictJsonWriter.writeStartObject();
        strictJsonWriter.writeString("$symbol", str);
        strictJsonWriter.writeEndObject();
    }
}