package th.p047co.dtac.android.dtacone.view.appOne.postpaid_registration.fragment.common;

import androidx.core.app.NotificationCompat;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import th.p047co.dtac.android.dtacone.util.bitmap.BitmapUtil;
import th.p047co.dtac.android.dtacone.view.appOne.postpaid_registration.model.OnePostpaidStatusFlow;

@Metadata(m29143d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m29142d2 = {"<anonymous>", "", NotificationCompat.CATEGORY_STATUS, "Lth/co/dtac/android/dtacone/view/appOne/postpaid_registration/model/OnePostpaidStatusFlow;", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.appOne.postpaid_registration.fragment.common.OnePostpaidNavigateToCommonFragment$navigateToSharingConsent$1 */
/* loaded from: classes10.dex */
public final class OnePostpaidNavigateToCommonFragment$navigateToSharingConsent$1 extends Lambda implements Function1<OnePostpaidStatusFlow, Unit> {
    final /* synthetic */ OnePostpaidNavigateToCommonFragment this$0;

    @Metadata(m29143d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m29142d2 = {"<anonymous>", "", "it", "", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.view.appOne.postpaid_registration.fragment.common.OnePostpaidNavigateToCommonFragment$navigateToSharingConsent$1$1 */
    /* loaded from: classes10.dex */
    public static final class C149311 extends Lambda implements Function1<Boolean, Unit> {
        final /* synthetic */ OnePostpaidNavigateToCommonFragment this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C149311(OnePostpaidNavigateToCommonFragment onePostpaidNavigateToCommonFragment) {
            super(1);
            this.this$0 = onePostpaidNavigateToCommonFragment;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
            invoke(bool.booleanValue());
            return Unit.INSTANCE;
        }

        public final void invoke(boolean z) {
            OnePostpaidNavigateToCommonFragment onePostpaidNavigateToCommonFragment = this.this$0;
            onePostpaidNavigateToCommonFragment.navigateNextToCommon(onePostpaidNavigateToCommonFragment.getCompareFormType());
        }
    }

    @Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.view.appOne.postpaid_registration.fragment.common.OnePostpaidNavigateToCommonFragment$navigateToSharingConsent$1$WhenMappings */
    /* loaded from: classes10.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[OnePostpaidStatusFlow.values().length];
            try {
                iArr[OnePostpaidStatusFlow.OnSuccess.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[OnePostpaidStatusFlow.OnTakeMorePhoto.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OnePostpaidNavigateToCommonFragment$navigateToSharingConsent$1(OnePostpaidNavigateToCommonFragment onePostpaidNavigateToCommonFragment) {
        super(1);
        this.this$0 = onePostpaidNavigateToCommonFragment;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(OnePostpaidStatusFlow onePostpaidStatusFlow) {
        invoke2(onePostpaidStatusFlow);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(@NotNull OnePostpaidStatusFlow status) {
        Intrinsics.checkNotNullParameter(status, "status");
        int i = WhenMappings.$EnumSwitchMapping$0[status.ordinal()];
        if (i == 1) {
            this.this$0.m12339m().deleteImageCallback(BitmapUtil.IMAGE_COMPARE, new C149311(this.this$0));
        } else if (i != 2) {
        } else {
            this.this$0.m12330v();
        }
    }
}