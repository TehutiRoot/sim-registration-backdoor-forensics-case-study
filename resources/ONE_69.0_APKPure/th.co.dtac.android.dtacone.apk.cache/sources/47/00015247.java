package th.p047co.dtac.android.dtacone.view.fragment.multi_sim.one_common;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.model.livedata.FragmentNavEvent;
import th.p047co.dtac.android.dtacone.model.mrtr_prepaid_reregist.GetAuthorizationByRtrResponse;
import th.p047co.dtac.android.dtacone.model.upPass.UpPassFormResult;
import th.p047co.dtac.android.dtacone.model.upPass.UpPassFormType;
import th.p047co.dtac.android.dtacone.model.upPass.UpPassThemeType;
import th.p047co.dtac.android.dtacone.presenter.bitmap.SaveBitmapWithWaterMarkPresenter;
import th.p047co.dtac.android.dtacone.util.bitmap.BitmapUtil;
import th.p047co.dtac.android.dtacone.view.activity.multi_sim.MrtrPrepaidMultiSimActivity;
import th.p047co.dtac.android.dtacone.view.fragment.upPass.UpPassFormFragment;
import th.p047co.dtac.android.dtacone.viewmodel.mrtr_prepaid_multi_sim.MrtrPrepaidMultiSimViewModel;

