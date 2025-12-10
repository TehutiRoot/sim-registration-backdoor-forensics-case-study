package androidx.compose.foundation.layout;

import androidx.compose.p003ui.node.ModifierNodeElement;
import androidx.compose.p003ui.platform.InspectorInfo;
import androidx.compose.p003ui.unit.C3641Dp;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(m28851d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u001d\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001BS\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0017\u0010\u000e\u001a\u0013\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n¢\u0006\u0002\b\rø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001b\u001a\u00020\b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0096\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0013\u0010\u001d\u001a\u00020\f*\u00020\u000bH\u0016¢\u0006\u0004\b\u001d\u0010\u001eR+\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u0086\u000eø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0012\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R+\u0010\u0005\u001a\u00020\u00038\u0006@\u0006X\u0086\u000eø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0012\n\u0004\b%\u0010 \u001a\u0004\b&\u0010\"\"\u0004\b'\u0010$R+\u0010\u0006\u001a\u00020\u00038\u0006@\u0006X\u0086\u000eø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0012\n\u0004\b\u0011\u0010 \u001a\u0004\b(\u0010\"\"\u0004\b)\u0010$R+\u0010\u0007\u001a\u00020\u00038\u0006@\u0006X\u0086\u000eø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0012\n\u0004\b\u0014\u0010 \u001a\u0004\b*\u0010\"\"\u0004\b+\u0010$R\"\u0010\t\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R(\u0010\u000e\u001a\u0013\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n¢\u0006\u0002\b\r8\u0006¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u00105\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u00066"}, m28850d2 = {"Landroidx/compose/foundation/layout/PaddingElement;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Landroidx/compose/foundation/layout/PaddingNode;", "Landroidx/compose/ui/unit/Dp;", "start", "top", "end", "bottom", "", "rtlAware", "Lkotlin/Function1;", "Landroidx/compose/ui/platform/InspectorInfo;", "", "Lkotlin/ExtensionFunctionType;", "inspectorInfo", "<init>", "(FFFFZLkotlin/jvm/functions/Function1;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "d", "()Landroidx/compose/foundation/layout/PaddingNode;", "node", "e", "(Landroidx/compose/foundation/layout/PaddingNode;)V", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "inspectableProperties", "(Landroidx/compose/ui/platform/InspectorInfo;)V", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "F", "getStart-D9Ej5fM", "()F", "setStart-0680j_4", "(F)V", OperatorName.CURVE_TO, "getTop-D9Ej5fM", "setTop-0680j_4", "getEnd-D9Ej5fM", "setEnd-0680j_4", "getBottom-D9Ej5fM", "setBottom-0680j_4", OperatorName.FILL_NON_ZERO, "Z", "getRtlAware", "()Z", "setRtlAware", "(Z)V", OperatorName.NON_STROKING_GRAY, "Lkotlin/jvm/functions/Function1;", "getInspectorInfo", "()Lkotlin/jvm/functions/Function1;", "foundation-layout_release"}, m28849k = 1, m28848mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nPadding.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Padding.kt\nandroidx/compose/foundation/layout/PaddingElement\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,467:1\n154#2:468\n154#2:469\n154#2:470\n154#2:471\n*S KotlinDebug\n*F\n+ 1 Padding.kt\nandroidx/compose/foundation/layout/PaddingElement\n*L\n327#1:468\n328#1:469\n329#1:470\n330#1:471\n*E\n"})
/* loaded from: classes.dex */
public final class PaddingElement extends ModifierNodeElement<PaddingNode> {

    /* renamed from: b */
    public float f13196b;

    /* renamed from: c */
    public float f13197c;

    /* renamed from: d */
    public float f13198d;

    /* renamed from: e */
    public float f13199e;

    /* renamed from: f */
    public boolean f13200f;

    /* renamed from: g */
    public final Function1 f13201g;

    public /* synthetic */ PaddingElement(float f, float f2, float f3, float f4, boolean z, Function1 function1, DefaultConstructorMarker defaultConstructorMarker) {
        this(f, f2, f3, f4, z, function1);
    }

    @Override // androidx.compose.p003ui.node.ModifierNodeElement
    /* renamed from: d */
    public PaddingNode create() {
        return new PaddingNode(this.f13196b, this.f13197c, this.f13198d, this.f13199e, this.f13200f, null);
    }

    @Override // androidx.compose.p003ui.node.ModifierNodeElement
    /* renamed from: e */
    public void update(PaddingNode node) {
        Intrinsics.checkNotNullParameter(node, "node");
        node.m61351g(this.f13196b);
        node.m61350h(this.f13197c);
        node.m61353e(this.f13198d);
        node.m61354d(this.f13199e);
        node.m61352f(this.f13200f);
    }

    @Override // androidx.compose.p003ui.node.ModifierNodeElement
    public boolean equals(Object obj) {
        PaddingElement paddingElement;
        if (obj instanceof PaddingElement) {
            paddingElement = (PaddingElement) obj;
        } else {
            paddingElement = null;
        }
        if (paddingElement == null || !C3641Dp.m73663equalsimpl0(this.f13196b, paddingElement.f13196b) || !C3641Dp.m73663equalsimpl0(this.f13197c, paddingElement.f13197c) || !C3641Dp.m73663equalsimpl0(this.f13198d, paddingElement.f13198d) || !C3641Dp.m73663equalsimpl0(this.f13199e, paddingElement.f13199e) || this.f13200f != paddingElement.f13200f) {
            return false;
        }
        return true;
    }

    @Override // androidx.compose.p003ui.node.ModifierNodeElement
    public int hashCode() {
        return (((((((C3641Dp.m73664hashCodeimpl(this.f13196b) * 31) + C3641Dp.m73664hashCodeimpl(this.f13197c)) * 31) + C3641Dp.m73664hashCodeimpl(this.f13198d)) * 31) + C3641Dp.m73664hashCodeimpl(this.f13199e)) * 31) + AbstractC1705Xp.m65430a(this.f13200f);
    }

    @Override // androidx.compose.p003ui.node.ModifierNodeElement
    public void inspectableProperties(InspectorInfo inspectorInfo) {
        Intrinsics.checkNotNullParameter(inspectorInfo, "<this>");
        this.f13201g.invoke(inspectorInfo);
    }

    public PaddingElement(float f, float f2, float f3, float f4, boolean z, Function1 inspectorInfo) {
        Intrinsics.checkNotNullParameter(inspectorInfo, "inspectorInfo");
        this.f13196b = f;
        this.f13197c = f2;
        this.f13198d = f3;
        this.f13199e = f4;
        this.f13200f = z;
        this.f13201g = inspectorInfo;
        if (f >= 0.0f || C3641Dp.m73663equalsimpl0(f, C3641Dp.Companion.m73678getUnspecifiedD9Ej5fM())) {
            float f5 = this.f13197c;
            if (f5 >= 0.0f || C3641Dp.m73663equalsimpl0(f5, C3641Dp.Companion.m73678getUnspecifiedD9Ej5fM())) {
                float f6 = this.f13198d;
                if (f6 >= 0.0f || C3641Dp.m73663equalsimpl0(f6, C3641Dp.Companion.m73678getUnspecifiedD9Ej5fM())) {
                    float f7 = this.f13199e;
                    if (f7 >= 0.0f || C3641Dp.m73663equalsimpl0(f7, C3641Dp.Companion.m73678getUnspecifiedD9Ej5fM())) {
                        return;
                    }
                }
            }
        }
        throw new IllegalArgumentException("Padding must be non-negative".toString());
    }
}
