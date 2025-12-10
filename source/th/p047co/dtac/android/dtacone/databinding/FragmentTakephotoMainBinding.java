package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.widget.view.DtacFontButton;

/* renamed from: th.co.dtac.android.dtacone.databinding.FragmentTakephotoMainBinding */
/* loaded from: classes7.dex */
public final class FragmentTakephotoMainBinding implements ViewBinding {

    /* renamed from: a */
    public final ConstraintLayout f84210a;
    @NonNull
    public final DtacFontButton buttonRetakeAll;
    @NonNull
    public final DtacFontButton buttonSubmit;
    @NonNull
    public final FrameLayout cameraContainer;
    @NonNull
    public final View divider1;
    @NonNull
    public final ConstraintLayout imageListFrame;
    @NonNull
    public final RecyclerView photoListView;

    public FragmentTakephotoMainBinding(ConstraintLayout constraintLayout, DtacFontButton dtacFontButton, DtacFontButton dtacFontButton2, FrameLayout frameLayout, View view, ConstraintLayout constraintLayout2, RecyclerView recyclerView) {
        this.f84210a = constraintLayout;
        this.buttonRetakeAll = dtacFontButton;
        this.buttonSubmit = dtacFontButton2;
        this.cameraContainer = frameLayout;
        this.divider1 = view;
        this.imageListFrame = constraintLayout2;
        this.photoListView = recyclerView;
    }

    @NonNull
    public static FragmentTakephotoMainBinding bind(@NonNull View view) {
        View findChildViewById;
        int i = R.id.buttonRetakeAll;
        DtacFontButton dtacFontButton = (DtacFontButton) ViewBindings.findChildViewById(view, i);
        if (dtacFontButton != null) {
            i = R.id.buttonSubmit;
            DtacFontButton dtacFontButton2 = (DtacFontButton) ViewBindings.findChildViewById(view, i);
            if (dtacFontButton2 != null) {
                i = R.id.cameraContainer;
                FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, i);
                if (frameLayout != null && (findChildViewById = ViewBindings.findChildViewById(view, (i = R.id.divider1))) != null) {
                    i = R.id.imageListFrame;
                    ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
                    if (constraintLayout != null) {
                        i = R.id.photoListView;
                        RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
                        if (recyclerView != null) {
                            return new FragmentTakephotoMainBinding((ConstraintLayout) view, dtacFontButton, dtacFontButton2, frameLayout, findChildViewById, constraintLayout, recyclerView);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static FragmentTakephotoMainBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentTakephotoMainBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_takephoto_main, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.f84210a;
    }
}
