package th.p047co.dtac.android.dtacone.view.fragment.buy_dol;

import android.content.Context;
import android.graphics.drawable.Drawable;
import androidx.core.content.ContextCompat;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.util.credit_card.CardType;

@Metadata(m29143d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m29142d2 = {"<anonymous>", "Landroid/graphics/drawable/Drawable;", "it", "Lth/co/dtac/android/dtacone/util/credit_card/CardType;", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.fragment.buy_dol.BuyDolFormCreditCardFragment$setupView$1 */
/* loaded from: classes9.dex */
public final class BuyDolFormCreditCardFragment$setupView$1 extends Lambda implements Function1<CardType, Drawable> {
    final /* synthetic */ BuyDolFormCreditCardFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BuyDolFormCreditCardFragment$setupView$1(BuyDolFormCreditCardFragment buyDolFormCreditCardFragment) {
        super(1);
        this.this$0 = buyDolFormCreditCardFragment;
    }

    @Override // kotlin.jvm.functions.Function1
    @Nullable
    public final Drawable invoke(@NotNull CardType it) {
        int m8941v;
        Intrinsics.checkNotNullParameter(it, "it");
        Context context = this.this$0.getContext();
        Intrinsics.checkNotNull(context);
        m8941v = this.this$0.m8941v(it);
        return ContextCompat.getDrawable(context, m8941v);
    }
}