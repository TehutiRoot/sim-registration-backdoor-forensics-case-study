package th.p047co.dtac.android.dtacone.adapter.staff;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.cardview.widget.CardView;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.ref.WeakReference;
import java.util.List;
import org.apache.http.message.TokenParser;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.adapter.staff.StaffAdapter;
import th.p047co.dtac.android.dtacone.model.permission.Permission;
import th.p047co.dtac.android.dtacone.model.staff.StaffCollection;
import th.p047co.dtac.android.dtacone.model.staff.StaffListCollection;
import th.p047co.dtac.android.dtacone.presenter.staff.StaffPresenter;
import th.p047co.dtac.android.dtacone.util.constant.PermissionConstant;
import th.p047co.dtac.android.dtacone.util.format.MoneyFormat;
import th.p047co.dtac.android.dtacone.util.format.PhoneNumberFormat;
import th.p047co.dtac.android.dtacone.util.string.StringUtil;

/* renamed from: th.co.dtac.android.dtacone.adapter.staff.StaffAdapter */
/* loaded from: classes7.dex */
public class StaffAdapter extends RecyclerView.Adapter<StaffListViewHolder> {

    /* renamed from: a */
    public WeakReference f81621a;

    /* renamed from: b */
    public StaffListCollection f81622b;

    /* renamed from: c */
    public OnClickStaff f81623c;

    /* renamed from: d */
    public StaffPresenter f81624d;

    /* renamed from: e */
    public List f81625e;

    /* renamed from: th.co.dtac.android.dtacone.adapter.staff.StaffAdapter$StaffListViewHolder */
    /* loaded from: classes7.dex */
    public class StaffListViewHolder extends RecyclerView.ViewHolder {

        /* renamed from: a */
        public TextView f81626a;

        /* renamed from: b */
        public CardView f81627b;

        /* renamed from: c */
        public TextView f81628c;

        /* renamed from: d */
        public TextView f81629d;

        /* renamed from: e */
        public TextView f81630e;

        /* renamed from: f */
        public TextView f81631f;

        /* renamed from: g */
        public TextView f81632g;

        /* renamed from: h */
        public TextView f81633h;

        /* renamed from: i */
        public TextView f81634i;

        /* renamed from: j */
        public TextView f81635j;

