package com.chuckerteam.chucker.internal.support;

import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.util.LongSparseArray;
import androidx.core.app.NotificationCompat;
import androidx.core.content.ContextCompat;
import ch.qos.logback.core.CoreConstants;
import com.chuckerteam.chucker.R;
import com.chuckerteam.chucker.internal.data.entity.HttpTransaction;
import com.chuckerteam.chucker.internal.p010ui.BaseChuckerActivity;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.util.HashSet;
import java.util.Iterator;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.IntIterator;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.AbstractC11719c;
import org.jetbrains.annotations.NotNull;

@Metadata(m28851d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000 #2\u00020\u0001:\u0001#B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\r\u0010\u000b\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\r\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\r\u0010\nJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001c\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u001bR#\u0010\"\u001a\n \u001e*\u0004\u0018\u00010\u001d0\u001d8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u001f\u001a\u0004\b \u0010!¨\u0006$"}, m28850d2 = {"Lcom/chuckerteam/chucker/internal/support/NotificationHelper;", "", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction;", "transaction", "", "show", "(Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction;)V", "dismissNotifications", "()V", PDPageLabelRange.STYLE_LETTERS_LOWER, "", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "()Z", "Landroidx/core/app/NotificationCompat$Action;", OperatorName.CURVE_TO, "()Landroidx/core/app/NotificationCompat$Action;", "", "e", "()I", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "Landroid/app/NotificationManager;", "Landroid/app/NotificationManager;", "notificationManager", "Landroid/app/PendingIntent;", "kotlin.jvm.PlatformType", "Lkotlin/Lazy;", "d", "()Landroid/app/PendingIntent;", "transactionsScreenIntent", "Companion", "com.github.ChuckerTeam.Chucker.library"}, m28849k = 1, m28848mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nNotificationHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NotificationHelper.kt\ncom/chuckerteam/chucker/internal/support/NotificationHelper\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,148:1\n1855#2,2:149\n*S KotlinDebug\n*F\n+ 1 NotificationHelper.kt\ncom/chuckerteam/chucker/internal/support/NotificationHelper\n*L\n100#1:149,2\n*E\n"})
/* loaded from: classes3.dex */
public final class NotificationHelper {
    @NotNull
    public static final Companion Companion = new Companion(null);

    /* renamed from: d */
    public static final LongSparseArray f42945d = new LongSparseArray();

    /* renamed from: e */
    public static final HashSet f42946e = new HashSet();

    /* renamed from: a */
    public final Context f42947a;

    /* renamed from: b */
    public final NotificationManager f42948b;

    /* renamed from: c */
    public final Lazy f42949c;

    @Metadata(m28851d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u000f\u001a\u00020\u0010R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, m28850d2 = {"Lcom/chuckerteam/chucker/internal/support/NotificationHelper$Companion;", "", "()V", "BUFFER_SIZE", "", "INTENT_REQUEST_CODE", "TRANSACTIONS_CHANNEL_ID", "", "TRANSACTION_NOTIFICATION_ID", "transactionBuffer", "Landroid/util/LongSparseArray;", "Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction;", "transactionIdsSet", "Ljava/util/HashSet;", "", "clearBuffer", "", "com.github.ChuckerTeam.Chucker.library"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
    /* loaded from: classes3.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void clearBuffer() {
            synchronized (NotificationHelper.f42945d) {
                NotificationHelper.f42945d.clear();
                NotificationHelper.f42946e.clear();
                Unit unit = Unit.INSTANCE;
            }
        }

        public Companion() {
        }
    }

    public NotificationHelper(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f42947a = context;
        Object systemService = context.getSystemService("notification");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.app.NotificationManager");
        NotificationManager notificationManager = (NotificationManager) systemService;
        this.f42948b = notificationManager;
        this.f42949c = LazyKt__LazyJVMKt.lazy(new NotificationHelper$transactionsScreenIntent$2(this));
        if (Build.VERSION.SDK_INT >= 26) {
            AbstractC20020gJ0.m31149a();
            notificationManager.createNotificationChannels(AbstractC10108ds.listOf(TI0.m66215a("chucker_transactions", context.getString(R.string.chucker_network_notification_category), 2)));
        }
    }

    /* renamed from: a */
    public final void m49923a(HttpTransaction httpTransaction) {
        if (httpTransaction.getId() == 0) {
            return;
        }
        LongSparseArray longSparseArray = f42945d;
        synchronized (longSparseArray) {
            try {
                f42946e.add(Long.valueOf(httpTransaction.getId()));
                longSparseArray.put(httpTransaction.getId(), httpTransaction);
                if (longSparseArray.size() > 10) {
                    longSparseArray.removeAt(0);
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: b */
    public final boolean m49922b() {
        boolean areNotificationsEnabled;
        if (Build.VERSION.SDK_INT >= 24) {
            areNotificationsEnabled = this.f42948b.areNotificationsEnabled();
            return areNotificationsEnabled;
        }
        return true;
    }

    /* renamed from: c */
    public final NotificationCompat.Action m49921c() {
        String string = this.f42947a.getString(R.string.chucker_clear);
        Intrinsics.checkNotNullExpressionValue(string, "context.getString(R.string.chucker_clear)");
        return new NotificationCompat.Action(R.drawable.chucker_ic_delete_white, string, PendingIntent.getBroadcast(this.f42947a, 11, new Intent(this.f42947a, ClearDatabaseJobIntentServiceReceiver.class), 1073741824 | m49919e()));
    }

    /* renamed from: d */
    public final PendingIntent m49920d() {
        return (PendingIntent) this.f42949c.getValue();
    }

    public final void dismissNotifications() {
        this.f42948b.cancel(1138);
    }

    /* renamed from: e */
    public final int m49919e() {
        if (Build.VERSION.SDK_INT >= 23) {
            return 67108864;
        }
        return 0;
    }

    @NotNull
    public final Context getContext() {
        return this.f42947a;
    }

    public final void show(@NotNull HttpTransaction transaction) {
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        m49923a(transaction);
        if (!BaseChuckerActivity.Companion.isInForeground() && m49922b()) {
            NotificationCompat.Builder addAction = new NotificationCompat.Builder(this.f42947a, "chucker_transactions").setContentIntent(m49920d()).setLocalOnly(true).setSmallIcon(R.drawable.chucker_ic_transaction_notification).setColor(ContextCompat.getColor(this.f42947a, R.color.chucker_color_primary)).setContentTitle(this.f42947a.getString(R.string.chucker_http_notification_title)).setAutoCancel(true).addAction(m49921c());
            Intrinsics.checkNotNullExpressionValue(addAction, "Builder(context, TRANSAC…tion(createClearAction())");
            NotificationCompat.InboxStyle inboxStyle = new NotificationCompat.InboxStyle();
            LongSparseArray longSparseArray = f42945d;
            synchronized (longSparseArray) {
                try {
                    int i = 0;
                    Iterator<Integer> it = AbstractC11719c.downTo(longSparseArray.size() - 1, 0).iterator();
                    while (it.hasNext()) {
                        HttpTransaction httpTransaction = (HttpTransaction) f42945d.valueAt(((IntIterator) it).nextInt());
                        if (httpTransaction != null && i < 10) {
                            if (i == 0) {
                                addAction.setContentText(httpTransaction.getNotificationText());
                            }
                            inboxStyle.addLine(httpTransaction.getNotificationText());
                        }
                        i++;
                    }
                    addAction.setStyle(inboxStyle);
                    if (Build.VERSION.SDK_INT >= 24) {
                        addAction.setSubText(String.valueOf(f42946e.size()));
                    } else {
                        addAction.setNumber(f42946e.size());
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            this.f42948b.notify(1138, addAction.build());
        }
    }
}
