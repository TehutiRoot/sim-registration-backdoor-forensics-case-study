package androidx.compose.p003ui.text.input;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata(m29143d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m29142d2 = {"<anonymous>", "", "it", "Landroidx/compose/ui/text/input/ImeAction;", "invoke-KlQnJC8", "(I)V"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: androidx.compose.ui.text.input.TextInputServiceAndroid$stopInput$2 */
/* loaded from: classes2.dex */
public final class TextInputServiceAndroid$stopInput$2 extends Lambda implements Function1<ImeAction, Unit> {
    public static final TextInputServiceAndroid$stopInput$2 INSTANCE = new TextInputServiceAndroid$stopInput$2();

    public TextInputServiceAndroid$stopInput$2() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(ImeAction imeAction) {
        m73611invokeKlQnJC8(imeAction.m73540unboximpl());
        return Unit.INSTANCE;
    }

    /* renamed from: invoke-KlQnJC8  reason: not valid java name */
    public final void m73611invokeKlQnJC8(int i) {
    }
}