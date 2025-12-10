package th.p047co.dtac.android.dtacone.view.fragment.mrtr_prepaid_registration.common;

import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import th.p047co.dtac.android.dtacone.extension.format.PhoneNumberExtKt;
import th.p047co.dtac.android.dtacone.model.livedata.FragmentNavEvent;
import th.p047co.dtac.android.dtacone.model.mrtr_prepaid.validate_barcode.response.MrtrPrepaidValidateBarcodeResponse;
import th.p047co.dtac.android.dtacone.model.mrtr_prepaid_reregist.GetAuthorizationByRtrResponse;
import th.p047co.dtac.android.dtacone.model.prepaid.PrepaidConfig;
import th.p047co.dtac.android.dtacone.model.upPass.UpPassFormType;
import th.p047co.dtac.android.dtacone.model.updateprepaid.UpdatePrepaidOptionalImage;
import th.p047co.dtac.android.dtacone.presenter.bitmap.DeleteBitmapPresenter;
import th.p047co.dtac.android.dtacone.util.bitmap.BitmapUtil;
import th.p047co.dtac.android.dtacone.view.activity.mrtr_prepaid_registration.MrtrPrepaidRegistrationActivity;
import th.p047co.dtac.android.dtacone.view.fragment.upPass.UpPassFormFragment;
import th.p047co.dtac.android.dtacone.viewmodel.mrtr_prepaid_registration.MrtrPrepaidRegistrationViewModel;

