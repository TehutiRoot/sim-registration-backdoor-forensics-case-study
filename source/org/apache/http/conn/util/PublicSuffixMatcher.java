package org.apache.http.conn.util;

import java.net.IDN;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.apache.http.annotation.Contract;
import org.apache.http.annotation.ThreadingBehavior;
import org.apache.http.util.Args;

@Contract(threading = ThreadingBehavior.SAFE)
/* loaded from: classes6.dex */
public final class PublicSuffixMatcher {

    /* renamed from: a */
    public final Map f73858a;

    /* renamed from: b */
    public final Map f73859b;

    public PublicSuffixMatcher(Collection<String> collection, Collection<String> collection2) {
        this(DomainType.UNKNOWN, collection, collection2);
    }

    /* renamed from: a */
    public static DomainType m24774a(Map map, String str) {
        if (map == null) {
            return null;
        }
        return (DomainType) map.get(str);
    }

    /* renamed from: b */
    public static boolean m24773b(DomainType domainType, DomainType domainType2) {
        if (domainType != null && (domainType2 == null || domainType.equals(domainType2))) {
            return true;
        }
        return false;
    }

    public String getDomainRoot(String str) {
        return getDomainRoot(str, null);
    }

    public boolean matches(String str) {
        return matches(str, null);
    }

    public PublicSuffixMatcher(DomainType domainType, Collection<String> collection, Collection<String> collection2) {
        Args.notNull(domainType, "Domain type");
        Args.notNull(collection, "Domain suffix rules");
        this.f73858a = new ConcurrentHashMap(collection.size());
        for (String str : collection) {
            this.f73858a.put(str, domainType);
        }
        this.f73859b = new ConcurrentHashMap();
        if (collection2 != null) {
            for (String str2 : collection2) {
                this.f73859b.put(str2, domainType);
            }
        }
    }

    public String getDomainRoot(String str, DomainType domainType) {
        if (str == null || str.startsWith(".")) {
            return null;
        }
        String normalize = DnsUtils.normalize(str);
        String str2 = null;
        while (normalize != null) {
            String unicode = IDN.toUnicode(normalize);
            if (m24773b(m24774a(this.f73859b, unicode), domainType)) {
                return normalize;
            }
            DomainType m24774a = m24774a(this.f73858a, unicode);
            if (m24773b(m24774a, domainType)) {
                return m24774a == DomainType.PRIVATE ? normalize : str2;
            }
            int indexOf = normalize.indexOf(46);
            String substring = indexOf != -1 ? normalize.substring(indexOf + 1) : null;
            if (substring != null) {
                DomainType m24774a2 = m24774a(this.f73858a, "*." + IDN.toUnicode(substring));
                if (m24773b(m24774a2, domainType)) {
                    return m24774a2 == DomainType.PRIVATE ? normalize : str2;
                }
            }
            str2 = normalize;
            normalize = substring;
        }
        if (domainType == null || domainType == DomainType.UNKNOWN) {
            return str2;
        }
        return null;
    }

    public boolean matches(String str, DomainType domainType) {
        if (str == null) {
            return false;
        }
        if (str.startsWith(".")) {
            str = str.substring(1);
        }
        return getDomainRoot(str, domainType) == null;
    }

    public PublicSuffixMatcher(Collection<PublicSuffixList> collection) {
        Args.notNull(collection, "Domain suffix lists");
        this.f73858a = new ConcurrentHashMap();
        this.f73859b = new ConcurrentHashMap();
        for (PublicSuffixList publicSuffixList : collection) {
            DomainType type = publicSuffixList.getType();
            for (String str : publicSuffixList.getRules()) {
                this.f73858a.put(str, type);
            }
            List<String> exceptions = publicSuffixList.getExceptions();
            if (exceptions != null) {
                for (String str2 : exceptions) {
                    this.f73859b.put(str2, type);
                }
            }
        }
    }
}
