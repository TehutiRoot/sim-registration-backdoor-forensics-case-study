package co.omise.android.extensions;

import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import ch.qos.logback.core.joran.action.Action;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(m28851d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u001a.\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\n\b\u0000\u0010\u0002\u0018\u0001*\u00020\u0003*\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0080\b¢\u0006\u0002\u0010\u0007\u001a*\u0010\b\u001a\u0004\u0018\u0001H\u0002\"\n\b\u0000\u0010\u0002\u0018\u0001*\u00020\u0003*\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0080\b¢\u0006\u0002\u0010\t¨\u0006\n"}, m28850d2 = {"getParcelableArrayCompat", "", "T", "Landroid/os/Parcelable;", "Landroid/os/Bundle;", Action.KEY_ATTRIBUTE, "", "(Landroid/os/Bundle;Ljava/lang/String;)[Landroid/os/Parcelable;", "getParcelableCompat", "(Landroid/os/Bundle;Ljava/lang/String;)Landroid/os/Parcelable;", "sdk_productionRelease"}, m28849k = 2, m28848mv = {1, 7, 1}, m28846xi = 48)
/* loaded from: classes.dex */
public final class BundleExtensionsKt {
    public static final /* synthetic */ <T extends Parcelable> T[] getParcelableArrayCompat(Bundle bundle, String str) {
        Parcelable[] parcelableArr;
        Object[] parcelableArray;
        Parcelable[] parcelableArr2;
        Intrinsics.checkNotNullParameter(bundle, "<this>");
        if (Build.VERSION.SDK_INT >= 33) {
            Intrinsics.reifiedOperationMarker(4, "T");
            parcelableArray = bundle.getParcelableArray(str, Parcelable.class);
            Parcelable[] parcelableArr3 = (Parcelable[]) parcelableArray;
            if (parcelableArr3 != null) {
                ArrayList arrayList = new ArrayList();
                for (Parcelable parcelable : parcelableArr3) {
                    if (parcelable != null) {
                        arrayList.add(parcelable);
                    }
                }
                Intrinsics.reifiedOperationMarker(0, "T?");
                Object[] array = arrayList.toArray(new Object[0]);
                Intrinsics.checkNotNull(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
                Parcelable[] parcelableArr4 = (Parcelable[]) array;
                if (parcelableArr4 != null) {
                    parcelableArr2 = parcelableArr4;
                    return (T[]) parcelableArr2;
                }
            }
            Intrinsics.reifiedOperationMarker(0, "T?");
            parcelableArr2 = (Parcelable[]) new Object[0];
            return (T[]) parcelableArr2;
        }
        Parcelable[] parcelableArray2 = bundle.getParcelableArray(str);
        if (parcelableArray2 != null) {
            ArrayList arrayList2 = new ArrayList();
            for (Parcelable parcelable2 : parcelableArray2) {
                Intrinsics.reifiedOperationMarker(2, "T");
                if (parcelable2 != null) {
                    arrayList2.add(parcelable2);
                }
            }
            Intrinsics.reifiedOperationMarker(0, "T?");
            Object[] array2 = arrayList2.toArray(new Object[0]);
            Intrinsics.checkNotNull(array2, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
            Parcelable[] parcelableArr5 = (Parcelable[]) array2;
            if (parcelableArr5 != null) {
                parcelableArr = parcelableArr5;
                return (T[]) parcelableArr;
            }
        }
        Intrinsics.reifiedOperationMarker(0, "T?");
        parcelableArr = (Parcelable[]) new Object[0];
        return (T[]) parcelableArr;
    }

    public static final /* synthetic */ <T extends Parcelable> T getParcelableCompat(Bundle bundle, String str) {
        Object parcelable;
        Intrinsics.checkNotNullParameter(bundle, "<this>");
        if (Build.VERSION.SDK_INT >= 33) {
            Intrinsics.reifiedOperationMarker(4, "T");
            parcelable = bundle.getParcelable(str, Parcelable.class);
            return (T) parcelable;
        }
        T t = (T) bundle.getParcelable(str);
        Intrinsics.reifiedOperationMarker(2, "T");
        return t;
    }
}
