package androidx.compose.p003ui.tooling;

import androidx.compose.p003ui.tooling.data.SourceLocation;
import androidx.compose.p003ui.unit.IntRect;
import androidx.compose.runtime.internal.StabilityInferred;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(m28851d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b)\b\u0087\b\u0018\u00002\u00020\u0001BA\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00000\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\u0013\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00000\n¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0012\u0010\u001b\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0016\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00000\nHÆ\u0003¢\u0006\u0004\b\u001d\u0010\u0013J\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJV\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00000\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0001HÆ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\"\u0010\u0018J\u001a\u0010$\u001a\u00020\u000f2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b$\u0010%R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010\u0018R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010\u001aR\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u0010\u001cR\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00000\n8\u0006¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u0010\u0013R\u0019\u0010\f\u001a\u0004\u0018\u00010\u00018\u0006¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b7\u0010\u001f¨\u00068"}, m28850d2 = {"Landroidx/compose/ui/tooling/ViewInfo;", "", "", "fileName", "", "lineNumber", "Landroidx/compose/ui/unit/IntRect;", "bounds", "Landroidx/compose/ui/tooling/data/SourceLocation;", FirebaseAnalytics.Param.LOCATION, "", "children", "layoutInfo", "<init>", "(Ljava/lang/String;ILandroidx/compose/ui/unit/IntRect;Landroidx/compose/ui/tooling/data/SourceLocation;Ljava/util/List;Ljava/lang/Object;)V", "", "hasBounds", "()Z", "allChildren", "()Ljava/util/List;", "toString", "()Ljava/lang/String;", "component1", "component2", "()I", "component3", "()Landroidx/compose/ui/unit/IntRect;", "component4", "()Landroidx/compose/ui/tooling/data/SourceLocation;", "component5", "component6", "()Ljava/lang/Object;", "copy", "(Ljava/lang/String;ILandroidx/compose/ui/unit/IntRect;Landroidx/compose/ui/tooling/data/SourceLocation;Ljava/util/List;Ljava/lang/Object;)Landroidx/compose/ui/tooling/ViewInfo;", "hashCode", "other", "equals", "(Ljava/lang/Object;)Z", PDPageLabelRange.STYLE_LETTERS_LOWER, "Ljava/lang/String;", "getFileName", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "I", "getLineNumber", OperatorName.CURVE_TO, "Landroidx/compose/ui/unit/IntRect;", "getBounds", "d", "Landroidx/compose/ui/tooling/data/SourceLocation;", "getLocation", "e", "Ljava/util/List;", "getChildren", OperatorName.FILL_NON_ZERO, "Ljava/lang/Object;", "getLayoutInfo", "ui-tooling_release"}, m28849k = 1, m28848mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nComposeViewAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ComposeViewAdapter.kt\nandroidx/compose/ui/tooling/ViewInfo\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,675:1\n1360#2:676\n1446#2,5:677\n1#3:682\n*S KotlinDebug\n*F\n+ 1 ComposeViewAdapter.kt\nandroidx/compose/ui/tooling/ViewInfo\n*L\n100#1:676\n100#1:677,5\n*E\n"})
/* renamed from: androidx.compose.ui.tooling.ViewInfo */
/* loaded from: classes2.dex */
public final class ViewInfo {
    public static final int $stable = 8;

    /* renamed from: a */
    public final String f31624a;

    /* renamed from: b */
    public final int f31625b;

    /* renamed from: c */
    public final IntRect f31626c;

    /* renamed from: d */
    public final SourceLocation f31627d;

    /* renamed from: e */
    public final List f31628e;

    /* renamed from: f */
    public final Object f31629f;

    public ViewInfo(@NotNull String fileName, int i, @NotNull IntRect bounds, @Nullable SourceLocation sourceLocation, @NotNull List<ViewInfo> children, @Nullable Object obj) {
        Intrinsics.checkNotNullParameter(fileName, "fileName");
        Intrinsics.checkNotNullParameter(bounds, "bounds");
        Intrinsics.checkNotNullParameter(children, "children");
        this.f31624a = fileName;
        this.f31625b = i;
        this.f31626c = bounds;
        this.f31627d = sourceLocation;
        this.f31628e = children;
        this.f31629f = obj;
    }

    public static /* synthetic */ ViewInfo copy$default(ViewInfo viewInfo, String str, int i, IntRect intRect, SourceLocation sourceLocation, List list, Object obj, int i2, Object obj2) {
        if ((i2 & 1) != 0) {
            str = viewInfo.f31624a;
        }
        if ((i2 & 2) != 0) {
            i = viewInfo.f31625b;
        }
        int i3 = i;
        if ((i2 & 4) != 0) {
            intRect = viewInfo.f31626c;
        }
        IntRect intRect2 = intRect;
        if ((i2 & 8) != 0) {
            sourceLocation = viewInfo.f31627d;
        }
        SourceLocation sourceLocation2 = sourceLocation;
        List list2 = list;
        if ((i2 & 16) != 0) {
            list2 = viewInfo.f31628e;
        }
        List list3 = list2;
        if ((i2 & 32) != 0) {
            obj = viewInfo.f31629f;
        }
        return viewInfo.copy(str, i3, intRect2, sourceLocation2, list3, obj);
    }

