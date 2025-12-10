package th.p047co.dtac.android.dtacone.view.appOne.tol.screen.inputInfo;

import androidx.compose.runtime.MutableState;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

@Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.appOne.tol.screen.inputInfo.InputInfoScreenKt$InputInfoScreen$8$1 */
/* loaded from: classes10.dex */
public final class InputInfoScreenKt$InputInfoScreen$8$1 extends Lambda implements Function0<Unit> {
    final /* synthetic */ MutableState<AddressSelectType> $targetSheet$delegate;

    @Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.view.appOne.tol.screen.inputInfo.InputInfoScreenKt$InputInfoScreen$8$1$WhenMappings */
    /* loaded from: classes10.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AddressSelectType.values().length];
            try {
                iArr[AddressSelectType.DISTRICT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AddressSelectType.SUB_DISTRICT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AddressSelectType.POST_CODE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InputInfoScreenKt$InputInfoScreen$8$1(MutableState<AddressSelectType> mutableState) {
        super(0);
        this.$targetSheet$delegate = mutableState;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        AddressSelectType m9504q;
        AddressSelectType addressSelectType;
        MutableState<AddressSelectType> mutableState = this.$targetSheet$delegate;
        m9504q = InputInfoScreenKt.m9504q(mutableState);
        int i = WhenMappings.$EnumSwitchMapping$0[m9504q.ordinal()];
        if (i == 1) {
            addressSelectType = AddressSelectType.PROVINCE;
        } else if (i == 2) {
            addressSelectType = AddressSelectType.DISTRICT;
        } else if (i != 3) {
            addressSelectType = AddressSelectType.PROVINCE;
        } else {
            addressSelectType = AddressSelectType.SUB_DISTRICT;
        }
        InputInfoScreenKt.m9503r(mutableState, addressSelectType);
    }
}