package org.apache.http.conn.util;

import java.util.Collections;
import java.util.List;
import org.apache.http.annotation.Contract;
import org.apache.http.annotation.ThreadingBehavior;
import org.apache.http.util.Args;

@Contract(threading = ThreadingBehavior.IMMUTABLE)
/* loaded from: classes6.dex */
public final class PublicSuffixList {

    /* renamed from: a */
    public final DomainType f73855a;

    /* renamed from: b */
    public final List f73856b;

    /* renamed from: c */
    public final List f73857c;

    public PublicSuffixList(DomainType domainType, List<String> list, List<String> list2) {
        this.f73855a = (DomainType) Args.notNull(domainType, "Domain type");
        this.f73856b = Collections.unmodifiableList((List) Args.notNull(list, "Domain suffix rules"));
        this.f73857c = Collections.unmodifiableList(list2 == null ? Collections.emptyList() : list2);
    }

    public List<String> getExceptions() {
        return this.f73857c;
    }

    public List<String> getRules() {
        return this.f73856b;
    }

    public DomainType getType() {
        return this.f73855a;
    }

    public PublicSuffixList(List<String> list, List<String> list2) {
        this(DomainType.UNKNOWN, list, list2);
    }
}
