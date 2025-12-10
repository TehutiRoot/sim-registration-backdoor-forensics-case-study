package th.p047co.dtac.android.dtacone.view.appOne.pre2post.fragment;

import android.content.Intent;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import th.p047co.dtac.android.dtacone.extension.format.PhoneNumberExtKt;
import th.p047co.dtac.android.dtacone.extension.format.StringExtKt;
import th.p047co.dtac.android.dtacone.model.Resource;
import th.p047co.dtac.android.dtacone.model.StatusResource;
import th.p047co.dtac.android.dtacone.model.appOne.oneDeviceSaleTrue.response.OneDeviceSaleAuthorizationData;
import th.p047co.dtac.android.dtacone.model.face_recognition.FaceRecResponse;
import th.p047co.dtac.android.dtacone.view.appOne.deviceSaleTrueCompany.activity.OneDeviceSaleTrueActivity;
import th.p047co.dtac.android.dtacone.view.appOne.pre2post.activity.OnePre2PostActivity;
import th.p047co.dtac.android.dtacone.view.appOne.pre2post.viewModel.OnePre2PostViewModel;

@Metadata(m29143d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, m29142d2 = {"<anonymous>", "", "it", "Lth/co/dtac/android/dtacone/model/Resource;", "Lth/co/dtac/android/dtacone/model/appOne/oneDeviceSaleTrue/response/OneDeviceSaleAuthorizationData;", "kotlin.jvm.PlatformType", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.appOne.pre2post.fragment.OnePre2PostSuccessFragment$setupObserve$1$2 */
/* loaded from: classes10.dex */
public final class OnePre2PostSuccessFragment$setupObserve$1$2 extends Lambda implements Function1<Resource<? extends OneDeviceSaleAuthorizationData>, Unit> {
    final /* synthetic */ OnePre2PostViewModel $this_apply;
    final /* synthetic */ OnePre2PostSuccessFragment this$0;

    @Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.view.appOne.pre2post.fragment.OnePre2PostSuccessFragment$setupObserve$1$2$WhenMappings */
    /* loaded from: classes10.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[StatusResource.values().length];
            try {
                iArr[StatusResource.LOADING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[StatusResource.SUCCESS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[StatusResource.ERROR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OnePre2PostSuccessFragment$setupObserve$1$2(OnePre2PostSuccessFragment onePre2PostSuccessFragment, OnePre2PostViewModel onePre2PostViewModel) {
        super(1);
        this.this$0 = onePre2PostSuccessFragment;
        this.$this_apply = onePre2PostViewModel;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Resource<? extends OneDeviceSaleAuthorizationData> resource) {
        invoke2((Resource<OneDeviceSaleAuthorizationData>) resource);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(Resource<OneDeviceSaleAuthorizationData> resource) {
        Resource<OneDeviceSaleAuthorizationData> resourceContentIfNotHandled;
        OnePre2PostActivity m11218m;
        OnePre2PostActivity m11218m2;
        if (resource == null || (resourceContentIfNotHandled = resource.getResourceContentIfNotHandled()) == null) {
            return;
        }
        OnePre2PostSuccessFragment onePre2PostSuccessFragment = this.this$0;
        OnePre2PostViewModel onePre2PostViewModel = this.$this_apply;
        int i = WhenMappings.$EnumSwitchMapping$0[resourceContentIfNotHandled.getStatus().ordinal()];
        if (i != 2) {
            if (i != 3) {
                return;
            }
            onePre2PostSuccessFragment.dismissLoading();
            return;
        }
        onePre2PostSuccessFragment.dismissLoading();
        m11218m = onePre2PostSuccessFragment.m11218m();
        Intent intent = new Intent(m11218m, OneDeviceSaleTrueActivity.class);
        intent.putExtra(OneDeviceSaleTrueActivity.EXTRA_ID_CARD_INFO, onePre2PostViewModel.getOneModel().getIdCardInformationCollection());
        intent.putExtra(OneDeviceSaleTrueActivity.EXTRA_SELECTED_PROPOSITION, onePre2PostViewModel.getOneModel().getPropositionTrueItem());
        intent.putExtra(OneDeviceSaleTrueActivity.EXTRA_SELECTED_PACKAGE_ITEM, onePre2PostViewModel.getOneModel().getPackageTrueItem());
        intent.putExtra(OneDeviceSaleTrueActivity.EXTRA_AUTHORIZATION_DEVICE_SALE, resourceContentIfNotHandled.getData());
        intent.putExtra(OneDeviceSaleTrueActivity.EXTRA_LEGAL_ADDRESS, onePre2PostViewModel.getOneModel().getAddressMailingData());
        intent.putExtra(OneDeviceSaleTrueActivity.EXTRA_IS_SMART_CARD, onePre2PostViewModel.getOneModel().isSmartCard());
        intent.putExtra(OneDeviceSaleTrueActivity.EXTRA_ID_CARD_TYPE, onePre2PostViewModel.getOneModel().getIdCardType());
        intent.putExtra("EXTRA_SUBSCRIBER_NUMBER", StringExtKt.toRemoveDash(PhoneNumberExtKt.toPretty(onePre2PostViewModel.getOneModel().getSubscriberNumber())));
        intent.putExtra(OneDeviceSaleTrueActivity.EXTRA_ID_NUMBER, onePre2PostViewModel.getOneModel().getIdNumber());
        intent.putExtra(OneDeviceSaleTrueActivity.EXTRA_OTP_CODE, onePre2PostViewModel.getOneModel().getOtpCode());
        intent.putExtra(OneDeviceSaleTrueActivity.EXTRA_VERIFY_SUBSCRIBER_PRE_TO_POST, onePre2PostViewModel.getOneModel().getVerifySubscriberPreToPostData());
        intent.putExtra(OneDeviceSaleTrueActivity.EXTRA_IMAGE_LIST, onePre2PostViewModel.getImageListForDeviceSaleTrueCompany());
        intent.putExtra(OneDeviceSaleTrueActivity.EXTRA_IS_FACE_REG_COGNITION, onePre2PostViewModel.isEnableFaceRecogPre2Post());
        FaceRecResponse faceRecResponse = onePre2PostViewModel.getOneModel().getFaceRecResponse();
        intent.putExtra(OneDeviceSaleTrueActivity.EXTRA_IS_FACE_REG_COGNITION_CONFIDENCE, faceRecResponse != null ? faceRecResponse.getConfidence() : null);
        intent.putExtra(OneDeviceSaleTrueActivity.EXTRA_IS_KYC, onePre2PostViewModel.isKYC());
        intent.putExtra(OneDeviceSaleTrueActivity.EXTRA_IS_CONSENT_ID, String.valueOf(onePre2PostViewModel.getOneModel().getConsentId()));
        onePre2PostSuccessFragment.startActivity(intent);
        m11218m2 = onePre2PostSuccessFragment.m11218m();
        m11218m2.finish();
    }
}