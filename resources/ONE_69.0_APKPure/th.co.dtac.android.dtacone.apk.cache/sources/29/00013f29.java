package th.p047co.dtac.android.dtacone.view.appOne.staff.adapter;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.SwitchCompat;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.app_one.util.p048enum.OnePermissionKt;
import th.p047co.dtac.android.dtacone.app_one.widget.OneFontTextView;
import th.p047co.dtac.android.dtacone.view.appOne.staff.adapter.OneStaffPermissionAdapter;
import th.p047co.dtac.android.dtacone.view.appOne.staff.model.detail.PermissionsItem;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002&'B/\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0016\u0010\b\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0015\u0010\u001c\u001a\u00020\u00172\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001c\u0010\u001dR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR$\u0010\b\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010%¨\u0006("}, m29142d2 = {"Lth/co/dtac/android/dtacone/view/appOne/staff/adapter/OneStaffPermissionAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Landroid/app/Activity;", "activity", "Ljava/util/ArrayList;", "Lth/co/dtac/android/dtacone/view/appOne/staff/model/detail/PermissionsItem;", "Lkotlin/collections/ArrayList;", "listPermission", "", "companyName", "<init>", "(Landroid/app/Activity;Ljava/util/ArrayList;Ljava/lang/String;)V", "Landroid/view/ViewGroup;", "parent", "", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "getItemCount", "()I", "holder", "position", "", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V", "Lth/co/dtac/android/dtacone/view/appOne/staff/adapter/OneStaffPermissionAdapter$OnPermissionCheckedChangeListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "setListener", "(Lth/co/dtac/android/dtacone/view/appOne/staff/adapter/OneStaffPermissionAdapter$OnPermissionCheckedChangeListener;)V", PDPageLabelRange.STYLE_LETTERS_LOWER, "Landroid/app/Activity;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Ljava/util/ArrayList;", OperatorName.CURVE_TO, "Ljava/lang/String;", "d", "Lth/co/dtac/android/dtacone/view/appOne/staff/adapter/OneStaffPermissionAdapter$OnPermissionCheckedChangeListener;", "OnPermissionCheckedChangeListener", "PermissionItemViewHolder", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nOneStaffPermissionAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OneStaffPermissionAdapter.kt\nth/co/dtac/android/dtacone/view/appOne/staff/adapter/OneStaffPermissionAdapter\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,59:1\n1#2:60\n*E\n"})
/* renamed from: th.co.dtac.android.dtacone.view.appOne.staff.adapter.OneStaffPermissionAdapter */
/* loaded from: classes10.dex */
public final class OneStaffPermissionAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    public static final int $stable = 8;

    /* renamed from: a */
    public final Activity f97238a;

    /* renamed from: b */
    public final ArrayList f97239b;

    /* renamed from: c */
    public final String f97240c;

    /* renamed from: d */
    public OnPermissionCheckedChangeListener f97241d;

    @Metadata(m29143d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&¨\u0006\b"}, m29142d2 = {"Lth/co/dtac/android/dtacone/view/appOne/staff/adapter/OneStaffPermissionAdapter$OnPermissionCheckedChangeListener;", "", "onPermissionCheckedChanged", "", "permission", "Lth/co/dtac/android/dtacone/view/appOne/staff/model/detail/PermissionsItem;", "isChecked", "", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.view.appOne.staff.adapter.OneStaffPermissionAdapter$OnPermissionCheckedChangeListener */
    /* loaded from: classes10.dex */
    public interface OnPermissionCheckedChangeListener {
        void onPermissionCheckedChanged(@NotNull PermissionsItem permissionsItem, boolean z);
    }

    @Metadata(m29143d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u000b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0011\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0017\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, m29142d2 = {"Lth/co/dtac/android/dtacone/view/appOne/staff/adapter/OneStaffPermissionAdapter$PermissionItemViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Landroid/view/View;", Promotion.ACTION_VIEW, "<init>", "(Lth/co/dtac/android/dtacone/view/appOne/staff/adapter/OneStaffPermissionAdapter;Landroid/view/View;)V", "Landroidx/appcompat/widget/AppCompatImageView;", PDPageLabelRange.STYLE_LETTERS_LOWER, "Landroidx/appcompat/widget/AppCompatImageView;", "getIvIconPermission", "()Landroidx/appcompat/widget/AppCompatImageView;", "ivIconPermission", "Lth/co/dtac/android/dtacone/app_one/widget/OneFontTextView;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Lth/co/dtac/android/dtacone/app_one/widget/OneFontTextView;", "getTvPermissionName", "()Lth/co/dtac/android/dtacone/app_one/widget/OneFontTextView;", "tvPermissionName", "Landroidx/appcompat/widget/SwitchCompat;", OperatorName.CURVE_TO, "Landroidx/appcompat/widget/SwitchCompat;", "getSwitchPermission", "()Landroidx/appcompat/widget/SwitchCompat;", "switchPermission", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0})
    /* renamed from: th.co.dtac.android.dtacone.view.appOne.staff.adapter.OneStaffPermissionAdapter$PermissionItemViewHolder */
    /* loaded from: classes10.dex */
    public final class PermissionItemViewHolder extends RecyclerView.ViewHolder {

        /* renamed from: a */
        public final AppCompatImageView f97242a;

        /* renamed from: b */
        public final OneFontTextView f97243b;

        /* renamed from: c */
        public final SwitchCompat f97244c;

        /* renamed from: d */
        public final /* synthetic */ OneStaffPermissionAdapter f97245d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public PermissionItemViewHolder(@NotNull OneStaffPermissionAdapter oneStaffPermissionAdapter, View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "view");
            this.f97245d = oneStaffPermissionAdapter;
            View findViewById = view.findViewById(R.id.ivIconPermission);
            Intrinsics.checkNotNull(findViewById, "null cannot be cast to non-null type androidx.appcompat.widget.AppCompatImageView");
            this.f97242a = (AppCompatImageView) findViewById;
            View findViewById2 = view.findViewById(R.id.tvPermissionName);
            Intrinsics.checkNotNull(findViewById2, "null cannot be cast to non-null type th.co.dtac.android.dtacone.app_one.widget.OneFontTextView");
            this.f97243b = (OneFontTextView) findViewById2;
            View findViewById3 = view.findViewById(R.id.switchPermission);
            Intrinsics.checkNotNull(findViewById3, "null cannot be cast to non-null type androidx.appcompat.widget.SwitchCompat");
            this.f97244c = (SwitchCompat) findViewById3;
        }

        @NotNull
        public final AppCompatImageView getIvIconPermission() {
            return this.f97242a;
        }

        @NotNull
        public final SwitchCompat getSwitchPermission() {
            return this.f97244c;
        }

        @NotNull
        public final OneFontTextView getTvPermissionName() {
            return this.f97243b;
        }
    }

    public OneStaffPermissionAdapter(@NotNull Activity activity, @NotNull ArrayList<PermissionsItem> listPermission, @NotNull String companyName) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(listPermission, "listPermission");
        Intrinsics.checkNotNullParameter(companyName, "companyName");
        this.f97238a = activity;
        this.f97239b = listPermission;
        this.f97240c = companyName;
    }

    /* renamed from: b */
    public static final void m9999b(OneStaffPermissionAdapter this$0, PermissionsItem permission, CompoundButton compoundButton, boolean z) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(permission, "$permission");
        OnPermissionCheckedChangeListener onPermissionCheckedChangeListener = this$0.f97241d;
        if (onPermissionCheckedChangeListener != null) {
            onPermissionCheckedChangeListener.onPermissionCheckedChanged(permission, z);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f97239b.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull RecyclerView.ViewHolder holder, int i) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        Object obj = this.f97239b.get(i);
        Intrinsics.checkNotNullExpressionValue(obj, "listPermission[position]");
        final PermissionsItem permissionsItem = (PermissionsItem) obj;
        if (holder instanceof PermissionItemViewHolder) {
            String name = permissionsItem.getName();
            if (name != null) {
                ((PermissionItemViewHolder) holder).getIvIconPermission().setImageResource(OnePermissionKt.getOneIconByPermission(name, this.f97240c));
            }
            PermissionItemViewHolder permissionItemViewHolder = (PermissionItemViewHolder) holder;
            permissionItemViewHolder.getTvPermissionName().setText(permissionsItem.getDescription());
            permissionItemViewHolder.getSwitchPermission().setChecked(AbstractC19741eO1.equals(permissionsItem.getAllow(), "Y", true));
            permissionItemViewHolder.getSwitchPermission().setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: Wd1
                {
                    OneStaffPermissionAdapter.this = this;
                }

                @Override // android.widget.CompoundButton.OnCheckedChangeListener
                public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                    OneStaffPermissionAdapter.m9999b(OneStaffPermissionAdapter.this, permissionsItem, compoundButton, z);
                }
            });
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public RecyclerView.ViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int i) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        View view = LayoutInflater.from(this.f97238a).inflate(R.layout.one_staff_item_permission, parent, false);
        Intrinsics.checkNotNullExpressionValue(view, "view");
        return new PermissionItemViewHolder(this, view);
    }

    public final void setListener(@NotNull OnPermissionCheckedChangeListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f97241d = listener;
    }
}