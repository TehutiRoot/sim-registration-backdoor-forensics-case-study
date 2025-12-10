package com.chuckerteam.chucker.internal.p010ui.transaction;

import android.view.Menu;
import android.view.MenuItem;
import com.chuckerteam.chucker.R;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(m28851d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28850d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke", "(Ljava/lang/Boolean;)V"}, m28849k = 3, m28848mv = {1, 8, 0}, m28846xi = 48)
/* renamed from: com.chuckerteam.chucker.internal.ui.transaction.TransactionPayloadFragment$onCreateOptionsMenu$2 */
/* loaded from: classes3.dex */
public final class TransactionPayloadFragment$onCreateOptionsMenu$2 extends Lambda implements Function1<Boolean, Unit> {
    final /* synthetic */ Menu $menu;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TransactionPayloadFragment$onCreateOptionsMenu$2(Menu menu) {
        super(1);
        this.$menu = menu;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
        invoke2(bool);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(Boolean it) {
        MenuItem findItem = this.$menu.findItem(R.id.encode_url);
        Intrinsics.checkNotNullExpressionValue(it, "it");
        findItem.setVisible(it.booleanValue());
    }
}
