package th.p047co.dtac.android.dtacone.view.appOne.postpaid_registration.fragment.common;

import androidx.core.app.NotificationCompat;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import th.p047co.dtac.android.dtacone.model.livedata.FragmentNavEvent;
import th.p047co.dtac.android.dtacone.util.bitmap.BitmapUtil;
import th.p047co.dtac.android.dtacone.view.appOne.postpaid_registration.fragment.blacklist.OnePostpaidCheckBlacklistAdditionalAdvanceFragment;
import th.p047co.dtac.android.dtacone.view.appOne.postpaid_registration.fragment.blacklist.OnePostpaidCheckBlacklistFragment;
import th.p047co.dtac.android.dtacone.view.appOne.postpaid_registration.fragment.true_company.OnePostpaidReserveNumberListFragment;
import th.p047co.dtac.android.dtacone.view.appOne.postpaid_registration.model.OnePostpaidStatusFlow;
import th.p047co.dtac.android.dtacone.view.appOne.postpaid_registration.viewmodel.OnePostpaidRegistrationViewModel;
import th.p047co.dtac.android.dtacone.view.fragment.upPass.UpPassFormFragment;

@Metadata(m29143d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m29142d2 = {"<anonymous>", "", "it", "Lth/co/dtac/android/dtacone/model/livedata/FragmentNavEvent;", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.appOne.postpaid_registration.fragment.common.OnePostpaidNavigateToCommonFragment$initView$1$1 */
/* loaded from: classes10.dex */
public final class OnePostpaidNavigateToCommonFragment$initView$1$1 extends Lambda implements Function1<FragmentNavEvent, Unit> {
    final /* synthetic */ OnePostpaidNavigateToCommonFragment this$0;

    @Metadata(m29143d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m29142d2 = {"<anonymous>", "", "it", "", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.view.appOne.postpaid_registration.fragment.common.OnePostpaidNavigateToCommonFragment$initView$1$1$1 */
    /* loaded from: classes10.dex */
    public static final class C149241 extends Lambda implements Function1<Boolean, Unit> {
        final /* synthetic */ OnePostpaidNavigateToCommonFragment this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C149241(OnePostpaidNavigateToCommonFragment onePostpaidNavigateToCommonFragment) {
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

    @Metadata(m29143d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m29142d2 = {"<anonymous>", "", "it", "Lth/co/dtac/android/dtacone/view/appOne/postpaid_registration/model/OnePostpaidStatusFlow;", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.view.appOne.postpaid_registration.fragment.common.OnePostpaidNavigateToCommonFragment$initView$1$1$2 */
    /* loaded from: classes10.dex */
    public static final class C149252 extends Lambda implements Function1<OnePostpaidStatusFlow, Unit> {
        final /* synthetic */ OnePostpaidNavigateToCommonFragment this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C149252(OnePostpaidNavigateToCommonFragment onePostpaidNavigateToCommonFragment) {
            super(1);
            this.this$0 = onePostpaidNavigateToCommonFragment;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(OnePostpaidStatusFlow onePostpaidStatusFlow) {
            invoke2(onePostpaidStatusFlow);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(@NotNull OnePostpaidStatusFlow it) {
            OnePostpaidRegistrationViewModel viewModel;
            OnePostpaidRegistrationViewModel viewModel2;
            String str;
            OnePostpaidRegistrationViewModel viewModel3;
            Intrinsics.checkNotNullParameter(it, "it");
            viewModel = this.this$0.getViewModel();
            viewModel2 = this.this$0.getViewModel();
            if (viewModel2.getHasReserveNumber()) {
                viewModel3 = this.this$0.getViewModel();
                str = viewModel3.getReserveNumber();
            } else {
                str = null;
            }
            viewModel.preverify(str);
        }
    }

    @Metadata(m29143d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m29142d2 = {"<anonymous>", "", NotificationCompat.CATEGORY_STATUS, "Lth/co/dtac/android/dtacone/view/appOne/postpaid_registration/model/OnePostpaidStatusFlow;", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.view.appOne.postpaid_registration.fragment.common.OnePostpaidNavigateToCommonFragment$initView$1$1$3 */
    /* loaded from: classes10.dex */
    public static final class C149263 extends Lambda implements Function1<OnePostpaidStatusFlow, Unit> {
        final /* synthetic */ OnePostpaidNavigateToCommonFragment this$0;

        @Metadata(m29143d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m29142d2 = {"<anonymous>", "", "it", "", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
        /* renamed from: th.co.dtac.android.dtacone.view.appOne.postpaid_registration.fragment.common.OnePostpaidNavigateToCommonFragment$initView$1$1$3$1 */
        /* loaded from: classes10.dex */
        public static final class C149271 extends Lambda implements Function1<Boolean, Unit> {
            final /* synthetic */ OnePostpaidNavigateToCommonFragment this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C149271(OnePostpaidNavigateToCommonFragment onePostpaidNavigateToCommonFragment) {
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
        /* renamed from: th.co.dtac.android.dtacone.view.appOne.postpaid_registration.fragment.common.OnePostpaidNavigateToCommonFragment$initView$1$1$3$WhenMappings */
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
        public C149263(OnePostpaidNavigateToCommonFragment onePostpaidNavigateToCommonFragment) {
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
                this.this$0.m12339m().deleteImageCallback(BitmapUtil.IMAGE_COMPARE, new C149271(this.this$0));
            } else if (i != 2) {
            } else {
                this.this$0.m12330v();
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OnePostpaidNavigateToCommonFragment$initView$1$1(OnePostpaidNavigateToCommonFragment onePostpaidNavigateToCommonFragment) {
        super(1);
        this.this$0 = onePostpaidNavigateToCommonFragment;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(FragmentNavEvent fragmentNavEvent) {
        invoke2(fragmentNavEvent);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(@NotNull FragmentNavEvent it) {
        Intrinsics.checkNotNullParameter(it, "it");
        Class<?> clazz = it.getClazz();
        if (Intrinsics.areEqual(clazz, UpPassFormFragment.class)) {
            this.this$0.m12339m().deleteImageCallback(BitmapUtil.IMAGE_COMPARE, new C149241(this.this$0));
        } else if (Intrinsics.areEqual(clazz, OnePostpaidReserveNumberListFragment.class)) {
            this.this$0.m12339m().replaceFragment(OnePostpaidReserveNumberListFragment.Companion.newInstance(new C149252(this.this$0)), OnePostpaidReserveNumberListFragment.TAG);
        } else if (Intrinsics.areEqual(clazz, OnePostpaidCheckBlacklistFragment.class)) {
            this.this$0.m12336p();
        } else if (!Intrinsics.areEqual(clazz, OnePostpaidCheckBlacklistAdditionalAdvanceFragment.class)) {
            this.this$0.m12339m().replaceFragment(it.buildFragment(), it.getTag());
        } else {
            this.this$0.m12339m().replaceFragment(OnePostpaidCheckBlacklistAdditionalAdvanceFragment.Companion.newInstance(new C149263(this.this$0)), OnePostpaidCheckBlacklistAdditionalAdvanceFragment.TAG);
        }
    }
}