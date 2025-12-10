package com.google.common.base;

import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

@GwtCompatible(emulated = true)
/* loaded from: classes4.dex */
public final class Splitter {

    /* renamed from: a */
    public final CharMatcher f52770a;

    /* renamed from: b */
    public final boolean f52771b;

    /* renamed from: c */
    public final InterfaceC7450g f52772c;

    /* renamed from: d */
    public final int f52773d;

    /* loaded from: classes4.dex */
    public static final class MapSplitter {

        /* renamed from: a */
        public final Splitter f52774a;

        /* renamed from: b */
        public final Splitter f52775b;

        public /* synthetic */ MapSplitter(Splitter splitter, Splitter splitter2, C7440a c7440a) {
            this(splitter, splitter2);
        }

        public Map<String, String> split(CharSequence charSequence) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (String str : this.f52774a.split(charSequence)) {
                Iterator m41292f = this.f52775b.m41292f(str);
                Preconditions.checkArgument(m41292f.hasNext(), "Chunk [%s] is not a valid entry", str);
                String str2 = (String) m41292f.next();
                Preconditions.checkArgument(!linkedHashMap.containsKey(str2), "Duplicate key [%s] found.", str2);
                Preconditions.checkArgument(m41292f.hasNext(), "Chunk [%s] is not a valid entry", str);
                linkedHashMap.put(str2, (String) m41292f.next());
                Preconditions.checkArgument(!m41292f.hasNext(), "Chunk [%s] is not a valid entry", str);
            }
            return Collections.unmodifiableMap(linkedHashMap);
        }

