package th.p047co.dtac.android.dtacone.util.p052enum;

import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import th.p047co.dtac.android.dtacone.view.appOne.nadOutbound.fragment.OneNadOutboundSearchFragment;

@Metadata(m29143d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004\u001a\u0012\u0010\u0005\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004¨\u0006\u0006"}, m29142d2 = {"getSaveFlagFromStartDateOption", "", "Lth/co/dtac/android/dtacone/util/enum/PackageType;", "startDateOption", "Lth/co/dtac/android/dtacone/util/enum/StartDateOption;", "getTransactionTypeFromStartDateOption", "app_prodRelease"}, m29141k = 2, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.util.enum.PackageTypeKt */
/* loaded from: classes8.dex */
public final class PackageTypeKt {

    @Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.util.enum.PackageTypeKt$WhenMappings */
    /* loaded from: classes8.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[PackageType.values().length];
            try {
                iArr[PackageType.MainPackage.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PackageType.AddtionalPackage.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @NotNull
    public static final String getSaveFlagFromStartDateOption(@NotNull PackageType packageType, @NotNull StartDateOption startDateOption) {
        Intrinsics.checkNotNullParameter(packageType, "<this>");
        Intrinsics.checkNotNullParameter(startDateOption, "startDateOption");
        int i = WhenMappings.$EnumSwitchMapping$0[packageType.ordinal()];
        if (i != 1) {
            if (i == 2) {
                if (startDateOption == StartDateOption.IMMEDIATE) {
                    return "1";
                }
                return "2";
            }
            throw new NoWhenBranchMatchedException();
        }
        return OneNadOutboundSearchFragment.BILL_REMAINING_3_PLUS;
    }

    @NotNull
    public static final String getTransactionTypeFromStartDateOption(@NotNull PackageType packageType, @NotNull StartDateOption startDateOption) {
        Intrinsics.checkNotNullParameter(packageType, "<this>");
        Intrinsics.checkNotNullParameter(startDateOption, "startDateOption");
        int i = WhenMappings.$EnumSwitchMapping$0[packageType.ordinal()];
        if (i != 1) {
            if (i == 2) {
                return "0";
            }
            throw new NoWhenBranchMatchedException();
        } else if (startDateOption == StartDateOption.NEXT_DAY) {
            return "2";
        } else {
            return "5";
        }
    }
}