package p000;

import org.bson.json.Converter;
import org.bson.json.StrictJsonWriter;

/* renamed from: bv1  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C19261bv1 implements Converter {

    /* renamed from: a */
    public static final Converter f39274a = new C0741KT();

    @Override // org.bson.json.Converter
    /* renamed from: a */
    public void convert(Double d, StrictJsonWriter strictJsonWriter) {
        if (!d.isNaN() && !d.isInfinite()) {
            strictJsonWriter.writeNumber(Double.toString(d.doubleValue()));
        } else {
            f39274a.convert(d, strictJsonWriter);
        }
    }
}
