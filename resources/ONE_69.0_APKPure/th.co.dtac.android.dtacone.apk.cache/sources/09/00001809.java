package p000;

import org.joda.time.format.DateTimeParser;
import org.joda.time.format.DateTimeParserBucket;

/* renamed from: ZD */
/* loaded from: classes5.dex */
public class C1789ZD implements InterfaceC18859Yf0 {

    /* renamed from: a */
    public final DateTimeParser f8124a;

    public C1789ZD(DateTimeParser dateTimeParser) {
        this.f8124a = dateTimeParser;
    }

    /* renamed from: b */
    public static InterfaceC18859Yf0 m65250b(DateTimeParser dateTimeParser) {
        if (dateTimeParser instanceof C18923Zf0) {
            return (InterfaceC18859Yf0) dateTimeParser;
        }
        if (dateTimeParser == null) {
            return null;
        }
        return new C1789ZD(dateTimeParser);
    }

    /* renamed from: a */
    public DateTimeParser m65251a() {
        return this.f8124a;
    }

    @Override // p000.InterfaceC18859Yf0
    public int estimateParsedLength() {
        return this.f8124a.estimateParsedLength();
    }

    @Override // p000.InterfaceC18859Yf0
    public int parseInto(DateTimeParserBucket dateTimeParserBucket, CharSequence charSequence, int i) {
        return this.f8124a.parseInto(dateTimeParserBucket, charSequence.toString(), i);
    }
}