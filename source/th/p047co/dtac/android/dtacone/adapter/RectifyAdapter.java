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
    public Context f80962b;

    /* renamed from: c */
    public OnClickRectify f80963c;

    /* renamed from: d */
    public List f80964d;

    /* renamed from: a */
    public int f80961a = 0;

    /* renamed from: e */
    public final int f80965e = 1;

    /* renamed from: f */
    public final int f80966f = 0;

    /* renamed from: th.co.dtac.android.dtacone.adapter.RectifyAdapter$OnClickRectify */
    /* loaded from: classes7.dex */
    public interface OnClickRectify {
        void onClickRectifyItem(RectifyListCollection rectifyListCollection);
    }

    /* renamed from: th.co.dtac.android.dtacone.adapter.RectifyAdapter$RectifyHeaderViewHolder */
    /* loaded from: classes7.dex */
    public class RectifyHeaderViewHolder extends RecyclerView.ViewHolder {

        /* renamed from: a */
        public TextView f80967a;

        public RectifyHeaderViewHolder(ZRectifyHeaderRowBinding zRectifyHeaderRowBinding) {
            super(zRectifyHeaderRowBinding.getRoot());
            this.f80967a = zRectifyHeaderRowBinding.tvDate;
        }
    }

    /* renamed from: th.co.dtac.android.dtacone.adapter.RectifyAdapter$RectifyViewHolder */
    /* loaded from: classes7.dex */
    public class RectifyViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        /* renamed from: a */
        public CardView f80969a;

        /* renamed from: b */
        public TextView f80970b;

        /* renamed from: c */
        public TextView f80971c;

        /* renamed from: d */
        public TextView f80972d;

        /* renamed from: e */
        public TextView f80973e;

        /* renamed from: f */
        public TextView f80974f;

        /* renamed from: g */
        public ImageView f80975g;

        /* renamed from: h */
        public LinearLayout f80976h;

        public RectifyViewHolder(ZRectifyItemRowBinding zRectifyItemRowBinding) {
            super(zRectifyItemRowBinding.getRoot());
            DtacCardView dtacCardView = zRectifyItemRowBinding.cvRectify;
            this.f80969a = dtacCardView;
            this.f80970b = zRectifyItemRowBinding.tvRectifyTime;
            this.f80971c = zRectifyItemRowBinding.tvRectifyAmount;
            this.f80972d = zRectifyItemRowBinding.tvRectifyPhoneNumber;
            this.f80973e = zRectifyItemRowBinding.tvRectifyType;
            this.f80974f = zRectifyItemRowBinding.tvRectifyDescription;
            this.f80975g = zRectifyItemRowBinding.ivImageType;
            this.f80976h = zRectifyItemRowBinding.linearRectifyBox;
            dtacCardView.setOnClickListener(this);
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (RectifyAdapter.this.f80963c != null) {
                RectifyAdapter.this.f80963c.onClickRectifyItem((RectifyListCollection) RectifyAdapter.this.f80964d.get(getAdapterPosition()));
            }
        }
    }

    public RectifyAdapter(Context context) {
        this.f80962b = context;
    }

    /* renamed from: c */
    public final boolean m20451c(RectifyListCollection rectifyListCollection) {
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
                return this.f80962b.getString(R.string.rectify_topup_type);
            case 1:
                return this.f80962b.getString(R.string.rectify_epin_type);
            case 2:
                return this.f80962b.getString(R.string.rectify_stv_type);
            default:
                return "";
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        List list = this.f80964d;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        return !(this.f80964d.get(i) instanceof String) ? 1 : 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        int i2;
        Object obj = this.f80964d.get(i);
        if (viewHolder instanceof RectifyHeaderViewHolder) {
            ((RectifyHeaderViewHolder) viewHolder).f80967a.setText(DateUtil.convertServerDateToUserDate(obj.toString(), new Locale(LanguageSupport.LANG_TH, StandardStructureTypes.f60295TH)));
        } else if (viewHolder instanceof RectifyViewHolder) {
            RectifyViewHolder rectifyViewHolder = (RectifyViewHolder) viewHolder;
            if (viewHolder.getAdapterPosition() > this.f80961a) {
                rectifyViewHolder.f80969a.startAnimation(AnimationUtils.loadAnimation(this.f80962b, R.anim.slide_up));
                this.f80961a = viewHolder.getAdapterPosition();
            }
            RectifyListCollection rectifyListCollection = (RectifyListCollection) obj;
            String localNumberWithPrettyFormat = PhoneNumberFormat.toLocalNumberWithPrettyFormat(rectifyListCollection.getCustomerNumber(), PhoneNumberFormat.COUNTRY_CALLING_CODE.THAILAND);
            rectifyViewHolder.f80970b.setText(DateUtil.convertServerDateTimeToUserTime(rectifyListCollection.getCreatedDateTime(), new Locale(LanguageSupport.LANG_TH, StandardStructureTypes.f60295TH)));
            rectifyViewHolder.f80971c.setText(String.valueOf(rectifyListCollection.getAmount()));
            rectifyViewHolder.f80972d.setText(localNumberWithPrettyFormat);
            rectifyViewHolder.f80975g.setImageResource(PermissionConstant.getImageTransactionType().get(rectifyListCollection.getFeatureCode()).intValue());
            rectifyViewHolder.f80973e.setText(convertRectifyType(rectifyListCollection));
            TextView textView = rectifyViewHolder.f80974f;
            if (m20451c(rectifyListCollection)) {
                i2 = 0;
            } else {
                i2 = 8;
            }
            textView.setVisibility(i2);
            rectifyViewHolder.f80974f.setText(rectifyListCollection.getMarketDescription());
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
        this.f80963c = onClickRectify;
    }

    public void setRectifyList(List<Object> list) {
        this.f80964d = list;
    }
}
