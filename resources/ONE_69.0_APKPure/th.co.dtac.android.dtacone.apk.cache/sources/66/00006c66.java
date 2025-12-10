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
    public final Parcelable f34527a;
    public static final AbsSavedState EMPTY_STATE = new C4234a();
    public static final Parcelable.Creator<AbsSavedState> CREATOR = new C4235b();

    /* renamed from: androidx.customview.view.AbsSavedState$a */
    /* loaded from: classes2.dex */
    public class C4234a extends AbsSavedState {
        public C4234a() {
            super((C4234a) null);
        }
    }

    /* renamed from: androidx.customview.view.AbsSavedState$b */
    /* loaded from: classes2.dex */
    public class C4235b implements Parcelable.ClassLoaderCreator {
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

    public /* synthetic */ AbsSavedState(C4234a c4234a) {
        this();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Nullable
    public final Parcelable getSuperState() {
        return this.f34527a;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f34527a, i);
    }

    public AbsSavedState() {
        this.f34527a = null;
    }

    public AbsSavedState(@NonNull Parcelable parcelable) {
        if (parcelable != null) {
            this.f34527a = parcelable == EMPTY_STATE ? null : parcelable;
            return;
        }
        throw new IllegalArgumentException("superState must not be null");
    }

    public AbsSavedState(@NonNull Parcel parcel) {
        this(parcel, null);
    }

    public AbsSavedState(@NonNull Parcel parcel, @Nullable ClassLoader classLoader) {
        Parcelable readParcelable = parcel.readParcelable(classLoader);
        this.f34527a = readParcelable == null ? EMPTY_STATE : readParcelable;
    }
}