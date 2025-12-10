package p000;

import org.bson.json.Converter;
import org.bson.json.StrictJsonWriter;

/* renamed from: Zv1  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C18963Zv1 implements Converter {
    @Override // org.bson.json.Converter
    /* renamed from: a */
    public void convert(Long l, StrictJsonWriter strictJsonWriter) {
        strictJsonWriter.writeNumber(Long.toString(l.longValue()));
    }
}