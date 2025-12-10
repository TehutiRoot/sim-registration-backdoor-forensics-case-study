package p000;

import okhttp3.internal.http.DatesKt;
import org.bson.json.Converter;
import org.bson.json.StrictJsonWriter;

/* renamed from: av1  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C19089av1 implements Converter {

    /* renamed from: a */
    public static final Converter f38857a = new C0600IT();

    @Override // org.bson.json.Converter
    /* renamed from: a */
    public void convert(Long l, StrictJsonWriter strictJsonWriter) {
        if (l.longValue() >= 0 && l.longValue() <= DatesKt.MAX_DATE) {
            strictJsonWriter.writeStartObject();
            strictJsonWriter.writeString("$date", AbstractC1663XD.m65534a(l.longValue()));
            strictJsonWriter.writeEndObject();
            return;
        }
        f38857a.convert(l, strictJsonWriter);
    }
}
