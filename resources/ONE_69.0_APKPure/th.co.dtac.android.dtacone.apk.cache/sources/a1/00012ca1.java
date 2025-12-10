package th.p047co.dtac.android.dtacone.view.appOne.deviceSaleTrueCompany.adapter;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import th.p047co.dtac.android.dtacone.extension.format.DateFormatExtKt;
import th.p047co.dtac.android.dtacone.extension.view.ViewVisibleExtKt;
import th.p047co.dtac.android.dtacone.model.appOne.postpaid.true_company.VerifyKeyListItem;
import th.p047co.dtac.android.dtacone.model.p2post.validate.BirthDayCollection;
import th.p047co.dtac.android.dtacone.view.appOne.deviceSaleTrueCompany.adapter.OneDeviceSaleCampaignVerifyKeyAdapter;

@Metadata(m29143d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m29142d2 = {"<anonymous>", "", "birthDay", "Lth/co/dtac/android/dtacone/model/p2post/validate/BirthDayCollection;", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.appOne.deviceSaleTrueCompany.adapter.OneDeviceSaleCampaignVerifyKeyAdapter$onBindViewHolder$6$1 */
/* loaded from: classes10.dex */
public final class OneDeviceSaleCampaignVerifyKeyAdapter$onBindViewHolder$6$1 extends Lambda implements Function1<BirthDayCollection, Unit> {
    final /* synthetic */ RecyclerView.ViewHolder $holder;
    final /* synthetic */ VerifyKeyListItem $item;
    final /* synthetic */ OneDeviceSaleCampaignVerifyKeyAdapter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OneDeviceSaleCampaignVerifyKeyAdapter$onBindViewHolder$6$1(OneDeviceSaleCampaignVerifyKeyAdapter oneDeviceSaleCampaignVerifyKeyAdapter, RecyclerView.ViewHolder viewHolder, VerifyKeyListItem verifyKeyListItem) {
        super(1);
        this.this$0 = oneDeviceSaleCampaignVerifyKeyAdapter;
        this.$holder = viewHolder;
        this.$item = verifyKeyListItem;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(BirthDayCollection birthDayCollection) {
        invoke2(birthDayCollection);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(@NotNull BirthDayCollection birthDay) {
        Intrinsics.checkNotNullParameter(birthDay, "birthDay");
        this.this$0.f89702i = birthDay;
        ((OneDeviceSaleCampaignVerifyKeyAdapter.BirthDateViewHolder) this.$holder).getBirthDayTextInputLayout().setText("");
        ((OneDeviceSaleCampaignVerifyKeyAdapter.BirthDateViewHolder) this.$holder).getBirthDayTextInputLayout().setText(DateFormatExtKt.toThaiFormat(birthDay));
        ViewVisibleExtKt.toVisible(((OneDeviceSaleCampaignVerifyKeyAdapter.BirthDateViewHolder) this.$holder).getBirthDayTextInputLayout());
        ViewVisibleExtKt.toGone(((OneDeviceSaleCampaignVerifyKeyAdapter.BirthDateViewHolder) this.$holder).getTvHintBirthDay());
        VerifyKeyListItem verifyKeyListItem = this.$item;
        if (verifyKeyListItem == null) {
            return;
        }
        String thaiFormat = DateFormatExtKt.toThaiFormat(birthDay);
        verifyKeyListItem.setValue(thaiFormat != null ? DateFormatExtKt.thaiDateToDateFormatServer(thaiFormat, true, false) : null);
    }
}