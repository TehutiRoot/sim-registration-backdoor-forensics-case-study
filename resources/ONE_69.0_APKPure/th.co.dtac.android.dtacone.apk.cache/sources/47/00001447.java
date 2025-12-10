package p000;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;
import org.bson.json.Converter;
import org.bson.json.StrictJsonWriter;

/* renamed from: VH1 */
/* loaded from: classes4.dex */
public class VH1 implements Converter {
    @Override // org.bson.json.Converter
    /* renamed from: a */
    public void convert(Long l, StrictJsonWriter strictJsonWriter) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'");
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        if (l.longValue() >= -59014396800000L && l.longValue() <= 253399536000000L) {
            strictJsonWriter.writeRaw(String.format("ISODate(\"%s\")", simpleDateFormat.format(new Date(l.longValue()))));
        } else {
            strictJsonWriter.writeRaw(String.format("new Date(%d)", l));
        }
    }
}