package th.p047co.dtac.android.dtacone.app_one.extension;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import ch.qos.logback.core.joran.action.Action;
import java.io.Serializable;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(m28851d1 = {"\u0000.\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a(\u0010\u0000\u001a\u0004\u0018\u0001H\u0001\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0002*\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0086\b¢\u0006\u0002\u0010\u0006\u001a(\u0010\u0000\u001a\u0004\u0018\u0001H\u0001\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0002*\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u0005H\u0086\b¢\u0006\u0002\u0010\b\u001a5\u0010\t\u001a\u0016\u0012\u0004\u0012\u0002H\u0001\u0018\u00010\nj\n\u0012\u0004\u0012\u0002H\u0001\u0018\u0001`\u000b\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0002*\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0086\b\u001a5\u0010\t\u001a\u0016\u0012\u0004\u0012\u0002H\u0001\u0018\u00010\nj\n\u0012\u0004\u0012\u0002H\u0001\u0018\u0001`\u000b\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0002*\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u0005H\u0086\b\u001a(\u0010\f\u001a\u0004\u0018\u0001H\u0001\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\r*\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u0005H\u0086\b¢\u0006\u0002\u0010\u000e¨\u0006\u000f"}, m28850d2 = {"parcelable", "T", "Landroid/os/Parcelable;", "Landroid/content/Intent;", Action.KEY_ATTRIBUTE, "", "(Landroid/content/Intent;Ljava/lang/String;)Landroid/os/Parcelable;", "Landroid/os/Bundle;", "(Landroid/os/Bundle;Ljava/lang/String;)Landroid/os/Parcelable;", "parcelableArrayList", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "serializable", "Ljava/io/Serializable;", "(Landroid/os/Bundle;Ljava/lang/String;)Ljava/io/Serializable;", "app_prodRelease"}, m28849k = 2, m28848mv = {1, 8, 0}, m28846xi = 48)
/* renamed from: th.co.dtac.android.dtacone.app_one.extension.BundleExtensionKt */
/* loaded from: classes7.dex */
public final class BundleExtensionKt {
    public static final /* synthetic */ <T extends Parcelable> T parcelable(Intent intent, String key) {
        Object parcelableExtra;
        Intrinsics.checkNotNullParameter(intent, "<this>");
        Intrinsics.checkNotNullParameter(key, "key");
        if (Build.VERSION.SDK_INT >= 33) {
            Intrinsics.reifiedOperationMarker(4, "T");
            parcelableExtra = intent.getParcelableExtra(key, Parcelable.class);
            return (T) parcelableExtra;
        }
        T t = (T) intent.getParcelableExtra(key);
        Intrinsics.reifiedOperationMarker(2, "T");
        return t;
    }

    public static final /* synthetic */ <T extends Parcelable> ArrayList<T> parcelableArrayList(Bundle bundle, String key) {
        ArrayList<T> parcelableArrayList;
        Intrinsics.checkNotNullParameter(bundle, "<this>");
        Intrinsics.checkNotNullParameter(key, "key");
        if (Build.VERSION.SDK_INT >= 33) {
            Intrinsics.reifiedOperationMarker(4, "T");
            parcelableArrayList = bundle.getParcelableArrayList(key, Parcelable.class);
            return parcelableArrayList;
        }
        return bundle.getParcelableArrayList(key);
    }

    public static final /* synthetic */ <T extends Serializable> T serializable(Bundle bundle, String key) {
        Serializable serializable;
        Intrinsics.checkNotNullParameter(bundle, "<this>");
        Intrinsics.checkNotNullParameter(key, "key");
        if (Build.VERSION.SDK_INT >= 33) {
            Intrinsics.reifiedOperationMarker(4, "T");
            serializable = bundle.getSerializable(key, Serializable.class);
            return (T) serializable;
        }
        T t = (T) bundle.getSerializable(key);
        Intrinsics.reifiedOperationMarker(2, "T");
        return t;
    }

    public static final /* synthetic */ <T extends Parcelable> T parcelable(Bundle bundle, String key) {
        Object parcelable;
        Intrinsics.checkNotNullParameter(bundle, "<this>");
        Intrinsics.checkNotNullParameter(key, "key");
        if (Build.VERSION.SDK_INT >= 33) {
            Intrinsics.reifiedOperationMarker(4, "T");
            parcelable = bundle.getParcelable(key, Parcelable.class);
            return (T) parcelable;
        }
        T t = (T) bundle.getParcelable(key);
        Intrinsics.reifiedOperationMarker(2, "T");
        return t;
    }

    public static final /* synthetic */ <T extends Parcelable> ArrayList<T> parcelableArrayList(Intent intent, String key) {
        ArrayList<T> parcelableArrayListExtra;
        Intrinsics.checkNotNullParameter(intent, "<this>");
        Intrinsics.checkNotNullParameter(key, "key");
        if (Build.VERSION.SDK_INT >= 33) {
            Intrinsics.reifiedOperationMarker(4, "T");
            parcelableArrayListExtra = intent.getParcelableArrayListExtra(key, Parcelable.class);
            return parcelableArrayListExtra;
        }
        return intent.getParcelableArrayListExtra(key);
    }
}
