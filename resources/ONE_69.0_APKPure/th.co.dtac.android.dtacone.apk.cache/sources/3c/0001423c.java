package th.p047co.dtac.android.dtacone.view.appOne.tol.screen.existingTmhTvs;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import th.p047co.dtac.android.dtacone.view.appOne.tol.model.OneRegisterTrueOnlineCvgType;
import th.p047co.dtac.android.dtacone.view.appOne.tol.util.StringHelperKt;

@Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.appOne.tol.screen.existingTmhTvs.OneRegisterTrueOnlineSelectNumberScreenKt$ExistingNumberCard$formatter$1$1 */
/* loaded from: classes10.dex */
public final class C15364x84b4bda4 extends Lambda implements Function1<String, String> {
    final /* synthetic */ OneRegisterTrueOnlineCvgType $cvgType;

    @Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.view.appOne.tol.screen.existingTmhTvs.OneRegisterTrueOnlineSelectNumberScreenKt$ExistingNumberCard$formatter$1$1$WhenMappings */
    /* loaded from: classes10.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[OneRegisterTrueOnlineCvgType.values().length];
            try {
                iArr[OneRegisterTrueOnlineCvgType.TRUE_MOVE_H.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[OneRegisterTrueOnlineCvgType.FIXED_LINE_PLUS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C15364x84b4bda4(OneRegisterTrueOnlineCvgType oneRegisterTrueOnlineCvgType) {
        super(1);
        this.$cvgType = oneRegisterTrueOnlineCvgType;
    }

    @Override // kotlin.jvm.functions.Function1
    @NotNull
    public final String invoke(@NotNull String number) {
        Intrinsics.checkNotNullParameter(number, "number");
        OneRegisterTrueOnlineCvgType oneRegisterTrueOnlineCvgType = this.$cvgType;
        if (oneRegisterTrueOnlineCvgType == OneRegisterTrueOnlineCvgType.TRUE_VISIONS) {
            return number;
        }
        int i = WhenMappings.$EnumSwitchMapping$0[oneRegisterTrueOnlineCvgType.ordinal()];
        if (i != 1) {
            return i != 2 ? number : StringHelperKt.formatTelephoneNumber(number);
        }
        return StringHelperKt.formatMobileNumber(number);
    }
}