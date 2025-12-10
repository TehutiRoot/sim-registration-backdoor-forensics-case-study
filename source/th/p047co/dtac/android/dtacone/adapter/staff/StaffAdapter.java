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
    public WeakReference f81530a;

    /* renamed from: b */
    public StaffListCollection f81531b;

    /* renamed from: c */
    public OnClickStaff f81532c;

    /* renamed from: d */
    public StaffPresenter f81533d;

    /* renamed from: e */
    public List f81534e;

    /* renamed from: th.co.dtac.android.dtacone.adapter.staff.StaffAdapter$StaffListViewHolder */
    /* loaded from: classes7.dex */
    public class StaffListViewHolder extends RecyclerView.ViewHolder {

        /* renamed from: a */
        public TextView f81535a;

        /* renamed from: b */
        public CardView f81536b;

        /* renamed from: c */
        public TextView f81537c;

        /* renamed from: d */
        public TextView f81538d;

        /* renamed from: e */
        public TextView f81539e;

        /* renamed from: f */
        public TextView f81540f;

        /* renamed from: g */
        public TextView f81541g;

        /* renamed from: h */
        public TextView f81542h;

        /* renamed from: i */
        public TextView f81543i;

        /* renamed from: j */
        public TextView f81544j;

        /* renamed from: k */
        public LinearLayout f81545k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public StaffListViewHolder(View view) {
            super(view);
            StaffAdapter.this = r1;
            this.f81535a = (TextView) view.findViewById(R.id.staff_user_id);
            this.f81536b = (CardView) view.findViewById(R.id.cardview_staff);
            this.f81537c = (TextView) view.findViewById(R.id.tvManagePermission);
            this.f81538d = (TextView) view.findViewById(R.id.tvManageMoney);
            this.f81539e = (TextView) view.findViewById(R.id.tvClearMoney);
            this.f81540f = (TextView) view.findViewById(R.id.staff_tv_name);
            this.f81541g = (TextView) view.findViewById(R.id.staff_tv_max_range_text);
            this.f81542h = (TextView) view.findViewById(R.id.staff_tv_max_range_amount);
            this.f81543i = (TextView) view.findViewById(R.id.staff_tv_total_sale_text);
            this.f81544j = (TextView) view.findViewById(R.id.staff_tv_total_sale_amount);
            this.f81545k = (LinearLayout) view.findViewById(R.id.imagePermissionBox);
            this.f81536b.setOnClickListener(new View.OnClickListener() { // from class: ZK1
                {
                    StaffAdapter.StaffListViewHolder.this = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    StaffAdapter.StaffListViewHolder.m20218d(StaffAdapter.StaffListViewHolder.this, view2);
                }
            });
            this.f81539e.setOnClickListener(new View.OnClickListener() { // from class: aL1
                {
                    StaffAdapter.StaffListViewHolder.this = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    StaffAdapter.StaffListViewHolder.m20219c(StaffAdapter.StaffListViewHolder.this, view2);
                }
            });
            this.f81538d.setOnClickListener(new View.OnClickListener() { // from class: bL1
                {
                    StaffAdapter.StaffListViewHolder.this = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    StaffAdapter.StaffListViewHolder.m20217e(StaffAdapter.StaffListViewHolder.this, view2);
                }
            });
            this.f81537c.setOnClickListener(new View.OnClickListener() { // from class: cL1
                {
                    StaffAdapter.StaffListViewHolder.this = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    StaffAdapter.StaffListViewHolder.m20220b(StaffAdapter.StaffListViewHolder.this, view2);
                }
            });
        }

        /* renamed from: b */
        public static /* synthetic */ void m20220b(StaffListViewHolder staffListViewHolder, View view) {
            staffListViewHolder.m20213i(view);
        }

        /* renamed from: c */
        public static /* synthetic */ void m20219c(StaffListViewHolder staffListViewHolder, View view) {
            staffListViewHolder.m20215g(view);
        }

        /* renamed from: d */
        public static /* synthetic */ void m20218d(StaffListViewHolder staffListViewHolder, View view) {
            staffListViewHolder.m20216f(view);
        }

        /* renamed from: e */
        public static /* synthetic */ void m20217e(StaffListViewHolder staffListViewHolder, View view) {
            staffListViewHolder.m20214h(view);
        }

        /* renamed from: f */
        public final /* synthetic */ void m20216f(View view) {
            StaffAdapter.this.f81532c.onClickStaffDetail(StaffAdapter.this.f81531b.getStaffs().get(getAdapterPosition()));
        }

        /* renamed from: g */
        public final /* synthetic */ void m20215g(View view) {
            StaffAdapter.this.f81532c.onManageMoney(StaffAdapter.this.f81531b.getStaffs().get(getAdapterPosition()));
        }

        /* renamed from: h */
        public final /* synthetic */ void m20214h(View view) {
            StaffAdapter.this.f81532c.onClickManagePermission(StaffAdapter.this.f81531b.getStaffs().get(getAdapterPosition()));
        }

        /* renamed from: i */
        public final /* synthetic */ void m20213i(View view) {
            StaffAdapter.this.f81532c.onClearMoney(StaffAdapter.this.f81531b.getStaffs().get(getAdapterPosition()));
        }
    }

    public StaffAdapter(Context context, List<String> list) {
        this.f81530a = new WeakReference(context);
        this.f81534e = list;
    }

    /* renamed from: c */
    public final void m20228c(StaffListViewHolder staffListViewHolder, ImageView imageView, int i) {
        if (staffListViewHolder.f81545k.getChildCount() < this.f81531b.getStaffs().get(staffListViewHolder.getAdapterPosition()).getPermissions().size()) {
            imageView.setImageResource(i);
            staffListViewHolder.f81545k.addView(imageView);
        }
    }

    /* renamed from: d */
    public final void m20227d(StaffListViewHolder staffListViewHolder, int i) {
        if (i > 0) {
            Animation loadAnimation = AnimationUtils.loadAnimation((Context) this.f81530a.get(), R.anim.slide_up);
            loadAnimation.setDuration(staffListViewHolder.getAdapterPosition() * 200);
            staffListViewHolder.f81536b.startAnimation(loadAnimation);
        }
    }

    /* renamed from: e */
    public final String m20226e(int i) {
        return MoneyFormat.convertToMoneyFormatNoFloating(i);
    }

    /* renamed from: f */
    public final void m20225f(StaffListViewHolder staffListViewHolder, List list) {
        if (!list.contains(PermissionConstant.M_STAFF_PRMSSN)) {
            staffListViewHolder.f81537c.setEnabled(false);
            staffListViewHolder.f81537c.setTextColor(ContextCompat.getColor((Context) this.f81530a.get(), R.color.warmGrey));
            Drawable drawable = ContextCompat.getDrawable((Context) this.f81530a.get(), R.drawable.ic_permission);
            drawable.setColorFilter(ContextCompat.getColor((Context) this.f81530a.get(), R.color.warmGrey), PorterDuff.Mode.SRC_IN);
            staffListViewHolder.f81537c.setCompoundDrawablesWithIntrinsicBounds(drawable, (Drawable) null, (Drawable) null, (Drawable) null);
        }
    }

    /* renamed from: g */
    public final ImageView m20224g() {
        int applyDimension = (int) TypedValue.applyDimension(1, 42.0f, ((Context) this.f81530a.get()).getResources().getDisplayMetrics());
        LinearLayoutCompat.LayoutParams layoutParams = new LinearLayoutCompat.LayoutParams(applyDimension, applyDimension);
        ImageView imageView = new ImageView((Context) this.f81530a.get());
        imageView.setPadding(0, 0, (int) ((Context) this.f81530a.get()).getResources().getDimension(R.dimen.dp12), 0);
        imageView.setLayoutParams(layoutParams);
        return imageView;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        StaffListCollection staffListCollection = this.f81531b;
        if (staffListCollection != null && staffListCollection.getStaffs() != null) {
            return this.f81531b.getStaffs().size();
        }
        return 0;
    }

    /* renamed from: h */
    public final Integer m20223h(String str) {
        return PermissionConstant.getImageTransactionType().get(str);
    }

    /* renamed from: i */
    public final void m20222i(StaffListViewHolder staffListViewHolder) {
        boolean z = true;
        for (Permission permission : this.f81531b.getStaffs().get(staffListViewHolder.getAdapterPosition()).getPermissions()) {
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
                            c = TokenParser.f74557CR;
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
                        m20228c(staffListViewHolder, m20224g(), m20223h(permission.getName()).intValue());
                        continue;
                    case 4:
                    case '\b':
                    case 16:
                    case 17:
                        if (z) {
                            m20228c(staffListViewHolder, m20224g(), m20223h(permission.getName()).intValue());
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
    public final void m20221j(StaffListViewHolder staffListViewHolder, StaffCollection staffCollection) {
        staffListViewHolder.f81545k.removeAllViews();
        staffListViewHolder.f81541g.setText(R.string.sale_credit_max);
        staffListViewHolder.f81543i.setText(R.string.sold_amount);
        staffListViewHolder.f81542h.setText(this.f81533d.getCreditText(this.f81531b.getStaffs().get(staffListViewHolder.getAdapterPosition())));
        staffListViewHolder.f81544j.setText(m20226e(this.f81531b.getStaffs().get(staffListViewHolder.getAdapterPosition()).getSoldAmount()));
        staffListViewHolder.f81535a.setText(PhoneNumberFormat.toLocalNumberWithPrettyFormat(staffCollection.getPhoneNumber(), PhoneNumberFormat.COUNTRY_CALLING_CODE.THAILAND));
        TextView textView = staffListViewHolder.f81540f;
        boolean hasText = StringUtil.hasText(staffCollection.getName());
        String name = staffCollection.getName();
        if (hasText) {
            name = name.concat(" : ");
        }
        textView.setText(name);
        m20222i(staffListViewHolder);
        m20225f(staffListViewHolder, this.f81534e);
    }

    public void setListStaff(StaffListCollection staffListCollection) {
        this.f81531b = staffListCollection;
        this.f81533d = new StaffPresenter();
    }

    public void setOnClickStaffListener(OnClickStaff onClickStaff) {
        this.f81532c = onClickStaff;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(StaffListViewHolder staffListViewHolder, int i) {
        m20227d(staffListViewHolder, i);
        m20221j(staffListViewHolder, this.f81531b.getStaffs().get(i));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public StaffListViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new StaffListViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.z_staff_item_row, viewGroup, false));
    }
}
