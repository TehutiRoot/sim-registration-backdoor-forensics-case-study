package androidx.compose.p003ui.tooling;

import android.util.Log;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m29143d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0000\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, m29142d2 = {"Landroidx/compose/ui/tooling/PreviewLogger;", "", "()V", "Companion", "ui-tooling_release"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: androidx.compose.ui.tooling.PreviewLogger */
/* loaded from: classes2.dex */
public final class PreviewLogger {
    @NotNull
    public static final Companion Companion = new Companion(null);

    @Metadata(m29143d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J!\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0000¢\u0006\u0002\b\tJ!\u0010\n\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0000¢\u0006\u0002\b\u000b¨\u0006\f"}, m29142d2 = {"Landroidx/compose/ui/tooling/PreviewLogger$Companion;", "", "()V", "logError", "", "message", "", "throwable", "", "logError$ui_tooling_release", "logWarning", "logWarning$ui_tooling_release", "ui-tooling_release"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: androidx.compose.ui.tooling.PreviewLogger$Companion */
    /* loaded from: classes2.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ void logError$ui_tooling_release$default(Companion companion, String str, Throwable th2, int i, Object obj) {
            if ((i & 2) != 0) {
                th2 = null;
            }
            companion.logError$ui_tooling_release(str, th2);
        }

        public static /* synthetic */ void logWarning$ui_tooling_release$default(Companion companion, String str, Throwable th2, int i, Object obj) {
            if ((i & 2) != 0) {
                th2 = null;
            }
            companion.logWarning$ui_tooling_release(str, th2);
        }

        public final void logError$ui_tooling_release(@NotNull String message, @Nullable Throwable th2) {
            Intrinsics.checkNotNullParameter(message, "message");
        }

        public final void logWarning$ui_tooling_release(@NotNull String message, @Nullable Throwable th2) {
            Intrinsics.checkNotNullParameter(message, "message");
            Log.w("PreviewLogger", message, th2);
        }

        public Companion() {
        }
    }
}