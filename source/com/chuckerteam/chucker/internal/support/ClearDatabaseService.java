package com.chuckerteam.chucker.internal.support;

import android.content.Context;
import android.content.Intent;
import androidx.core.app.JobIntentService;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.joran.action.Action;
import com.chuckerteam.chucker.internal.data.repository.RepositoryProvider;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import org.jetbrains.annotations.NotNull;

@Metadata(m28851d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 \r2\u00020\u0001:\u0001\rB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\f\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\u000e"}, m28850d2 = {"Lcom/chuckerteam/chucker/internal/support/ClearDatabaseService;", "Landroidx/core/app/JobIntentService;", "<init>", "()V", "Landroid/content/Intent;", "intent", "", "onHandleWork", "(Landroid/content/Intent;)V", "Lkotlinx/coroutines/CoroutineScope;", OperatorName.SET_LINE_JOINSTYLE, "Lkotlinx/coroutines/CoroutineScope;", Action.SCOPE_ATTRIBUTE, "Companion", "com.github.ChuckerTeam.Chucker.library"}, m28849k = 1, m28848mv = {1, 8, 0})
/* loaded from: classes3.dex */
public final class ClearDatabaseService extends JobIntentService {
    @NotNull
    public static final Companion Companion = new Companion(null);

    /* renamed from: j */
    public final CoroutineScope f42930j = CoroutineScopeKt.MainScope();

    @Metadata(m28851d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000b"}, m28850d2 = {"Lcom/chuckerteam/chucker/internal/support/ClearDatabaseService$Companion;", "", "()V", "CLEAN_DATABASE_JOB_ID", "", "enqueueWork", "", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/content/Context;", "work", "Landroid/content/Intent;", "com.github.ChuckerTeam.Chucker.library"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
    /* loaded from: classes3.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void enqueueWork(@NotNull Context context, @NotNull Intent work) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(work, "work");
            JobIntentService.enqueueWork(context, ClearDatabaseService.class, 123321, work);
        }

        public Companion() {
        }
    }

    @Override // androidx.core.app.JobIntentService
    public void onHandleWork(@NotNull Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        RepositoryProvider repositoryProvider = RepositoryProvider.INSTANCE;
        Context applicationContext = getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "applicationContext");
        repositoryProvider.initialize(applicationContext);
        AbstractC1552Vc.m65753e(this.f42930j, null, null, new ClearDatabaseService$onHandleWork$1(this, null), 3, null);
    }
}