        public MapSplitter(Splitter splitter, Splitter splitter2) {
            this.f52774a = splitter;
            this.f52775b = (Splitter) Preconditions.checkNotNull(splitter2);
        }
    }

    /* renamed from: com.google.common.base.Splitter$a */
    /* loaded from: classes4.dex */
    public class C7440a implements InterfaceC7450g {

        /* renamed from: a */
        public final /* synthetic */ CharMatcher f52776a;

        /* renamed from: com.google.common.base.Splitter$a$a */
        /* loaded from: classes4.dex */
        public class C7441a extends AbstractC7449f {
            public C7441a(Splitter splitter, CharSequence charSequence) {
                super(splitter, charSequence);
            }

            @Override // com.google.common.base.Splitter.AbstractC7449f
            /* renamed from: e */
            public int mo41281e(int i) {
                return i + 1;
            }

            @Override // com.google.common.base.Splitter.AbstractC7449f
            /* renamed from: f */
            public int mo41280f(int i) {
                return C7440a.this.f52776a.indexIn(this.f52787c, i);
            }
        }

        public C7440a(CharMatcher charMatcher) {
            this.f52776a = charMatcher;
        }

        @Override // com.google.common.base.Splitter.InterfaceC7450g
        /* renamed from: b */
        public AbstractC7449f mo41279a(Splitter splitter, CharSequence charSequence) {
            return new C7441a(splitter, charSequence);
        }
    }

    /* renamed from: com.google.common.base.Splitter$b */
    /* loaded from: classes4.dex */
    public class C7442b implements InterfaceC7450g {

        /* renamed from: a */
        public final /* synthetic */ String f52778a;

        /* renamed from: com.google.common.base.Splitter$b$a */
        /* loaded from: classes4.dex */
        public class C7443a extends AbstractC7449f {
            public C7443a(Splitter splitter, CharSequence charSequence) {
                super(splitter, charSequence);
            }

            @Override // com.google.common.base.Splitter.AbstractC7449f
            /* renamed from: e */
            public int mo41281e(int i) {
                return i + C7442b.this.f52778a.length();
            }

            /* JADX WARN: Code restructure failed: missing block: B:8:0x0026, code lost:
                r6 = r6 + 1;
             */
            @Override // com.google.common.base.Splitter.AbstractC7449f
            /* renamed from: f */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public int mo41280f(int r6) {
                /*
                    r5 = this;
                    com.google.common.base.Splitter$b r0 = com.google.common.base.Splitter.C7442b.this
                    java.lang.String r0 = r0.f52778a
                    int r0 = r0.length()
                    java.lang.CharSequence r1 = r5.f52787c
                    int r1 = r1.length()
                    int r1 = r1 - r0
                Lf:
                    if (r6 > r1) goto L2d
                    r2 = 0
                L12:
                    if (r2 >= r0) goto L2c
                    java.lang.CharSequence r3 = r5.f52787c
                    int r4 = r2 + r6
                    char r3 = r3.charAt(r4)
                    com.google.common.base.Splitter$b r4 = com.google.common.base.Splitter.C7442b.this
                    java.lang.String r4 = r4.f52778a
                    char r4 = r4.charAt(r2)
                    if (r3 == r4) goto L29
                    int r6 = r6 + 1
                    goto Lf
                L29:
                    int r2 = r2 + 1
                    goto L12
                L2c:
                    return r6
                L2d:
                    r6 = -1
                    return r6
                */
                throw new UnsupportedOperationException("Method not decompiled: com.google.common.base.Splitter.C7442b.C7443a.mo41280f(int):int");
            }
        }

        public C7442b(String str) {
            this.f52778a = str;
        }

        @Override // com.google.common.base.Splitter.InterfaceC7450g
        /* renamed from: b */
        public AbstractC7449f mo41279a(Splitter splitter, CharSequence charSequence) {
            return new C7443a(splitter, charSequence);
        }
    }

    /* renamed from: com.google.common.base.Splitter$c */
    /* loaded from: classes4.dex */
    public class C7444c implements InterfaceC7450g {

        /* renamed from: a */
        public final /* synthetic */ AbstractC11495iu f52780a;

        /* renamed from: com.google.common.base.Splitter$c$a */
        /* loaded from: classes4.dex */
        public class C7445a extends AbstractC7449f {

            /* renamed from: h */
            public final /* synthetic */ AbstractC10336gu f52781h;

            /* renamed from: i */
            public final /* synthetic */ C7444c f52782i;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C7445a(C7444c c7444c, Splitter splitter, CharSequence charSequence, AbstractC10336gu abstractC10336gu) {
                super(splitter, charSequence);
                this.f52781h = abstractC10336gu;
                this.f52782i = c7444c;
            }

            @Override // com.google.common.base.Splitter.AbstractC7449f
            /* renamed from: e */
            public int mo41281e(int i) {
                return this.f52781h.mo30953a();
            }

            @Override // com.google.common.base.Splitter.AbstractC7449f
            /* renamed from: f */
            public int mo41280f(int i) {
                if (this.f52781h.mo30951c(i)) {
                    return this.f52781h.mo30949e();
                }
                return -1;
            }
        }

        public C7444c(AbstractC11495iu abstractC11495iu) {
            this.f52780a = abstractC11495iu;
        }

        @Override // com.google.common.base.Splitter.InterfaceC7450g
        /* renamed from: b */
        public AbstractC7449f mo41279a(Splitter splitter, CharSequence charSequence) {
            return new C7445a(this, splitter, charSequence, this.f52780a.matcher(charSequence));
        }
    }

    /* renamed from: com.google.common.base.Splitter$d */
    /* loaded from: classes4.dex */
    public class C7446d implements InterfaceC7450g {

        /* renamed from: a */
        public final /* synthetic */ int f52783a;

        /* renamed from: com.google.common.base.Splitter$d$a */
        /* loaded from: classes4.dex */
        public class C7447a extends AbstractC7449f {
            public C7447a(Splitter splitter, CharSequence charSequence) {
                super(splitter, charSequence);
            }

            @Override // com.google.common.base.Splitter.AbstractC7449f
            /* renamed from: e */
            public int mo41281e(int i) {
                return i;
            }

            @Override // com.google.common.base.Splitter.AbstractC7449f
            /* renamed from: f */
            public int mo41280f(int i) {
                int i2 = i + C7446d.this.f52783a;
                if (i2 >= this.f52787c.length()) {
                    return -1;
                }
                return i2;
            }
        }

        public C7446d(int i) {
            this.f52783a = i;
        }

        @Override // com.google.common.base.Splitter.InterfaceC7450g
        /* renamed from: b */
        public AbstractC7449f mo41279a(Splitter splitter, CharSequence charSequence) {
            return new C7447a(splitter, charSequence);
        }
    }

    /* renamed from: com.google.common.base.Splitter$e */
    /* loaded from: classes4.dex */
    public class C7448e implements Iterable {

        /* renamed from: a */
        public final /* synthetic */ CharSequence f52785a;

        /* renamed from: b */
        public final /* synthetic */ Splitter f52786b;

        public C7448e(Splitter splitter, CharSequence charSequence) {
            this.f52785a = charSequence;
            this.f52786b = splitter;
        }

        @Override // java.lang.Iterable
        public Iterator iterator() {
            return this.f52786b.m41292f(this.f52785a);
        }

        public String toString() {
            Joiner m41322on = Joiner.m41322on(", ");
            StringBuilder sb = new StringBuilder();
            sb.append(AbstractJsonLexerKt.BEGIN_LIST);
            StringBuilder appendTo = m41322on.appendTo(sb, (Iterable<? extends Object>) this);
            appendTo.append(AbstractJsonLexerKt.END_LIST);
            return appendTo.toString();
        }
    }

    /* renamed from: com.google.common.base.Splitter$f */
    /* loaded from: classes4.dex */
    public static abstract class AbstractC7449f extends AbstractIterator {

        /* renamed from: c */
        public final CharSequence f52787c;

        /* renamed from: d */
        public final CharMatcher f52788d;

        /* renamed from: e */
        public final boolean f52789e;

        /* renamed from: f */
        public int f52790f = 0;

        /* renamed from: g */
        public int f52791g;

        public AbstractC7449f(Splitter splitter, CharSequence charSequence) {
            this.f52788d = splitter.f52770a;
            this.f52789e = splitter.f52771b;
            this.f52791g = splitter.f52773d;
            this.f52787c = charSequence;
        }

        @Override // com.google.common.base.AbstractIterator
        /* renamed from: d */
        public String mo41283a() {
            int mo41280f;
            int i = this.f52790f;
            while (true) {
                int i2 = this.f52790f;
                if (i2 != -1) {
                    mo41280f = mo41280f(i2);
                    if (mo41280f == -1) {
                        mo41280f = this.f52787c.length();
                        this.f52790f = -1;
                    } else {
                        this.f52790f = mo41281e(mo41280f);
                    }
                    int i3 = this.f52790f;
                    if (i3 == i) {
                        int i4 = i3 + 1;
                        this.f52790f = i4;
                        if (i4 > this.f52787c.length()) {
                            this.f52790f = -1;
                        }
                    } else {
                        while (i < mo41280f && this.f52788d.matches(this.f52787c.charAt(i))) {
                            i++;
                        }
                        while (mo41280f > i && this.f52788d.matches(this.f52787c.charAt(mo41280f - 1))) {
                            mo41280f--;
                        }
                        if (!this.f52789e || i != mo41280f) {
                            break;
                        }
                        i = this.f52790f;
                    }
                } else {
                    return (String) m41351b();
                }
            }
            int i5 = this.f52791g;
            if (i5 == 1) {
                mo41280f = this.f52787c.length();
                this.f52790f = -1;
                while (mo41280f > i && this.f52788d.matches(this.f52787c.charAt(mo41280f - 1))) {
                    mo41280f--;
                }
            } else {
                this.f52791g = i5 - 1;
            }
            return this.f52787c.subSequence(i, mo41280f).toString();
        }

        /* renamed from: e */
        public abstract int mo41281e(int i);

        /* renamed from: f */
        public abstract int mo41280f(int i);
    }

    /* renamed from: com.google.common.base.Splitter$g */
    /* loaded from: classes4.dex */
    public interface InterfaceC7450g {
        /* renamed from: a */
        Iterator mo41279a(Splitter splitter, CharSequence charSequence);
    }

    public Splitter(InterfaceC7450g interfaceC7450g) {
        this(interfaceC7450g, false, CharMatcher.none(), Integer.MAX_VALUE);
    }

    /* renamed from: e */
    public static Splitter m41293e(AbstractC11495iu abstractC11495iu) {
        Preconditions.checkArgument(!abstractC11495iu.matcher("").mo30950d(), "The pattern may not match the empty string: %s", abstractC11495iu);
        return new Splitter(new C7444c(abstractC11495iu));
    }

    public static Splitter fixedLength(int i) {
        boolean z;
        if (i > 0) {
            z = true;
        } else {
            z = false;
        }
        Preconditions.checkArgument(z, "The length may not be less than 1");
        return new Splitter(new C7446d(i));
    }

    /* renamed from: on */
    public static Splitter m41291on(char c) {
        return m41290on(CharMatcher.m41340is(c));
    }

    @GwtIncompatible
    public static Splitter onPattern(String str) {
        return m41293e(AbstractC7455a.m41257a(str));
    }

    /* renamed from: f */
    public final Iterator m41292f(CharSequence charSequence) {
        return this.f52772c.mo41279a(this, charSequence);
    }

    public Splitter limit(int i) {
        boolean z;
        if (i > 0) {
            z = true;
        } else {
            z = false;
        }
        Preconditions.checkArgument(z, "must be greater than zero: %s", i);
        return new Splitter(this.f52772c, this.f52771b, this.f52770a, i);
    }

    public Splitter omitEmptyStrings() {
        return new Splitter(this.f52772c, true, this.f52770a, this.f52773d);
    }

    public Iterable<String> split(CharSequence charSequence) {
        Preconditions.checkNotNull(charSequence);
        return new C7448e(this, charSequence);
    }

    public List<String> splitToList(CharSequence charSequence) {
        Preconditions.checkNotNull(charSequence);
        Iterator m41292f = m41292f(charSequence);
        ArrayList arrayList = new ArrayList();
        while (m41292f.hasNext()) {
            arrayList.add((String) m41292f.next());
        }
        return Collections.unmodifiableList(arrayList);
    }

    public Splitter trimResults() {
        return trimResults(CharMatcher.whitespace());
    }

    public MapSplitter withKeyValueSeparator(String str) {
        return withKeyValueSeparator(m41289on(str));
    }

    public Splitter(InterfaceC7450g interfaceC7450g, boolean z, CharMatcher charMatcher, int i) {
        this.f52772c = interfaceC7450g;
        this.f52771b = z;
        this.f52770a = charMatcher;
        this.f52773d = i;
    }

    /* renamed from: on */
    public static Splitter m41290on(CharMatcher charMatcher) {
        Preconditions.checkNotNull(charMatcher);
        return new Splitter(new C7440a(charMatcher));
    }

    public Splitter trimResults(CharMatcher charMatcher) {
        Preconditions.checkNotNull(charMatcher);
        return new Splitter(this.f52772c, this.f52771b, charMatcher, this.f52773d);
    }

    public MapSplitter withKeyValueSeparator(char c) {
        return withKeyValueSeparator(m41291on(c));
    }

    public MapSplitter withKeyValueSeparator(Splitter splitter) {
        return new MapSplitter(this, splitter, null);
    }

    /* renamed from: on */
    public static Splitter m41289on(String str) {
        Preconditions.checkArgument(str.length() != 0, "The separator may not be the empty string.");
        if (str.length() == 1) {
            return m41291on(str.charAt(0));
        }
        return new Splitter(new C7442b(str));
    }

    @GwtIncompatible
    /* renamed from: on */
    public static Splitter m41288on(Pattern pattern) {
        return m41293e(new JdkPattern(pattern));
    }
}
