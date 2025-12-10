package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.widget.view.DtacFontTextView;

/* renamed from: th.co.dtac.android.dtacone.databinding.ActivityDummyEntryBinding */
/* loaded from: classes7.dex */
public final class ActivityDummyEntryBinding implements ViewBinding {

    /* renamed from: a */
    public final ConstraintLayout f83512a;
    @NonNull
    public final DtacFontTextView dtacFontTextView12;
    @NonNull
    public final DtacFontTextView dtacFontTextView13;
    @NonNull
    public final DtacFontTextView dtacFontTextView14;
    @NonNull
    public final DtacFontTextView dtacFontTextView15;
    @NonNull
    public final ImageView imageView17;
    @NonNull
    public final ImageView ivAppIcon;
    @NonNull
    public final ConstraintLayout relativeLayout2;

    public ActivityDummyEntryBinding(ConstraintLayout constraintLayout, DtacFontTextView dtacFontTextView, DtacFontTextView dtacFontTextView2, DtacFontTextView dtacFontTextView3, DtacFontTextView dtacFontTextView4, ImageView imageView, ImageView imageView2, ConstraintLayout constraintLayout2) {
        this.f83512a = constraintLayout;
        this.dtacFontTextView12 = dtacFontTextView;
        this.dtacFontTextView13 = dtacFontTextView2;
        this.dtacFontTextView14 = dtacFontTextView3;
        this.dtacFontTextView15 = dtacFontTextView4;
        this.imageView17 = imageView;
        this.ivAppIcon = imageView2;
        this.relativeLayout2 = constraintLayout2;
    }

    @NonNull
    public static ActivityDummyEntryBinding bind(@NonNull View view) {
        int i = R.id.dtacFontTextView12;
        DtacFontTextView dtacFontTextView = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
        if (dtacFontTextView != null) {
            i = R.id.dtacFontTextView13;
            DtacFontTextView dtacFontTextView2 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
            if (dtacFontTextView2 != null) {
                i = R.id.dtacFontTextView14;
                DtacFontTextView dtacFontTextView3 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                if (dtacFontTextView3 != null) {
                    i = R.id.dtacFontTextView15;
                    DtacFontTextView dtacFontTextView4 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                    if (dtacFontTextView4 != null) {
                        i = R.id.imageView17;
                        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
                        if (imageView != null) {
                            i = R.id.ivAppIcon;
                            ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, i);
                            if (imageView2 != null) {
                                ConstraintLayout constraintLayout = (ConstraintLayout) view;
                                return new ActivityDummyEntryBinding(constraintLayout, dtacFontTextView, dtacFontTextView2, dtacFontTextView3, dtacFontTextView4, imageView, imageView2, constraintLayout);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static ActivityDummyEntryBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ActivityDummyEntryBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.activity_dummy_entry, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.f83512a;
    }
}
