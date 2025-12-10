package p000;

import org.bson.json.Converter;
import org.bson.json.StrictJsonWriter;

/* renamed from: XH1 */
/* loaded from: classes4.dex */
public class XH1 implements Converter {
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