package androidx.compose.p003ui.node;

import androidx.compose.p003ui.layout.IntrinsicMeasurable;
import androidx.compose.p003ui.layout.IntrinsicMeasureScope;
import androidx.compose.p003ui.layout.Measurable;
import androidx.compose.p003ui.layout.MeasureResult;
import androidx.compose.p003ui.layout.MeasureScope;
import androidx.compose.p003ui.node.NodeMeasuringIntrinsics;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: androidx.compose.ui.node.a */
/* loaded from: classes2.dex */
public abstract /* synthetic */ class AbstractC3526a {

    /* renamed from: androidx.compose.ui.node.a$a */
    /* loaded from: classes2.dex */
    public static final class C3527a implements NodeMeasuringIntrinsics.MeasureBlock {

        /* renamed from: a */
        public final /* synthetic */ LayoutModifierNode f30434a;

        public C3527a(LayoutModifierNode layoutModifierNode) {
            this.f30434a = layoutModifierNode;
        }

        @Override // androidx.compose.p003ui.node.NodeMeasuringIntrinsics.MeasureBlock
        /* renamed from: measure-3p2s80s */
        public final MeasureResult mo72815measure3p2s80s(MeasureScope maxHeight, Measurable intrinsicMeasurable, long j) {
            Intrinsics.checkNotNullParameter(maxHeight, "$this$maxHeight");
            Intrinsics.checkNotNullParameter(intrinsicMeasurable, "intrinsicMeasurable");
            return this.f30434a.mo69155measure3p2s80s(maxHeight, intrinsicMeasurable, j);
        }
    }

    /* renamed from: androidx.compose.ui.node.a$b */
    /* loaded from: classes2.dex */
    public static final class C3528b implements NodeMeasuringIntrinsics.MeasureBlock {

        /* renamed from: a */
        public final /* synthetic */ LayoutModifierNode f30435a;

        public C3528b(LayoutModifierNode layoutModifierNode) {
            this.f30435a = layoutModifierNode;
        }

        @Override // androidx.compose.p003ui.node.NodeMeasuringIntrinsics.MeasureBlock
        /* renamed from: measure-3p2s80s */
        public final MeasureResult mo72815measure3p2s80s(MeasureScope maxWidth, Measurable intrinsicMeasurable, long j) {
            Intrinsics.checkNotNullParameter(maxWidth, "$this$maxWidth");
            Intrinsics.checkNotNullParameter(intrinsicMeasurable, "intrinsicMeasurable");
            return this.f30435a.mo69155measure3p2s80s(maxWidth, intrinsicMeasurable, j);
        }
    }

    /* renamed from: androidx.compose.ui.node.a$c */
    /* loaded from: classes2.dex */
    public static final class C3529c implements NodeMeasuringIntrinsics.MeasureBlock {

        /* renamed from: a */
        public final /* synthetic */ LayoutModifierNode f30436a;

        public C3529c(LayoutModifierNode layoutModifierNode) {
            this.f30436a = layoutModifierNode;
        }

        @Override // androidx.compose.p003ui.node.NodeMeasuringIntrinsics.MeasureBlock
        /* renamed from: measure-3p2s80s */
        public final MeasureResult mo72815measure3p2s80s(MeasureScope minHeight, Measurable intrinsicMeasurable, long j) {
            Intrinsics.checkNotNullParameter(minHeight, "$this$minHeight");
            Intrinsics.checkNotNullParameter(intrinsicMeasurable, "intrinsicMeasurable");
            return this.f30436a.mo69155measure3p2s80s(minHeight, intrinsicMeasurable, j);
        }
    }

    /* renamed from: androidx.compose.ui.node.a$d */
    /* loaded from: classes2.dex */
    public static final class C3530d implements NodeMeasuringIntrinsics.MeasureBlock {

        /* renamed from: a */
        public final /* synthetic */ LayoutModifierNode f30437a;

        public C3530d(LayoutModifierNode layoutModifierNode) {
            this.f30437a = layoutModifierNode;
        }

        @Override // androidx.compose.p003ui.node.NodeMeasuringIntrinsics.MeasureBlock
        /* renamed from: measure-3p2s80s */
        public final MeasureResult mo72815measure3p2s80s(MeasureScope minWidth, Measurable intrinsicMeasurable, long j) {
            Intrinsics.checkNotNullParameter(minWidth, "$this$minWidth");
            Intrinsics.checkNotNullParameter(intrinsicMeasurable, "intrinsicMeasurable");
            return this.f30437a.mo69155measure3p2s80s(minWidth, intrinsicMeasurable, j);
        }
    }

    /* renamed from: a */
    public static int m59388a(LayoutModifierNode layoutModifierNode, IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable measurable, int i) {
        Intrinsics.checkNotNullParameter(intrinsicMeasureScope, "<this>");
        Intrinsics.checkNotNullParameter(measurable, "measurable");
        return NodeMeasuringIntrinsics.INSTANCE.maxHeight$ui_release(new C3527a(layoutModifierNode), intrinsicMeasureScope, measurable, i);
    }

    /* renamed from: b */
    public static int m59387b(LayoutModifierNode layoutModifierNode, IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable measurable, int i) {
        Intrinsics.checkNotNullParameter(intrinsicMeasureScope, "<this>");
        Intrinsics.checkNotNullParameter(measurable, "measurable");
        return NodeMeasuringIntrinsics.INSTANCE.maxWidth$ui_release(new C3528b(layoutModifierNode), intrinsicMeasureScope, measurable, i);
    }

    /* renamed from: c */
    public static int m59386c(LayoutModifierNode layoutModifierNode, IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable measurable, int i) {
        Intrinsics.checkNotNullParameter(intrinsicMeasureScope, "<this>");
        Intrinsics.checkNotNullParameter(measurable, "measurable");
        return NodeMeasuringIntrinsics.INSTANCE.minHeight$ui_release(new C3529c(layoutModifierNode), intrinsicMeasureScope, measurable, i);
    }

    /* renamed from: d */
    public static int m59385d(LayoutModifierNode layoutModifierNode, IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable measurable, int i) {
        Intrinsics.checkNotNullParameter(intrinsicMeasureScope, "<this>");
        Intrinsics.checkNotNullParameter(measurable, "measurable");
        return NodeMeasuringIntrinsics.INSTANCE.minWidth$ui_release(new C3530d(layoutModifierNode), intrinsicMeasureScope, measurable, i);
    }
}
