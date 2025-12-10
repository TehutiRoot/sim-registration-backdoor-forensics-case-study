package com.chuckerteam.chucker.internal.p010ui.transaction;

import android.content.Context;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;
import ch.qos.logback.core.CoreConstants;
import com.chuckerteam.chucker.R;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(m28851d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00130\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, m28850d2 = {"Lcom/chuckerteam/chucker/internal/ui/transaction/TransactionPagerAdapter;", "Landroidx/fragment/app/FragmentStatePagerAdapter;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroidx/fragment/app/FragmentManager;", "fm", "<init>", "(Landroid/content/Context;Landroidx/fragment/app/FragmentManager;)V", "", "position", "Landroidx/fragment/app/Fragment;", "getItem", "(I)Landroidx/fragment/app/Fragment;", "getCount", "()I", "", "getPageTitle", "(I)Ljava/lang/CharSequence;", "", "", OperatorName.SET_LINE_JOINSTYLE, "[Ljava/lang/String;", "titles", "com.github.ChuckerTeam.Chucker.library"}, m28849k = 1, m28848mv = {1, 8, 0})
/* renamed from: com.chuckerteam.chucker.internal.ui.transaction.TransactionPagerAdapter */
/* loaded from: classes3.dex */
public final class TransactionPagerAdapter extends FragmentStatePagerAdapter {

    /* renamed from: j */
    public final String[] f43020j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TransactionPagerAdapter(@NotNull Context context, @NotNull FragmentManager fm) {
        super(fm, 1);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(fm, "fm");
        this.f43020j = new String[]{context.getString(R.string.chucker_overview), context.getString(R.string.chucker_request), context.getString(R.string.chucker_response)};
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public int getCount() {
        return this.f43020j.length;
    }

    @Override // androidx.fragment.app.FragmentStatePagerAdapter
    @NotNull
    public Fragment getItem(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    return TransactionPayloadFragment.Companion.newInstance(PayloadType.RESPONSE);
                }
                throw new IllegalArgumentException("no item");
            }
            return TransactionPayloadFragment.Companion.newInstance(PayloadType.REQUEST);
        }
        return new TransactionOverviewFragment();
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    @NotNull
    public CharSequence getPageTitle(int i) {
        String str = this.f43020j[i];
        Intrinsics.checkNotNullExpressionValue(str, "titles[position]");
        return str;
    }
}
