package th.p047co.dtac.android.dtacone.adapter.banner;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
import ch.qos.logback.core.CoreConstants;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.apache.commons.cli.HelpFormatter;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.adapter.banner.BannerAdapter;
import th.p047co.dtac.android.dtacone.model.newsfeed.ResultMissionItem;
import th.p047co.dtac.android.dtacone.widget.view.DtacEllipsizingTextView;
import th.p047co.dtac.android.dtacone.widget.view.DtacFontTextView;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001'B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0018\u001a\u00020\u00102\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0018\u0010\u0019J'\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u001b\u0010\u001cR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u001c\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0016\u0010&\u001a\u00020#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010%¨\u0006("}, m29142d2 = {"Lth/co/dtac/android/dtacone/adapter/banner/BannerAdapter;", "Landroidx/viewpager/widget/PagerAdapter;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "Lth/co/dtac/android/dtacone/model/newsfeed/ResultMissionItem;", "resultMission", "Lth/co/dtac/android/dtacone/adapter/banner/BannerAdapter$Callback;", "onClickMissionItem", "<init>", "(Landroid/content/Context;Ljava/util/List;Lth/co/dtac/android/dtacone/adapter/banner/BannerAdapter$Callback;)V", "", "getCount", "()I", "Landroid/view/View;", Promotion.ACTION_VIEW, "", "object", "", "isViewFromObject", "(Landroid/view/View;Ljava/lang/Object;)Z", "Landroid/view/ViewGroup;", "container", "position", "instantiateItem", "(Landroid/view/ViewGroup;I)Ljava/lang/Object;", "", "destroyItem", "(Landroid/view/ViewGroup;ILjava/lang/Object;)V", OperatorName.CURVE_TO, "Landroid/content/Context;", "d", "Ljava/util/List;", "e", "Lth/co/dtac/android/dtacone/adapter/banner/BannerAdapter$Callback;", "Landroid/view/LayoutInflater;", OperatorName.FILL_NON_ZERO, "Landroid/view/LayoutInflater;", "mLayoutInflater", "Callback", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nBannerAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BannerAdapter.kt\nth/co/dtac/android/dtacone/adapter/banner/BannerAdapter\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,91:1\n1#2:92\n1864#3,3:93\n*S KotlinDebug\n*F\n+ 1 BannerAdapter.kt\nth/co/dtac/android/dtacone/adapter/banner/BannerAdapter\n*L\n74#1:93,3\n*E\n"})
/* renamed from: th.co.dtac.android.dtacone.adapter.banner.BannerAdapter */
/* loaded from: classes7.dex */
public final class BannerAdapter extends PagerAdapter {
    public static final int $stable = 8;

    /* renamed from: c */
    public final Context f81081c;

    /* renamed from: d */
    public final List f81082d;

    /* renamed from: e */
    public final Callback f81083e;

    /* renamed from: f */
    public LayoutInflater f81084f;

    @Metadata(m29143d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&¨\u0006\u0007"}, m29142d2 = {"Lth/co/dtac/android/dtacone/adapter/banner/BannerAdapter$Callback;", "", "closeMission", "", "onClickMissionItem", "resultMissionItem", "Lth/co/dtac/android/dtacone/model/newsfeed/ResultMissionItem;", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.adapter.banner.BannerAdapter$Callback */
    /* loaded from: classes7.dex */
    public interface Callback {
        void closeMission();

        void onClickMissionItem(@NotNull ResultMissionItem resultMissionItem);
    }

    public /* synthetic */ BannerAdapter(Context context, List list, Callback callback, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : list, callback);
    }

    /* renamed from: b */
    public static /* synthetic */ void m20623b(BannerAdapter bannerAdapter, View view) {
        m20620e(bannerAdapter, view);
    }

    /* renamed from: c */
    public static /* synthetic */ void m20622c(BannerAdapter bannerAdapter, ResultMissionItem resultMissionItem, View view) {
        m20621d(bannerAdapter, resultMissionItem, view);
    }

    /* renamed from: d */
    public static final void m20621d(BannerAdapter this$0, ResultMissionItem resultMissionItem, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.f81083e.onClickMissionItem(resultMissionItem);
    }

