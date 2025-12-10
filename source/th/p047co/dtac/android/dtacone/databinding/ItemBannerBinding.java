package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.widget.view.DtacEllipsizingTextView;
import th.p047co.dtac.android.dtacone.widget.view.DtacFontTextView;

/* renamed from: th.co.dtac.android.dtacone.databinding.ItemBannerBinding */
/* loaded from: classes7.dex */
public final class ItemBannerBinding implements ViewBinding {

    /* renamed from: a */
    public final NestedScrollView f84305a;
    @NonNull
    public final ImageView btnClose;
    @NonNull
    public final ConstraintLayout constraint;
    @NonNull
    public final DtacFontTextView dtacFontTextView62;
    @NonNull
    public final DtacFontTextView dtacFontTextView63;
    @NonNull
    public final ImageView gamificationClock;
    @NonNull
    public final DtacEllipsizingTextView missionMessage1;
    @NonNull
    public final DtacEllipsizingTextView missionMessage2;
    @NonNull
    public final DtacFontTextView missionPeriod;
    @NonNull
    public final DtacFontTextView missionTitle;
    @NonNull
    public final ImageView selectMission;

    public ItemBannerBinding(NestedScrollView nestedScrollView, ImageView imageView, ConstraintLayout constraintLayout, DtacFontTextView dtacFontTextView, DtacFontTextView dtacFontTextView2, ImageView imageView2, DtacEllipsizingTextView dtacEllipsizingTextView, DtacEllipsizingTextView dtacEllipsizingTextView2, DtacFontTextView dtacFontTextView3, DtacFontTextView dtacFontTextView4, ImageView imageView3) {
        this.f84305a = nestedScrollView;
        this.btnClose = imageView;
        this.constraint = constraintLayout;
        this.dtacFontTextView62 = dtacFontTextView;
        this.dtacFontTextView63 = dtacFontTextView2;
        this.gamificationClock = imageView2;
        this.missionMessage1 = dtacEllipsizingTextView;
        this.missionMessage2 = dtacEllipsizingTextView2;
        this.missionPeriod = dtacFontTextView3;
        this.missionTitle = dtacFontTextView4;
        this.selectMission = imageView3;
    }

    @NonNull
    public static ItemBannerBinding bind(@NonNull View view) {
        int i = R.id.btnClose;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
        if (imageView != null) {
            i = R.id.constraint;
            ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
            if (constraintLayout != null) {
                i = R.id.dtacFontTextView62;
                DtacFontTextView dtacFontTextView = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                if (dtacFontTextView != null) {
                    i = R.id.dtacFontTextView63;
                    DtacFontTextView dtacFontTextView2 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                    if (dtacFontTextView2 != null) {
                        i = R.id.gamification_clock;
                        ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, i);
                        if (imageView2 != null) {
                            i = R.id.missionMessage1;
                            DtacEllipsizingTextView dtacEllipsizingTextView = (DtacEllipsizingTextView) ViewBindings.findChildViewById(view, i);
                            if (dtacEllipsizingTextView != null) {
                                i = R.id.missionMessage2;
                                DtacEllipsizingTextView dtacEllipsizingTextView2 = (DtacEllipsizingTextView) ViewBindings.findChildViewById(view, i);
                                if (dtacEllipsizingTextView2 != null) {
                                    i = R.id.missionPeriod;
                                    DtacFontTextView dtacFontTextView3 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                                    if (dtacFontTextView3 != null) {
                                        i = R.id.missionTitle;
                                        DtacFontTextView dtacFontTextView4 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                                        if (dtacFontTextView4 != null) {
                                            i = R.id.selectMission;
                                            ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(view, i);
                                            if (imageView3 != null) {
                                                return new ItemBannerBinding((NestedScrollView) view, imageView, constraintLayout, dtacFontTextView, dtacFontTextView2, imageView2, dtacEllipsizingTextView, dtacEllipsizingTextView2, dtacFontTextView3, dtacFontTextView4, imageView3);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static ItemBannerBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ItemBannerBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.item_banner, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public NestedScrollView getRoot() {
        return this.f84305a;
    }
}