@Metadata(m29143d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m29142d2 = {"<anonymous>", "", "it", "Lth/co/dtac/android/dtacone/model/livedata/FragmentNavEvent;", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.fragment.multi_sim.one_common.MrtrMultiSimNavigateToCommonFragment$initView$1$2 */
/* loaded from: classes9.dex */
public final class MrtrMultiSimNavigateToCommonFragment$initView$1$2 extends Lambda implements Function1<FragmentNavEvent, Unit> {
    final /* synthetic */ MrtrPrepaidMultiSimViewModel $this_apply;
    final /* synthetic */ MrtrMultiSimNavigateToCommonFragment this$0;

    @Metadata(m29143d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m29142d2 = {"<anonymous>", "", "it", "", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.view.fragment.multi_sim.one_common.MrtrMultiSimNavigateToCommonFragment$initView$1$2$1 */
    /* loaded from: classes9.dex */
    public static final class C164171 extends Lambda implements Function1<Boolean, Unit> {
        final /* synthetic */ MrtrPrepaidMultiSimViewModel $this_apply;
        final /* synthetic */ MrtrMultiSimNavigateToCommonFragment this$0;

        @Metadata(m29143d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m29142d2 = {"<anonymous>", "", "fragment", "Lth/co/dtac/android/dtacone/view/fragment/upPass/UpPassFormFragment;", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
        /* renamed from: th.co.dtac.android.dtacone.view.fragment.multi_sim.one_common.MrtrMultiSimNavigateToCommonFragment$initView$1$2$1$1 */
        /* loaded from: classes9.dex */
        public static final class C164181 extends Lambda implements Function1<UpPassFormFragment, Unit> {
            final /* synthetic */ MrtrMultiSimNavigateToCommonFragment this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C164181(MrtrMultiSimNavigateToCommonFragment mrtrMultiSimNavigateToCommonFragment) {
                super(1);
                this.this$0 = mrtrMultiSimNavigateToCommonFragment;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(UpPassFormFragment upPassFormFragment) {
                invoke2(upPassFormFragment);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull UpPassFormFragment fragment) {
                MrtrPrepaidMultiSimActivity m4261o;
                Intrinsics.checkNotNullParameter(fragment, "fragment");
                m4261o = this.this$0.m4261o();
                m4261o.setComponentUpPassFrom(fragment);
            }
        }

        @Metadata(m29143d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m29142d2 = {"<anonymous>", "", "it", "Lth/co/dtac/android/dtacone/model/upPass/UpPassFormResult;", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
        /* renamed from: th.co.dtac.android.dtacone.view.fragment.multi_sim.one_common.MrtrMultiSimNavigateToCommonFragment$initView$1$2$1$2 */
        /* loaded from: classes9.dex */
        public static final class C164192 extends Lambda implements Function1<UpPassFormResult, Unit> {
            final /* synthetic */ MrtrPrepaidMultiSimViewModel $this_apply;
            final /* synthetic */ MrtrMultiSimNavigateToCommonFragment this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C164192(MrtrPrepaidMultiSimViewModel mrtrPrepaidMultiSimViewModel, MrtrMultiSimNavigateToCommonFragment mrtrMultiSimNavigateToCommonFragment) {
                super(1);
                this.$this_apply = mrtrPrepaidMultiSimViewModel;
                this.this$0 = mrtrMultiSimNavigateToCommonFragment;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(UpPassFormResult upPassFormResult) {
                invoke2(upPassFormResult);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull UpPassFormResult it) {
                Intrinsics.checkNotNullParameter(it, "it");
                this.$this_apply.setIdDocumentResultForCompare(it.getIdDocument());
                this.$this_apply.setFaceCompareResult(it.getFaceCompare());
                this.this$0.m4254v(it.getFaceCompare());
                SaveBitmapWithWaterMarkPresenter saveBitmapWithWaterMarkPresenter = this.this$0.getSaveBitmapWithWaterMarkPresenter();
                String string = (!this.this$0.isAdded() || this.this$0.getContext() == null) ? "ใช้เพื่อการลงทะเบียนหมายเลขโทรศัพท์เคลื่อนที่เท่านั้น" : this.this$0.getString(R.string.prepaid_registration_summary_watermark);
                Intrinsics.checkNotNullExpressionValue(string, "if (isAdded && context !…รศัพท์เคลื่อนที่เท่านั้น\"");
                saveBitmapWithWaterMarkPresenter.saveImageWatermark(BitmapUtil.IMAGE_COMPARE, BitmapUtil.IMAGE_COMPARE_WATERMARK, string);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C164171(MrtrMultiSimNavigateToCommonFragment mrtrMultiSimNavigateToCommonFragment, MrtrPrepaidMultiSimViewModel mrtrPrepaidMultiSimViewModel) {
            super(1);
            this.this$0 = mrtrMultiSimNavigateToCommonFragment;
            this.$this_apply = mrtrPrepaidMultiSimViewModel;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
            invoke(bool.booleanValue());
            return Unit.INSTANCE;
        }

        public final void invoke(boolean z) {
            MrtrPrepaidMultiSimActivity m4261o;
            MrtrPrepaidMultiSimActivity m4261o2;
            UpPassFormType faceCompare;
            Boolean isAllowManualKYC;
            Boolean isAllowManualKYC2;
            Boolean isAllowManualKYC3;
            m4261o = this.this$0.m4261o();
            m4261o.deleteImage(BitmapUtil.IMAGE_COMPARE_WATERMARK);
            UpPassThemeType upPassThemeType = UpPassThemeType.DtacOne;
            MrtrPrepaidMultiSimViewModel mrtrPrepaidMultiSimViewModel = this.$this_apply;
            int maxAttempFaceRecognitionReRegist = mrtrPrepaidMultiSimViewModel.getMaxAttempFaceRecognitionReRegist();
            GetAuthorizationByRtrResponse getAuthorizationByRtrResponse = this.$this_apply.getGetAuthorizationByRtrResponse();
            mrtrPrepaidMultiSimViewModel.setCurrentFormType(new UpPassFormType.FaceCompare(null, (getAuthorizationByRtrResponse == null || (isAllowManualKYC3 = getAuthorizationByRtrResponse.isAllowManualKYC()) == null) ? false : isAllowManualKYC3.booleanValue(), maxAttempFaceRecognitionReRegist, null, null, false, null, null, 249, null));
            m4261o2 = this.this$0.m4261o();
            UpPassFormFragment.Companion companion = UpPassFormFragment.Companion;
            GetAuthorizationByRtrResponse getAuthorizationByRtrResponse2 = this.$this_apply.getGetAuthorizationByRtrResponse();
            if (getAuthorizationByRtrResponse2 != null ? Intrinsics.areEqual(getAuthorizationByRtrResponse2.isRequireLiveness(), Boolean.TRUE) : false) {
                int maxAttempFaceRecognitionReRegist2 = this.$this_apply.getMaxAttempFaceRecognitionReRegist();
                GetAuthorizationByRtrResponse getAuthorizationByRtrResponse3 = this.$this_apply.getGetAuthorizationByRtrResponse();
                faceCompare = new UpPassFormType.FaceCompareLiveness(null, (getAuthorizationByRtrResponse3 == null || (isAllowManualKYC2 = getAuthorizationByRtrResponse3.isAllowManualKYC()) == null) ? false : isAllowManualKYC2.booleanValue(), maxAttempFaceRecognitionReRegist2, null, null, false, null, null, 249, null);
            } else {
                int maxAttempFaceRecognitionReRegist3 = this.$this_apply.getMaxAttempFaceRecognitionReRegist();
                GetAuthorizationByRtrResponse getAuthorizationByRtrResponse4 = this.$this_apply.getGetAuthorizationByRtrResponse();
                faceCompare = new UpPassFormType.FaceCompare(null, (getAuthorizationByRtrResponse4 == null || (isAllowManualKYC = getAuthorizationByRtrResponse4.isAllowManualKYC()) == null) ? false : isAllowManualKYC.booleanValue(), maxAttempFaceRecognitionReRegist3, null, null, false, null, null, 249, null);
            }
            m4261o2.replaceFragment(UpPassFormFragment.Companion.newInstance$default(companion, faceCompare, upPassThemeType, new C164181(this.this$0), null, new C164192(this.$this_apply, this.this$0), this.this$0.getOnExitCallback(), 8, null), "UpPassFaceCompareOrLivenessFragment");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MrtrMultiSimNavigateToCommonFragment$initView$1$2(MrtrMultiSimNavigateToCommonFragment mrtrMultiSimNavigateToCommonFragment, MrtrPrepaidMultiSimViewModel mrtrPrepaidMultiSimViewModel) {
        super(1);
        this.this$0 = mrtrMultiSimNavigateToCommonFragment;
        this.$this_apply = mrtrPrepaidMultiSimViewModel;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(FragmentNavEvent fragmentNavEvent) {
        invoke2(fragmentNavEvent);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(@NotNull FragmentNavEvent it) {
        MrtrPrepaidMultiSimActivity m4261o;
        Intrinsics.checkNotNullParameter(it, "it");
        m4261o = this.this$0.m4261o();
        m4261o.deleteImageCallback(BitmapUtil.IMAGE_COMPARE, new C164171(this.this$0, this.$this_apply));
    }
}