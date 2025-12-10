package th.p047co.dtac.android.dtacone.widget.dialog;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.appcompat.app.AppCompatDialogFragment;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.navigation.compose.DialogNavigator;
import ch.qos.logback.core.CoreConstants;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import ru.tinkoff.scrollingpagerindicator.ScrollingPagerIndicator;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.adapter.banner.BannerAdapter;
import th.p047co.dtac.android.dtacone.model.newsfeed.MissionResponse;
import th.p047co.dtac.android.dtacone.model.newsfeed.ResultMissionItem;
import th.p047co.dtac.android.dtacone.view.activity.campaign.CampaignWebViewActivity;
import th.p047co.dtac.android.dtacone.widget.view.WrapContentHeightViewPager;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 02\u00020\u00012\u00020\u0002:\u00010B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\tJ-\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0013\u0010\u0004J\u0017\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0019\u0010\u0019\u001a\u00020\u00182\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001c\u001a\u00020\u00072\u0006\u0010\u001b\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u0011\u0010\u001f\u001a\u0004\u0018\u00010\u001eH\u0002¢\u0006\u0004\b\u001f\u0010 R\u0016\u0010#\u001a\u00020\u00058\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b!\u0010\"R\u0016\u0010'\u001a\u00020$8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b%\u0010&R\u0016\u0010+\u001a\u00020(8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b)\u0010*R\u0016\u0010/\u001a\u00020,8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b-\u0010.¨\u00061"}, m29142d2 = {"Lth/co/dtac/android/dtacone/widget/dialog/BannerDialog;", "Landroidx/appcompat/app/AppCompatDialogFragment;", "Lth/co/dtac/android/dtacone/adapter/banner/BannerAdapter$Callback;", "<init>", "()V", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "onAttach", "(Landroid/content/Context;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "closeMission", "Lth/co/dtac/android/dtacone/model/newsfeed/ResultMissionItem;", "resultMissionItem", "onClickMissionItem", "(Lth/co/dtac/android/dtacone/model/newsfeed/ResultMissionItem;)V", "Landroid/app/Dialog;", "onCreateDialog", "(Landroid/os/Bundle;)Landroid/app/Dialog;", DialogNavigator.NAME, OperatorName.ENDPATH, "(Landroid/app/Dialog;)V", "Lth/co/dtac/android/dtacone/model/newsfeed/MissionResponse;", "o", "()Lth/co/dtac/android/dtacone/model/newsfeed/MissionResponse;", PDPageLabelRange.STYLE_LETTERS_LOWER, "Landroid/content/Context;", "mContext", "Lth/co/dtac/android/dtacone/widget/view/WrapContentHeightViewPager;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Lth/co/dtac/android/dtacone/widget/view/WrapContentHeightViewPager;", "viewPager", "Lru/tinkoff/scrollingpagerindicator/ScrollingPagerIndicator;", OperatorName.CURVE_TO, "Lru/tinkoff/scrollingpagerindicator/ScrollingPagerIndicator;", "indicator", "Lth/co/dtac/android/dtacone/adapter/banner/BannerAdapter;", "d", "Lth/co/dtac/android/dtacone/adapter/banner/BannerAdapter;", "adapter", "Companion", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0})
/* renamed from: th.co.dtac.android.dtacone.widget.dialog.BannerDialog */
/* loaded from: classes9.dex */
public final class BannerDialog extends AppCompatDialogFragment implements BannerAdapter.Callback {
    @NotNull
    public static final String EXTRA_DATA = "EXTRA_DATA";

    /* renamed from: a */
    public Context f107231a;

    /* renamed from: b */
    public WrapContentHeightViewPager f107232b;

    /* renamed from: c */
    public ScrollingPagerIndicator f107233c;

