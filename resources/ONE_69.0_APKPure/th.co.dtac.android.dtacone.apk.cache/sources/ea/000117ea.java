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

/* renamed from: th.co.dtac.android.dtacone.databinding.ItemSuspendInfoBinding */
/* loaded from: classes7.dex */
public final class ItemSuspendInfoBinding implements ViewBinding {

    /* renamed from: a */
    public final ConstraintLayout f84505a;
    @NonNull
    public final ImageView imageBottomLine;
    @NonNull
    public final ImageView statusDot;
    @NonNull
    public final DtacFontTextView suspendBy;
    @NonNull
    public final DtacFontTextView suspendDateTime;
    @NonNull
    public final DtacFontTextView suspendTitle;

    public ItemSuspendInfoBinding(ConstraintLayout constraintLayout, ImageView imageView, ImageView imageView2, DtacFontTextView dtacFontTextView, DtacFontTextView dtacFontTextView2, DtacFontTextView dtacFontTextView3) {
        this.f84505a = constraintLayout;
        this.imageBottomLine = imageView;
        this.statusDot = imageView2;
        this.suspendBy = dtacFontTextView;
        this.suspendDateTime = dtacFontTextView2;
        this.suspendTitle = dtacFontTextView3;
    }

    @NonNull
    public static ItemSuspendInfoBinding bind(@NonNull View view) {
        int i = R.id.imageBottomLine;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
        if (imageView != null) {
            i = R.id.statusDot;
            ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, i);
            if (imageView2 != null) {
                i = R.id.suspendBy;
                DtacFontTextView dtacFontTextView = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                if (dtacFontTextView != null) {
                    i = R.id.suspendDateTime;
                    DtacFontTextView dtacFontTextView2 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                    if (dtacFontTextView2 != null) {
                        i = R.id.suspendTitle;
                        DtacFontTextView dtacFontTextView3 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                        if (dtacFontTextView3 != null) {
                            return new ItemSuspendInfoBinding((ConstraintLayout) view, imageView, imageView2, dtacFontTextView, dtacFontTextView2, dtacFontTextView3);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static ItemSuspendInfoBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ItemSuspendInfoBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.item_suspend_info, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.f84505a;
    }
}