package th.p047co.dtac.android.dtacone.configuration.activity;

import android.app.Activity;
import androidx.compose.runtime.internal.StabilityInferred;
import com.tbruyelle.rxpermissions2.RxPermissions;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import dagger.Module;
import dagger.Provides;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;
import th.p047co.dtac.android.dtacone.configuration.PerActivity;

@StabilityInferred(parameters = 0)
@Metadata(m28851d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0017\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0003\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0007¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m28850d2 = {"Lth/co/dtac/android/dtacone/configuration/activity/ActivityModule;", "", "Landroid/app/Activity;", "activity", "<init>", "(Landroid/app/Activity;)V", "()Landroid/app/Activity;", "Lcom/tbruyelle/rxpermissions2/RxPermissions;", "provideRxPermission", "(Landroid/app/Activity;)Lcom/tbruyelle/rxpermissions2/RxPermissions;", "Lorg/json/JSONObject;", "provideJson", "()Lorg/json/JSONObject;", PDPageLabelRange.STYLE_LETTERS_LOWER, "Landroid/app/Activity;", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0})
@Module
/* renamed from: th.co.dtac.android.dtacone.configuration.activity.ActivityModule */
/* loaded from: classes7.dex */
public class ActivityModule {
    public static final int $stable = 8;

    /* renamed from: a */
    public final Activity f83415a;

    public ActivityModule(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.f83415a = activity;
    }

    @Provides
    @NotNull
    @PerActivity
    public final Activity activity() {
        return this.f83415a;
    }

    @Provides
    @NotNull
    @PerActivity
    public final JSONObject provideJson() {
        return new JSONObject();
    }

    @Provides
    @NotNull
    @PerActivity
    public final RxPermissions provideRxPermission(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        return new RxPermissions(activity);
    }
}
