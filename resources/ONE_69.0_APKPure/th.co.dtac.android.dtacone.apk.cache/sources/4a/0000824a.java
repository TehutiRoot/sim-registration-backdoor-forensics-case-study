package com.chuckerteam.chucker.api;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ShortcutInfo;
import android.content.pm.ShortcutManager;
import android.graphics.drawable.Icon;
import android.os.Build;
import android.util.Log;
import androidx.core.content.ContextCompat;
import ch.qos.logback.core.CoreConstants;
import com.chuckerteam.chucker.R;
import com.chuckerteam.chucker.internal.p010ui.MainActivity;
import com.chuckerteam.chucker.internal.support.Logger;
import com.chuckerteam.chucker.internal.support.NotificationHelper;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m29143d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\r\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\f\u0010\u000bR \u0010\u0011\u001a\u00020\u000e8\u0006X\u0086D¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u0012\u0004\b\u0013\u0010\u0003\u001a\u0004\b\u0011\u0010\u0012R\"\u0010\u001b\u001a\u00020\u00148\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001a¨\u0006\u001c"}, m29142d2 = {"Lcom/chuckerteam/chucker/api/Chucker;", "", "<init>", "()V", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/content/Intent;", "getLaunchIntent", "(Landroid/content/Context;)Landroid/content/Intent;", "", "dismissNotifications", "(Landroid/content/Context;)V", "createShortcut$com_github_ChuckerTeam_Chucker_library", "createShortcut", "", PDPageLabelRange.STYLE_LETTERS_LOWER, "Z", "isOp", "()Z", "isOp$annotations", "Lcom/chuckerteam/chucker/internal/support/Logger;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Lcom/chuckerteam/chucker/internal/support/Logger;", "getLogger$com_github_ChuckerTeam_Chucker_library", "()Lcom/chuckerteam/chucker/internal/support/Logger;", "setLogger$com_github_ChuckerTeam_Chucker_library", "(Lcom/chuckerteam/chucker/internal/support/Logger;)V", "logger", "com.github.ChuckerTeam.Chucker.library"}, m29141k = 1, m29140mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nChucker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Chucker.kt\ncom/chuckerteam/chucker/api/Chucker\n+ 2 Context.kt\nandroidx/core/content/ContextKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,94:1\n31#2:95\n1747#3,3:96\n*S KotlinDebug\n*F\n+ 1 Chucker.kt\ncom/chuckerteam/chucker/api/Chucker\n*L\n50#1:95\n51#1:96,3\n*E\n"})
/* loaded from: classes3.dex */
public final class Chucker {
    @NotNull
    public static final Chucker INSTANCE = new Chucker();

    /* renamed from: a */
    public static final boolean f42762a = true;

    /* renamed from: b */
    public static Logger f42763b = new Logger() { // from class: com.chuckerteam.chucker.api.Chucker$logger$1

        /* renamed from: a */
        public final String f42764a = "Chucker";

        @Override // com.chuckerteam.chucker.internal.support.Logger
        public void error(@NotNull String message, @Nullable Throwable th2) {
            Intrinsics.checkNotNullParameter(message, "message");
        }

        @NotNull
        public final String getTAG() {
            return this.f42764a;
        }

        @Override // com.chuckerteam.chucker.internal.support.Logger
        public void info(@NotNull String message, @Nullable Throwable th2) {
            Intrinsics.checkNotNullParameter(message, "message");
        }

        @Override // com.chuckerteam.chucker.internal.support.Logger
        public void warn(@NotNull String message, @Nullable Throwable th2) {
            Intrinsics.checkNotNullParameter(message, "message");
            Log.w(this.f42764a, message, th2);
        }
    };

    @JvmStatic
    public static final void dismissNotifications(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        new NotificationHelper(context).dismissNotifications();
    }

    @JvmStatic
    @NotNull
    public static final Intent getLaunchIntent(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intent flags = new Intent(context, MainActivity.class).setFlags(268435456);
        Intrinsics.checkNotNullExpressionValue(flags, "Intent(context, MainActi…t.FLAG_ACTIVITY_NEW_TASK)");
        return flags;
    }

    public static /* synthetic */ void isOp$annotations() {
    }

    public final void createShortcut$com_github_ChuckerTeam_Chucker_library(@NotNull Context context) {
        ShortcutManager m22703a;
        List dynamicShortcuts;
        String id2;
        ShortcutInfo.Builder shortLabel;
        ShortcutInfo.Builder longLabel;
        Icon createWithResource;
        ShortcutInfo.Builder icon;
        ShortcutInfo.Builder intent;
        ShortcutInfo build;
        Intrinsics.checkNotNullParameter(context, "context");
        if (Build.VERSION.SDK_INT >= 25 && (m22703a = AbstractC22322tJ1.m22703a(ContextCompat.getSystemService(context, AbstractC20419iJ1.m30993a()))) != null) {
            dynamicShortcuts = m22703a.getDynamicShortcuts();
            Intrinsics.checkNotNullExpressionValue(dynamicShortcuts, "shortcutManager.dynamicShortcuts");
            List<Object> list = dynamicShortcuts;
            if (!(list instanceof Collection) || !list.isEmpty()) {
                for (Object obj : list) {
                    id2 = AI1.m69289a(obj).getId();
                    if (Intrinsics.areEqual(id2, "chuckerShortcutId")) {
                        return;
                    }
                }
            }
            shortLabel = EI1.m68670a(context, "chuckerShortcutId").setShortLabel(context.getString(R.string.chucker_shortcut_label));
            longLabel = shortLabel.setLongLabel(context.getString(R.string.chucker_shortcut_label));
            createWithResource = Icon.createWithResource(context, R.mipmap.chucker_ic_launcher);
            icon = longLabel.setIcon(createWithResource);
            intent = icon.setIntent(getLaunchIntent(context).setAction("android.intent.action.VIEW"));
            build = intent.build();
            Intrinsics.checkNotNullExpressionValue(build, "Builder(context, SHORTCU…EW))\n            .build()");
            try {
                m22703a.addDynamicShortcuts(AbstractC10100ds.listOf(build));
            } catch (IllegalArgumentException e) {
                Logger.Companion.warn("ShortcutManager addDynamicShortcuts failed ", e);
            } catch (IllegalStateException e2) {
                Logger.Companion.warn("ShortcutManager addDynamicShortcuts failed ", e2);
            }
        }
    }

    @NotNull
    public final Logger getLogger$com_github_ChuckerTeam_Chucker_library() {
        return f42763b;
    }

    public final boolean isOp() {
        return f42762a;
    }

    public final void setLogger$com_github_ChuckerTeam_Chucker_library(@NotNull Logger logger) {
        Intrinsics.checkNotNullParameter(logger, "<set-?>");
        f42763b = logger;
    }
}