    /* renamed from: e */
    public static final void m20620e(BannerAdapter this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.f81083e.closeMission();
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public void destroyItem(@NotNull ViewGroup container, int i, @NotNull Object object) {
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(object, "object");
        ((ViewPager) container).removeView((View) object);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public int getCount() {
        List list = this.f81082d;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    @NotNull
    public Object instantiateItem(@NotNull ViewGroup container, int i) {
        final ResultMissionItem resultMissionItem;
        Intrinsics.checkNotNullParameter(container, "container");
        View inflate = this.f81084f.inflate(R.layout.item_banner, container, false);
        Intrinsics.checkNotNullExpressionValue(inflate, "mLayoutInflater.inflate(…banner, container, false)");
        List list = this.f81082d;
        if (list != null) {
            resultMissionItem = (ResultMissionItem) list.get(i);
        } else {
            resultMissionItem = null;
        }
        View findViewById = inflate.findViewById(R.id.missionTitle);
        Intrinsics.checkNotNullExpressionValue(findViewById, "itemView.findViewById(R.id.missionTitle)");
        DtacFontTextView dtacFontTextView = (DtacFontTextView) findViewById;
        View findViewById2 = inflate.findViewById(R.id.missionMessage1);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "itemView.findViewById(R.id.missionMessage1)");
        DtacEllipsizingTextView dtacEllipsizingTextView = (DtacEllipsizingTextView) findViewById2;
        View findViewById3 = inflate.findViewById(R.id.missionMessage2);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "itemView.findViewById(R.id.missionMessage2)");
        DtacEllipsizingTextView dtacEllipsizingTextView2 = (DtacEllipsizingTextView) findViewById3;
        View findViewById4 = inflate.findViewById(R.id.missionPeriod);
        Intrinsics.checkNotNullExpressionValue(findViewById4, "itemView.findViewById(R.id.missionPeriod)");
        DtacFontTextView dtacFontTextView2 = (DtacFontTextView) findViewById4;
        View findViewById5 = inflate.findViewById(R.id.selectMission);
        Intrinsics.checkNotNullExpressionValue(findViewById5, "itemView.findViewById(R.id.selectMission)");
        ImageView imageView = (ImageView) findViewById5;
        View findViewById6 = inflate.findViewById(R.id.btnClose);
        Intrinsics.checkNotNullExpressionValue(findViewById6, "itemView.findViewById(R.id.btnClose)");
        ImageView imageView2 = (ImageView) findViewById6;
        if (resultMissionItem != null) {
            String missionName = resultMissionItem.getMissionName();
            String str = "";
            if (missionName == null) {
                missionName = "";
            }
            dtacFontTextView.setText(missionName);
            String missionTarget = resultMissionItem.getMissionTarget();
            if (missionTarget != null) {
                dtacEllipsizingTextView.setTextHighlight(missionTarget);
            }
            String missionObjective = resultMissionItem.getMissionObjective();
            if (missionObjective == null) {
                missionObjective = "";
            }
            String missionTarget2 = resultMissionItem.getMissionTarget();
            if (missionTarget2 == null) {
                missionTarget2 = "";
            }
            dtacEllipsizingTextView.setText(missionObjective + HelpFormatter.DEFAULT_LONG_OPT_SEPARATOR + missionTarget2);
            String missionReward = resultMissionItem.getMissionReward();
            if (missionReward != null) {
                dtacEllipsizingTextView2.setTextHighlight(missionReward);
            }
            String missionDescription = resultMissionItem.getMissionDescription();
            if (missionDescription == null) {
                missionDescription = "";
            }
            String missionReward2 = resultMissionItem.getMissionReward();
            if (missionReward2 == null) {
                missionReward2 = "";
            }
            dtacEllipsizingTextView2.setText(missionDescription + HelpFormatter.DEFAULT_LONG_OPT_SEPARATOR + missionReward2);
            String missionPeriodShow = resultMissionItem.getMissionPeriodShow();
            if (missionPeriodShow != null) {
                str = missionPeriodShow;
            }
            dtacFontTextView2.setText(str);
            imageView.setOnClickListener(new View.OnClickListener() { // from class: fa
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    BannerAdapter.m20622c(BannerAdapter.this, resultMissionItem, view);
                }
            });
        }
        imageView2.setOnClickListener(new View.OnClickListener() { // from class: ga
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BannerAdapter.m20623b(BannerAdapter.this, view);
            }
        });
        container.addView(inflate);
        return inflate;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public boolean isViewFromObject(@NotNull View view, @NotNull Object object) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(object, "object");
        return Intrinsics.areEqual(view, object);
    }

    public BannerAdapter(@NotNull Context context, @Nullable List<ResultMissionItem> list, @NotNull Callback onClickMissionItem) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(onClickMissionItem, "onClickMissionItem");
        this.f81081c = context;
        this.f81082d = list;
        this.f81083e = onClickMissionItem;
        Object systemService = context.getSystemService("layout_inflater");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.view.LayoutInflater");
        this.f81084f = (LayoutInflater) systemService;
    }
}