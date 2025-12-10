package p000;

import org.joda.time.format.DateTimeParser;
import org.joda.time.format.DateTimeParserBucket;

/* renamed from: Tf0  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C18492Tf0 implements DateTimeParser, InterfaceC18428Sf0 {

    /* renamed from: a */
    public final InterfaceC18428Sf0 f6063a;

    public C18492Tf0(InterfaceC18428Sf0 interfaceC18428Sf0) {
        this.f6063a = interfaceC18428Sf0;
    }

    /* renamed from: a */
    public static DateTimeParser m66185a(InterfaceC18428Sf0 interfaceC18428Sf0) {
        if (interfaceC18428Sf0 instanceof C1739YD) {
            return ((C1739YD) interfaceC18428Sf0).m65385a();
        }
        if (interfaceC18428Sf0 instanceof DateTimeParser) {
            return (DateTimeParser) interfaceC18428Sf0;
        }
        if (interfaceC18428Sf0 == null) {
            return null;
        }
        return new C18492Tf0(interfaceC18428Sf0);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C18492Tf0) {
            return this.f6063a.equals(((C18492Tf0) obj).f6063a);
        }
        return false;
    }

    @Override // org.joda.time.format.DateTimeParser, p000.InterfaceC18428Sf0
    public int estimateParsedLength() {
        return this.f6063a.estimateParsedLength();
    }

    @Override // p000.InterfaceC18428Sf0
    public int parseInto(DateTimeParserBucket dateTimeParserBucket, CharSequence charSequence, int i) {
        return this.f6063a.parseInto(dateTimeParserBucket, charSequence, i);
    }

    @Override // org.joda.time.format.DateTimeParser
    public int parseInto(DateTimeParserBucket dateTimeParserBucket, String str, int i) {
        return this.f6063a.parseInto(dateTimeParserBucket, str, i);
    }
}
