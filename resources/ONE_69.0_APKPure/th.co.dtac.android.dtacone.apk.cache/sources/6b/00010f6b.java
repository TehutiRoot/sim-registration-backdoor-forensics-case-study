package th.p047co.dtac.android.dtacone.adapter.customer_enquiry;

import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.i18n.MessageBundle;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.widget.view.WrapableViewPager;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u0011\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0011\u0010\u0012J'\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0019\u0010\u001a\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u001a\u0010\u001bR\u001a\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\b0\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u001a\u0010!\u001a\b\u0012\u0004\u0012\u00020\u000e0\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u001eR\u0016\u0010$\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010#¨\u0006%"}, m29142d2 = {"Lth/co/dtac/android/dtacone/adapter/customer_enquiry/WrapableViewPagerAdapter;", "Landroidx/fragment/app/FragmentPagerAdapter;", "Landroidx/fragment/app/FragmentManager;", "manager", "<init>", "(Landroidx/fragment/app/FragmentManager;)V", "", "position", "Landroidx/fragment/app/Fragment;", "getItem", "(I)Landroidx/fragment/app/Fragment;", "getCount", "()I", "fragment", "", MessageBundle.TITLE_ENTRY, "", "addFragment", "(Landroidx/fragment/app/Fragment;Ljava/lang/String;)V", "Landroid/view/ViewGroup;", "container", "", "object", "setPrimaryItem", "(Landroid/view/ViewGroup;ILjava/lang/Object;)V", "", "getPageTitle", "(I)Ljava/lang/CharSequence;", "", OperatorName.CLOSE_PATH, "Ljava/util/List;", "mFragmentList", "i", "mFragmentTitleList", OperatorName.SET_LINE_JOINSTYLE, "I", "mCurrentPosition", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0})
/* renamed from: th.co.dtac.android.dtacone.adapter.customer_enquiry.WrapableViewPagerAdapter */
/* loaded from: classes7.dex */
public final class WrapableViewPagerAdapter extends FragmentPagerAdapter {
    public static final int $stable = 8;

    /* renamed from: h */
    public final List f81249h;

    /* renamed from: i */
    public final List f81250i;

    /* renamed from: j */
    public int f81251j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WrapableViewPagerAdapter(@NotNull FragmentManager manager) {
        super(manager);
        Intrinsics.checkNotNullParameter(manager, "manager");
        this.f81249h = new ArrayList();
        this.f81250i = new ArrayList();
        this.f81251j = -1;
    }

    public final void addFragment(@NotNull Fragment fragment, @NotNull String title) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        Intrinsics.checkNotNullParameter(title, "title");
        this.f81249h.add(fragment);
        this.f81250i.add(title);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public int getCount() {
        return this.f81249h.size();
    }

    @Override // androidx.fragment.app.FragmentPagerAdapter
    @NotNull
    public Fragment getItem(int i) {
        return (Fragment) this.f81249h.get(i);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    @Nullable
    public CharSequence getPageTitle(int i) {
        return (CharSequence) this.f81250i.get(i);
    }

    @Override // androidx.fragment.app.FragmentPagerAdapter, androidx.viewpager.widget.PagerAdapter
    public void setPrimaryItem(@NotNull ViewGroup container, int i, @NotNull Object object) {
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(object, "object");
        super.setPrimaryItem(container, i, object);
        if (i != this.f81251j && (container instanceof WrapableViewPager)) {
            Fragment fragment = (Fragment) object;
            if (fragment.getView() != null) {
                this.f81251j = i;
                View view = fragment.getView();
                Intrinsics.checkNotNull(view);
                ((WrapableViewPager) container).measureCurrentView(view);
            }
        }
    }
}