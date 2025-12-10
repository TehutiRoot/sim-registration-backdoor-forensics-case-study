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
    public ShadowViewInfo f31618a;

    /* renamed from: b */
    public final ViewInfo f31619b;

    /* renamed from: c */
    public final List f31620c;

    /* renamed from: d */
    public final Sequence f31621d;

    public ShadowViewInfo(ShadowViewInfo shadowViewInfo, ViewInfo viewInfo) {
        this.f31618a = shadowViewInfo;
        this.f31619b = viewInfo;
        List<ViewInfo> children = viewInfo.getChildren();
        ArrayList arrayList = new ArrayList(AbstractC10176es.collectionSizeOrDefault(children, 10));
        for (ViewInfo viewInfo2 : children) {
            arrayList.add(new ShadowViewInfo(this, viewInfo2));
        }
        this.f31620c = CollectionsKt___CollectionsKt.toMutableList((Collection) arrayList);
        this.f31621d = SequencesKt__SequenceBuilderKt.sequence(new ShadowViewInfo$allNodes$1(this, null));
    }

    /* renamed from: a */
    public final ShadowViewInfo m58938a() {
        ShadowViewInfo shadowViewInfo = this.f31618a;
        if (shadowViewInfo == null) {
            return this;
        }
        Intrinsics.checkNotNull(shadowViewInfo);
        return shadowViewInfo.m58938a();
    }

    /* renamed from: b */
    public final Sequence m58937b() {
        return this.f31621d;
    }

    /* renamed from: c */
    public final List m58936c() {
        return this.f31620c;
    }

    /* renamed from: d */
    public final LayoutInfo m58935d() {
        Object layoutInfo = this.f31619b.getLayoutInfo();
        if (layoutInfo instanceof LayoutInfo) {
            return (LayoutInfo) layoutInfo;
        }
        return null;
    }

    /* renamed from: e */
    public final void m58934e(ShadowViewInfo parent) {
        List list;
        Intrinsics.checkNotNullParameter(parent, "parent");
        ShadowViewInfo shadowViewInfo = this.f31618a;
        if (shadowViewInfo != null && (list = shadowViewInfo.f31620c) != null) {
            list.remove(this);
        }
        parent.f31620c.add(this);
        this.f31618a = parent;
    }

    /* renamed from: f */
    public final ViewInfo m58933f() {
        String fileName = this.f31619b.getFileName();
        int lineNumber = this.f31619b.getLineNumber();
        IntRect bounds = this.f31619b.getBounds();
        SourceLocation location = this.f31619b.getLocation();
        List<ShadowViewInfo> list = this.f31620c;
        ArrayList arrayList = new ArrayList(AbstractC10176es.collectionSizeOrDefault(list, 10));
        for (ShadowViewInfo shadowViewInfo : list) {
            arrayList.add(shadowViewInfo.m58933f());
        }
        return new ViewInfo(fileName, lineNumber, bounds, location, arrayList, this.f31619b.getLayoutInfo());
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ShadowViewInfo(ViewInfo viewInfo) {
        this(null, viewInfo);
        Intrinsics.checkNotNullParameter(viewInfo, "viewInfo");
    }
}
