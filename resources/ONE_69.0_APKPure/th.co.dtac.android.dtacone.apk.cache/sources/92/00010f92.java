package th.p047co.dtac.android.dtacone.adapter.inactive_user;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.recyclerview.widget.RecyclerView;
import com.google.firebase.messaging.Constants;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.apache.commons.cli.HelpFormatter;
import org.bouncycastle.i18n.ErrorBundle;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.adapter.inactive_user.OwnerTransactionAdapter;
import th.p047co.dtac.android.dtacone.databinding.RtrHistoryHeaderBinding;
import th.p047co.dtac.android.dtacone.databinding.ZErrorViewRecycleBinding;
import th.p047co.dtac.android.dtacone.databinding.ZOwnerTransactionItemRowBinding;
import th.p047co.dtac.android.dtacone.databinding.ZViewEmptyRecycleBinding;
import th.p047co.dtac.android.dtacone.extension.format.PhoneNumberExtKt;
import th.p047co.dtac.android.dtacone.extension.view.ViewVisibleExtKt;
import th.p047co.dtac.android.dtacone.extension.view.VisibleExtensionKt;
import th.p047co.dtac.android.dtacone.model.inactive_user.OwnerTransactionCollection;
import th.p047co.dtac.android.dtacone.util.constant.PermissionConstant;
import th.p047co.dtac.android.dtacone.widget.view.DtacFontTextView;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0017\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0005)*+,-B)\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u0010\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u0018\u001a\u00020\u00172\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0018\u0010\u0019J\u0015\u0010\u001b\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\fH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u001f\u0010 \u001a\u00020\u00172\u0006\u0010\u001f\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\fH\u0016¢\u0006\u0004\b \u0010!R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\"R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0016\u0010\b\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010&R\u0016\u0010\t\u001a\u0004\u0018\u00010\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(¨\u0006."}, m29142d2 = {"Lth/co/dtac/android/dtacone/adapter/inactive_user/OwnerTransactionAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Lth/co/dtac/android/dtacone/model/inactive_user/OwnerTransactionCollection;", "ownTransactions", "Lth/co/dtac/android/dtacone/adapter/inactive_user/OwnerTransactionAdapter$OnClickretry;", "onClickRetry", "", Constants.IPC_BUNDLE_KEY_SEND_ERROR, "isUserLan", "<init>", "(Lth/co/dtac/android/dtacone/model/inactive_user/OwnerTransactionCollection;Lth/co/dtac/android/dtacone/adapter/inactive_user/OwnerTransactionAdapter$OnClickretry;ZLjava/lang/Boolean;)V", "", "viewType", "Landroid/view/ViewGroup;", "parent", PDPageLabelRange.STYLE_LETTERS_LOWER, "(ILandroid/view/ViewGroup;)Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "position", "getItemViewType", "(I)I", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "", "setError", "(Z)V", "ownTransaction", "addLasttransection", "(Lth/co/dtac/android/dtacone/model/inactive_user/OwnerTransactionCollection;)V", "getItemCount", "()I", "holder", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V", "Lth/co/dtac/android/dtacone/model/inactive_user/OwnerTransactionCollection;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Lth/co/dtac/android/dtacone/adapter/inactive_user/OwnerTransactionAdapter$OnClickretry;", OperatorName.CURVE_TO, "Z", "d", "Ljava/lang/Boolean;", "OnClickretry", "OwnerEmptyViewHolder", "OwnerErrorViewHolder", "OwnerHeaderViewHolder", "OwnerTransactionViewHolder", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0})
/* renamed from: th.co.dtac.android.dtacone.adapter.inactive_user.OwnerTransactionAdapter */
/* loaded from: classes7.dex */
public final class OwnerTransactionAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    public static final int $stable = 8;

    /* renamed from: a */
    public final OwnerTransactionCollection f81321a;

    /* renamed from: b */
    public final OnClickretry f81322b;

    /* renamed from: c */
    public boolean f81323c;

    /* renamed from: d */
    public final Boolean f81324d;

    @Metadata(m29143d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&¨\u0006\u0004"}, m29142d2 = {"Lth/co/dtac/android/dtacone/adapter/inactive_user/OwnerTransactionAdapter$OnClickretry;", "", "onretry", "", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.adapter.inactive_user.OwnerTransactionAdapter$OnClickretry */
    /* loaded from: classes7.dex */
    public interface OnClickretry {
        void onretry();
    }

    @StabilityInferred(parameters = 0)
    @Metadata(m29143d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, m29142d2 = {"Lth/co/dtac/android/dtacone/adapter/inactive_user/OwnerTransactionAdapter$OwnerEmptyViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lth/co/dtac/android/dtacone/databinding/ZViewEmptyRecycleBinding;", "(Lth/co/dtac/android/dtacone/databinding/ZViewEmptyRecycleBinding;)V", "bind", "", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.adapter.inactive_user.OwnerTransactionAdapter$OwnerEmptyViewHolder */
    /* loaded from: classes7.dex */
    public static final class OwnerEmptyViewHolder extends RecyclerView.ViewHolder {
        public static final int $stable = 0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OwnerEmptyViewHolder(@NotNull ZViewEmptyRecycleBinding binding) {
            super(binding.getRoot());
            Intrinsics.checkNotNullParameter(binding, "binding");
        }

        public final void bind() {
        }
    }

    @StabilityInferred(parameters = 0)
    @Metadata(m29143d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, m29142d2 = {"Lth/co/dtac/android/dtacone/adapter/inactive_user/OwnerTransactionAdapter$OwnerErrorViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Lth/co/dtac/android/dtacone/databinding/ZErrorViewRecycleBinding;", "binding", "<init>", "(Lth/co/dtac/android/dtacone/databinding/ZErrorViewRecycleBinding;)V", "Lth/co/dtac/android/dtacone/adapter/inactive_user/OwnerTransactionAdapter$OnClickretry;", "onClickRetry", "", "bind", "(Lth/co/dtac/android/dtacone/adapter/inactive_user/OwnerTransactionAdapter$OnClickretry;)V", PDPageLabelRange.STYLE_LETTERS_LOWER, "Lth/co/dtac/android/dtacone/databinding/ZErrorViewRecycleBinding;", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0})
    /* renamed from: th.co.dtac.android.dtacone.adapter.inactive_user.OwnerTransactionAdapter$OwnerErrorViewHolder */
    /* loaded from: classes7.dex */
    public static final class OwnerErrorViewHolder extends RecyclerView.ViewHolder {
        public static final int $stable = 8;

        /* renamed from: a */
        public final ZErrorViewRecycleBinding f81325a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OwnerErrorViewHolder(@NotNull ZErrorViewRecycleBinding binding) {
            super(binding.getRoot());
            Intrinsics.checkNotNullParameter(binding, "binding");
            this.f81325a = binding;
        }

        /* renamed from: b */
        public static /* synthetic */ void m20529b(OnClickretry onClickretry, View view) {
            m20528c(onClickretry, view);
        }

        /* renamed from: c */
        public static final void m20528c(OnClickretry onClickRetry, View view) {
            Intrinsics.checkNotNullParameter(onClickRetry, "$onClickRetry");
            onClickRetry.onretry();
        }

        public final void bind(@NotNull final OnClickretry onClickRetry) {
            Intrinsics.checkNotNullParameter(onClickRetry, "onClickRetry");
            this.f81325a.btnRetryHistorySell.setOnClickListener(new View.OnClickListener() { // from class: ci1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    OwnerTransactionAdapter.OwnerErrorViewHolder.m20529b(OwnerTransactionAdapter.OnClickretry.this, view);
                }
            });
        }
    }

    @StabilityInferred(parameters = 0)
    @Metadata(m29143d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, m29142d2 = {"Lth/co/dtac/android/dtacone/adapter/inactive_user/OwnerTransactionAdapter$OwnerHeaderViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Lth/co/dtac/android/dtacone/databinding/RtrHistoryHeaderBinding;", "binding", "<init>", "(Lth/co/dtac/android/dtacone/databinding/RtrHistoryHeaderBinding;)V", "Lth/co/dtac/android/dtacone/model/inactive_user/OwnerTransactionCollection$Summary;", ErrorBundle.SUMMARY_ENTRY, "", "bind", "(Lth/co/dtac/android/dtacone/model/inactive_user/OwnerTransactionCollection$Summary;)V", PDPageLabelRange.STYLE_LETTERS_LOWER, "Lth/co/dtac/android/dtacone/databinding/RtrHistoryHeaderBinding;", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0})
    /* renamed from: th.co.dtac.android.dtacone.adapter.inactive_user.OwnerTransactionAdapter$OwnerHeaderViewHolder */
    /* loaded from: classes7.dex */
    public static final class OwnerHeaderViewHolder extends RecyclerView.ViewHolder {
        public static final int $stable = 8;

        /* renamed from: a */
        public final RtrHistoryHeaderBinding f81326a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OwnerHeaderViewHolder(@NotNull RtrHistoryHeaderBinding binding) {
            super(binding.getRoot());
            Intrinsics.checkNotNullParameter(binding, "binding");
            this.f81326a = binding;
        }

        public final void bind(@NotNull OwnerTransactionCollection.Summary summary) {
            Intrinsics.checkNotNullParameter(summary, "summary");
            this.f81326a.listTitle.setText(summary.getListTitle());
            this.f81326a.listValue.setText(summary.getListValue());
            this.f81326a.totalTitle.setText(summary.getTotalTitle());
            this.f81326a.totalValue.setText(summary.getTotalValue());
            this.f81326a.title.setText(summary.getTitle());
        }
    }

    @StabilityInferred(parameters = 0)
    @Metadata(m29143d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m29142d2 = {"Lth/co/dtac/android/dtacone/adapter/inactive_user/OwnerTransactionAdapter$OwnerTransactionViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Lth/co/dtac/android/dtacone/databinding/ZOwnerTransactionItemRowBinding;", "binding", "<init>", "(Lth/co/dtac/android/dtacone/databinding/ZOwnerTransactionItemRowBinding;)V", "Lth/co/dtac/android/dtacone/model/inactive_user/OwnerTransactionCollection$LastTransaction;", "ownerTransaction", "", "isUserLan", "", "bind", "(Lth/co/dtac/android/dtacone/model/inactive_user/OwnerTransactionCollection$LastTransaction;Ljava/lang/Boolean;)V", PDPageLabelRange.STYLE_LETTERS_LOWER, "Lth/co/dtac/android/dtacone/databinding/ZOwnerTransactionItemRowBinding;", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0})
    /* renamed from: th.co.dtac.android.dtacone.adapter.inactive_user.OwnerTransactionAdapter$OwnerTransactionViewHolder */
    /* loaded from: classes7.dex */
    public static final class OwnerTransactionViewHolder extends RecyclerView.ViewHolder {
        public static final int $stable = 8;

        /* renamed from: a */
        public final ZOwnerTransactionItemRowBinding f81327a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OwnerTransactionViewHolder(@NotNull ZOwnerTransactionItemRowBinding binding) {
            super(binding.getRoot());
            Intrinsics.checkNotNullParameter(binding, "binding");
            this.f81327a = binding;
        }

        public final void bind(@NotNull OwnerTransactionCollection.LastTransaction ownerTransaction, @Nullable Boolean bool) {
            String str;
            int i;
            String str2;
            String pretty;
            Intrinsics.checkNotNullParameter(ownerTransaction, "ownerTransaction");
            DtacFontTextView dtacFontTextView = this.f81327a.tvTransactionPhoneNumber;
            String subscriberNumber = ownerTransaction.getSubscriberNumber();
            String str3 = "";
            dtacFontTextView.setText((subscriberNumber == null || (r1 = PhoneNumberExtKt.toPretty(subscriberNumber)) == null) ? "" : "");
            DtacFontTextView dtacFontTextView2 = this.f81327a.tvTransactionTime;
            String str4 = ownerTransaction.getDisplayDate() + HelpFormatter.DEFAULT_LONG_OPT_SEPARATOR + ownerTransaction.getDisplayTime();
            Intrinsics.checkNotNullExpressionValue(str4, "toString(...)");
            dtacFontTextView2.setText(str4);
            DtacFontTextView dtacFontTextView3 = this.f81327a.tvTransactionOwnerTitle;
            String str5 = "  •  " + ownerTransaction.getTitleCreateBy();
            Intrinsics.checkNotNullExpressionValue(str5, "toString(...)");
            dtacFontTextView3.setText(str5);
            DtacFontTextView dtacFontTextView4 = this.f81327a.tvTransactionOwnerValue;
            if (Intrinsics.areEqual(bool, Boolean.TRUE)) {
                str = ownerTransaction.getValueCreateBy();
            } else {
                String valueCreateBy = ownerTransaction.getValueCreateBy();
                if (valueCreateBy == null || (str = PhoneNumberExtKt.toPretty(valueCreateBy)) == null) {
                    str = "";
                }
            }
            dtacFontTextView4.setText(str);
            DtacFontTextView dtacFontTextView5 = this.f81327a.tvTransactionType;
            String displayType = ownerTransaction.getDisplayType();
            if (displayType == null) {
                displayType = "";
            }
            dtacFontTextView5.setText(displayType);
            DtacFontTextView dtacFontTextView6 = this.f81327a.tvTransactionAmount;
            OwnerTransactionCollection.TransactionPrice price = ownerTransaction.getPrice();
            dtacFontTextView6.setText((price == null || (r0 = price.getAmount()) == null) ? "" : "");
            AppCompatImageView appCompatImageView = this.f81327a.ivImageType;
            Integer num = PermissionConstant.getImageTransactionType().get(ownerTransaction.getFeatureCode());
            if (num != null) {
                i = num.intValue();
            } else {
                i = R.drawable.ic_window;
            }
            appCompatImageView.setImageResource(i);
            DtacFontTextView dtacFontTextView7 = this.f81327a.tvTransactionAmount;
            Intrinsics.checkNotNullExpressionValue(dtacFontTextView7, "binding.tvTransactionAmount");
            OwnerTransactionCollection.TransactionPrice price2 = ownerTransaction.getPrice();
            String str6 = null;
            if (price2 != null) {
                str2 = price2.getAmount();
            } else {
                str2 = null;
            }
            VisibleExtensionKt.toVisibleOrGone(dtacFontTextView7, str2);
            DtacFontTextView dtacFontTextView8 = this.f81327a.tvTransactionUnit;
            Intrinsics.checkNotNullExpressionValue(dtacFontTextView8, "binding.tvTransactionUnit");
            OwnerTransactionCollection.TransactionPrice price3 = ownerTransaction.getPrice();
            if (price3 != null) {
                str6 = price3.getAmount();
            }
            VisibleExtensionKt.toVisibleOrGone(dtacFontTextView8, str6);
            DtacFontTextView dtacFontTextView9 = this.f81327a.tvTransactionName;
            Intrinsics.checkNotNullExpressionValue(dtacFontTextView9, "binding.tvTransactionName");
            VisibleExtensionKt.toVisibleOrGone(dtacFontTextView9, ownerTransaction.getPackageName());
            DtacFontTextView dtacFontTextView10 = this.f81327a.tvTransactionName;
            String packageName = ownerTransaction.getPackageName();
            if (packageName == null) {
                packageName = "";
            }
            dtacFontTextView10.setText(packageName);
            String featureCode = ownerTransaction.getFeatureCode();
            if (Intrinsics.areEqual(featureCode, PermissionConstant.M_EXPR_PACK)) {
                DtacFontTextView dtacFontTextView11 = this.f81327a.tvTransactionOption;
                Intrinsics.checkNotNullExpressionValue(dtacFontTextView11, "binding.tvTransactionOption");
                ViewVisibleExtKt.toVisible(dtacFontTextView11);
                this.f81327a.tvTransactionOption.setText(ownerTransaction.getDisplayExpireOption());
            } else if (Intrinsics.areEqual(featureCode, PermissionConstant.M_FAMI_SIM)) {
                DtacFontTextView dtacFontTextView12 = this.f81327a.tvTransactionName;
                Intrinsics.checkNotNullExpressionValue(dtacFontTextView12, "binding.tvTransactionName");
                VisibleExtensionKt.toVisibleOrGone(dtacFontTextView12, ownerTransaction.getFamilyNumber());
                DtacFontTextView dtacFontTextView13 = this.f81327a.tvTransactionName;
                StringBuilder sb = new StringBuilder();
                sb.append(ownerTransaction.getFamilyDetail());
                sb.append(HelpFormatter.DEFAULT_LONG_OPT_SEPARATOR);
                String familyNumber = ownerTransaction.getFamilyNumber();
                if (familyNumber != null && (pretty = PhoneNumberExtKt.toPretty(familyNumber)) != null) {
                    str3 = pretty;
                }
                sb.append(str3);
                String sb2 = sb.toString();
                Intrinsics.checkNotNullExpressionValue(sb2, "toString(...)");
                dtacFontTextView13.setText(sb2);
            } else {
                DtacFontTextView dtacFontTextView14 = this.f81327a.tvTransactionOption;
                Intrinsics.checkNotNullExpressionValue(dtacFontTextView14, "binding.tvTransactionOption");
                ViewVisibleExtKt.toGone(dtacFontTextView14);
            }
        }
    }

    public OwnerTransactionAdapter(@NotNull OwnerTransactionCollection ownTransactions, @NotNull OnClickretry onClickRetry, boolean z, @Nullable Boolean bool) {
        Intrinsics.checkNotNullParameter(ownTransactions, "ownTransactions");
        Intrinsics.checkNotNullParameter(onClickRetry, "onClickRetry");
        this.f81321a = ownTransactions;
        this.f81322b = onClickRetry;
        this.f81323c = z;
        this.f81324d = bool;
    }

    /* renamed from: a */
    private final RecyclerView.ViewHolder m20530a(int i, ViewGroup viewGroup) {
        if (!this.f81321a.getLastTransactions().isEmpty()) {
            if (i == 0) {
                RtrHistoryHeaderBinding inflate = RtrHistoryHeaderBinding.inflate(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
                Intrinsics.checkNotNullExpressionValue(inflate, "inflate(\n               ….context), parent, false)");
                return new OwnerHeaderViewHolder(inflate);
            }
            ZOwnerTransactionItemRowBinding inflate2 = ZOwnerTransactionItemRowBinding.inflate(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
            Intrinsics.checkNotNullExpressionValue(inflate2, "inflate(\n               ….context), parent, false)");
            return new OwnerTransactionViewHolder(inflate2);
        } else if (!this.f81323c) {
            if (i == 0) {
                RtrHistoryHeaderBinding inflate3 = RtrHistoryHeaderBinding.inflate(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
                Intrinsics.checkNotNullExpressionValue(inflate3, "inflate(\n               ….context), parent, false)");
                return new OwnerHeaderViewHolder(inflate3);
            }
            ZViewEmptyRecycleBinding inflate4 = ZViewEmptyRecycleBinding.inflate(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
            Intrinsics.checkNotNullExpressionValue(inflate4, "inflate(\n               ….context), parent, false)");
            return new OwnerEmptyViewHolder(inflate4);
        } else {
            ZErrorViewRecycleBinding inflate5 = ZErrorViewRecycleBinding.inflate(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
            Intrinsics.checkNotNullExpressionValue(inflate5, "inflate(\n               ….context), parent, false)");
            return new OwnerErrorViewHolder(inflate5);
        }
    }

    public final void addLasttransection(@NotNull OwnerTransactionCollection ownTransaction) {
        Intrinsics.checkNotNullParameter(ownTransaction, "ownTransaction");
        this.f81321a.getLastTransactions().addAll(ownTransaction.getLastTransactions());
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        if (this.f81323c) {
            return 1;
        }
        if (this.f81321a.getLastTransactions().size() == 0) {
            return 2;
        }
        return 1 + this.f81321a.getLastTransactions().size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        return i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull RecyclerView.ViewHolder holder, int i) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        OwnerTransactionCollection.Summary summary = this.f81321a.getSummary();
        if (holder instanceof OwnerTransactionViewHolder) {
            OwnerTransactionCollection.LastTransaction lastTransaction = this.f81321a.getLastTransactions().get(i - 1);
            Intrinsics.checkNotNullExpressionValue(lastTransaction, "ownTransactions.lastTransactions.get(position - 1)");
            ((OwnerTransactionViewHolder) holder).bind(lastTransaction, this.f81324d);
        } else if (holder instanceof OwnerHeaderViewHolder) {
            if (summary != null) {
                ((OwnerHeaderViewHolder) holder).bind(summary);
            }
        } else if (holder instanceof OwnerEmptyViewHolder) {
            ((OwnerEmptyViewHolder) holder).bind();
        } else if (holder instanceof OwnerErrorViewHolder) {
            ((OwnerErrorViewHolder) holder).bind(this.f81322b);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public RecyclerView.ViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int i) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        return m20530a(i, parent);
    }

    public final void setError(boolean z) {
        this.f81323c = z;
        notifyDataSetChanged();
    }
}