package co.omise.android.extensions;

import android.content.Intent;
import android.os.Build;
import android.os.Parcelable;
import ch.qos.logback.core.joran.action.Action;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(m29143d1 = {"\u0000\u0016\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a*\u0010\u0000\u001a\u0004\u0018\u0001H\u0001\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0002*\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0080\b¢\u0006\u0002\u0010\u0006\u001a,\u0010\u0007\u001a\u0004\u0018\u0001H\u0001\"\f\b\u0000\u0010\u0001\u0018\u0001*\u0004\u0018\u00010\u0002*\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0080\b¢\u0006\u0002\u0010\u0006¨\u0006\b"}, m29142d2 = {"parcelable", "T", "Landroid/os/Parcelable;", "Landroid/content/Intent;", Action.KEY_ATTRIBUTE, "", "(Landroid/content/Intent;Ljava/lang/String;)Landroid/os/Parcelable;", "parcelableNullable", "sdk_productionRelease"}, m29141k = 2, m29140mv = {1, 7, 1}, m29138xi = 48)
/* loaded from: classes.dex */
public final class IntentExtensionsKt {
    public static final /* synthetic */ <T extends Parcelable> T parcelable(Intent intent, String str) {
        Object parcelableExtra;
        Intrinsics.checkNotNullParameter(intent, "<this>");
        if (Build.VERSION.SDK_INT >= 33) {
            Intrinsics.reifiedOperationMarker(4, "T");
            parcelableExtra = intent.getParcelableExtra(str, Parcelable.class);
            return (T) parcelableExtra;
        }
        T t = (T) intent.getParcelableExtra(str);
        Intrinsics.reifiedOperationMarker(2, "T");
        return t;
    }

    public static final /* synthetic */ <T extends Parcelable> T parcelableNullable(Intent intent, String str) {
        Object parcelableExtra;
        Intrinsics.checkNotNullParameter(intent, "<this>");
        if (Build.VERSION.SDK_INT >= 33) {
            Intrinsics.reifiedOperationMarker(4, "T");
            parcelableExtra = intent.getParcelableExtra(str, Parcelable.class);
            return (T) parcelableExtra;
        }
        T t = (T) intent.getParcelableExtra(str);
        Intrinsics.reifiedOperationMarker(2, "T");
        return t;
    }
}