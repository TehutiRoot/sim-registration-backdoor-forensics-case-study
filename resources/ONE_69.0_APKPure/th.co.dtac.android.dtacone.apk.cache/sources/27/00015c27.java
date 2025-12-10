package th.p047co.dtac.android.dtacone.widget.compose.consent;

import androidx.compose.runtime.MutableState;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

@Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.widget.compose.consent.ConsentScreenKt$ConsentSection$2$1$1$1$1$1$1 */
/* loaded from: classes9.dex */
public final class ConsentScreenKt$ConsentSection$2$1$1$1$1$1$1 extends Lambda implements Function0<Unit> {
    final /* synthetic */ String $language;
    final /* synthetic */ MutableState<String> $selectedLanguage$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConsentScreenKt$ConsentSection$2$1$1$1$1$1$1(String str, MutableState<String> mutableState) {
        super(0);
        this.$language = str;
        this.$selectedLanguage$delegate = mutableState;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        ConsentScreenKt.m1785e(this.$selectedLanguage$delegate, this.$language);
    }
}