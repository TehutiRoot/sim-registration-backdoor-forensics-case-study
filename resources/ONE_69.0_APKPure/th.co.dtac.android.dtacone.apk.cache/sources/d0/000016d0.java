package p000;

import okhttp3.internal.http.DatesKt;
import org.bson.json.Converter;
import org.bson.json.StrictJsonWriter;

/* renamed from: Xv1  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C18835Xv1 implements Converter {

    /* renamed from: a */
    public static final Converter f7703a = new C0867MT();

    @Override // org.bson.json.Converter
    /* renamed from: a */
    public void convert(Long l, StrictJsonWriter strictJsonWriter) {
        if (l.longValue() >= 0 && l.longValue() <= DatesKt.MAX_DATE) {
            strictJsonWriter.writeStartObject();
            strictJsonWriter.writeString("$date", AbstractC1721YD.m65488a(l.longValue()));
            strictJsonWriter.writeEndObject();
            return;
        }
        f7703a.convert(l, strictJsonWriter);
    }
}