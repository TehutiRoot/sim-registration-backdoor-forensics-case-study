package p000;

import org.bson.json.Converter;
import org.bson.json.StrictJsonWriter;

/* renamed from: gh0  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C20078gh0 implements Converter {
    @Override // org.bson.json.Converter
    /* renamed from: a */
    public void convert(Integer num, StrictJsonWriter strictJsonWriter) {
        strictJsonWriter.writeNumber(Integer.toString(num.intValue()));
    }
}
