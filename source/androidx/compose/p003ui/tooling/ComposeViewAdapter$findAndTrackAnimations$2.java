package androidx.compose.p003ui.tooling;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(m28849k = 3, m28848mv = {1, 8, 0}, m28846xi = 48)
/* renamed from: androidx.compose.ui.tooling.ComposeViewAdapter$findAndTrackAnimations$2 */
/* loaded from: classes2.dex */
public /* synthetic */ class ComposeViewAdapter$findAndTrackAnimations$2 extends FunctionReferenceImpl implements Function0<Unit> {
    public ComposeViewAdapter$findAndTrackAnimations$2(Object obj) {
        super(0, obj, ComposeViewAdapter.class, "requestLayout", "requestLayout()V", 0);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        ((ComposeViewAdapter) this.receiver).requestLayout();
    }
}
