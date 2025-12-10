package th.p047co.dtac.android.dtacone.util.validation;

import android.os.Parcel;
import androidx.exifinterface.media.ExifInterface;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@Metadata(m29143d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010%\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a6\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\u00020\u00042\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0001¨\u0006\u0006"}, m29142d2 = {"readMap", "", "K", ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "Landroid/os/Parcel;", "map", "app_prodRelease"}, m29141k = 2, m29140mv = {1, 8, 0}, m29138xi = 48)
@SourceDebugExtension({"SMAP\nParcelableMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ParcelableMap.kt\nth/co/dtac/android/dtacone/util/validation/ParcelableMapKt\n+ 2 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,42:1\n215#2,2:43\n*S KotlinDebug\n*F\n+ 1 ParcelableMap.kt\nth/co/dtac/android/dtacone/util/validation/ParcelableMapKt\n*L\n36#1:43,2\n*E\n"})
/* renamed from: th.co.dtac.android.dtacone.util.validation.ParcelableMapKt */
/* loaded from: classes8.dex */
public final class ParcelableMapKt {
    @NotNull
    public static final <K, V> Map<K, V> readMap(@NotNull Parcel parcel, @NotNull Map<K, V> map) {
        Intrinsics.checkNotNullParameter(parcel, "<this>");
        Intrinsics.checkNotNullParameter(map, "map");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        parcel.readMap(linkedHashMap, map.getClass().getClassLoader());
        for (Map.Entry<K, V> entry : linkedHashMap.entrySet()) {
            map.put(entry.getKey(), entry.getValue());
        }
        return map;
    }
}