    /* renamed from: d */
    public BannerAdapter f107234d;
    @NotNull
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @Metadata(m29143d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\t"}, m29142d2 = {"Lth/co/dtac/android/dtacone/widget/dialog/BannerDialog$Companion;", "", "()V", BannerDialog.EXTRA_DATA, "", "newInstance", "Lth/co/dtac/android/dtacone/widget/dialog/BannerDialog;", "resultMission", "Lth/co/dtac/android/dtacone/model/newsfeed/MissionResponse;", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.widget.dialog.BannerDialog$Companion */
    /* loaded from: classes9.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final BannerDialog newInstance(@NotNull MissionResponse resultMission) {
            Intrinsics.checkNotNullParameter(resultMission, "resultMission");
            BannerDialog bannerDialog = new BannerDialog();
            Bundle bundle = new Bundle();
            bundle.putParcelable(BannerDialog.EXTRA_DATA, resultMission);
            bannerDialog.setArguments(bundle);
            return bannerDialog;
        }

        public Companion() {
        }
    }

    @Override // th.p047co.dtac.android.dtacone.adapter.banner.BannerAdapter.Callback
    public void closeMission() {
        Dialog dialog = getDialog();
        if (dialog != null) {
            dialog.dismiss();
        }
    }

    /* renamed from: n */
    public final void m1740n(Dialog dialog) {
        Window window = dialog.getWindow();
        if (window != null) {
            window.setBackgroundDrawable(new ColorDrawable(0));
        }
    }

    /* renamed from: o */
    public final MissionResponse m1739o() {
        Bundle arguments = getArguments();
        if (arguments != null) {
            return (MissionResponse) arguments.getParcelable(EXTRA_DATA);
        }
        return null;
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onAttach(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        super.onAttach(context);
        this.f107231a = context;
    }

    @Override // th.p047co.dtac.android.dtacone.adapter.banner.BannerAdapter.Callback
    public void onClickMissionItem(@NotNull ResultMissionItem resultMissionItem) {
        String missionUrl;
        Intrinsics.checkNotNullParameter(resultMissionItem, "resultMissionItem");
        MissionResponse m1739o = m1739o();
        if (m1739o != null && (missionUrl = m1739o.getMissionUrl()) != null) {
            Intent intent = new Intent(requireContext(), CampaignWebViewActivity.class);
            intent.putExtra(CampaignWebViewActivity.EXTRA_CAMPAIGN_URL, missionUrl);
            intent.putExtra(CampaignWebViewActivity.EXTRA_CAMPAIGN_BACK_URL, "command=close");
            startActivity(intent);
            Dialog dialog = getDialog();
            if (dialog != null) {
                dialog.dismiss();
            }
        }
    }

    @Override // androidx.appcompat.app.AppCompatDialogFragment, androidx.fragment.app.DialogFragment
    @NotNull
    public Dialog onCreateDialog(@Nullable Bundle bundle) {
        Dialog onCreateDialog = super.onCreateDialog(bundle);
        Intrinsics.checkNotNullExpressionValue(onCreateDialog, "super.onCreateDialog(savedInstanceState)");
        m1740n(onCreateDialog);
        return onCreateDialog;
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        List<ResultMissionItem> list;
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View inflate = inflater.inflate(R.layout.custom_alert_dialog_banner, viewGroup, false);
        if (inflate != null) {
            View findViewById = inflate.findViewById(R.id.viewPager);
            Intrinsics.checkNotNullExpressionValue(findViewById, "v.findViewById(R.id.viewPager)");
            this.f107232b = (WrapContentHeightViewPager) findViewById;
            View findViewById2 = inflate.findViewById(R.id.indicatorScrolling);
            Intrinsics.checkNotNullExpressionValue(findViewById2, "v.findViewById(R.id.indicatorScrolling)");
            this.f107233c = (ScrollingPagerIndicator) findViewById2;
            Context context = this.f107231a;
            BannerAdapter bannerAdapter = null;
            if (context == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mContext");
                context = null;
            }
            MissionResponse m1739o = m1739o();
            if (m1739o != null) {
                list = m1739o.getResultMission();
            } else {
                list = null;
            }
            this.f107234d = new BannerAdapter(context, list, this);
            WrapContentHeightViewPager wrapContentHeightViewPager = this.f107232b;
            if (wrapContentHeightViewPager == null) {
                Intrinsics.throwUninitializedPropertyAccessException("viewPager");
                wrapContentHeightViewPager = null;
            }
            BannerAdapter bannerAdapter2 = this.f107234d;
            if (bannerAdapter2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("adapter");
                bannerAdapter2 = null;
            }
            wrapContentHeightViewPager.setAdapter(bannerAdapter2);
            ScrollingPagerIndicator scrollingPagerIndicator = this.f107233c;
            if (scrollingPagerIndicator == null) {
                Intrinsics.throwUninitializedPropertyAccessException("indicator");
                scrollingPagerIndicator = null;
            }
            WrapContentHeightViewPager wrapContentHeightViewPager2 = this.f107232b;
            if (wrapContentHeightViewPager2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("viewPager");
                wrapContentHeightViewPager2 = null;
            }
            scrollingPagerIndicator.attachToPager(wrapContentHeightViewPager2);
            BannerAdapter bannerAdapter3 = this.f107234d;
            if (bannerAdapter3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("adapter");
            } else {
                bannerAdapter = bannerAdapter3;
            }
            bannerAdapter.notifyDataSetChanged();
        }
        return inflate;
    }
}