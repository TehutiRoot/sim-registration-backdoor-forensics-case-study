package th.p047co.dtac.android.dtacone.view.activity.change_sim;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import th.p047co.dtac.android.dtacone.life_cycle.file.ClearFileObserver;

@Metadata(m29143d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m29142d2 = {"<anonymous>", "Lth/co/dtac/android/dtacone/life_cycle/file/ClearFileObserver;", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.activity.change_sim.ChangeSimActivity$clearFileObserver$2 */
/* loaded from: classes10.dex */
public final class ChangeSimActivity$clearFileObserver$2 extends Lambda implements Function0<ClearFileObserver> {
    final /* synthetic */ ChangeSimActivity this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChangeSimActivity$clearFileObserver$2(ChangeSimActivity changeSimActivity) {
        super(0);
        this.this$0 = changeSimActivity;
    }

    @Override // kotlin.jvm.functions.Function0
    @NotNull
    public final ClearFileObserver invoke() {
        return new ClearFileObserver(this.this$0.getFileUtil(), this.this$0.getThreadService());
    }
}