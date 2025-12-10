package th.p047co.dtac.android.dtacone.view.appOne.registration.adapter;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import th.p047co.dtac.android.dtacone.app_one.repository.model.SimData;

@Metadata(m29143d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m29142d2 = {"<anonymous>", "", "item", "Lth/co/dtac/android/dtacone/app_one/repository/model/SimData;", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.appOne.registration.adapter.OneRtrAndPhoneAdapter$onBindViewHolder$1 */
/* loaded from: classes10.dex */
public final class OneRtrAndPhoneAdapter$onBindViewHolder$1 extends Lambda implements Function1<SimData, Unit> {
    final /* synthetic */ OneRtrAndPhoneAdapter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OneRtrAndPhoneAdapter$onBindViewHolder$1(OneRtrAndPhoneAdapter oneRtrAndPhoneAdapter) {
        super(1);
        this.this$0 = oneRtrAndPhoneAdapter;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(SimData simData) {
        invoke2(simData);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(@NotNull SimData item) {
        Intrinsics.checkNotNullParameter(item, "item");
        this.this$0.f96200c = item;
        this.this$0.notifyDataSetChanged();
        Function1<SimData, Unit> onSelectItem = this.this$0.getOnSelectItem();
        if (onSelectItem != null) {
            onSelectItem.invoke(item);
        }
    }
}