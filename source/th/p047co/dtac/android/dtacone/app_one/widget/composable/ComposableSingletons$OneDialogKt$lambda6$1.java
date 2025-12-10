package th.p047co.dtac.android.dtacone.app_one.widget.composable;

import androidx.compose.p003ui.res.StringResources_androidKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import org.apache.commons.cli.HelpFormatter;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.R;

@Metadata(m28851d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, m28850d2 = {"<anonymous>", "", "invoke", "(Landroidx/compose/runtime/Composer;I)V"}, m28849k = 3, m28848mv = {1, 8, 0}, m28846xi = 48)
/* renamed from: th.co.dtac.android.dtacone.app_one.widget.composable.ComposableSingletons$OneDialogKt$lambda-6$1  reason: invalid class name */
/* loaded from: classes7.dex */
public final class ComposableSingletons$OneDialogKt$lambda6$1 extends Lambda implements Function2<Composer, Integer, Unit> {
    public static final ComposableSingletons$OneDialogKt$lambda6$1 INSTANCE = new ComposableSingletons$OneDialogKt$lambda6$1();

    @Metadata(m28849k = 3, m28848mv = {1, 8, 0}, m28846xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.app_one.widget.composable.ComposableSingletons$OneDialogKt$lambda-6$1$1 */
    /* loaded from: classes7.dex */
    public static final class C141671 extends Lambda implements Function0<Unit> {
        public static final C141671 INSTANCE = new C141671();

        public C141671() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28849k = 3, m28848mv = {1, 8, 0}, m28846xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.app_one.widget.composable.ComposableSingletons$OneDialogKt$lambda-6$1$2 */
    /* loaded from: classes7.dex */
    public static final class C141682 extends Lambda implements Function0<Unit> {
        public static final C141682 INSTANCE = new C141682();

        public C141682() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }
    }

    public ComposableSingletons$OneDialogKt$lambda6$1() {
        super(2);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void invoke(@Nullable Composer composer, int i) {
        if ((i & 11) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(96353486, i, -1, "th.co.dtac.android.dtacone.app_one.widget.composable.ComposableSingletons$OneDialogKt.lambda-6.<anonymous> (OneDialog.kt:586)");
        }
        OneDialogKt.OneDialogConfirm(AbstractC20204hN1.replace$default(StringResources_androidKt.stringResource(R.string.one_tol_take_photo_id_card_face_detection_invalid_max_attempt, composer, 0), HelpFormatter.DEFAULT_LONG_OPT_SEPARATOR, "\n", false, 4, (Object) null), "Confirm Test", null, null, C141671.INSTANCE, C141682.INSTANCE, composer, 221232, 12);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
