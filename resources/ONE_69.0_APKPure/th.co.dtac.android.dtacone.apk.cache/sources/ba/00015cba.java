package th.p047co.dtac.android.dtacone.widget.compose.smartCard;

import androidx.compose.animation.AnimatedContentScope;
import androidx.compose.material3.TextKt;
import androidx.compose.p003ui.Modifier;
import androidx.compose.p003ui.res.StringResources_androidKt;
import androidx.compose.p003ui.text.TextLayoutResult;
import androidx.compose.p003ui.text.TextStyle;
import androidx.compose.p003ui.text.font.FontFamily;
import androidx.compose.p003ui.text.font.FontStyle;
import androidx.compose.p003ui.text.font.FontWeight;
import androidx.compose.p003ui.text.style.TextAlign;
import androidx.compose.p003ui.text.style.TextDecoration;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.viewmodel.upPass.state.IdCardReaderState;

@Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.widget.compose.smartCard.IdCardReaderInfoKt$IdCardReaderInfo$3$1$1 */
/* loaded from: classes9.dex */
public final class IdCardReaderInfoKt$IdCardReaderInfo$3$1$1 extends Lambda implements Function4<AnimatedContentScope, IdCardReaderState, Composer, Integer, Unit> {
    final /* synthetic */ TextStyle $textStyle;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IdCardReaderInfoKt$IdCardReaderInfo$3$1$1(TextStyle textStyle) {
        super(4);
        this.$textStyle = textStyle;
    }

    @Override // kotlin.jvm.functions.Function4
    public /* bridge */ /* synthetic */ Unit invoke(AnimatedContentScope animatedContentScope, IdCardReaderState idCardReaderState, Composer composer, Integer num) {
        invoke(animatedContentScope, idCardReaderState, composer, num.intValue());
        return Unit.INSTANCE;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void invoke(@NotNull AnimatedContentScope AnimatedContent, @NotNull IdCardReaderState scope, @Nullable Composer composer, int i) {
        Intrinsics.checkNotNullParameter(AnimatedContent, "$this$AnimatedContent");
        Intrinsics.checkNotNullParameter(scope, "scope");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-194692886, i, -1, "th.co.dtac.android.dtacone.widget.compose.smartCard.IdCardReaderInfo.<anonymous>.<anonymous>.<anonymous> (IdCardReaderInfo.kt:96)");
        }
        if (scope instanceof IdCardReaderState.Disconnected) {
            composer.startReplaceableGroup(702078210);
            TextKt.m70882Text4IGK_g(StringResources_androidKt.stringResource(R.string.mnp_card_reader_description_card_reader_not_found, composer, 0), (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m73725boximpl(TextAlign.Companion.m73732getCentere0LSkKk()), 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, this.$textStyle, composer, 0, 0, 65022);
            composer.endReplaceableGroup();
        } else {
            composer.startReplaceableGroup(702078505);
            TextKt.m70882Text4IGK_g(StringResources_androidKt.stringResource(R.string.postpaid_registration_card_reader_please_insert_card, composer, 0), (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m73725boximpl(TextAlign.Companion.m73732getCentere0LSkKk()), 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, this.$textStyle, composer, 0, 0, 65022);
            composer.endReplaceableGroup();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}