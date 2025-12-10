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

@Metadata(m28851d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J%\u0010\f\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\n\u0010\u000bJ-\u0010\u0010\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ!\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0007\u001a\u00020\u0011H\u0096@ø\u0001\u0000ø\u0001\u0001ø\u0001\u0001¢\u0006\u0004\b\u0012\u0010\u0013J)\u0010\u0017\u001a\u00020\u00112\u0006\u0010\r\u001a\u00020\u00112\u0006\u0010\u0007\u001a\u00020\u0011H\u0096@ø\u0001\u0000ø\u0001\u0001ø\u0001\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001bR\u0014\u0010\u001f\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010#\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006$"}, m28850d2 = {"Landroidx/compose/ui/platform/NestedScrollInteropConnection;", "Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;", "Landroid/view/View;", Promotion.ACTION_VIEW, "<init>", "(Landroid/view/View;)V", "Landroidx/compose/ui/geometry/Offset;", "available", "Landroidx/compose/ui/input/nestedscroll/NestedScrollSource;", "source", "onPreScroll-OzD1aCk", "(JI)J", "onPreScroll", "consumed", "onPostScroll-DzOQY0M", "(JJI)J", "onPostScroll", "Landroidx/compose/ui/unit/Velocity;", "onPreFling-QWom1Mo", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onPreFling", "onPostFling-RZ2iAVY", "(JJLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onPostFling", "", PDPageLabelRange.STYLE_LETTERS_LOWER, "()V", "Landroid/view/View;", "Landroidx/core/view/NestedScrollingChildHelper;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Landroidx/core/view/NestedScrollingChildHelper;", "nestedScrollChildHelper", "", OperatorName.CURVE_TO, "[I", "consumedScrollCache", "ui_release"}, m28849k = 1, m28848mv = {1, 8, 0})
/* renamed from: androidx.compose.ui.platform.NestedScrollInteropConnection */
/* loaded from: classes2.dex */
public final class NestedScrollInteropConnection implements NestedScrollConnection {

    /* renamed from: a */
    public final View f30708a;

    /* renamed from: b */
    public final NestedScrollingChildHelper f30709b;

    /* renamed from: c */
    public final int[] f30710c;

    public NestedScrollInteropConnection(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        this.f30708a = view;
        NestedScrollingChildHelper nestedScrollingChildHelper = new NestedScrollingChildHelper(view);
        nestedScrollingChildHelper.setNestedScrollingEnabled(true);
        this.f30709b = nestedScrollingChildHelper;
        this.f30710c = new int[2];
        ViewCompat.setNestedScrollingEnabled(view, true);
    }

    /* renamed from: a */
    public final void m59217a() {
        if (this.f30709b.hasNestedScrollingParent(0)) {
            this.f30709b.stopNestedScroll(0);
        }
        if (this.f30709b.hasNestedScrollingParent(1)) {
            this.f30709b.stopNestedScroll(1);
        }
    }

    @Override // androidx.compose.p003ui.input.nestedscroll.NestedScrollConnection
    @Nullable
    /* renamed from: onPostFling-RZ2iAVY */
    public Object mo69445onPostFlingRZ2iAVY(long j, long j2, @NotNull Continuation<? super Velocity> continuation) {
        float m59211f;
        float m59211f2;
        NestedScrollingChildHelper nestedScrollingChildHelper = this.f30709b;
        m59211f = NestedScrollInteropConnectionKt.m59211f(Velocity.m73883getXimpl(j2));
        m59211f2 = NestedScrollInteropConnectionKt.m59211f(Velocity.m73884getYimpl(j2));
        if (!nestedScrollingChildHelper.dispatchNestedFling(m59211f, m59211f2, true)) {
            j2 = Velocity.Companion.m73894getZero9UxMQ8M();
        }
        m59217a();
        return Velocity.m73874boximpl(j2);
    }

