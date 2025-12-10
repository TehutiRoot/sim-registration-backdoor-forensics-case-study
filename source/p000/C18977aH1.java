package p000;

import org.bson.json.Converter;
import org.bson.json.StrictJsonWriter;

/* renamed from: aH1  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C18977aH1 implements Converter {
    @Override // org.bson.json.Converter
    /* renamed from: a */
    public void convert(Long l, StrictJsonWriter strictJsonWriter) {
        if (l.longValue() >= -2147483648L && l.longValue() <= 2147483647L) {
            strictJsonWriter.writeRaw(String.format("NumberLong(%d)", l));
        } else {
            strictJsonWriter.writeRaw(String.format("NumberLong(\"%d\")", l));
        }
    }
}
