package kotlin.text;

import java.util.List;
import java.util.regex.Matcher;
import kotlin.collections.AbstractList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.text.MatchResult;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes6.dex */
public final class MatcherMatchResult implements MatchResult {

    /* renamed from: a */
    public final Matcher f70538a;

    /* renamed from: b */
    public final CharSequence f70539b;

    /* renamed from: c */
    public final MatchGroupCollection f70540c;

    /* renamed from: d */
    public List f70541d;

    public MatcherMatchResult(Matcher matcher, CharSequence input) {
        Intrinsics.checkNotNullParameter(matcher, "matcher");
        Intrinsics.checkNotNullParameter(input, "input");
        this.f70538a = matcher;
        this.f70539b = input;
        this.f70540c = new MatcherMatchResult$groups$1(this);
    }

    /* renamed from: a */
    public static final /* synthetic */ java.util.regex.MatchResult m27449a(MatcherMatchResult matcherMatchResult) {
        return matcherMatchResult.m27448b();
    }

    /* renamed from: b */
    public final java.util.regex.MatchResult m27448b() {
        return this.f70538a;
    }

    @Override // kotlin.text.MatchResult
    public MatchResult.Destructured getDestructured() {
        return MatchResult.DefaultImpls.getDestructured(this);
    }

    @Override // kotlin.text.MatchResult
    public List getGroupValues() {
        if (this.f70541d == null) {
            this.f70541d = new AbstractList<String>() { // from class: kotlin.text.MatcherMatchResult$groupValues$1
                @Override // kotlin.collections.AbstractCollection, java.util.Collection, java.util.List
                public final /* bridge */ boolean contains(Object obj) {
                    if (obj instanceof String) {
                        return contains((String) obj);
                    }
                    return false;
                }

                @Override // kotlin.collections.AbstractList, kotlin.collections.AbstractCollection
                public int getSize() {
                    return MatcherMatchResult.m27449a(MatcherMatchResult.this).groupCount() + 1;
                }

                @Override // kotlin.collections.AbstractList, java.util.List
                public final /* bridge */ int indexOf(Object obj) {
                    if (obj instanceof String) {
                        return indexOf((String) obj);
                    }
                    return -1;
                }

                @Override // kotlin.collections.AbstractList, java.util.List
                public final /* bridge */ int lastIndexOf(Object obj) {
                    if (obj instanceof String) {
                        return lastIndexOf((String) obj);
                    }
                    return -1;
                }

                public /* bridge */ boolean contains(String str) {
                    return super.contains((MatcherMatchResult$groupValues$1) str);
                }

                @Override // kotlin.collections.AbstractList, java.util.List
                @NotNull
                public String get(int i) {
                    String group = MatcherMatchResult.m27449a(MatcherMatchResult.this).group(i);
                    return group == null ? "" : group;
                }

                public /* bridge */ int indexOf(String str) {
                    return super.indexOf((MatcherMatchResult$groupValues$1) str);
                }

                public /* bridge */ int lastIndexOf(String str) {
                    return super.lastIndexOf((MatcherMatchResult$groupValues$1) str);
                }
            };
        }
        List list = this.f70541d;
        Intrinsics.checkNotNull(list);
        return list;
    }

    @Override // kotlin.text.MatchResult
    public MatchGroupCollection getGroups() {
        return this.f70540c;
    }

    @Override // kotlin.text.MatchResult
    public IntRange getRange() {
        IntRange m27444c;
        m27444c = RegexKt.m27444c(m27448b());
        return m27444c;
    }

    @Override // kotlin.text.MatchResult
    public String getValue() {
        String group = m27448b().group();
        Intrinsics.checkNotNullExpressionValue(group, "group(...)");
        return group;
    }

    @Override // kotlin.text.MatchResult
    public MatchResult next() {
        int i;
        MatchResult m27446a;
        int end = m27448b().end();
        if (m27448b().end() == m27448b().start()) {
            i = 1;
        } else {
            i = 0;
        }
        int i2 = end + i;
        if (i2 <= this.f70539b.length()) {
            Matcher matcher = this.f70538a.pattern().matcher(this.f70539b);
            Intrinsics.checkNotNullExpressionValue(matcher, "matcher(...)");
            m27446a = RegexKt.m27446a(matcher, i2, this.f70539b);
            return m27446a;
        }
        return null;
    }
}
