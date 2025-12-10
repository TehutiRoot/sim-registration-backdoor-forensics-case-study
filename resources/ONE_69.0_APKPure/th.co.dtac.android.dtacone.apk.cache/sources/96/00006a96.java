package androidx.core.p005os;

import android.os.Parcel;
import android.os.Parcelable;

@Deprecated
/* renamed from: androidx.core.os.ParcelableCompat */
/* loaded from: classes2.dex */
public final class ParcelableCompat {

    /* renamed from: androidx.core.os.ParcelableCompat$a */
    /* loaded from: classes2.dex */
    public static class C4029a implements Parcelable.ClassLoaderCreator {

        /* renamed from: a */
        public final ParcelableCompatCreatorCallbacks f34044a;

        public C4029a(ParcelableCompatCreatorCallbacks parcelableCompatCreatorCallbacks) {
            this.f34044a = parcelableCompatCreatorCallbacks;
        }

        @Override // android.os.Parcelable.Creator
        public Object createFromParcel(Parcel parcel) {
            return this.f34044a.createFromParcel(parcel, null);
        }

        @Override // android.os.Parcelable.Creator
        public Object[] newArray(int i) {
            return this.f34044a.newArray(i);
        }

        @Override // android.os.Parcelable.ClassLoaderCreator
        public Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
            return this.f34044a.createFromParcel(parcel, classLoader);
        }
    }

    @Deprecated
    public static <T> Parcelable.Creator<T> newCreator(ParcelableCompatCreatorCallbacks<T> parcelableCompatCreatorCallbacks) {
        return new C4029a(parcelableCompatCreatorCallbacks);
    }
}