package p000;

import androidx.compose.p003ui.tooling.data.SlotTreeKt;
import androidx.compose.p003ui.tooling.data.SourceContext;
import androidx.compose.p003ui.tooling.data.SourceLocation;
import androidx.compose.p003ui.unit.IntRect;
import androidx.compose.runtime.tooling.CompositionGroup;
import ch.qos.logback.core.CoreConstants;
import com.tom_roush.fontbox.afm.AFMParser;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.collections.ArrayDeque;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;

/* renamed from: uv */
/* loaded from: classes2.dex */
public final class C16858uv implements SourceContext {

    /* renamed from: a */
    public final Function3 f107500a;

    /* renamed from: b */
    public final Map f107501b;

    /* renamed from: c */
    public final ArrayDeque f107502c;

    /* renamed from: d */
    public int f107503d;

    /* renamed from: e */
    public IntRect f107504e;

    public C16858uv(Function3 factory, Map contexts) {
        Intrinsics.checkNotNullParameter(factory, "factory");
        Intrinsics.checkNotNullParameter(contexts, "contexts");
        this.f107500a = factory;
        this.f107501b = contexts;
        this.f107502c = new ArrayDeque();
        this.f107504e = SlotTreeKt.getEmptyBox();
    }

    /* renamed from: a */
    public final C22604vK1 m1164a(String str) {
        Map map = this.f107501b;
        Object obj = map.get(str);
        if (obj == null) {
            obj = SlotTreeKt.m58903B(str, null, 2, null);
            map.put(str, obj);
        }
        if (!(obj instanceof C22604vK1)) {
            return null;
        }
        return (C22604vK1) obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x004a, code lost:
        r2 = androidx.compose.p003ui.tooling.data.SlotTreeKt.m58899b(r2);
     */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final androidx.compose.p003ui.unit.IntRect m1163b(androidx.compose.runtime.tooling.CompositionGroup r7, int r8, java.util.List r9) {
        /*
            r6 = this;
            java.lang.String r0 = "group"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            java.lang.String r0 = "out"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            androidx.compose.ui.unit.IntRect r1 = androidx.compose.p003ui.tooling.data.SlotTreeKt.getEmptyBox()
            r6.m1158g(r7)
            java.lang.Iterable r2 = r7.getCompositionGroups()
            java.util.Iterator r2 = r2.iterator()
            r3 = 0
        L1f:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L3c
            java.lang.Object r4 = r2.next()
            androidx.compose.runtime.tooling.CompositionGroup r4 = (androidx.compose.runtime.tooling.CompositionGroup) r4
            androidx.compose.ui.unit.IntRect r5 = r6.m1163b(r4, r3, r0)
            androidx.compose.ui.unit.IntRect r1 = androidx.compose.p003ui.tooling.data.SlotTreeKt.union(r1, r5)
            boolean r4 = r6.m1161d(r4)
            if (r4 == 0) goto L1f
            int r3 = r3 + 1
            goto L1f
        L3c:
            java.lang.Object r2 = r7.getNode()
            boolean r3 = r2 instanceof androidx.compose.p003ui.layout.LayoutInfo
            if (r3 == 0) goto L47
            androidx.compose.ui.layout.LayoutInfo r2 = (androidx.compose.p003ui.layout.LayoutInfo) r2
            goto L48
        L47:
            r2 = 0
        L48:
            if (r2 == 0) goto L52
            androidx.compose.ui.unit.IntRect r2 = androidx.compose.p003ui.tooling.data.SlotTreeKt.access$boundsOfLayoutNode(r2)
            if (r2 != 0) goto L51
            goto L52
        L51:
            r1 = r2
        L52:
            r6.f107503d = r8
            r6.f107504e = r1
            kotlin.jvm.functions.Function3 r8 = r6.f107500a
            java.lang.Object r7 = r8.invoke(r7, r6, r0)
            if (r7 == 0) goto L61
            r9.add(r7)
        L61:
            r6.m1159f()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C16858uv.m1163b(androidx.compose.runtime.tooling.CompositionGroup, int, java.util.List):androidx.compose.ui.unit.IntRect");
    }

    /* renamed from: c */
    public final CompositionGroup m1162c() {
        return (CompositionGroup) this.f107502c.last();
    }

    /* renamed from: d */
    public final boolean m1161d(CompositionGroup compositionGroup) {
        String sourceInfo = compositionGroup.getSourceInfo();
        if (sourceInfo == null) {
            return false;
        }
        return AbstractC20204hN1.startsWith$default(sourceInfo, "C", false, 2, null);
    }

    /* renamed from: e */
    public final CompositionGroup m1160e(int i) {
        if (this.f107502c.size() > i) {
            ArrayDeque arrayDeque = this.f107502c;
            return (CompositionGroup) arrayDeque.get((arrayDeque.size() - i) - 1);
        }
        return null;
    }

    /* renamed from: f */
    public final CompositionGroup m1159f() {
        return (CompositionGroup) this.f107502c.removeLast();
    }

    /* renamed from: g */
    public final void m1158g(CompositionGroup compositionGroup) {
        this.f107502c.addLast(compositionGroup);
    }

    @Override // androidx.compose.p003ui.tooling.data.SourceContext
    public IntRect getBounds() {
        return this.f107504e;
    }

    @Override // androidx.compose.p003ui.tooling.data.SourceContext
    public int getDepth() {
        return this.f107502c.size();
    }

    @Override // androidx.compose.p003ui.tooling.data.SourceContext
    public SourceLocation getLocation() {
        String sourceInfo;
        C22604vK1 m1164a;
        String str;
        C22604vK1 c22604vK1;
        String sourceInfo2;
        CompositionGroup m1160e = m1160e(1);
        if (m1160e == null || (sourceInfo = m1160e.getSourceInfo()) == null || (m1164a = m1164a(sourceInfo)) == null) {
            return null;
        }
        int i = 2;
        C22604vK1 c22604vK12 = m1164a;
        while (i < this.f107502c.size()) {
            if (c22604vK12 != null) {
                str = c22604vK12.m1054d();
            } else {
                str = null;
            }
            if (str != null) {
                break;
            }
            int i2 = i + 1;
            CompositionGroup m1160e2 = m1160e(i);
            if (m1160e2 != null && (sourceInfo2 = m1160e2.getSourceInfo()) != null) {
                c22604vK1 = m1164a(sourceInfo2);
            } else {
                c22604vK1 = null;
            }
            c22604vK12 = c22604vK1;
            i = i2;
        }
        return m1164a.m1050h(this.f107503d, c22604vK12);
    }

    @Override // androidx.compose.p003ui.tooling.data.SourceContext
    public String getName() {
        int i;
        String sourceInfo = m1162c().getSourceInfo();
        if (sourceInfo == null) {
            return null;
        }
        if (AbstractC20204hN1.startsWith$default(sourceInfo, "CC(", false, 2, null)) {
            i = 3;
        } else if (!AbstractC20204hN1.startsWith$default(sourceInfo, "C(", false, 2, null)) {
            return null;
        } else {
            i = 2;
        }
        int indexOf$default = StringsKt__StringsKt.indexOf$default((CharSequence) sourceInfo, (char) CoreConstants.RIGHT_PARENTHESIS_CHAR, 0, false, 6, (Object) null);
        if (indexOf$default <= 2) {
            return null;
        }
        String substring = sourceInfo.substring(i, indexOf$default);
        Intrinsics.checkNotNullExpressionValue(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    @Override // androidx.compose.p003ui.tooling.data.SourceContext
    public List getParameters() {
        C22604vK1 m1164a;
        List m58897d;
        CompositionGroup m1162c = m1162c();
        String sourceInfo = m1162c.getSourceInfo();
        if (sourceInfo != null && (m1164a = m1164a(sourceInfo)) != null) {
            ArrayList arrayList = new ArrayList();
            AbstractC10410hs.addAll(arrayList, m1162c.getData());
            m58897d = SlotTreeKt.m58897d(arrayList, m1164a);
            return m58897d;
        }
        return CollectionsKt__CollectionsKt.emptyList();
    }

    @Override // androidx.compose.p003ui.tooling.data.SourceContext
    public boolean isInline() {
        String sourceInfo = m1162c().getSourceInfo();
        if (sourceInfo == null || !AbstractC20204hN1.startsWith$default(sourceInfo, AFMParser.f59166CC, false, 2, null)) {
            return false;
        }
        return true;
    }
}
