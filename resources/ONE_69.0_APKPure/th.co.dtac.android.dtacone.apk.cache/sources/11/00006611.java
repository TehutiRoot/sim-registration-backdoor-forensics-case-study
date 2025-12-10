package androidx.compose.p003ui.tooling;

import androidx.compose.p003ui.layout.LayoutInfo;
import androidx.compose.p003ui.tooling.data.SourceLocation;
import androidx.compose.p003ui.unit.IntRect;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt__SequenceBuilderKt;

/* renamed from: androidx.compose.ui.tooling.ShadowViewInfo */
/* loaded from: classes2.dex */
public final class ShadowViewInfo {

    /* renamed from: a */
    public ShadowViewInfo f31706a;

    /* renamed from: b */
    public final ViewInfo f31707b;

    /* renamed from: c */
    public final List f31708c;

    /* renamed from: d */
    public final Sequence f31709d;

    public ShadowViewInfo(ShadowViewInfo shadowViewInfo, ViewInfo viewInfo) {
        this.f31706a = shadowViewInfo;
        this.f31707b = viewInfo;
        List<ViewInfo> children = viewInfo.getChildren();
        ArrayList arrayList = new ArrayList(AbstractC10172es.collectionSizeOrDefault(children, 10));
        for (ViewInfo viewInfo2 : children) {
            arrayList.add(new ShadowViewInfo(this, viewInfo2));
        }
        this.f31708c = CollectionsKt___CollectionsKt.toMutableList((Collection) arrayList);
        this.f31709d = SequencesKt__SequenceBuilderKt.sequence(new ShadowViewInfo$allNodes$1(this, null));
    }

    /* renamed from: a */
    public final ShadowViewInfo m58888a() {
        ShadowViewInfo shadowViewInfo = this.f31706a;
        if (shadowViewInfo == null) {
            return this;
        }
        Intrinsics.checkNotNull(shadowViewInfo);
        return shadowViewInfo.m58888a();
    }

    /* renamed from: b */
    public final Sequence m58887b() {
        return this.f31709d;
    }

    /* renamed from: c */
    public final List m58886c() {
        return this.f31708c;
    }

    /* renamed from: d */
    public final LayoutInfo m58885d() {
        Object layoutInfo = this.f31707b.getLayoutInfo();
        if (layoutInfo instanceof LayoutInfo) {
            return (LayoutInfo) layoutInfo;
        }
        return null;
    }

    /* renamed from: e */
    public final void m58884e(ShadowViewInfo parent) {
        List list;
        Intrinsics.checkNotNullParameter(parent, "parent");
        ShadowViewInfo shadowViewInfo = this.f31706a;
        if (shadowViewInfo != null && (list = shadowViewInfo.f31708c) != null) {
            list.remove(this);
        }
        parent.f31708c.add(this);
        this.f31706a = parent;
    }

    /* renamed from: f */
    public final ViewInfo m58883f() {
        String fileName = this.f31707b.getFileName();
        int lineNumber = this.f31707b.getLineNumber();
        IntRect bounds = this.f31707b.getBounds();
        SourceLocation location = this.f31707b.getLocation();
        List<ShadowViewInfo> list = this.f31708c;
        ArrayList arrayList = new ArrayList(AbstractC10172es.collectionSizeOrDefault(list, 10));
        for (ShadowViewInfo shadowViewInfo : list) {
            arrayList.add(shadowViewInfo.m58883f());
        }
        return new ViewInfo(fileName, lineNumber, bounds, location, arrayList, this.f31707b.getLayoutInfo());
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ShadowViewInfo(ViewInfo viewInfo) {
        this(null, viewInfo);
        Intrinsics.checkNotNullParameter(viewInfo, "viewInfo");
    }
}