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
import th.p047co.dtac.android.dtacone.app_one.widget.OneFontTextView;
import th.p047co.dtac.android.dtacone.app_one.widget.OneTextLayoutView;

/* renamed from: th.co.dtac.android.dtacone.databinding.ItemOneVerifyCampaignBirthDateBinding */
/* loaded from: classes7.dex */
public final class ItemOneVerifyCampaignBirthDateBinding implements ViewBinding {

    /* renamed from: a */
    public final ConstraintLayout f84483a;
    @NonNull
    public final OneTextLayoutView birthDayTextInputLayout;
    @NonNull
    public final ImageView calendarImageView;
    @NonNull
    public final OneFontTextView tvHintBirthDay;

    public ItemOneVerifyCampaignBirthDateBinding(ConstraintLayout constraintLayout, OneTextLayoutView oneTextLayoutView, ImageView imageView, OneFontTextView oneFontTextView) {
        this.f84483a = constraintLayout;
        this.birthDayTextInputLayout = oneTextLayoutView;
        this.calendarImageView = imageView;
        this.tvHintBirthDay = oneFontTextView;
    }

    @NonNull
    public static ItemOneVerifyCampaignBirthDateBinding bind(@NonNull View view) {
        int i = R.id.birthDayTextInputLayout;
        OneTextLayoutView oneTextLayoutView = (OneTextLayoutView) ViewBindings.findChildViewById(view, i);
        if (oneTextLayoutView != null) {
            i = R.id.calendarImageView;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
            if (imageView != null) {
                i = R.id.tvHintBirthDay;
                OneFontTextView oneFontTextView = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                if (oneFontTextView != null) {
                    return new ItemOneVerifyCampaignBirthDateBinding((ConstraintLayout) view, oneTextLayoutView, imageView, oneFontTextView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static ItemOneVerifyCampaignBirthDateBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ItemOneVerifyCampaignBirthDateBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.item_one_verify_campaign_birth_date, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.f84483a;
    }
}