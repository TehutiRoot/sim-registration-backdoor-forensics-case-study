package th.p047co.dtac.android.dtacone.view.appOne.tol.screen.device;

import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.model.appOne.tol.device.DeviceMeshItem;

@Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.appOne.tol.screen.device.DeviceSelectScreenKt$MeshWifiSection$1 */
/* loaded from: classes10.dex */
public final class DeviceSelectScreenKt$MeshWifiSection$1 extends Lambda implements Function3<ColumnScope, Composer, Integer, Unit> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ boolean $canEdit;
    final /* synthetic */ boolean $isNotAvailable;
    final /* synthetic */ int $maxTotal;
    final /* synthetic */ DeviceMeshItem $mesh;
    final /* synthetic */ Function1<String, Unit> $onDec;
    final /* synthetic */ Function0<Unit> $onEdit;
    final /* synthetic */ Function1<String, Unit> $onInc;

    @Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.view.appOne.tol.screen.device.DeviceSelectScreenKt$MeshWifiSection$1$1 */
    /* loaded from: classes10.dex */
    public static final class C153501 extends Lambda implements Function0<Unit> {
        final /* synthetic */ DeviceMeshItem $mesh;
        final /* synthetic */ Function1<String, Unit> $onInc;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C153501(Function1<? super String, Unit> function1, DeviceMeshItem deviceMeshItem) {
            super(0);
            this.$onInc = function1;
            this.$mesh = deviceMeshItem;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            this.$onInc.invoke(this.$mesh.getMeshOfferCode());
        }
    }

    @Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.view.appOne.tol.screen.device.DeviceSelectScreenKt$MeshWifiSection$1$2 */
    /* loaded from: classes10.dex */
    public static final class C153512 extends Lambda implements Function0<Unit> {
        final /* synthetic */ DeviceMeshItem $mesh;
        final /* synthetic */ Function1<String, Unit> $onDec;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C153512(Function1<? super String, Unit> function1, DeviceMeshItem deviceMeshItem) {
            super(0);
            this.$onDec = function1;
            this.$mesh = deviceMeshItem;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            this.$onDec.invoke(this.$mesh.getMeshOfferCode());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public DeviceSelectScreenKt$MeshWifiSection$1(boolean z, Function0<Unit> function0, int i, DeviceMeshItem deviceMeshItem, boolean z2, int i2, Function1<? super String, Unit> function1, Function1<? super String, Unit> function12) {
        super(3);
        this.$canEdit = z;
        this.$onEdit = function0;
        this.$$dirty = i;
        this.$mesh = deviceMeshItem;
        this.$isNotAvailable = z2;
        this.$maxTotal = i2;
        this.$onInc = function1;
        this.$onDec = function12;
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Unit invoke(ColumnScope columnScope, Composer composer, Integer num) {
        invoke(columnScope, composer, num.intValue());
        return Unit.INSTANCE;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void invoke(@NotNull ColumnScope Card, @Nullable Composer composer, int i) {
        Intrinsics.checkNotNullParameter(Card, "$this$Card");
        if ((i & 81) == 16 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1793980270, i, -1, "th.co.dtac.android.dtacone.view.appOne.tol.screen.device.MeshWifiSection.<anonymous> (DeviceSelectScreen.kt:228)");
        }
        int i2 = R.drawable.ic_mesh;
        int i3 = R.string.one_tol_device_mesh_header;
        boolean z = this.$canEdit;
        Function0<Unit> function0 = this.$onEdit;
        int i4 = this.$$dirty;
        DeviceSelectScreenKt.SubHeaderRow(i2, i3, z, function0, composer, (i4 & 896) | ((i4 >> 6) & 7168), 0);
        if (this.$mesh == null) {
            composer.startReplaceableGroup(1026038595);
            if (this.$isNotAvailable) {
                composer.startReplaceableGroup(1026038629);
                DeviceSelectScreenKt.MeshNotAvailableRow(composer, 0);
                composer.endReplaceableGroup();
            } else {
                composer.startReplaceableGroup(1026038668);
                DeviceSelectScreenKt.ModelEmptyRow(R.string.one_tol_device_mesh_empty, composer, 0);
                composer.endReplaceableGroup();
            }
            composer.endReplaceableGroup();
        } else {
            composer.startReplaceableGroup(1026038733);
            int meshQuantity = this.$mesh.getMeshQuantity();
            DeviceSelectScreenKt.ModelRow(this.$mesh.getMeshOfferName(), true, this.$mesh.getMeshQuantity(), this.$mesh.getMeshAvailableValue(), meshQuantity >= this.$maxTotal, new C153501(this.$onInc, this.$mesh), new C153512(this.$onDec, this.$mesh), composer, 48, 0);
            DeviceSelectScreenKt.TotalRow(meshQuantity, composer, 0);
            composer.endReplaceableGroup();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}