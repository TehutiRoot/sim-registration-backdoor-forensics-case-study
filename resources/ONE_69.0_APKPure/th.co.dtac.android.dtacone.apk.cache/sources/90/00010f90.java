package th.p047co.dtac.android.dtacone.adapter.inactive_user;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.recyclerview.widget.RecyclerView;
import ch.qos.logback.core.CoreConstants;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.adapter.inactive_user.OwnerListAdapter;
import th.p047co.dtac.android.dtacone.adapter.listener.owner.OnClickOwner;
import th.p047co.dtac.android.dtacone.databinding.ZOwnerListItemRowBinding;
import th.p047co.dtac.android.dtacone.extension.format.PhoneNumberExtKt;
import th.p047co.dtac.android.dtacone.model.inactive_user.OwnerCollection;
import th.p047co.dtac.android.dtacone.model.inactive_user.OwnerListCollection;
import th.p047co.dtac.android.dtacone.util.Constant;
import th.p047co.dtac.android.dtacone.widget.view.DtacFontTextView;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001+B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J#\u0010\u000b\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\fJ#\u0010\u0010\u001a\u00020\u000f2\n\u0010\r\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u000e\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R$\u0010\u001f\u001a\u0004\u0018\u00010\u00188\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR$\u0010'\u001a\u0004\u0018\u00010 8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\u0016\u0010*\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010)¨\u0006,"}, m29142d2 = {"Lth/co/dtac/android/dtacone/adapter/inactive_user/OwnerListAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lth/co/dtac/android/dtacone/adapter/inactive_user/OwnerListAdapter$OwnerListViewHolder;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "Landroid/view/ViewGroup;", "parent", "", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Lth/co/dtac/android/dtacone/adapter/inactive_user/OwnerListAdapter$OwnerListViewHolder;", "holder", "position", "", "onBindViewHolder", "(Lth/co/dtac/android/dtacone/adapter/inactive_user/OwnerListAdapter$OwnerListViewHolder;I)V", "getItemCount", "()I", PDPageLabelRange.STYLE_LETTERS_LOWER, "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "Lth/co/dtac/android/dtacone/model/inactive_user/OwnerListCollection;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Lth/co/dtac/android/dtacone/model/inactive_user/OwnerListCollection;", "getOwnerList", "()Lth/co/dtac/android/dtacone/model/inactive_user/OwnerListCollection;", "setOwnerList", "(Lth/co/dtac/android/dtacone/model/inactive_user/OwnerListCollection;)V", "ownerList", "Lth/co/dtac/android/dtacone/adapter/listener/owner/OnClickOwner;", OperatorName.CURVE_TO, "Lth/co/dtac/android/dtacone/adapter/listener/owner/OnClickOwner;", "getListener", "()Lth/co/dtac/android/dtacone/adapter/listener/owner/OnClickOwner;", "setListener", "(Lth/co/dtac/android/dtacone/adapter/listener/owner/OnClickOwner;)V", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "d", "I", "lastPosition", "OwnerListViewHolder", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0})
/* renamed from: th.co.dtac.android.dtacone.adapter.inactive_user.OwnerListAdapter */
/* loaded from: classes7.dex */
public final class OwnerListAdapter extends RecyclerView.Adapter<OwnerListViewHolder> {
    public static final int $stable = 8;

    /* renamed from: a */
    public final Context f81315a;

    /* renamed from: b */
    public OwnerListCollection f81316b;

    /* renamed from: c */
    public OnClickOwner f81317c;

    /* renamed from: d */
    public int f81318d;

