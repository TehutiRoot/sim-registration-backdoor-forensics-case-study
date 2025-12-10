package androidx.compose.p003ui.viewinterop;

import android.view.View;
import androidx.compose.p003ui.geometry.Offset;
import androidx.compose.p003ui.input.nestedscroll.NestedScrollConnection;
import androidx.compose.p003ui.input.nestedscroll.NestedScrollSource;
import androidx.compose.p003ui.layout.LayoutCoordinatesKt;
import androidx.compose.p003ui.node.LayoutNode;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;

@Metadata(m28851d1 = {"\u0000-\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0004*\u0001\u0010\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0013\u0010\b\u001a\u00020\u0007*\u00020\u0006H\u0002¢\u0006\u0004\b\b\u0010\t\u001a\u0013\u0010\n\u001a\u00020\u0007*\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000b\u001a\u001a\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u0006H\u0002ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000f\"\u0014\u0010\u0012\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0011\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0013"}, m28850d2 = {"Landroid/view/View;", "Landroidx/compose/ui/node/LayoutNode;", "layoutNode", "", PDPageLabelRange.STYLE_LETTERS_LOWER, "(Landroid/view/View;Landroidx/compose/ui/node/LayoutNode;)V", "", "", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "(I)F", OperatorName.CURVE_TO, "(F)F", "type", "Landroidx/compose/ui/input/nestedscroll/NestedScrollSource;", "d", "(I)I", "androidx/compose/ui/viewinterop/AndroidViewHolder_androidKt$NoOpScrollConnection$1", "Landroidx/compose/ui/viewinterop/AndroidViewHolder_androidKt$NoOpScrollConnection$1;", "NoOpScrollConnection", "ui_release"}, m28849k = 2, m28848mv = {1, 8, 0})
/* renamed from: androidx.compose.ui.viewinterop.AndroidViewHolder_androidKt */
/* loaded from: classes2.dex */
public final class AndroidViewHolder_androidKt {

    /* renamed from: a */
    public static final AndroidViewHolder_androidKt$NoOpScrollConnection$1 f31800a = new NestedScrollConnection() { // from class: androidx.compose.ui.viewinterop.AndroidViewHolder_androidKt$NoOpScrollConnection$1
        @Override // androidx.compose.p003ui.input.nestedscroll.NestedScrollConnection
        /* renamed from: onPostFling-RZ2iAVY */
        public /* synthetic */ Object mo69445onPostFlingRZ2iAVY(long j, long j2, Continuation continuation) {
            return VG0.m65885a(this, j, j2, continuation);
        }

        @Override // androidx.compose.p003ui.input.nestedscroll.NestedScrollConnection
        /* renamed from: onPostScroll-DzOQY0M */
        public /* synthetic */ long mo69446onPostScrollDzOQY0M(long j, long j2, int i) {
            return VG0.m65884b(this, j, j2, i);
        }

        @Override // androidx.compose.p003ui.input.nestedscroll.NestedScrollConnection
        /* renamed from: onPreFling-QWom1Mo */
        public /* synthetic */ Object mo69447onPreFlingQWom1Mo(long j, Continuation continuation) {
            return VG0.m65883c(this, j, continuation);
        }

        @Override // androidx.compose.p003ui.input.nestedscroll.NestedScrollConnection
        /* renamed from: onPreScroll-OzD1aCk */
        public /* synthetic */ long mo69448onPreScrollOzD1aCk(long j, int i) {
            return VG0.m65882d(this, j, i);
        }
    };

    /* renamed from: a */
    public static final void m58862a(View view, LayoutNode layoutNode) {
        long positionInRoot = LayoutCoordinatesKt.positionInRoot(layoutNode.getCoordinates());
        int roundToInt = AbstractC21140mr0.roundToInt(Offset.m71502getXimpl(positionInRoot));
        int roundToInt2 = AbstractC21140mr0.roundToInt(Offset.m71503getYimpl(positionInRoot));
        view.layout(roundToInt, roundToInt2, view.getMeasuredWidth() + roundToInt, view.getMeasuredHeight() + roundToInt2);
    }

    public static final /* synthetic */ void access$layoutAccordingTo(View view, LayoutNode layoutNode) {
        m58862a(view, layoutNode);
    }

    /* renamed from: b */
    public static final float m58861b(int i) {
        return i * (-1);
    }

    /* renamed from: c */
    public static final float m58860c(float f) {
        return f * (-1.0f);
    }

    /* renamed from: d */
    public static final int m58859d(int i) {
        if (i == 0) {
            return NestedScrollSource.Companion.m72628getDragWNlRxjI();
        }
        return NestedScrollSource.Companion.m72629getFlingWNlRxjI();
    }
}