@Metadata(m29143d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m29142d2 = {"<anonymous>", "", "it", "Lth/co/dtac/android/dtacone/model/livedata/FragmentNavEvent;", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.fragment.mrtr_prepaid_registration.common.MrtrPrepaidNavigateToCommonFragment$initView$1$2 */
/* loaded from: classes9.dex */
public final class MrtrPrepaidNavigateToCommonFragment$initView$1$2 extends Lambda implements Function1<FragmentNavEvent, Unit> {
    final /* synthetic */ MrtrPrepaidNavigateToCommonFragment this$0;

    @Metadata(m29143d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m29142d2 = {"<anonymous>", "", "it", "", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.view.fragment.mrtr_prepaid_registration.common.MrtrPrepaidNavigateToCommonFragment$initView$1$2$1 */
    /* loaded from: classes9.dex */
    public static final class C163721 extends Lambda implements Function1<Boolean, Unit> {
        final /* synthetic */ MrtrPrepaidNavigateToCommonFragment this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C163721(MrtrPrepaidNavigateToCommonFragment mrtrPrepaidNavigateToCommonFragment) {
            super(1);
            this.this$0 = mrtrPrepaidNavigateToCommonFragment;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
            invoke(bool.booleanValue());
            return Unit.INSTANCE;
        }

        public final void invoke(boolean z) {
            MrtrPrepaidRegistrationActivity m4814o;
            MrtrPrepaidRegistrationViewModel m4812q;
            MrtrPrepaidRegistrationViewModel m4812q2;
            MrtrPrepaidRegistrationViewModel m4812q3;
            MrtrPrepaidRegistrationViewModel m4812q4;
            MrtrPrepaidRegistrationViewModel m4812q5;
            MrtrPrepaidRegistrationViewModel m4812q6;
            MrtrPrepaidRegistrationViewModel m4812q7;
            UpPassFormType faceCompare;
            Boolean isAllowManualKYC;
            MrtrPrepaidRegistrationViewModel m4812q8;
            MrtrPrepaidRegistrationViewModel m4812q9;
            MrtrPrepaidRegistrationViewModel m4812q10;
            MrtrPrepaidRegistrationViewModel m4812q11;
            MrtrPrepaidRegistrationViewModel m4812q12;
            MrtrPrepaidRegistrationViewModel m4812q13;
            Boolean isAllowManualKYC2;
            m4814o = this.this$0.m4814o();
            m4814o.deleteOptionalImage(BitmapUtil.IMAGE_COMPARE_WATERMARK);
            m4812q = this.this$0.m4812q();
            GetAuthorizationByRtrResponse getAuthorizationByRtrResponse = m4812q.getGetAuthorizationByRtrResponse();
            if (getAuthorizationByRtrResponse != null ? Intrinsics.areEqual(getAuthorizationByRtrResponse.isRequireLiveness(), Boolean.TRUE) : false) {
                m4812q8 = this.this$0.m4812q();
                int maxAttempt = m4812q8.getMaxAttempt();
                m4812q9 = this.this$0.m4812q();
                GetAuthorizationByRtrResponse getAuthorizationByRtrResponse2 = m4812q9.getGetAuthorizationByRtrResponse();
                boolean booleanValue = (getAuthorizationByRtrResponse2 == null || (isAllowManualKYC2 = getAuthorizationByRtrResponse2.isAllowManualKYC()) == null) ? false : isAllowManualKYC2.booleanValue();
                m4812q10 = this.this$0.m4812q();
                boolean isAllowKYC2ndLine = m4812q10.isAllowKYC2ndLine();
                m4812q11 = this.this$0.m4812q();
                String orderType = m4812q11.getOrderType();
                m4812q12 = this.this$0.m4812q();
                String international = PhoneNumberExtKt.toInternational(m4812q12.getDisplaySubscriberNumber());
                m4812q13 = this.this$0.m4812q();
                MrtrPrepaidValidateBarcodeResponse mrtrPrepaidValidateBarcodeResponse = m4812q13.getMrtrPrepaidValidateBarcodeResponse();
                faceCompare = new UpPassFormType.FaceCompareLiveness(null, booleanValue, maxAttempt, null, orderType, isAllowKYC2ndLine, international, mrtrPrepaidValidateBarcodeResponse != null ? mrtrPrepaidValidateBarcodeResponse.getSimcardNumber() : null, 9, null);
            } else {
                m4812q2 = this.this$0.m4812q();
                int maxAttempt2 = m4812q2.getMaxAttempt();
                m4812q3 = this.this$0.m4812q();
                GetAuthorizationByRtrResponse getAuthorizationByRtrResponse3 = m4812q3.getGetAuthorizationByRtrResponse();
                boolean booleanValue2 = (getAuthorizationByRtrResponse3 == null || (isAllowManualKYC = getAuthorizationByRtrResponse3.isAllowManualKYC()) == null) ? false : isAllowManualKYC.booleanValue();
                m4812q4 = this.this$0.m4812q();
                boolean isAllowKYC2ndLine2 = m4812q4.isAllowKYC2ndLine();
                m4812q5 = this.this$0.m4812q();
                String orderType2 = m4812q5.getOrderType();
                m4812q6 = this.this$0.m4812q();
                String international2 = PhoneNumberExtKt.toInternational(m4812q6.getDisplaySubscriberNumber());
                m4812q7 = this.this$0.m4812q();
                MrtrPrepaidValidateBarcodeResponse mrtrPrepaidValidateBarcodeResponse2 = m4812q7.getMrtrPrepaidValidateBarcodeResponse();
                faceCompare = new UpPassFormType.FaceCompare(null, booleanValue2, maxAttempt2, null, orderType2, isAllowKYC2ndLine2, international2, mrtrPrepaidValidateBarcodeResponse2 != null ? mrtrPrepaidValidateBarcodeResponse2.getSimcardNumber() : null, 9, null);
            }
            this.this$0.navigateNextToCommon(faceCompare);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MrtrPrepaidNavigateToCommonFragment$initView$1$2(MrtrPrepaidNavigateToCommonFragment mrtrPrepaidNavigateToCommonFragment) {
        super(1);
        this.this$0 = mrtrPrepaidNavigateToCommonFragment;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(FragmentNavEvent fragmentNavEvent) {
        invoke2(fragmentNavEvent);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(@NotNull FragmentNavEvent it) {
        MrtrPrepaidRegistrationViewModel m4812q;
        List<String> emptyList;
        MrtrPrepaidRegistrationActivity m4814o;
        MrtrPrepaidRegistrationActivity m4814o2;
        UpdatePrepaidOptionalImage optionalImage;
        Intrinsics.checkNotNullParameter(it, "it");
        DeleteBitmapPresenter deleteBitmapPresenter = this.this$0.getDeleteBitmapPresenter();
        m4812q = this.this$0.m4812q();
        PrepaidConfig prepaidConfig = m4812q.getPrepaidConfig();
        if (prepaidConfig == null || (optionalImage = prepaidConfig.getOptionalImage()) == null || (emptyList = optionalImage.getOptionalImages()) == null) {
            emptyList = CollectionsKt__CollectionsKt.emptyList();
        }
        deleteBitmapPresenter.deleteAllOptionalImage(emptyList);
        if (Intrinsics.areEqual(it.getClazz(), UpPassFormFragment.class)) {
            m4814o2 = this.this$0.m4814o();
            m4814o2.deleteImageCallback(BitmapUtil.IMAGE_COMPARE, new C163721(this.this$0));
            return;
        }
        m4814o = this.this$0.m4814o();
        m4814o.replaceFragment(it.buildFragment(), it.getTag());
    }
}