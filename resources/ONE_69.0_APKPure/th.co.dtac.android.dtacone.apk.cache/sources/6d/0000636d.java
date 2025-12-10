package androidx.compose.p003ui.platform;

import android.view.View;
import androidx.compose.p003ui.geometry.Offset;
import androidx.compose.p003ui.input.nestedscroll.NestedScrollConnection;
import androidx.compose.p003ui.unit.Velocity;
import androidx.core.view.NestedScrollingChildHelper;
import androidx.core.view.ViewCompat;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m29143d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J%\u0010\f\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\n\u0010\u000bJ-\u0010\u0010\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ!\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0007\u001a\u00020\u0011H\u0096@ø\u0001\u0000ø\u0001\u0001ø\u0001\u0001¢\u0006\u0004\b\u0012\u0010\u0013J)\u0010\u0017\u001a\u00020\u00112\u0006\u0010\r\u001a\u00020\u00112\u0006\u0010\u0007\u001a\u00020\u0011H\u0096@ø\u0001\u0000ø\u0001\u0001ø\u0001\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001bR\u0014\u0010\u001f\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010#\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006$"}, m29142d2 = {"Landroidx/compose/ui/platform/NestedScrollInteropConnection;", "Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;", "Landroid/view/View;", Promotion.ACTION_VIEW, "<init>", "(Landroid/view/View;)V", "Landroidx/compose/ui/geometry/Offset;", "available", "Landroidx/compose/ui/input/nestedscroll/NestedScrollSource;", "source", "onPreScroll-OzD1aCk", "(JI)J", "onPreScroll", "consumed", "onPostScroll-DzOQY0M", "(JJI)J", "onPostScroll", "Landroidx/compose/ui/unit/Velocity;", "onPreFling-QWom1Mo", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onPreFling", "onPostFling-RZ2iAVY", "(JJLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onPostFling", "", PDPageLabelRange.STYLE_LETTERS_LOWER, "()V", "Landroid/view/View;", "Landroidx/core/view/NestedScrollingChildHelper;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Landroidx/core/view/NestedScrollingChildHelper;", "nestedScrollChildHelper", "", OperatorName.CURVE_TO, "[I", "consumedScrollCache", "ui_release"}, m29141k = 1, m29140mv = {1, 8, 0})
/* renamed from: androidx.compose.ui.platform.NestedScrollInteropConnection */
/* loaded from: classes2.dex */
public final class NestedScrollInteropConnection implements NestedScrollConnection {

    /* renamed from: a */
    public final View f30796a;

    /* renamed from: b */
    public final NestedScrollingChildHelper f30797b;

    /* renamed from: c */
    public final int[] f30798c;

    public NestedScrollInteropConnection(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        this.f30796a = view;
        NestedScrollingChildHelper nestedScrollingChildHelper = new NestedScrollingChildHelper(view);
        nestedScrollingChildHelper.setNestedScrollingEnabled(true);
        this.f30797b = nestedScrollingChildHelper;
        this.f30798c = new int[2];
        ViewCompat.setNestedScrollingEnabled(view, true);
    }

    /* renamed from: a */
    public final void m59167a() {
        if (this.f30797b.hasNestedScrollingParent(0)) {
            this.f30797b.stopNestedScroll(0);
        }
        if (this.f30797b.hasNestedScrollingParent(1)) {
            this.f30797b.stopNestedScroll(1);
        }
    }

    @Override // androidx.compose.p003ui.input.nestedscroll.NestedScrollConnection
    @Nullable
    /* renamed from: onPostFling-RZ2iAVY */
    public Object mo69629onPostFlingRZ2iAVY(long j, long j2, @NotNull Continuation<? super Velocity> continuation) {
        float m59161f;
        float m59161f2;
        NestedScrollingChildHelper nestedScrollingChildHelper = this.f30797b;
        m59161f = NestedScrollInteropConnectionKt.m59161f(Velocity.m74067getXimpl(j2));
        m59161f2 = NestedScrollInteropConnectionKt.m59161f(Velocity.m74068getYimpl(j2));
        if (!nestedScrollingChildHelper.dispatchNestedFling(m59161f, m59161f2, true)) {
            j2 = Velocity.Companion.m74078getZero9UxMQ8M();
        }
        m59167a();
        return Velocity.m74058boximpl(j2);
    }

