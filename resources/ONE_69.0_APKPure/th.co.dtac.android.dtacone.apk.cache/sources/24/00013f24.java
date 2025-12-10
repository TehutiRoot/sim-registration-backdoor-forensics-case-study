package th.p047co.dtac.android.dtacone.view.appOne.staff.adapter;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.content.res.ResourcesCompat;
import androidx.core.view.ViewCompat;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.extension.format.MoneyFormatExtKt;
import th.p047co.dtac.android.dtacone.util.format.PhoneNumberFormat;
import th.p047co.dtac.android.dtacone.view.appOne.home.activity.OneHomeActivity;
import th.p047co.dtac.android.dtacone.view.appOne.staff.adapter.OneStaffAdapter;
import th.p047co.dtac.android.dtacone.view.appOne.staff.model.OneManageStaffThemeColorModel;
import th.p047co.dtac.android.dtacone.view.appOne.staff.model.StaffsItem;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u000201B\u001d\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u0019\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\u001b\u0010\u001c\u001a\u00020\u00142\n\u0010\u0012\u001a\u00060\u001bR\u00020\u0000H\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ)\u0010 \u001a\u00020\u00142\n\u0010\u0012\u001a\u00060\u001bR\u00020\u00002\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\u0005H\u0002¢\u0006\u0004\b \u0010!R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010'R\u0018\u0010+\u001a\u0004\u0018\u00010(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010/\u001a\u00020,8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b-\u0010.¨\u00062"}, m29142d2 = {"Lth/co/dtac/android/dtacone/view/appOne/staff/adapter/OneStaffAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Landroid/app/Activity;", "activity", "", "Lth/co/dtac/android/dtacone/view/appOne/staff/model/StaffsItem;", "staffList", "<init>", "(Landroid/app/Activity;Ljava/util/List;)V", "Landroid/view/ViewGroup;", "parent", "", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "getItemCount", "()I", "holder", "position", "", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V", "Lth/co/dtac/android/dtacone/view/appOne/staff/adapter/OneStaffAdapter$OnClickStaff;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "setListener", "(Lth/co/dtac/android/dtacone/view/appOne/staff/adapter/OneStaffAdapter$OnClickStaff;)V", "Lth/co/dtac/android/dtacone/view/appOne/staff/adapter/OneStaffAdapter$StaffItemViewHolder;", OperatorName.NON_STROKING_CMYK, "(Lth/co/dtac/android/dtacone/view/appOne/staff/adapter/OneStaffAdapter$StaffItemViewHolder;)V", "", "permissionList", OperatorName.SET_LINE_JOINSTYLE, "(Lth/co/dtac/android/dtacone/view/appOne/staff/adapter/OneStaffAdapter$StaffItemViewHolder;Ljava/util/List;)V", PDPageLabelRange.STYLE_LETTERS_LOWER, "Landroid/app/Activity;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Ljava/util/List;", OperatorName.CURVE_TO, "Lth/co/dtac/android/dtacone/view/appOne/staff/adapter/OneStaffAdapter$OnClickStaff;", "Lth/co/dtac/android/dtacone/view/appOne/staff/adapter/OneStaffDetailPermissionAdapter;", "d", "Lth/co/dtac/android/dtacone/view/appOne/staff/adapter/OneStaffDetailPermissionAdapter;", "adapter", "Lth/co/dtac/android/dtacone/view/appOne/home/activity/OneHomeActivity;", "e", "()Lth/co/dtac/android/dtacone/view/appOne/home/activity/OneHomeActivity;", "oneHomeActivity", "OnClickStaff", "StaffItemViewHolder", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nOneStaffAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OneStaffAdapter.kt\nth/co/dtac/android/dtacone/view/appOne/staff/adapter/OneStaffAdapter\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,116:1\n1#2:117\n*E\n"})
/* renamed from: th.co.dtac.android.dtacone.view.appOne.staff.adapter.OneStaffAdapter */
/* loaded from: classes10.dex */
public final class OneStaffAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    public static final int $stable = 8;

    /* renamed from: a */
    public final Activity f97214a;

    /* renamed from: b */
    public final List f97215b;

    /* renamed from: c */
    public OnClickStaff f97216c;

    /* renamed from: d */
    public OneStaffDetailPermissionAdapter f97217d;

    @Metadata(m29143d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH&J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\n\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH&¨\u0006\u000b"}, m29142d2 = {"Lth/co/dtac/android/dtacone/view/appOne/staff/adapter/OneStaffAdapter$OnClickStaff;", "", "onClickStaffClearCash", "", "staffItem", "Lth/co/dtac/android/dtacone/view/appOne/staff/model/StaffsItem;", "onClickStaffItem", "staffId", "", "onClickStaffManageSold", "onClickStaffPermission", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.view.appOne.staff.adapter.OneStaffAdapter$OnClickStaff */
    /* loaded from: classes10.dex */
    public interface OnClickStaff {
        void onClickStaffClearCash(@NotNull StaffsItem staffsItem);

        void onClickStaffItem(@NotNull String str);

        void onClickStaffManageSold(@NotNull StaffsItem staffsItem);

        void onClickStaffPermission(@NotNull String str);
    }

    @Metadata(m29143d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u000b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0011\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0017\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u001a\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0014\u001a\u0004\b\u0019\u0010\u0016R\u0017\u0010 \u001a\u00020\u001b8\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010#\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b!\u0010\u0014\u001a\u0004\b\"\u0010\u0016R\u0017\u0010&\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b$\u0010\u0014\u001a\u0004\b%\u0010\u0016R\u0017\u0010,\u001a\u00020'8\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R\u0017\u00102\u001a\u00020-8\u0006¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101R\u0017\u00105\u001a\u00020'8\u0006¢\u0006\f\n\u0004\b3\u0010)\u001a\u0004\b4\u0010+R\u0017\u00108\u001a\u00020-8\u0006¢\u0006\f\n\u0004\b6\u0010/\u001a\u0004\b7\u00101R\u0017\u0010;\u001a\u00020'8\u0006¢\u0006\f\n\u0004\b9\u0010)\u001a\u0004\b:\u0010+R\u0017\u0010>\u001a\u00020-8\u0006¢\u0006\f\n\u0004\b<\u0010/\u001a\u0004\b=\u00101R\u0017\u0010D\u001a\u00020?8\u0006¢\u0006\f\n\u0004\b@\u0010A\u001a\u0004\bB\u0010C¨\u0006E"}, m29142d2 = {"Lth/co/dtac/android/dtacone/view/appOne/staff/adapter/OneStaffAdapter$StaffItemViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Landroid/view/View;", Promotion.ACTION_VIEW, "<init>", "(Lth/co/dtac/android/dtacone/view/appOne/staff/adapter/OneStaffAdapter;Landroid/view/View;)V", "Landroid/widget/RelativeLayout;", PDPageLabelRange.STYLE_LETTERS_LOWER, "Landroid/widget/RelativeLayout;", "getLayoutBox", "()Landroid/widget/RelativeLayout;", "layoutBox", "Landroid/widget/LinearLayout;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Landroid/widget/LinearLayout;", "getLinearBoxName", "()Landroid/widget/LinearLayout;", "linearBoxName", "Landroid/widget/TextView;", OperatorName.CURVE_TO, "Landroid/widget/TextView;", "getTvStaffName", "()Landroid/widget/TextView;", "tvStaffName", "d", "getTvStaffPhoneNumber", "tvStaffPhoneNumber", "Landroid/widget/ImageView;", "e", "Landroid/widget/ImageView;", "getIvNext", "()Landroid/widget/ImageView;", "ivNext", OperatorName.FILL_NON_ZERO, "getTvCreditAmount", "tvCreditAmount", OperatorName.NON_STROKING_GRAY, "getTvSoldAmount", "tvSoldAmount", "Landroidx/appcompat/widget/LinearLayoutCompat;", OperatorName.CLOSE_PATH, "Landroidx/appcompat/widget/LinearLayoutCompat;", "getLayoutPermissionSetting", "()Landroidx/appcompat/widget/LinearLayoutCompat;", "layoutPermissionSetting", "Landroidx/appcompat/widget/AppCompatImageView;", "i", "Landroidx/appcompat/widget/AppCompatImageView;", "getIvPermissionSetting", "()Landroidx/appcompat/widget/AppCompatImageView;", "ivPermissionSetting", OperatorName.SET_LINE_JOINSTYLE, "getLayoutPermissionLimit", "layoutPermissionLimit", OperatorName.NON_STROKING_CMYK, "getIvPermissionLimit", "ivPermissionLimit", OperatorName.LINE_TO, "getLayoutPermissionClear", "layoutPermissionClear", OperatorName.MOVE_TO, "getIvPermissionClear", "ivPermissionClear", "Landroidx/recyclerview/widget/RecyclerView;", OperatorName.ENDPATH, "Landroidx/recyclerview/widget/RecyclerView;", "getRvPermission", "()Landroidx/recyclerview/widget/RecyclerView;", "rvPermission", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0})
    /* renamed from: th.co.dtac.android.dtacone.view.appOne.staff.adapter.OneStaffAdapter$StaffItemViewHolder */
    /* loaded from: classes10.dex */
    public final class StaffItemViewHolder extends RecyclerView.ViewHolder {

        /* renamed from: a */
        public final RelativeLayout f97218a;

        /* renamed from: b */
        public final LinearLayout f97219b;

        /* renamed from: c */
        public final TextView f97220c;

        /* renamed from: d */
        public final TextView f97221d;

        /* renamed from: e */
        public final ImageView f97222e;

        /* renamed from: f */
        public final TextView f97223f;

        /* renamed from: g */
        public final TextView f97224g;

        /* renamed from: h */
        public final LinearLayoutCompat f97225h;

        /* renamed from: i */
        public final AppCompatImageView f97226i;

        /* renamed from: j */
        public final LinearLayoutCompat f97227j;

        /* renamed from: k */
        public final AppCompatImageView f97228k;

        /* renamed from: l */
        public final LinearLayoutCompat f97229l;

        /* renamed from: m */
        public final AppCompatImageView f97230m;

        /* renamed from: n */
        public final RecyclerView f97231n;

        /* renamed from: o */
        public final /* synthetic */ OneStaffAdapter f97232o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public StaffItemViewHolder(@NotNull OneStaffAdapter oneStaffAdapter, View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "view");
            this.f97232o = oneStaffAdapter;
            View findViewById = view.findViewById(R.id.layoutBox);
            Intrinsics.checkNotNull(findViewById, "null cannot be cast to non-null type android.widget.RelativeLayout");
            this.f97218a = (RelativeLayout) findViewById;
            View findViewById2 = view.findViewById(R.id.linearBoxName);
            Intrinsics.checkNotNull(findViewById2, "null cannot be cast to non-null type android.widget.LinearLayout");
            this.f97219b = (LinearLayout) findViewById2;
            View findViewById3 = view.findViewById(R.id.tvStaffName);
            Intrinsics.checkNotNull(findViewById3, "null cannot be cast to non-null type android.widget.TextView");
            this.f97220c = (TextView) findViewById3;
            View findViewById4 = view.findViewById(R.id.tvStaffPhoneNumber);
            Intrinsics.checkNotNull(findViewById4, "null cannot be cast to non-null type android.widget.TextView");
            this.f97221d = (TextView) findViewById4;
            View findViewById5 = view.findViewById(R.id.ivNext);
            Intrinsics.checkNotNull(findViewById5, "null cannot be cast to non-null type android.widget.ImageView");
            this.f97222e = (ImageView) findViewById5;
            View findViewById6 = view.findViewById(R.id.tvCreditAmount);
            Intrinsics.checkNotNull(findViewById6, "null cannot be cast to non-null type android.widget.TextView");
            this.f97223f = (TextView) findViewById6;
            View findViewById7 = view.findViewById(R.id.tvSoldAmount);
            Intrinsics.checkNotNull(findViewById7, "null cannot be cast to non-null type android.widget.TextView");
            this.f97224g = (TextView) findViewById7;
            View findViewById8 = view.findViewById(R.id.layoutPermissionSetting);
            Intrinsics.checkNotNull(findViewById8, "null cannot be cast to non-null type androidx.appcompat.widget.LinearLayoutCompat");
            this.f97225h = (LinearLayoutCompat) findViewById8;
            View findViewById9 = view.findViewById(R.id.ivPermissionSetting);
            Intrinsics.checkNotNull(findViewById9, "null cannot be cast to non-null type androidx.appcompat.widget.AppCompatImageView");
            this.f97226i = (AppCompatImageView) findViewById9;
            View findViewById10 = view.findViewById(R.id.layoutPermissionLimit);
            Intrinsics.checkNotNull(findViewById10, "null cannot be cast to non-null type androidx.appcompat.widget.LinearLayoutCompat");
            this.f97227j = (LinearLayoutCompat) findViewById10;
            View findViewById11 = view.findViewById(R.id.ivPermissionLimit);
            Intrinsics.checkNotNull(findViewById11, "null cannot be cast to non-null type androidx.appcompat.widget.AppCompatImageView");
            this.f97228k = (AppCompatImageView) findViewById11;
            View findViewById12 = view.findViewById(R.id.layoutPermissionClear);
            Intrinsics.checkNotNull(findViewById12, "null cannot be cast to non-null type androidx.appcompat.widget.LinearLayoutCompat");
            this.f97229l = (LinearLayoutCompat) findViewById12;
            View findViewById13 = view.findViewById(R.id.ivPermissionClear);
            Intrinsics.checkNotNull(findViewById13, "null cannot be cast to non-null type androidx.appcompat.widget.AppCompatImageView");
            this.f97230m = (AppCompatImageView) findViewById13;
            View findViewById14 = view.findViewById(R.id.rvPermission);
            Intrinsics.checkNotNull(findViewById14, "null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView");
            this.f97231n = (RecyclerView) findViewById14;
        }

        @NotNull
        public final ImageView getIvNext() {
            return this.f97222e;
        }

        @NotNull
        public final AppCompatImageView getIvPermissionClear() {
            return this.f97230m;
        }

        @NotNull
        public final AppCompatImageView getIvPermissionLimit() {
            return this.f97228k;
        }

        @NotNull
        public final AppCompatImageView getIvPermissionSetting() {
            return this.f97226i;
        }

        @NotNull
        public final RelativeLayout getLayoutBox() {
            return this.f97218a;
        }

        @NotNull
        public final LinearLayoutCompat getLayoutPermissionClear() {
            return this.f97229l;
        }

        @NotNull
        public final LinearLayoutCompat getLayoutPermissionLimit() {
            return this.f97227j;
        }

        @NotNull
        public final LinearLayoutCompat getLayoutPermissionSetting() {
            return this.f97225h;
        }

        @NotNull
        public final LinearLayout getLinearBoxName() {
            return this.f97219b;
        }

        @NotNull
        public final RecyclerView getRvPermission() {
            return this.f97231n;
        }

        @NotNull
        public final TextView getTvCreditAmount() {
            return this.f97223f;
        }

        @NotNull
        public final TextView getTvSoldAmount() {
            return this.f97224g;
        }

        @NotNull
        public final TextView getTvStaffName() {
            return this.f97220c;
        }

        @NotNull
        public final TextView getTvStaffPhoneNumber() {
            return this.f97221d;
        }
    }

    public OneStaffAdapter(@NotNull Activity activity, @NotNull List<StaffsItem> staffList) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(staffList, "staffList");
        this.f97214a = activity;
        this.f97215b = staffList;
    }

    /* renamed from: f */
    public static final void m10006f(OneStaffAdapter this$0, int i, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        OnClickStaff onClickStaff = this$0.f97216c;
        if (onClickStaff != null) {
            onClickStaff.onClickStaffItem(String.valueOf(i));
        }
    }

    /* renamed from: g */
    public static final void m10005g(OneStaffAdapter this$0, int i, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        OnClickStaff onClickStaff = this$0.f97216c;
        if (onClickStaff != null) {
            onClickStaff.onClickStaffPermission(String.valueOf(i));
        }
    }

    /* renamed from: h */
    public static final void m10004h(OneStaffAdapter this$0, StaffsItem staff, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(staff, "$staff");
        OnClickStaff onClickStaff = this$0.f97216c;
        if (onClickStaff != null) {
            onClickStaff.onClickStaffManageSold(staff);
        }
    }

    /* renamed from: i */
    public static final void m10003i(OneStaffAdapter this$0, StaffsItem staff, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(staff, "$staff");
        OnClickStaff onClickStaff = this$0.f97216c;
        if (onClickStaff != null) {
            onClickStaff.onClickStaffClearCash(staff);
        }
    }

    /* renamed from: e */
    public final OneHomeActivity m10007e() {
        Activity activity = this.f97214a;
        Intrinsics.checkNotNull(activity, "null cannot be cast to non-null type th.co.dtac.android.dtacone.view.appOne.home.activity.OneHomeActivity");
        return (OneHomeActivity) activity;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f97215b.size();
    }

    /* renamed from: j */
    public final void m10002j(StaffItemViewHolder staffItemViewHolder, List list) {
        Activity activity = this.f97214a;
        String company = m10007e().getPfViewModel().getCompany();
        Intrinsics.checkNotNullExpressionValue(company, "oneHomeActivity.pfViewModel.getCompany()");
        this.f97217d = new OneStaffDetailPermissionAdapter(activity, list, company);
        staffItemViewHolder.getRvPermission().setAdapter(this.f97217d);
        staffItemViewHolder.getRvPermission().setLayoutManager(new GridLayoutManager((Context) this.f97214a, 7, 1, false));
        staffItemViewHolder.getRvPermission().setItemAnimator(new DefaultItemAnimator());
        ViewCompat.setNestedScrollingEnabled(staffItemViewHolder.getRvPermission(), true);
    }

    /* renamed from: k */
    public final void m10001k(StaffItemViewHolder staffItemViewHolder) {
        OneManageStaffThemeColorModel oneManageStaffThemeColorModel = m10007e().getOneManageStaffThemeColorModel();
        staffItemViewHolder.getLayoutPermissionSetting().setBackgroundResource(oneManageStaffThemeColorModel.getButtonBackground());
        staffItemViewHolder.getLinearBoxName().setBackgroundResource(oneManageStaffThemeColorModel.getHeaderBackground());
        staffItemViewHolder.getTvStaffName().setTextColor(ResourcesCompat.getColor(staffItemViewHolder.itemView.getContext().getResources(), oneManageStaffThemeColorModel.getFontColor(), null));
        staffItemViewHolder.getTvStaffPhoneNumber().setTextColor(ResourcesCompat.getColor(staffItemViewHolder.itemView.getContext().getResources(), oneManageStaffThemeColorModel.getFontColor(), null));
        staffItemViewHolder.getIvNext().setImageResource(oneManageStaffThemeColorModel.getIconArrow());
        staffItemViewHolder.getTvCreditAmount().setTextColor(ResourcesCompat.getColor(staffItemViewHolder.itemView.getContext().getResources(), oneManageStaffThemeColorModel.getFontColor(), null));
        staffItemViewHolder.getTvSoldAmount().setTextColor(ResourcesCompat.getColor(staffItemViewHolder.itemView.getContext().getResources(), oneManageStaffThemeColorModel.getFontColor(), null));
        staffItemViewHolder.getIvPermissionSetting().setImageResource(oneManageStaffThemeColorModel.getIconSetPermission());
        staffItemViewHolder.getLayoutPermissionLimit().setBackgroundResource(oneManageStaffThemeColorModel.getButtonBackground());
        staffItemViewHolder.getIvPermissionLimit().setImageResource(oneManageStaffThemeColorModel.getIconLimitAmount());
        staffItemViewHolder.getLayoutPermissionClear().setBackgroundResource(oneManageStaffThemeColorModel.getButtonBackground());
        staffItemViewHolder.getIvPermissionClear().setImageResource(oneManageStaffThemeColorModel.getIconClearAmount());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull RecyclerView.ViewHolder holder, int i) {
        int i2;
        String moneyFormatNoFloating;
        Intrinsics.checkNotNullParameter(holder, "holder");
        final StaffsItem staffsItem = (StaffsItem) this.f97215b.get(i);
        if (holder instanceof StaffItemViewHolder) {
            StaffItemViewHolder staffItemViewHolder = (StaffItemViewHolder) holder;
            m10001k(staffItemViewHolder);
            TextView tvStaffName = staffItemViewHolder.getTvStaffName();
            String name = staffsItem.getName();
            tvStaffName.setText(name + " : ");
            staffItemViewHolder.getTvStaffPhoneNumber().setText(PhoneNumberFormat.toLocalNumberWithPrettyFormat(staffsItem.getUserId(), PhoneNumberFormat.COUNTRY_CALLING_CODE.THAILAND));
            TextView tvCreditAmount = staffItemViewHolder.getTvCreditAmount();
            Integer credit = staffsItem.getCredit();
            int i3 = 0;
            if (credit != null && credit.intValue() == 9999999) {
                moneyFormatNoFloating = "ไม่จำกัด";
            } else {
                Integer credit2 = staffsItem.getCredit();
                if (credit2 != null) {
                    i2 = credit2.intValue();
                } else {
                    i2 = 0;
                }
                moneyFormatNoFloating = MoneyFormatExtKt.toMoneyFormatNoFloating(i2);
            }
            tvCreditAmount.setText(moneyFormatNoFloating);
            TextView tvSoldAmount = staffItemViewHolder.getTvSoldAmount();
            Integer soldAmount = staffsItem.getSoldAmount();
            if (soldAmount != null) {
                i3 = soldAmount.intValue();
            }
            tvSoldAmount.setText(MoneyFormatExtKt.toMoneyFormatNoFloating(i3));
            m10002j(staffItemViewHolder, staffsItem.getListPermission());
            if (this.f97216c != null) {
                Integer id2 = staffsItem.getId();
                if (id2 != null) {
                    final int intValue = id2.intValue();
                    staffItemViewHolder.getLayoutBox().setOnClickListener(new View.OnClickListener() { // from class: wd1
                        {
                            OneStaffAdapter.this = this;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            OneStaffAdapter.m10006f(OneStaffAdapter.this, intValue, view);
                        }
                    });
                }
                Integer id3 = staffsItem.getId();
                if (id3 != null) {
                    final int intValue2 = id3.intValue();
                    staffItemViewHolder.getLayoutPermissionSetting().setOnClickListener(new View.OnClickListener() { // from class: xd1
                        {
                            OneStaffAdapter.this = this;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            OneStaffAdapter.m10005g(OneStaffAdapter.this, intValue2, view);
                        }
                    });
                }
                staffItemViewHolder.getLayoutPermissionLimit().setOnClickListener(new View.OnClickListener() { // from class: yd1
                    {
                        OneStaffAdapter.this = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        OneStaffAdapter.m10004h(OneStaffAdapter.this, staffsItem, view);
                    }
                });
                staffItemViewHolder.getLayoutPermissionClear().setOnClickListener(new View.OnClickListener() { // from class: zd1
                    {
                        OneStaffAdapter.this = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        OneStaffAdapter.m10003i(OneStaffAdapter.this, staffsItem, view);
                    }
                });
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public RecyclerView.ViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int i) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        View view = LayoutInflater.from(this.f97214a).inflate(R.layout.one_staff_item_row, parent, false);
        Intrinsics.checkNotNullExpressionValue(view, "view");
        return new StaffItemViewHolder(this, view);
    }

    public final void setListener(@NotNull OnClickStaff listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f97216c = listener;
    }
}