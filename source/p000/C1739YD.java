package p000;

import org.joda.time.format.DateTimeParser;
import org.joda.time.format.DateTimeParserBucket;

/* renamed from: YD */
/* loaded from: classes5.dex */
public class C1739YD implements InterfaceC18428Sf0 {

    /* renamed from: a */
    public final DateTimeParser f7709a;

    public C1739YD(DateTimeParser dateTimeParser) {
        this.f7709a = dateTimeParser;
    }

    /* renamed from: b */
    public static InterfaceC18428Sf0 m65384b(DateTimeParser dateTimeParser) {
        if (dateTimeParser instanceof C18492Tf0) {
            return (InterfaceC18428Sf0) dateTimeParser;
        }
        if (dateTimeParser == null) {
            return null;
        }
        return new C1739YD(dateTimeParser);
    }

    /* renamed from: a */
    public DateTimeParser m65385a() {
        return this.f7709a;
    }

    @Override // p000.InterfaceC18428Sf0
    public int estimateParsedLength() {
        return this.f7709a.estimateParsedLength();
    }

    @Override // p000.InterfaceC18428Sf0
    public int parseInto(DateTimeParserBucket dateTimeParserBucket, CharSequence charSequence, int i) {
        return this.f7709a.parseInto(dateTimeParserBucket, charSequence.toString(), i);
    }
}
