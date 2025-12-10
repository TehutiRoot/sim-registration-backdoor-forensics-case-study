package th.p047co.dtac.android.dtacone.util;

import android.content.Context;
import androidx.compose.runtime.internal.StabilityInferred;
import ch.qos.logback.core.CoreConstants;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import org.apache.commons.cli.HelpFormatter;
import org.jetbrains.annotations.NotNull;
import th.p047co.dtac.android.dtacone.BuildConfig;
import th.p047co.dtac.android.dtacone.R;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, m29142d2 = {"Lth/co/dtac/android/dtacone/util/VersionUtil;", "", "()V", "Companion", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.util.VersionUtil */
/* loaded from: classes8.dex */
public final class VersionUtil {
    public static final int $stable = 0;
    @NotNull
    public static final Companion Companion = new Companion(null);

    @Metadata(m29143d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\b"}, m29142d2 = {"Lth/co/dtac/android/dtacone/util/VersionUtil$Companion;", "", "()V", "getAppVersion", "", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/content/Context;", "getAppVersionWithCode", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.util.VersionUtil$Companion */
    /* loaded from: classes8.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final String getAppVersion(@NotNull Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            String joinToString$default = CollectionsKt___CollectionsKt.joinToString$default(CollectionsKt___CollectionsKt.take(StringsKt__StringsKt.split$default((CharSequence) BuildConfig.VERSION_NAME, new String[]{"."}, false, 0, 6, (Object) null), 2), ".", null, null, 0, null, null, 62, null);
            String string = context.getString(R.string.app_nickname);
            return string + HelpFormatter.DEFAULT_LONG_OPT_SEPARATOR + joinToString$default;
        }

        @NotNull
        public final String getAppVersionWithCode(@NotNull Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            String joinToString$default = CollectionsKt___CollectionsKt.joinToString$default(CollectionsKt___CollectionsKt.take(StringsKt__StringsKt.split$default((CharSequence) BuildConfig.VERSION_NAME, new String[]{"."}, false, 0, 6, (Object) null), 2), ".", null, null, 0, null, null, 62, null);
            String string = context.getString(R.string.app_nickname);
            return string + HelpFormatter.DEFAULT_LONG_OPT_SEPARATOR + joinToString$default + " (298)";
        }

        public Companion() {
        }
    }
}