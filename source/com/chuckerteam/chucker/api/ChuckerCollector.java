package com.chuckerteam.chucker.api;

import android.content.Context;
import android.net.Uri;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.joran.action.Action;
import com.chuckerteam.chucker.R;
import com.chuckerteam.chucker.api.RetentionManager;
import com.chuckerteam.chucker.internal.data.entity.HttpTransaction;
import com.chuckerteam.chucker.internal.data.har.log.Creator;
import com.chuckerteam.chucker.internal.data.repository.RepositoryProvider;
import com.chuckerteam.chucker.internal.support.HarUtils;
import com.chuckerteam.chucker.internal.support.JsonConverter;
import com.chuckerteam.chucker.internal.support.NotificationHelper;
import com.chuckerteam.chucker.internal.support.Sharable;
import com.chuckerteam.chucker.internal.support.SharableKt;
import com.chuckerteam.chucker.internal.support.TransactionDetailsHarSharable;
import com.chuckerteam.chucker.internal.support.TransactionListDetailsSharable;
import com.google.gson.Gson;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m28851d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B%\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u000f\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0000¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0000¢\u0006\u0004\b\u0010\u0010\u000eJ+\u0010\u0017\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\b\b\u0002\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0017\u0010\u0018R\"\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u0014\u0010\"\u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010&\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010*\u001a\u00020'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)¨\u0006+"}, m28850d2 = {"Lcom/chuckerteam/chucker/api/ChuckerCollector;", "", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "showNotification", "Lcom/chuckerteam/chucker/api/RetentionManager$Period;", "retentionPeriod", "<init>", "(Landroid/content/Context;ZLcom/chuckerteam/chucker/api/RetentionManager$Period;)V", "Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction;", "transaction", "", "onRequestSent$com_github_ChuckerTeam_Chucker_library", "(Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction;)V", "onRequestSent", "onResponseReceived$com_github_ChuckerTeam_Chucker_library", "onResponseReceived", "", "startTimestamp", "Lcom/chuckerteam/chucker/api/ExportFormat;", "exportFormat", "Landroid/net/Uri;", "writeTransactions", "(Landroid/content/Context;Ljava/lang/Long;Lcom/chuckerteam/chucker/api/ExportFormat;)Landroid/net/Uri;", PDPageLabelRange.STYLE_LETTERS_LOWER, "Z", "getShowNotification", "()Z", "setShowNotification", "(Z)V", "Lcom/chuckerteam/chucker/api/RetentionManager;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Lcom/chuckerteam/chucker/api/RetentionManager;", "retentionManager", "Lcom/chuckerteam/chucker/internal/support/NotificationHelper;", OperatorName.CURVE_TO, "Lcom/chuckerteam/chucker/internal/support/NotificationHelper;", "notificationHelper", "Lkotlinx/coroutines/CoroutineScope;", "d", "Lkotlinx/coroutines/CoroutineScope;", Action.SCOPE_ATTRIBUTE, "com.github.ChuckerTeam.Chucker.library"}, m28849k = 1, m28848mv = {1, 8, 0})
/* loaded from: classes3.dex */
public final class ChuckerCollector {

    /* renamed from: a */
    public boolean f42753a;

    /* renamed from: b */
    public final RetentionManager f42754b;

    /* renamed from: c */
    public final NotificationHelper f42755c;

    /* renamed from: d */
    public final CoroutineScope f42756d;

    @Metadata(m28849k = 3, m28848mv = {1, 8, 0}, m28846xi = 48)
    /* loaded from: classes3.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ExportFormat.values().length];
            try {
                iArr[ExportFormat.LOG.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ExportFormat.HAR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public ChuckerCollector(@NotNull Context context) {
        this(context, false, null, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public static /* synthetic */ Uri writeTransactions$default(ChuckerCollector chuckerCollector, Context context, Long l, ExportFormat exportFormat, int i, Object obj) {
        if ((i & 4) != 0) {
            exportFormat = ExportFormat.LOG;
        }
        return chuckerCollector.writeTransactions(context, l, exportFormat);
    }

    public final boolean getShowNotification() {
        return this.f42753a;
    }

    public final void onRequestSent$com_github_ChuckerTeam_Chucker_library(@NotNull HttpTransaction transaction) {
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        AbstractC1552Vc.m65753e(this.f42756d, null, null, new ChuckerCollector$onRequestSent$1(this, transaction, null), 3, null);
    }

    public final void onResponseReceived$com_github_ChuckerTeam_Chucker_library(@NotNull HttpTransaction transaction) {
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        AbstractC1552Vc.m65753e(this.f42756d, null, null, new ChuckerCollector$onResponseReceived$1(this, transaction, null), 3, null);
    }

    public final void setShowNotification(boolean z) {
        this.f42753a = z;
    }

    @Nullable
    public final Uri writeTransactions(@NotNull Context context, @Nullable Long l, @NotNull ExportFormat exportFormat) {
        Sharable transactionListDetailsSharable;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(exportFormat, "exportFormat");
        List<HttpTransaction> transactionsInTimeRange = RepositoryProvider.INSTANCE.transaction().getTransactionsInTimeRange(l);
        if (transactionsInTimeRange.isEmpty()) {
            return null;
        }
        int i = WhenMappings.$EnumSwitchMapping$0[exportFormat.ordinal()];
        if (i != 1) {
            if (i == 2) {
                Gson nonNullSerializerInstance = JsonConverter.INSTANCE.getNonNullSerializerInstance();
                HarUtils harUtils = HarUtils.INSTANCE;
                String string = context.getString(R.string.chucker_name);
                Intrinsics.checkNotNullExpressionValue(string, "context.getString(R.string.chucker_name)");
                String string2 = context.getString(R.string.chucker_version);
                Intrinsics.checkNotNullExpressionValue(string2, "context.getString(R.string.chucker_version)");
                String json = nonNullSerializerInstance.toJson(harUtils.fromHttpTransactions$com_github_ChuckerTeam_Chucker_library(transactionsInTimeRange, new Creator(string, string2, null, 4, null)));
                Intrinsics.checkNotNullExpressionValue(json, "JsonConverter.nonNullSer…                        )");
                transactionListDetailsSharable = new TransactionDetailsHarSharable(json);
            } else {
                throw new NoWhenBranchMatchedException();
            }
        } else {
            transactionListDetailsSharable = new TransactionListDetailsSharable(transactionsInTimeRange, false);
        }
        String extension = exportFormat.getExtension();
        return SharableKt.writeToFile(transactionListDetailsSharable, context, "api_transactions." + extension);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public ChuckerCollector(@NotNull Context context, boolean z) {
        this(context, z, null, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @JvmOverloads
    public ChuckerCollector(@NotNull Context context, boolean z, @NotNull RetentionManager.Period retentionPeriod) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(retentionPeriod, "retentionPeriod");
        this.f42753a = z;
        this.f42754b = new RetentionManager(context, retentionPeriod);
        this.f42755c = new NotificationHelper(context);
        this.f42756d = CoroutineScopeKt.MainScope();
        RepositoryProvider.INSTANCE.initialize(context);
    }

    public /* synthetic */ ChuckerCollector(Context context, boolean z, RetentionManager.Period period, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? true : z, (i & 4) != 0 ? RetentionManager.Period.ONE_WEEK : period);
    }
}
