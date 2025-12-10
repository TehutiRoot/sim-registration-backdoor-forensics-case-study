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
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.R;

@Metadata(m28851d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, m28850d2 = {"<anonymous>", "", "invoke", "(Landroidx/compose/runtime/Composer;I)V"}, m28849k = 3, m28848mv = {1, 8, 0}, m28846xi = 48)
/* renamed from: th.co.dtac.android.dtacone.app_one.widget.composable.ComposableSingletons$OneDialogKt$lambda-8$1  reason: invalid class name */
/* loaded from: classes7.dex */
public final class ComposableSingletons$OneDialogKt$lambda8$1 extends Lambda implements Function2<Composer, Integer, Unit> {
    public static final ComposableSingletons$OneDialogKt$lambda8$1 INSTANCE = new ComposableSingletons$OneDialogKt$lambda8$1();

    @Metadata(m28849k = 3, m28848mv = {1, 8, 0}, m28846xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.app_one.widget.composable.ComposableSingletons$OneDialogKt$lambda-8$1$1 */
    /* loaded from: classes7.dex */
    public static final class C141711 extends Lambda implements Function0<Unit> {
        public static final C141711 INSTANCE = new C141711();

        public C141711() {
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
    /* renamed from: th.co.dtac.android.dtacone.app_one.widget.composable.ComposableSingletons$OneDialogKt$lambda-8$1$2 */
    /* loaded from: classes7.dex */
    public static final class C141722 extends Lambda implements Function0<Unit> {
        public static final C141722 INSTANCE = new C141722();

        public C141722() {
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

    public ComposableSingletons$OneDialogKt$lambda8$1() {
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
            ComposerKt.traceEventStart(1942570797, i, -1, "th.co.dtac.android.dtacone.app_one.widget.composable.ComposableSingletons$OneDialogKt.lambda-8.<anonymous> (OneDialog.kt:611)");
        }
        OneDialogKt.OneDialogChooser(StringResources_androidKt.stringResource(R.string.one_tol_take_more_photo_message, composer, 0), null, null, C141711.INSTANCE, C141722.INSTANCE, composer, 27648, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
