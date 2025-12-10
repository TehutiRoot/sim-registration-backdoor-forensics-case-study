package th.p047co.dtac.android.dtacone.presenter.change_sim;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import th.p047co.dtac.android.dtacone.model.change_sim.ChangeSimNewCardInfo;

@Metadata(m29143d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m29142d2 = {"<anonymous>", "", "t", "Lth/co/dtac/android/dtacone/model/change_sim/ChangeSimNewCardInfo;", "invoke", "(Lth/co/dtac/android/dtacone/model/change_sim/ChangeSimNewCardInfo;)Ljava/lang/Boolean;"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.presenter.change_sim.ChangeSimVerifyWriteSimPresenter$pollingVerifyFromServer$3 */
/* loaded from: classes8.dex */
public final class ChangeSimVerifyWriteSimPresenter$pollingVerifyFromServer$3 extends Lambda implements Function1<ChangeSimNewCardInfo, Boolean> {
    public static final ChangeSimVerifyWriteSimPresenter$pollingVerifyFromServer$3 INSTANCE = new ChangeSimVerifyWriteSimPresenter$pollingVerifyFromServer$3();

    public ChangeSimVerifyWriteSimPresenter$pollingVerifyFromServer$3() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    @NotNull
    public final Boolean invoke(@NotNull ChangeSimNewCardInfo t) {
        Intrinsics.checkNotNullParameter(t, "t");
        return Boolean.valueOf(Intrinsics.areEqual(t.getStatus(), "Success"));
    }
}