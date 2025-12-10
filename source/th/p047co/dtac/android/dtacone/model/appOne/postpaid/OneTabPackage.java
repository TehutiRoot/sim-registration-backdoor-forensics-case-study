package th.p047co.dtac.android.dtacone.model.appOne.postpaid;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(m28851d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0017\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u001d\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0002\u0010\nJ\b\u0010\u000f\u001a\u00020\u0010H\u0016J\u0018\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u0010H\u0016R\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0016"}, m28850d2 = {"Lth/co/dtac/android/dtacone/model/appOne/postpaid/OneTabPackage;", "Landroid/os/Parcelable;", "source", "Landroid/os/Parcel;", "(Landroid/os/Parcel;)V", "tabName", "", "groups", "", "", "(Ljava/lang/String;Ljava/util/List;)V", "getGroups", "()Ljava/util/List;", "getTabName", "()Ljava/lang/String;", "describeContents", "", "writeToParcel", "", "dest", "flags", "Companion", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
@SourceDebugExtension({"SMAP\nOneTabPackage.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OneTabPackage.kt\nth/co/dtac/android/dtacone/model/appOne/postpaid/OneTabPackage\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,25:1\n1#2:26\n*E\n"})
/* renamed from: th.co.dtac.android.dtacone.model.appOne.postpaid.OneTabPackage */
/* loaded from: classes8.dex */
public class OneTabPackage implements Parcelable {
    @NotNull
    private final List<Object> groups;
    @Nullable
    private final String tabName;
    @NotNull
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    @JvmField
    @NotNull
    public static final Parcelable.Creator<OneTabPackage> CREATOR = new Parcelable.Creator<OneTabPackage>() { // from class: th.co.dtac.android.dtacone.model.appOne.postpaid.OneTabPackage$Companion$CREATOR$1
        @Override // android.os.Parcelable.Creator
        @NotNull
        public OneTabPackage createFromParcel(@NotNull Parcel source) {
            Intrinsics.checkNotNullParameter(source, "source");
            return new OneTabPackage(source);
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        public OneTabPackage[] newArray(int i) {
            return new OneTabPackage[i];
        }
    };

    @Metadata(m28851d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0016\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0006"}, m28850d2 = {"Lth/co/dtac/android/dtacone/model/appOne/postpaid/OneTabPackage$Companion;", "", "()V", "CREATOR", "Landroid/os/Parcelable$Creator;", "Lth/co/dtac/android/dtacone/model/appOne/postpaid/OneTabPackage;", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.model.appOne.postpaid.OneTabPackage$Companion */
    /* loaded from: classes8.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public OneTabPackage(@Nullable String str, @NotNull List<? extends Object> groups) {
        Intrinsics.checkNotNullParameter(groups, "groups");
        this.tabName = str;
        this.groups = groups;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @NotNull
    public final List<Object> getGroups() {
        return this.groups;
    }

    @Nullable
    public final String getTabName() {
        return this.tabName;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.tabName);
        dest.writeList(this.groups);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public OneTabPackage(@org.jetbrains.annotations.NotNull android.os.Parcel r4) {
        /*
            r3 = this;
            java.lang.String r0 = "source"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            java.lang.String r0 = r4.readString()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.lang.Class<java.lang.Object> r2 = java.lang.Object.class
            java.lang.ClassLoader r2 = r2.getClassLoader()
            r4.readList(r1, r2)
            kotlin.Unit r4 = kotlin.Unit.INSTANCE
            r3.<init>(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: th.p047co.dtac.android.dtacone.model.appOne.postpaid.OneTabPackage.<init>(android.os.Parcel):void");
    }
}
