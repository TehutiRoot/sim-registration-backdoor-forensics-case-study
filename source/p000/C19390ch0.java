package p000;

import org.bson.json.Converter;
import org.bson.json.StrictJsonWriter;

/* renamed from: ch0  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C19390ch0 implements Converter {
    @Override // org.bson.json.Converter
    /* renamed from: a */
    public void convert(Double d, StrictJsonWriter strictJsonWriter) {
        strictJsonWriter.writeNumber(Double.toString(d.doubleValue()));
    }
}