    @NotNull
    public final List<ViewInfo> allChildren() {
        List<ViewInfo> list = this.f31628e;
        List list2 = list;
        ArrayList arrayList = new ArrayList();
        for (ViewInfo viewInfo : list) {
            AbstractC10410hs.addAll(arrayList, viewInfo.allChildren());
        }
        return CollectionsKt___CollectionsKt.plus((Collection) list2, (Iterable) arrayList);
    }

    @NotNull
    public final String component1() {
        return this.f31624a;
    }

    public final int component2() {
        return this.f31625b;
    }

    @NotNull
    public final IntRect component3() {
        return this.f31626c;
    }

    @Nullable
    public final SourceLocation component4() {
        return this.f31627d;
    }

    @NotNull
    public final List<ViewInfo> component5() {
        return this.f31628e;
    }

    @Nullable
    public final Object component6() {
        return this.f31629f;
    }

    @NotNull
    public final ViewInfo copy(@NotNull String fileName, int i, @NotNull IntRect bounds, @Nullable SourceLocation sourceLocation, @NotNull List<ViewInfo> children, @Nullable Object obj) {
        Intrinsics.checkNotNullParameter(fileName, "fileName");
        Intrinsics.checkNotNullParameter(bounds, "bounds");
        Intrinsics.checkNotNullParameter(children, "children");
        return new ViewInfo(fileName, i, bounds, sourceLocation, children, obj);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ViewInfo) {
            ViewInfo viewInfo = (ViewInfo) obj;
            return Intrinsics.areEqual(this.f31624a, viewInfo.f31624a) && this.f31625b == viewInfo.f31625b && Intrinsics.areEqual(this.f31626c, viewInfo.f31626c) && Intrinsics.areEqual(this.f31627d, viewInfo.f31627d) && Intrinsics.areEqual(this.f31628e, viewInfo.f31628e) && Intrinsics.areEqual(this.f31629f, viewInfo.f31629f);
        }
        return false;
    }

    @NotNull
    public final IntRect getBounds() {
        return this.f31626c;
    }

    @NotNull
    public final List<ViewInfo> getChildren() {
        return this.f31628e;
    }

    @NotNull
    public final String getFileName() {
        return this.f31624a;
    }

    @Nullable
    public final Object getLayoutInfo() {
        return this.f31629f;
    }

    public final int getLineNumber() {
        return this.f31625b;
    }

    @Nullable
    public final SourceLocation getLocation() {
        return this.f31627d;
    }

    public final boolean hasBounds() {
        if (this.f31626c.getBottom() != 0 && this.f31626c.getRight() != 0) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int hashCode = ((((this.f31624a.hashCode() * 31) + this.f31625b) * 31) + this.f31626c.hashCode()) * 31;
        SourceLocation sourceLocation = this.f31627d;
        int hashCode2 = (((hashCode + (sourceLocation == null ? 0 : sourceLocation.hashCode())) * 31) + this.f31628e.hashCode()) * 31;
        Object obj = this.f31629f;
        return hashCode2 + (obj != null ? obj.hashCode() : 0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x005d, code lost:
        if (r1 == null) goto L8;
     */
    @org.jetbrains.annotations.NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String toString() {
        /*
            r4 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r1 = 40
            r0.append(r1)
            java.lang.String r2 = r4.f31624a
            r0.append(r2)
            r2 = 58
            r0.append(r2)
            int r2 = r4.f31625b
            r0.append(r2)
            java.lang.String r2 = ",\n            |bounds=(top="
            r0.append(r2)
            androidx.compose.ui.unit.IntRect r2 = r4.f31626c
            int r2 = r2.getTop()
            r0.append(r2)
            java.lang.String r2 = ", left="
            r0.append(r2)
            androidx.compose.ui.unit.IntRect r2 = r4.f31626c
            int r2 = r2.getLeft()
            r0.append(r2)
            java.lang.String r2 = ",\n            |location="
            r0.append(r2)
            androidx.compose.ui.tooling.data.SourceLocation r2 = r4.f31627d
            if (r2 == 0) goto L5f
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r1)
            int r1 = r2.getOffset()
            r3.append(r1)
            r1 = 76
            r3.append(r1)
            int r1 = r2.getLength()
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            if (r1 != 0) goto L61
        L5f:
            java.lang.String r1 = "<none>"
        L61:
            r0.append(r1)
            java.lang.String r1 = "\n            |bottom="
            r0.append(r1)
            androidx.compose.ui.unit.IntRect r1 = r4.f31626c
            int r1 = r1.getBottom()
            r0.append(r1)
            java.lang.String r1 = ", right="
            r0.append(r1)
            androidx.compose.ui.unit.IntRect r1 = r4.f31626c
            int r1 = r1.getRight()
            r0.append(r1)
            java.lang.String r1 = "),\n            |childrenCount="
            r0.append(r1)
            java.util.List r1 = r4.f31628e
            int r1 = r1.size()
            r0.append(r1)
            r1 = 41
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r1 = 1
            r2 = 0
            java.lang.String r0 = kotlin.text.StringsKt__IndentKt.trimMargin$default(r0, r2, r1, r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p003ui.tooling.ViewInfo.toString():java.lang.String");
    }
}
