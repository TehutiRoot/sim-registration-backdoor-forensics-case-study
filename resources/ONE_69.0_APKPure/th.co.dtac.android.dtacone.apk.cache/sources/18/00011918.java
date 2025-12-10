package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.widget.view.DtacFontTextView;

/* renamed from: th.co.dtac.android.dtacone.databinding.ZSimRListBinding */
/* loaded from: classes7.dex */
public final class ZSimRListBinding implements ViewBinding {

    /* renamed from: a */
    public final LinearLayout f84807a;
    @NonNull
    public final DtacFontTextView dialogListTvTitle;
    @NonNull
    public final RecyclerView zDialogStringRvData;

    public ZSimRListBinding(LinearLayout linearLayout, DtacFontTextView dtacFontTextView, RecyclerView recyclerView) {
        this.f84807a = linearLayout;
        this.dialogListTvTitle = dtacFontTextView;
        this.zDialogStringRvData = recyclerView;
    }

    @NonNull
    public static ZSimRListBinding bind(@NonNull View view) {
        int i = R.id.dialog_list_tv_title;
        DtacFontTextView dtacFontTextView = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
        if (dtacFontTextView != null) {
            i = R.id.z_dialog_string_rv_data;
            RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
            if (recyclerView != null) {
                return new ZSimRListBinding((LinearLayout) view, dtacFontTextView, recyclerView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static ZSimRListBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ZSimRListBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.z_sim_r_list, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayout getRoot() {
        return this.f84807a;
    }
}