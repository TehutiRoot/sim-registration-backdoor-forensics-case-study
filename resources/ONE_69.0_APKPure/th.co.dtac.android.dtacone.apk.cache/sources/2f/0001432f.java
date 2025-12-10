package th.p047co.dtac.android.dtacone.view.appOne.tol.screen.inputInfo;

import androidx.compose.animation.AnimatedContentKt;
import androidx.compose.animation.AnimatedContentScope;
import androidx.compose.animation.AnimatedContentTransitionScope;
import androidx.compose.animation.ContentTransform;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.foundation.layout.WindowInsetsSizeKt;
import androidx.compose.foundation.layout.WindowInsets_androidKt;
import androidx.compose.material3.DividerKt;
import androidx.compose.p003ui.Modifier;
import androidx.compose.p003ui.res.ColorResources_androidKt;
import androidx.compose.p003ui.unit.C3623Dp;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.view.appOne.tol.model.customerInfo.address.District;
import th.p047co.dtac.android.dtacone.view.appOne.tol.model.customerInfo.address.PostCode;
import th.p047co.dtac.android.dtacone.view.appOne.tol.model.customerInfo.address.Province;
import th.p047co.dtac.android.dtacone.view.appOne.tol.model.customerInfo.address.SubDistrict;

@Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
@SourceDebugExtension({"SMAP\nInputInfoScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InputInfoScreen.kt\nth/co/dtac/android/dtacone/view/appOne/tol/screen/inputInfo/InputInfoScreenKt$AddressSelectSheet$2\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,1296:1\n154#2:1297\n*S KotlinDebug\n*F\n+ 1 InputInfoScreen.kt\nth/co/dtac/android/dtacone/view/appOne/tol/screen/inputInfo/InputInfoScreenKt$AddressSelectSheet$2\n*L\n756#1:1297\n*E\n"})
/* renamed from: th.co.dtac.android.dtacone.view.appOne.tol.screen.inputInfo.InputInfoScreenKt$AddressSelectSheet$2 */
/* loaded from: classes10.dex */
public final class InputInfoScreenKt$AddressSelectSheet$2 extends Lambda implements Function3<ColumnScope, Composer, Integer, Unit> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ int $$dirty1;
    final /* synthetic */ int $districtId;
    final /* synthetic */ List<District> $districtList;
    final /* synthetic */ Function1<District, Unit> $onDistrictSelect;
    final /* synthetic */ Function1<PostCode, Unit> $onPostCodeSelect;
    final /* synthetic */ Function1<Province, Unit> $onProvinceSelect;
    final /* synthetic */ Function1<SubDistrict, Unit> $onSubDistrictSelect;
    final /* synthetic */ String $postCode;
    final /* synthetic */ List<PostCode> $postCodeList;
    final /* synthetic */ int $provinceId;
    final /* synthetic */ List<Province> $provinceList;
    final /* synthetic */ AddressSelectType $selectType;
    final /* synthetic */ int $subDistrictId;
    final /* synthetic */ List<SubDistrict> $subDistrictList;

    @Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.view.appOne.tol.screen.inputInfo.InputInfoScreenKt$AddressSelectSheet$2$1 */
    /* loaded from: classes10.dex */
    public static final class C154781 extends Lambda implements Function1<AnimatedContentTransitionScope<AddressSelectType>, ContentTransform> {
        public static final C154781 INSTANCE = new C154781();

        @Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
        /* renamed from: th.co.dtac.android.dtacone.view.appOne.tol.screen.inputInfo.InputInfoScreenKt$AddressSelectSheet$2$1$1 */
        /* loaded from: classes10.dex */
        public static final class C154791 extends Lambda implements Function1<Integer, Integer> {
            public static final C154791 INSTANCE = new C154791();

            public C154791() {
                super(1);
            }

            @NotNull
            public final Integer invoke(int i) {
                return Integer.valueOf(i);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Integer invoke(Integer num) {
                return invoke(num.intValue());
            }
        }

        @Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
        /* renamed from: th.co.dtac.android.dtacone.view.appOne.tol.screen.inputInfo.InputInfoScreenKt$AddressSelectSheet$2$1$2 */
        /* loaded from: classes10.dex */
        public static final class C154802 extends Lambda implements Function1<Integer, Integer> {
            public static final C154802 INSTANCE = new C154802();

            public C154802() {
                super(1);
            }

            @NotNull
            public final Integer invoke(int i) {
                return Integer.valueOf(-i);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Integer invoke(Integer num) {
                return invoke(num.intValue());
            }
        }

        @Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
        /* renamed from: th.co.dtac.android.dtacone.view.appOne.tol.screen.inputInfo.InputInfoScreenKt$AddressSelectSheet$2$1$3 */
        /* loaded from: classes10.dex */
        public static final class C154813 extends Lambda implements Function1<Integer, Integer> {
            public static final C154813 INSTANCE = new C154813();

            public C154813() {
                super(1);
            }

            @NotNull
            public final Integer invoke(int i) {
                return Integer.valueOf(-i);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Integer invoke(Integer num) {
                return invoke(num.intValue());
            }
        }

        @Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
        /* renamed from: th.co.dtac.android.dtacone.view.appOne.tol.screen.inputInfo.InputInfoScreenKt$AddressSelectSheet$2$1$4 */
        /* loaded from: classes10.dex */
        public static final class C154824 extends Lambda implements Function1<Integer, Integer> {
            public static final C154824 INSTANCE = new C154824();

            public C154824() {
                super(1);
            }

            @NotNull
            public final Integer invoke(int i) {
                return Integer.valueOf(i);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Integer invoke(Integer num) {
                return invoke(num.intValue());
            }
        }

        public C154781() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        public final ContentTransform invoke(@NotNull AnimatedContentTransitionScope<AddressSelectType> AnimatedContent) {
            Intrinsics.checkNotNullParameter(AnimatedContent, "$this$AnimatedContent");
            AddressSelectType initialState = AnimatedContent.getInitialState();
            AddressSelectType addressSelectType = AddressSelectType.PROVINCE;
            if (initialState != addressSelectType || AnimatedContent.getTargetState() != AddressSelectType.DISTRICT) {
                AddressSelectType initialState2 = AnimatedContent.getInitialState();
                AddressSelectType addressSelectType2 = AddressSelectType.DISTRICT;
                if (initialState2 != addressSelectType2 || AnimatedContent.getTargetState() != AddressSelectType.SUB_DISTRICT) {
                    AddressSelectType initialState3 = AnimatedContent.getInitialState();
                    AddressSelectType addressSelectType3 = AddressSelectType.SUB_DISTRICT;
                    if (initialState3 != addressSelectType3 || AnimatedContent.getTargetState() != AddressSelectType.POST_CODE) {
                        if ((AnimatedContent.getInitialState() == addressSelectType2 && AnimatedContent.getTargetState() == addressSelectType) || ((AnimatedContent.getInitialState() == addressSelectType3 && AnimatedContent.getTargetState() == addressSelectType2) || (AnimatedContent.getInitialState() == AddressSelectType.POST_CODE && AnimatedContent.getTargetState() == addressSelectType3))) {
                            return AnimatedContentKt.togetherWith(EnterExitTransitionKt.slideInHorizontally$default(null, C154813.INSTANCE, 1, null).plus(EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null)), EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.slideOutHorizontally$default(null, C154824.INSTANCE, 1, null)));
                        }
                        return AnimatedContentKt.togetherWith(EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null), EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null));
                    }
                }
            }
            return AnimatedContentKt.togetherWith(EnterExitTransitionKt.slideInHorizontally$default(null, C154791.INSTANCE, 1, null).plus(EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null)), EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.slideOutHorizontally$default(null, C154802.INSTANCE, 1, null)));
        }
    }

    @Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.view.appOne.tol.screen.inputInfo.InputInfoScreenKt$AddressSelectSheet$2$2 */
    /* loaded from: classes10.dex */
    public static final class C154832 extends Lambda implements Function4<AnimatedContentScope, AddressSelectType, Composer, Integer, Unit> {
        final /* synthetic */ int $$dirty;
        final /* synthetic */ int $$dirty1;
        final /* synthetic */ int $districtId;
        final /* synthetic */ List<District> $districtList;
        final /* synthetic */ Function1<District, Unit> $onDistrictSelect;
        final /* synthetic */ Function1<PostCode, Unit> $onPostCodeSelect;
        final /* synthetic */ Function1<Province, Unit> $onProvinceSelect;
        final /* synthetic */ Function1<SubDistrict, Unit> $onSubDistrictSelect;
        final /* synthetic */ String $postCode;
        final /* synthetic */ List<PostCode> $postCodeList;
        final /* synthetic */ int $provinceId;
        final /* synthetic */ List<Province> $provinceList;
        final /* synthetic */ int $subDistrictId;
        final /* synthetic */ List<SubDistrict> $subDistrictList;

        @Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
        /* renamed from: th.co.dtac.android.dtacone.view.appOne.tol.screen.inputInfo.InputInfoScreenKt$AddressSelectSheet$2$2$WhenMappings */
        /* loaded from: classes10.dex */
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[AddressSelectType.values().length];
                try {
                    iArr[AddressSelectType.PROVINCE.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[AddressSelectType.DISTRICT.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[AddressSelectType.SUB_DISTRICT.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[AddressSelectType.POST_CODE.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C154832(List<Province> list, int i, Function1<? super Province, Unit> function1, int i2, int i3, List<District> list2, int i4, Function1<? super District, Unit> function12, List<SubDistrict> list3, int i5, Function1<? super SubDistrict, Unit> function13, List<PostCode> list4, String str, Function1<? super PostCode, Unit> function14) {
            super(4);
            this.$provinceList = list;
            this.$provinceId = i;
            this.$onProvinceSelect = function1;
            this.$$dirty = i2;
            this.$$dirty1 = i3;
            this.$districtList = list2;
            this.$districtId = i4;
            this.$onDistrictSelect = function12;
            this.$subDistrictList = list3;
            this.$subDistrictId = i5;
            this.$onSubDistrictSelect = function13;
            this.$postCodeList = list4;
            this.$postCode = str;
            this.$onPostCodeSelect = function14;
        }

        @Override // kotlin.jvm.functions.Function4
        public /* bridge */ /* synthetic */ Unit invoke(AnimatedContentScope animatedContentScope, AddressSelectType addressSelectType, Composer composer, Integer num) {
            invoke(animatedContentScope, addressSelectType, composer, num.intValue());
            return Unit.INSTANCE;
        }

        @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
        @Composable
        public final void invoke(@NotNull AnimatedContentScope AnimatedContent, @NotNull AddressSelectType it, @Nullable Composer composer, int i) {
            Intrinsics.checkNotNullParameter(AnimatedContent, "$this$AnimatedContent");
            Intrinsics.checkNotNullParameter(it, "it");
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1297036971, i, -1, "th.co.dtac.android.dtacone.view.appOne.tol.screen.inputInfo.AddressSelectSheet.<anonymous>.<anonymous> (InputInfoScreen.kt:780)");
            }
            int i2 = WhenMappings.$EnumSwitchMapping$0[it.ordinal()];
            if (i2 == 1) {
                composer.startReplaceableGroup(-1260120174);
                InputInfoScreenKt.m9526C(this.$provinceList, this.$provinceId, this.$onProvinceSelect, composer, ((this.$$dirty1 << 3) & 896) | ((this.$$dirty >> 3) & 112) | 8);
                composer.endReplaceableGroup();
            } else if (i2 == 2) {
                composer.startReplaceableGroup(-1260120071);
                if (this.$provinceId == 0) {
                    composer.startReplaceableGroup(-1260120028);
                    InputInfoScreenKt.m9526C(this.$provinceList, this.$provinceId, this.$onProvinceSelect, composer, ((this.$$dirty1 << 3) & 896) | ((this.$$dirty >> 3) & 112) | 8);
                    composer.endReplaceableGroup();
                } else {
                    composer.startReplaceableGroup(-1260119946);
                    List<District> list = this.$districtList;
                    int i3 = this.$provinceId;
                    int i4 = this.$districtId;
                    Function1<District, Unit> function1 = this.$onDistrictSelect;
                    int i5 = this.$$dirty;
                    InputInfoScreenKt.m9511j(list, i3, i4, function1, composer, ((i5 >> 3) & 896) | ((i5 >> 3) & 112) | 8 | ((this.$$dirty1 << 3) & 7168));
                    composer.endReplaceableGroup();
                }
                composer.endReplaceableGroup();
            } else if (i2 == 3) {
                composer.startReplaceableGroup(-1260119809);
                if (this.$provinceId == 0) {
                    composer.startReplaceableGroup(-1260119737);
                    InputInfoScreenKt.m9526C(this.$provinceList, this.$provinceId, this.$onProvinceSelect, composer, ((this.$$dirty1 << 3) & 896) | ((this.$$dirty >> 3) & 112) | 8);
                    composer.endReplaceableGroup();
                } else if (this.$districtId == 0) {
                    composer.startReplaceableGroup(-1260119637);
                    List<District> list2 = this.$districtList;
                    int i6 = this.$provinceId;
                    int i7 = this.$districtId;
                    Function1<District, Unit> function12 = this.$onDistrictSelect;
                    int i8 = this.$$dirty;
                    InputInfoScreenKt.m9511j(list2, i6, i7, function12, composer, ((i8 >> 3) & 896) | ((i8 >> 3) & 112) | 8 | ((this.$$dirty1 << 3) & 7168));
                    composer.endReplaceableGroup();
                } else {
                    composer.startReplaceableGroup(-1260119369);
                    List<SubDistrict> list3 = this.$subDistrictList;
                    int i9 = this.$provinceId;
                    int i10 = this.$districtId;
                    int i11 = this.$subDistrictId;
                    Function1<SubDistrict, Unit> function13 = this.$onSubDistrictSelect;
                    int i12 = this.$$dirty;
                    InputInfoScreenKt.m9522G(list3, i9, i10, i11, function13, composer, ((i12 >> 3) & 7168) | ((i12 >> 3) & 112) | 8 | ((i12 >> 3) & 896) | (57344 & (this.$$dirty1 << 3)));
                    composer.endReplaceableGroup();
                }
                composer.endReplaceableGroup();
            } else if (i2 != 4) {
                composer.startReplaceableGroup(-1260117940);
                composer.endReplaceableGroup();
            } else {
                composer.startReplaceableGroup(-1260118999);
                if (this.$provinceId == 0) {
                    composer.startReplaceableGroup(-1260118927);
                    InputInfoScreenKt.m9526C(this.$provinceList, this.$provinceId, this.$onProvinceSelect, composer, ((this.$$dirty1 << 3) & 896) | ((this.$$dirty >> 3) & 112) | 8);
                    composer.endReplaceableGroup();
                } else if (this.$districtId == 0) {
                    composer.startReplaceableGroup(-1260118827);
                    List<District> list4 = this.$districtList;
                    int i13 = this.$provinceId;
                    int i14 = this.$districtId;
                    Function1<District, Unit> function14 = this.$onDistrictSelect;
                    int i15 = this.$$dirty;
                    InputInfoScreenKt.m9511j(list4, i13, i14, function14, composer, ((i15 >> 3) & 896) | ((i15 >> 3) & 112) | 8 | ((this.$$dirty1 << 3) & 7168));
                    composer.endReplaceableGroup();
                } else if (this.$subDistrictId == 0) {
                    composer.startReplaceableGroup(-1260118573);
                    List<SubDistrict> list5 = this.$subDistrictList;
                    int i16 = this.$provinceId;
                    int i17 = this.$districtId;
                    int i18 = this.$subDistrictId;
                    Function1<SubDistrict, Unit> function15 = this.$onSubDistrictSelect;
                    int i19 = this.$$dirty;
                    InputInfoScreenKt.m9522G(list5, i16, i17, i18, function15, composer, ((i19 >> 3) & 7168) | ((i19 >> 3) & 112) | 8 | ((i19 >> 3) & 896) | (57344 & (this.$$dirty1 << 3)));
                    composer.endReplaceableGroup();
                } else {
                    composer.startReplaceableGroup(-1260118281);
                    List<PostCode> list6 = this.$postCodeList;
                    int i20 = this.$provinceId;
                    int i21 = this.$districtId;
                    int i22 = this.$subDistrictId;
                    String str = this.$postCode;
                    Function1<PostCode, Unit> function16 = this.$onPostCodeSelect;
                    int i23 = this.$$dirty;
                    InputInfoScreenKt.m9527B(list6, i20, i21, i22, str, function16, composer, ((i23 >> 3) & 57344) | ((i23 >> 3) & 112) | 8 | ((i23 >> 3) & 896) | ((i23 >> 3) & 7168) | ((this.$$dirty1 << 3) & 458752));
                    composer.endReplaceableGroup();
                }
                composer.endReplaceableGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public InputInfoScreenKt$AddressSelectSheet$2(AddressSelectType addressSelectType, int i, List<Province> list, int i2, Function1<? super Province, Unit> function1, int i3, List<District> list2, int i4, Function1<? super District, Unit> function12, List<SubDistrict> list3, int i5, Function1<? super SubDistrict, Unit> function13, List<PostCode> list4, String str, Function1<? super PostCode, Unit> function14) {
        super(3);
        this.$selectType = addressSelectType;
        this.$$dirty = i;
        this.$provinceList = list;
        this.$provinceId = i2;
        this.$onProvinceSelect = function1;
        this.$$dirty1 = i3;
        this.$districtList = list2;
        this.$districtId = i4;
        this.$onDistrictSelect = function12;
        this.$subDistrictList = list3;
        this.$subDistrictId = i5;
        this.$onSubDistrictSelect = function13;
        this.$postCodeList = list4;
        this.$postCode = str;
        this.$onPostCodeSelect = function14;
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Unit invoke(ColumnScope columnScope, Composer composer, Integer num) {
        invoke(columnScope, composer, num.intValue());
        return Unit.INSTANCE;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void invoke(@NotNull ColumnScope ModalBottomSheet, @Nullable Composer composer, int i) {
        int i2;
        Intrinsics.checkNotNullParameter(ModalBottomSheet, "$this$ModalBottomSheet");
        if ((i & 14) == 0) {
            i2 = (composer.changed(ModalBottomSheet) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 91) == 18 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(999112912, i, -1, "th.co.dtac.android.dtacone.view.appOne.tol.screen.inputInfo.AddressSelectSheet.<anonymous> (InputInfoScreen.kt:754)");
        }
        DividerKt.m70554Divider9IZ8Weo(null, C3623Dp.m73842constructorimpl(1), ColorResources_androidKt.colorResource(R.color.line_platinum, composer, 0), composer, 48, 1);
        Modifier.Companion companion = Modifier.Companion;
        AnimatedContentKt.AnimatedContent(this.$selectType, AbstractC1256Rt.m66581a(ModalBottomSheet, SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), 1.0f, false, 2, null), C154781.INSTANCE, null, null, null, ComposableLambdaKt.composableLambda(composer, 1297036971, true, new C154832(this.$provinceList, this.$provinceId, this.$onProvinceSelect, this.$$dirty, this.$$dirty1, this.$districtList, this.$districtId, this.$onDistrictSelect, this.$subDistrictList, this.$subDistrictId, this.$onSubDistrictSelect, this.$postCodeList, this.$postCode, this.$onPostCodeSelect)), composer, (this.$$dirty & 14) | 1573248, 56);
        SpacerKt.Spacer(WindowInsetsSizeKt.windowInsetsBottomHeight(companion, WindowInsets_androidKt.getNavigationBars(WindowInsets.Companion, composer, 8)), composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}