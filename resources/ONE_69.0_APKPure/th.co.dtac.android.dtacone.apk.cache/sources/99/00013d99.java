package th.p047co.dtac.android.dtacone.view.appOne.report.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.content.res.ResourcesCompat;
import androidx.recyclerview.widget.RecyclerView;
import ch.qos.logback.core.CoreConstants;
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
import th.p047co.dtac.android.dtacone.app_one.util.p048enum.OnePermissionKt;
import th.p047co.dtac.android.dtacone.app_one.widget.OneFontTextView;
import th.p047co.dtac.android.dtacone.databinding.OneErrorViewRecycleBinding;
import th.p047co.dtac.android.dtacone.databinding.OneOwnerTransactionItemRowBinding;
import th.p047co.dtac.android.dtacone.databinding.OneRtrHistoryHeaderBinding;
import th.p047co.dtac.android.dtacone.databinding.OneViewEmptyRecycleBinding;
import th.p047co.dtac.android.dtacone.extension.format.PhoneNumberExtKt;
import th.p047co.dtac.android.dtacone.extension.view.ViewVisibleExtKt;
import th.p047co.dtac.android.dtacone.extension.view.VisibleExtensionKt;
import th.p047co.dtac.android.dtacone.model.appOne.transaction_history.OneTransactionHistoryReportThemeModel;
import th.p047co.dtac.android.dtacone.model.inactive_user.OwnerTransactionCollection;
import th.p047co.dtac.android.dtacone.presenter.inactive_user.OwnerDetailPresenter;
import th.p047co.dtac.android.dtacone.util.constant.PermissionConstant;
import th.p047co.dtac.android.dtacone.view.appOne.report.adapter.OneOwnerTransactionAdapter;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u001f\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u00059:;<=BI\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0018\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001b\u001a\u00020\u00142\u0006\u0010\u001a\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u001f\u0010\u001d\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u0015\u0010 \u001a\u00020\u001f2\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b \u0010!J\u0015\u0010#\u001a\u00020\u001f2\u0006\u0010\"\u001a\u00020\u0005¢\u0006\u0004\b#\u0010$J\u000f\u0010%\u001a\u00020\u0014H\u0016¢\u0006\u0004\b%\u0010&J\u001f\u0010(\u001a\u00020\u001f2\u0006\u0010'\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u0014H\u0016¢\u0006\u0004\b(\u0010)R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010*R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0016\u0010\n\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u00100R\u0016\u0010\u000b\u001a\u0004\u0018\u00010\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108¨\u0006>"}, m29142d2 = {"Lth/co/dtac/android/dtacone/view/appOne/report/adapter/OneOwnerTransactionAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lth/co/dtac/android/dtacone/model/inactive_user/OwnerTransactionCollection;", "ownTransactions", "Lth/co/dtac/android/dtacone/view/appOne/report/adapter/OneOwnerTransactionAdapter$OnClickRetry;", "onClickRetry", "", Constants.IPC_BUNDLE_KEY_SEND_ERROR, "isUserLan", "", "xCompany", "Lth/co/dtac/android/dtacone/model/appOne/transaction_history/OneTransactionHistoryReportThemeModel;", "themeModel", "Lth/co/dtac/android/dtacone/presenter/inactive_user/OwnerDetailPresenter;", "presenter", "<init>", "(Landroid/content/Context;Lth/co/dtac/android/dtacone/model/inactive_user/OwnerTransactionCollection;Lth/co/dtac/android/dtacone/view/appOne/report/adapter/OneOwnerTransactionAdapter$OnClickRetry;ZLjava/lang/Boolean;Ljava/lang/String;Lth/co/dtac/android/dtacone/model/appOne/transaction_history/OneTransactionHistoryReportThemeModel;Lth/co/dtac/android/dtacone/presenter/inactive_user/OwnerDetailPresenter;)V", "", "viewType", "Landroid/view/ViewGroup;", "parent", PDPageLabelRange.STYLE_LETTERS_LOWER, "(ILandroid/view/ViewGroup;)Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "position", "getItemViewType", "(I)I", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "", "setError", "(Z)V", "ownTransaction", "addLasttransection", "(Lth/co/dtac/android/dtacone/model/inactive_user/OwnerTransactionCollection;)V", "getItemCount", "()I", "holder", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V", "Landroid/content/Context;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Lth/co/dtac/android/dtacone/model/inactive_user/OwnerTransactionCollection;", OperatorName.CURVE_TO, "Lth/co/dtac/android/dtacone/view/appOne/report/adapter/OneOwnerTransactionAdapter$OnClickRetry;", "d", "Z", "e", "Ljava/lang/Boolean;", OperatorName.FILL_NON_ZERO, "Ljava/lang/String;", OperatorName.NON_STROKING_GRAY, "Lth/co/dtac/android/dtacone/model/appOne/transaction_history/OneTransactionHistoryReportThemeModel;", OperatorName.CLOSE_PATH, "Lth/co/dtac/android/dtacone/presenter/inactive_user/OwnerDetailPresenter;", "OnClickRetry", "OwnerEmptyViewHolder", "OwnerErrorViewHolder", "OwnerHeaderViewHolder", "OwnerTransactionViewHolder", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0})
/* renamed from: th.co.dtac.android.dtacone.view.appOne.report.adapter.OneOwnerTransactionAdapter */
/* loaded from: classes10.dex */
public final class OneOwnerTransactionAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    public static final int $stable = 8;

    /* renamed from: a */
    public final Context f96266a;

    /* renamed from: b */
    public final OwnerTransactionCollection f96267b;

    /* renamed from: c */
    public final OnClickRetry f96268c;

    /* renamed from: d */
    public boolean f96269d;

    /* renamed from: e */
    public final Boolean f96270e;

    /* renamed from: f */
    public final String f96271f;

    /* renamed from: g */
    public final OneTransactionHistoryReportThemeModel f96272g;

    /* renamed from: h */
    public final OwnerDetailPresenter f96273h;

    @Metadata(m29143d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&¨\u0006\u0004"}, m29142d2 = {"Lth/co/dtac/android/dtacone/view/appOne/report/adapter/OneOwnerTransactionAdapter$OnClickRetry;", "", "onretry", "", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.view.appOne.report.adapter.OneOwnerTransactionAdapter$OnClickRetry */
    /* loaded from: classes10.dex */
    public interface OnClickRetry {
        void onretry();
    }

    @StabilityInferred(parameters = 0)
    @Metadata(m29143d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, m29142d2 = {"Lth/co/dtac/android/dtacone/view/appOne/report/adapter/OneOwnerTransactionAdapter$OwnerEmptyViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lth/co/dtac/android/dtacone/databinding/OneViewEmptyRecycleBinding;", "(Lth/co/dtac/android/dtacone/databinding/OneViewEmptyRecycleBinding;)V", "bind", "", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.view.appOne.report.adapter.OneOwnerTransactionAdapter$OwnerEmptyViewHolder */
    /* loaded from: classes10.dex */
    public static final class OwnerEmptyViewHolder extends RecyclerView.ViewHolder {
        public static final int $stable = 0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OwnerEmptyViewHolder(@NotNull OneViewEmptyRecycleBinding binding) {
            super(binding.getRoot());
            Intrinsics.checkNotNullParameter(binding, "binding");
        }

        public final void bind() {
        }
    }

    @StabilityInferred(parameters = 0)
    @Metadata(m29143d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J%\u0010\r\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m29142d2 = {"Lth/co/dtac/android/dtacone/view/appOne/report/adapter/OneOwnerTransactionAdapter$OwnerErrorViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Lth/co/dtac/android/dtacone/databinding/OneErrorViewRecycleBinding;", "binding", "<init>", "(Lth/co/dtac/android/dtacone/databinding/OneErrorViewRecycleBinding;)V", "Lth/co/dtac/android/dtacone/view/appOne/report/adapter/OneOwnerTransactionAdapter$OnClickRetry;", "onClickRetry", "Lth/co/dtac/android/dtacone/model/appOne/transaction_history/OneTransactionHistoryReportThemeModel;", "themeModel", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "bind", "(Lth/co/dtac/android/dtacone/view/appOne/report/adapter/OneOwnerTransactionAdapter$OnClickRetry;Lth/co/dtac/android/dtacone/model/appOne/transaction_history/OneTransactionHistoryReportThemeModel;Landroid/content/Context;)V", PDPageLabelRange.STYLE_LETTERS_LOWER, "Lth/co/dtac/android/dtacone/databinding/OneErrorViewRecycleBinding;", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0})
    /* renamed from: th.co.dtac.android.dtacone.view.appOne.report.adapter.OneOwnerTransactionAdapter$OwnerErrorViewHolder */
    /* loaded from: classes10.dex */
    public static final class OwnerErrorViewHolder extends RecyclerView.ViewHolder {
        public static final int $stable = 8;

        /* renamed from: a */
        public final OneErrorViewRecycleBinding f96274a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OwnerErrorViewHolder(@NotNull OneErrorViewRecycleBinding binding) {
            super(binding.getRoot());
            Intrinsics.checkNotNullParameter(binding, "binding");
            this.f96274a = binding;
        }

        /* renamed from: c */
        public static final void m10395c(OnClickRetry onClickRetry, View view) {
            Intrinsics.checkNotNullParameter(onClickRetry, "$onClickRetry");
            onClickRetry.onretry();
        }

        public final void bind(@NotNull final OnClickRetry onClickRetry, @NotNull OneTransactionHistoryReportThemeModel themeModel, @NotNull Context context) {
            Intrinsics.checkNotNullParameter(onClickRetry, "onClickRetry");
            Intrinsics.checkNotNullParameter(themeModel, "themeModel");
            Intrinsics.checkNotNullParameter(context, "context");
            this.f96274a.tvBtnRetry.setTextColor(ResourcesCompat.getColor(context.getResources(), themeModel.getErrorFontColor(), null));
            this.f96274a.btnRetryHistorySell.setBackgroundResource(themeModel.getErrorButtonBackground());
            this.f96274a.ivBtnRetry.setImageResource(themeModel.getErrorButtonDrawable());
            this.f96274a.btnRetryHistorySell.setOnClickListener(new View.OnClickListener() { // from class: b11
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    OneOwnerTransactionAdapter.OwnerErrorViewHolder.m10395c(onClickRetry, view);
                }
            });
        }
    }

    @StabilityInferred(parameters = 0)
    @Metadata(m29143d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J-\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, m29142d2 = {"Lth/co/dtac/android/dtacone/view/appOne/report/adapter/OneOwnerTransactionAdapter$OwnerHeaderViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Lth/co/dtac/android/dtacone/databinding/OneRtrHistoryHeaderBinding;", "binding", "<init>", "(Lth/co/dtac/android/dtacone/databinding/OneRtrHistoryHeaderBinding;)V", "Lth/co/dtac/android/dtacone/model/inactive_user/OwnerTransactionCollection$Summary;", ErrorBundle.SUMMARY_ENTRY, "", "isShowLineSeparate", "Lth/co/dtac/android/dtacone/model/appOne/transaction_history/OneTransactionHistoryReportThemeModel;", "themeModel", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "bind", "(Lth/co/dtac/android/dtacone/model/inactive_user/OwnerTransactionCollection$Summary;ZLth/co/dtac/android/dtacone/model/appOne/transaction_history/OneTransactionHistoryReportThemeModel;Landroid/content/Context;)V", PDPageLabelRange.STYLE_LETTERS_LOWER, "Lth/co/dtac/android/dtacone/databinding/OneRtrHistoryHeaderBinding;", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0})
    /* renamed from: th.co.dtac.android.dtacone.view.appOne.report.adapter.OneOwnerTransactionAdapter$OwnerHeaderViewHolder */
    /* loaded from: classes10.dex */
    public static final class OwnerHeaderViewHolder extends RecyclerView.ViewHolder {
        public static final int $stable = 8;

        /* renamed from: a */
        public final OneRtrHistoryHeaderBinding f96275a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OwnerHeaderViewHolder(@NotNull OneRtrHistoryHeaderBinding binding) {
            super(binding.getRoot());
            Intrinsics.checkNotNullParameter(binding, "binding");
            this.f96275a = binding;
        }

        public final void bind(@NotNull OwnerTransactionCollection.Summary summary, boolean z, @NotNull OneTransactionHistoryReportThemeModel themeModel, @NotNull Context context) {
            int i;
            Intrinsics.checkNotNullParameter(summary, "summary");
            Intrinsics.checkNotNullParameter(themeModel, "themeModel");
            Intrinsics.checkNotNullParameter(context, "context");
            this.f96275a.layoutTitle.setBackgroundResource(themeModel.getSummaryTitleBackground());
            View view = this.f96275a.vSeparateHeader;
            if (z) {
                i = 0;
            } else {
                i = 8;
            }
            view.setVisibility(i);
            this.f96275a.listTitle.setText(summary.getListTitle());
            this.f96275a.listValue.setText(summary.getListValue());
            this.f96275a.listValue.setTextColor(ResourcesCompat.getColor(context.getResources(), themeModel.getFontColor(), null));
            this.f96275a.totalTitle.setText(summary.getTotalTitle());
            this.f96275a.totalValue.setText(summary.getTotalValue());
            this.f96275a.totalValue.setTextColor(ResourcesCompat.getColor(context.getResources(), themeModel.getFontColor(), null));
            this.f96275a.title.setText(summary.getTitle());
        }
    }

    @StabilityInferred(parameters = 0)
    @Metadata(m29143d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J?\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, m29142d2 = {"Lth/co/dtac/android/dtacone/view/appOne/report/adapter/OneOwnerTransactionAdapter$OwnerTransactionViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Lth/co/dtac/android/dtacone/databinding/OneOwnerTransactionItemRowBinding;", "binding", "<init>", "(Lth/co/dtac/android/dtacone/databinding/OneOwnerTransactionItemRowBinding;)V", "Lth/co/dtac/android/dtacone/model/inactive_user/OwnerTransactionCollection$LastTransaction;", "ownerTransaction", "", "isUserLan", "", "xCompany", "Lth/co/dtac/android/dtacone/model/appOne/transaction_history/OneTransactionHistoryReportThemeModel;", "themeModel", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lth/co/dtac/android/dtacone/presenter/inactive_user/OwnerDetailPresenter;", "presenter", "", "bind", "(Lth/co/dtac/android/dtacone/model/inactive_user/OwnerTransactionCollection$LastTransaction;Ljava/lang/Boolean;Ljava/lang/String;Lth/co/dtac/android/dtacone/model/appOne/transaction_history/OneTransactionHistoryReportThemeModel;Landroid/content/Context;Lth/co/dtac/android/dtacone/presenter/inactive_user/OwnerDetailPresenter;)V", PDPageLabelRange.STYLE_LETTERS_LOWER, "Lth/co/dtac/android/dtacone/databinding/OneOwnerTransactionItemRowBinding;", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0})
    /* renamed from: th.co.dtac.android.dtacone.view.appOne.report.adapter.OneOwnerTransactionAdapter$OwnerTransactionViewHolder */
    /* loaded from: classes10.dex */
    public static final class OwnerTransactionViewHolder extends RecyclerView.ViewHolder {
        public static final int $stable = 8;

        /* renamed from: a */
        public final OneOwnerTransactionItemRowBinding f96276a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OwnerTransactionViewHolder(@NotNull OneOwnerTransactionItemRowBinding binding) {
            super(binding.getRoot());
            Intrinsics.checkNotNullParameter(binding, "binding");
            this.f96276a = binding;
        }

        public final void bind(@NotNull OwnerTransactionCollection.LastTransaction ownerTransaction, @Nullable Boolean bool, @NotNull String xCompany, @NotNull OneTransactionHistoryReportThemeModel themeModel, @NotNull Context context, @NotNull OwnerDetailPresenter presenter) {
            String pretty;
            int i;
            String str;
            String pretty2;
            Intrinsics.checkNotNullParameter(ownerTransaction, "ownerTransaction");
            Intrinsics.checkNotNullParameter(xCompany, "xCompany");
            Intrinsics.checkNotNullParameter(themeModel, "themeModel");
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(presenter, "presenter");
            this.f96276a.tvTransactionPhoneNumber.setText(PhoneNumberExtKt.toPretty(presenter.decryptCBC(ownerTransaction.getSubscriberNumber())));
            this.f96276a.tvTransactionTime.setText(ownerTransaction.getDisplayDate() + HelpFormatter.DEFAULT_LONG_OPT_SEPARATOR + ownerTransaction.getDisplayTime());
            this.f96276a.tvTransactionOwnerTitle.setText("  •  " + ownerTransaction.getTitleCreateBy());
            OneFontTextView oneFontTextView = this.f96276a.tvTransactionOwnerValue;
            if (Intrinsics.areEqual(bool, Boolean.TRUE)) {
                pretty = presenter.decryptCBC(ownerTransaction.getValueCreateBy());
            } else {
                pretty = PhoneNumberExtKt.toPretty(presenter.decryptCBC(ownerTransaction.getValueCreateBy()));
            }
            oneFontTextView.setText(pretty);
            OneFontTextView oneFontTextView2 = this.f96276a.tvTransactionType;
            String displayType = ownerTransaction.getDisplayType();
            String str2 = "";
            if (displayType == null) {
                displayType = "";
            }
            oneFontTextView2.setText(displayType);
            String str3 = null;
            this.f96276a.tvTransactionAmount.setTextColor(ResourcesCompat.getColor(context.getResources(), themeModel.getFontColor(), null));
            OneFontTextView oneFontTextView3 = this.f96276a.tvTransactionAmount;
            OwnerTransactionCollection.TransactionPrice price = ownerTransaction.getPrice();
            oneFontTextView3.setText((price == null || (r9 = price.getAmount()) == null) ? "" : "");
            AppCompatImageView appCompatImageView = this.f96276a.ivImageType;
            String featureCode = ownerTransaction.getFeatureCode();
            if (featureCode != null) {
                i = OnePermissionKt.getOneIconByPermission(featureCode, xCompany);
            } else {
                i = R.drawable.ic_window;
            }
            appCompatImageView.setImageResource(i);
            OneFontTextView oneFontTextView4 = this.f96276a.tvTransactionAmount;
            Intrinsics.checkNotNullExpressionValue(oneFontTextView4, "binding.tvTransactionAmount");
            OwnerTransactionCollection.TransactionPrice price2 = ownerTransaction.getPrice();
            if (price2 != null) {
                str = price2.getAmount();
            } else {
                str = null;
            }
            VisibleExtensionKt.toVisibleOrGone(oneFontTextView4, str);
            OneFontTextView oneFontTextView5 = this.f96276a.tvTransactionUnit;
            Intrinsics.checkNotNullExpressionValue(oneFontTextView5, "binding.tvTransactionUnit");
            OwnerTransactionCollection.TransactionPrice price3 = ownerTransaction.getPrice();
            if (price3 != null) {
                str3 = price3.getAmount();
            }
            VisibleExtensionKt.toVisibleOrGone(oneFontTextView5, str3);
            OneFontTextView oneFontTextView6 = this.f96276a.tvTransactionName;
            Intrinsics.checkNotNullExpressionValue(oneFontTextView6, "binding.tvTransactionName");
            VisibleExtensionKt.toVisibleOrGone(oneFontTextView6, ownerTransaction.getPackageName());
            OneFontTextView oneFontTextView7 = this.f96276a.tvTransactionName;
            String packageName = ownerTransaction.getPackageName();
            if (packageName == null) {
                packageName = "";
            }
            oneFontTextView7.setText(packageName);
            String featureCode2 = ownerTransaction.getFeatureCode();
            if (Intrinsics.areEqual(featureCode2, PermissionConstant.M_EXPR_PACK)) {
                OneFontTextView oneFontTextView8 = this.f96276a.tvTransactionOption;
                Intrinsics.checkNotNullExpressionValue(oneFontTextView8, "binding.tvTransactionOption");
                ViewVisibleExtKt.toVisible(oneFontTextView8);
                this.f96276a.tvTransactionOption.setText(ownerTransaction.getDisplayExpireOption());
            } else if (Intrinsics.areEqual(featureCode2, PermissionConstant.M_FAMI_SIM)) {
                OneFontTextView oneFontTextView9 = this.f96276a.tvTransactionName;
                Intrinsics.checkNotNullExpressionValue(oneFontTextView9, "binding.tvTransactionName");
                VisibleExtensionKt.toVisibleOrGone(oneFontTextView9, ownerTransaction.getFamilyNumber());
                OneFontTextView oneFontTextView10 = this.f96276a.tvTransactionName;
                String familyDetail = ownerTransaction.getFamilyDetail();
                String familyNumber = ownerTransaction.getFamilyNumber();
                if (familyNumber != null && (pretty2 = PhoneNumberExtKt.toPretty(familyNumber)) != null) {
                    str2 = pretty2;
                }
                oneFontTextView10.setText(familyDetail + HelpFormatter.DEFAULT_LONG_OPT_SEPARATOR + str2);
            } else {
                OneFontTextView oneFontTextView11 = this.f96276a.tvTransactionOption;
                Intrinsics.checkNotNullExpressionValue(oneFontTextView11, "binding.tvTransactionOption");
                ViewVisibleExtKt.toGone(oneFontTextView11);
            }
        }
    }

    public OneOwnerTransactionAdapter(@NotNull Context context, @NotNull OwnerTransactionCollection ownTransactions, @NotNull OnClickRetry onClickRetry, boolean z, @Nullable Boolean bool, @NotNull String xCompany, @NotNull OneTransactionHistoryReportThemeModel themeModel, @NotNull OwnerDetailPresenter presenter) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(ownTransactions, "ownTransactions");
        Intrinsics.checkNotNullParameter(onClickRetry, "onClickRetry");
        Intrinsics.checkNotNullParameter(xCompany, "xCompany");
        Intrinsics.checkNotNullParameter(themeModel, "themeModel");
        Intrinsics.checkNotNullParameter(presenter, "presenter");
        this.f96266a = context;
        this.f96267b = ownTransactions;
        this.f96268c = onClickRetry;
        this.f96269d = z;
        this.f96270e = bool;
        this.f96271f = xCompany;
        this.f96272g = themeModel;
        this.f96273h = presenter;
    }

    /* renamed from: a */
    private final RecyclerView.ViewHolder m10397a(int i, ViewGroup viewGroup) {
        RecyclerView.ViewHolder ownerErrorViewHolder;
        if (!this.f96267b.getLastTransactions().isEmpty()) {
            if (i == 0) {
                OneRtrHistoryHeaderBinding inflate = OneRtrHistoryHeaderBinding.inflate(LayoutInflater.from(viewGroup.getContext()));
                Intrinsics.checkNotNullExpressionValue(inflate, "inflate(LayoutInflater.from(parent.context))");
                return new OwnerHeaderViewHolder(inflate);
            }
            OneOwnerTransactionItemRowBinding inflate2 = OneOwnerTransactionItemRowBinding.inflate(LayoutInflater.from(viewGroup.getContext()));
            Intrinsics.checkNotNullExpressionValue(inflate2, "inflate(LayoutInflater.from(parent.context))");
            inflate2.getRoot().setLayoutParams(new RecyclerView.LayoutParams(-1, -2));
            ownerErrorViewHolder = new OwnerTransactionViewHolder(inflate2);
        } else if (!this.f96269d) {
            if (i == 0) {
                OneRtrHistoryHeaderBinding inflate3 = OneRtrHistoryHeaderBinding.inflate(LayoutInflater.from(viewGroup.getContext()));
                Intrinsics.checkNotNullExpressionValue(inflate3, "inflate(LayoutInflater.from(parent.context))");
                inflate3.getRoot().setLayoutParams(new RecyclerView.LayoutParams(-1, -2));
                ownerErrorViewHolder = new OwnerHeaderViewHolder(inflate3);
            } else {
                OneViewEmptyRecycleBinding inflate4 = OneViewEmptyRecycleBinding.inflate(LayoutInflater.from(viewGroup.getContext()));
                Intrinsics.checkNotNullExpressionValue(inflate4, "inflate(LayoutInflater.from(parent.context))");
                inflate4.getRoot().setLayoutParams(new RecyclerView.LayoutParams(-1, -2));
                ownerErrorViewHolder = new OwnerEmptyViewHolder(inflate4);
            }
        } else {
            OneErrorViewRecycleBinding inflate5 = OneErrorViewRecycleBinding.inflate(LayoutInflater.from(viewGroup.getContext()));
            Intrinsics.checkNotNullExpressionValue(inflate5, "inflate(LayoutInflater.from(parent.context))");
            inflate5.getRoot().setLayoutParams(new RecyclerView.LayoutParams(-1, -2));
            ownerErrorViewHolder = new OwnerErrorViewHolder(inflate5);
        }
        return ownerErrorViewHolder;
    }

    public final void addLasttransection(@NotNull OwnerTransactionCollection ownTransaction) {
        Intrinsics.checkNotNullParameter(ownTransaction, "ownTransaction");
        this.f96267b.getLastTransactions().addAll(ownTransaction.getLastTransactions());
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        if (this.f96269d) {
            return 1;
        }
        if (this.f96267b.getLastTransactions().size() == 0) {
            return 2;
        }
        return 1 + this.f96267b.getLastTransactions().size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        return i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull RecyclerView.ViewHolder holder, int i) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        OwnerTransactionCollection.Summary summary = this.f96267b.getSummary();
        boolean z = true;
        if (holder instanceof OwnerTransactionViewHolder) {
            OwnerTransactionCollection.LastTransaction lastTransaction = this.f96267b.getLastTransactions().get(i - 1);
            Intrinsics.checkNotNullExpressionValue(lastTransaction, "ownTransactions.lastTransactions.get(position - 1)");
            ((OwnerTransactionViewHolder) holder).bind(lastTransaction, this.f96270e, this.f96271f, this.f96272g, this.f96266a, this.f96273h);
        } else if (holder instanceof OwnerHeaderViewHolder) {
            if (summary != null) {
                OwnerHeaderViewHolder ownerHeaderViewHolder = (OwnerHeaderViewHolder) holder;
                if (this.f96267b.getLastTransactions().size() <= 0) {
                    z = false;
                }
                ownerHeaderViewHolder.bind(summary, z, this.f96272g, this.f96266a);
            }
        } else if (holder instanceof OwnerEmptyViewHolder) {
            ((OwnerEmptyViewHolder) holder).bind();
        } else if (holder instanceof OwnerErrorViewHolder) {
            ((OwnerErrorViewHolder) holder).bind(this.f96268c, this.f96272g, this.f96266a);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public RecyclerView.ViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int i) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        if (this.f96269d) {
            if (i == 0) {
                return m10397a(i, parent);
            }
            return m10397a(i, parent);
        }
        return m10397a(i, parent);
    }

    public final void setError(boolean z) {
        this.f96269d = z;
        notifyDataSetChanged();
    }
}