    @Metadata(m29143d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J!\u0010\u000b\u001a\u00020\n2\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u000b\u0010\fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m29142d2 = {"Lth/co/dtac/android/dtacone/adapter/inactive_user/OwnerListAdapter$OwnerListViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Lth/co/dtac/android/dtacone/databinding/ZOwnerListItemRowBinding;", "binding", "<init>", "(Lth/co/dtac/android/dtacone/adapter/inactive_user/OwnerListAdapter;Lth/co/dtac/android/dtacone/databinding/ZOwnerListItemRowBinding;)V", "Lth/co/dtac/android/dtacone/model/inactive_user/OwnerCollection;", Constant.REGISTER_LEVEL_OWNER, "Lth/co/dtac/android/dtacone/adapter/listener/owner/OnClickOwner;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "", "bind", "(Lth/co/dtac/android/dtacone/model/inactive_user/OwnerCollection;Lth/co/dtac/android/dtacone/adapter/listener/owner/OnClickOwner;)V", PDPageLabelRange.STYLE_LETTERS_LOWER, "Lth/co/dtac/android/dtacone/databinding/ZOwnerListItemRowBinding;", "getBinding", "()Lth/co/dtac/android/dtacone/databinding/ZOwnerListItemRowBinding;", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0})
    /* renamed from: th.co.dtac.android.dtacone.adapter.inactive_user.OwnerListAdapter$OwnerListViewHolder */
    /* loaded from: classes7.dex */
    public final class OwnerListViewHolder extends RecyclerView.ViewHolder {

        /* renamed from: a */
        public final ZOwnerListItemRowBinding f81319a;

        /* renamed from: b */
        public final /* synthetic */ OwnerListAdapter f81320b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OwnerListViewHolder(@NotNull OwnerListAdapter ownerListAdapter, ZOwnerListItemRowBinding binding) {
            super(binding.getRoot());
            Intrinsics.checkNotNullParameter(binding, "binding");
            this.f81320b = ownerListAdapter;
            this.f81319a = binding;
        }

        /* renamed from: b */
        public static /* synthetic */ void m20532b(OnClickOwner onClickOwner, OwnerCollection ownerCollection, View view) {
            m20531c(onClickOwner, ownerCollection, view);
        }

        /* renamed from: c */
        public static final void m20531c(OnClickOwner onClickOwner, OwnerCollection ownerCollection, View view) {
            if (onClickOwner != null) {
                onClickOwner.onClickOwnerDetail(ownerCollection);
            }
        }

        public final void bind(@Nullable final OwnerCollection ownerCollection, @Nullable final OnClickOwner onClickOwner) {
            String str;
            String str2;
            String userId;
            ZOwnerListItemRowBinding zOwnerListItemRowBinding = this.f81319a;
            OwnerListAdapter ownerListAdapter = this.f81320b;
            if (ownerListAdapter.f81318d >= getAbsoluteAdapterPosition()) {
                zOwnerListItemRowBinding.cardviewInactivityListUser.setAnimation(AnimationUtils.loadAnimation(ownerListAdapter.getContext(), R.anim.slide_up));
                ownerListAdapter.f81318d = getAbsoluteAdapterPosition();
            }
            DtacFontTextView dtacFontTextView = zOwnerListItemRowBinding.tvInactivityPhoneNumber;
            String str3 = null;
            if (ownerCollection != null && (userId = ownerCollection.getUserId()) != null) {
                str = PhoneNumberExtKt.toPretty(userId);
            } else {
                str = null;
            }
            dtacFontTextView.setText(str);
            DtacFontTextView dtacFontTextView2 = zOwnerListItemRowBinding.tvInactivityRegisterDate;
            if (ownerCollection != null) {
                str2 = ownerCollection.getDisplayRegisterDate();
            } else {
                str2 = null;
            }
            if (ownerCollection != null) {
                str3 = ownerCollection.getDisplayRegisterTime();
            }
            dtacFontTextView2.setText(str2 + "\n" + str3);
            zOwnerListItemRowBinding.cardviewInactivityListUser.setOnClickListener(new View.OnClickListener() { // from class: Yh1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    OwnerListAdapter.OwnerListViewHolder.m20532b(OnClickOwner.this, ownerCollection, view);
                }
            });
        }

        @NotNull
        public final ZOwnerListItemRowBinding getBinding() {
            return this.f81319a;
        }
    }

    public OwnerListAdapter(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f81315a = context;
    }

    @NotNull
    public final Context getContext() {
        return this.f81315a;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        List<OwnerCollection> owners;
        OwnerListCollection ownerListCollection = this.f81316b;
        if (ownerListCollection != null && (owners = ownerListCollection.getOwners()) != null) {
            return owners.size();
        }
        return 0;
    }

    @Nullable
    public final OnClickOwner getListener() {
        return this.f81317c;
    }

    @Nullable
    public final OwnerListCollection getOwnerList() {
        return this.f81316b;
    }

    public final void setListener(@Nullable OnClickOwner onClickOwner) {
        this.f81317c = onClickOwner;
    }

    public final void setOwnerList(@Nullable OwnerListCollection ownerListCollection) {
        this.f81316b = ownerListCollection;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull OwnerListViewHolder holder, int i) {
        List<OwnerCollection> owners;
        Intrinsics.checkNotNullParameter(holder, "holder");
        OwnerListCollection ownerListCollection = this.f81316b;
        holder.bind((ownerListCollection == null || (owners = ownerListCollection.getOwners()) == null) ? null : owners.get(i), this.f81317c);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public OwnerListViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int i) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        ZOwnerListItemRowBinding inflate = ZOwnerListItemRowBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(LayoutInflater.f….context), parent, false)");
        return new OwnerListViewHolder(this, inflate);
    }
}