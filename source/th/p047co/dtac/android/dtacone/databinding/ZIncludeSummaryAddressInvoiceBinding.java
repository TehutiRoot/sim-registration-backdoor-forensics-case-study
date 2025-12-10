package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.widget.view.DtacFontTextView;

/* renamed from: th.co.dtac.android.dtacone.databinding.ZIncludeSummaryAddressInvoiceBinding */
/* loaded from: classes7.dex */
public final class ZIncludeSummaryAddressInvoiceBinding implements ViewBinding {

    /* renamed from: a */
    public final CardView f84655a;
    @NonNull
    public final CardView cvMailingAddress;
    @NonNull
    public final RelativeLayout invoiceBox;
    @NonNull
    public final DtacFontTextView tvInvoice;
    @NonNull
    public final DtacFontTextView tvInvoiceEmail;
    @NonNull
    public final DtacFontTextView tvInvoiceLabel;
    @NonNull
    public final DtacFontTextView tvSentInvoice;
    @NonNull
    public final DtacFontTextView tvSentInvoiceLabel;

    public ZIncludeSummaryAddressInvoiceBinding(CardView cardView, CardView cardView2, RelativeLayout relativeLayout, DtacFontTextView dtacFontTextView, DtacFontTextView dtacFontTextView2, DtacFontTextView dtacFontTextView3, DtacFontTextView dtacFontTextView4, DtacFontTextView dtacFontTextView5) {
        this.f84655a = cardView;
        this.cvMailingAddress = cardView2;
        this.invoiceBox = relativeLayout;
        this.tvInvoice = dtacFontTextView;
        this.tvInvoiceEmail = dtacFontTextView2;
        this.tvInvoiceLabel = dtacFontTextView3;
        this.tvSentInvoice = dtacFontTextView4;
        this.tvSentInvoiceLabel = dtacFontTextView5;
    }

    @NonNull
    public static ZIncludeSummaryAddressInvoiceBinding bind(@NonNull View view) {
        CardView cardView = (CardView) view;
        int i = R.id.invoice_box;
        RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, i);
        if (relativeLayout != null) {
            i = R.id.tv_invoice;
            DtacFontTextView dtacFontTextView = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
            if (dtacFontTextView != null) {
                i = R.id.tv_invoice_email;
                DtacFontTextView dtacFontTextView2 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                if (dtacFontTextView2 != null) {
                    i = R.id.tv_invoice_label;
                    DtacFontTextView dtacFontTextView3 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                    if (dtacFontTextView3 != null) {
                        i = R.id.tv_sent_invoice;
                        DtacFontTextView dtacFontTextView4 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                        if (dtacFontTextView4 != null) {
                            i = R.id.tv_sent_invoice_label;
                            DtacFontTextView dtacFontTextView5 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                            if (dtacFontTextView5 != null) {
                                return new ZIncludeSummaryAddressInvoiceBinding(cardView, cardView, relativeLayout, dtacFontTextView, dtacFontTextView2, dtacFontTextView3, dtacFontTextView4, dtacFontTextView5);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static ZIncludeSummaryAddressInvoiceBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ZIncludeSummaryAddressInvoiceBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.z_include_summary_address_invoice, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public CardView getRoot() {
        return this.f84655a;
    }
}
