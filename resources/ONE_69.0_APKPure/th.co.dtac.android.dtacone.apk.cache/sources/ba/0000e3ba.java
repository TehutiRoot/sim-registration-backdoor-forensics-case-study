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
    public final Matcher f70572a;

    /* renamed from: b */
    public final CharSequence f70573b;

    /* renamed from: c */
    public final MatchGroupCollection f70574c;

    /* renamed from: d */
    public List f70575d;

    public MatcherMatchResult(Matcher matcher, CharSequence input) {
        Intrinsics.checkNotNullParameter(matcher, "matcher");
        Intrinsics.checkNotNullParameter(input, "input");
        this.f70572a = matcher;
        this.f70573b = input;
        this.f70574c = new MatcherMatchResult$groups$1(this);
    }

    /* renamed from: b */
    public final java.util.regex.MatchResult m27740b() {
        return this.f70572a;
    }

    @Override // kotlin.text.MatchResult
    public MatchResult.Destructured getDestructured() {
        return MatchResult.DefaultImpls.getDestructured(this);
    }

    @Override // kotlin.text.MatchResult
    public List getGroupValues() {
        if (this.f70575d == null) {
            this.f70575d = new AbstractList<String>() { // from class: kotlin.text.MatcherMatchResult$groupValues$1
                @Override // kotlin.collections.AbstractCollection, java.util.Collection, java.util.List
                public final /* bridge */ boolean contains(Object obj) {
                    if (obj instanceof String) {
                        return contains((String) obj);
                    }
                    return false;
                }

                @Override // kotlin.collections.AbstractList, kotlin.collections.AbstractCollection
                public int getSize() {
                    java.util.regex.MatchResult m27740b;
                    m27740b = MatcherMatchResult.this.m27740b();
                    return m27740b.groupCount() + 1;
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
                    java.util.regex.MatchResult m27740b;
                    m27740b = MatcherMatchResult.this.m27740b();
                    String group = m27740b.group(i);
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
        List list = this.f70575d;
        Intrinsics.checkNotNull(list);
        return list;
    }

    @Override // kotlin.text.MatchResult
    public MatchGroupCollection getGroups() {
        return this.f70574c;
    }

    @Override // kotlin.text.MatchResult
    public IntRange getRange() {
        IntRange m27736c;
        m27736c = RegexKt.m27736c(m27740b());
        return m27736c;
    }

    @Override // kotlin.text.MatchResult
    public String getValue() {
        String group = m27740b().group();
        Intrinsics.checkNotNullExpressionValue(group, "group(...)");
        return group;
    }

    @Override // kotlin.text.MatchResult
    public MatchResult next() {
        int i;
        MatchResult m27738a;
        int end = m27740b().end();
        if (m27740b().end() == m27740b().start()) {
            i = 1;
        } else {
            i = 0;
        }
        int i2 = end + i;
        if (i2 <= this.f70573b.length()) {
            Matcher matcher = this.f70572a.pattern().matcher(this.f70573b);
            Intrinsics.checkNotNullExpressionValue(matcher, "matcher(...)");
            m27738a = RegexKt.m27738a(matcher, i2, this.f70573b);
            return m27738a;
        }
        return null;
    }
}