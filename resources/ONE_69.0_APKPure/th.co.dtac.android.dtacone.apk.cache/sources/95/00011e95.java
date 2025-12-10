package th.p047co.dtac.android.dtacone.model.livedata;

import android.os.Bundle;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.Fragment;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B'\u0012\n\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0006\u0010\u000b\u001a\u00020\fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\r"}, m29142d2 = {"Lth/co/dtac/android/dtacone/model/livedata/FragmentNavEvent;", "Lth/co/dtac/android/dtacone/model/livedata/NavEvent;", "clazz", "Ljava/lang/Class;", "bundle", "Landroid/os/Bundle;", "tag", "", "(Ljava/lang/Class;Landroid/os/Bundle;Ljava/lang/String;)V", "getTag", "()Ljava/lang/String;", "buildFragment", "Landroidx/fragment/app/Fragment;", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.livedata.FragmentNavEvent */
/* loaded from: classes8.dex */
public final class FragmentNavEvent extends NavEvent {
    public static final int $stable = 0;
    @NotNull
    private final String tag;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FragmentNavEvent(@NotNull Class<?> clazz, @Nullable Bundle bundle, @NotNull String tag) {
        super(clazz, bundle);
        Intrinsics.checkNotNullParameter(clazz, "clazz");
        Intrinsics.checkNotNullParameter(tag, "tag");
        this.tag = tag;
    }

    @NotNull
    public final Fragment buildFragment() {
        Object newInstance = getClazz().getConstructor(null).newInstance(null);
        Intrinsics.checkNotNull(newInstance, "null cannot be cast to non-null type androidx.fragment.app.Fragment");
        Fragment fragment = (Fragment) newInstance;
        Bundle bundle = getBundle();
        if (bundle != null) {
            fragment.setArguments(bundle);
        }
        return fragment;
    }

    @NotNull
    public final String getTag() {
        return this.tag;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* synthetic */ FragmentNavEvent(java.lang.Class r1, android.os.Bundle r2, java.lang.String r3, int r4, kotlin.jvm.internal.DefaultConstructorMarker r5) {
        /*
            r0 = this;
            r5 = r4 & 2
            if (r5 == 0) goto L5
            r2 = 0
        L5:
            r4 = r4 & 4
            if (r4 == 0) goto L12
            java.lang.String r3 = r1.getSimpleName()
            java.lang.String r4 = "clazz.simpleName"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r4)
        L12:
            r0.<init>(r1, r2, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: th.p047co.dtac.android.dtacone.model.livedata.FragmentNavEvent.<init>(java.lang.Class, android.os.Bundle, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}