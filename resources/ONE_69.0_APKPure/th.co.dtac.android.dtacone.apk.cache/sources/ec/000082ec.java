package com.chuckerteam.chucker.internal.p010ui;

import androidx.constraintlayout.widget.Group;
import com.chuckerteam.chucker.databinding.ChuckerActivityMainBinding;
import com.chuckerteam.chucker.internal.data.entity.HttpTransactionTuple;
import com.chuckerteam.chucker.internal.p010ui.transaction.TransactionAdapter;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(m29143d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, m29142d2 = {"<anonymous>", "", "transactionTuples", "", "Lcom/chuckerteam/chucker/internal/data/entity/HttpTransactionTuple;", "kotlin.jvm.PlatformType", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
@SourceDebugExtension({"SMAP\nMainActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MainActivity.kt\ncom/chuckerteam/chucker/internal/ui/MainActivity$onCreate$3\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,249:1\n254#2,2:250\n*S KotlinDebug\n*F\n+ 1 MainActivity.kt\ncom/chuckerteam/chucker/internal/ui/MainActivity$onCreate$3\n*L\n95#1:250,2\n*E\n"})
/* renamed from: com.chuckerteam.chucker.internal.ui.MainActivity$onCreate$3 */
/* loaded from: classes3.dex */
public final class MainActivity$onCreate$3 extends Lambda implements Function1<List<? extends HttpTransactionTuple>, Unit> {
    final /* synthetic */ MainActivity this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MainActivity$onCreate$3(MainActivity mainActivity) {
        super(1);
        this.this$0 = mainActivity;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(List<? extends HttpTransactionTuple> list) {
        invoke2((List<HttpTransactionTuple>) list);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(List<HttpTransactionTuple> list) {
        TransactionAdapter transactionAdapter;
        ChuckerActivityMainBinding chuckerActivityMainBinding;
        transactionAdapter = this.this$0.f43007d;
        ChuckerActivityMainBinding chuckerActivityMainBinding2 = null;
        if (transactionAdapter == null) {
            Intrinsics.throwUninitializedPropertyAccessException("transactionsAdapter");
            transactionAdapter = null;
        }
        transactionAdapter.submitList(list);
        chuckerActivityMainBinding = this.this$0.f43006c;
        if (chuckerActivityMainBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mainBinding");
        } else {
            chuckerActivityMainBinding2 = chuckerActivityMainBinding;
        }
        Group group = chuckerActivityMainBinding2.tutorialGroup;
        Intrinsics.checkNotNullExpressionValue(group, "mainBinding.tutorialGroup");
        group.setVisibility(list.isEmpty() ? 0 : 8);
    }
}