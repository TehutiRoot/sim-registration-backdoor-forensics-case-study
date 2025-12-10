package co.omise.android.models;

import android.os.Parcel;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.android.parcel.Parceler;
import org.jetbrains.annotations.NotNull;

@Metadata(m29143d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u001c\u0010\u0007\u001a\u00020\b*\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\nH\u0016¨\u0006\u000b"}, m29142d2 = {"Lco/omise/android/models/SourceTypeParceler;", "Lkotlinx/android/parcel/Parceler;", "Lco/omise/android/models/SourceType;", "()V", "create", "parcel", "Landroid/os/Parcel;", "write", "", "flags", "", "sdk_productionRelease"}, m29141k = 1, m29140mv = {1, 7, 1}, m29138xi = 48)
/* loaded from: classes3.dex */
public final class SourceTypeParceler implements Parceler<SourceType> {
    @NotNull
    public static final SourceTypeParceler INSTANCE = new SourceTypeParceler();

    private SourceTypeParceler() {
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlinx.android.parcel.Parceler
    @NotNull
    public SourceType[] newArray(int i) {
        return (SourceType[]) Parceler.DefaultImpls.newArray(this, i);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlinx.android.parcel.Parceler
    @NotNull
    public SourceType create(@NotNull Parcel parcel) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        return SourceType.Companion.creator(parcel.readString());
    }

    @Override // kotlinx.android.parcel.Parceler
    public void write(@NotNull SourceType sourceType, @NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(sourceType, "<this>");
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        parcel.writeString(sourceType.getName());
    }
}