    @Override // androidx.compose.p003ui.input.nestedscroll.NestedScrollConnection
    /* renamed from: onPostScroll-DzOQY0M */
    public long mo69446onPostScrollDzOQY0M(long j, long j2, int i) {
        int m59215b;
        int m59212e;
        int m59212e2;
        long m59213d;
        NestedScrollingChildHelper nestedScrollingChildHelper = this.f30709b;
        m59215b = NestedScrollInteropConnectionKt.m59215b(j2);
        m59212e = NestedScrollInteropConnectionKt.m59212e(i);
        if (nestedScrollingChildHelper.startNestedScroll(m59215b, m59212e)) {
            ArraysKt___ArraysJvmKt.fill$default(this.f30710c, 0, 0, 0, 6, (Object) null);
            NestedScrollingChildHelper nestedScrollingChildHelper2 = this.f30709b;
            int composeToViewOffset = NestedScrollInteropConnectionKt.composeToViewOffset(Offset.m71502getXimpl(j));
            int composeToViewOffset2 = NestedScrollInteropConnectionKt.composeToViewOffset(Offset.m71503getYimpl(j));
            int composeToViewOffset3 = NestedScrollInteropConnectionKt.composeToViewOffset(Offset.m71502getXimpl(j2));
            int composeToViewOffset4 = NestedScrollInteropConnectionKt.composeToViewOffset(Offset.m71503getYimpl(j2));
            m59212e2 = NestedScrollInteropConnectionKt.m59212e(i);
            nestedScrollingChildHelper2.dispatchNestedScroll(composeToViewOffset, composeToViewOffset2, composeToViewOffset3, composeToViewOffset4, null, m59212e2, this.f30710c);
            m59213d = NestedScrollInteropConnectionKt.m59213d(this.f30710c, j2);
            return m59213d;
        }
        return Offset.Companion.m71518getZeroF1C5BW0();
    }

    @Override // androidx.compose.p003ui.input.nestedscroll.NestedScrollConnection
    @Nullable
    /* renamed from: onPreFling-QWom1Mo */
    public Object mo69447onPreFlingQWom1Mo(long j, @NotNull Continuation<? super Velocity> continuation) {
        float m59211f;
        float m59211f2;
        NestedScrollingChildHelper nestedScrollingChildHelper = this.f30709b;
        m59211f = NestedScrollInteropConnectionKt.m59211f(Velocity.m73883getXimpl(j));
        m59211f2 = NestedScrollInteropConnectionKt.m59211f(Velocity.m73884getYimpl(j));
        if (!nestedScrollingChildHelper.dispatchNestedPreFling(m59211f, m59211f2)) {
            j = Velocity.Companion.m73894getZero9UxMQ8M();
        }
        m59217a();
        return Velocity.m73874boximpl(j);
    }

    @Override // androidx.compose.p003ui.input.nestedscroll.NestedScrollConnection
    /* renamed from: onPreScroll-OzD1aCk */
    public long mo69448onPreScrollOzD1aCk(long j, int i) {
        int m59215b;
        int m59212e;
        int m59212e2;
        long m59213d;
        NestedScrollingChildHelper nestedScrollingChildHelper = this.f30709b;
        m59215b = NestedScrollInteropConnectionKt.m59215b(j);
        m59212e = NestedScrollInteropConnectionKt.m59212e(i);
        if (nestedScrollingChildHelper.startNestedScroll(m59215b, m59212e)) {
            ArraysKt___ArraysJvmKt.fill$default(this.f30710c, 0, 0, 0, 6, (Object) null);
            NestedScrollingChildHelper nestedScrollingChildHelper2 = this.f30709b;
            int composeToViewOffset = NestedScrollInteropConnectionKt.composeToViewOffset(Offset.m71502getXimpl(j));
            int composeToViewOffset2 = NestedScrollInteropConnectionKt.composeToViewOffset(Offset.m71503getYimpl(j));
            int[] iArr = this.f30710c;
            m59212e2 = NestedScrollInteropConnectionKt.m59212e(i);
            nestedScrollingChildHelper2.dispatchNestedPreScroll(composeToViewOffset, composeToViewOffset2, iArr, null, m59212e2);
            m59213d = NestedScrollInteropConnectionKt.m59213d(this.f30710c, j);
            return m59213d;
        }
        return Offset.Companion.m71518getZeroF1C5BW0();
    }
}
