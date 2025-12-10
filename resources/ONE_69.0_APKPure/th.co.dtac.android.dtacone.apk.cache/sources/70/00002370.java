package androidx.compose.foundation;

import android.widget.EdgeEffect;
import androidx.compose.p003ui.geometry.Size;
import androidx.compose.p003ui.unit.IntSize;
import androidx.compose.p003ui.unit.IntSizeKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata(m29143d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m29142d2 = {"<anonymous>", "", "size", "Landroidx/compose/ui/unit/IntSize;", "invoke-ozmzZPI", "(J)V"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
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
        m69501invokeozmzZPI(intSize.m74006unboximpl());
        return Unit.INSTANCE;
    }

    /* renamed from: invoke-ozmzZPI  reason: not valid java name */
    public final void m69501invokeozmzZPI(long j) {
        long j2;
        EdgeEffect edgeEffect;
        EdgeEffect edgeEffect2;
        EdgeEffect edgeEffect3;
        EdgeEffect edgeEffect4;
        EdgeEffect edgeEffect5;
        EdgeEffect edgeEffect6;
        EdgeEffect edgeEffect7;
        EdgeEffect edgeEffect8;
        long m74012toSizeozmzZPI = IntSizeKt.m74012toSizeozmzZPI(j);
        j2 = this.this$0.f12871o;
        boolean z = !Size.m71751equalsimpl0(m74012toSizeozmzZPI, j2);
        this.this$0.f12871o = IntSizeKt.m74012toSizeozmzZPI(j);
        if (z) {
            edgeEffect = this.this$0.f12859c;
            edgeEffect.setSize(IntSize.m74002getWidthimpl(j), IntSize.m74001getHeightimpl(j));
            edgeEffect2 = this.this$0.f12860d;
            edgeEffect2.setSize(IntSize.m74002getWidthimpl(j), IntSize.m74001getHeightimpl(j));
            edgeEffect3 = this.this$0.f12861e;
            edgeEffect3.setSize(IntSize.m74001getHeightimpl(j), IntSize.m74002getWidthimpl(j));
            edgeEffect4 = this.this$0.f12862f;
            edgeEffect4.setSize(IntSize.m74001getHeightimpl(j), IntSize.m74002getWidthimpl(j));
            edgeEffect5 = this.this$0.f12864h;
            edgeEffect5.setSize(IntSize.m74002getWidthimpl(j), IntSize.m74001getHeightimpl(j));
            edgeEffect6 = this.this$0.f12865i;
            edgeEffect6.setSize(IntSize.m74002getWidthimpl(j), IntSize.m74001getHeightimpl(j));
            edgeEffect7 = this.this$0.f12866j;
            edgeEffect7.setSize(IntSize.m74001getHeightimpl(j), IntSize.m74002getWidthimpl(j));
            edgeEffect8 = this.this$0.f12867k;
            edgeEffect8.setSize(IntSize.m74001getHeightimpl(j), IntSize.m74002getWidthimpl(j));
        }
        if (z) {
            this.this$0.m61577f();
            this.this$0.m61582a();
        }
    }
}