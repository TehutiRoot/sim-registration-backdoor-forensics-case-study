package th.p047co.dtac.android.dtacone.view.fragment.rtr_performance;

import android.content.Context;
import android.graphics.Color;
import android.view.View;
import ch.qos.logback.core.CoreConstants;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import net.lucode.hackware.magicindicator.buildins.UIUtil;
import net.lucode.hackware.magicindicator.buildins.commonnavigator.abs.CommonNavigatorAdapter;
import net.lucode.hackware.magicindicator.buildins.commonnavigator.abs.IPagerIndicator;
import net.lucode.hackware.magicindicator.buildins.commonnavigator.abs.IPagerTitleView;
import net.lucode.hackware.magicindicator.buildins.commonnavigator.indicators.LinePagerIndicator;
import net.lucode.hackware.magicindicator.buildins.commonnavigator.titles.ClipPagerTitleView;
import org.jetbrains.annotations.NotNull;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.databinding.FragmentHistoryDatePagerBinding;
import th.p047co.dtac.android.dtacone.model.rtr_performance.DateSeriesTransection;
import th.p047co.dtac.android.dtacone.view.fragment.rtr_performance.RtrHistoryDatePagerFragment$initMagicIndicator$1;

@Metadata(m29143d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0018\u0010\b\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u0003H\u0016¨\u0006\u000b"}, m29142d2 = {"th/co/dtac/android/dtacone/view/fragment/rtr_performance/RtrHistoryDatePagerFragment$initMagicIndicator$1", "Lnet/lucode/hackware/magicindicator/buildins/commonnavigator/abs/CommonNavigatorAdapter;", "getCount", "", "getIndicator", "Lnet/lucode/hackware/magicindicator/buildins/commonnavigator/abs/IPagerIndicator;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/content/Context;", "getTitleView", "Lnet/lucode/hackware/magicindicator/buildins/commonnavigator/abs/IPagerTitleView;", FirebaseAnalytics.Param.INDEX, "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.fragment.rtr_performance.RtrHistoryDatePagerFragment$initMagicIndicator$1 */
/* loaded from: classes9.dex */
public final class RtrHistoryDatePagerFragment$initMagicIndicator$1 extends CommonNavigatorAdapter {

    /* renamed from: b */
    public final /* synthetic */ RtrHistoryDatePagerFragment f104476b;

    public RtrHistoryDatePagerFragment$initMagicIndicator$1(RtrHistoryDatePagerFragment rtrHistoryDatePagerFragment) {
        this.f104476b = rtrHistoryDatePagerFragment;
    }

    /* renamed from: b */
    public static final void m3946b(RtrHistoryDatePagerFragment this$0, int i, View view) {
        FragmentHistoryDatePagerBinding m3950n;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        m3950n = this$0.m3950n();
        m3950n.viewPager.setCurrentItem(i);
    }

    @Override // net.lucode.hackware.magicindicator.buildins.commonnavigator.abs.CommonNavigatorAdapter
    public int getCount() {
        List list;
        List list2;
        list = this.f104476b.f104471j;
        List list3 = null;
        if (list == null) {
            Intrinsics.throwUninitializedPropertyAccessException("dateSeriesTransections");
            list = null;
        }
        if (!list.isEmpty()) {
            list2 = this.f104476b.f104471j;
            if (list2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("dateSeriesTransections");
            } else {
                list3 = list2;
            }
            return list3.size();
        }
        return 0;
    }

    @Override // net.lucode.hackware.magicindicator.buildins.commonnavigator.abs.CommonNavigatorAdapter
    @NotNull
    public IPagerIndicator getIndicator(@NotNull Context context) {
        List list;
        Intrinsics.checkNotNullParameter(context, "context");
        LinePagerIndicator linePagerIndicator = new LinePagerIndicator(context);
        float dimension = this.f104476b.getResources().getDimension(R.dimen.dp40);
        int screenWidth = UIUtil.getScreenWidth(context);
        list = this.f104476b.f104471j;
        if (list == null) {
            Intrinsics.throwUninitializedPropertyAccessException("dateSeriesTransections");
            list = null;
        }
        linePagerIndicator.setLineHeight(dimension);
        linePagerIndicator.setRoundRadius(dimension);
        float size = (screenWidth / list.size()) - dimension;
        float f = 2;
        linePagerIndicator.setXOffset((size / f) - f);
        linePagerIndicator.setColors(Integer.valueOf(Color.parseColor("#146cc4")));
        return linePagerIndicator;
    }

    @Override // net.lucode.hackware.magicindicator.buildins.commonnavigator.abs.CommonNavigatorAdapter
    @NotNull
    public IPagerTitleView getTitleView(@NotNull Context context, final int i) {
        List list;
        Intrinsics.checkNotNullParameter(context, "context");
        ClipPagerTitleView clipPagerTitleView = new ClipPagerTitleView(context);
        list = this.f104476b.f104471j;
        if (list == null) {
            Intrinsics.throwUninitializedPropertyAccessException("dateSeriesTransections");
            list = null;
        }
        clipPagerTitleView.setText(((DateSeriesTransection) list.get(i)).getDateDisplay());
        clipPagerTitleView.setTextColor(Color.parseColor("#a5a5a5"));
        clipPagerTitleView.setClipColor(-1);
        final RtrHistoryDatePagerFragment rtrHistoryDatePagerFragment = this.f104476b;
        clipPagerTitleView.setOnClickListener(new View.OnClickListener() { // from class: Zz1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                RtrHistoryDatePagerFragment$initMagicIndicator$1.m3946b(rtrHistoryDatePagerFragment, i, view);
            }
        });
        return clipPagerTitleView;
    }
}