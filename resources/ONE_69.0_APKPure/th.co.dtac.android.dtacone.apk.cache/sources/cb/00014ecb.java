package th.p047co.dtac.android.dtacone.view.fragment.mrtr_mnp;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.configuration.activity.MrtrMnpComponent;
import th.p047co.dtac.android.dtacone.model.livedata.FragmentNavEvent;
import th.p047co.dtac.android.dtacone.model.mrtr_mnp.authorization.MnpAuthorizationResponse;
import th.p047co.dtac.android.dtacone.model.upPass.UpPassFormResult;
import th.p047co.dtac.android.dtacone.model.upPass.UpPassFormType;
import th.p047co.dtac.android.dtacone.model.upPass.UpPassThemeType;
import th.p047co.dtac.android.dtacone.presenter.bitmap.SaveBitmapWithWaterMarkPresenter;
import th.p047co.dtac.android.dtacone.util.ComponentUtil;
import th.p047co.dtac.android.dtacone.util.bitmap.BitmapUtil;
import th.p047co.dtac.android.dtacone.view.activity.mrtr_mnp.MrtrMnpActivity;
import th.p047co.dtac.android.dtacone.view.fragment.upPass.UpPassFormFragment;
import th.p047co.dtac.android.dtacone.viewmodel.mrtr_mnp.MrtrMnpValidateViewModel;
import th.p047co.dtac.android.dtacone.viewmodel.mrtr_mnp.MrtrMnpViewModel;

