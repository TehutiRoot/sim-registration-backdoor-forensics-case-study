package com.chuckerteam.chucker.internal.support;

import com.chuckerteam.chucker.api.Chucker;
import com.google.firebase.messaging.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m28851d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0004\b`\u0018\u0000 \n2\u00020\u0001:\u0001\nJ\u001c\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007H&J\u001c\u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007H&J\u001c\u0010\t\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007H&¨\u0006\u000b"}, m28850d2 = {"Lcom/chuckerteam/chucker/internal/support/Logger;", "", Constants.IPC_BUNDLE_KEY_SEND_ERROR, "", "message", "", "throwable", "", "info", "warn", "Companion", "com.github.ChuckerTeam.Chucker.library"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
/* loaded from: classes3.dex */
public interface Logger {
    @NotNull
    public static final Companion Companion = Companion.f42944a;

    @Metadata(m28851d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001a\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0016J\u001a\u0010\t\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0016J\u001a\u0010\n\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0016¨\u0006\u000b"}, m28850d2 = {"Lcom/chuckerteam/chucker/internal/support/Logger$Companion;", "Lcom/chuckerteam/chucker/internal/support/Logger;", "()V", Constants.IPC_BUNDLE_KEY_SEND_ERROR, "", "message", "", "throwable", "", "info", "warn", "com.github.ChuckerTeam.Chucker.library"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
    /* loaded from: classes3.dex */
    public static final class Companion implements Logger {

        /* renamed from: a */
        public static final /* synthetic */ Companion f42944a = new Companion();

        @Override // com.chuckerteam.chucker.internal.support.Logger
        public void error(@NotNull String message, @Nullable Throwable th2) {
            Intrinsics.checkNotNullParameter(message, "message");
            Chucker.INSTANCE.getLogger$com_github_ChuckerTeam_Chucker_library().error(message, th2);
        }

        @Override // com.chuckerteam.chucker.internal.support.Logger
        public void info(@NotNull String message, @Nullable Throwable th2) {
            Intrinsics.checkNotNullParameter(message, "message");
            Chucker.INSTANCE.getLogger$com_github_ChuckerTeam_Chucker_library().info(message, th2);
        }

        @Override // com.chuckerteam.chucker.internal.support.Logger
        public void warn(@NotNull String message, @Nullable Throwable th2) {
            Intrinsics.checkNotNullParameter(message, "message");
            Chucker.INSTANCE.getLogger$com_github_ChuckerTeam_Chucker_library().warn(message, th2);
        }
    }

    @Metadata(m28849k = 3, m28848mv = {1, 8, 0}, m28846xi = 48)
    /* loaded from: classes3.dex */
    public static final class DefaultImpls {
        public static /* synthetic */ void error$default(Logger logger, String str, Throwable th2, int i, Object obj) {
            if (obj == null) {
                if ((i & 2) != 0) {
                    th2 = null;
                }
                logger.error(str, th2);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: error");
        }

        public static /* synthetic */ void info$default(Logger logger, String str, Throwable th2, int i, Object obj) {
            if (obj == null) {
                if ((i & 2) != 0) {
                    th2 = null;
                }
                logger.info(str, th2);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: info");
        }

        public static /* synthetic */ void warn$default(Logger logger, String str, Throwable th2, int i, Object obj) {
            if (obj == null) {
                if ((i & 2) != 0) {
                    th2 = null;
                }
                logger.warn(str, th2);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: warn");
        }
    }

    void error(@NotNull String str, @Nullable Throwable th2);

    void info(@NotNull String str, @Nullable Throwable th2);

    void warn(@NotNull String str, @Nullable Throwable th2);
}
