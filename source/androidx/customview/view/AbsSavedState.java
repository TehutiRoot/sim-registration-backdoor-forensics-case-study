package androidx.customview.view;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes2.dex */
public abstract class AbsSavedState implements Parcelable {

    /* renamed from: a */
    public final Parcelable f34439a;
    public static final AbsSavedState EMPTY_STATE = new C4252a();
    public static final Parcelable.Creator<AbsSavedState> CREATOR = new C4253b();

    /* renamed from: androidx.customview.view.AbsSavedState$a */
    /* loaded from: classes2.dex */
    public class C4252a extends AbsSavedState {
        public C4252a() {
            super((C4252a) null);
        }
    }

    /* renamed from: androidx.customview.view.AbsSavedState$b */
    /* loaded from: classes2.dex */
    public class C4253b implements Parcelable.ClassLoaderCreator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public AbsSavedState createFromParcel(Parcel parcel) {
            return createFromParcel(parcel, null);
        }

        @Override // android.os.Parcelable.ClassLoaderCreator
        /* renamed from: b */
        public AbsSavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
            if (parcel.readParcelable(classLoader) == null) {
                return AbsSavedState.EMPTY_STATE;
            }
            throw new IllegalStateException("superState must be null");
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: c */
        public AbsSavedState[] newArray(int i) {
            return new AbsSavedState[i];
        }
    }

    public /* synthetic */ AbsSavedState(C4252a c4252a) {
        this();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Nullable
    public final Parcelable getSuperState() {
        return this.f34439a;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f34439a, i);
    }

    public AbsSavedState() {
        this.f34439a = null;
    }

    public AbsSavedState(@NonNull Parcelable parcelable) {
        if (parcelable != null) {
            this.f34439a = parcelable == EMPTY_STATE ? null : parcelable;
            return;
        }
        throw new IllegalArgumentException("superState must not be null");
    }

    public AbsSavedState(@NonNull Parcel parcel) {
        this(parcel, null);
    }

    public AbsSavedState(@NonNull Parcel parcel, @Nullable ClassLoader classLoader) {
        Parcelable readParcelable = parcel.readParcelable(classLoader);
        this.f34439a = readParcelable == null ? EMPTY_STATE : readParcelable;
    }
}
