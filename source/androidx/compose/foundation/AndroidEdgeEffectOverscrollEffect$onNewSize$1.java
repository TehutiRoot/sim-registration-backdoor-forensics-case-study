package androidx.compose.foundation;

import android.widget.EdgeEffect;
import androidx.compose.p003ui.geometry.Size;
import androidx.compose.p003ui.unit.IntSize;
import androidx.compose.p003ui.unit.IntSizeKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata(m28851d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28850d2 = {"<anonymous>", "", "size", "Landroidx/compose/ui/unit/IntSize;", "invoke-ozmzZPI", "(J)V"}, m28849k = 3, m28848mv = {1, 8, 0}, m28846xi = 48)
/* loaded from: classes.dex */
public final class AndroidEdgeEffectOverscrollEffect$onNewSize$1 extends Lambda implements Function1<IntSize, Unit> {
    final /* synthetic */ AndroidEdgeEffectOverscrollEffect this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidEdgeEffectOverscrollEffect$onNewSize$1(AndroidEdgeEffectOverscrollEffect androidEdgeEffectOverscrollEffect) {
        super(1);
        this.this$0 = androidEdgeEffectOverscrollEffect;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(IntSize intSize) {
        m69315invokeozmzZPI(intSize.m73822unboximpl());
        return Unit.INSTANCE;
    }

    /* renamed from: invoke-ozmzZPI  reason: not valid java name */
    public final void m69315invokeozmzZPI(long j) {
        long j2;
        EdgeEffect edgeEffect;
        EdgeEffect edgeEffect2;
        EdgeEffect edgeEffect3;
        EdgeEffect edgeEffect4;
        EdgeEffect edgeEffect5;
        EdgeEffect edgeEffect6;
        EdgeEffect edgeEffect7;
        EdgeEffect edgeEffect8;
        long m73828toSizeozmzZPI = IntSizeKt.m73828toSizeozmzZPI(j);
        j2 = this.this$0.f12783o;
        boolean z = !Size.m71567equalsimpl0(m73828toSizeozmzZPI, j2);
        this.this$0.f12783o = IntSizeKt.m73828toSizeozmzZPI(j);
        if (z) {
            edgeEffect = this.this$0.f12771c;
            edgeEffect.setSize(IntSize.m73818getWidthimpl(j), IntSize.m73817getHeightimpl(j));
            edgeEffect2 = this.this$0.f12772d;
            edgeEffect2.setSize(IntSize.m73818getWidthimpl(j), IntSize.m73817getHeightimpl(j));
            edgeEffect3 = this.this$0.f12773e;
            edgeEffect3.setSize(IntSize.m73817getHeightimpl(j), IntSize.m73818getWidthimpl(j));
            edgeEffect4 = this.this$0.f12774f;
            edgeEffect4.setSize(IntSize.m73817getHeightimpl(j), IntSize.m73818getWidthimpl(j));
            edgeEffect5 = this.this$0.f12776h;
            edgeEffect5.setSize(IntSize.m73818getWidthimpl(j), IntSize.m73817getHeightimpl(j));
            edgeEffect6 = this.this$0.f12777i;
            edgeEffect6.setSize(IntSize.m73818getWidthimpl(j), IntSize.m73817getHeightimpl(j));
            edgeEffect7 = this.this$0.f12778j;
            edgeEffect7.setSize(IntSize.m73817getHeightimpl(j), IntSize.m73818getWidthimpl(j));
            edgeEffect8 = this.this$0.f12779k;
            edgeEffect8.setSize(IntSize.m73817getHeightimpl(j), IntSize.m73818getWidthimpl(j));
        }
        if (z) {
            this.this$0.m61627f();
            this.this$0.m61632a();
        }
    }
}