        /* renamed from: k */
        public LinearLayout f81636k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public StaffListViewHolder(View view) {
            super(view);
            StaffAdapter.this = r1;
            this.f81626a = (TextView) view.findViewById(R.id.staff_user_id);
            this.f81627b = (CardView) view.findViewById(R.id.cardview_staff);
            this.f81628c = (TextView) view.findViewById(R.id.tvManagePermission);
            this.f81629d = (TextView) view.findViewById(R.id.tvManageMoney);
            this.f81630e = (TextView) view.findViewById(R.id.tvClearMoney);
            this.f81631f = (TextView) view.findViewById(R.id.staff_tv_name);
            this.f81632g = (TextView) view.findViewById(R.id.staff_tv_max_range_text);
            this.f81633h = (TextView) view.findViewById(R.id.staff_tv_max_range_amount);
            this.f81634i = (TextView) view.findViewById(R.id.staff_tv_total_sale_text);
            this.f81635j = (TextView) view.findViewById(R.id.staff_tv_total_sale_amount);
            this.f81636k = (LinearLayout) view.findViewById(R.id.imagePermissionBox);
            this.f81627b.setOnClickListener(new View.OnClickListener() { // from class: WL1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    StaffAdapter.StaffListViewHolder.m20393d(StaffAdapter.StaffListViewHolder.this, view2);
                }
            });
            this.f81630e.setOnClickListener(new View.OnClickListener() { // from class: XL1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    StaffAdapter.StaffListViewHolder.m20394c(StaffAdapter.StaffListViewHolder.this, view2);
                }
            });
            this.f81629d.setOnClickListener(new View.OnClickListener() { // from class: YL1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    StaffAdapter.StaffListViewHolder.m20392e(StaffAdapter.StaffListViewHolder.this, view2);
                }
            });
            this.f81628c.setOnClickListener(new View.OnClickListener() { // from class: ZL1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    StaffAdapter.StaffListViewHolder.m20395b(StaffAdapter.StaffListViewHolder.this, view2);
                }
            });
        }

        /* renamed from: b */
        public static /* synthetic */ void m20395b(StaffListViewHolder staffListViewHolder, View view) {
            staffListViewHolder.m20388i(view);
        }

        /* renamed from: c */
        public static /* synthetic */ void m20394c(StaffListViewHolder staffListViewHolder, View view) {
            staffListViewHolder.m20390g(view);
        }

        /* renamed from: d */
        public static /* synthetic */ void m20393d(StaffListViewHolder staffListViewHolder, View view) {
            staffListViewHolder.m20391f(view);
        }

        /* renamed from: e */
        public static /* synthetic */ void m20392e(StaffListViewHolder staffListViewHolder, View view) {
            staffListViewHolder.m20389h(view);
        }

        /* renamed from: f */
        public final /* synthetic */ void m20391f(View view) {
            StaffAdapter.this.f81623c.onClickStaffDetail(StaffAdapter.this.f81622b.getStaffs().get(getAdapterPosition()));
        }

        /* renamed from: g */
        public final /* synthetic */ void m20390g(View view) {
            StaffAdapter.this.f81623c.onManageMoney(StaffAdapter.this.f81622b.getStaffs().get(getAdapterPosition()));
        }

        /* renamed from: h */
        public final /* synthetic */ void m20389h(View view) {
            StaffAdapter.this.f81623c.onClickManagePermission(StaffAdapter.this.f81622b.getStaffs().get(getAdapterPosition()));
        }

        /* renamed from: i */
        public final /* synthetic */ void m20388i(View view) {
            StaffAdapter.this.f81623c.onClearMoney(StaffAdapter.this.f81622b.getStaffs().get(getAdapterPosition()));
        }
    }

    public StaffAdapter(Context context, List<String> list) {
        this.f81621a = new WeakReference(context);
        this.f81625e = list;
    }

    /* renamed from: c */
    public final void m20403c(StaffListViewHolder staffListViewHolder, ImageView imageView, int i) {
        if (staffListViewHolder.f81636k.getChildCount() < this.f81622b.getStaffs().get(staffListViewHolder.getAdapterPosition()).getPermissions().size()) {
            imageView.setImageResource(i);
            staffListViewHolder.f81636k.addView(imageView);
        }
    }

    /* renamed from: d */
    public final void m20402d(StaffListViewHolder staffListViewHolder, int i) {
        if (i > 0) {
            Animation loadAnimation = AnimationUtils.loadAnimation((Context) this.f81621a.get(), R.anim.slide_up);
            loadAnimation.setDuration(staffListViewHolder.getAdapterPosition() * 200);
            staffListViewHolder.f81627b.startAnimation(loadAnimation);
        }
    }

    /* renamed from: e */
    public final String m20401e(int i) {
        return MoneyFormat.convertToMoneyFormatNoFloating(i);
    }

    /* renamed from: f */
    public final void m20400f(StaffListViewHolder staffListViewHolder, List list) {
        if (!list.contains(PermissionConstant.M_STAFF_PRMSSN)) {
            staffListViewHolder.f81628c.setEnabled(false);
            staffListViewHolder.f81628c.setTextColor(ContextCompat.getColor((Context) this.f81621a.get(), R.color.warmGrey));
            Drawable drawable = ContextCompat.getDrawable((Context) this.f81621a.get(), R.drawable.ic_permission);
            drawable.setColorFilter(ContextCompat.getColor((Context) this.f81621a.get(), R.color.warmGrey), PorterDuff.Mode.SRC_IN);
            staffListViewHolder.f81628c.setCompoundDrawablesWithIntrinsicBounds(drawable, (Drawable) null, (Drawable) null, (Drawable) null);
        }
    }

    /* renamed from: g */
    public final ImageView m20399g() {
        int applyDimension = (int) TypedValue.applyDimension(1, 42.0f, ((Context) this.f81621a.get()).getResources().getDisplayMetrics());
        LinearLayoutCompat.LayoutParams layoutParams = new LinearLayoutCompat.LayoutParams(applyDimension, applyDimension);
        ImageView imageView = new ImageView((Context) this.f81621a.get());
        imageView.setPadding(0, 0, (int) ((Context) this.f81621a.get()).getResources().getDimension(R.dimen.dp12), 0);
        imageView.setLayoutParams(layoutParams);
        return imageView;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        StaffListCollection staffListCollection = this.f81622b;
        if (staffListCollection != null && staffListCollection.getStaffs() != null) {
            return this.f81622b.getStaffs().size();
        }
        return 0;
    }

    /* renamed from: h */
    public final Integer m20398h(String str) {
        return PermissionConstant.getImageTransactionType().get(str);
    }

    /* renamed from: i */
    public final void m20397i(StaffListViewHolder staffListViewHolder) {
        boolean z = true;
        for (Permission permission : this.f81622b.getStaffs().get(staffListViewHolder.getAdapterPosition()).getPermissions()) {
            if (permission.isAllow()) {
                String name = permission.getName();
                name.hashCode();
                char c = 65535;
                switch (name.hashCode()) {
                    case -2054117291:
                        if (name.equals(PermissionConstant.M_REGS_PRE)) {
                            c = 0;
                            break;
                        }
                        break;
                    case -1876882402:
                        if (name.equals(PermissionConstant.M_TOP_UP)) {
                            c = 1;
                            break;
                        }
                        break;
                    case -1871062906:
                        if (name.equals(PermissionConstant.M_RECTIFY)) {
                            c = 2;
                            break;
                        }
                        break;
                    case -1471258786:
                        if (name.equals(PermissionConstant.M_PRE2_POST)) {
                            c = 3;
                            break;
                        }
                        break;
                    case -423880016:
                        if (name.equals(PermissionConstant.M_XNTL_MNP)) {
                            c = 4;
                            break;
                        }
                        break;
                    case -311817006:
                        if (name.equals(PermissionConstant.M_RTR_PRFRMNCE)) {
                            c = 5;
                            break;
                        }
                        break;
                    case -311149962:
                        if (name.equals(PermissionConstant.M_STAFF_MANAGE)) {
                            c = 6;
                            break;
                        }
                        break;
                    case -209574764:
                        if (name.equals(PermissionConstant.M_STAFF_PRMSSN)) {
                            c = 7;
                            break;
                        }
                        break;
                    case -116194779:
                        if (name.equals(PermissionConstant.PORTIN_POSTPAID)) {
                            c = '\b';
                            break;
                        }
                        break;
                    case 65142765:
                        if (name.equals("E-PIN")) {
                            c = '\t';
                            break;
                        }
                        break;
                    case 74023715:
                        if (name.equals(PermissionConstant.M_STV)) {
                            c = '\n';
                            break;
                        }
                        break;
                    case 180022648:
                        if (name.equals(PermissionConstant.M_ACT_SIM)) {
                            c = 11;
                            break;
                        }
                        break;
                    case 425366920:
                        if (name.equals(PermissionConstant.M_CHNG_SIM)) {
                            c = '\f';
                            break;
                        }
                        break;
                    case 612691775:
                        if (name.equals(PermissionConstant.M_CHNG_OWNR_PRE)) {
                            c = TokenParser.f74641CR;
                            break;
                        }
                        break;
                    case 746499760:
                        if (name.equals(PermissionConstant.M_REGS_DAHM)) {
                            c = 14;
                            break;
                        }
                        break;
                    case 746871054:
                        if (name.equals(PermissionConstant.M_REGS_POST)) {
                            c = 15;
                            break;
                        }
                        break;
                    case 820914783:
                        if (name.equals(PermissionConstant.MNP_PREPAID)) {
                            c = 16;
                            break;
                        }
                        break;
                    case 1715952348:
                        if (name.equals(PermissionConstant.MNP_POSTPAID)) {
                            c = 17;
                            break;
                        }
                        break;
                    case 1943118610:
                        if (name.equals(PermissionConstant.M_CHNG_PFL_PIC)) {
                            c = 18;
                            break;
                        }
                        break;
                    case 1966832676:
                        if (name.equals(PermissionConstant.M_CHNG_PRE_PACK)) {
                            c = 19;
                            break;
                        }
                        break;
                }
                switch (c) {
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                    case 5:
                    case 6:
                    case 7:
                    case '\t':
                    case '\n':
                    case 11:
                    case '\f':
                    case '\r':
                    case 14:
                    case 15:
                    case 18:
                    case 19:
                        m20403c(staffListViewHolder, m20399g(), m20398h(permission.getName()).intValue());
                        continue;
                    case 4:
                    case '\b':
                    case 16:
                    case 17:
                        if (z) {
                            m20403c(staffListViewHolder, m20399g(), m20398h(permission.getName()).intValue());
                            z = false;
                            break;
                        } else {
                            continue;
                        }
                }
            }
        }
    }

    /* renamed from: j */
    public final void m20396j(StaffListViewHolder staffListViewHolder, StaffCollection staffCollection) {
        staffListViewHolder.f81636k.removeAllViews();
        staffListViewHolder.f81632g.setText(R.string.sale_credit_max);
        staffListViewHolder.f81634i.setText(R.string.sold_amount);
        staffListViewHolder.f81633h.setText(this.f81624d.getCreditText(this.f81622b.getStaffs().get(staffListViewHolder.getAdapterPosition())));
        staffListViewHolder.f81635j.setText(m20401e(this.f81622b.getStaffs().get(staffListViewHolder.getAdapterPosition()).getSoldAmount()));
        staffListViewHolder.f81626a.setText(PhoneNumberFormat.toLocalNumberWithPrettyFormat(staffCollection.getPhoneNumber(), PhoneNumberFormat.COUNTRY_CALLING_CODE.THAILAND));
        TextView textView = staffListViewHolder.f81631f;
        boolean hasText = StringUtil.hasText(staffCollection.getName());
        String name = staffCollection.getName();
        if (hasText) {
            name = name.concat(" : ");
        }
        textView.setText(name);
        m20397i(staffListViewHolder);
        m20400f(staffListViewHolder, this.f81625e);
    }

    public void setListStaff(StaffListCollection staffListCollection) {
        this.f81622b = staffListCollection;
        this.f81624d = new StaffPresenter();
    }

    public void setOnClickStaffListener(OnClickStaff onClickStaff) {
        this.f81623c = onClickStaff;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(StaffListViewHolder staffListViewHolder, int i) {
        m20402d(staffListViewHolder, i);
        m20396j(staffListViewHolder, this.f81622b.getStaffs().get(i));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public StaffListViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new StaffListViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.z_staff_item_row, viewGroup, false));
    }
}