    @Override // androidx.compose.p003ui.input.nestedscroll.NestedScrollConnection
    /* renamed from: onPostScroll-DzOQY0M */
    public long mo69630onPostScrollDzOQY0M(long j, long j2, int i) {
        int m59165b;
        int m59162e;
        int m59162e2;
        long m59163d;
        NestedScrollingChildHelper nestedScrollingChildHelper = this.f30797b;
        m59165b = NestedScrollInteropConnectionKt.m59165b(j2);
        m59162e = NestedScrollInteropConnectionKt.m59162e(i);
        if (nestedScrollingChildHelper.startNestedScroll(m59165b, m59162e)) {
            ArraysKt___ArraysJvmKt.fill$default(this.f30798c, 0, 0, 0, 6, (Object) null);
            NestedScrollingChildHelper nestedScrollingChildHelper2 = this.f30797b;
            int composeToViewOffset = NestedScrollInteropConnectionKt.composeToViewOffset(Offset.m71686getXimpl(j));
            int composeToViewOffset2 = NestedScrollInteropConnectionKt.composeToViewOffset(Offset.m71687getYimpl(j));
            int composeToViewOffset3 = NestedScrollInteropConnectionKt.composeToViewOffset(Offset.m71686getXimpl(j2));
            int composeToViewOffset4 = NestedScrollInteropConnectionKt.composeToViewOffset(Offset.m71687getYimpl(j2));
            m59162e2 = NestedScrollInteropConnectionKt.m59162e(i);
            nestedScrollingChildHelper2.dispatchNestedScroll(composeToViewOffset, composeToViewOffset2, composeToViewOffset3, composeToViewOffset4, null, m59162e2, this.f30798c);
            m59163d = NestedScrollInteropConnectionKt.m59163d(this.f30798c, j2);
            return m59163d;
        }
        return Offset.Companion.m71702getZeroF1C5BW0();
    }

    @Override // androidx.compose.p003ui.input.nestedscroll.NestedScrollConnection
    @Nullable
    /* renamed from: onPreFling-QWom1Mo */
    public Object mo69631onPreFlingQWom1Mo(long j, @NotNull Continuation<? super Velocity> continuation) {
        float m59161f;
        float m59161f2;
        NestedScrollingChildHelper nestedScrollingChildHelper = this.f30797b;
        m59161f = NestedScrollInteropConnectionKt.m59161f(Velocity.m74067getXimpl(j));
        m59161f2 = NestedScrollInteropConnectionKt.m59161f(Velocity.m74068getYimpl(j));
        if (!nestedScrollingChildHelper.dispatchNestedPreFling(m59161f, m59161f2)) {
            j = Velocity.Companion.m74078getZero9UxMQ8M();
        }
        m59167a();
        return Velocity.m74058boximpl(j);
    }

    @Override // androidx.compose.p003ui.input.nestedscroll.NestedScrollConnection
    /* renamed from: onPreScroll-OzD1aCk */
    public long mo69632onPreScrollOzD1aCk(long j, int i) {
        int m59165b;
        int m59162e;
        int m59162e2;
        long m59163d;
        NestedScrollingChildHelper nestedScrollingChildHelper = this.f30797b;
        m59165b = NestedScrollInteropConnectionKt.m59165b(j);
        m59162e = NestedScrollInteropConnectionKt.m59162e(i);
        if (nestedScrollingChildHelper.startNestedScroll(m59165b, m59162e)) {
            ArraysKt___ArraysJvmKt.fill$default(this.f30798c, 0, 0, 0, 6, (Object) null);
            NestedScrollingChildHelper nestedScrollingChildHelper2 = this.f30797b;
            int composeToViewOffset = NestedScrollInteropConnectionKt.composeToViewOffset(Offset.m71686getXimpl(j));
            int composeToViewOffset2 = NestedScrollInteropConnectionKt.composeToViewOffset(Offset.m71687getYimpl(j));
            int[] iArr = this.f30798c;
            m59162e2 = NestedScrollInteropConnectionKt.m59162e(i);
            nestedScrollingChildHelper2.dispatchNestedPreScroll(composeToViewOffset, composeToViewOffset2, iArr, null, m59162e2);
            m59163d = NestedScrollInteropConnectionKt.m59163d(this.f30798c, j);
            return m59163d;
        }
        return Offset.Companion.m71702getZeroF1C5BW0();
    }
}