package th.p047co.dtac.android.dtacone.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;
import com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.StandardStructureTypes;
import java.util.List;
import java.util.Locale;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.databinding.ZRectifyHeaderRowBinding;
import th.p047co.dtac.android.dtacone.databinding.ZRectifyItemRowBinding;
import th.p047co.dtac.android.dtacone.model.rectify.RectifyListCollection;
import th.p047co.dtac.android.dtacone.util.constant.LanguageSupport;
import th.p047co.dtac.android.dtacone.util.constant.PermissionConstant;
import th.p047co.dtac.android.dtacone.util.date.DateUtil;
import th.p047co.dtac.android.dtacone.util.format.PhoneNumberFormat;
import th.p047co.dtac.android.dtacone.widget.view.DtacCardView;

/* renamed from: th.co.dtac.android.dtacone.adapter.RectifyAdapter */
/* loaded from: classes7.dex */
public class RectifyAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    /* renamed from: b */
    public Context f81053b;

    /* renamed from: c */
    public OnClickRectify f81054c;

    /* renamed from: d */
    public List f81055d;

    /* renamed from: a */
    public int f81052a = 0;

    /* renamed from: e */
    public final int f81056e = 1;

    /* renamed from: f */
    public final int f81057f = 0;

    /* renamed from: th.co.dtac.android.dtacone.adapter.RectifyAdapter$OnClickRectify */
    /* loaded from: classes7.dex */
    public interface OnClickRectify {
        void onClickRectifyItem(RectifyListCollection rectifyListCollection);
    }

    /* renamed from: th.co.dtac.android.dtacone.adapter.RectifyAdapter$RectifyHeaderViewHolder */
    /* loaded from: classes7.dex */
    public class RectifyHeaderViewHolder extends RecyclerView.ViewHolder {

        /* renamed from: a */
        public TextView f81058a;

        public RectifyHeaderViewHolder(ZRectifyHeaderRowBinding zRectifyHeaderRowBinding) {
            super(zRectifyHeaderRowBinding.getRoot());
            this.f81058a = zRectifyHeaderRowBinding.tvDate;
        }
    }

    /* renamed from: th.co.dtac.android.dtacone.adapter.RectifyAdapter$RectifyViewHolder */
    /* loaded from: classes7.dex */
    public class RectifyViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        /* renamed from: a */
        public CardView f81060a;

        /* renamed from: b */
        public TextView f81061b;

        /* renamed from: c */
        public TextView f81062c;

        /* renamed from: d */
        public TextView f81063d;

        /* renamed from: e */
        public TextView f81064e;

        /* renamed from: f */
        public TextView f81065f;

        /* renamed from: g */
        public ImageView f81066g;

        /* renamed from: h */
        public LinearLayout f81067h;

        public RectifyViewHolder(ZRectifyItemRowBinding zRectifyItemRowBinding) {
            super(zRectifyItemRowBinding.getRoot());
            DtacCardView dtacCardView = zRectifyItemRowBinding.cvRectify;
            this.f81060a = dtacCardView;
            this.f81061b = zRectifyItemRowBinding.tvRectifyTime;
            this.f81062c = zRectifyItemRowBinding.tvRectifyAmount;
            this.f81063d = zRectifyItemRowBinding.tvRectifyPhoneNumber;
            this.f81064e = zRectifyItemRowBinding.tvRectifyType;
            this.f81065f = zRectifyItemRowBinding.tvRectifyDescription;
            this.f81066g = zRectifyItemRowBinding.ivImageType;
            this.f81067h = zRectifyItemRowBinding.linearRectifyBox;
            dtacCardView.setOnClickListener(this);
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (RectifyAdapter.this.f81054c != null) {
                RectifyAdapter.this.f81054c.onClickRectifyItem((RectifyListCollection) RectifyAdapter.this.f81055d.get(getAdapterPosition()));
            }
        }
    }

    public RectifyAdapter(Context context) {
        this.f81053b = context;
    }

    /* renamed from: c */
    public final boolean m20626c(RectifyListCollection rectifyListCollection) {
        return rectifyListCollection.getFeatureCode().equals(PermissionConstant.M_STV);
    }

    public String convertRectifyType(RectifyListCollection rectifyListCollection) {
        String featureCode = rectifyListCollection.getFeatureCode();
        featureCode.hashCode();
        char c = 65535;
        switch (featureCode.hashCode()) {
            case -1876882402:
                if (featureCode.equals(PermissionConstant.M_TOP_UP)) {
                    c = 0;
                    break;
                }
                break;
            case 65142765:
                if (featureCode.equals("E-PIN")) {
                    c = 1;
                    break;
                }
                break;
            case 74023715:
                if (featureCode.equals(PermissionConstant.M_STV)) {
                    c = 2;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                return this.f81053b.getString(R.string.rectify_topup_type);
            case 1:
                return this.f81053b.getString(R.string.rectify_epin_type);
            case 2:
                return this.f81053b.getString(R.string.rectify_stv_type);
            default:
                return "";
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        List list = this.f81055d;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        return !(this.f81055d.get(i) instanceof String) ? 1 : 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        int i2;
        Object obj = this.f81055d.get(i);
        if (viewHolder instanceof RectifyHeaderViewHolder) {
            ((RectifyHeaderViewHolder) viewHolder).f81058a.setText(DateUtil.convertServerDateToUserDate(obj.toString(), new Locale(LanguageSupport.LANG_TH, StandardStructureTypes.f60307TH)));
        } else if (viewHolder instanceof RectifyViewHolder) {
            RectifyViewHolder rectifyViewHolder = (RectifyViewHolder) viewHolder;
            if (viewHolder.getAdapterPosition() > this.f81052a) {
                rectifyViewHolder.f81060a.startAnimation(AnimationUtils.loadAnimation(this.f81053b, R.anim.slide_up));
                this.f81052a = viewHolder.getAdapterPosition();
            }
            RectifyListCollection rectifyListCollection = (RectifyListCollection) obj;
            String localNumberWithPrettyFormat = PhoneNumberFormat.toLocalNumberWithPrettyFormat(rectifyListCollection.getCustomerNumber(), PhoneNumberFormat.COUNTRY_CALLING_CODE.THAILAND);
            rectifyViewHolder.f81061b.setText(DateUtil.convertServerDateTimeToUserTime(rectifyListCollection.getCreatedDateTime(), new Locale(LanguageSupport.LANG_TH, StandardStructureTypes.f60307TH)));
            rectifyViewHolder.f81062c.setText(String.valueOf(rectifyListCollection.getAmount()));
            rectifyViewHolder.f81063d.setText(localNumberWithPrettyFormat);
            rectifyViewHolder.f81066g.setImageResource(PermissionConstant.getImageTransactionType().get(rectifyListCollection.getFeatureCode()).intValue());
            rectifyViewHolder.f81064e.setText(convertRectifyType(rectifyListCollection));
            TextView textView = rectifyViewHolder.f81065f;
            if (m20626c(rectifyListCollection)) {
                i2 = 0;
            } else {
                i2 = 8;
            }
            textView.setVisibility(i2);
            rectifyViewHolder.f81065f.setText(rectifyListCollection.getMarketDescription());
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        if (i == 0) {
            return new RectifyHeaderViewHolder(ZRectifyHeaderRowBinding.inflate(LayoutInflater.from(viewGroup.getContext()), viewGroup, false));
        }
        return new RectifyViewHolder(ZRectifyItemRowBinding.inflate(LayoutInflater.from(viewGroup.getContext()), viewGroup, false));
    }

    public void setOnClickRectify(OnClickRectify onClickRectify) {
        this.f81054c = onClickRectify;
    }

    public void setRectifyList(List<Object> list) {
        this.f81055d = list;
    }
}