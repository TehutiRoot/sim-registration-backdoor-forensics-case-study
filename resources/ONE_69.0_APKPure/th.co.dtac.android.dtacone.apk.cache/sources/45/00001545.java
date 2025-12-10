package p000;

import org.bson.json.Converter;
import org.bson.json.StrictJsonWriter;
import org.bson.types.Decimal128;

/* renamed from: WH1 */
/* loaded from: classes4.dex */
public class WH1 implements Converter {
    @Override // org.bson.json.Converter
    /* renamed from: a */
    public void convert(Decimal128 decimal128, StrictJsonWriter strictJsonWriter) {
        strictJsonWriter.writeRaw(String.format("NumberDecimal(\"%s\")", decimal128.toString()));
    }
}