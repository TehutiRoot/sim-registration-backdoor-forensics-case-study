package com.chuckerteam.chucker.internal.p010ui.transaction;

import android.widget.TextView;
import com.chuckerteam.chucker.R;
import com.chuckerteam.chucker.databinding.ChuckerListItemTransactionBinding;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;

@Metadata(m29143d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a%\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m29142d2 = {"Lcom/chuckerteam/chucker/databinding/ChuckerListItemTransactionBinding;", "", "graphQlOperationName", "", "graphQLDetected", "", PDPageLabelRange.STYLE_LETTERS_LOWER, "(Lcom/chuckerteam/chucker/databinding/ChuckerListItemTransactionBinding;Ljava/lang/String;Z)V", "com.github.ChuckerTeam.Chucker.library"}, m29141k = 2, m29140mv = {1, 8, 0})
/* renamed from: com.chuckerteam.chucker.internal.ui.transaction.TransactionAdapterKt */
/* loaded from: classes3.dex */
public final class TransactionAdapterKt {
    /* renamed from: a */
    public static final void m49862a(ChuckerListItemTransactionBinding chuckerListItemTransactionBinding, String str, boolean z) {
        if (z) {
            chuckerListItemTransactionBinding.graphqlIcon.setVisibility(0);
            chuckerListItemTransactionBinding.graphqlPath.setVisibility(0);
            TextView textView = chuckerListItemTransactionBinding.graphqlPath;
            if (str == null) {
                str = chuckerListItemTransactionBinding.getRoot().getResources().getString(R.string.chucker_graphql_operation_is_empty);
            }
            textView.setText(str);
            return;
        }
        chuckerListItemTransactionBinding.graphqlIcon.setVisibility(8);
        chuckerListItemTransactionBinding.graphqlPath.setVisibility(8);
    }

    public static final /* synthetic */ void access$displayGraphQlFields(ChuckerListItemTransactionBinding chuckerListItemTransactionBinding, String str, boolean z) {
        m49862a(chuckerListItemTransactionBinding, str, z);
    }
}