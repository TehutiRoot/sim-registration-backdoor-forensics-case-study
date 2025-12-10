package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.widget.view.DtacClearableEditText;

/* renamed from: th.co.dtac.android.dtacone.databinding.ZPhoneNumberPhoneBookBinding */
/* loaded from: classes7.dex */
public final class ZPhoneNumberPhoneBookBinding implements ViewBinding {

    /* renamed from: a */
    public final LinearLayout f84791a;
    @NonNull
    public final LinearLayout rootCustomEditText;
    @NonNull
    public final DtacClearableEditText zTelEdtPhoneNumber;
    @NonNull
    public final ImageButton zTelIvPhoneBook;

    public ZPhoneNumberPhoneBookBinding(LinearLayout linearLayout, LinearLayout linearLayout2, DtacClearableEditText dtacClearableEditText, ImageButton imageButton) {
        this.f84791a = linearLayout;
        this.rootCustomEditText = linearLayout2;
        this.zTelEdtPhoneNumber = dtacClearableEditText;
        this.zTelIvPhoneBook = imageButton;
    }

    @NonNull
    public static ZPhoneNumberPhoneBookBinding bind(@NonNull View view) {
        LinearLayout linearLayout = (LinearLayout) view;
        int i = R.id.z_tel_edt_phone_number;
        DtacClearableEditText dtacClearableEditText = (DtacClearableEditText) ViewBindings.findChildViewById(view, i);
        if (dtacClearableEditText != null) {
            i = R.id.z_tel_iv_phone_book;
            ImageButton imageButton = (ImageButton) ViewBindings.findChildViewById(view, i);
            if (imageButton != null) {
                return new ZPhoneNumberPhoneBookBinding(linearLayout, linearLayout, dtacClearableEditText, imageButton);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static ZPhoneNumberPhoneBookBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ZPhoneNumberPhoneBookBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.z_phone_number_phone_book, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayout getRoot() {
        return this.f84791a;
    }
}