@Metadata(m29143d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m29142d2 = {"<anonymous>", "", "it", "Lth/co/dtac/android/dtacone/model/livedata/FragmentNavEvent;", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.fragment.mrtr_mnp.MrtrMnpNavigateToCommonFragment$initView$1$2 */
/* loaded from: classes9.dex */
public final class MrtrMnpNavigateToCommonFragment$initView$1$2 extends Lambda implements Function1<FragmentNavEvent, Unit> {
    final /* synthetic */ MrtrMnpValidateViewModel $this_apply;
    final /* synthetic */ MrtrMnpNavigateToCommonFragment this$0;

    @Metadata(m29143d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m29142d2 = {"<anonymous>", "", "it", "", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.view.fragment.mrtr_mnp.MrtrMnpNavigateToCommonFragment$initView$1$2$1 */
    /* loaded from: classes9.dex */
    public static final class C162041 extends Lambda implements Function1<Boolean, Unit> {
        final /* synthetic */ MrtrMnpValidateViewModel $this_apply;
        final /* synthetic */ MrtrMnpNavigateToCommonFragment this$0;

        @Metadata(m29143d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m29142d2 = {"<anonymous>", "", "fragment", "Lth/co/dtac/android/dtacone/view/fragment/upPass/UpPassFormFragment;", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
        /* renamed from: th.co.dtac.android.dtacone.view.fragment.mrtr_mnp.MrtrMnpNavigateToCommonFragment$initView$1$2$1$1 */
        /* loaded from: classes9.dex */
        public static final class C162051 extends Lambda implements Function1<UpPassFormFragment, Unit> {
            final /* synthetic */ MrtrMnpNavigateToCommonFragment this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C162051(MrtrMnpNavigateToCommonFragment mrtrMnpNavigateToCommonFragment) {
                super(1);
                this.this$0 = mrtrMnpNavigateToCommonFragment;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(UpPassFormFragment upPassFormFragment) {
                invoke2(upPassFormFragment);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull UpPassFormFragment fragment) {
                Intrinsics.checkNotNullParameter(fragment, "fragment");
                ((MrtrMnpComponent) ComponentUtil.getActivityComponent(this.this$0.requireActivity(), MrtrMnpComponent.class)).inject(fragment);
            }
        }

        @Metadata(m29143d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m29142d2 = {"<anonymous>", "", "it", "Lth/co/dtac/android/dtacone/model/upPass/UpPassFormResult;", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
        /* renamed from: th.co.dtac.android.dtacone.view.fragment.mrtr_mnp.MrtrMnpNavigateToCommonFragment$initView$1$2$1$2 */
        /* loaded from: classes9.dex */
        public static final class C162062 extends Lambda implements Function1<UpPassFormResult, Unit> {
            final /* synthetic */ MrtrMnpNavigateToCommonFragment this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C162062(MrtrMnpNavigateToCommonFragment mrtrMnpNavigateToCommonFragment) {
                super(1);
                this.this$0 = mrtrMnpNavigateToCommonFragment;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(UpPassFormResult upPassFormResult) {
                invoke2(upPassFormResult);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull UpPassFormResult it) {
                MrtrMnpViewModel viewModel;
                MrtrMnpViewModel viewModel2;
                Intrinsics.checkNotNullParameter(it, "it");
                viewModel = this.this$0.getViewModel();
                viewModel.setIdDocumentResultForCompare(it.getIdDocument());
                viewModel2 = this.this$0.getViewModel();
                viewModel2.setFaceCompareResult(it.getFaceCompare());
                this.this$0.m6193w(it.getFaceCompare());
                SaveBitmapWithWaterMarkPresenter saveBitmapWithWaterMarkPresenter = this.this$0.getSaveBitmapWithWaterMarkPresenter();
                String string = this.this$0.getString(R.string.prepaid_registration_summary_watermark);
                Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.prepa…ration_summary_watermark)");
                saveBitmapWithWaterMarkPresenter.saveImageWatermark(BitmapUtil.IMAGE_COMPARE, BitmapUtil.IMAGE_COMPARE_WATERMARK, string);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C162041(MrtrMnpNavigateToCommonFragment mrtrMnpNavigateToCommonFragment, MrtrMnpValidateViewModel mrtrMnpValidateViewModel) {
            super(1);
            this.this$0 = mrtrMnpNavigateToCommonFragment;
            this.$this_apply = mrtrMnpValidateViewModel;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
            invoke(bool.booleanValue());
            return Unit.INSTANCE;
        }

        public final void invoke(boolean z) {
            MrtrMnpActivity m6201o;
            MrtrMnpViewModel viewModel;
            MrtrMnpActivity m6201o2;
            MrtrMnpViewModel viewModel2;
            MrtrMnpViewModel viewModel3;
            UpPassFormType faceCompare;
            MrtrMnpViewModel viewModel4;
            m6201o = this.this$0.m6201o();
            m6201o.deleteImage(BitmapUtil.IMAGE_COMPARE_WATERMARK);
            UpPassThemeType upPassThemeType = UpPassThemeType.DtacOne;
            MrtrMnpNavigateToCommonFragment mrtrMnpNavigateToCommonFragment = this.this$0;
            int maxAttempFaceRecognitionReRegist = this.$this_apply.getMaxAttempFaceRecognitionReRegist();
            viewModel = this.this$0.getViewModel();
            MnpAuthorizationResponse authorizeResponse = viewModel.getAuthorizeResponse();
            mrtrMnpNavigateToCommonFragment.setCurrentFormType(new UpPassFormType.FaceCompare(null, authorizeResponse != null ? authorizeResponse.isAllowManualKYC() : false, maxAttempFaceRecognitionReRegist, null, null, false, null, null, 249, null));
            m6201o2 = this.this$0.m6201o();
            UpPassFormFragment.Companion companion = UpPassFormFragment.Companion;
            viewModel2 = this.this$0.getViewModel();
            MnpAuthorizationResponse authorizeResponse2 = viewModel2.getAuthorizeResponse();
            if (authorizeResponse2 != null && authorizeResponse2.isRequireLiveNess()) {
                int maxAttempFaceRecognitionReRegist2 = this.$this_apply.getMaxAttempFaceRecognitionReRegist();
                viewModel4 = this.this$0.getViewModel();
                MnpAuthorizationResponse authorizeResponse3 = viewModel4.getAuthorizeResponse();
                faceCompare = new UpPassFormType.FaceCompareLiveness(null, authorizeResponse3 != null ? authorizeResponse3.isAllowManualKYC() : false, maxAttempFaceRecognitionReRegist2, null, null, false, null, null, 249, null);
            } else {
                int maxAttempFaceRecognitionReRegist3 = this.$this_apply.getMaxAttempFaceRecognitionReRegist();
                viewModel3 = this.this$0.getViewModel();
                MnpAuthorizationResponse authorizeResponse4 = viewModel3.getAuthorizeResponse();
                faceCompare = new UpPassFormType.FaceCompare(null, authorizeResponse4 != null ? authorizeResponse4.isAllowManualKYC() : false, maxAttempFaceRecognitionReRegist3, null, null, false, null, null, 249, null);
            }
            m6201o2.replaceFragment(UpPassFormFragment.Companion.newInstance$default(companion, faceCompare, upPassThemeType, new C162051(this.this$0), null, new C162062(this.this$0), this.this$0.getOnExitCallback(), 8, null), "UpPassFaceCompareOrLivenessFragment");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MrtrMnpNavigateToCommonFragment$initView$1$2(MrtrMnpNavigateToCommonFragment mrtrMnpNavigateToCommonFragment, MrtrMnpValidateViewModel mrtrMnpValidateViewModel) {
        super(1);
        this.this$0 = mrtrMnpNavigateToCommonFragment;
        this.$this_apply = mrtrMnpValidateViewModel;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(FragmentNavEvent fragmentNavEvent) {
        invoke2(fragmentNavEvent);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(@NotNull FragmentNavEvent it) {
        MrtrMnpActivity m6201o;
        Intrinsics.checkNotNullParameter(it, "it");
        m6201o = this.this$0.m6201o();
        m6201o.deleteImageCallback(BitmapUtil.IMAGE_COMPARE, new C162041(this.this$0, this.$this_apply));
    }
}