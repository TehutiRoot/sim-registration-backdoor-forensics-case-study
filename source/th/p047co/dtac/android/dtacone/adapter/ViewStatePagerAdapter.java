package th.p047co.dtac.android.dtacone.adapter;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@StabilityInferred(parameters = 0)
@Metadata(m28851d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\r\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00060\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\b0\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001a¨\u0006\u001e"}, m28850d2 = {"Lth/co/dtac/android/dtacone/adapter/ViewStatePagerAdapter;", "Landroidx/fragment/app/FragmentStatePagerAdapter;", "Landroidx/fragment/app/FragmentManager;", "fm", "<init>", "(Landroidx/fragment/app/FragmentManager;)V", "Landroidx/fragment/app/Fragment;", "fragment", "", "tabTitle", "", "addFragmentCard", "(Landroidx/fragment/app/Fragment;Ljava/lang/String;)V", "removeFragment", "()V", "", "position", "getItem", "(I)Landroidx/fragment/app/Fragment;", "getCount", "()I", "", "getPageTitle", "(I)Ljava/lang/CharSequence;", "Ljava/util/ArrayList;", OperatorName.SET_LINE_JOINSTYLE, "Ljava/util/ArrayList;", "cardFragment", OperatorName.NON_STROKING_CMYK, "fragmentTitle", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0})
/* renamed from: th.co.dtac.android.dtacone.adapter.ViewStatePagerAdapter */
/* loaded from: classes7.dex */
public final class ViewStatePagerAdapter extends FragmentStatePagerAdapter {
    public static final int $stable = 8;

    /* renamed from: j */
    public final ArrayList f80988j;

    /* renamed from: k */
    public final ArrayList f80989k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ViewStatePagerAdapter(@NotNull FragmentManager fm) {
        super(fm);
        Intrinsics.checkNotNullParameter(fm, "fm");
        this.f80988j = new ArrayList();
        this.f80989k = new ArrayList();
    }

    public final void addFragmentCard(@NotNull Fragment fragment, @NotNull String tabTitle) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        Intrinsics.checkNotNullParameter(tabTitle, "tabTitle");
        this.f80988j.add(fragment);
        this.f80989k.add(tabTitle);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public int getCount() {
        return this.f80988j.size();
    }

    @Override // androidx.fragment.app.FragmentStatePagerAdapter
    @NotNull
    public Fragment getItem(int i) {
        Object obj = this.f80988j.get(i);
        Intrinsics.checkNotNullExpressionValue(obj, "cardFragment[position]");
        return (Fragment) obj;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    @NotNull
    public CharSequence getPageTitle(int i) {
        Object obj = this.f80989k.get(i);
        Intrinsics.checkNotNullExpressionValue(obj, "fragmentTitle[position]");
        return (CharSequence) obj;
    }

    public final void removeFragment() {
        this.f80988j.clear();
        this.f80989k.clear();
    }
}
