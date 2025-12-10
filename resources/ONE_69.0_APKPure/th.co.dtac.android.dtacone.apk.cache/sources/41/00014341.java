package th.p047co.dtac.android.dtacone.view.appOne.tol.screen.inputInfo;

import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.material3.DatePickerColors;
import androidx.compose.material3.DatePickerKt;
import androidx.compose.material3.DatePickerState;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import java.util.Date;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.appOne.tol.screen.inputInfo.InputInfoScreenKt$DatePickerDialogSection$3 */
/* loaded from: classes10.dex */
public final class InputInfoScreenKt$DatePickerDialogSection$3 extends Lambda implements Function3<ColumnScope, Composer, Integer, Unit> {
    final /* synthetic */ DatePickerState $birthdayPickerState;
    final /* synthetic */ DatePickerColors $datePickerColors;
    final /* synthetic */ String $emptySelectDate;

    @Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.view.appOne.tol.screen.inputInfo.InputInfoScreenKt$DatePickerDialogSection$3$1 */
    /* loaded from: classes10.dex */
    public static final class C154841 extends Lambda implements Function1<Long, Boolean> {
        public static final C154841 INSTANCE = new C154841();

        public C154841() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Boolean invoke(Long l) {
            return invoke(l.longValue());
        }

        @NotNull
        public final Boolean invoke(long j) {
            return Boolean.valueOf(j <= new Date().getTime());
        }
    }

    @Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
    @SourceDebugExtension({"SMAP\nInputInfoScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InputInfoScreen.kt\nth/co/dtac/android/dtacone/view/appOne/tol/screen/inputInfo/InputInfoScreenKt$DatePickerDialogSection$3$2\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 5 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 6 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 7 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,1296:1\n1#2:1297\n154#3:1298\n66#4,6:1299\n72#4:1333\n76#4:1338\n78#5,11:1305\n91#5:1337\n456#6,8:1316\n464#6,3:1330\n467#6,3:1334\n4144#7,6:1324\n*S KotlinDebug\n*F\n+ 1 InputInfoScreen.kt\nth/co/dtac/android/dtacone/view/appOne/tol/screen/inputInfo/InputInfoScreenKt$DatePickerDialogSection$3$2\n*L\n1176#1:1298\n1173#1:1299,6\n1173#1:1333\n1173#1:1338\n1173#1:1305,11\n1173#1:1337\n1173#1:1316,8\n1173#1:1330,3\n1173#1:1334,3\n1173#1:1324,6\n*E\n"})
    /* renamed from: th.co.dtac.android.dtacone.view.appOne.tol.screen.inputInfo.InputInfoScreenKt$DatePickerDialogSection$3$2 */
    /* loaded from: classes10.dex */
    public static final class C154852 extends Lambda implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ DatePickerState $birthdayPickerState;
        final /* synthetic */ String $emptySelectDate;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C154852(DatePickerState datePickerState, String str) {
            super(2);
            this.$birthdayPickerState = datePickerState;
            this.$emptySelectDate = str;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0042, code lost:
            if (r2 == null) goto L33;
         */
        @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
        @androidx.compose.runtime.Composable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void invoke(@org.jetbrains.annotations.Nullable androidx.compose.runtime.Composer r56, int r57) {
            /*
                Method dump skipped, instructions count: 380
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: th.p047co.dtac.android.dtacone.view.appOne.tol.screen.inputInfo.InputInfoScreenKt$DatePickerDialogSection$3.C154852.invoke(androidx.compose.runtime.Composer, int):void");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InputInfoScreenKt$DatePickerDialogSection$3(DatePickerState datePickerState, DatePickerColors datePickerColors, String str) {
        super(3);
        this.$birthdayPickerState = datePickerState;
        this.$datePickerColors = datePickerColors;
        this.$emptySelectDate = str;
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Unit invoke(ColumnScope columnScope, Composer composer, Integer num) {
        invoke(columnScope, composer, num.intValue());
        return Unit.INSTANCE;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void invoke(@NotNull ColumnScope DatePickerDialog, @Nullable Composer composer, int i) {
        Intrinsics.checkNotNullParameter(DatePickerDialog, "$this$DatePickerDialog");
        if ((i & 81) == 16 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(322642588, i, -1, "th.co.dtac.android.dtacone.view.appOne.tol.screen.inputInfo.DatePickerDialogSection.<anonymous> (InputInfoScreen.kt:1142)");
        }
        DatePickerKt.DatePicker(this.$birthdayPickerState, null, null, C154841.INSTANCE, ComposableSingletons$InputInfoScreenKt.INSTANCE.m75205getLambda10$app_prodRelease(), ComposableLambdaKt.composableLambda(composer, -1333979254, true, new C154852(this.$birthdayPickerState, this.$emptySelectDate)), false, this.$datePickerColors, composer, 1797120, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}