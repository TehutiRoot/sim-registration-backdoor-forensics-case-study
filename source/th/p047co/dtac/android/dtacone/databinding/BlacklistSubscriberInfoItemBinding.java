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

/* renamed from: th.co.dtac.android.dtacone.databinding.BlacklistSubscriberInfoItemBinding */
/* loaded from: classes7.dex */
public final class BlacklistSubscriberInfoItemBinding implements ViewBinding {

    /* renamed from: a */
    public final ConstraintLayout f83598a;
    @NonNull
    public final ImageView imageBottomLine;
    @NonNull
    public final DtacFontTextView valueCompanyName;
    @NonNull
    public final DtacFontTextView valueName;
    @NonNull
    public final DtacFontTextView valueSubscriberNumber;
    @NonNull
    public final DtacFontTextView valueSubscriberStatus;

    public BlacklistSubscriberInfoItemBinding(ConstraintLayout constraintLayout, ImageView imageView, DtacFontTextView dtacFontTextView, DtacFontTextView dtacFontTextView2, DtacFontTextView dtacFontTextView3, DtacFontTextView dtacFontTextView4) {
        this.f83598a = constraintLayout;
        this.imageBottomLine = imageView;
        this.valueCompanyName = dtacFontTextView;
        this.valueName = dtacFontTextView2;
        this.valueSubscriberNumber = dtacFontTextView3;
        this.valueSubscriberStatus = dtacFontTextView4;
    }

    @NonNull
    public static BlacklistSubscriberInfoItemBinding bind(@NonNull View view) {
        int i = R.id.imageBottomLine;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
        if (imageView != null) {
            i = R.id.valueCompanyName;
            DtacFontTextView dtacFontTextView = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
            if (dtacFontTextView != null) {
                i = R.id.valueName;
                DtacFontTextView dtacFontTextView2 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                if (dtacFontTextView2 != null) {
                    i = R.id.valueSubscriberNumber;
                    DtacFontTextView dtacFontTextView3 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                    if (dtacFontTextView3 != null) {
                        i = R.id.valueSubscriberStatus;
                        DtacFontTextView dtacFontTextView4 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                        if (dtacFontTextView4 != null) {
                            return new BlacklistSubscriberInfoItemBinding((ConstraintLayout) view, imageView, dtacFontTextView, dtacFontTextView2, dtacFontTextView3, dtacFontTextView4);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static BlacklistSubscriberInfoItemBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static BlacklistSubscriberInfoItemBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.blacklist_subscriber_info_item, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.f83598a;
    }
}
